package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: qk  reason: default package */
public final class qk implements pk {
    public final bm0 a;
    public final a b;

    /* renamed from: qk$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<ok> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        @Override // defpackage.yo
        public final void d(is isVar, ok okVar) {
            ok okVar2 = okVar;
            String str = okVar2.a;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            String str2 = okVar2.b;
            if (str2 == null) {
                isVar.t(2);
            } else {
                isVar.y(2, str2);
            }
        }
    }

    public qk(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
    }

    public final ArrayList a(String str) {
        em0 a2 = em0.a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        Cursor g = this.a.g(a2);
        try {
            ArrayList arrayList = new ArrayList(g.getCount());
            while (g.moveToNext()) {
                arrayList.add(g.getString(0));
            }
            return arrayList;
        } finally {
            g.close();
            a2.F();
        }
    }

    public final boolean b(String str) {
        boolean z = true;
        em0 a2 = em0.a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a2.y(1);
        } else {
            a2.E(1, str);
        }
        this.a.b();
        Cursor g = this.a.g(a2);
        try {
            boolean z2 = false;
            if (g.moveToFirst()) {
                if (g.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            g.close();
            a2.F();
        }
    }
}