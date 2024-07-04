package defpackage;

import java.util.ArrayList;

/* renamed from: ua0  reason: default package */
public final class ua0 extends l11<Object> {
    public static final a b = new a();
    public final xt a;

    /* renamed from: ua0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements m11 {
        @Override // defpackage.m11
        public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
            if (u11Var.a == Object.class) {
                return new ua0(xtVar);
            }
            return null;
        }
    }

    public ua0(xt xtVar) {
        this.a = xtVar;
    }

    @Override // defpackage.l11
    public final Object a(c00 c00Var) {
        int b2 = cm0.b(c00Var.U());
        if (b2 == 0) {
            ArrayList arrayList = new ArrayList();
            c00Var.a();
            while (c00Var.H()) {
                arrayList.add(a(c00Var));
            }
            c00Var.y();
            return arrayList;
        } else if (b2 == 2) {
            h10 h10Var = new h10();
            c00Var.d();
            while (c00Var.H()) {
                h10Var.put(c00Var.O(), a(c00Var));
            }
            c00Var.E();
            return h10Var;
        } else if (b2 != 5) {
            if (b2 != 6) {
                if (b2 != 7) {
                    if (b2 == 8) {
                        c00Var.Q();
                        return null;
                    }
                    throw new IllegalStateException();
                }
                return Boolean.valueOf(c00Var.K());
            }
            return Double.valueOf(c00Var.L());
        } else {
            return c00Var.S();
        }
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Object obj) {
        if (obj == null) {
            i00Var.H();
            return;
        }
        xt xtVar = this.a;
        Class<?> cls = obj.getClass();
        xtVar.getClass();
        l11 f = xtVar.f(new u11(cls));
        if (f instanceof ua0) {
            i00Var.g();
            i00Var.E();
            return;
        }
        f.b(i00Var, obj);
    }
}