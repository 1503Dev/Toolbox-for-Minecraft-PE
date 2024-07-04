package defpackage;

import androidx.databinding.e;

/* renamed from: s01  reason: default package */
public final class s01 extends q01 {
    public final e[] R;
    public final a S;
    public final fb0 T = new fb0(this);
    public int U = 0;

    /* renamed from: s01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public s01(e[] eVarArr, ey0 ey0Var) {
        this.R = eVarArr;
        this.S = ey0Var;
    }

    @Override // defpackage.p01
    public final void A() {
        super.H(((ey0) this.S).c());
    }

    @Override // defpackage.ya0
    public final void H(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ea
    public final void g() {
        e[] eVarArr;
        int i = this.U - 1;
        this.U = i;
        if (i == 0) {
            for (e eVar : this.R) {
                eVar.z(this.T);
                if (eVar instanceof ea) {
                    ((ea) eVar).g();
                }
            }
        }
    }

    @Override // defpackage.ea
    public final void h() {
        e[] eVarArr;
        int i = this.U;
        this.U = i + 1;
        if (i == 0) {
            for (e eVar : this.R) {
                if (eVar instanceof ea) {
                    ((ea) eVar).h();
                }
                eVar.a(this.T);
            }
            A();
        }
    }
}