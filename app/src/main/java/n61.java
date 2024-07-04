package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import defpackage.a41;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* renamed from: n61  reason: default package */
public final class n61 {
    public final k a;

    /* renamed from: n61$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static Field a;
        public static Field b;
        public static Field c;
        public static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder b2 = e5.b("Failed to get visible insets from AttachInfo ");
                b2.append(e.getMessage());
                Log.w("WindowInsetsCompat", b2.toString(), e);
            }
        }
    }

    /* renamed from: n61$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends e {
        public static Field d = null;
        public static boolean e = false;
        public static Constructor<WindowInsets> f = null;
        public static boolean g = false;
        public WindowInsets b;
        public tx c;

        public b() {
            this.b = e();
        }

        public b(n61 n61Var) {
            super(n61Var);
            this.b = n61Var.b();
        }

        private static WindowInsets e() {
            if (!e) {
                try {
                    d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                e = true;
            }
            Field field = d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!g) {
                try {
                    f = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                g = true;
            }
            Constructor<WindowInsets> constructor = f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // defpackage.n61.e
        public n61 b() {
            a();
            n61 c = n61.c(null, this.b);
            c.a.j(null);
            c.a.l(this.c);
            return c;
        }

        @Override // defpackage.n61.e
        public void c(tx txVar) {
            this.c = txVar;
        }

        @Override // defpackage.n61.e
        public void d(tx txVar) {
            WindowInsets windowInsets = this.b;
            if (windowInsets != null) {
                this.b = windowInsets.replaceSystemWindowInsets(txVar.a, txVar.b, txVar.c, txVar.d);
            }
        }
    }

    /* renamed from: n61$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends e {
        public final WindowInsets.Builder b;

        public c() {
            this.b = new WindowInsets.Builder();
        }

        public c(n61 n61Var) {
            super(n61Var);
            WindowInsets b = n61Var.b();
            this.b = b != null ? new WindowInsets.Builder(b) : new WindowInsets.Builder();
        }

        @Override // defpackage.n61.e
        public n61 b() {
            a();
            n61 c = n61.c(null, this.b.build());
            c.a.j(null);
            return c;
        }

        @Override // defpackage.n61.e
        public void c(tx txVar) {
            this.b.setStableInsets(txVar.b());
        }

        @Override // defpackage.n61.e
        public void d(tx txVar) {
            this.b.setSystemWindowInsets(txVar.b());
        }
    }

    /* renamed from: n61$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends c {
        public d() {
        }

        public d(n61 n61Var) {
            super(n61Var);
        }
    }

    /* renamed from: n61$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e {
        public final n61 a;

        public e() {
            this(new n61());
        }

        public e(n61 n61Var) {
            this.a = n61Var;
        }

        public final void a() {
        }

        public n61 b() {
            a();
            return this.a;
        }

        public void c(tx txVar) {
        }

        public void d(tx txVar) {
        }
    }

    /* renamed from: n61$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f extends k {
        public static boolean f = false;
        public static Method g;
        public static Class<?> h;
        public static Class<?> i;
        public static Field j;
        public static Field k;
        public final WindowInsets c;
        public tx d;
        public tx e;

        public f(n61 n61Var, WindowInsets windowInsets) {
            super(n61Var);
            this.d = null;
            this.c = windowInsets;
        }

        private tx m(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f) {
                    n();
                }
                Method method = g;
                if (method != null && i != null && j != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) j.get(k.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return tx.a(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e) {
                        StringBuilder b = e5.b("Failed to get visible insets. (Reflection error). ");
                        b.append(e.getMessage());
                        Log.e("WindowInsetsCompat", b.toString(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        private static void n() {
            try {
                g = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                h = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                i = cls;
                j = cls.getDeclaredField("mVisibleInsets");
                k = h.getDeclaredField("mAttachInfo");
                j.setAccessible(true);
                k.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                StringBuilder b = e5.b("Failed to get visible insets. (Reflection error). ");
                b.append(e.getMessage());
                Log.e("WindowInsetsCompat", b.toString(), e);
            }
            f = true;
        }

        @Override // defpackage.n61.k
        public void d(View view) {
            tx m = m(view);
            if (m == null) {
                m = tx.e;
            }
            o(m);
        }

        @Override // defpackage.n61.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.e, ((f) obj).e);
            }
            return false;
        }

        @Override // defpackage.n61.k
        public final tx g() {
            if (this.d == null) {
                this.d = tx.a(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.d;
        }

        @Override // defpackage.n61.k
        public boolean i() {
            return this.c.isRound();
        }

        @Override // defpackage.n61.k
        public void j(tx[] txVarArr) {
        }

        @Override // defpackage.n61.k
        public void k(n61 n61Var) {
        }

        public void o(tx txVar) {
            this.e = txVar;
        }
    }

    /* renamed from: n61$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g extends f {
        public tx l;

        public g(n61 n61Var, WindowInsets windowInsets) {
            super(n61Var, windowInsets);
            this.l = null;
        }

        @Override // defpackage.n61.k
        public n61 b() {
            WindowInsets consumeStableInsets;
            consumeStableInsets = this.c.consumeStableInsets();
            return n61.c(null, consumeStableInsets);
        }

        @Override // defpackage.n61.k
        public n61 c() {
            return n61.c(null, this.c.consumeSystemWindowInsets());
        }

        @Override // defpackage.n61.k
        public final tx f() {
            int stableInsetRight;
            if (this.l == null) {
                int a = dg.a(this.c);
                int a2 = d4.a(this.c);
                stableInsetRight = this.c.getStableInsetRight();
                this.l = tx.a(a, a2, stableInsetRight, h4.a(this.c));
            }
            return this.l;
        }

        @Override // defpackage.n61.k
        public boolean h() {
            return ra0.d(this.c);
        }

        @Override // defpackage.n61.k
        public void l(tx txVar) {
            this.l = txVar;
        }
    }

    /* renamed from: n61$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends g {
        public h(n61 n61Var, WindowInsets windowInsets) {
            super(n61Var, windowInsets);
        }

        @Override // defpackage.n61.k
        public n61 a() {
            return n61.c(null, gk.b(this.c));
        }

        @Override // defpackage.n61.k
        public yl e() {
            DisplayCutout b = m0.b(this.c);
            if (b == null) {
                return null;
            }
            return new yl(b);
        }

        @Override // defpackage.n61.f, defpackage.n61.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return Objects.equals(this.c, hVar.c) && Objects.equals(this.e, hVar.e);
            }
            return false;
        }

        @Override // defpackage.n61.k
        public int hashCode() {
            return this.c.hashCode();
        }
    }

    /* renamed from: n61$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class i extends h {
        public i(n61 n61Var, WindowInsets windowInsets) {
            super(n61Var, windowInsets);
        }

        @Override // defpackage.n61.g, defpackage.n61.k
        public void l(tx txVar) {
        }
    }

    /* renamed from: n61$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class j extends i {
        public static final /* synthetic */ int m = 0;

