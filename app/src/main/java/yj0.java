package defpackage;

import defpackage.ek0;

/* renamed from: yj0  reason: default package */
public final class yj0 extends ek0.e {
    public final /* synthetic */ hp S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj0(bb bbVar, ab abVar, hp hpVar) {
        super(bbVar, abVar);
        this.S = hpVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.S.a(true, true, null);
    }
}