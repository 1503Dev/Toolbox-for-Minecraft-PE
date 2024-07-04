package defpackage;

/* renamed from: f16  reason: default package */
public final class f16 {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bd, code lost:
        if (r11 != 3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e16 a(eh4 eh4Var, boolean z) {
        int b2 = eh4Var.b(5);
        if (b2 == 31) {
            b2 = eh4Var.b(6) + 32;
        }
        int b3 = b(eh4Var);
        int b4 = eh4Var.b(4);
        String a2 = k6.a("mp4a.40.", b2);
        int i = 22;
        if (b2 == 5 || b2 == 29) {
            b3 = b(eh4Var);
            int b5 = eh4Var.b(5);
            if (b5 == 31) {
                b5 = eh4Var.b(6) + 32;
            }
            b2 = b5;
            if (b2 == 22) {
                b4 = eh4Var.b(4);
            }
        }
        if (z) {
            int i2 = 3;
            if (b2 != 1 && b2 != 2 && b2 != 3 && b2 != 4 && b2 != 6 && b2 != 7 && b2 != 17) {
                switch (b2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw jy2.b("Unsupported audio object type: " + b2);
                }
            }
            if (eh4Var.i()) {
                lb4.c("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (eh4Var.i()) {
                eh4Var.g(14);
            }
            boolean i3 = eh4Var.i();
            if (b4 != 0) {
                if (b2 != 6) {
                    if (b2 == 20) {
                        b2 = 20;
                    }
                    if (i3) {
                        if (b2 == 22) {
                            eh4Var.g(16);
                        } else {
                            i = b2;
                        }
                        if (i == 17 || i == 19 || i == 20 || i == 23) {
                            eh4Var.g(3);
                        }
                        eh4Var.g(1);
                    }
                    switch (b2) {
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            int b6 = eh4Var.b(2);
                            if (b6 == 2) {
                                i2 = b6;
                            }
                            throw jy2.b("Unsupported epConfig: " + i2);
                    }
                }
                eh4Var.g(3);
                if (i3) {
                }
                switch (b2) {
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i4 = b[b4];
        if (i4 != -1) {
            return new e16(b3, i4, a2);
        }
        throw jy2.a(null, null);
    }

    public static int b(eh4 eh4Var) {
        int b2 = eh4Var.b(4);
        if (b2 == 15) {
            if (eh4Var.a() >= 24) {
                return eh4Var.b(24);
            }
            throw jy2.a("AAC header insufficient data", null);
        } else if (b2 < 13) {
            return a[b2];
        } else {
            throw jy2.a("AAC header wrong Sampling Frequency Index", null);
        }
    }
}