        static {
            n61.c(null, WindowInsets.CONSUMED);
        }

        public j(n61 n61Var, WindowInsets windowInsets) {
            super(n61Var, windowInsets);
        }

        @Override // defpackage.n61.f, defpackage.n61.k
        public final void d(View view) {
        }
    }

    /* renamed from: n61$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class k {
        public static final /* synthetic */ int b = 0;
        public final n61 a;

        static {
            e eVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                eVar = new d();
            } else if (i >= 29) {
                eVar = new c();
            } else if (i >= 20) {
                eVar = new b();
            } else {
                eVar = new e();
            }
            eVar.b().a.a().a.b().a.c();
        }

        public k(n61 n61Var) {
            this.a = n61Var;
        }

        public n61 a() {
            return this.a;
        }

        public n61 b() {
            return this.a;
        }

        public n61 c() {
            return this.a;
        }

        public void d(View view) {
        }

        public yl e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (i() == kVar.i() && h() == kVar.h() && Objects.equals(g(), kVar.g()) && Objects.equals(f(), kVar.f()) && Objects.equals(e(), kVar.e())) {
                return true;
            }
            return false;
        }

        public tx f() {
            return tx.e;
        }

        public tx g() {
            return tx.e;
        }

        public boolean h() {
            return false;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(i()), Boolean.valueOf(h()), g(), f(), e());
        }

        public boolean i() {
            return false;
        }

        public void j(tx[] txVarArr) {
        }

        public void k(n61 n61Var) {
        }

        public void l(tx txVar) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            int i2 = j.m;
        } else {
            int i3 = k.b;
        }
    }

    public n61() {
        this.a = new k(this);
    }

    public n61(WindowInsets windowInsets) {
        k fVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            fVar = new j(this, windowInsets);
        } else if (i2 >= 29) {
            fVar = new i(this, windowInsets);
        } else if (i2 >= 28) {
            fVar = new h(this, windowInsets);
        } else if (i2 >= 21) {
            fVar = new g(this, windowInsets);
        } else if (i2 < 20) {
            this.a = new k(this);
            return;
        } else {
            fVar = new f(this, windowInsets);
        }
        this.a = fVar;
    }

    public static n61 c(View view, WindowInsets windowInsets) {
        n61 n61Var;
        windowInsets.getClass();
        n61 n61Var2 = new n61(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 23) {
                n61Var = a41.b.a(view);
            } else if (i2 >= 21) {
                n61Var = a41.a.b(view);
            } else {
                n61Var = null;
            }
            n61Var2.a.k(n61Var);
            n61Var2.a.d(view.getRootView());
        }
        return n61Var2;
    }

    @Deprecated
    public final int a() {
        return this.a.g().b;
    }

    public final WindowInsets b() {
        k kVar = this.a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n61) {
            return Objects.equals(this.a, ((n61) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}