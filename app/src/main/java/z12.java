package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/* renamed from: z12  reason: default package */
public final class z12 {
    public final l02 a;
    public final String b;
    public final String c;
    public final Class[] e;
    public volatile Method d = null;
    public final CountDownLatch f = new CountDownLatch(1);

    public z12(l02 l02Var, String str, String str2, Class... clsArr) {
        this.a = l02Var;
        this.b = str;
        this.c = str2;
        this.e = clsArr;
        l02Var.b.submit(new j02(1, this));
    }
}