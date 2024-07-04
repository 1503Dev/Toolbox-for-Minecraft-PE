package defpackage;

import androidx.lifecycle.c;
import androidx.lifecycle.e;

/* renamed from: ds  reason: default package */
public final class ds implements b10 {
    public e P = null;

    public final void d(c.b bVar) {
        this.P.d(bVar);
    }

    @Override // defpackage.b10
    public final e k() {
        if (this.P == null) {
            this.P = new e(this);
        }
        return this.P;
    }
}