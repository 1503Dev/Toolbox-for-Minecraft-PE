package defpackage;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: q71  reason: default package */
public final class q71 implements p71 {
    public final bm0 a;
    public final a b;

    /* renamed from: q71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends yo<o71> {
        public a(bm0 bm0Var) {
            super(bm0Var);
        }

        @Override // defpackage.qr0
        public final String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        @Override // defpackage.yo
        public final void d(is isVar, o71 o71Var) {
            o71 o71Var2 = o71Var;
            String str = o71Var2.a;
            if (str == null) {
                isVar.t(1);
            } else {
                isVar.y(1, str);
            }
            String str2 = o71Var2.b;
            if (str2 == null) {
                isVar.t(2);
            } else {
                isVar.y(2, str2);
            }
        }
    }

    public q71(bm0 bm0Var) {
        this.a = bm0Var;
        this.b = new a(bm0Var);
    }

    public final ArrayList a(String str) {
        em0 a2 = em0.a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
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
}