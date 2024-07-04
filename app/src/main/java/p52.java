package defpackage;

import java.nio.charset.Charset;

/* renamed from: p52  reason: default package */
public class p52 extends s42 {
    public final byte[] R;

    public p52(byte[] bArr) {
        bArr.getClass();
        this.R = bArr;
    }

    @Override // defpackage.y82
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y82) || m() != ((y82) obj).m()) {
            return false;
        }
        if (m() == 0) {
            return true;
        }
        if (obj instanceof p52) {
            p52 p52Var = (p52) obj;
            int i = this.P;
            int i2 = p52Var.P;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int m = m();
            if (m <= p52Var.m()) {
                if (m <= p52Var.m()) {
                    byte[] bArr = this.R;
                    byte[] bArr2 = p52Var.R;
                    p52Var.u();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < m) {
                        if (bArr[i3] != bArr2[i4]) {
                            return false;
                        }
                        i3++;
                        i4++;
                    }
                    return true;
                }
                throw new IllegalArgumentException(dp.b("Ran off end of other: 0, ", m, ", ", p52Var.m()));
            }
            int m2 = m();
            throw new IllegalArgumentException("Length too large: " + m + m2);
        }
        return obj.equals(this);
    }

    @Override // defpackage.y82
    public byte g(int i) {
        return this.R[i];
    }

    @Override // defpackage.y82
    public byte h(int i) {
        return this.R[i];
    }

    @Override // defpackage.y82
    public int m() {
        return this.R.length;
    }

    @Override // defpackage.y82
    public final int n(int i, int i2) {
        byte[] bArr = this.R;
        Charset charset = z13.a;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // defpackage.y82
    public final p52 o() {
        int s = y82.s(0, 47, m());
        return s == 0 ? y82.Q : new x22(this.R, s);
    }

    @Override // defpackage.y82
    public final String p(Charset charset) {
        return new String(this.R, 0, m(), charset);
    }

    @Override // defpackage.y82
    public final void q(hg2 hg2Var) {
        ((ld2) hg2Var).e0(this.R, m());
    }

    @Override // defpackage.y82
    public final boolean r() {
        return nf4.c(this.R, 0, m());
    }

    public void u() {
    }
}