package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: p94  reason: default package */
public final class p94 implements nc4 {
    public final AtomicReference a = new AtomicReference();
    public final kd b;
    public final nc4 c;
    public final long d;

    public p94(nc4 nc4Var, long j, kd kdVar) {
        this.b = kdVar;
        this.c = nc4Var;
        this.d = j;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 16;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r1 != false) goto L11;
     */
    @Override // defpackage.nc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dz4 c() {
        boolean z;
        o94 o94Var = (o94) this.a.get();
        if (o94Var != null) {
            if (o94Var.b < o94Var.c.b()) {
                z = true;
            } else {
                z = false;
            }
        }
        o94Var = new o94(this.c.c(), this.d, this.b);
        this.a.set(o94Var);
        return o94Var.a;
    }
}