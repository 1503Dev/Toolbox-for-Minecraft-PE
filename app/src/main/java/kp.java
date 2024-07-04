package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: kp  reason: default package */
public final class kp implements m11, Cloneable {
    public static final kp U = new kp();
    public double P = -1.0d;
    public int Q = 136;
    public boolean R = true;
    public List<lp> S = Collections.emptyList();
    public List<lp> T = Collections.emptyList();

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: kp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a<T> extends l11<T> {
        public l11<T> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ xt d;
        public final /* synthetic */ u11 e;

        public a(boolean z, boolean z2, xt xtVar, u11 u11Var) {
            this.b = z;
            this.c = z2;
            this.d = xtVar;
            this.e = u11Var;
        }

        @Override // defpackage.l11
        public final T a(c00 c00Var) {
            if (this.b) {
                c00Var.Z();
                return null;
            }
            l11<T> l11Var = this.a;
            if (l11Var == null) {
                l11Var = this.d.g(kp.this, this.e);
                this.a = l11Var;
            }
            return l11Var.a(c00Var);
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, T t) {
            if (this.c) {
                i00Var.H();
                return;
            }
            l11<T> l11Var = this.a;
            if (l11Var == null) {
                l11Var = this.d.g(kp.this, this.e);
                this.a = l11Var;
            }
            l11Var.b(i00Var, t);
        }
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        boolean z;
        boolean z2;
        Class<? super T> cls = u11Var.a;
        boolean b = b(cls);
        if (!b && !c(cls, true)) {
            z = false;
        } else {
            z = true;
        }
        if (!b && !c(cls, false)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z && !z2) {
            return null;
        }
        return new a(z2, z, xtVar, u11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Class<?> cls) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.P != -1.0d && !d((bt0) cls.getAnnotation(bt0.class), (u21) cls.getAnnotation(u21.class))) {
            return true;
        }
        if (!this.R) {
            if (cls.isMemberClass()) {
                if ((cls.getModifiers() & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z2 = true;
                    if (z2) {
                        return true;
                    }
                }
            }
            z2 = false;
            if (z2) {
            }
        }
        if (!Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass())) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final boolean c(Class<?> cls, boolean z) {
        for (lp lpVar : z ? this.S : this.T) {
            if (lpVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (kp) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean d(bt0 bt0Var, u21 u21Var) {
        boolean z;
        boolean z2;
        if (bt0Var != null && bt0Var.value() > this.P) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (u21Var != null && u21Var.value() <= this.P) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return false;
        }
        return true;
    }
}