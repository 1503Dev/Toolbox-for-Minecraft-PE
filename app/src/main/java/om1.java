package defpackage;

import android.util.Pair;
import java.util.regex.Pattern;

/* renamed from: om1  reason: default package */
public final /* synthetic */ class om1 implements k16, vp4, nf3, kg4, wy4, v64, iu5 {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ om1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.vp4
    public final void a(long j, int i) {
        ((dp4) this.Q).d(System.currentTimeMillis() - j, i);
    }

    @Override // defpackage.k16
    public final long b(long j) {
        tk1 tk1Var = (tk1) this.Q;
        return Math.max(0L, Math.min((j * tk1Var.e) / 1000000, tk1Var.j - 1));
    }

    @Override // defpackage.vp4
    public final void c(long j, int i, String str) {
        ((dp4) this.Q).e(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // defpackage.nf3
    /* renamed from: e */
    public final int mo9e(Object obj) {
        cu1 cu1Var = (cu1) this.Q;
        pt5 pt5Var = (pt5) obj;
        Pattern pattern = lu5.a;
        return (pt5Var.b.equals(cu1Var.k) || pt5Var.b.equals(lu5.c(cu1Var))) && pt5Var.i(cu1Var, false) ? 1 : 0;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        ((hm4) this.Q).f();
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
    }

    @Override // defpackage.nf3
    /* renamed from: e */
    public final void mo9e(Object obj) {
        switch (this.P) {
            case 3:
                Pair pair = (Pair) this.Q;
                ((px2) obj).A2((String) pair.first, (String) pair.second);
                return;
            default:
                int i = bm5.X;
                ((b53) obj).d(((jn5) this.Q).g);
                return;
        }
    }
}