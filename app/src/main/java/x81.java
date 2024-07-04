package defpackage;

import java.util.Map;

/* renamed from: x81  reason: default package */
public final class x81 {
    public final u51 a;
    public final int b;
    public final int c;

    public x81(int i, tl tlVar) {
        if (i >= 2) {
            this.a = new u51(new w51(tlVar));
            this.b = i;
            int i2 = 2;
            while (true) {
                int i3 = this.b;
                if (i2 <= i3) {
                    if ((i3 - i2) % 2 == 0) {
                        this.c = i2;
                        String b = this.a.a.a.b();
                        int a = a();
                        w51 w51Var = this.a.a;
                        int i4 = w51Var.c;
                        int i5 = w51Var.d;
                        if (b != null) {
                            kk.b.get(kk.a(b, a, i4, i5, i));
                            return;
                        } else {
                            Map<String, kk> map = kk.b;
                            throw new NullPointerException("algorithmName == null");
                        }
                    }
                    i2++;
                } else {
                    throw new IllegalStateException("should never happen...");
                }
            }
        } else {
            throw new IllegalArgumentException("height must be >= 2");
        }
    }

    public final int a() {
        return this.a.a.b;
    }
}