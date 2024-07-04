package defpackage;

import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* renamed from: nr1  reason: default package */
public abstract class nr1 {
    public pl1 b;
    public nk1 c;
    public kr1 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final ir1 a = new ir1();
    public mr1 j = new mr1();

    public abstract long a(kh4 kh4Var);

    public void b(boolean z) {
        int i;
        if (z) {
            this.j = new mr1();
            this.f = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.h = i;
        this.e = -1L;
        this.g = 0L;
    }

    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public abstract boolean c(kh4 kh4Var, long j, mr1 mr1Var);

    public void d(long j) {
        this.g = j;
    }
}