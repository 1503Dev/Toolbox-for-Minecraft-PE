package defpackage;

import java.util.Map;

/* renamed from: r81  reason: default package */
public final class r81 {
    public final x81 a;
    public final int b;
    public final int c;

    public r81(int i, int i2, tl tlVar) {
        this.b = i;
        this.c = i2;
        if (i >= 2) {
            if (i % i2 == 0) {
                int i3 = i / i2;
                if (i3 != 1) {
                    x81 x81Var = new x81(i3, tlVar);
                    this.a = x81Var;
                    String b = x81Var.a.a.a.b();
                    int a = a();
                    w51 w51Var = x81Var.a.a;
                    int i4 = w51Var.c;
                    int i5 = w51Var.d;
                    if (b != null) {
                        jk.b.get(jk.a(b, a, i4, i5, i, i2));
                        return;
                    } else {
                        Map<String, jk> map = jk.b;
                        throw new NullPointerException("algorithmName == null");
                    }
                }
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public final int a() {
        return this.a.a();
    }
}