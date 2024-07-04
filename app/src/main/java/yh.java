package defpackage;

/* renamed from: yh  reason: default package */
public final class yh extends t {
    public final char[] P;

    public yh(char[] cArr) {
        this.P = cArr;
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        char[] cArr = this.P;
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        if (tVar instanceof yh) {
            char[] cArr = this.P;
            char[] cArr2 = ((yh) tVar).P;
            if (cArr != cArr2) {
                if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
                    return false;
                }
                for (int i = 0; i != cArr.length; i++) {
                    if (cArr[i] != cArr2[i]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.c(30);
        rVar.f(this.P.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.P;
            if (i == cArr.length) {
                return;
            }
            char c = cArr[i];
            rVar.c((byte) (c >> '\b'));
            rVar.c((byte) c);
            i++;
        }
    }

    @Override // defpackage.t
    public final int r() {
        return (this.P.length * 2) + eu0.a(this.P.length * 2) + 1;
    }

    @Override // defpackage.t
    public final boolean t() {
        return false;
    }

    public final String toString() {
        return new String(this.P);
    }
}