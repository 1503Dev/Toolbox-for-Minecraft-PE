package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: d60  reason: default package */
public final class d60 implements dx2, wg3, nw3, bl4, i23, v64 {
    public final /* synthetic */ int P;
    public Object Q;

    public /* synthetic */ d60(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        switch (this.P) {
            case 3:
                ((bx2) this.Q).c(new uj2("Cannot get Javascript Engine"));
                return;
            default:
                ((y03) this.Q).f0();
                return;
        }
    }

    public final void b(gv1 gv1Var, ov1 ov1Var) {
        gv1Var.g("post-error");
        ((su1) ((Executor) this.Q)).P.post(new tu1(0, gv1Var, new lv1(ov1Var), null));
    }

    public final void c(gv1 gv1Var, lv1 lv1Var, qh1 qh1Var) {
        synchronized (gv1Var.T) {
            gv1Var.X = true;
        }
        gv1Var.g("post-response");
        ((su1) ((Executor) this.Q)).P.post(new tu1(0, gv1Var, lv1Var, qh1Var));
    }

    @Override // defpackage.nw3
    public final dz4 d(rq2 rq2Var) {
        return ((cy3) ((ow3) this.Q).c.c()).w4(rq2Var.W);
    }

    @Override // defpackage.bl4
    public final Object e(Object obj) {
        r04.g((SQLiteDatabase) obj, (wv2) this.Q);
        return null;
    }

    public d60(Handler handler) {
        this.P = 2;
        this.Q = new su1(handler);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        switch (this.P) {
            case 4:
                ((ze3) obj).d(((ye3) this.Q).Q.e0);
                return;
            default:
                ((b53) obj).f(bm5.G((jn5) this.Q));
                return;
        }
    }
}