package io.mrarm.mctoolbox.bridge;

import androidx.databinding.e;
import defpackage.jb0;
import defpackage.r01;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.io.StringReader;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Set;

public final class b implements io.mrarm.mctoolbox.bridge.a {
    public static final xt g = new xt();
    public static final b h = new b();
    public ReferenceQueue<a.InterfaceC0035a> a = new ReferenceQueue<>();
    public HashMap b = new HashMap();
    public final ya0 c;
    public final r01 d;
    private final a.InterfaceC0035a e;
    public final Set<String> f;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends u11<Set<String>> {
    }

    /* renamed from: io.mrarm.mctoolbox.bridge.b$b  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class C0036b extends WeakReference<a.InterfaceC0035a> {
        public String a;

        public C0036b(a.InterfaceC0035a interfaceC0035a, ReferenceQueue<? super a.InterfaceC0035a> referenceQueue, String str) {
            super(interfaceC0035a, referenceQueue);
            this.a = str;
        }

        public final boolean equals(Object obj) {
            a.InterfaceC0035a interfaceC0035a;
            if (obj == this) {
                return true;
            }
            if (obj instanceof C0036b) {
                C0036b c0036b = (C0036b) obj;
                String str = c0036b.a;
                String str2 = this.a;
                return (str == str2 || (str != null && str.equals(str2))) && (interfaceC0035a = get()) != null && interfaceC0035a == c0036b.get();
            }
            return false;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends C0036b {
        public long b;

        public c(a.InterfaceC0035a interfaceC0035a, ReferenceQueue<? super a.InterfaceC0035a> referenceQueue, String str) {
            super(interfaceC0035a, referenceQueue, str);
            b(str);
        }

        public void a() {
            a.InterfaceC0035a interfaceC0035a = get();
            if (interfaceC0035a != null) {
                interfaceC0035a.a();
            }
            b.this.i();
        }

        public void b(String str) {
            this.b = b.x(str, this);
        }

        public void c() {
            b.z(this.b);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends c {
        public d(b bVar, a.InterfaceC0035a interfaceC0035a, ReferenceQueue referenceQueue) {
            super(interfaceC0035a, referenceQueue, null);
        }

        @Override // io.mrarm.mctoolbox.bridge.b.c
        public final void b(String str) {
            this.b = b.y(this);
        }

        @Override // io.mrarm.mctoolbox.bridge.b.c
        public final void c() {
            b.A(this.b);
        }
    }

    public b() {
        Object c2;
        final ya0 ya0Var = new ya0(false);
        this.c = ya0Var;
        final r1 r1Var = new r1();
        r01 r01Var = new r01(ya0Var, new r01.a() { // from class: hb0
            @Override // defpackage.r01.a
            public final boolean a(e eVar) {
                boolean u;
                jb0.a aVar = r1Var;
                ya0 ya0Var2 = (ya0) eVar;
                boolean z = ya0Var.Q;
                ((r1) aVar).getClass();
                u = b.u(z);
                return u;
            }
        });
        this.d = r01Var;
        r01Var.h();
        ya0Var.H(B("internal/premium_unlocked", false));
        a.InterfaceC0035a interfaceC0035a = new a.InterfaceC0035a() { // from class: gz0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                final b bVar = b.this;
                xt xtVar = b.g;
                bVar.getClass();
                h21.a(new Runnable() { // from class: hz0
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.a(b.this);
                    }
                });
            }
        };
        this.e = interfaceC0035a;
        P("internal/premium_unlocked", interfaceC0035a);
        xt xtVar = g;
        String F = F();
        Type type = new a().b;
        xtVar.getClass();
        if (F == null) {
            c2 = null;
        } else {
            c00 c00Var = new c00(new StringReader(F));
            c00Var.Q = xtVar.j;
            c2 = xtVar.c(c00Var, type);
            xt.a(c00Var, c2);
        }
        this.f = (Set) c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void A(long j);

    private static native boolean B(String str, boolean z);

    private static native float C(String str, boolean z);

    private static native int D(String str, boolean z);

    private static native String E(String str, boolean z);

    private static native String F();

    private static native String G();

    private static native String H(String str, boolean z);

    private static native void I(float f);

    private static native void J(String str);

    private static native void K(String str, boolean z);

    private static native void L(String str, float f);

    private static native void M(String str, int i);

    private static native void N(String str, String str2);

    private static native void O(String str, String str2);

    public static void a(b bVar) {
        bVar.c.H(B("internal/premium_unlocked", false));
    }

    public static b o() {
        return h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean u(boolean z) {
        return !z;
    }

    private static native void w(String str, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long x(String str, c cVar);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long y(c cVar);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void z(long j);

    public final void P(String str, a.InterfaceC0035a interfaceC0035a) {
        i();
        c cVar = new c(interfaceC0035a, this.a, str);
        if (cVar.b != 0 && ((c) this.b.put(cVar, cVar)) != null) {
            throw new IllegalStateException();
        }
    }

    public final void Q(a.InterfaceC0035a interfaceC0035a) {
        i();
        d dVar = new d(this, interfaceC0035a, this.a);
        if (dVar.b != 0 && ((c) this.b.put(dVar, dVar)) != null) {
            throw new IllegalStateException();
        }
    }

    public final void R(String str, boolean z) {
        K(str, z);
    }

    public final void S(String str, float f) {
        L(str, f);
    }

    public final void T(int i, String str) {
        M(str, i);
    }

    public final void U(String str, String str2) {
        O(str, str2);
    }

    public final void V(String str, String[] strArr) {
        N(str, g.i(strArr));
    }

    public final void W(String str, a.InterfaceC0035a interfaceC0035a) {
        c cVar = (c) this.b.remove(new C0036b(interfaceC0035a, null, str));
        if (cVar != null) {
            cVar.c();
            cVar.enqueue();
        }
        i();
    }

    public final void X(a.InterfaceC0035a interfaceC0035a) {
        c cVar = (c) this.b.remove(new C0036b(interfaceC0035a, null, null));
        if (cVar != null) {
            cVar.c();
            cVar.enqueue();
        }
        i();
    }

    public final void h(String str, boolean z) {
        w(str, z);
    }

    public final void i() {
        while (true) {
            c cVar = (c) this.a.poll();
            if (cVar == null) {
                return;
            }
            this.b.remove(cVar);
        }
    }

    public final boolean j(String str) {
        return B(str, false);
    }

    public final boolean k(String str) {
        if (this.f.contains(str) && !this.c.Q) {
            return B(str, true);
        }
        return B(str, false);
    }

    public final boolean l(String str) {
        return B(str, true);
    }

    public final float m() {
        return C("minimap/size", true);
    }

    public final float n(String str) {
        return C(str, false);
    }

    public final int p(String str) {
        return D(str, false);
    }

    public final String q() {
        return G();
    }

    public final String r(String str) {
        return H(str, false);
    }

    public final String[] s(String str) {
        try {
            return (String[]) g.e(String[].class, E(str, false));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public final void t() {
        I(900.0f);
    }

    public final void v(String str) {
        J(str);
    }
}