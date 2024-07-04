package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: qx2  reason: default package */
public final class qx2 extends sx2 implements TextureView.SurfaceTextureListener, MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener {
    public static final HashMap k0;
    public final gy2 R;
    public final hy2 S;
    public final boolean T;
    public int U;
    public int V;
    public MediaPlayer W;
    public Uri a0;
    public int b0;
    public int c0;
    public int d0;
    public ey2 e0;
    public final boolean f0;
    public int g0;
    public rx2 h0;
    public boolean i0;
    public Integer j0;

    static {
        HashMap hashMap = new HashMap();
        k0 = hashMap;
        hashMap.put(-1004, "MEDIA_ERROR_IO");
        hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
        hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
        hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
        hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
        hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
    }

    public qx2(Context context, y03 y03Var, hy2 hy2Var, boolean z, boolean z2) {
        super(context);
        this.U = 0;
        this.V = 0;
        this.i0 = false;
        this.j0 = null;
        setSurfaceTextureListener(this);
        this.R = y03Var;
        this.S = hy2Var;
        this.f0 = z;
        this.T = z2;
        hy2Var.a(this);
    }

    public final void E() {
        SurfaceTexture surfaceTexture;
        vz3.k("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture2 = getSurfaceTexture();
        if (this.a0 != null && surfaceTexture2 != null) {
            F(false);
            try {
                p5 p5Var = jv5.A.s;
                MediaPlayer mediaPlayer = new MediaPlayer();
                this.W = mediaPlayer;
                mediaPlayer.setOnBufferingUpdateListener(this);
                this.W.setOnCompletionListener(this);
                this.W.setOnErrorListener(this);
                this.W.setOnInfoListener(this);
                this.W.setOnPreparedListener(this);
                this.W.setOnVideoSizeChangedListener(this);
                this.d0 = 0;
                if (this.f0) {
                    ey2 ey2Var = new ey2(getContext());
                    this.e0 = ey2Var;
                    int width = getWidth();
                    int height = getHeight();
                    ey2Var.b0 = width;
                    ey2Var.a0 = height;
                    ey2Var.d0 = surfaceTexture2;
                    this.e0.start();
                    ey2 ey2Var2 = this.e0;
                    if (ey2Var2.d0 == null) {
                        surfaceTexture = null;
                    } else {
                        try {
                            ey2Var2.i0.await();
                        } catch (InterruptedException unused) {
                        }
                        surfaceTexture = ey2Var2.c0;
                    }
                    if (surfaceTexture != null) {
                        surfaceTexture2 = surfaceTexture;
                    } else {
                        this.e0.c();
                        this.e0 = null;
                    }
                }
                this.W.setDataSource(getContext(), this.a0);
                this.W.setSurface(new Surface(surfaceTexture2));
                this.W.setAudioStreamType(3);
                this.W.setScreenOnWhilePlaying(true);
                this.W.prepareAsync();
                G(1);
            } catch (IOException e) {
                e = e;
                sv2.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.a0)), e);
                onError(this.W, 1, 0);
            } catch (IllegalArgumentException e2) {
                e = e2;
                sv2.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.a0)), e);
                onError(this.W, 1, 0);
            } catch (IllegalStateException e3) {
                e = e3;
                sv2.h("Failed to initialize MediaPlayer at ".concat(String.valueOf(this.a0)), e);
                onError(this.W, 1, 0);
            }
        }
    }

    public final void F(boolean z) {
        vz3.k("AdMediaPlayerView release");
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.c();
            this.e0 = null;
        }
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.W.release();
            this.W = null;
            G(0);
            if (z) {
                this.V = 0;
            }
        }
    }

    public final void G(int i) {
        if (i == 3) {
            hy2 hy2Var = this.S;
            hy2Var.m = true;
            if (hy2Var.j && !hy2Var.k) {
                ea2.B(hy2Var.e, hy2Var.d, "vfp2");
                hy2Var.k = true;
            }
            oy2 oy2Var = this.Q;
            oy2Var.d = true;
            oy2Var.a();
        } else if (this.U == 3) {
            this.S.m = false;
            oy2 oy2Var2 = this.Q;
            oy2Var2.d = false;
            oy2Var2.a();
        }
        this.U = i;
    }

    public final boolean H() {
        int i;
        return (this.W == null || (i = this.U) == -1 || i == 0 || i == 1) ? false : true;
    }

    @Override // defpackage.sx2
    public final int h() {
        if (H()) {
            return this.W.getCurrentPosition();
        }
        return 0;
    }

    @Override // defpackage.sx2
    public final int i() {
        if (Build.VERSION.SDK_INT < 26 || !H()) {
            return -1;
        }
        return f6.a(this.W).getInt("android.media.mediaplayer.dropped");
    }

    @Override // defpackage.sx2, defpackage.ny2
    public final void k() {
        float f;
        oy2 oy2Var = this.Q;
        float f2 = 0.0f;
        if (oy2Var.e) {
            f = 0.0f;
        } else {
            f = oy2Var.f;
        }
        if (oy2Var.c) {
            f2 = f;
        }
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
                return;
            } catch (IllegalStateException unused) {
                return;
            }
        }
        sv2.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
    }

    @Override // defpackage.sx2
    public final int l() {
        if (H()) {
            return this.W.getDuration();
        }
        return -1;
    }

    @Override // defpackage.sx2
    public final int m() {
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // defpackage.sx2
    public final int n() {
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // defpackage.sx2
    public final long o() {
        return 0L;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        this.d0 = i;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        vz3.k("AdMediaPlayerView completion");
        G(5);
        this.V = 5;
        cu5.i.post(new qz3(1, this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        HashMap hashMap = k0;
        String str = (String) hashMap.get(Integer.valueOf(i));
        String str2 = (String) hashMap.get(Integer.valueOf(i2));
        sv2.g("AdMediaPlayerView MediaPlayer error: " + str + ":" + str2);
        G(-1);
        this.V = -1;
        cu5.i.post(new bw5(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        HashMap hashMap = k0;
        vz3.k("AdMediaPlayerView MediaPlayer info: " + ((String) hashMap.get(Integer.valueOf(i))) + ":" + ((String) hashMap.get(Integer.valueOf(i2))));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r1 > r6) goto L17;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int defaultSize = View.getDefaultSize(this.b0, i);
        int defaultSize2 = View.getDefaultSize(this.c0, i2);
        if (this.b0 > 0 && this.c0 > 0 && this.e0 == null) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode == 1073741824) {
                if (mode2 == 1073741824) {
                    int i4 = this.b0;
                    int i5 = i4 * size2;
                    int i6 = this.c0;
                    int i7 = size * i6;
                    if (i5 < i7) {
                        defaultSize = i5 / i6;
                        defaultSize2 = size2;
                    } else {
                        if (i5 > i7) {
                            defaultSize2 = i7 / i4;
                            defaultSize = size;
                        }
                        defaultSize = size;
                        defaultSize2 = size2;
                    }
                } else {
                    mode = 1073741824;
                }
            }
            if (mode == 1073741824) {
                int i8 = (this.c0 * size) / this.b0;
                if (mode2 != Integer.MIN_VALUE || i8 <= size2) {
                    defaultSize2 = i8;
                    defaultSize = size;
                }
                defaultSize = size;
                defaultSize2 = size2;
            } else {
                if (mode2 == 1073741824) {
                    i3 = (this.b0 * size2) / this.c0;
                    if (mode == Integer.MIN_VALUE) {
                    }
                } else {
                    int i9 = this.b0;
                    int i10 = this.c0;
                    if (mode2 != Integer.MIN_VALUE || i10 <= size2) {
                        i3 = i9;
                        size2 = i10;
                    } else {
                        i3 = (size2 * i9) / i10;
                    }
                    if (mode == Integer.MIN_VALUE && i3 > size) {
                        defaultSize2 = (i10 * size) / i9;
                        defaultSize = size;
                    }
                }
                defaultSize = i3;
                defaultSize2 = size2;
            }
        }
        setMeasuredDimension(defaultSize, defaultSize2);
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.b(defaultSize, defaultSize2);
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        vz3.k("AdMediaPlayerView prepared");
        G(2);
        hy2 hy2Var = this.S;
        if (hy2Var.i && !hy2Var.j) {
            ea2.B(hy2Var.e, hy2Var.d, "vfr2");
            hy2Var.j = true;
        }
        cu5.i.post(new t14(this, mediaPlayer));
        this.b0 = mediaPlayer.getVideoWidth();
        this.c0 = mediaPlayer.getVideoHeight();
        int i = this.g0;
        if (i != 0) {
            v(i);
        }
        if (this.T && H() && this.W.getCurrentPosition() > 0 && this.V != 3) {
            vz3.k("AdMediaPlayerView nudging MediaPlayer");
            MediaPlayer mediaPlayer2 = this.W;
            if (mediaPlayer2 != null) {
                try {
                    mediaPlayer2.setVolume(0.0f, 0.0f);
                } catch (IllegalStateException unused) {
                }
            } else {
                sv2.g("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
            }
            this.W.start();
            int currentPosition = this.W.getCurrentPosition();
            jv5.A.j.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            while (H() && this.W.getCurrentPosition() == currentPosition) {
                jv5.A.j.getClass();
                if (System.currentTimeMillis() - currentTimeMillis > 250) {
                    break;
                }
            }
            this.W.pause();
            k();
        }
        int i2 = this.b0;
        int i3 = this.c0;
        sv2.f("AdMediaPlayerView stream dimensions: " + i2 + " x " + i3);
        if (this.V == 3) {
            u();
        }
        k();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        vz3.k("AdMediaPlayerView surface created");
        E();
        cu5.i.post(new c32(1, this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        vz3.k("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null && this.g0 == 0) {
            this.g0 = mediaPlayer.getCurrentPosition();
        }
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.c();
        }
        cu5.i.post(new xj1(2, this));
        F(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        vz3.k("AdMediaPlayerView surface changed");
        int i3 = this.V;
        boolean z = this.b0 == i && this.c0 == i2;
        if (this.W != null && i3 == 3 && z) {
            int i4 = this.g0;
            if (i4 != 0) {
                v(i4);
            }
            u();
        }
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.b(i, i2);
        }
        cu5.i.post(new kx2(this, i, i2));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.S.c(this);
        this.P.a(surfaceTexture, this.h0);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        vz3.k("AdMediaPlayerView size changed: " + i + " x " + i2);
        this.b0 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.c0 = videoHeight;
        if (this.b0 == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        vz3.k("AdMediaPlayerView window visibility changed to " + i);
        cu5.i.post(new Runnable() { // from class: jx2
            @Override // java.lang.Runnable
            public final void run() {
                qx2 qx2Var = qx2.this;
                int i2 = i;
                rx2 rx2Var = qx2Var.h0;
                if (rx2Var != null) {
                    ((vx2) rx2Var).onWindowVisibilityChanged(i2);
                }
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // defpackage.sx2
    public final long p() {
        if (this.j0 != null) {
            return (q() * this.d0) / 100;
        }
        return -1L;
    }

    @Override // defpackage.sx2
    public final long q() {
        if (this.j0 != null) {
            return l() * this.j0.intValue();
        }
        return -1L;
    }

    @Override // defpackage.sx2
    public final String s() {
        return "MediaPlayer".concat(true != this.f0 ? "" : " spherical");
    }

    @Override // defpackage.sx2
    public final void t() {
        vz3.k("AdMediaPlayerView pause");
        if (H() && this.W.isPlaying()) {
            this.W.pause();
            G(4);
            cu5.i.post(new am1(1, this));
        }
        this.V = 4;
    }

    @Override // android.view.View
    public final String toString() {
        return ij.c(qx2.class.getName(), "@", Integer.toHexString(hashCode()));
    }

    @Override // defpackage.sx2
    public final void u() {
        vz3.k("AdMediaPlayerView play");
        if (H()) {
            this.W.start();
            G(3);
            this.P.c = true;
            cu5.i.post(new dd4(2, this));
        }
        this.V = 3;
    }

    @Override // defpackage.sx2
    public final void v(int i) {
        vz3.k("AdMediaPlayerView seek " + i);
        if (!H()) {
            this.g0 = i;
            return;
        }
        this.W.seekTo(i);
        this.g0 = 0;
    }

    @Override // defpackage.sx2
    public final void w(rx2 rx2Var) {
        this.h0 = rx2Var;
    }

    @Override // defpackage.sx2
    public final void x(String str) {
        Uri parse = Uri.parse(str);
        y42 c = y42.c(parse);
        if (c == null || c.P != null) {
            if (c != null) {
                parse = Uri.parse(c.P);
            }
            this.a0 = parse;
            this.g0 = 0;
            E();
            requestLayout();
            invalidate();
        }
    }

    @Override // defpackage.sx2
    public final void y() {
        vz3.k("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.W;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.W.release();
            this.W = null;
            G(0);
            this.V = 0;
        }
        this.S.b();
    }

    @Override // defpackage.sx2
    public final void z(float f, float f2) {
        ey2 ey2Var = this.e0;
        if (ey2Var != null) {
            ey2Var.d(f, f2);
        }
    }
}