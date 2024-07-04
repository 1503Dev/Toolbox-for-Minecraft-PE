package defpackage;

/* renamed from: xd5  reason: default package */
public final class xd5 {
    public static final wd5 a = new wd5();
    public static final vd5 b;

    static {
        vd5 vd5Var;
        try {
            vd5Var = (vd5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            vd5Var = null;
        }
        b = vd5Var;
    }
}