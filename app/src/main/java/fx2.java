package defpackage;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* renamed from: fx2  reason: default package */
public class fx2 implements wy4, v64 {
    public final Object P;
    public final Object Q;

    public /* synthetic */ fx2() {
        bx2 bx2Var = new bx2();
        this.P = bx2Var;
        this.Q = new AtomicInteger(0);
        zw4.J(bx2Var, new e83(3, this), zw2.f);
    }

    public /* synthetic */ fx2(hk1 hk1Var) {
        this.P = hk1Var;
        this.Q = new AtomicBoolean(false);
    }

    public /* synthetic */ fx2(io5 io5Var, String str) {
        this.P = io5Var;
        this.Q = str;
    }

    public /* synthetic */ fx2(qm4 qm4Var, hm4 hm4Var) {
        this.P = qm4Var;
        this.Q = hm4Var;
    }

    public final lk1 a(Object... objArr) {
        Constructor a;
        synchronized (((AtomicBoolean) this.Q)) {
            if (!((AtomicBoolean) this.Q).get()) {
                try {
                    try {
                        a = ((hk1) this.P).a();
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.Q).set(true);
                }
            }
            a = null;
        }
        if (a == null) {
            return null;
        }
        try {
            return (lk1) a.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    @Deprecated
    public final int b() {
        return ((AtomicInteger) this.Q).get();
    }

    @Deprecated
    public final void c() {
        ((bx2) this.P).c(new Exception());
    }

    @Deprecated
    public final void d(ex2 ex2Var, dx2 dx2Var) {
        zw4.J((bx2) this.P, new jk3(ex2Var, dx2Var), zw2.f);
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        hm4 hm4Var = (hm4) this.Q;
        hm4Var.b(th);
        hm4Var.k0(false);
        ((qm4) this.P).b(hm4Var);
    }
}