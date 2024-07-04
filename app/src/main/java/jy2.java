package defpackage;

import java.io.IOException;

/* renamed from: jy2  reason: default package */
public class jy2 extends IOException {
    public final boolean P;
    public final int Q;

    public jy2(String str, RuntimeException runtimeException, boolean z, int i) {
        super(str, runtimeException);
        this.P = z;
        this.Q = i;
    }

    public static jy2 a(String str, ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
        return new jy2(str, arrayIndexOutOfBoundsException, true, 1);
    }

    public static jy2 b(String str) {
        return new jy2(str, null, false, 1);
    }
}