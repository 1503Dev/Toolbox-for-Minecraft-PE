package defpackage;

import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: br0  reason: default package */
public final class br0 extends fa {
    public final a R;
    public final String S;
    private final a.InterfaceC0035a T;
    public int U = 0;

    public br0(final b bVar, final String str) {
        this.R = bVar;
        this.S = str;
        this.T = new a.InterfaceC0035a() { // from class: zq0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                final br0 br0Var = br0.this;
                final a aVar = bVar;
                final String str2 = str;
                br0Var.getClass();
                h21.a(new Runnable() { // from class: ar0
                    @Override // java.lang.Runnable
                    public final void run() {
                        br0.I(br0.this, aVar, str2);
                    }
                });
            }
        };
    }

    public static /* synthetic */ void I(br0 br0Var, a aVar, String str) {
        br0Var.getClass();
        super.H(((b) aVar).k(str));
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
            ((b) this.R).W(this.S, this.T);
        }
    }

    @Override // defpackage.ea
    public final void h() {
        int i = this.U;
        this.U = i + 1;
        if (i == 0) {
            ((b) this.R).P(this.S, this.T);
            super.H(((b) this.R).k(this.S));
        }
    }
}