package defpackage;

/* renamed from: i16  reason: default package */
public final class i16 implements ml1 {
    public final k16 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;

    public i16(k16 k16Var, long j, long j2, long j3, long j4, long j5) {
        this.a = k16Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        nl1 nl1Var = new nl1(j, j16.a(this.a.b(j), 0L, this.c, this.d, this.e, this.f));
        return new kl1(nl1Var, nl1Var);
    }
}