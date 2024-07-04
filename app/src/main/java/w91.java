package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: w91  reason: default package */
public final class w91 implements Runnable {
    public final /* synthetic */ v91 P;

    public w91(v91 v91Var) {
        this.P = v91Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0201, code lost:
        if (r0.l0 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0203, code lost:
        r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0206, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Rect rect;
        this.P.j0 = 0L;
        while (true) {
            v91 v91Var = this.P;
            if (v91Var.k0 || v91Var.n0 || !ga1.i()) {
                break;
            }
            Context context = ga1.P;
            v91 v91Var2 = this.P;
            if (!v91Var2.k0 && !v91Var2.p0 && context != null && (context instanceof Activity)) {
                if (v91Var2.C0.isPlaying()) {
                    v91 v91Var3 = this.P;
                    if (v91Var3.j0 == 0 && ga1.S) {
                        v91Var3.j0 = System.currentTimeMillis();
                    }
                    v91 v91Var4 = this.P;
                    v91Var4.m0 = true;
                    double currentPosition = v91Var4.C0.getCurrentPosition();
                    Double.isNaN(currentPosition);
                    Double.isNaN(currentPosition);
                    Double.isNaN(currentPosition);
                    v91Var4.h0 = currentPosition / 1000.0d;
                    v91 v91Var5 = this.P;
                    double duration = v91Var5.C0.getDuration();
                    Double.isNaN(duration);
                    Double.isNaN(duration);
                    Double.isNaN(duration);
                    v91Var5.i0 = duration / 1000.0d;
                    long currentTimeMillis = System.currentTimeMillis();
                    v91 v91Var6 = this.P;
                    if (currentTimeMillis - v91Var6.j0 > 1000 && !v91Var6.s0 && ga1.S) {
                        if (v91Var6.h0 == 0.0d) {
                            t1.b(0, 0, "getCurrentPosition() not working, firing AdSession.on_error", true);
                            this.P.b();
                        } else {
                            v91Var6.s0 = true;
                        }
                    }
                    v91 v91Var7 = this.P;
                    if (v91Var7.r0) {
                        if (v91Var7.U) {
                            v91Var7.R = (float) (360.0d / v91Var7.i0);
                            v91Var7.W.setColor(-3355444);
                            v91Var7.W.setShadowLayer((int) (v91Var7.S * 2.0f), 0.0f, 0.0f, -16777216);
                            v91Var7.W.setTextAlign(Paint.Align.CENTER);
                            v91Var7.W.setLinearText(true);
                            v91Var7.W.setTextSize(v91Var7.S * 12.0f);
                            v91Var7.V.setStyle(Paint.Style.STROKE);
                            float f = v91Var7.S * 2.0f;
                            if (f > 6.0f) {
                                f = 6.0f;
                            }
                            if (f < 4.0f) {
                                f = 4.0f;
                            }
                            v91Var7.V.setStrokeWidth(f);
                            v91Var7.V.setShadowLayer((int) (v91Var7.S * 3.0f), 0.0f, 0.0f, -16777216);
                            v91Var7.V.setColor(-3355444);
                            v91Var7.W.getTextBounds("0123456789", 0, 9, new Rect());
                            v91Var7.P = rect.height();
                            Context context2 = ga1.P;
                            if (context2 != null) {
                                eg1.n(new x91(v91Var7, context2));
                            }
                            v91Var7.U = false;
                        }
                        v91Var7.T = (int) (v91Var7.i0 - v91Var7.h0);
                        float f2 = v91Var7.P;
                        float f3 = (int) f2;
                        float f4 = (int) (3.0f * f2);
                        float f5 = f2 / 2.0f;
                        float f6 = f2 * 2.0f;
                        v91Var7.z0.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
                        double d = v91Var7.R;
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d);
                        v91Var7.Q = (float) ((v91Var7.i0 - v91Var7.h0) * d);
                    }
                }
                v91 v91Var8 = this.P;
                if (v91Var8.m0 && !v91Var8.k0 && !v91Var8.n0) {
                    eb1.l(v91Var8.e0, v91Var8.D0, "id");
                    v91 v91Var9 = this.P;
                    eb1.l(v91Var9.x0.b0, v91Var9.D0, "container_id");
                    v91 v91Var10 = this.P;
                    eb1.j(v91Var10.D0, "ad_session_id", v91Var10.v0);
                    v91 v91Var11 = this.P;
                    eb1.g(v91Var11.D0, "elapsed", v91Var11.h0);
                    v91 v91Var12 = this.P;
                    eb1.g(v91Var12.D0, "duration", v91Var12.i0);
                    v91 v91Var13 = this.P;
                    new rc1(v91Var13.x0.c0, v91Var13.D0, "VideoView.on_progress").b();
                }
                if (this.P.l0 || ((Activity) context).isFinishing()) {
                    break;
                }
                try {
                    Thread.sleep(50L);
                } catch (InterruptedException unused) {
                    this.P.b();
                    ga1.h().n().d(0, 0, "InterruptedException in ADCVideoView's update thread.", false);
                }
            } else {
                return;
            }
        }
        v91 v91Var14 = this.P;
        v91Var14.l0 = false;
        v91Var14.e();
    }
}