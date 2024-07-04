package defpackage;

/* renamed from: e3  reason: default package */
public final class e3 {
    public final dd0 a;
    public final dd0 b;
    public final boolean c;
    public final xg d;
    public final dx e;

    public e3(xg xgVar, dd0 dd0Var) {
        dx dxVar = dx.BEGIN_TO_RENDER;
        dd0 dd0Var2 = dd0.NATIVE;
        this.d = xgVar;
        this.e = dxVar;
        this.a = dd0Var2;
        if (dd0Var == null) {
            this.b = dd0.NONE;
        } else {
            this.b = dd0Var;
        }
        this.c = false;
    }

    public static e3 a(xg xgVar, dd0 dd0Var) {
        if (xgVar != xg.DEFINED_BY_JAVASCRIPT) {
            return new e3(xgVar, dd0Var);
        }
        throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
    }
}