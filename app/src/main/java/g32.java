package defpackage;

import android.app.Application;
import android.text.TextUtils;
import android.view.View;

/* renamed from: g32  reason: default package */
public final class g32 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ g32(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r1 == 0) goto L33;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Application application;
        boolean z;
        switch (this.P) {
            case 0:
                j32 j32Var = (j32) this.R;
                View view = (View) this.Q;
                j32Var.getClass();
                try {
                    a32 a32Var = new a32(j32Var.U, j32Var.V, j32Var.W, j32Var.X, j32Var.Y, j32Var.Z, j32Var.a0, j32Var.d0);
                    f32 f32Var = jv5.A.f;
                    synchronized (f32Var.a) {
                        d32 d32Var = f32Var.b;
                        if (d32Var != null) {
                            application = d32Var.Q;
                        } else {
                            application = null;
                        }
                    }
                    if (application != null && !TextUtils.isEmpty(j32Var.b0)) {
                        String str = (String) view.getTag(application.getResources().getIdentifier((String) w82.d.c.a(x92.P), "id", application.getPackageName()));
                        if (str != null && str.equals(j32Var.b0)) {
                            return;
                        }
                    }
                    ru1 b = j32Var.b(view, a32Var);
                    a32Var.b();
                    if (b.a != 0 || b.b != 0) {
                        int i = b.b;
                        if (i == 0) {
                            if (a32Var.k == 0) {
                                return;
                            }
                        }
                        b32 b32Var = j32Var.S;
                        synchronized (b32Var.a) {
                            if (b32Var.c.contains(a32Var)) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        if (!z) {
                            j32Var.S.a(a32Var);
                            return;
                        }
                        return;
                    }
                    return;
                } catch (Exception e) {
                    sv2.e("Exception in fetchContentOnUIThread", e);
                    jv5.A.g.f("ContentFetchTask.fetchContent", e);
                    return;
                }
            case 1:
                ((oh4) this.Q).T.d.p((tz3) this.R);
                return;
            default:
                oq5 oq5Var = ((nq5) this.Q).b;
                int i2 = zn4.a;
                xl5 xl5Var = (xl5) oq5Var;
                bm5 bm5Var = xl5Var.P;
                int i3 = bm5.X;
                bm5Var.getClass();
                pp5 pp5Var = xl5Var.P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1007, new no4(G, (nk5) this.R));
                return;
        }
    }

    public g32(j32 j32Var, View view) {
        this.P = 0;
        this.R = j32Var;
        this.Q = view;
    }
}