package defpackage;

import javax.annotation.Nullable;

/* renamed from: ck0  reason: default package */
public final class ck0 extends ql0 {
    @Nullable
    public final String Q;
    public final long R;
    public final bb S;

    public ck0(@Nullable String str, long j, wj0 wj0Var) {
        this.Q = str;
        this.R = j;
        this.S = wj0Var;
    }

    @Override // defpackage.ql0
    public final long g() {
        return this.R;
    }

    @Override // defpackage.ql0
    public final e50 t() {
        String str = this.Q;
        if (str != null) {
            try {
                return e50.a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.ql0
    public final bb y() {
        return this.S;
    }
}