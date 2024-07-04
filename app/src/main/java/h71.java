package defpackage;

/* renamed from: h71  reason: default package */
public final class h71 implements g71 {
    public final bm0 a;
    public final a b;
    public final b c;
    public final c d;

    /* renamed from: h71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<f71> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        @Override // defpackage.yo
        public final void d(is isVar, f71 f71Var) {
            f71 f71Var2 = f71Var;
            String str = f71Var2.a;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            byte[] b = androidx.work.b.b(f71Var2.b);
            if (b == null) {
                isVar.t(2);
            } else {
                isVar.a(b, 2);
            }
        }
    }

    /* renamed from: h71$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends qr0 {
        public b(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: h71$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends qr0 {
        public c(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public h71(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
        this.c = new b(bm0Var);
        this.d = new c(bm0Var);
    }

    public final void a(String str) {
        this.a.b();
        is a2 = this.c.a();
        if (str == null) {
            a2.t(1);
        } else {
            a2.y(1, str);
        }
        this.a.c();
        try {
            a2.E();
            this.a.h();
        } finally {
            this.a.f();
            this.c.c(a2);
        }
    }

    public final void b() {
        this.a.b();
        is a2 = this.d.a();
        this.a.c();
        try {
            a2.E();
            this.a.h();
        } finally {
            this.a.f();
            this.d.c(a2);
        }
    }
}