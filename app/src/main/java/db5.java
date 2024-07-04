package defpackage;

/* renamed from: db5 */
public final class db5 extends ie5 implements of5 {
    private static final db5 zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        db5 db5Var = new db5();
        zzb = db5Var;
        ie5.n(db5.class, db5Var);
    }

    public static void B(db5 db5Var, int i) {
        if (i == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        db5Var.zze = i - 2;
    }

    public static cb5 w() {
        return (cb5) zzb.s();
    }

    public static /* synthetic */ void y(db5 db5Var, String str) {
        str.getClass();
        db5Var.zzd = str;
    }

    @Override // defpackage.ie5
    public final Object t(int i, ie5 ie5Var) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new cb5(0);
                }
                return new db5();
            }
            return new xf5(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}