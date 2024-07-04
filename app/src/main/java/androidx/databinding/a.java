package androidx.databinding;

import androidx.databinding.e;

public class a implements e {
    public transient h P;

    public final void F() {
        synchronized (this) {
            h hVar = this.P;
            if (hVar == null) {
                return;
            }
            hVar.c(0, this, null);
        }
    }

    public final void G(int i) {
        synchronized (this) {
            h hVar = this.P;
            if (hVar == null) {
                return;
            }
            hVar.c(i, this, null);
        }
    }

    @Override // androidx.databinding.e
    public final void a(e.a aVar) {
        synchronized (this) {
            if (this.P == null) {
                this.P = new h();
            }
        }
        this.P.a(aVar);
    }

    @Override // androidx.databinding.e
    public final void z(e.a aVar) {
        synchronized (this) {
            h hVar = this.P;
            if (hVar == null) {
                return;
            }
            hVar.f(aVar);
        }
    }
}