package defpackage;

import android.database.Cursor;

/* renamed from: xf0  reason: default package */
public final class xf0 implements wf0 {
    public final bm0 a;
    public final a b;

    /* renamed from: xf0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<vf0> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        @Override // defpackage.yo
        public final void d(is isVar, vf0 vf0Var) {
            vf0 vf0Var2 = vf0Var;
            String str = vf0Var2.a;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            Long l = vf0Var2.b;
            if (l == null) {
                isVar.t(2);
            } else {
                isVar.g(l.longValue(), 2);
            }
        }
    }

    public xf0(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
    }

    public final Long a(String str) {
        em0 a2 = em0.a(1, "SELECT long_value FROM Preference where `key`=?");
        a2.E(1, str);
        this.a.b();
        Long l = null;
        Cursor g = this.a.g(a2);
        try {
            if (g.moveToFirst() && !g.isNull(0)) {
                l = Long.valueOf(g.getLong(0));
            }
            return l;
        } finally {
            g.close();
            a2.F();
        }
    }

    public final void b(vf0 vf0Var) {
        this.a.b();
        this.a.c();
        try {
            this.b.e(vf0Var);
            this.a.h();
        } finally {
            this.a.f();
        }
    }
}