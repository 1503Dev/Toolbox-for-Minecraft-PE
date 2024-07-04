package org.fmod;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.nio.ByteBuffer;

public class MediaCodec implements InvocationHandler {
    private long mCodecPtr = 0;
    private long mLength = 0;
    private int mSampleRate = 0;
    private int mChannelCount = 0;
    private boolean mInputFinished = false;
    private boolean mOutputFinished = false;
    private android.media.MediaCodec mDecoder = null;
    private Object mDataSourceProxy = null;
    private MediaExtractor mExtractor = null;
    private ByteBuffer[] mInputBuffers = null;
    private ByteBuffer[] mOutputBuffers = null;
    private int mCurrentOutputBufferIndex = -1;

    private long convertTimeToOffset(long j) {
        return ((j * this.mSampleRate) + 999999) / 1000000;
    }

    public static native int fmodGetSize(long j);

    public static native int fmodReadAt(long j, long j2, byte[] bArr, int i);

    public void close() {
        Log.i("FMod/MediaCodec", "close");
        android.media.MediaCodec mediaCodec = this.mDecoder;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.mDecoder.release();
            this.mDecoder = null;
        }
        MediaExtractor mediaExtractor = this.mExtractor;
        if (mediaExtractor != null) {
            mediaExtractor.release();
            this.mExtractor = null;
        }
    }

    public int getChannelCount() {
        return this.mChannelCount;
    }

    public long getLength() {
        return this.mLength;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public boolean init(long j) {
        Log.i("FMod/MediaCodec", "init");
        this.mCodecPtr = j;
        this.mExtractor = new MediaExtractor();
        try {
            Class<?> cls = Class.forName("android.media.DataSource");
            Method method = Class.forName("android.media.MediaExtractor").getMethod("setDataSource", cls);
            Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this);
            this.mDataSourceProxy = newProxyInstance;
            method.invoke(this.mExtractor, newProxyInstance);
        } catch (Throwable th) {
            Log.w("FMod/MediaCodec", "Failed to set MediaExtractor's DataSource");
            th.printStackTrace();
        }
        int trackCount = this.mExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = this.mExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            Log.d("FMod/MediaCodec", "Track " + i + "/" + trackCount + ": mime=" + string);
            if (string.equals("audio/mp4a-latm")) {
                try {
                    this.mDecoder = android.media.MediaCodec.createDecoderByType(string);
                    this.mExtractor.selectTrack(i);
                    this.mDecoder.configure(trackFormat, (Surface) null, (MediaCrypto) null, 0);
                    this.mDecoder.start();
                    this.mInputBuffers = this.mDecoder.getInputBuffers();
                    this.mOutputBuffers = this.mDecoder.getOutputBuffers();
                    int integer = trackFormat.containsKey("encoder-delay") ? trackFormat.getInteger("encoder-delay") : 0;
                    int integer2 = trackFormat.containsKey("encoder-padding") ? trackFormat.getInteger("encoder-padding") : 0;
                    long j2 = trackFormat.getLong("durationUs");
                    this.mChannelCount = trackFormat.getInteger("channel-count");
                    this.mSampleRate = trackFormat.getInteger("sample-rate");
                    this.mLength = (convertTimeToOffset(j2) - integer) - integer2;
                    return true;
                } catch (IOException e) {
                    Log.e("FMod/MediaCodec", "Failed to create decoder");
                    e.printStackTrace();
                    return false;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        int fmodGetSize;
        if (method.getName().equals("readAt")) {
            fmodGetSize = fmodReadAt(this.mCodecPtr, ((Long) objArr[0]).longValue(), (byte[]) objArr[1], ((Integer) objArr[2]).intValue());
        } else if (method.getName().equals("getSize")) {
            fmodGetSize = fmodGetSize(this.mCodecPtr);
        } else if (method.getName().equals("close")) {
            return null;
        } else {
            StringBuilder b = e5.b("Unknown invoke method: ");
            b.append(method.getName());
            Log.w("FMod/MediaCodec", b.toString());
            return null;
        }
        return Integer.valueOf(fmodGetSize);
    }

    public int read(byte[] bArr, int i) {
        String str;
        int dequeueInputBuffer;
        Log.i("FMod/MediaCodec", "read");
        int i2 = (this.mInputFinished && this.mOutputFinished && this.mCurrentOutputBufferIndex != -1) ? -1 : 0;
        while (!this.mInputFinished && (dequeueInputBuffer = this.mDecoder.dequeueInputBuffer(0L)) != -1) {
            int readSampleData = this.mExtractor.readSampleData(this.mInputBuffers[dequeueInputBuffer], 0);
            android.media.MediaCodec mediaCodec = this.mDecoder;
            if (readSampleData >= 0) {
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, this.mExtractor.getSampleTime(), 0);
                this.mExtractor.advance();
            } else {
                mediaCodec.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 0);
                this.mInputFinished = true;
            }
        }
        if (!this.mOutputFinished && this.mCurrentOutputBufferIndex == -1) {
            MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
            int dequeueOutputBuffer = this.mDecoder.dequeueOutputBuffer(bufferInfo, 10000L);
            if (dequeueOutputBuffer >= 0) {
                this.mCurrentOutputBufferIndex = dequeueOutputBuffer;
                this.mOutputBuffers[dequeueOutputBuffer].limit(bufferInfo.size);
                this.mOutputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
            } else if (dequeueOutputBuffer == -3) {
                this.mOutputBuffers = this.mDecoder.getOutputBuffers();
            } else {
                if (dequeueOutputBuffer == -2) {
                    str = "dequeueOutputBuffer: Output format changed";
                } else if (dequeueOutputBuffer == -1) {
                    str = "dequeueOutputBuffer: Try again later";
                } else {
                    str = "dequeueOutputBuffer: " + dequeueOutputBuffer;
                }
                Log.d("FMod/MediaCodec", str);
            }
            if ((bufferInfo.flags & 4) != 0) {
                this.mOutputFinished = true;
            }
        }
        int i3 = this.mCurrentOutputBufferIndex;
        if (i3 != -1) {
            ByteBuffer byteBuffer = this.mOutputBuffers[i3];
            i2 = Math.min(byteBuffer.remaining(), i);
            byteBuffer.get(bArr, 0, i2);
            if (!byteBuffer.hasRemaining()) {
                byteBuffer.clear();
                this.mDecoder.releaseOutputBuffer(this.mCurrentOutputBufferIndex, false);
                this.mCurrentOutputBufferIndex = -1;
            }
        }
        return i2;
    }

    public void seek(int i) {
        Log.i("FMod/MediaCodec", "seek");
        int i2 = this.mCurrentOutputBufferIndex;
        if (i2 != -1) {
            this.mOutputBuffers[i2].clear();
            this.mCurrentOutputBufferIndex = -1;
        }
        this.mInputFinished = false;
        this.mOutputFinished = false;
        long j = i;
        this.mExtractor.seekTo((1000000 * j) / this.mSampleRate, 0);
        long convertTimeToOffset = convertTimeToOffset(this.mExtractor.getSampleTime());
        int i3 = (int) ((j - convertTimeToOffset) * this.mChannelCount * 2);
        if (i3 >= 0) {
            byte[] bArr = new byte[2048];
            while (i3 > 0) {
                i3 -= read(bArr, Math.min(2048, i3));
            }
            return;
        }
        Log.w("FMod/MediaCodec", "Position after seek to " + i + ": " + convertTimeToOffset);
    }
}