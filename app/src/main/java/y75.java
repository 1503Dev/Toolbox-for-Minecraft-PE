package defpackage;

import java.security.GeneralSecurityException;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: y75  reason: default package */
public final class y75 implements v05 {
    public static final Logger a = Logger.getLogger(y75.class.getName());
    public static final byte[] b = {0};
    public static final y75 c = new y75();

    @Override // defpackage.v05
    public final Class a() {
        return p05.class;
    }

    @Override // defpackage.v05
    public final Object b(u05 u05Var) {
        for (List<r05> list : u05Var.a.values()) {
            for (r05 r05Var : list) {
                ja jaVar = r05Var.g;
                if (jaVar instanceof v75) {
                    v75 v75Var = (v75) jaVar;
                    sc5 a2 = sc5.a(r05Var.a());
                    if (!a2.equals(v75Var.r())) {
                        String valueOf = String.valueOf(v75Var.q());
                        String sc5Var = v75Var.r().toString();
                        throw new GeneralSecurityException(qq.d(sd1.b("Mac Key with parameters ", valueOf, " has wrong output prefix (", sc5Var, ") instead of ("), a2.toString(), ")"));
                    }
                }
            }
        }
        return new x75(u05Var);
    }

    @Override // defpackage.v05
    public final Class c() {
        return p05.class;
    }
}