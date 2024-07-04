package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: c22  reason: default package */
public abstract class c22 implements Callable {
    public final l02 a;
    public final String b;
    public final String c;
    public final gx1 d;
    public Method e;
    public final int f;
    public final int g;

    public c22(l02 l02Var, String str, String str2, gx1 gx1Var, int i, int i2) {
        this.a = l02Var;
        this.b = str;
        this.c = str2;
        this.d = gx1Var;
        this.f = i;
        this.g = i2;
    }

    public abstract void b();

    public void c() {
        int i;
        try {
            long nanoTime = System.nanoTime();
            Method b = this.a.b(this.b, this.c);
            this.e = b;
            if (b == null) {
                return;
            }
            b();
            mz1 mz1Var = this.a.l;
            if (mz1Var != null && (i = this.f) != Integer.MIN_VALUE) {
                mz1Var.a(this.g, i, (System.nanoTime() - nanoTime) / 1000, null, null);
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        c();
        return null;
    }
}