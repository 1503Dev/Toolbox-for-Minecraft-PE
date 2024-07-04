package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ud1  reason: default package */
public final class ud1 {
    public final int a;
    public final ArrayList b = new ArrayList();

    /* renamed from: ud1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final String a;
        public final String b;
        public final int c;
        public final String[] d;
        public final String[] e;
        public final ArrayList f = new ArrayList();
        public final ArrayList g = new ArrayList();
        public final d h;
        public final HashMap i;

        public a(ic1 ic1Var) {
            String[] strArr;
            String[] strArr2;
            d dVar;
            this.a = ic1Var.h("stream");
            this.b = ic1Var.h("table_name");
            this.c = ic1Var.a(10000, "max_rows");
            nr m = ic1Var.m("event_types");
            if (m != null) {
                strArr = eb1.k(m);
            } else {
                strArr = new String[0];
            }
            this.d = strArr;
            nr m2 = ic1Var.m("request_types");
            if (m2 != null) {
                strArr2 = eb1.k(m2);
            } else {
                strArr2 = new String[0];
            }
            this.e = strArr2;
            for (ic1 ic1Var2 : ic1Var.g("columns").f()) {
                this.f.add(new b(ic1Var2));
            }
            for (ic1 ic1Var3 : ic1Var.g("indexes").f()) {
                this.g.add(new c(ic1Var3, this.b));
            }
            ic1 o = ic1Var.o("ttl");
            if (o != null) {
                dVar = new d(o);
            } else {
                dVar = null;
            }
            this.h = dVar;
            this.i = ic1Var.n("queries").i();
        }
    }

    /* renamed from: ud1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final String a;
        public final String b;
        public final Object c;

        public b(ic1 ic1Var) {
            this.a = ic1Var.h("name");
            this.b = ic1Var.h("type");
            this.c = ic1Var.p("default");
        }
    }

    /* renamed from: ud1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public final String a;
        public final String[] b;

        public c(ic1 ic1Var, String str) {
            StringBuilder c = yg.c(str, "_");
            c.append(ic1Var.h("name"));
            this.a = c.toString();
            this.b = eb1.k(ic1Var.g("columns"));
        }
    }

    /* renamed from: ud1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public final long a;
        public final String b;

        public d(ic1 ic1Var) {
            long j;
            synchronized (ic1Var.a) {
                j = ic1Var.a.getLong("seconds");
            }
            this.a = j;
            this.b = ic1Var.h("column");
        }
    }

    public ud1(ic1 ic1Var) {
        this.a = ic1Var.d("version");
        for (ic1 ic1Var2 : ic1Var.g("streams").f()) {
            this.b.add(new a(ic1Var2));
        }
    }
}