package defpackage;

/* renamed from: ls2  reason: default package */
public final class ls2 implements ui3 {
    public static final ls2 a = new ls2();

    @Override // defpackage.ui3
    public final zh3 a(Class cls) {
        if (ox2.class.isAssignableFrom(cls)) {
            try {
                return (zh3) ox2.b(cls.asSubclass(ox2.class)).m(3);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // defpackage.ui3
    public final boolean b(Class cls) {
        return ox2.class.isAssignableFrom(cls);
    }
}