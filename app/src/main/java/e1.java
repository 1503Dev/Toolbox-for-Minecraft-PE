package defpackage;

/* renamed from: e1 */
public final /* synthetic */ class e1 implements zl {
    public static final int a(int i) {
        if (i != 6) {
            return c(i);
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return i != 4 ? 0 : 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    public static /* synthetic */ int c(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (i == 6) {
            return -1;
        }
        throw null;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return i + i2 + i3 + i4;
    }

    public static /* synthetic */ String e(int i) {
        if (i == 1) {
            return "UNKNOWN_PREFIX";
        }
        if (i == 2) {
            return "TINK";
        }
        if (i == 3) {
            return "LEGACY";
        }
        if (i == 4) {
            return "RAW";
        }
        if (i == 5) {
            return "CRUNCHY";
        }
        if (i == 6) {
            return "UNRECOGNIZED";
        }
        throw null;
    }

    public static /* synthetic */ String f(int i) {
        return i == 1 ? "EXPONENTIAL" : i == 2 ? "LINEAR" : "null";
    }
}