package defpackage;

import java.security.GeneralSecurityException;
import java.util.List;

/* renamed from: i75  reason: default package */
public final class i75 implements v05 {
    public static final i75 a = new i75();

    @Override // defpackage.v05
    public final Class a() {
        return h75.class;
    }

    @Override // defpackage.v05
    public final Object b(u05 u05Var) {
        if (u05Var.b != null) {
            for (List<r05> list : u05Var.a.values()) {
                for (r05 r05Var : list) {
                    r05Var.getClass();
                }
            }
            return new db3(u05Var);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }

    @Override // defpackage.v05
    public final Class c() {
        return h75.class;
    }
}