package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: mk5  reason: default package */
public abstract class mk5 implements ln5 {
    public final int P;
    public zn5 R;
    public int S;
    public wp5 T;
    public int U;
    public ww5 V;
    public cu1[] W;
    public long X;
    public boolean Z;
    public boolean a0;
    public final vi1 Q = new vi1();
    public long Y = Long.MIN_VALUE;

    public mk5(int i) {
        this.P = i;
    }

    @Override // defpackage.ln5
    public void c(int i, Object obj) {
    }

    public final void e() {
        tv2.I(this.U == 0);
        vi1 vi1Var = this.Q;
        vi1Var.R = null;
        vi1Var.Q = null;
        u();
    }

    public void f(float f, float f2) {
    }

    public final boolean g() {
        return this.Y == Long.MIN_VALUE;
    }

    public abstract String h();

    public abstract void i(long j, long j2);

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l(cu1 cu1Var);

    public final int m(vi1 vi1Var, gk5 gk5Var, int i) {
        ww5 ww5Var = this.V;
        ww5Var.getClass();
        int a = ww5Var.a(vi1Var, gk5Var, i);
        if (a == -4) {
            if (gk5Var.a(4)) {
                this.Y = Long.MIN_VALUE;
                if (this.Z) {
                    return -4;
                }
                return -3;
            }
            long j = gk5Var.e + this.X;
            gk5Var.e = j;
            this.Y = Math.max(this.Y, j);
        } else if (a == -5) {
            cu1 cu1Var = (cu1) vi1Var.Q;
            cu1Var.getClass();
            long j2 = cu1Var.o;
            if (j2 != RecyclerView.FOREVER_NS) {
                bs1 bs1Var = new bs1(cu1Var);
                bs1Var.n = j2 + this.X;
                vi1Var.Q = new cu1(bs1Var);
                return -5;
            }
        }
        return a;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final tk5 n(int i, cu1 cu1Var, Exception exc, boolean z) {
        int i2;
        if (cu1Var != null && !this.a0) {
            this.a0 = true;
            try {
                i2 = l(cu1Var) & 7;
            } catch (tk5 unused) {
            } finally {
                this.a0 = false;
            }
            return new tk5(1, exc, i, h(), this.S, cu1Var, cu1Var != null ? 4 : i2, z);
        }
        i2 = 4;
        return new tk5(1, exc, i, h(), this.S, cu1Var, cu1Var != null ? 4 : i2, z);
    }

    public int o() {
        return 0;
    }

    public tm5 p() {
        return null;
    }

    public final ww5 q() {
        return this.V;
    }

    public abstract void r();

    public void s(boolean z, boolean z2) {
    }

    public abstract void t(long j, boolean z);

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(long j, long j2);

    public final void y(cu1[] cu1VarArr, ww5 ww5Var, long j, long j2) {
        tv2.I(!this.Z);
        this.V = ww5Var;
        if (this.Y == Long.MIN_VALUE) {
            this.Y = j;
        }
        this.W = cu1VarArr;
        this.X = j2;
        x(j, j2);
    }
}