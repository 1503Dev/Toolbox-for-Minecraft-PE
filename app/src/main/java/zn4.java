package defpackage;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import android.view.Display$Mode;
import android.view.WindowManager;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;

/* renamed from: zn4  reason: default package */
public final class zn4 {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final Pattern g;
    public static HashMap h;
    public static final String[] i;
    public static final String[] j;
    public static final int[] k;
    public static final int[] l;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        StringBuilder b2 = sd1.b(str, ", ", str3, ", ", str2);
        b2.append(", ");
        b2.append(i2);
        e = b2.toString();
        f = new byte[0];
        Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        g = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        i = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        j = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        k = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        l = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    }

    public static void a(long[] jArr, long j2) {
        int i2 = 0;
        if (j2 >= 1000000 && j2 % 1000000 == 0) {
            long j3 = j2 / 1000000;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j3;
                i2++;
            }
        } else if (j2 < 1000000 && 1000000 % j2 == 0) {
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        } else {
            double d2 = j2;
            while (i2 < jArr.length) {
                Double.isNaN(d2);
                Double.isNaN(d2);
                double d3 = jArr[i2];
                Double.isNaN(d3);
                Double.isNaN(d3);
                jArr[i2] = (long) (d3 * (1000000.0d / d2));
                i2++;
            }
        }
    }

    public static boolean b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean c(int i2) {
        return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
    }

    public static boolean d(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }

    public static void e(Handler handler, Runnable runnable) {
        if (handler.getLooper().getThread().isAlive()) {
            if (handler.getLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                handler.post(runnable);
            }
        }
    }

    public static Object[] f(int i2, Object[] objArr) {
        tv2.G(i2 <= objArr.length);
        return Arrays.copyOf(objArr, i2);
    }

    public static String g(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            lb4.b("Util", "Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static int h(int[] iArr, int i2, boolean z, boolean z2) {
        int i3;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            i3 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] == i2);
            i3 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i3) : i3;
    }

    public static int i(long[] jArr, long j2, boolean z) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = binarySearch + 1;
        }
        return z ? Math.max(0, i2) : i2;
    }

    @SuppressLint({"InlinedApi"})
    public static int j(int i2) {
        if (i2 != 12) {
            switch (i2) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
                default:
                    return 0;
            }
        }
        return 743676;
    }

    public static int k(int i2) {
        if (i2 == 2 || i2 == 4) {
            return 6005;
        }
        if (i2 != 10) {
            if (i2 != 7) {
                if (i2 != 8) {
                    switch (i2) {
                        case 15:
                            return 6003;
                        case 16:
                        case 18:
                            return 6005;
                        case 17:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            return 6004;
                        default:
                            switch (i2) {
                                case 24:
                                case 25:
                                case 26:
                                case 27:
                                case 28:
                                    return 6002;
                                default:
                                    return 6006;
                            }
                    }
                }
                return 6003;
            }
            return 6005;
        }
        return 6004;
    }

    public static int l(String str) {
        String[] split;
        int length;
        int i2 = 0;
        if (str != null && (length = (split = str.split("_", -1)).length) >= 2) {
            String str2 = split[length - 1];
            boolean z = length >= 3 && "neg".equals(split[length + (-2)]);
            str2.getClass();
            try {
                i2 = Integer.parseInt(str2);
                if (z) {
                    return -i2;
                }
            } catch (NumberFormatException unused) {
            }
            return i2;
        }
        return 0;
    }

    public static int m(int i2) {
        if (i2 != 8) {
            if (i2 != 16) {
                if (i2 != 24) {
                    return i2 != 32 ? 0 : 805306368;
                }
                return 536870912;
            }
            return 2;
        }
        return 3;
    }

    public static int n(int i2, int i3) {
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 268435456) {
                        if (i2 == 536870912) {
                            return i3 * 3;
                        }
                        if (i2 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i3 * 4;
            }
            return i3;
        }
        return i3 + i3;
    }

    public static long o(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 * d3);
    }

    public static long p(long j2, float f2) {
        if (f2 == 1.0f) {
            return j2;
        }
        double d2 = j2;
        double d3 = f2;
        Double.isNaN(d2);
        Double.isNaN(d3);
        return Math.round(d2 / d3);
    }

    public static long q(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
    }

    public static long r(long j2, long j3, long j4) {
        if (j4 < j3 || j4 % j3 != 0) {
            if (j4 >= j3 || j3 % j4 != 0) {
                double d2 = j3;
                double d3 = j4;
                double d4 = j2;
                Double.isNaN(d2);
                Double.isNaN(d3);
                Double.isNaN(d4);
                return (long) ((d2 / d3) * d4);
            }
            return (j3 / j4) * j2;
        }
        return j2 / (j4 / j3);
    }

    public static long s(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }

    public static Point t(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display == null) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            windowManager.getClass();
            display = windowManager.getDefaultDisplay();
        }
        if (display.getDisplayId() == 0 && d(context)) {
            String g2 = g(a < 28 ? "sys.display-size" : "vendor.display-size");
            if (!TextUtils.isEmpty(g2)) {
                try {
                    String[] split = g2.trim().split("x", -1);
                    if (split.length == 2) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        if (parseInt > 0 && parseInt2 > 0) {
                            return new Point(parseInt, parseInt2);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
                lb4.a("Util", "Invalid display size: ".concat(String.valueOf(g2)));
            }
            if ("Sony".equals(c) && d.startsWith("BRAVIA") && context.getPackageManager().hasSystemFeature("com.sony.dtv.hardware.panel.qfhd")) {
                return new Point(3840, 2160);
            }
        }
        Point point = new Point();
        if (a < 23) {
            display.getRealSize(point);
            return point;
        }
        Display$Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
        return point;
    }

    public static Handler u() {
        Looper myLooper = Looper.myLooper();
        tv2.B(myLooper);
        return new Handler(myLooper, null);
    }

    public static String v(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            default:
                return "camera motion";
        }
    }

    public static String w(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !replace.equals("und")) {
            str = replace;
        }
        String c2 = q05.c(str);
        int i2 = 0;
        String str2 = c2.split("-", 2)[0];
        if (h == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            int length = iSOLanguages.length;
            int length2 = i.length;
            HashMap hashMap = new HashMap(length + 88);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            int i3 = 0;
            while (true) {
                String[] strArr = i;
                int length3 = strArr.length;
                if (i3 >= 88) {
                    break;
                }
                hashMap.put(strArr[i3], strArr[i3 + 1]);
                i3 += 2;
            }
            h = hashMap;
        }
        String str4 = (String) h.get(str2);
        if (str4 != null) {
            c2 = str4.concat(String.valueOf(c2.substring(str2.length())));
            str2 = str4;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return c2;
        }
        while (true) {
            String[] strArr2 = j;
            int length4 = strArr2.length;
            if (i2 < 18) {
                if (c2.startsWith(strArr2[i2])) {
                    return String.valueOf(strArr2[i2 + 1]).concat(String.valueOf(c2.substring(strArr2[i2].length())));
                }
                i2 += 2;
            } else {
                return c2;
            }
        }
    }
}