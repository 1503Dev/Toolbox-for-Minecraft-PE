package defpackage;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

@TargetApi(14)
/* renamed from: v91  reason: default package */
public final class v91 extends TextureView implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener {
    public b A0;
    public ProgressBar B0;
    public MediaPlayer C0;
    public ic1 D0;
    public ExecutorService E0;
    public rc1 F0;
    public float P;
    public float Q;
    public float R;
    public float S;
    public int T;
    public boolean U;
    public Paint V;
    public Paint W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public double h0;
    public double i0;
    public long j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public boolean q0;
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public String u0;
    public String v0;
    public rc1 w0;
    public ob1 x0;
    public SurfaceTexture y0;
    public RectF z0;

    /* renamed from: v91$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                Thread.sleep(150L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (v91.this.F0 != null) {
                ic1 ic1Var = new ic1();
                eb1.l(v91.this.e0, ic1Var, "id");
                eb1.j(ic1Var, "ad_session_id", v91.this.v0);
                eb1.m(ic1Var, "success", true);
                v91.this.F0.a(ic1Var).b();
                v91.this.F0 = null;
            }
        }
    }

    /* renamed from: v91$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends View {
        public b(Context context) {
            super(context);
            setWillNotDraw(false);
            try {
                b.class.getMethod("setLayerType", Integer.TYPE, Paint.class).invoke(this, 1, null);
            } catch (Exception unused) {
            }
        }

        @Override // android.view.View
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            v91 v91Var = v91.this;
            canvas.drawArc(v91Var.z0, 270.0f, v91Var.Q, false, v91Var.V);
            StringBuilder b = e5.b("");
            b.append(v91.this.T);
            String sb = b.toString();
            float centerX = v91.this.z0.centerX();
            double centerY = v91.this.z0.centerY();
            double d = v91.this.W.getFontMetrics().bottom;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(centerY);
            Double.isNaN(centerY);
            canvas.drawText(sb, centerX, (float) ((d * 1.35d) + centerY), v91.this.W);
            invalidate();
        }
    }

    public v91(Context context, rc1 rc1Var, int i, ob1 ob1Var) {
        super(context);
        this.U = true;
        this.V = new Paint();
        this.W = new Paint(1);
        this.z0 = new RectF();
        this.D0 = new ic1();
        this.E0 = Executors.newSingleThreadExecutor();
        this.x0 = ob1Var;
        this.w0 = rc1Var;
        this.e0 = i;
        setSurfaceTextureListener(this);
    }

    public static boolean a(v91 v91Var, rc1 rc1Var) {
        v91Var.getClass();
        ic1 ic1Var = rc1Var.b;
        if (ic1Var.l("id") == v91Var.e0 && ic1Var.l("container_id") == v91Var.x0.b0 && ic1Var.q("ad_session_id").equals(v91Var.x0.d0)) {
            return true;
        }
        return false;
    }

    public final void b() {
        ic1 ic1Var = new ic1();
        eb1.j(ic1Var, "id", this.v0);
        new rc1(this.x0.c0, ic1Var, "AdSession.on_error").b();
        this.k0 = true;
    }

    public final void c() {
        if (!this.o0) {
            t1.b(0, 1, "ADCVideoView pause() called while MediaPlayer is not prepared.", true);
        } else if (!this.m0) {
        } else {
            this.C0.getCurrentPosition();
            this.i0 = this.C0.getDuration();
            this.C0.pause();
            this.n0 = true;
        }
    }

    public final void d() {
        if (!this.o0) {
            return;
        }
        if (!this.n0 && ga1.S) {
            this.C0.start();
            try {
                this.E0.submit(new w91(this));
            } catch (RejectedExecutionException unused) {
                b();
            }
        } else if (!this.k0 && ga1.S) {
            this.C0.start();
            this.n0 = false;
            if (!this.E0.isShutdown()) {
                try {
                    this.E0.submit(new w91(this));
                } catch (RejectedExecutionException unused2) {
                    b();
                }
            }
            b bVar = this.A0;
            if (bVar != null) {
                bVar.invalidate();
            }
        }
        setWillNotDraw(false);
    }

    public final void e() {
        t1.b(0, 2, "MediaPlayer stopped and released.", true);
        try {
            if (!this.k0 && this.o0 && this.C0.isPlaying()) {
                this.C0.stop();
            }
        } catch (IllegalStateException unused) {
            t1.b(0, 1, "Caught IllegalStateException when calling stop on MediaPlayer", true);
        }
        ProgressBar progressBar = this.B0;
        if (progressBar != null) {
            this.x0.removeView(progressBar);
        }
        this.k0 = true;
        this.o0 = false;
        this.C0.release();
    }

    public final void f() {
        double d = this.c0;
        double d2 = this.f0;
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = this.d0;
        double d5 = this.g0;
        Double.isNaN(d4);
        Double.isNaN(d5);
        Double.isNaN(d4);
        Double.isNaN(d5);
        double min = Math.min(d3, d4 / d5);
        double d6 = this.f0;
        Double.isNaN(d6);
        Double.isNaN(d6);
        int i = (int) (d6 * min);
        double d7 = this.g0;
        Double.isNaN(d7);
        Double.isNaN(d7);
        int i2 = (int) (d7 * min);
        t1.b(0, 2, dp.b("setMeasuredDimension to ", i, " by ", i2), true);
        setMeasuredDimension(i, i2);
        if (this.q0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            layoutParams.gravity = 17;
            layoutParams.setMargins(0, 0, 0, 0);
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.k0 = true;
        this.h0 = this.i0;
        eb1.l(this.e0, this.D0, "id");
        eb1.l(this.x0.b0, this.D0, "container_id");
        eb1.j(this.D0, "ad_session_id", this.v0);
        eb1.g(this.D0, "elapsed", this.h0);
        eb1.g(this.D0, "duration", this.i0);
        new rc1(this.x0.c0, this.D0, "VideoView.on_progress").b();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        b();
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPlayer error: " + i + "," + i2);
        t1.b(0, 0, sb.toString(), false);
        return true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.o0 = true;
        if (this.t0) {
            this.x0.removeView(this.B0);
        }
        if (this.q0) {
            this.f0 = mediaPlayer.getVideoWidth();
            this.g0 = mediaPlayer.getVideoHeight();
            f();
            ga1.h().n().d(0, 2, "MediaPlayer getVideoWidth = " + mediaPlayer.getVideoWidth(), true);
            t1.b(0, 2, "MediaPlayer getVideoHeight = " + mediaPlayer.getVideoHeight(), true);
        }
        ic1 ic1Var = new ic1();
        eb1.l(this.e0, ic1Var, "id");
        eb1.l(this.x0.b0, ic1Var, "container_id");
        eb1.j(ic1Var, "ad_session_id", this.v0);
        new rc1(this.x0.c0, ic1Var, "VideoView.on_ready").b();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        ExecutorService executorService = this.E0;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        try {
            this.E0.submit(new a());
        } catch (RejectedExecutionException unused) {
            b();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (surfaceTexture != null && !this.p0) {
            try {
                this.C0.setSurface(new Surface(surfaceTexture));
            } catch (IllegalStateException unused) {
                ga1.h().n().d(0, 0, "IllegalStateException thrown when calling MediaPlayer.setSurface()", false);
                b();
            }
            this.y0 = surfaceTexture;
            return;
        }
        t1.b(0, 0, k6.b("Null texture provided by system's onSurfaceTextureAvailable or ", "MediaPlayer has been destroyed."), true);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.y0 = surfaceTexture;
        if (this.p0) {
            surfaceTexture.release();
            return true;
        }
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.y0 = surfaceTexture;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.y0 = surfaceTexture;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rc1 rc1Var;
        ad1 h = ga1.h();
        pb1 k = h.k();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ic1 ic1Var = new ic1();
        eb1.l(this.e0, ic1Var, "view_id");
        eb1.j(ic1Var, "ad_session_id", this.v0);
        eb1.l(this.a0 + x, ic1Var, "container_x");
        eb1.l(this.b0 + y, ic1Var, "container_y");
        eb1.l(x, ic1Var, "view_x");
        eb1.l(y, ic1Var, "view_y");
        eb1.l(this.x0.b0, ic1Var, "id");
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                eb1.l(((int) motionEvent.getX(action2)) + this.a0, ic1Var, "container_x");
                                eb1.l(((int) motionEvent.getY(action2)) + this.b0, ic1Var, "container_y");
                                eb1.l((int) motionEvent.getX(action2), ic1Var, "view_x");
                                eb1.l((int) motionEvent.getY(action2), ic1Var, "view_y");
                                if (!this.x0.m0) {
                                    h.n = k.f.get(this.v0);
                                }
                                rc1Var = new rc1(this.x0.c0, ic1Var, "AdContainer.on_touch_ended");
                            }
                            return true;
                        }
                        int action3 = (motionEvent.getAction() & 65280) >> 8;
                        eb1.l(((int) motionEvent.getX(action3)) + this.a0, ic1Var, "container_x");
                        eb1.l(((int) motionEvent.getY(action3)) + this.b0, ic1Var, "container_y");
                        eb1.l((int) motionEvent.getX(action3), ic1Var, "view_x");
                        eb1.l((int) motionEvent.getY(action3), ic1Var, "view_y");
                        rc1Var = new rc1(this.x0.c0, ic1Var, "AdContainer.on_touch_began");
                    } else {
                        rc1Var = new rc1(this.x0.c0, ic1Var, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    rc1Var = new rc1(this.x0.c0, ic1Var, "AdContainer.on_touch_moved");
                }
            } else {
                if (!this.x0.m0) {
                    h.n = k.f.get(this.v0);
                }
                rc1Var = new rc1(this.x0.c0, ic1Var, "AdContainer.on_touch_ended");
            }
        } else {
            rc1Var = new rc1(this.x0.c0, ic1Var, "AdContainer.on_touch_began");
        }
        rc1Var.b();
        return true;
    }
}