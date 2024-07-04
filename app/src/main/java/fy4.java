package defpackage;

import java.util.Set;

/* renamed from: fy4  reason: default package */
public abstract class fy4 {
    public final /* synthetic */ int P;

    public /* synthetic */ fy4(int i) {
        this.P = i;
    }

    public static fy4 k(Class cls) {
        return System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik") ? new cj5(cls.getSimpleName()) : new dj5(cls.getSimpleName());
    }

    public abstract int e(iy4 iy4Var);

    public abstract Object f();

    public abstract dz4 g();

    public abstract void h(String str);

    public abstract void i(byte[] bArr, int i, int i2);

    public abstract ld3 j();

    public abstract fy4 l(Object obj);

    public abstract void m(iy4 iy4Var, Set set);

    public abstract zd3 n();

    public abstract qi3 o();

    public final String toString() {
        switch (this.P) {
            case 7:
                return f().toString();
            default:
                return super.toString();
        }
    }
}