package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF2 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: eh5  reason: default package */
public final class eh5 {
    public static final /* synthetic */ eh5[] Q;
    public final fh5 P;
    /* JADX INFO: Fake field, exist only in values array */
    eh5 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    eh5 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    eh5 EF2;

    static {
        eh5 eh5Var = new eh5("DOUBLE", 0, fh5.T);
        eh5 eh5Var2 = new eh5("FLOAT", 1, fh5.S);
        fh5 fh5Var = fh5.R;
        eh5 eh5Var3 = new eh5("INT64", 2, fh5Var);
        eh5 eh5Var4 = new eh5("UINT64", 3, fh5Var);
        fh5 fh5Var2 = fh5.Q;
        eh5 eh5Var5 = new eh5("INT32", 4, fh5Var2);
        eh5 eh5Var6 = new eh5("FIXED64", 5, fh5Var);
        eh5 eh5Var7 = new eh5("FIXED32", 6, fh5Var2);
        eh5 eh5Var8 = new eh5("BOOL", 7, fh5.U);
        eh5 eh5Var9 = new eh5("STRING", 8, fh5.V);
        fh5 fh5Var3 = fh5.Y;
        Q = new eh5[]{eh5Var, eh5Var2, eh5Var3, eh5Var4, eh5Var5, eh5Var6, eh5Var7, eh5Var8, eh5Var9, new eh5("GROUP", 9, fh5Var3), new eh5("MESSAGE", 10, fh5Var3), new eh5("BYTES", 11, fh5.W), new eh5("UINT32", 12, fh5Var2), new eh5("ENUM", 13, fh5.X), new eh5("SFIXED32", 14, fh5Var2), new eh5("SFIXED64", 15, fh5Var), new eh5("SINT32", 16, fh5Var2), new eh5("SINT64", 17, fh5Var)};
    }

    public eh5(String str, int i, fh5 fh5Var) {
        this.P = fh5Var;
    }

    public static eh5[] values() {
        return (eh5[]) Q.clone();
    }
}