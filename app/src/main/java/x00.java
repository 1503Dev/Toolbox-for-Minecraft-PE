package defpackage;

import java.util.Enumeration;

/* renamed from: x00  reason: default package */
public final class x00 extends u {
    public byte[] Q;

    public x00(byte[] bArr) {
        this.Q = bArr;
    }

    public final void B() {
        w00 w00Var = new w00(this.Q);
        while (w00Var.hasMoreElements()) {
            this.P.addElement(w00Var.nextElement());
        }
        this.Q = null;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        byte[] bArr = this.Q;
        if (bArr != null) {
            rVar.d(bArr, 48);
        } else {
            super.v().q(rVar);
        }
    }

    @Override // defpackage.t
    public final int r() {
        byte[] bArr = this.Q;
        return bArr != null ? eu0.a(bArr.length) + 1 + this.Q.length : super.v().r();
    }

    @Override // defpackage.u
    public final synchronized int size() {
        if (this.Q != null) {
            B();
        }
        return super.size();
    }

    @Override // defpackage.u, defpackage.t
    public final t u() {
        if (this.Q != null) {
            B();
        }
        return super.u();
    }

    @Override // defpackage.u, defpackage.t
    public final t v() {
        if (this.Q != null) {
            B();
        }
        return super.v();
    }

    @Override // defpackage.u
    public final synchronized g x(int i) {
        if (this.Q != null) {
            B();
        }
        return super.x(i);
    }

    @Override // defpackage.u
    public final synchronized Enumeration y() {
        byte[] bArr = this.Q;
        if (bArr == null) {
            return super.y();
        }
        return new w00(bArr);
    }
}