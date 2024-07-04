package defpackage;

import android.media.AudioTrack;

/* renamed from: ch4  reason: default package */
public final /* synthetic */ class ch4 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ ch4(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ay5 ay5Var;
        switch (this.P) {
            case 0:
                ((dh4) this.Q).T.d.p((tz3) this.R);
                return;
            case 1:
                AudioTrack audioTrack = (AudioTrack) this.Q;
                sy3 sy3Var = (sy3) this.R;
                Object obj = rr5.V;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    sy3Var.b();
                    synchronized (rr5.V) {
                        int i = rr5.X - 1;
                        rr5.X = i;
                        if (i == 0) {
                            rr5.W.shutdown();
                            rr5.W = null;
                        }
                    }
                    return;
                } catch (Throwable th) {
                    sy3Var.b();
                    synchronized (rr5.V) {
                        int i2 = rr5.X - 1;
                        rr5.X = i2;
                        if (i2 == 0) {
                            rr5.W.shutdown();
                            rr5.W = null;
                        }
                        throw th;
                    }
                }
            default:
                if (((yv0) this.Q).j()) {
                    ay5<TContinuationResult> ay5Var2 = ((bg3) this.R).R;
                    synchronized (ay5Var2.a) {
                        if (!ay5Var2.c) {
                            ay5Var2.c = true;
                            ay5Var2.d = true;
                            ay5Var2.b.b(ay5Var2);
                        }
                    }
                    return;
                }
                try {
                    ((bg3) this.R).R.n(((bg3) this.R).Q.b((yv0) this.Q));
                    return;
                } catch (qm0 e) {
                    e = e;
                    if (e.getCause() instanceof Exception) {
                        ay5Var = ((bg3) this.R).R;
                        e = (Exception) e.getCause();
                        ay5Var.m(e);
                        return;
                    }
                    ay5Var = ((bg3) this.R).R;
                    ay5Var.m(e);
                    return;
                } catch (Exception e2) {
                    e = e2;
                    ay5Var = ((bg3) this.R).R;
                    ay5Var.m(e);
                    return;
                }
        }
    }

    public ch4(bg3 bg3Var, yv0 yv0Var) {
        this.P = 2;
        this.R = bg3Var;
        this.Q = yv0Var;
    }
}