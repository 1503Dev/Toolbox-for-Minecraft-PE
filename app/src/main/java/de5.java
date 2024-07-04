package defpackage;

/* renamed from: de5  reason: default package */
public final class de5 implements mf5 {
    public static final de5 a = new de5();

    @Override // defpackage.mf5
    public final lf5 a(Class cls) {
        if (ie5.class.isAssignableFrom(cls)) {
            try {
                return (lf5) ie5.h(cls.asSubclass(ie5.class)).t(3, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // defpackage.mf5
    public final boolean b(Class cls) {
        return ie5.class.isAssignableFrom(cls);
    }
}