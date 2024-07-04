package defpackage;

import java.util.Comparator;

/* renamed from: av4  reason: default package */
public final class av4 extends cv4 {
    public static final cv4 f(int i) {
        return i < 0 ? cv4.b : i > 0 ? cv4.c : cv4.a;
    }

    @Override // defpackage.cv4
    public final int a() {
        return 0;
    }

    @Override // defpackage.cv4
    public final cv4 b(int i, int i2) {
        return f(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // defpackage.cv4
    public final cv4 c(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.cv4
    public final cv4 d(boolean z, boolean z2) {
        return f(z == z2 ? 0 : !z ? -1 : 1);
    }

    @Override // defpackage.cv4
    public final cv4 e() {
        return f(0);
    }
}