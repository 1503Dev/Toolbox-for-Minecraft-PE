package io.mrarm.mctoolbox.ui;

import android.content.ClipData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class c {

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends b {
        public a(String str, ze zeVar) {
            super(str, zeVar);
            Iterator<Map.Entry<String, tv0<?>>> it = zeVar.iterator();
            while (it.hasNext()) {
                Map.Entry<String, tv0<?>> next = it.next();
                this.c.add(c.a(next.getKey(), next.getValue()));
            }
        }

        @Override // io.mrarm.mctoolbox.ui.c.b, io.mrarm.mctoolbox.ui.c.d
        public final tv0 b() {
            ze zeVar = new ze();
            Iterator<T> it = this.c.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                zeVar.x(dVar.a.Q, dVar.b());
            }
            return zeVar;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends d {
        public final androidx.databinding.f c;
        public final ya0 d;

        public b(String str, b20<tv0<?>> b20Var) {
            super(str, b20Var);
            this.c = new androidx.databinding.f();
            this.d = new ya0(true);
            Iterator<tv0<?>> it = b20Var.iterator();
            while (it.hasNext()) {
                this.c.add(c.a(null, it.next()));
            }
        }

        public b(String str, tv0 tv0Var) {
            super(str, tv0Var);
            this.c = new androidx.databinding.f();
            this.d = new ya0(true);
        }

        @Override // io.mrarm.mctoolbox.ui.c.d
        public tv0 b() {
            if (((b20) this.b).B() == wo.class && this.c.size() == 0) {
                return new b20();
            }
            b20 b20Var = new b20(((b20) this.b).B());
            Iterator<T> it = this.c.iterator();
            while (it.hasNext()) {
                b20Var.w(((d) it.next()).b());
            }
            return b20Var;
        }

        public final void c(d dVar) {
            this.c.add(dVar);
            tv0 tv0Var = this.b;
            if (tv0Var instanceof b20) {
                Class<?> B = ((b20) tv0Var).B();
                if (B == null || B == wo.class) {
                    this.b = new b20(dVar.b.getClass());
                }
            }
        }
    }

    /* renamed from: io.mrarm.mctoolbox.ui.c$c  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class C0038c extends d {
        public static final HashMap e;
        public final a c;
        public String d;

        /* renamed from: io.mrarm.mctoolbox.ui.c$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a<T extends tv0> {
            public final int a;
            public final b<T> b;
            public final InterfaceC0039a<T> c;

            /* renamed from: io.mrarm.mctoolbox.ui.c$c$a$a  reason: collision with other inner class name */
            /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
            public interface InterfaceC0039a<T extends tv0> {
                T a(String str);
            }

            /* renamed from: io.mrarm.mctoolbox.ui.c$c$a$b */
            /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
            public interface b<T extends tv0> {
                String a(T t);
            }

            public a(int i, InterfaceC0039a<T> interfaceC0039a) {
                this.a = i;
                this.b = new f80();
                this.c = interfaceC0039a;
            }

            public a(a80 a80Var, ij ijVar) {
                this.a = 2131230881;
                this.b = a80Var;
                this.c = ijVar;
            }
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [a80] */
        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put(gu0.class, new a((a80) new a.b() { // from class: a80
                @Override // io.mrarm.mctoolbox.ui.c.C0038c.a.b
                public String a(tv0 tv0Var) {
                    return (String) ((gu0) tv0Var).P;
                }
            }, new ij()));
            hashMap.put(gb.class, new a(2131230874, new bx()));
            hashMap.put(rr0.class, new a(2131230880, new a.InterfaceC0039a() { // from class: b80
                @Override // io.mrarm.mctoolbox.ui.c.C0038c.a.InterfaceC0039a
                public final tv0 a(String str) {
                    return new rr0(Short.parseShort(str));
                }
            }));
            hashMap.put(yx.class, new a(2131230877, new a.InterfaceC0039a() { // from class: c80
                @Override // io.mrarm.mctoolbox.ui.c.C0038c.a.InterfaceC0039a
                public final tv0 a(String str) {
                    return new yx(Integer.parseInt(str));
                }
            }));
            hashMap.put(e30.class, new a(2131230878, new qq()));
            hashMap.put(jq.class, new a(2131230876, new a.InterfaceC0039a() { // from class: d80
                @Override // io.mrarm.mctoolbox.ui.c.C0038c.a.InterfaceC0039a
                public final tv0 a(String str) {
                    return new jq(Float.parseFloat(str));
                }
            }));
            hashMap.put(am.class, new a(2131230875, new e80()));
        }

        public C0038c(String str, a aVar, tv0 tv0Var) {
            super(str, tv0Var);
            this.c = aVar;
            this.d = aVar.b.a(tv0Var);
        }

        @Override // io.mrarm.mctoolbox.ui.c.d
        public final int a() {
            return this.c.a;
        }

        @Override // io.mrarm.mctoolbox.ui.c.d
        public final tv0 b() {
            try {
                return this.c.c.a(this.d);
            } catch (Exception unused) {
                return this.b;
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public za0<String> a;
        public tv0 b;

        public d(String str, tv0 tv0Var) {
            this.a = new za0<>(str);
            this.b = tv0Var;
        }

        public int a() {
            return 2131230872;
        }

        public tv0 b() {
            return this.b;
        }
    }

    public static d a(String str, tv0 tv0Var) {
        if (tv0Var instanceof b20) {
            return new b(str, (b20<tv0<?>>) tv0Var);
        }
        if (tv0Var instanceof ze) {
            return new a(str, (ze) tv0Var);
        }
        C0038c.a aVar = (C0038c.a) C0038c.e.get(tv0Var.getClass());
        if (aVar != null) {
            return new C0038c(str, aVar, tv0Var);
        }
        return new d(str, tv0Var);
    }

    public static String b(ClipData clipData, String str) {
        for (int i = 0; i < clipData.getItemCount(); i++) {
            if (clipData.getDescription().getMimeTypeCount() > i && clipData.getDescription().getMimeType(i).equals(str)) {
                CharSequence text = clipData.getItemAt(i).getText();
                if (text != null) {
                    return text.toString();
                }
                return null;
            }
        }
        return null;
    }
}