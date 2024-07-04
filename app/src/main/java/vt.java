package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: vt  reason: default package */
public final class vt extends l11<AtomicLong> {
    public final /* synthetic */ l11 a;

    public vt(l11 l11Var) {
        this.a = l11Var;
    }

    @Override // defpackage.l11
    public final AtomicLong a(c00 c00Var) {
        return new AtomicLong(((Number) this.a.a(c00Var)).longValue());
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, AtomicLong atomicLong) {
        this.a.b(i00Var, Long.valueOf(atomicLong.get()));
    }
}