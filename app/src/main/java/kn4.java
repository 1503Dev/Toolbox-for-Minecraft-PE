package defpackage;

/* renamed from: kn4  reason: default package */
public final class kn4 {
    public final rn4 a;
    public final rn4 b;
    public final on4 c;
    public final qn4 d;

    public kn4(on4 on4Var, qn4 qn4Var, rn4 rn4Var, rn4 rn4Var2) {
        this.c = on4Var;
        this.d = qn4Var;
        this.a = rn4Var;
        this.b = rn4Var2;
    }

    public static kn4 a(on4 on4Var, qn4 qn4Var, rn4 rn4Var, rn4 rn4Var2) {
        rn4 rn4Var3 = rn4.NATIVE;
        if (rn4Var != rn4.NONE) {
            if (on4Var == on4.DEFINED_BY_JAVASCRIPT && rn4Var == rn4Var3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (qn4Var == qn4.DEFINED_BY_JAVASCRIPT && rn4Var == rn4Var3) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new kn4(on4Var, qn4Var, rn4Var, rn4Var2);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }
}