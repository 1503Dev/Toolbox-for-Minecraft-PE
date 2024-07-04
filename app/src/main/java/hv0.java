package defpackage;

import android.database.Cursor;

/* renamed from: hv0  reason: default package */
public final class hv0 implements gv0 {
    public final bm0 a;
    public final a b;
    public final b c;

    /* renamed from: hv0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<fv0> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        @Override // defpackage.yo
        public final void d(is isVar, fv0 fv0Var) {
            fv0 fv0Var2 = fv0Var;
            String str = fv0Var2.a;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            isVar.g(fv0Var2.b, 2);
        }
    }

    /* renamed from: hv0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends qr0 {
        public b(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public hv0(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
        this.c = new b(bm0Var);
    }

    public final fv0 a(String str) {
        em0 a2 = em0.a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        fv0 fv0Var = null;
        Cursor g = this.a.g(a2);
        try {
            int i = ea2.i(g, "work_spec_id");
            int i2 = ea2.i(g, "system_id");
            if (g.moveToFirst()) {
                fv0Var = new fv0(g.getString(i), g.getInt(i2));
            }
            return fv0Var;
        } finally {
            g.close();
            a2.F();
        }
    }

    public final void b(fv0 fv0Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(fv0Var);
            this.a.h();
        } finally {
            this.a.f();
        }
    }

    public final void c(String str) {
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
}