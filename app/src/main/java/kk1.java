package defpackage;

import java.io.EOFException;

/* renamed from: kk1  reason: default package */
public final class kk1 implements pl1 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.pl1
    public final void a(int i, kh4 kh4Var) {
        kh4Var.f(i);
    }

    @Override // defpackage.pl1
    public final void b(long j, int i, int i2, int i3, ol1 ol1Var) {
    }

    @Override // defpackage.pl1
    public final void c(kh4 kh4Var, int i) {
        kh4Var.f(i);
    }

    @Override // defpackage.pl1
    public final int d(gv5 gv5Var, int i, boolean z) {
        return f(gv5Var, i, z);
    }

    @Override // defpackage.pl1
    public final void e(cu1 cu1Var) {
    }

    @Override // defpackage.pl1
    public final int f(gv5 gv5Var, int i, boolean z) {
        int x = gv5Var.x(this.a, 0, Math.min(4096, i));
        if (x == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return x;
    }
}