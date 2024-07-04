package defpackage;

import androidx.databinding.b;
import androidx.databinding.e;

/* renamed from: r01  reason: default package */
public final class r01<T extends e> extends q01 {
    public final T R;
    public final a<T> S;
    public final fb0 T = new fb0(this);
    public int U = 0;

    /* renamed from: r01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a<T extends e> {
        boolean a(T t);
    }

    public r01(b bVar, a aVar) {
        this.R = bVar;
        this.S = aVar;
    }

    @Override // defpackage.p01
    public final void A() {
        super.H(this.S.a(this.R));
    }

    @Override // defpackage.ya0
    public final void H(boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ea
    public final void g() {
        int i = this.U - 1;
        this.U = i;
        if (i == 0) {
            this.R.z(this.T);
            T t = this.R;
            if (t instanceof ea) {
                ((ea) t).g();
            }
        }
    }

    @Override // defpackage.ea
    public final void h() {
        int i = this.U;
        this.U = i + 1;
        if (i == 0) {
            T t = this.R;
            if (t instanceof ea) {
                ((ea) t).h();
            }
            this.R.a(this.T);
            A();
        }
    }
}