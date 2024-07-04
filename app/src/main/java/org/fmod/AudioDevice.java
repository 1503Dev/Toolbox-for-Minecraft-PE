package org.fmod;

import android.media.AudioTrack;
import android.util.Log;

public class AudioDevice {
    private AudioTrack mTrack = null;

    public void close() {
        Log.i("FMod/AudioDevice", "close");
        try {
            this.mTrack.stop();
            this.mTrack.release();
            this.mTrack = null;
        } catch (Throwable th) {
            Log.e("FMod/AudioDevice", "Failed to close device");
            th.printStackTrace();
        }
    }

    public int fetchChannelConfigFromCount(int i) {
        if (i != 1) {
            if (i != 2) {
                return i != 6 ? 0 : 252;
            }
            return 3;
        }
        return 2;
    }

    public boolean init(int i, int i2, int i3, int i4) {
        Log.i("FMod/AudioDevice", "init");
        int fetchChannelConfigFromCount = fetchChannelConfigFromCount(i);
        int minBufferSize = AudioTrack.getMinBufferSize(i2, fetchChannelConfigFromCount, 2);
        if (minBufferSize < 0) {
            Log.w("FMod/AudioDevice", "Cannot get min buffer size");
        }
        int i5 = i3 * i4 * i * 2;
        int i6 = minBufferSize > i5 ? minBufferSize : i5;
        Log.d("FMod/AudioDevice", "Buffer size: " + i6);
        try {
            AudioTrack audioTrack = new AudioTrack(3, i2, fetchChannelConfigFromCount, 2, i6, 1);
            this.mTrack = audioTrack;
            try {
                audioTrack.play();
                return true;
            } catch (IllegalStateException e) {
                Log.e("FMod/AudioDevice", "Failed to play track");
                e.printStackTrace();
                close();
                return false;
            }
        } catch (IllegalArgumentException e2) {
            Log.e("FMod/AudioDevice", "Failed to create AudioTrack");
            e2.printStackTrace();
            return false;
        }
    }

    public void write(byte[] bArr, int i) {
        this.mTrack.write(bArr, 0, i);
    }
}