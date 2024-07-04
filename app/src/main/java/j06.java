package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

/* renamed from: j06  reason: default package */
public final class j06 extends tt5 {
    public static final int[] P1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean Q1;
    public static boolean R1;
    public long A1;
    public long B1;
    public long C1;
    public int D1;
    public int E1;
    public int F1;
    public long G1;
    public long H1;
    public long I1;
    public int J1;
    public long K1;
    public wo3 L1;
    public wo3 M1;
    public int N1;
    public m06 O1;
    public final Context l1;
    public final s06 m1;
    public final c16 n1;
    public final i06 o1;
    public final boolean p1;
    public h06 q1;
    public boolean r1;
    public boolean s1;
    public Surface t1;
    public l06 u1;
    public boolean v1;
    public int w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    public j06(Context context, Handler handler, xl5 xl5Var) {
        super(2, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.l1 = applicationContext;
        s06 s06Var = new s06(applicationContext);
        this.m1 = s06Var;
        this.n1 = new c16(handler, xl5Var);
        this.o1 = new i06(s06Var, this);
        this.p1 = "NVIDIA".equals(zn4.c);
        this.B1 = -9223372036854775807L;
        this.w1 = 1;
        this.L1 = wo3.e;
        this.N1 = 0;
        this.M1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0072, code lost:
        if (r3.equals("video/av01") != false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int i0(pt5 pt5Var, cu1 cu1Var) {
        int intValue;
        int i = cu1Var.p;
        int i2 = cu1Var.q;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = cu1Var.k;
        char c = 2;
        if ("video/dolby-vision".equals(str)) {
            Pair b = lu5.b(cu1Var);
            str = (b == null || !((intValue = ((Integer) b.first).intValue()) == 512 || intValue == 1 || intValue == 2)) ? "video/hevc" : "video/avc";
        }
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
                return ((i * i2) * 3) / 4;
            case 4:
                return Math.max(2097152, ((i * i2) * 3) / 4);
            case 5:
                String str2 = zn4.d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(zn4.c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && pt5Var.f)))) {
                    return -1;
                }
                return ((((i2 + 15) / 16) * ((i + 15) / 16)) * 768) / 4;
            case 6:
                return ((i * i2) * 3) / 8;
            default:
                return -1;
        }
    }

    public static int j0(pt5 pt5Var, cu1 cu1Var) {
        if (cu1Var.l != -1) {
            int size = cu1Var.m.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += ((byte[]) cu1Var.m.get(i2)).length;
            }
            return cu1Var.l + i;
        }
        return i0(pt5Var, cu1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x04c0, code lost:
        if (r0.equals("deb") != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x07a0, code lost:
        if (r10 != 0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean q0(String str) {
        char c;
        char c2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (j06.class) {
            if (!Q1) {
                int i = zn4.a;
                char c3 = 28;
                char c4 = 65535;
                if (i <= 28) {
                    String str2 = zn4.b;
                    switch (str2.hashCode()) {
                        case -1339091551:
                            if (str2.equals("dangal")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220081023:
                            if (str2.equals("dangalFHD")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1220066608:
                            if (str2.equals("dangalUHD")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1012436106:
                            if (str2.equals("oneday")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -760312546:
                            if (str2.equals("aquaman")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -64886864:
                            if (str2.equals("magnolia")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3415681:
                            if (str2.equals("once")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 825323514:
                            if (str2.equals("machuca")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                    R1 = z;
                    Q1 = true;
                }
                if (i > 27 || !"HWEML".equals(zn4.b)) {
                    String str3 = zn4.d;
                    switch (str3.hashCode()) {
                        case -349662828:
                            if (str3.equals("AFTJMST12")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -321033677:
                            if (str3.equals("AFTKMST12")) {
                                c = 7;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006354:
                            if (str3.equals("AFTA")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006367:
                            if (str3.equals("AFTN")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 2006371:
                            if (str3.equals("AFTR")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421873:
                            if (str3.equals("AFTEU011")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1785421876:
                            if (str3.equals("AFTEU014")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1798172390:
                            if (str3.equals("AFTSO001")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case 2119412532:
                            if (str3.equals("AFTEUFF014")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        default:
                            if (i <= 26) {
                                String str4 = zn4.b;
                                switch (str4.hashCode()) {
                                    case -2144781245:
                                        if (str4.equals("GIONEE_SWW1609")) {
                                            c3 = '6';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781185:
                                        if (str4.equals("GIONEE_SWW1627")) {
                                            c3 = '7';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2144781160:
                                        if (str4.equals("GIONEE_SWW1631")) {
                                            c3 = '8';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2097309513:
                                        if (str4.equals("K50a40")) {
                                            c3 = 'J';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -2022874474:
                                        if (str4.equals("CP8676_I02")) {
                                            c3 = 22;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978993182:
                                        if (str4.equals("NX541J")) {
                                            c3 = 'Y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1978990237:
                                        if (str4.equals("NX573J")) {
                                            c3 = 'Z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688988:
                                        if (str4.equals("PGN528")) {
                                            c3 = 'e';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688066:
                                        if (str4.equals("PGN610")) {
                                            c3 = 'f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1936688065:
                                        if (str4.equals("PGN611")) {
                                            c3 = 'g';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1931988508:
                                        if (str4.equals("AquaPowerM")) {
                                            c3 = '\r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1885099851:
                                        if (str4.equals("RAIJIN")) {
                                            c3 = 't';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1696512866:
                                        if (str4.equals("XT1663")) {
                                            c3 = 137;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1680025915:
                                        if (str4.equals("ComioS1")) {
                                            c3 = 21;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1615810839:
                                        if (str4.equals("Phantom6")) {
                                            c3 = 'h';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1600724499:
                                        if (str4.equals("pacificrim")) {
                                            c3 = '_';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1554255044:
                                        if (str4.equals("vernee_M5")) {
                                            c3 = 130;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772737:
                                        if (str4.equals("panell_dl")) {
                                            c3 = 'a';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772730:
                                        if (str4.equals("panell_ds")) {
                                            c3 = 'b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1481772729:
                                        if (str4.equals("panell_dt")) {
                                            c3 = 'c';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1320080169:
                                        if (str4.equals("GiONEE_GBL7319")) {
                                            c3 = '4';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1217592143:
                                        if (str4.equals("BRAVIA_ATV2")) {
                                            c3 = 18;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1180384755:
                                        if (str4.equals("iris60")) {
                                            c3 = 'F';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1139198265:
                                        if (str4.equals("Slate_Pro")) {
                                            c3 = 'v';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -1052835013:
                                        if (str4.equals("namath")) {
                                            c3 = 'W';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250464:
                                        if (str4.equals("A10-70F")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -993250458:
                                        if (str4.equals("A10-70L")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -965403638:
                                        if (str4.equals("s905x018")) {
                                            c3 = 'x';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -958336948:
                                        if (str4.equals("ELUGA_Ray_X")) {
                                            c3 = '\"';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -879245230:
                                        if (str4.equals("tcl_eu")) {
                                            c3 = '~';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -842500323:
                                        if (str4.equals("nicklaus_f")) {
                                            c3 = 'X';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -821392978:
                                        if (str4.equals("A7000-a")) {
                                            c3 = '\t';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -797483286:
                                        if (str4.equals("SVP-DTV15")) {
                                            c3 = 'w';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -794946968:
                                        if (str4.equals("watson")) {
                                            c3 = 131;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -788334647:
                                        if (str4.equals("whyred")) {
                                            c3 = 132;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -782144577:
                                        if (str4.equals("OnePlus5T")) {
                                            c3 = '[';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -575125681:
                                        if (str4.equals("GiONEE_CBL7513")) {
                                            c3 = '3';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -521118391:
                                        if (str4.equals("GIONEE_GBL7360")) {
                                            c3 = '5';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -430914369:
                                        if (str4.equals("Pixi4-7_3G")) {
                                            c3 = 'i';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -290434366:
                                        if (str4.equals("taido_row")) {
                                            c3 = 'y';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -282781963:
                                        if (str4.equals("BLACK-1X")) {
                                            c3 = 17;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -277133239:
                                        if (str4.equals("Z12_PRO")) {
                                            c3 = 138;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -173639913:
                                        if (str4.equals("ELUGA_A3_Pro")) {
                                            c3 = 31;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -56598463:
                                        if (str4.equals("woods_fn")) {
                                            c3 = 134;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2126:
                                        if (str4.equals("C1")) {
                                            c3 = 20;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2564:
                                        if (str4.equals("Q5")) {
                                            c3 = 'q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2715:
                                        if (str4.equals("V1")) {
                                            c3 = 127;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2719:
                                        if (str4.equals("V5")) {
                                            c3 = 129;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3091:
                                        if (str4.equals("b5")) {
                                            c3 = 16;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3483:
                                        if (str4.equals("mh")) {
                                            c3 = 'T';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 73405:
                                        if (str4.equals("JGZ")) {
                                            c3 = 'I';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75537:
                                        if (str4.equals("M04")) {
                                            c3 = 'O';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 75739:
                                        if (str4.equals("M5c")) {
                                            c3 = 'P';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76779:
                                        if (str4.equals("MX6")) {
                                            c3 = 'V';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 78669:
                                        if (str4.equals("P85")) {
                                            c3 = '^';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 79305:
                                        if (str4.equals("PLE")) {
                                            c3 = 'k';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80618:
                                        if (str4.equals("QX1")) {
                                            c3 = 's';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 88274:
                                        if (str4.equals("Z80")) {
                                            c3 = 139;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98846:
                                        if (str4.equals("cv1")) {
                                            c3 = 26;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98848:
                                        if (str4.equals("cv3")) {
                                            c3 = 27;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 99329:
                                        break;
                                    case 101481:
                                        if (str4.equals("flo")) {
                                            c3 = '1';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1513190:
                                        if (str4.equals("1601")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514184:
                                        if (str4.equals("1713")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1514185:
                                        if (str4.equals("1714")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133089:
                                        if (str4.equals("F01H")) {
                                            c3 = '$';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133091:
                                        if (str4.equals("F01J")) {
                                            c3 = '%';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133120:
                                        if (str4.equals("F02H")) {
                                            c3 = '&';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133151:
                                        if (str4.equals("F03H")) {
                                            c3 = '\'';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133182:
                                        if (str4.equals("F04H")) {
                                            c3 = '(';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2133184:
                                        if (str4.equals("F04J")) {
                                            c3 = ')';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2436959:
                                        if (str4.equals("P681")) {
                                            c3 = ']';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2463773:
                                        if (str4.equals("Q350")) {
                                            c3 = 'm';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2464648:
                                        if (str4.equals("Q427")) {
                                            c3 = 'o';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2689555:
                                        if (str4.equals("XE2X")) {
                                            c3 = 136;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3154429:
                                        if (str4.equals("fugu")) {
                                            c3 = '2';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3284551:
                                        if (str4.equals("kate")) {
                                            c3 = 'K';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3351335:
                                        if (str4.equals("mido")) {
                                            c3 = 'U';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3386211:
                                        if (str4.equals("p212")) {
                                            c3 = '\\';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 41325051:
                                        if (str4.equals("MEIZU_M5")) {
                                            c3 = 'S';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51349633:
                                        if (str4.equals("601LV")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 51350594:
                                        if (str4.equals("602LV")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 55178625:
                                        if (str4.equals("Aura_Note_2")) {
                                            c3 = 15;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 61542055:
                                        if (str4.equals("A1601")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 65355429:
                                        if (str4.equals("E5643")) {
                                            c3 = 30;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214468:
                                        if (str4.equals("F3111")) {
                                            c3 = '*';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214470:
                                        if (str4.equals("F3113")) {
                                            c3 = '+';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66214473:
                                        if (str4.equals("F3116")) {
                                            c3 = ',';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215429:
                                        if (str4.equals("F3211")) {
                                            c3 = '-';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215431:
                                        if (str4.equals("F3213")) {
                                            c3 = '.';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66215433:
                                        if (str4.equals("F3215")) {
                                            c3 = '/';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 66216390:
                                        if (str4.equals("F3311")) {
                                            c3 = '0';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76402249:
                                        if (str4.equals("PRO7S")) {
                                            c3 = 'l';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404105:
                                        if (str4.equals("Q4260")) {
                                            c3 = 'n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 76404911:
                                        if (str4.equals("Q4310")) {
                                            c3 = 'p';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 80963634:
                                        if (str4.equals("V23GB")) {
                                            c3 = 128;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 82882791:
                                        if (str4.equals("X3_HK")) {
                                            c3 = 135;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 98715550:
                                        if (str4.equals("i9031")) {
                                            c3 = 'C';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 101370885:
                                        if (str4.equals("l5460")) {
                                            c3 = 'L';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 102844228:
                                        if (str4.equals("le_x6")) {
                                            c3 = 'M';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 165221241:
                                        if (str4.equals("A2016a40")) {
                                            c3 = '\b';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 182191441:
                                        if (str4.equals("CPY83_I00")) {
                                            c3 = 25;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 245388979:
                                        if (str4.equals("marino_f")) {
                                            c3 = 'R';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 287431619:
                                        if (str4.equals("griffin")) {
                                            c3 = '<';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 307593612:
                                        if (str4.equals("A7010a48")) {
                                            c3 = 11;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 308517133:
                                        if (str4.equals("A7020a48")) {
                                            c3 = '\f';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215098:
                                        if (str4.equals("TB3-730F")) {
                                            c3 = 'z';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316215116:
                                        if (str4.equals("TB3-730X")) {
                                            c3 = '{';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246811:
                                        if (str4.equals("TB3-850F")) {
                                            c3 = '|';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 316246818:
                                        if (str4.equals("TB3-850M")) {
                                            c3 = '}';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 407160593:
                                        if (str4.equals("Pixi5-10_4G")) {
                                            c3 = 'j';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 507412548:
                                        if (str4.equals("QM16XE_U")) {
                                            c3 = 'r';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 793982701:
                                        if (str4.equals("GIONEE_WBL5708")) {
                                            c3 = '9';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794038622:
                                        if (str4.equals("GIONEE_WBL7365")) {
                                            c3 = ':';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 794040393:
                                        if (str4.equals("GIONEE_WBL7519")) {
                                            c3 = ';';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 835649806:
                                        if (str4.equals("manning")) {
                                            c3 = 'Q';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 917340916:
                                        if (str4.equals("A7000plus")) {
                                            c3 = '\n';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 958008161:
                                        if (str4.equals("j2xlteins")) {
                                            c3 = 'H';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1060579533:
                                        if (str4.equals("panell_d")) {
                                            c3 = '`';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1150207623:
                                        if (str4.equals("LS-5017")) {
                                            c3 = 'N';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1176899427:
                                        if (str4.equals("itel_S41")) {
                                            c3 = 'G';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1280332038:
                                        if (str4.equals("hwALE-H")) {
                                            c3 = '>';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1306947716:
                                        if (str4.equals("EverStar_S")) {
                                            c3 = '#';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1349174697:
                                        if (str4.equals("htc_e56ml_dtul")) {
                                            c3 = '=';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1522194893:
                                        if (str4.equals("woods_f")) {
                                            c3 = 133;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691543273:
                                        if (str4.equals("CPH1609")) {
                                            c3 = 23;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1691544261:
                                        if (str4.equals("CPH1715")) {
                                            c3 = 24;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1709443163:
                                        if (str4.equals("iball8735_9806")) {
                                            c3 = 'D';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1865889110:
                                        if (str4.equals("santoni")) {
                                            c3 = 'u';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1906253259:
                                        if (str4.equals("PB2-670M")) {
                                            c3 = 'd';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 1977196784:
                                        if (str4.equals("Infinix-X572")) {
                                            c3 = 'E';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2006372676:
                                        if (str4.equals("BRAVIA_ATV3_4K")) {
                                            c3 = 19;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2019281702:
                                        if (str4.equals("DM-01K")) {
                                            c3 = 29;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2029784656:
                                        if (str4.equals("HWBLN-H")) {
                                            c3 = '?';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2030379515:
                                        if (str4.equals("HWCAM-H")) {
                                            c3 = '@';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2033393791:
                                        if (str4.equals("ASUS_X00AD_2")) {
                                            c3 = 14;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047190025:
                                        if (str4.equals("ELUGA_Note")) {
                                            c3 = ' ';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2047252157:
                                        if (str4.equals("ELUGA_Prim")) {
                                            c3 = '!';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048319463:
                                        if (str4.equals("HWVNS-H")) {
                                            c3 = 'A';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 2048855701:
                                        if (str4.equals("HWWAS-H")) {
                                            c3 = 'B';
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    default:
                                        if (str3.hashCode() == -594534941 && str3.equals("JSN-L21")) {
                                            c4 = 0;
                                            break;
                                        }
                                        break;
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case '\b':
                                    case '\t':
                                    case '\n':
                                    case 11:
                                    case '\f':
                                    case '\r':
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case ' ':
                                    case '!':
                                    case '\"':
                                    case '#':
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case '-':
                                    case '.':
                                    case '/':
                                    case '0':
                                    case '1':
                                    case '2':
                                    case '3':
                                    case '4':
                                    case '5':
                                    case '6':
                                    case '7':
                                    case '8':
                                    case '9':
                                    case ':':
                                    case ';':
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                    case 'A':
                                    case 'B':
                                    case 'C':
                                    case 'D':
                                    case 'E':
                                    case 'F':
                                    case 'G':
                                    case 'H':
                                    case 'I':
                                    case 'J':
                                    case 'K':
                                    case 'L':
                                    case 'M':
                                    case 'N':
                                    case 'O':
                                    case 'P':
                                    case 'Q':
                                    case 'R':
                                    case 'S':
                                    case 'T':
                                    case 'U':
                                    case 'V':
                                    case 'W':
                                    case 'X':
                                    case 'Y':
                                    case 'Z':
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                    case 'a':
                                    case 'b':
                                    case 'c':
                                    case 'd':
                                    case 'e':
                                    case 'f':
                                    case 'g':
                                    case 'h':
                                    case 'i':
                                    case 'j':
                                    case 'k':
                                    case 'l':
                                    case 'm':
                                    case 'n':
                                    case 'o':
                                    case 'p':
                                    case 'q':
                                    case 'r':
                                    case 's':
                                    case 't':
                                    case 'u':
                                    case 'v':
                                    case 'w':
                                    case 'x':
                                    case 'y':
                                    case 'z':
                                    case '{':
                                    case '|':
                                    case '}':
                                    case '~':
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case 131:
                                    case 132:
                                    case 133:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case 137:
                                    case 138:
                                    case 139:
                                        break;
                                }
                            }
                            break;
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case '\b':
                            break;
                    }
                    R1 = z;
                    Q1 = true;
                }
                z = true;
                R1 = z;
                Q1 = true;
            }
        }
        return R1;
    }

    public static nv4 r0(Context context, cu1 cu1Var, boolean z, boolean z2) {
        String str = cu1Var.k;
        if (str == null) {
            lv4 lv4Var = nv4.Q;
            return nw4.T;
        }
        List d = lu5.d(str, z, z2);
        String c = lu5.c(cu1Var);
        if (c == null) {
            return nv4.t(d);
        }
        List d2 = lu5.d(c, z, z2);
        if (zn4.a >= 26 && "video/dolby-vision".equals(cu1Var.k) && !d2.isEmpty() && !g06.a(context)) {
            return nv4.t(d2);
        }
        kv4 kv4Var = new kv4();
        kv4Var.q(d);
        kv4Var.q(d2);
        return kv4Var.s();
    }

    @Override // defpackage.tt5
    public final int A(ut5 ut5Var, cu1 cu1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3;
        int i4 = 128;
        if (!mx2.f(cu1Var.k)) {
            return 128;
        }
        int i5 = 0;
        if (cu1Var.n != null) {
            z = true;
        } else {
            z = false;
        }
        nv4 r0 = r0(this.l1, cu1Var, z, false);
        if (z && r0.isEmpty()) {
            r0 = r0(this.l1, cu1Var, false, false);
        }
        if (r0.isEmpty()) {
            return 129;
        }
        if (cu1Var.D != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            return 130;
        }
        pt5 pt5Var = (pt5) r0.get(0);
        boolean c = pt5Var.c(cu1Var);
        if (!c) {
            for (int i6 = 1; i6 < r0.size(); i6++) {
                pt5 pt5Var2 = (pt5) r0.get(i6);
                if (pt5Var2.c(cu1Var)) {
                    pt5Var = pt5Var2;
                    z3 = false;
                    c = true;
                    break;
                }
            }
        }
        z3 = true;
        if (true != c) {
            i = 3;
        } else {
            i = 4;
        }
        if (true != pt5Var.d(cu1Var)) {
            i2 = 8;
        } else {
            i2 = 16;
        }
        if (true != pt5Var.g) {
            i3 = 0;
        } else {
            i3 = 64;
        }
        if (true != z3) {
            i4 = 0;
        }
        if (zn4.a >= 26 && "video/dolby-vision".equals(cu1Var.k) && !g06.a(this.l1)) {
            i4 = 256;
        }
        if (c) {
            nv4 r02 = r0(this.l1, cu1Var, z, true);
            if (!r02.isEmpty()) {
                Pattern pattern = lu5.a;
                ArrayList arrayList = new ArrayList(r02);
                Collections.sort(arrayList, new vt5(new om1(6, cu1Var)));
                pt5 pt5Var3 = (pt5) arrayList.get(0);
                if (pt5Var3.c(cu1Var) && pt5Var3.d(cu1Var)) {
                    i5 = 32;
                }
            }
        }
        return i | i2 | i5 | i3 | i4;
    }

    @Override // defpackage.tt5
    public final ok5 B(pt5 pt5Var, cu1 cu1Var, cu1 cu1Var2) {
        int i;
        int i2;
        ok5 a = pt5Var.a(cu1Var, cu1Var2);
        int i3 = a.e;
        int i4 = cu1Var2.p;
        h06 h06Var = this.q1;
        if (i4 > h06Var.a || cu1Var2.q > h06Var.b) {
            i3 |= 256;
        }
        if (j0(pt5Var, cu1Var2) > this.q1.c) {
            i3 |= 64;
        }
        String str = pt5Var.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = a.d;
            i2 = 0;
        }
        return new ok5(str, cu1Var, cu1Var2, i, i2);
    }

    @Override // defpackage.tt5
    public final ok5 C(vi1 vi1Var) {
        ok5 C = super.C(vi1Var);
        c16 c16Var = this.n1;
        cu1 cu1Var = (cu1) vi1Var.Q;
        Handler handler = c16Var.a;
        if (handler != null) {
            handler.post(new o04(1, c16Var, cu1Var, C));
        }
        return C;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f4, code lost:
        r3 = r3.getVideoCapabilities();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0129, code lost:
        if (true == r12) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x012b, code lost:
        r13 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x012d, code lost:
        r13 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x012e, code lost:
        if (true == r12) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0130, code lost:
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0134, code lost:
        r3 = new android.graphics.Point(r13, r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    @Override // defpackage.tt5
    @TargetApi(17)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lt5 F(pt5 pt5Var, cu1 cu1Var, float f) {
        String str;
        h06 h06Var;
        boolean z;
        int i;
        Point point;
        int i2;
        int i3;
        Point point2;
        MediaCodecInfo$VideoCapabilities videoCapabilities;
        boolean z2;
        boolean z3;
        MediaFormat mediaFormat;
        float f2;
        eu5 eu5Var;
        int i4;
        Pair b;
        int i0;
        l06 l06Var = this.u1;
        if (l06Var != null && l06Var.P != pt5Var.f) {
            if (this.t1 == l06Var) {
                this.t1 = null;
            }
            l06Var.release();
            this.u1 = null;
        }
        String str2 = pt5Var.c;
        cu1[] cu1VarArr = this.W;
        cu1VarArr.getClass();
        int i5 = cu1Var.p;
        int i6 = cu1Var.q;
        int j0 = j0(pt5Var, cu1Var);
        int length = cu1VarArr.length;
        if (length == 1) {
            if (j0 != -1 && (i0 = i0(pt5Var, cu1Var)) != -1) {
                j0 = Math.min((int) (j0 * 1.5f), i0);
            }
            h06Var = new h06(i5, i6, j0);
            str = str2;
        } else {
            boolean z4 = false;
            for (int i7 = 0; i7 < length; i7++) {
                cu1 cu1Var2 = cu1VarArr[i7];
                if (cu1Var.w != null && cu1Var2.w == null) {
                    bs1 bs1Var = new bs1(cu1Var2);
                    bs1Var.v = cu1Var.w;
                    cu1Var2 = new cu1(bs1Var);
                }
                if (pt5Var.a(cu1Var, cu1Var2).d != 0) {
                    int i8 = cu1Var2.p;
                    if (i8 != -1 && cu1Var2.q != -1) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    z4 |= z2;
                    i5 = Math.max(i5, i8);
                    i6 = Math.max(i6, cu1Var2.q);
                    j0 = Math.max(j0, j0(pt5Var, cu1Var2));
                }
            }
            if (z4) {
                lb4.c("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i5 + "x" + i6);
                int i9 = cu1Var.q;
                int i10 = cu1Var.p;
                if (i9 > i10) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = i9;
                } else {
                    i = i10;
                }
                if (true == z) {
                    i9 = i10;
                }
                int[] iArr = P1;
                int i11 = 0;
                while (true) {
                    if (i11 < 9) {
                        float f3 = i9;
                        float f4 = i;
                        str = str2;
                        int i12 = iArr[i11];
                        int[] iArr2 = iArr;
                        float f5 = i12;
                        if (i12 <= i || (i2 = (int) ((f3 / f4) * f5)) <= i9) {
                            break;
                        } else if (zn4.a >= 21) {
                            if (true != z) {
                                i3 = i12;
                            } else {
                                i3 = i2;
                            }
                            if (true != z) {
                                i12 = i2;
                            }
                            MediaCodecInfo.CodecCapabilities codecCapabilities = pt5Var.d;
                            if (codecCapabilities == null || videoCapabilities == null) {
                                point2 = null;
                            } else {
                                point2 = pt5.f(videoCapabilities, i3, i12);
                            }
                            Point point3 = point2;
                            if (pt5Var.e(point2.x, point2.y, cu1Var.r)) {
                                point = point3;
                                break;
                            }
                            i11++;
                            str2 = str;
                            iArr = iArr2;
                        } else {
                            try {
                                int i13 = ((i12 + 15) / 16) * 16;
                                int i14 = ((i2 + 15) / 16) * 16;
                                if (i13 * i14 <= lu5.a()) {
                                    break;
                                }
                                i11++;
                                str2 = str;
                                iArr = iArr2;
                            } catch (xt5 unused) {
                                point = null;
                                if (point != null) {
                                }
                                h06Var = new h06(i5, i6, j0);
                                this.q1 = h06Var;
                                z3 = this.p1;
                                mediaFormat = new MediaFormat();
                                mediaFormat.setString("mime", str);
                                mediaFormat.setInteger("width", cu1Var.p);
                                mediaFormat.setInteger("height", cu1Var.q);
                                cd4.b(mediaFormat, cu1Var.m);
                                f2 = cu1Var.r;
                                if (f2 != -1.0f) {
                                }
                                cd4.a(mediaFormat, "rotation-degrees", cu1Var.s);
                                eu5Var = cu1Var.w;
                                if (eu5Var != null) {
                                }
                                if ("video/dolby-vision".equals(cu1Var.k)) {
                                    cd4.a(mediaFormat, "profile", ((Integer) b.first).intValue());
                                }
                                mediaFormat.setInteger("max-width", h06Var.a);
                                mediaFormat.setInteger("max-height", h06Var.b);
                                cd4.a(mediaFormat, "max-input-size", h06Var.c);
                                i4 = zn4.a;
                                if (i4 >= 23) {
                                }
                                if (z3) {
                                }
                                if (this.t1 == null) {
                                }
                                if (this.o1.f()) {
                                }
                                if (this.o1.f()) {
                                }
                            }
                        }
                    } else {
                        str = str2;
                        break;
                    }
                }
                if (point != null) {
                    i5 = Math.max(i5, point.x);
                    i6 = Math.max(i6, point.y);
                    bs1 bs1Var2 = new bs1(cu1Var);
                    bs1Var2.o = i5;
                    bs1Var2.p = i6;
                    j0 = Math.max(j0, i0(pt5Var, new cu1(bs1Var2)));
                    lb4.c("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i5 + "x" + i6);
                }
            } else {
                str = str2;
            }
            h06Var = new h06(i5, i6, j0);
        }
        this.q1 = h06Var;
        z3 = this.p1;
        mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", cu1Var.p);
        mediaFormat.setInteger("height", cu1Var.q);
        cd4.b(mediaFormat, cu1Var.m);
        f2 = cu1Var.r;
        if (f2 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f2);
        }
        cd4.a(mediaFormat, "rotation-degrees", cu1Var.s);
        eu5Var = cu1Var.w;
        if (eu5Var != null) {
            cd4.a(mediaFormat, "color-transfer", eu5Var.c);
            cd4.a(mediaFormat, "color-standard", eu5Var.a);
            cd4.a(mediaFormat, "color-range", eu5Var.b);
            byte[] bArr = eu5Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(cu1Var.k) && (b = lu5.b(cu1Var)) != null) {
            cd4.a(mediaFormat, "profile", ((Integer) b.first).intValue());
        }
        mediaFormat.setInteger("max-width", h06Var.a);
        mediaFormat.setInteger("max-height", h06Var.b);
        cd4.a(mediaFormat, "max-input-size", h06Var.c);
        i4 = zn4.a;
        if (i4 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.t1 == null) {
            if (v0(pt5Var)) {
                if (this.u1 == null) {
                    this.u1 = l06.a(this.l1, pt5Var.f);
                }
                this.t1 = this.u1;
            } else {
                throw new IllegalStateException();
            }
        }
        if (this.o1.f()) {
            i06 i06Var = this.o1;
            i06Var.getClass();
            if (i4 >= 29 && i06Var.b.l1.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
        }
        if (this.o1.f()) {
            return new lt5(pt5Var, mediaFormat, cu1Var, this.t1);
        }
        this.o1.getClass();
        throw null;
    }

    @Override // defpackage.tt5
    public final ArrayList G(ut5 ut5Var, cu1 cu1Var) {
        nv4 r0 = r0(this.l1, cu1Var, false, false);
        Pattern pattern = lu5.a;
        ArrayList arrayList = new ArrayList(r0);
        Collections.sort(arrayList, new vt5(new om1(6, cu1Var)));
        return arrayList;
    }

    @Override // defpackage.tt5
    public final void H(Exception exc) {
        lb4.b("MediaCodecVideoRenderer", "Video codec error", exc);
        c16 c16Var = this.n1;
        Handler handler = c16Var.a;
        if (handler != null) {
            handler.post(new h74(2, c16Var, exc));
        }
    }

    @Override // defpackage.tt5
    public final void I(final String str, final long j, final long j2) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        final c16 c16Var = this.n1;
        Handler handler = c16Var.a;
        if (handler != null) {
            handler.post(new Runnable(str, j, j2) { // from class: x06
                public final /* synthetic */ String Q;

                @Override // java.lang.Runnable
                public final void run() {
                    c16 c16Var2 = c16.this;
                    String str2 = this.Q;
                    d16 d16Var = c16Var2.b;
                    int i = zn4.a;
                    pp5 pp5Var = ((xl5) d16Var).P.p;
                    io5 G = pp5Var.G();
                    pp5Var.D(G, 1016, new jk3(G, str2));
                }
            });
        }
        this.r1 = q0(str);
        pt5 pt5Var = this.x0;
        pt5Var.getClass();
        boolean z = false;
        int i = 1;
        if (zn4.a >= 29 && "video/x-vnd.on2.vp9".equals(pt5Var.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = pt5Var.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                } else if (codecProfileLevelArr[i2].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.s1 = z;
        i06 i06Var = this.o1;
        Context context = i06Var.b.l1;
        if (zn4.a >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            i = q05.j(str).startsWith("OMX.") ? 5 : Integer.MAX_VALUE;
        }
        i06Var.i = i;
    }

    @Override // defpackage.tt5
    public final void J(String str) {
        c16 c16Var = this.n1;
        Handler handler = c16Var.a;
        if (handler != null) {
            handler.post(new wi2(2, c16Var, str));
        }
    }

    @Override // defpackage.tt5
    public final void P(cu1 cu1Var, MediaFormat mediaFormat) {
        boolean z;
        int integer;
        int integer2;
        int i;
        mt5 mt5Var = this.q0;
        if (mt5Var != null) {
            mt5Var.b(this.w1);
        }
        mediaFormat.getClass();
        boolean z2 = true;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            integer = mediaFormat.getInteger("width");
        }
        if (z) {
            integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            integer2 = mediaFormat.getInteger("height");
        }
        float f = cu1Var.t;
        if (zn4.a < 21) {
            z2 = false;
        }
        if (z2) {
            int i2 = cu1Var.s;
            if (i2 == 90 || i2 == 270) {
                f = 1.0f / f;
                i = 0;
                int i3 = integer2;
                integer2 = integer;
                integer = i3;
            }
            i = 0;
        } else {
            if (!this.o1.f()) {
                i = cu1Var.s;
            }
            i = 0;
        }
        this.L1 = new wo3(f, integer, integer2, i);
        s06 s06Var = this.m1;
        s06Var.f = cu1Var.r;
        e06 e06Var = s06Var.a;
        e06Var.a.b();
        e06Var.b.b();
        e06Var.c = false;
        e06Var.d = -9223372036854775807L;
        e06Var.e = 0;
        s06Var.e();
        if (this.o1.f()) {
            i06 i06Var = this.o1;
            bs1 bs1Var = new bs1(cu1Var);
            bs1Var.o = integer;
            bs1Var.p = integer2;
            bs1Var.r = i;
            bs1Var.s = f;
            i06Var.d(new cu1(bs1Var));
        }
    }

    @Override // defpackage.tt5
    public final void R() {
        this.x1 = false;
        int i = zn4.a;
    }

    @Override // defpackage.tt5
    public final void S(gk5 gk5Var) {
        this.F1++;
        int i = zn4.a;
    }

    @Override // defpackage.tt5
    public final boolean U(long j, long j2, mt5 mt5Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, cu1 cu1Var) {
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        boolean z3;
        mt5Var.getClass();
        if (this.A1 == -9223372036854775807L) {
            this.A1 = j;
        }
        if (j3 != this.G1) {
            if (!this.o1.f()) {
                this.m1.c(j3);
            }
            this.G1 = j3;
        }
        long j9 = j3 - this.f1.b;
        if (z && !z2) {
            n0(mt5Var, i);
            return true;
        }
        boolean z4 = this.U == 2;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        double d = this.o0;
        double d2 = j3 - j;
        Double.isNaN(d2);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d);
        long j10 = (long) (d2 / d);
        if (z4) {
            j10 -= elapsedRealtime - j2;
        }
        if (this.t1 == this.u1) {
            if (!(j10 < -30000)) {
                return false;
            }
            n0(mt5Var, i);
        } else if (u0(j, j10)) {
            if (this.o1.f() && !this.o1.g(cu1Var, j9, z2)) {
                return false;
            }
            t0(mt5Var, i, j9);
        } else if (!z4 || j == this.A1) {
            return false;
        } else {
            long nanoTime = System.nanoTime();
            long j11 = j10;
            long a = this.m1.a((j10 * 1000) + nanoTime);
            if (this.o1.f()) {
                j4 = a;
                j5 = j11;
            } else {
                j5 = (a - nanoTime) / 1000;
                j4 = a;
            }
            long j12 = this.B1;
            if (j5 >= -500000 || z2) {
                j6 = j9;
                j7 = j4;
            } else {
                j7 = j4;
                ww5 ww5Var = this.V;
                ww5Var.getClass();
                j6 = j9;
                int c = ww5Var.c(j - this.X);
                if (c != 0) {
                    int i4 = (j12 > (-9223372036854775807L) ? 1 : (j12 == (-9223372036854775807L) ? 0 : -1));
                    nk5 nk5Var = this.e1;
                    if (i4 != 0) {
                        nk5Var.d += c;
                        nk5Var.f += this.F1;
                    } else {
                        nk5Var.j++;
                        o0(c, this.F1);
                    }
                    if (e0()) {
                        Y();
                    }
                    if (this.o1.f()) {
                        this.o1.a();
                        return false;
                    }
                    return false;
                }
            }
            if (((j5 > (-30000L) ? 1 : (j5 == (-30000L) ? 0 : -1)) < 0) && !z2) {
                if (j12 != -9223372036854775807L) {
                    n0(mt5Var, i);
                    z3 = true;
                } else {
                    int i5 = zn4.a;
                    Trace.beginSection("dropVideoBuffer");
                    mt5Var.c(i, false);
                    Trace.endSection();
                    z3 = true;
                    o0(0, 1);
                }
                p0(j5);
                return z3;
            } else if (this.o1.f()) {
                this.o1.b(j, j2);
                long j13 = j6;
                if (this.o1.g(cu1Var, j13, z2)) {
                    t0(mt5Var, i, j13);
                    return true;
                }
                return false;
            } else if (zn4.a >= 21) {
                if (j5 < 50000) {
                    if (j7 == this.K1) {
                        n0(mt5Var, i);
                        j8 = j7;
                    } else {
                        j8 = j7;
                        m0(mt5Var, i, j8);
                    }
                    p0(j5);
                    this.K1 = j8;
                    return true;
                }
                return false;
            } else if (j5 >= 30000) {
                return false;
            } else {
                if (j5 > 11000) {
                    try {
                        Thread.sleep(((-10000) + j5) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                l0(mt5Var, i);
                j10 = j5;
            }
        }
        p0(j10);
        return true;
    }

    @Override // defpackage.tt5
    public final nt5 W(IllegalStateException illegalStateException, pt5 pt5Var) {
        return new f06(illegalStateException, pt5Var, this.t1);
    }

    @Override // defpackage.tt5
    @TargetApi(29)
    public final void X(gk5 gk5Var) {
        if (!this.s1) {
            return;
        }
        ByteBuffer byteBuffer = gk5Var.f;
        byteBuffer.getClass();
        if (byteBuffer.remaining() >= 7) {
            byte b = byteBuffer.get();
            short s = byteBuffer.getShort();
            short s2 = byteBuffer.getShort();
            byte b2 = byteBuffer.get();
            byte b3 = byteBuffer.get();
            byteBuffer.position(0);
            if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                if (b3 == 0 || b3 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    mt5 mt5Var = this.q0;
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    mt5Var.h(bundle);
                }
            }
        }
    }

    @Override // defpackage.tt5
    public final void Z(long j) {
        super.Z(j);
        this.F1--;
    }

    @Override // defpackage.tt5
    public final void a0(cu1 cu1Var) {
        boolean z;
        int i;
        if (!this.o1.f()) {
            i06 i06Var = this.o1;
            tv2.I(!i06Var.f());
            if (i06Var.j) {
                if (i06Var.f == null) {
                    i06Var.j = false;
                    return;
                }
                eu5 eu5Var = cu1Var.w;
                if (eu5Var != null) {
                    if (eu5Var.c == 7) {
                    }
                } else {
                    int i2 = eu5.f;
                }
                i06Var.e = zn4.u();
                try {
                    if (zn4.a >= 21) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && (i = cu1Var.s) != 0) {
                        CopyOnWriteArrayList copyOnWriteArrayList = i06Var.f;
                        gv4.j();
                        Object newInstance = gv4.P.newInstance(new Object[0]);
                        gv4.Q.invoke(newInstance, Float.valueOf(i));
                        Object invoke = gv4.R.invoke(newInstance, new Object[0]);
                        invoke.getClass();
                        copyOnWriteArrayList.add(0, (dm1) invoke);
                    }
                    gv4.j();
                    fm3 fm3Var = (fm3) gv4.S.newInstance(new Object[0]);
                    i06Var.f.getClass();
                    i06Var.e.getClass();
                    dn3 a = fm3Var.a();
                    i06Var.getClass();
                    Pair pair = i06Var.h;
                    if (pair != null) {
                        Surface surface = (Surface) pair.first;
                        ((ai4) pair.second).getClass();
                        a.f();
                    }
                    i06Var.d(cu1Var);
                } catch (Exception e) {
                    throw i06Var.b.n(7000, cu1Var, e, false);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.view.Surface] */
    @Override // defpackage.mk5, defpackage.ln5
    public final void c(int i, Object obj) {
        l06 l06Var;
        c16 c16Var;
        Handler handler;
        l06 l06Var2;
        c16 c16Var2;
        Handler handler2;
        Surface surface;
        if (i != 1) {
            if (i != 7) {
                if (i != 10) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 13) {
                                if (i == 14) {
                                    obj.getClass();
                                    ai4 ai4Var = (ai4) obj;
                                    if (ai4Var.a != 0 && ai4Var.b != 0 && (surface = this.t1) != null) {
                                        this.o1.e(surface, ai4Var);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            List list = (List) obj;
                            i06 i06Var = this.o1;
                            CopyOnWriteArrayList copyOnWriteArrayList = i06Var.f;
                            if (copyOnWriteArrayList == null) {
                                i06Var.f = new CopyOnWriteArrayList(list);
                                return;
                            }
                            copyOnWriteArrayList.clear();
                            i06Var.f.addAll(list);
                            return;
                        }
                        s06 s06Var = this.m1;
                        int intValue = ((Integer) obj).intValue();
                        if (s06Var.j != intValue) {
                            s06Var.j = intValue;
                            s06Var.f(true);
                            return;
                        }
                        return;
                    }
                    int intValue2 = ((Integer) obj).intValue();
                    this.w1 = intValue2;
                    mt5 mt5Var = this.q0;
                    if (mt5Var != null) {
                        mt5Var.b(intValue2);
                        return;
                    }
                    return;
                }
                int intValue3 = ((Integer) obj).intValue();
                if (this.N1 != intValue3) {
                    this.N1 = intValue3;
                    return;
                }
                return;
            }
            this.O1 = (m06) obj;
            return;
        }
        if (obj instanceof Surface) {
            l06Var = (Surface) obj;
        } else {
            l06Var = null;
        }
        if (l06Var == null) {
            l06 l06Var3 = this.u1;
            if (l06Var3 != null) {
                l06Var = l06Var3;
            } else {
                pt5 pt5Var = this.x0;
                if (pt5Var != null && v0(pt5Var)) {
                    l06Var = l06.a(this.l1, pt5Var.f);
                    this.u1 = l06Var;
                }
            }
        }
        if (this.t1 != l06Var) {
            this.t1 = l06Var;
            s06 s06Var2 = this.m1;
            s06Var2.getClass();
            if (true == (l06Var instanceof l06)) {
                l06Var2 = null;
            } else {
                l06Var2 = l06Var;
            }
            if (s06Var2.e != l06Var2) {
                s06Var2.d();
                s06Var2.e = l06Var2;
                s06Var2.f(true);
            }
            this.v1 = false;
            int i2 = this.U;
            mt5 mt5Var2 = this.q0;
            if (mt5Var2 != null && !this.o1.f()) {
                if (zn4.a >= 23 && l06Var != null && !this.r1) {
                    mt5Var2.i(l06Var);
                } else {
                    b0();
                    Y();
                }
            }
            if (l06Var != null && l06Var != this.u1) {
                wo3 wo3Var = this.M1;
                if (wo3Var != null && (handler2 = (c16Var2 = this.n1).a) != null) {
                    handler2.post(new yk5(5, c16Var2, wo3Var));
                }
                this.x1 = false;
                int i3 = zn4.a;
                if (i2 == 2) {
                    this.B1 = -9223372036854775807L;
                }
                if (this.o1.f()) {
                    this.o1.e(l06Var, ai4.c);
                    return;
                }
                return;
            }
            this.M1 = null;
            this.x1 = false;
            int i4 = zn4.a;
            if (this.o1.f()) {
                this.o1.getClass();
                throw null;
            }
        } else if (l06Var != null && l06Var != this.u1) {
            wo3 wo3Var2 = this.M1;
            if (wo3Var2 != null && (handler = (c16Var = this.n1).a) != null) {
                handler.post(new yk5(5, c16Var, wo3Var2));
            }
            if (this.v1) {
                c16 c16Var3 = this.n1;
                Surface surface2 = this.t1;
                if (c16Var3.a != null) {
                    c16Var3.a.post(new u06(c16Var3, surface2, SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // defpackage.tt5
    public final void c0() {
        super.c0();
        this.F1 = 0;
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final void f(float f, float f2) {
        super.f(f, f2);
        s06 s06Var = this.m1;
        s06Var.i = f;
        s06Var.m = 0L;
        s06Var.p = -1L;
        s06Var.n = -1L;
        s06Var.f(false);
    }

    @Override // defpackage.tt5
    public final boolean f0(pt5 pt5Var) {
        return this.t1 != null || v0(pt5Var);
    }

    @Override // defpackage.mk5
    public final String h() {
        return "MediaCodecVideoRenderer";
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final void i(long j, long j2) {
        super.i(j, j2);
        if (this.o1.f()) {
            this.o1.b(j, j2);
        }
    }

    @Override // defpackage.mk5
    public final boolean j() {
        boolean z = this.c1;
        if (this.o1.f()) {
            return false;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r0 != false) goto L12;
     */
    @Override // defpackage.tt5, defpackage.mk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k() {
        l06 l06Var;
        boolean z;
        if (super.k()) {
            if (this.o1.f()) {
                Pair pair = this.o1.h;
                if (pair != null && ((ai4) pair.second).equals(ai4.c)) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (this.x1 || (((l06Var = this.u1) != null && this.t1 == l06Var) || this.q0 == null)) {
                this.B1 = -9223372036854775807L;
                return true;
            }
        }
        if (this.B1 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.B1) {
            return true;
        }
        this.B1 = -9223372036854775807L;
        return false;
    }

    public final void k0() {
        this.z1 = true;
        if (!this.x1) {
            this.x1 = true;
            c16 c16Var = this.n1;
            Surface surface = this.t1;
            if (c16Var.a != null) {
                c16Var.a.post(new u06(c16Var, surface, SystemClock.elapsedRealtime()));
            }
            this.v1 = true;
        }
    }

    public final void l0(mt5 mt5Var, int i) {
        int i2 = zn4.a;
        Trace.beginSection("releaseOutputBuffer");
        mt5Var.c(i, true);
        Trace.endSection();
        this.e1.e++;
        this.E1 = 0;
        if (this.o1.f()) {
            return;
        }
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        s0(this.L1);
        k0();
    }

    public final void m0(mt5 mt5Var, int i, long j) {
        int i2 = zn4.a;
        Trace.beginSection("releaseOutputBuffer");
        mt5Var.k(j, i);
        Trace.endSection();
        this.e1.e++;
        this.E1 = 0;
        if (this.o1.f()) {
            return;
        }
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        s0(this.L1);
        k0();
    }

    public final void n0(mt5 mt5Var, int i) {
        int i2 = zn4.a;
        Trace.beginSection("skipVideoBuffer");
        mt5Var.c(i, false);
        Trace.endSection();
        this.e1.f++;
    }

    public final void o0(int i, int i2) {
        nk5 nk5Var = this.e1;
        nk5Var.h += i;
        int i3 = i + i2;
        nk5Var.g += i3;
        this.D1 += i3;
        int i4 = this.E1 + i3;
        this.E1 = i4;
        nk5Var.i = Math.max(i4, nk5Var.i);
    }

    public final void p0(long j) {
        nk5 nk5Var = this.e1;
        nk5Var.k += j;
        nk5Var.l++;
        this.I1 += j;
        this.J1++;
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final void r() {
        this.M1 = null;
        this.x1 = false;
        int i = zn4.a;
        this.v1 = false;
        try {
            super.r();
            c16 c16Var = this.n1;
            nk5 nk5Var = this.e1;
            c16Var.getClass();
            synchronized (nk5Var) {
            }
            Handler handler = c16Var.a;
            if (handler != null) {
                handler.post(new qh1(c16Var, nk5Var, 7));
            }
        } catch (Throwable th) {
            c16 c16Var2 = this.n1;
            nk5 nk5Var2 = this.e1;
            c16Var2.getClass();
            synchronized (nk5Var2) {
                Handler handler2 = c16Var2.a;
                if (handler2 != null) {
                    handler2.post(new qh1(c16Var2, nk5Var2, 7));
                }
                throw th;
            }
        }
    }

    @Override // defpackage.mk5
    public final void s(boolean z, boolean z2) {
        this.e1 = new nk5();
        this.R.getClass();
        c16 c16Var = this.n1;
        nk5 nk5Var = this.e1;
        Handler handler = c16Var.a;
        if (handler != null) {
            handler.post(new w06(c16Var, nk5Var));
        }
        this.y1 = z2;
        this.z1 = false;
    }

    public final void s0(wo3 wo3Var) {
        if (!wo3Var.equals(wo3.e) && !wo3Var.equals(this.M1)) {
            this.M1 = wo3Var;
            c16 c16Var = this.n1;
            Handler handler = c16Var.a;
            if (handler != null) {
                handler.post(new yk5(5, c16Var, wo3Var));
            }
        }
    }

    @Override // defpackage.tt5, defpackage.mk5
    public final void t(long j, boolean z) {
        super.t(j, z);
        if (this.o1.f()) {
            this.o1.a();
        }
        this.x1 = false;
        int i = zn4.a;
        s06 s06Var = this.m1;
        s06Var.m = 0L;
        s06Var.p = -1L;
        s06Var.n = -1L;
        this.G1 = -9223372036854775807L;
        this.A1 = -9223372036854775807L;
        this.E1 = 0;
        this.B1 = -9223372036854775807L;
    }

    public final void t0(mt5 mt5Var, int i, long j) {
        long nanoTime;
        if (this.o1.f()) {
            nanoTime = (this.f1.b + j) * 1000;
        } else {
            nanoTime = System.nanoTime();
        }
        if (zn4.a >= 21) {
            m0(mt5Var, i, nanoTime);
        } else {
            l0(mt5Var, i);
        }
    }

    @Override // defpackage.mk5
    @TargetApi(17)
    public final void u() {
        try {
            D();
            b0();
            this.j1 = null;
        } finally {
            if (this.o1.f()) {
                this.o1.c();
            }
            l06 l06Var = this.u1;
            if (l06Var != null) {
                if (this.t1 == l06Var) {
                    this.t1 = null;
                }
                l06Var.release();
                this.u1 = null;
            }
        }
    }

    public final boolean u0(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.U;
        boolean z4 = this.z1;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z4 ? !this.x1 : !(!z && !this.y1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        long elapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.H1;
        if (this.B1 != -9223372036854775807L || j < this.f1.b) {
            return false;
        }
        if (!z2) {
            if (!z) {
                return false;
            }
            if (j2 < -30000) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || elapsedRealtime <= 100000) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.mk5
    public final void v() {
        this.D1 = 0;
        this.C1 = SystemClock.elapsedRealtime();
        this.H1 = SystemClock.elapsedRealtime() * 1000;
        this.I1 = 0L;
        this.J1 = 0;
        s06 s06Var = this.m1;
        s06Var.d = true;
        s06Var.m = 0L;
        s06Var.p = -1L;
        s06Var.n = -1L;
        if (s06Var.b != null) {
            r06 r06Var = s06Var.c;
            r06Var.getClass();
            r06Var.Q.sendEmptyMessage(1);
            s06Var.b.b(new dk5(5, s06Var));
        }
        s06Var.f(false);
    }

    public final boolean v0(pt5 pt5Var) {
        return zn4.a >= 23 && !q0(pt5Var.a) && (!pt5Var.f || l06.c(this.l1));
    }

    @Override // defpackage.mk5
    public final void w() {
        this.B1 = -9223372036854775807L;
        if (this.D1 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            final long j = elapsedRealtime - this.C1;
            final c16 c16Var = this.n1;
            final int i = this.D1;
            Handler handler = c16Var.a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: t06
                    @Override // java.lang.Runnable
                    public final void run() {
                        c16 c16Var2 = c16Var;
                        final int i2 = i;
                        final long j2 = j;
                        d16 d16Var = c16Var2.b;
                        int i3 = zn4.a;
                        pp5 pp5Var = ((xl5) d16Var).P.p;
                        final io5 E = pp5Var.E((ov5) pp5Var.S.e);
                        pp5Var.D(E, 1018, new v64(i2, j2, E) { // from class: yo5
                            public final /* synthetic */ int P;

                            @Override // defpackage.v64
                            /* renamed from: e */
                            public final void mo5e(Object obj) {
                                ((jo5) obj).u0(this.P);
                            }
                        });
                    }
                });
            }
            this.D1 = 0;
            this.C1 = elapsedRealtime;
        }
        final int i2 = this.J1;
        if (i2 != 0) {
            final c16 c16Var2 = this.n1;
            final long j2 = this.I1;
            Handler handler2 = c16Var2.a;
            if (handler2 != null) {
                handler2.post(new Runnable(i2, j2, c16Var2) { // from class: v06
                    public final /* synthetic */ c16 P;

                    {
                        this.P = c16Var2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        d16 d16Var = this.P.b;
                        int i3 = zn4.a;
                        pp5 pp5Var = ((xl5) d16Var).P.p;
                        pp5Var.D(pp5Var.E((ov5) pp5Var.S.e), 1021, new to5());
                    }
                });
            }
            this.I1 = 0L;
            this.J1 = 0;
        }
        s06 s06Var = this.m1;
        s06Var.d = false;
        p06 p06Var = s06Var.b;
        if (p06Var != null) {
            p06Var.a();
            r06 r06Var = s06Var.c;
            r06Var.getClass();
            r06Var.Q.sendEmptyMessage(2);
        }
        s06Var.d();
    }

    @Override // defpackage.tt5
    public final float z(float f, cu1[] cu1VarArr) {
        float f2 = -1.0f;
        for (cu1 cu1Var : cu1VarArr) {
            float f3 = cu1Var.r;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }
}