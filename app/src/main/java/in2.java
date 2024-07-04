package defpackage;

/* renamed from: in2  reason: default package */
public final class in2 {
    public static final hm2 a = new hm2();
    public static final gl2 b;

    static {
        gl2 gl2Var;
        try {
            gl2Var = (gl2) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            gl2Var = null;
        }
        b = gl2Var;
    }
}