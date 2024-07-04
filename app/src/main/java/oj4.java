package defpackage;

/* renamed from: oj4  reason: default package */
public final class oj4 {
    public static tz3 a(Throwable th) {
        if (th instanceof i14) {
            i14 i14Var = (i14) th;
            return c(i14Var.P, i14Var.Q);
        } else if (th instanceof vu3) {
            if (th.getMessage() == null) {
                return d(((vu3) th).P, null, null);
            }
            return d(((vu3) th).P, th.getMessage(), null);
        } else if (th instanceof o62) {
            o62 o62Var = (o62) th;
            return new tz3(o62Var.P, pt4.b(o62Var.getMessage()), "com.google.android.gms.ads", null, null);
        } else {
            return d(1, null, null);
        }
    }

    public static tz3 b(Throwable th, j14 j14Var) {
        tz3 tz3Var;
        tz3 a = a(th);
        int i = a.P;
        if ((i == 3 || i == 0) && (tz3Var = a.S) != null && !tz3Var.R.equals("com.google.android.gms.ads")) {
            a.S = null;
        }
        if (j14Var != null) {
            a.T = new gd3(j14Var.e, "", j14Var, j14Var.d, j14Var.c);
        }
        return a;
    }

    public static tz3 c(int i, tz3 tz3Var) {
        if (i != 0) {
            if (i == 8) {
                if (((Integer) w82.d.c.a(x92.V6)).intValue() <= 0) {
                    i = 8;
                } else {
                    return tz3Var;
                }
            }
            return d(i, null, tz3Var);
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static tz3 d(int i, String str, tz3 tz3Var) {
        int i2;
        String str2;
        if (str == null) {
            int i3 = i - 1;
            if (i != 0) {
                switch (i3) {
                    case 1:
                        str = "Invalid request.";
                        break;
                    case 2:
                        str = "No fill.";
                        break;
                    case 3:
                        str = "App ID missing.";
                        break;
                    case 4:
                        str = "Network error.";
                        break;
                    case 5:
                        str = "Invalid request: Invalid ad unit ID.";
                        break;
                    case 6:
                        str = "Invalid request: Invalid ad size.";
                        break;
                    case 7:
                        str = "A mediation adapter failed to show the ad.";
                        break;
                    case 8:
                        str = "The ad is not ready.";
                        break;
                    case 9:
                        str = "The ad has already been shown.";
                        break;
                    case 10:
                        str = "The ad can not be shown when app is not in foreground.";
                        break;
                    case 11:
                    default:
                        str = "Internal error.";
                        break;
                    case 12:
                        if (((Integer) w82.d.c.a(x92.Y6)).intValue() <= 0) {
                            str = "The mediation adapter did not return an ad.";
                            break;
                        }
                        str = "No fill.";
                        break;
                    case 13:
                        str = "Mismatch request IDs.";
                        break;
                    case 14:
                        str = "Invalid ad string.";
                        break;
                    case 15:
                        str = "Ad inspector had an internal error.";
                        break;
                    case 16:
                        str = "Ad inspector failed to load.";
                        break;
                    case 17:
                        str = "Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.";
                        break;
                    case 18:
                        str = "Ad inspector cannot be opened because it is already open.";
                        break;
                }
            } else {
                throw null;
            }
        }
        String str3 = str;
        int i4 = i - 1;
        if (i != 0) {
            switch (i4) {
                case 0:
                case 11:
                case 15:
                    i2 = 0;
                    break;
                case 1:
                case 5:
                case 6:
                case 9:
                case 16:
                    i2 = 1;
                    break;
                case 2:
                case 10:
                case 18:
                    i2 = 3;
                    break;
                case 3:
                    i2 = 8;
                    break;
                case 4:
                case 8:
                case 17:
                    i2 = 2;
                    break;
                case 7:
                    i2 = 4;
                    break;
                case 12:
                    if (((Integer) w82.d.c.a(x92.Y6)).intValue() <= 0) {
                        i2 = 9;
                        break;
                    }
                    i2 = 3;
                    break;
                case 13:
                    i2 = 10;
                    break;
                case 14:
                    i2 = 11;
                    break;
                default:
                    switch (i) {
                        case 1:
                            str2 = "INTERNAL_ERROR";
                            break;
                        case 2:
                            str2 = "INVALID_REQUEST";
                            break;
                        case 3:
                            str2 = "NO_FILL";
                            break;
                        case 4:
                            str2 = "APP_ID_MISSING";
                            break;
                        case 5:
                            str2 = "NETWORK_ERROR";
                            break;
                        case 6:
                            str2 = "INVALID_AD_UNIT_ID";
                            break;
                        case 7:
                            str2 = "INVALID_AD_SIZE";
                            break;
                        case 8:
                            str2 = "MEDIATION_SHOW_ERROR";
                            break;
                        case 9:
                            str2 = "NOT_READY";
                            break;
                        case 10:
                            str2 = "AD_REUSED";
                            break;
                        case 11:
                            str2 = "APP_NOT_FOREGROUND";
                            break;
                        case 12:
                            str2 = "INTERNAL_SHOW_ERROR";
                            break;
                        case 13:
                            str2 = "MEDIATION_NO_FILL";
                            break;
                        case 14:
                            str2 = "REQUEST_ID_MISMATCH";
                            break;
                        case 15:
                            str2 = "INVALID_AD_STRING";
                            break;
                        case 16:
                            str2 = "AD_INSPECTOR_INTERNAL_ERROR";
                            break;
                        case 17:
                            str2 = "AD_INSPECTOR_FAILED_TO_LOAD";
                            break;
                        case 18:
                            str2 = "AD_INSPECTOR_NOT_IN_TEST_MODE";
                            break;
                        default:
                            str2 = "AD_INSPECTOR_ALREADY_OPEN";
                            break;
                    }
                    throw new AssertionError("Unknown SdkError: ".concat(str2));
            }
            return new tz3(i2, str3, "com.google.android.gms.ads", tz3Var, null);
        }
        throw null;
    }
}