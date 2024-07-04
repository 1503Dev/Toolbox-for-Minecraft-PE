package defpackage;

import android.content.Context;
import android.os.Handler;
import defpackage.mz0;
import defpackage.xs0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: me  reason: default package */
public abstract class me {
    public final Handler a;
    public final UUID b;
    public String e;
    public float f;
    public float g;
    public float h;
    public final ya0 k;
    public final c l;
    public final ya0 m;
    public final je n;
    public final ArrayList o;
    public final za0<String> c = new za0<>();
    public final za0<String> d = new za0<>();
    public b i = b.Single;
    public int j = 1;

    /* renamed from: me$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends l11<me> {
        public static final xt b = pr0.a;
        public final wv a;

        public a(wv wvVar) {
            this.a = wvVar;
        }

        @Override // defpackage.l11
        public final me a(c00 c00Var) {
            Object c;
            xt xtVar = b;
            zz zzVar = (zz) xtVar.c(c00Var, zz.class);
            try {
                hy0 a = ((xz0) this.a).a(UUID.fromString(zzVar.r("uuid").q()));
                a.c.H(zzVar.r("name").q());
                String str = a.c.Q;
                if (str != null && str.length() != 0) {
                    if (zzVar.s("iconName")) {
                        a.d.H(zzVar.r("iconName").q());
                    }
                    if (zzVar.s("commandSet")) {
                        a.e = zzVar.r("commandSet").q();
                    }
                    if (zzVar.s("teleportPos")) {
                        qz n = zzVar.r("teleportPos").n();
                        a.f = n.r(0).h();
                        a.g = n.r(1).h();
                        a.h = n.r(2).h();
                    }
                    if (zzVar.s("mode")) {
                        a.i = b.valueOf(zzVar.r("mode").q());
                    }
                    if (zzVar.s("repeatInterval")) {
                        a.j = zzVar.r("repeatInterval").m();
                    }
                    if (zzVar.s("shortcut")) {
                        zz o = zzVar.r("shortcut").o();
                        if (o.s("button")) {
                            mz0.a aVar = a.q.f;
                            wz r = o.r("button");
                            if (r == null) {
                                c = null;
                            } else {
                                c = xtVar.c(new g00(r), mz0.a.class);
                            }
                            mz0.a aVar2 = (mz0.a) ar.n(mz0.a.class).cast(c);
                            aVar.getClass();
                            if (aVar2 != null) {
                                aVar.a = aVar2.a;
                                aVar.b = aVar2.b;
                            }
                        }
                        if (o.s("enabled")) {
                            a.k.H(o.r("enabled").g());
                        }
                    }
                    return a;
                }
                throw new IllegalArgumentException("Name can not be empty");
            } catch (IllegalArgumentException e) {
                throw new a00(e);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, me meVar) {
            me meVar2 = meVar;
            i00Var.g();
            i00Var.F("uuid");
            i00Var.O(meVar2.b.toString());
            i00Var.F("name");
            i00Var.O(meVar2.c.Q);
            i00Var.F("iconName");
            i00Var.O(meVar2.d.Q);
            if (meVar2.i == b.Teleport) {
                i00Var.F("teleportPos");
                i00Var.d();
                i00Var.K(meVar2.f);
                i00Var.K(meVar2.g);
                i00Var.K(meVar2.h);
                i00Var.y();
            } else {
                i00Var.F("commandSet");
                i00Var.O(meVar2.e);
            }
            i00Var.F("mode");
            i00Var.O(meVar2.i.toString());
            if (meVar2.i == b.Repeat) {
                i00Var.F("repeatInterval");
                i00Var.L(meVar2.j);
            }
            i00Var.F("shortcut");
            i00Var.g();
            i00Var.F("enabled");
            i00Var.P(meVar2.k.Q);
            xt xtVar = b;
            i00Var.F("button");
            xtVar.k(((hy0) meVar2).q.f, mz0.a.class, i00Var);
            i00Var.E();
            i00Var.E();
        }
    }

    /* renamed from: me$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public enum b {
        Single,
        Repeat,
        Teleport
    }

    /* renamed from: me$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements lw {
        public me a;

        public c(me meVar) {
            this.a = meVar;
        }

        @Override // defpackage.lw
        public final ya0 a() {
            return this.a.m;
        }

        @Override // defpackage.lw
        public final int b(Context context) {
            return context.getResources().getColor(2131099863);
        }

        @Override // defpackage.lw
        public final int c(Context context) {
            return n42.g(context, this.a.d.Q);
        }

        @Override // defpackage.lw
        public final void d() {
            this.a.d();
        }

        @Override // defpackage.lw
        public final String e(Context context) {
            return null;
        }

        @Override // defpackage.lw
        public final String getId() {
            return null;
        }
    }

    public me(UUID uuid, final Handler handler) {
        ya0 ya0Var = new ya0();
        this.k = ya0Var;
        this.l = new c(this);
        ya0 ya0Var2 = new ya0();
        this.m = ya0Var2;
        this.n = new je(0, this);
        this.o = new ArrayList();
        this.b = uuid;
        this.a = handler;
        ya0Var2.a(new xs0(new xs0.a() { // from class: ke
            @Override // defpackage.xs0.a
            public final void a() {
                int i;
                me meVar = me.this;
                Handler handler2 = handler;
                if (meVar.m.Q) {
                    je jeVar = meVar.n;
                    int i2 = meVar.j;
                    if (i2 < 0) {
                        i = 1000 / (-i2);
                    } else {
                        i = i2 * 1000;
                    }
                    handler2.postDelayed(jeVar, i);
                    return;
                }
                handler2.removeCallbacks(meVar.n);
            }
        }));
        ya0Var.a(new xs0(new le(0, this)));
    }

    public abstract void a();

    public final void b() {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public void c() {
        this.m.H(false);
    }

    public final void d() {
        b bVar = this.i;
        if (bVar != b.Single && bVar != b.Teleport) {
            if (bVar == b.Repeat) {
                ya0 ya0Var = this.m;
                ya0Var.H(!ya0Var.Q);
                return;
            }
            return;
        }
        a();
    }
}