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
/* renamed from: hg4  reason: default package */
public final class hg4 {
    public static final /* synthetic */ hg4[] Q;
    public final fh4 P;
    /* JADX INFO: Fake field, exist only in values array */
    hg4 EF0;
    /* JADX INFO: Fake field, exist only in values array */
    hg4 EF1;
    /* JADX INFO: Fake field, exist only in values array */
    hg4 EF2;

    static {
        hg4 hg4Var = new hg4("DOUBLE", 0, fh4.T);
        hg4 hg4Var2 = new hg4("FLOAT", 1, fh4.S);
        fh4 fh4Var = fh4.R;
        hg4 hg4Var3 = new hg4("INT64", 2, fh4Var);
        hg4 hg4Var4 = new hg4("UINT64", 3, fh4Var);
        fh4 fh4Var2 = fh4.Q;
        hg4 hg4Var5 = new hg4("INT32", 4, fh4Var2);
        hg4 hg4Var6 = new hg4("FIXED64", 5, fh4Var);
        hg4 hg4Var7 = new hg4("FIXED32", 6, fh4Var2);
        hg4 hg4Var8 = new hg4("BOOL", 7, fh4.U);
        hg4 hg4Var9 = new hg4("STRING", 8, fh4.V);
        fh4 fh4Var3 = fh4.Y;
        Q = new hg4[]{hg4Var, hg4Var2, hg4Var3, hg4Var4, hg4Var5, hg4Var6, hg4Var7, hg4Var8, hg4Var9, new hg4("GROUP", 9, fh4Var3), new hg4("MESSAGE", 10, fh4Var3), new hg4("BYTES", 11, fh4.W), new hg4("UINT32", 12, fh4Var2), new hg4("ENUM", 13, fh4.X), new hg4("SFIXED32", 14, fh4Var2), new hg4("SFIXED64", 15, fh4Var), new hg4("SINT32", 16, fh4Var2), new hg4("SINT64", 17, fh4Var)};
    }

    public hg4(String str, int i, fh4 fh4Var) {
        this.P = fh4Var;
    }

    public static hg4[] values() {
        return (hg4[]) Q.clone();
    }
}