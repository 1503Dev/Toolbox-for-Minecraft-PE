package defpackage;

import java.util.Comparator;

/* renamed from: x32  reason: default package */
public final class x32 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        k32 k32Var = (k32) obj;
        k32 k32Var2 = (k32) obj2;
        float f = k32Var.b;
        float f2 = k32Var2.b;
        if (f >= f2) {
            if (f > f2) {
                return 1;
            }
            float f3 = k32Var.a;
            float f4 = k32Var2.a;
            if (f3 >= f4) {
                if (f3 > f4) {
                    return 1;
                }
                float f5 = (k32Var.d - f) * (k32Var.c - f3);
                float f6 = (k32Var2.d - f2) * (k32Var2.c - f4);
                if (f5 <= f6) {
                    if (f5 < f6) {
                        return 1;
                    }
                    return 0;
                }
            }
        }
        return -1;
    }
}