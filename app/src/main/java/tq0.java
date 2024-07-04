package defpackage;

import javax.annotation.Nullable;

/* renamed from: tq0  reason: default package */
public final class tq0 {
    @Nullable
    public static sq0 a;
    public static long b;

    public static void a(sq0 sq0Var) {
        if (sq0Var.f != null || sq0Var.g != null) {
            throw new IllegalArgumentException();
        }
        if (sq0Var.d) {
            return;
        }
        synchronized (tq0.class) {
            long j = b + 8192;
            if (j > 65536) {
                return;
            }
            b = j;
            sq0Var.f = a;
            sq0Var.c = 0;
            sq0Var.b = 0;
            a = sq0Var;
        }
    }

    public static sq0 b() {
        synchronized (tq0.class) {
            sq0 sq0Var = a;
            if (sq0Var != null) {
                a = sq0Var.f;
                sq0Var.f = null;
                b -= 8192;
                return sq0Var;
            }
            return new sq0();
        }
    }
}