package defpackage;

import java.io.ByteArrayOutputStream;

/* renamed from: ai  reason: default package */
public final class ai extends t {
    public o P;
    public l Q;
    public t R;
    public int S;
    public t T;

    public ai(s82 s82Var) {
        int i = 0;
        t w = w(0, s82Var);
        if (w instanceof o) {
            this.P = (o) w;
            w = w(1, s82Var);
            i = 1;
        }
        if (w instanceof l) {
            this.Q = (l) w;
            i++;
            w = w(i, s82Var);
        }
        if (!(w instanceof x)) {
            this.R = w;
            i++;
            w = w(i, s82Var);
        }
        if (s82Var.i() == i + 1) {
            if (w instanceof x) {
                x xVar = (x) w;
                int i2 = xVar.P;
                if (i2 >= 0 && i2 <= 2) {
                    this.S = i2;
                    this.T = xVar.x();
                    return;
                }
                throw new IllegalArgumentException(k6.a("invalid encoding value: ", i2));
            }
            throw new IllegalArgumentException("No tagged object found in vector. Structure doesn't seem to be of type External");
        }
        throw new IllegalArgumentException("input vector too large");
    }

    public static t w(int i, s82 s82Var) {
        if (s82Var.i() > i) {
            return s82Var.h(i).h();
        }
        throw new IllegalArgumentException("too few objects in input vector");
    }

    @Override // defpackage.t, defpackage.n
    public final int hashCode() {
        o oVar = this.P;
        int hashCode = oVar != null ? oVar.hashCode() : 0;
        l lVar = this.Q;
        if (lVar != null) {
            hashCode ^= lVar.hashCode();
        }
        t tVar = this.R;
        if (tVar != null) {
            hashCode ^= tVar.hashCode();
        }
        return hashCode ^ this.T.hashCode();
    }

    @Override // defpackage.t
    public final boolean p(t tVar) {
        t tVar2;
        l lVar;
        o oVar;
        if (tVar instanceof ai) {
            if (this == tVar) {
                return true;
            }
            ai aiVar = (ai) tVar;
            o oVar2 = this.P;
            if (oVar2 == null || ((oVar = aiVar.P) != null && oVar.equals(oVar2))) {
                l lVar2 = this.Q;
                if (lVar2 == null || ((lVar = aiVar.Q) != null && lVar.equals(lVar2))) {
                    t tVar3 = this.R;
                    if (tVar3 == null || ((tVar2 = aiVar.R) != null && tVar2.equals(tVar3))) {
                        return this.T.equals(aiVar.T);
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o oVar = this.P;
        if (oVar != null) {
            byteArrayOutputStream.write(oVar.o("DER"));
        }
        l lVar = this.Q;
        if (lVar != null) {
            byteArrayOutputStream.write(lVar.o("DER"));
        }
        t tVar = this.R;
        if (tVar != null) {
            byteArrayOutputStream.write(tVar.o("DER"));
        }
        byteArrayOutputStream.write(new ri(true, this.S, this.T).o("DER"));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        rVar.h(32, 8);
        rVar.f(byteArray.length);
        rVar.a.write(byteArray);
    }

    @Override // defpackage.t
    public final int r() {
        return n().length;
    }

    @Override // defpackage.t
    public final boolean t() {
        return true;
    }
}