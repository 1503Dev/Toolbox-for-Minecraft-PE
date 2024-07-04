package defpackage;

/* renamed from: pz  reason: default package */
public final class pz implements m11 {
    public final vf P;

    public pz(vf vfVar) {
        this.P = vfVar;
    }

    public static l11 b(vf vfVar, xt xtVar, u11 u11Var, oz ozVar) {
        d00 d00Var;
        l11 e11Var;
        Object d = vfVar.a(new u11(ozVar.value())).d();
        if (d instanceof l11) {
            e11Var = (l11) d;
        } else if (d instanceof m11) {
            e11Var = ((m11) d).a(xtVar, u11Var);
        } else {
            boolean z = d instanceof d00;
            if (!z && !(d instanceof vz)) {
                StringBuilder b = e5.b("Invalid attempt to bind an instance of ");
                b.append(d.getClass().getName());
                b.append(" as a @JsonAdapter for ");
                b.append(u11Var.toString());
                b.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(b.toString());
            }
            vz vzVar = null;
            if (z) {
                d00Var = (d00) d;
            } else {
                d00Var = null;
            }
            if (d instanceof vz) {
                vzVar = (vz) d;
            }
            e11Var = new e11(d00Var, vzVar, xtVar, u11Var, null);
        }
        if (e11Var != null && ozVar.nullSafe()) {
            return new k11(e11Var);
        }
        return e11Var;
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        oz ozVar = (oz) u11Var.a.getAnnotation(oz.class);
        if (ozVar == null) {
            return null;
        }
        return b(this.P, xtVar, u11Var, ozVar);
    }
}