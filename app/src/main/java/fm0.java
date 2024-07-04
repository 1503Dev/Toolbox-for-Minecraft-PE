package defpackage;

/* renamed from: fm0  reason: default package */
public final class fm0 {
    public static fm0 b;
    public static final gm0 c = new gm0(0, false, false, 0, 0);
    public gm0 a;

    public static synchronized fm0 a() {
        fm0 fm0Var;
        synchronized (fm0.class) {
            if (b == null) {
                b = new fm0();
            }
            fm0Var = b;
        }
        return fm0Var;
    }
}