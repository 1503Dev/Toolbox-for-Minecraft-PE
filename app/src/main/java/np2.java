package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum EF6 uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: np2  reason: default package */
public final class np2 {
    public static final np2 Q;
    public static final np2 R;
    public static final np2[] S;
    public static final /* synthetic */ np2[] T;
    public final int P;
    /* JADX INFO: Fake field, exist only in values array */
    np2 EF6;

    static {
        d43 d43Var = d43.DOUBLE;
        np2 np2Var = new np2("DOUBLE", 0, 0, 1, d43Var);
        d43 d43Var2 = d43.FLOAT;
        np2 np2Var2 = new np2("FLOAT", 1, 1, 1, d43Var2);
        d43 d43Var3 = d43.LONG;
        np2 np2Var3 = new np2("INT64", 2, 2, 1, d43Var3);
        np2 np2Var4 = new np2("UINT64", 3, 3, 1, d43Var3);
        d43 d43Var4 = d43.INT;
        np2 np2Var5 = new np2("INT32", 4, 4, 1, d43Var4);
        np2 np2Var6 = new np2("FIXED64", 5, 5, 1, d43Var3);
        np2 np2Var7 = new np2("FIXED32", 6, 6, 1, d43Var4);
        d43 d43Var5 = d43.BOOLEAN;
        np2 np2Var8 = new np2("BOOL", 7, 7, 1, d43Var5);
        d43 d43Var6 = d43.STRING;
        np2 np2Var9 = new np2("STRING", 8, 8, 1, d43Var6);
        d43 d43Var7 = d43.MESSAGE;
        np2 np2Var10 = new np2("MESSAGE", 9, 9, 1, d43Var7);
        d43 d43Var8 = d43.BYTE_STRING;
        np2 np2Var11 = new np2("BYTES", 10, 10, 1, d43Var8);
        np2 np2Var12 = new np2("UINT32", 11, 11, 1, d43Var4);
        d43 d43Var9 = d43.ENUM;
        np2 np2Var13 = new np2("ENUM", 12, 12, 1, d43Var9);
        np2 np2Var14 = new np2("SFIXED32", 13, 13, 1, d43Var4);
        np2 np2Var15 = new np2("SFIXED64", 14, 14, 1, d43Var3);
        np2 np2Var16 = new np2("SINT32", 15, 15, 1, d43Var4);
        np2 np2Var17 = new np2("SINT64", 16, 16, 1, d43Var3);
        np2 np2Var18 = new np2("GROUP", 17, 17, 1, d43Var7);
        np2 np2Var19 = new np2("DOUBLE_LIST", 18, 18, 2, d43Var);
        np2 np2Var20 = new np2("FLOAT_LIST", 19, 19, 2, d43Var2);
        np2 np2Var21 = new np2("INT64_LIST", 20, 20, 2, d43Var3);
        np2 np2Var22 = new np2("UINT64_LIST", 21, 21, 2, d43Var3);
        np2 np2Var23 = new np2("INT32_LIST", 22, 22, 2, d43Var4);
        np2 np2Var24 = new np2("FIXED64_LIST", 23, 23, 2, d43Var3);
        np2 np2Var25 = new np2("FIXED32_LIST", 24, 24, 2, d43Var4);
        np2 np2Var26 = new np2("BOOL_LIST", 25, 25, 2, d43Var5);
        np2 np2Var27 = new np2("STRING_LIST", 26, 26, 2, d43Var6);
        np2 np2Var28 = new np2("MESSAGE_LIST", 27, 27, 2, d43Var7);
        np2 np2Var29 = new np2("BYTES_LIST", 28, 28, 2, d43Var8);
        np2 np2Var30 = new np2("UINT32_LIST", 29, 29, 2, d43Var4);
        np2 np2Var31 = new np2("ENUM_LIST", 30, 30, 2, d43Var9);
        np2 np2Var32 = new np2("SFIXED32_LIST", 31, 31, 2, d43Var4);
        np2 np2Var33 = new np2("SFIXED64_LIST", 32, 32, 2, d43Var3);
        np2 np2Var34 = new np2("SINT32_LIST", 33, 33, 2, d43Var4);
        np2 np2Var35 = new np2("SINT64_LIST", 34, 34, 2, d43Var3);
        np2 np2Var36 = new np2("DOUBLE_LIST_PACKED", 35, 35, 3, d43Var);
        Q = np2Var36;
        np2 np2Var37 = new np2("FLOAT_LIST_PACKED", 36, 36, 3, d43Var2);
        np2 np2Var38 = new np2("INT64_LIST_PACKED", 37, 37, 3, d43Var3);
        np2 np2Var39 = new np2("UINT64_LIST_PACKED", 38, 38, 3, d43Var3);
        np2 np2Var40 = new np2("INT32_LIST_PACKED", 39, 39, 3, d43Var4);
        np2 np2Var41 = new np2("FIXED64_LIST_PACKED", 40, 40, 3, d43Var3);
        np2 np2Var42 = new np2("FIXED32_LIST_PACKED", 41, 41, 3, d43Var4);
        np2 np2Var43 = new np2("BOOL_LIST_PACKED", 42, 42, 3, d43Var5);
        np2 np2Var44 = new np2("UINT32_LIST_PACKED", 43, 43, 3, d43Var4);
        np2 np2Var45 = new np2("ENUM_LIST_PACKED", 44, 44, 3, d43Var9);
        np2 np2Var46 = new np2("SFIXED32_LIST_PACKED", 45, 45, 3, d43Var4);
        np2 np2Var47 = new np2("SFIXED64_LIST_PACKED", 46, 46, 3, d43Var3);
        np2 np2Var48 = new np2("SINT32_LIST_PACKED", 47, 47, 3, d43Var4);
        np2 np2Var49 = new np2("SINT64_LIST_PACKED", 48, 48, 3, d43Var3);
        R = np2Var49;
        T = new np2[]{np2Var, np2Var2, np2Var3, np2Var4, np2Var5, np2Var6, np2Var7, np2Var8, np2Var9, np2Var10, np2Var11, np2Var12, np2Var13, np2Var14, np2Var15, np2Var16, np2Var17, np2Var18, np2Var19, np2Var20, np2Var21, np2Var22, np2Var23, np2Var24, np2Var25, np2Var26, np2Var27, np2Var28, np2Var29, np2Var30, np2Var31, np2Var32, np2Var33, np2Var34, np2Var35, np2Var36, np2Var37, np2Var38, np2Var39, np2Var40, np2Var41, np2Var42, np2Var43, np2Var44, np2Var45, np2Var46, np2Var47, np2Var48, np2Var49, new np2("GROUP_LIST", 49, 49, 2, d43Var7), new np2("MAP", 50, 50, 4, d43.VOID)};
        np2[] values = values();
        S = new np2[values.length];
        for (np2 np2Var50 : values) {
            S[np2Var50.P] = np2Var50;
        }
    }

    public np2(String str, int i, int i2, int i3, d43 d43Var) {
        this.P = i2;
        d43 d43Var2 = d43.VOID;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            d43Var.getClass();
        }
        if (i3 == 1) {
            d43Var.ordinal();
        }
    }

    public static np2[] values() {
        return (np2[]) T.clone();
    }

    public final int a() {
        return this.P;
    }
}