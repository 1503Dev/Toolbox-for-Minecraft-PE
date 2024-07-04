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
/* renamed from: ae5  reason: default package */
public final class ae5 {
    public static final ae5 Q;
    public static final ae5 R;
    public static final ae5[] S;
    public static final /* synthetic */ ae5[] T;
    public final int P;
    /* JADX INFO: Fake field, exist only in values array */
    ae5 EF6;

    static {
        ve5 ve5Var = ve5.DOUBLE;
        ae5 ae5Var = new ae5("DOUBLE", 0, 0, 1, ve5Var);
        ve5 ve5Var2 = ve5.FLOAT;
        ae5 ae5Var2 = new ae5("FLOAT", 1, 1, 1, ve5Var2);
        ve5 ve5Var3 = ve5.LONG;
        ae5 ae5Var3 = new ae5("INT64", 2, 2, 1, ve5Var3);
        ae5 ae5Var4 = new ae5("UINT64", 3, 3, 1, ve5Var3);
        ve5 ve5Var4 = ve5.INT;
        ae5 ae5Var5 = new ae5("INT32", 4, 4, 1, ve5Var4);
        ae5 ae5Var6 = new ae5("FIXED64", 5, 5, 1, ve5Var3);
        ae5 ae5Var7 = new ae5("FIXED32", 6, 6, 1, ve5Var4);
        ve5 ve5Var5 = ve5.BOOLEAN;
        ae5 ae5Var8 = new ae5("BOOL", 7, 7, 1, ve5Var5);
        ve5 ve5Var6 = ve5.STRING;
        ae5 ae5Var9 = new ae5("STRING", 8, 8, 1, ve5Var6);
        ve5 ve5Var7 = ve5.MESSAGE;
        ae5 ae5Var10 = new ae5("MESSAGE", 9, 9, 1, ve5Var7);
        ve5 ve5Var8 = ve5.BYTE_STRING;
        ae5 ae5Var11 = new ae5("BYTES", 10, 10, 1, ve5Var8);
        ae5 ae5Var12 = new ae5("UINT32", 11, 11, 1, ve5Var4);
        ve5 ve5Var9 = ve5.ENUM;
        ae5 ae5Var13 = new ae5("ENUM", 12, 12, 1, ve5Var9);
        ae5 ae5Var14 = new ae5("SFIXED32", 13, 13, 1, ve5Var4);
        ae5 ae5Var15 = new ae5("SFIXED64", 14, 14, 1, ve5Var3);
        ae5 ae5Var16 = new ae5("SINT32", 15, 15, 1, ve5Var4);
        ae5 ae5Var17 = new ae5("SINT64", 16, 16, 1, ve5Var3);
        ae5 ae5Var18 = new ae5("GROUP", 17, 17, 1, ve5Var7);
        ae5 ae5Var19 = new ae5("DOUBLE_LIST", 18, 18, 2, ve5Var);
        ae5 ae5Var20 = new ae5("FLOAT_LIST", 19, 19, 2, ve5Var2);
        ae5 ae5Var21 = new ae5("INT64_LIST", 20, 20, 2, ve5Var3);
        ae5 ae5Var22 = new ae5("UINT64_LIST", 21, 21, 2, ve5Var3);
        ae5 ae5Var23 = new ae5("INT32_LIST", 22, 22, 2, ve5Var4);
        ae5 ae5Var24 = new ae5("FIXED64_LIST", 23, 23, 2, ve5Var3);
        ae5 ae5Var25 = new ae5("FIXED32_LIST", 24, 24, 2, ve5Var4);
        ae5 ae5Var26 = new ae5("BOOL_LIST", 25, 25, 2, ve5Var5);
        ae5 ae5Var27 = new ae5("STRING_LIST", 26, 26, 2, ve5Var6);
        ae5 ae5Var28 = new ae5("MESSAGE_LIST", 27, 27, 2, ve5Var7);
        ae5 ae5Var29 = new ae5("BYTES_LIST", 28, 28, 2, ve5Var8);
        ae5 ae5Var30 = new ae5("UINT32_LIST", 29, 29, 2, ve5Var4);
        ae5 ae5Var31 = new ae5("ENUM_LIST", 30, 30, 2, ve5Var9);
        ae5 ae5Var32 = new ae5("SFIXED32_LIST", 31, 31, 2, ve5Var4);
        ae5 ae5Var33 = new ae5("SFIXED64_LIST", 32, 32, 2, ve5Var3);
        ae5 ae5Var34 = new ae5("SINT32_LIST", 33, 33, 2, ve5Var4);
        ae5 ae5Var35 = new ae5("SINT64_LIST", 34, 34, 2, ve5Var3);
        ae5 ae5Var36 = new ae5("DOUBLE_LIST_PACKED", 35, 35, 3, ve5Var);
        Q = ae5Var36;
        ae5 ae5Var37 = new ae5("FLOAT_LIST_PACKED", 36, 36, 3, ve5Var2);
        ae5 ae5Var38 = new ae5("INT64_LIST_PACKED", 37, 37, 3, ve5Var3);
        ae5 ae5Var39 = new ae5("UINT64_LIST_PACKED", 38, 38, 3, ve5Var3);
        ae5 ae5Var40 = new ae5("INT32_LIST_PACKED", 39, 39, 3, ve5Var4);
        ae5 ae5Var41 = new ae5("FIXED64_LIST_PACKED", 40, 40, 3, ve5Var3);
        ae5 ae5Var42 = new ae5("FIXED32_LIST_PACKED", 41, 41, 3, ve5Var4);
        ae5 ae5Var43 = new ae5("BOOL_LIST_PACKED", 42, 42, 3, ve5Var5);
        ae5 ae5Var44 = new ae5("UINT32_LIST_PACKED", 43, 43, 3, ve5Var4);
        ae5 ae5Var45 = new ae5("ENUM_LIST_PACKED", 44, 44, 3, ve5Var9);
        ae5 ae5Var46 = new ae5("SFIXED32_LIST_PACKED", 45, 45, 3, ve5Var4);
        ae5 ae5Var47 = new ae5("SFIXED64_LIST_PACKED", 46, 46, 3, ve5Var3);
        ae5 ae5Var48 = new ae5("SINT32_LIST_PACKED", 47, 47, 3, ve5Var4);
        ae5 ae5Var49 = new ae5("SINT64_LIST_PACKED", 48, 48, 3, ve5Var3);
        R = ae5Var49;
        T = new ae5[]{ae5Var, ae5Var2, ae5Var3, ae5Var4, ae5Var5, ae5Var6, ae5Var7, ae5Var8, ae5Var9, ae5Var10, ae5Var11, ae5Var12, ae5Var13, ae5Var14, ae5Var15, ae5Var16, ae5Var17, ae5Var18, ae5Var19, ae5Var20, ae5Var21, ae5Var22, ae5Var23, ae5Var24, ae5Var25, ae5Var26, ae5Var27, ae5Var28, ae5Var29, ae5Var30, ae5Var31, ae5Var32, ae5Var33, ae5Var34, ae5Var35, ae5Var36, ae5Var37, ae5Var38, ae5Var39, ae5Var40, ae5Var41, ae5Var42, ae5Var43, ae5Var44, ae5Var45, ae5Var46, ae5Var47, ae5Var48, ae5Var49, new ae5("GROUP_LIST", 49, 49, 2, ve5Var7), new ae5("MAP", 50, 50, 4, ve5.VOID)};
        ae5[] values = values();
        S = new ae5[values.length];
        for (ae5 ae5Var50 : values) {
            S[ae5Var50.P] = ae5Var50;
        }
    }

    public ae5(String str, int i, int i2, int i3, ve5 ve5Var) {
        this.P = i2;
        ve5 ve5Var2 = ve5.VOID;
        int i4 = i3 - 1;
        if (i4 == 1 || i4 == 3) {
            ve5Var.getClass();
        }
        if (i3 == 1) {
            ve5Var.ordinal();
        }
    }

    public static ae5[] values() {
        return (ae5[]) T.clone();
    }

    public final int a() {
        return this.P;
    }
}