package defpackage;

/* renamed from: fk0  reason: default package */
public final class fk0 {
    public static final hk0 a;

    static {
        hk0 hk0Var = null;
        try {
            hk0Var = (hk0) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (hk0Var == null) {
            hk0Var = new hk0();
        }
        a = hk0Var;
    }
}