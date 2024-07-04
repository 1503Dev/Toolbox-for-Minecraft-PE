package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

/* renamed from: lz5  reason: default package */
public final class lz5 implements iz5, bf5 {
    public static final nw4 b0 = nv4.w(4400000L, 3200000L, 2300000L, 1600000L, 810000L);
    public static final nw4 c0 = nv4.w(1400000L, 990000L, 730000L, 510000L, 230000L);
    public static final nw4 d0 = nv4.w(2100000L, 1400000L, 1000000L, 890000L, 640000L);
    public static final nw4 e0 = nv4.w(2600000L, 1700000L, 1300000L, 1000000L, 700000L);
    public static final nw4 f0 = nv4.w(5700000L, 3700000L, 2300000L, 1700000L, 990000L);
    public static final nw4 g0 = nv4.w(2800000L, 1800000L, 1400000L, 1100000L, 870000L);
    public static lz5 h0;
    public final sw4 P;
    public final hz5 Q = new hz5();
    public final vz5 R = new vz5();
    public final boolean S = true;
    public int T;
    public long U;
    public long V;
    public int W;
    public long X;
    public long Y;
    public long Z;
    public long a0;

    public lz5(Context context, HashMap hashMap) {
        int i;
        this.P = qv4.b(hashMap);
        if (context != null) {
            gg4 a = gg4.a(context);
            synchronized (a.c) {
                i = a.d;
            }
            this.W = i;
            this.Z = c(i);
            kz5 kz5Var = new kz5(this);
            Iterator it = a.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    a.b.remove(weakReference);
                }
            }
            a.b.add(new WeakReference(kz5Var));
            a.a.post(new bm3(1, a, kz5Var));
            return;
        }
        this.W = 0;
        this.Z = c(0);
    }

    public static synchronized lz5 a(Context context) {
        lz5 lz5Var;
        String country;
        TelephonyManager telephonyManager;
        synchronized (lz5.class) {
            if (h0 == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                int i = zn4.a;
                if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                    country = telephonyManager.getNetworkCountryIso();
                    if (!TextUtils.isEmpty(country)) {
                        int[] f = f(q05.j(country));
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        nw4 nw4Var = b0;
                        hashMap.put(2, (Long) nw4Var.get(f[0]));
                        hashMap.put(3, (Long) c0.get(f[1]));
                        hashMap.put(4, (Long) d0.get(f[2]));
                        hashMap.put(5, (Long) e0.get(f[3]));
                        hashMap.put(10, (Long) f0.get(f[4]));
                        hashMap.put(9, (Long) g0.get(f[5]));
                        hashMap.put(7, (Long) nw4Var.get(f[0]));
                        h0 = new lz5(applicationContext, hashMap);
                    }
                }
                country = Locale.getDefault().getCountry();
                int[] f2 = f(q05.j(country));
                HashMap hashMap2 = new HashMap(8);
                hashMap2.put(0, 1000000L);
                nw4 nw4Var2 = b0;
                hashMap2.put(2, (Long) nw4Var2.get(f2[0]));
                hashMap2.put(3, (Long) c0.get(f2[1]));
                hashMap2.put(4, (Long) d0.get(f2[2]));
                hashMap2.put(5, (Long) e0.get(f2[3]));
                hashMap2.put(10, (Long) f0.get(f2[4]));
                hashMap2.put(9, (Long) g0.get(f2[5]));
                hashMap2.put(7, (Long) nw4Var2.get(f2[0]));
                h0 = new lz5(applicationContext, hashMap2);
            }
            lz5Var = h0;
        }
        return lz5Var;
    }

    public static void b(lz5 lz5Var, int i) {
        int i2;
        synchronized (lz5Var) {
            int i3 = lz5Var.W;
            if ((i3 == 0 || lz5Var.S) && i3 != i) {
                lz5Var.W = i;
                if (i != 1 && i != 0 && i != 8) {
                    lz5Var.Z = lz5Var.c(i);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (lz5Var.T > 0) {
                        i2 = (int) (elapsedRealtime - lz5Var.U);
                    } else {
                        i2 = 0;
                    }
                    lz5Var.e(lz5Var.V, i2, lz5Var.Z);
                    lz5Var.U = elapsedRealtime;
                    lz5Var.V = 0L;
                    lz5Var.Y = 0L;
                    lz5Var.X = 0L;
                    vz5 vz5Var = lz5Var.R;
                    vz5Var.a.clear();
                    vz5Var.c = -1;
                    vz5Var.d = 0;
                    vz5Var.e = 0;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x013d, code lost:
        if (r3.equals("WS") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0147, code lost:
        if (r3.equals("WF") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0189, code lost:
        if (r3.equals("VE") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0193, code lost:
        if (r3.equals("VC") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x019d, code lost:
        if (r3.equals("VA") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01b5, code lost:
        if (r3.equals("UY") != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01cd, code lost:
        if (r3.equals("UG") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01e5, code lost:
        if (r3.equals("TZ") != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01fd, code lost:
        if (r3.equals("TV") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0223, code lost:
        if (r3.equals("TO") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x022d, code lost:
        if (r3.equals("TN") != false) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0234, code lost:
        return new int[]{2, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x023b, code lost:
        if (r3.equals("TM") != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0253, code lost:
        if (r3.equals("TK") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x025d, code lost:
        if (r3.equals("TJ") != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0275, code lost:
        if (r3.equals("TG") != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x027f, code lost:
        if (r3.equals("TD") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x02a5, code lost:
        if (r3.equals("SY") != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02af, code lost:
        if (r3.equals("SX") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x02b9, code lost:
        if (r3.equals("SV") != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x02d1, code lost:
        if (r3.equals("SS") != false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x02d8, code lost:
        return new int[]{4, 2, 2, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x02fb, code lost:
        if (r3.equals("SN") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0305, code lost:
        if (r3.equals("SM") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x030f, code lost:
        if (r3.equals("SL") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0327, code lost:
        if (r3.equals("SJ") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0331, code lost:
        if (r3.equals("SI") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x033b, code lost:
        if (r3.equals("SH") != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x037d, code lost:
        if (r3.equals("SB") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
        if (r3.equals("CI") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0384, code lost:
        return new int[]{4, 2, 4, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x038b, code lost:
        if (r3.equals("SA") != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x03e9, code lost:
        if (r3.equals("PY") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x042b, code lost:
        if (r3.equals("PM") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0443, code lost:
        if (r3.equals("PK") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x045b, code lost:
        if (r3.equals("PG") != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0465, code lost:
        if (r3.equals("PF") != false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x046c, code lost:
        return new int[]{2, 3, 3, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
        if (r3.equals("CG") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0061, code lost:
        if (r3.equals("CF") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x050d, code lost:
        if (r3.equals("NE") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0533, code lost:
        if (r3.equals("MZ") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x053a, code lost:
        return new int[]{3, 1, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006b, code lost:
        if (r3.equals("BT") != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0579, code lost:
        if (r3.equals("MU") != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0580, code lost:
        return new int[]{3, 1, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0587, code lost:
        if (r3.equals("MT") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0591, code lost:
        if (r3.equals("MS") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x05a9, code lost:
        if (r3.equals("MQ") != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0075, code lost:
        if (r3.equals("BS") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x05b3, code lost:
        if (r3.equals("MP") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x05e7, code lost:
        if (r3.equals("ML") != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x05ee, code lost:
        return new int[]{3, 4, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0611, code lost:
        if (r3.equals("MG") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x061b, code lost:
        if (r3.equals("MF") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0622, code lost:
        return new int[]{1, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0661, code lost:
        if (r3.equals("LY") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0668, code lost:
        return new int[]{3, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x066f, code lost:
        if (r3.equals("LV") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0687, code lost:
        if (r3.equals("LT") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0691, code lost:
        if (r3.equals("LS") != false) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0698, code lost:
        return new int[]{3, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008d, code lost:
        if (r3.equals("BQ") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x06bb, code lost:
        if (r3.equals("LI") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x06c5, code lost:
        if (r3.equals("LC") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x06cf, code lost:
        if (r3.equals("LB") != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x06d6, code lost:
        return new int[]{3, 2, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x06eb, code lost:
        if (r3.equals("KZ") != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x06f5, code lost:
        if (r3.equals("KY") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x071b, code lost:
        if (r3.equals("KN") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0725, code lost:
        if (r3.equals("KM") != false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x072f, code lost:
        if (r3.equals("KI") != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0747, code lost:
        if (r3.equals("KG") != false) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x074e, code lost:
        return new int[]{2, 1, 1, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x078d, code lost:
        if (r3.equals("JE") != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x07c1, code lost:
        if (r3.equals("IQ") != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x07c8, code lost:
        return new int[]{3, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x07cf, code lost:
        if (r3.equals("IO") != false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x07d6, code lost:
        return new int[]{4, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0807, code lost:
        if (r3.equals("IE") != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b3, code lost:
        if (r3.equals("BM") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x081f, code lost:
        if (r3.equals("HU") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0829, code lost:
        if (r3.equals("HT") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x0833, code lost:
        if (r3.equals("HR") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0875, code lost:
        if (r3.equals("GU") != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bd, code lost:
        if (r3.equals("BL") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x088d, code lost:
        if (r3.equals("GR") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:661:0x08cf, code lost:
        if (r3.equals("GL") != false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:663:0x08d6, code lost:
        return new int[]{2, 2, 2, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x08dd, code lost:
        if (r3.equals("GI") != false) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x08e4, code lost:
        return new int[]{1, 2, 0, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x08eb, code lost:
        if (r3.equals("GH") != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x08f2, code lost:
        return new int[]{3, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0907, code lost:
        if (r3.equals("GF") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x090e, code lost:
        return new int[]{3, 2, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0923, code lost:
        if (r3.equals("GD") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x092a, code lost:
        return new int[]{1, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x093f, code lost:
        if (r3.equals("GA") != false) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x0946, code lost:
        return new int[]{3, 4, 1, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x095b, code lost:
        if (r3.equals("FO") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x098f, code lost:
        if (r3.equals("ET") != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0996, code lost:
        return new int[]{4, 4, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x099d, code lost:
        if (r3.equals("ES") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:723:0x09a7, code lost:
        if (r3.equals("ER") != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x09b1, code lost:
        if (r3.equals("EG") != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:728:0x09b8, code lost:
        return new int[]{3, 4, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x09bf, code lost:
        if (r3.equals("EE") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x09d6, code lost:
        if (r3.equals("DZ") != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x09ee, code lost:
        if (r3.equals("DM") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x09f8, code lost:
        if (r3.equals("DK") != false) goto L422;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x09ff, code lost:
        return new int[]{0, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x0a06, code lost:
        if (r3.equals("DJ") != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x0a0d, code lost:
        return new int[]{4, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x0a30, code lost:
        if (r3.equals("CY") != false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x0a37, code lost:
        return new int[]{1, 0, 0, 0, 0, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x0a3e, code lost:
        if (r3.equals("CX") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x0a48, code lost:
        if (r3.equals("CW") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x0a60, code lost:
        if (r3.equals("CU") != false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x0a67, code lost:
        return new int[]{4, 2, 4, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f1, code lost:
        if (r3.equals("ZW") != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x0ab4, code lost:
        if (r3.equals("CK") != false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x0abe, code lost:
        if (r3.equals("CD") != false) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:806:0x0ac5, code lost:
        return new int[]{4, 3, 3, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:820:0x0af6, code lost:
        if (r3.equals("BI") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0afd, code lost:
        return new int[]{4, 4, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:828:0x0b12, code lost:
        if (r3.equals("BG") != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0b19, code lost:
        return new int[]{0, 0, 0, 0, 1, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x0b20, code lost:
        if (r3.equals("BF") != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0b37, code lost:
        if (r3.equals("BD") != false) goto L512;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x0b3e, code lost:
        return new int[]{2, 1, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x0b45, code lost:
        if (r3.equals("AZ") != false) goto L702;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x0b4c, code lost:
        return new int[]{3, 3, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x0b53, code lost:
        if (r3.equals("AQ") != false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x0b5a, code lost:
        return new int[]{4, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x0b6f, code lost:
        if (r3.equals("AI") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x0b86, code lost:
        if (r3.equals("AF") != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:864:0x0b8d, code lost:
        return new int[]{4, 3, 3, 3, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0ba2, code lost:
        if (r3.equals("AD") != false) goto L728;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0ba9, code lost:
        return new int[]{2, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0bb0, code lost:
        if (r3.equals("BZ") != false) goto L758;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0bb7, code lost:
        return new int[]{2, 2, 2, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x0bcc, code lost:
        if (r3.equals("BB") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x0bd3, code lost:
        return new int[]{0, 2, 0, 0, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:886:0x0bda, code lost:
        if (r3.equals("BA") != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0be1, code lost:
        return new int[]{1, 1, 1, 1, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:890:0x0be8, code lost:
        if (r3.equals("AX") != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:892:0x0bef, code lost:
        return new int[]{0, 2, 2, 2, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:894:0x0bf6, code lost:
        if (r3.equals("AW") != false) goto L620;
     */
    /* JADX WARN: Code restructure failed: missing block: B:896:0x0bfd, code lost:
        return new int[]{1, 2, 4, 4, 2, 2};
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0125, code lost:
        if (r3.equals("YE") != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int[] f(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 2091) {
            if (hashCode != 2092) {
                if (hashCode != 2102) {
                    if (hashCode != 2103) {
                        if (hashCode != 2111) {
                            if (hashCode != 2112) {
                                if (hashCode != 2135) {
                                    if (hashCode != 2136) {
                                        switch (hashCode) {
                                            case 2083:
                                                break;
                                            case 2084:
                                                if (str.equals("AE")) {
                                                    return new int[]{1, 4, 3, 4, 4, 2};
                                                }
                                                break;
                                            case 2085:
                                                break;
                                            case 2086:
                                                if (str.equals("AG")) {
                                                    return new int[]{2, 4, 3, 4, 2, 2};
                                                }
                                                break;
                                            default:
                                                switch (hashCode) {
                                                    case 2088:
                                                        break;
                                                    case 2094:
                                                        if (str.equals("AO")) {
                                                            return new int[]{4, 4, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2096:
                                                        break;
                                                    case 2105:
                                                        break;
                                                    case 2114:
                                                        break;
                                                    case 2115:
                                                        if (str.equals("BE")) {
                                                            return new int[]{0, 1, 4, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2116:
                                                        break;
                                                    case 2117:
                                                        break;
                                                    case 2118:
                                                        if (str.equals("BH")) {
                                                            return new int[]{1, 3, 1, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2119:
                                                        break;
                                                    case 2120:
                                                        if (str.equals("BJ")) {
                                                            return new int[]{4, 4, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2133:
                                                        if (str.equals("BW")) {
                                                            return new int[]{3, 2, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2142:
                                                        if (str.equals("CA")) {
                                                            return new int[]{0, 2, 3, 3, 3, 3};
                                                        }
                                                        break;
                                                    case 2145:
                                                        break;
                                                    case 2152:
                                                        break;
                                                    case 2153:
                                                        if (str.equals("CL")) {
                                                            return new int[]{1, 1, 2, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2154:
                                                        if (str.equals("CM")) {
                                                            return new int[]{4, 3, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2155:
                                                        if (str.equals("CN")) {
                                                            return new int[]{2, 0, 4, 3, 3, 1};
                                                        }
                                                        break;
                                                    case 2156:
                                                        if (str.equals("CO")) {
                                                            return new int[]{2, 3, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2159:
                                                        if (str.equals("CR")) {
                                                            return new int[]{2, 4, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2162:
                                                        break;
                                                    case 2163:
                                                        if (str.equals("CV")) {
                                                            return new int[]{2, 3, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2164:
                                                        break;
                                                    case 2165:
                                                        break;
                                                    case 2166:
                                                        break;
                                                    case 2167:
                                                        if (str.equals("CZ")) {
                                                            return new int[]{0, 0, 2, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2177:
                                                        if (str.equals("DE")) {
                                                            return new int[]{0, 1, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2182:
                                                        break;
                                                    case 2183:
                                                        break;
                                                    case 2185:
                                                        break;
                                                    case 2187:
                                                        if (str.equals("DO")) {
                                                            return new int[]{3, 4, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2198:
                                                        break;
                                                    case 2206:
                                                        if (str.equals("EC")) {
                                                            return new int[]{1, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2208:
                                                        break;
                                                    case 2210:
                                                        break;
                                                    case 2221:
                                                        break;
                                                    case 2222:
                                                        break;
                                                    case 2223:
                                                        break;
                                                    case 2243:
                                                        if (str.equals("FI")) {
                                                            return new int[]{0, 0, 0, 2, 0, 2};
                                                        }
                                                        break;
                                                    case 2244:
                                                        if (str.equals("FJ")) {
                                                            return new int[]{3, 1, 2, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2247:
                                                        if (str.equals("FM")) {
                                                            return new int[]{4, 2, 3, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2249:
                                                        break;
                                                    case 2252:
                                                        if (str.equals("FR")) {
                                                            return new int[]{1, 1, 2, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2266:
                                                        break;
                                                    case 2267:
                                                        if (str.equals("GB")) {
                                                            return new int[]{0, 1, 1, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2269:
                                                        break;
                                                    case 2270:
                                                        if (str.equals("GE")) {
                                                            return new int[]{1, 0, 0, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2271:
                                                        break;
                                                    case 2272:
                                                        if (str.equals("GG")) {
                                                            return new int[]{0, 2, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2273:
                                                        break;
                                                    case 2274:
                                                        break;
                                                    case 2277:
                                                        break;
                                                    case 2278:
                                                        if (str.equals("GM")) {
                                                            return new int[]{4, 3, 2, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2279:
                                                        if (str.equals("GN")) {
                                                            return new int[]{4, 4, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2281:
                                                        if (str.equals("GP")) {
                                                            return new int[]{3, 1, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2282:
                                                        if (str.equals("GQ")) {
                                                            return new int[]{4, 4, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2283:
                                                        break;
                                                    case 2285:
                                                        if (str.equals("GT")) {
                                                            return new int[]{2, 2, 2, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2286:
                                                        break;
                                                    case 2288:
                                                        if (str.equals("GW")) {
                                                            return new int[]{4, 4, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2290:
                                                        if (str.equals("GY")) {
                                                            return new int[]{3, 0, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2307:
                                                        if (str.equals("HK")) {
                                                            return new int[]{0, 1, 1, 3, 2, 0};
                                                        }
                                                        break;
                                                    case 2310:
                                                        if (str.equals("HN")) {
                                                            return new int[]{3, 3, 2, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2314:
                                                        break;
                                                    case 2316:
                                                        break;
                                                    case 2317:
                                                        break;
                                                    case 2331:
                                                        if (str.equals("ID")) {
                                                            return new int[]{3, 1, 1, 2, 3, 2};
                                                        }
                                                        break;
                                                    case 2332:
                                                        break;
                                                    case 2339:
                                                        if (str.equals("IL")) {
                                                            return new int[]{1, 2, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2340:
                                                        if (str.equals("IM")) {
                                                            return new int[]{0, 2, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2341:
                                                        if (str.equals("IN")) {
                                                            return new int[]{1, 1, 2, 1, 2, 1};
                                                        }
                                                        break;
                                                    case 2342:
                                                        break;
                                                    case 2344:
                                                        break;
                                                    case 2345:
                                                        if (str.equals("IR")) {
                                                            return new int[]{4, 2, 3, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2346:
                                                        if (str.equals("IS")) {
                                                            return new int[]{0, 0, 1, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2347:
                                                        if (str.equals("IT")) {
                                                            return new int[]{0, 0, 1, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2363:
                                                        break;
                                                    case 2371:
                                                        if (str.equals("JM")) {
                                                            return new int[]{2, 4, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2373:
                                                        if (str.equals("JO")) {
                                                            return new int[]{2, 0, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2374:
                                                        if (str.equals("JP")) {
                                                            return new int[]{0, 3, 3, 3, 4, 4};
                                                        }
                                                        break;
                                                    case 2394:
                                                        if (str.equals("KE")) {
                                                            return new int[]{3, 2, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2396:
                                                        break;
                                                    case 2397:
                                                        if (str.equals("KH")) {
                                                            return new int[]{1, 0, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2398:
                                                        break;
                                                    case 2402:
                                                        break;
                                                    case 2403:
                                                        break;
                                                    case 2407:
                                                        if (str.equals("KR")) {
                                                            return new int[]{0, 2, 2, 4, 4, 4};
                                                        }
                                                        break;
                                                    case 2412:
                                                        if (str.equals("KW")) {
                                                            return new int[]{1, 0, 1, 0, 0, 2};
                                                        }
                                                        break;
                                                    case 2414:
                                                        break;
                                                    case 2415:
                                                        break;
                                                    case 2421:
                                                        if (str.equals("LA")) {
                                                            return new int[]{1, 2, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2422:
                                                        break;
                                                    case 2423:
                                                        break;
                                                    case 2429:
                                                        break;
                                                    case 2431:
                                                        if (str.equals("LK")) {
                                                            return new int[]{3, 2, 3, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2438:
                                                        if (str.equals("LR")) {
                                                            return new int[]{3, 4, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2439:
                                                        break;
                                                    case 2440:
                                                        break;
                                                    case 2441:
                                                        if (str.equals("LU")) {
                                                            return new int[]{1, 1, 4, 2, 0, 2};
                                                        }
                                                        break;
                                                    case 2442:
                                                        break;
                                                    case 2445:
                                                        break;
                                                    case 2452:
                                                        if (str.equals("MA")) {
                                                            return new int[]{3, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2454:
                                                        if (str.equals("MC")) {
                                                            return new int[]{0, 2, 2, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2455:
                                                        if (str.equals("MD")) {
                                                            return new int[]{1, 0, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2456:
                                                        if (str.equals("ME")) {
                                                            return new int[]{2, 0, 0, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2457:
                                                        break;
                                                    case 2458:
                                                        break;
                                                    case 2459:
                                                        if (str.equals("MH")) {
                                                            return new int[]{4, 2, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2462:
                                                        if (str.equals("MK")) {
                                                            return new int[]{2, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2463:
                                                        break;
                                                    case 2464:
                                                        if (str.equals("MM")) {
                                                            return new int[]{2, 2, 2, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2465:
                                                        if (str.equals("MN")) {
                                                            return new int[]{2, 0, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2466:
                                                        if (str.equals("MO")) {
                                                            return new int[]{0, 2, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2467:
                                                        break;
                                                    case 2468:
                                                        break;
                                                    case 2469:
                                                        if (str.equals("MR")) {
                                                            return new int[]{4, 2, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2470:
                                                        break;
                                                    case 2471:
                                                        break;
                                                    case 2472:
                                                        break;
                                                    case 2473:
                                                        if (str.equals("MV")) {
                                                            return new int[]{3, 4, 1, 3, 3, 2};
                                                        }
                                                        break;
                                                    case 2474:
                                                        if (str.equals("MW")) {
                                                            return new int[]{4, 2, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2475:
                                                        if (str.equals("MX")) {
                                                            return new int[]{3, 4, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2476:
                                                        if (str.equals("MY")) {
                                                            return new int[]{1, 0, 4, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2477:
                                                        break;
                                                    case 2483:
                                                        if (str.equals("NA")) {
                                                            return new int[]{3, 4, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2485:
                                                        if (str.equals("NC")) {
                                                            return new int[]{3, 2, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2487:
                                                        break;
                                                    case 2489:
                                                        if (str.equals("NG")) {
                                                            return new int[]{3, 4, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2491:
                                                        if (str.equals("NI")) {
                                                            return new int[]{2, 3, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2494:
                                                        if (str.equals("NL")) {
                                                            return new int[]{0, 2, 3, 3, 0, 4};
                                                        }
                                                        break;
                                                    case 2497:
                                                        if (str.equals("NO")) {
                                                            return new int[]{0, 1, 2, 1, 1, 2};
                                                        }
                                                        break;
                                                    case 2498:
                                                        if (str.equals("NP")) {
                                                            return new int[]{2, 1, 4, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2500:
                                                        if (str.equals("NR")) {
                                                            return new int[]{4, 0, 3, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2503:
                                                        if (str.equals("NU")) {
                                                            return new int[]{4, 2, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2508:
                                                        if (str.equals("NZ")) {
                                                            return new int[]{1, 0, 2, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2526:
                                                        if (str.equals("OM")) {
                                                            return new int[]{2, 3, 1, 3, 4, 2};
                                                        }
                                                        break;
                                                    case 2545:
                                                        if (str.equals("PA")) {
                                                            return new int[]{2, 3, 3, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2549:
                                                        if (str.equals("PE")) {
                                                            return new int[]{1, 2, 4, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2550:
                                                        break;
                                                    case 2551:
                                                        break;
                                                    case 2552:
                                                        if (str.equals("PH")) {
                                                            return new int[]{2, 1, 3, 2, 2, 0};
                                                        }
                                                        break;
                                                    case 2555:
                                                        break;
                                                    case 2556:
                                                        if (str.equals("PL")) {
                                                            return new int[]{2, 1, 2, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2557:
                                                        break;
                                                    case 2562:
                                                        if (str.equals("PR")) {
                                                            return new int[]{2, 0, 2, 0, 2, 1};
                                                        }
                                                        break;
                                                    case 2563:
                                                        if (str.equals("PS")) {
                                                            return new int[]{3, 4, 1, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2564:
                                                        if (str.equals("PT")) {
                                                            return new int[]{1, 0, 0, 0, 1, 2};
                                                        }
                                                        break;
                                                    case 2567:
                                                        if (str.equals("PW")) {
                                                            return new int[]{2, 2, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2569:
                                                        break;
                                                    case 2576:
                                                        if (str.equals("QA")) {
                                                            return new int[]{1, 4, 4, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2611:
                                                        if (str.equals("RE")) {
                                                            return new int[]{1, 2, 2, 3, 1, 2};
                                                        }
                                                        break;
                                                    case 2621:
                                                        if (str.equals("RO")) {
                                                            return new int[]{0, 0, 1, 2, 1, 2};
                                                        }
                                                        break;
                                                    case 2625:
                                                        if (str.equals("RS")) {
                                                            return new int[]{2, 0, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2627:
                                                        if (str.equals("RU")) {
                                                            return new int[]{1, 0, 0, 0, 3, 3};
                                                        }
                                                        break;
                                                    case 2629:
                                                        if (str.equals("RW")) {
                                                            return new int[]{3, 3, 1, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2638:
                                                        break;
                                                    case 2639:
                                                        break;
                                                    case 2640:
                                                        if (str.equals("SC")) {
                                                            return new int[]{4, 3, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2641:
                                                        if (str.equals("SD")) {
                                                            return new int[]{4, 3, 4, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2642:
                                                        if (str.equals("SE")) {
                                                            return new int[]{0, 1, 1, 1, 0, 2};
                                                        }
                                                        break;
                                                    case 2644:
                                                        if (str.equals("SG")) {
                                                            return new int[]{2, 3, 3, 3, 3, 3};
                                                        }
                                                        break;
                                                    case 2645:
                                                        break;
                                                    case 2646:
                                                        break;
                                                    case 2647:
                                                        break;
                                                    case 2648:
                                                        if (str.equals("SK")) {
                                                            return new int[]{1, 1, 1, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2649:
                                                        break;
                                                    case 2650:
                                                        break;
                                                    case 2651:
                                                        break;
                                                    case 2652:
                                                        if (str.equals("SO")) {
                                                            return new int[]{3, 2, 2, 4, 4, 2};
                                                        }
                                                        break;
                                                    case 2655:
                                                        if (str.equals("SR")) {
                                                            return new int[]{2, 4, 3, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2656:
                                                        break;
                                                    case 2657:
                                                        if (str.equals("ST")) {
                                                            return new int[]{2, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2659:
                                                        break;
                                                    case 2661:
                                                        break;
                                                    case 2662:
                                                        break;
                                                    case 2663:
                                                        if (str.equals("SZ")) {
                                                            return new int[]{4, 4, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2671:
                                                        if (str.equals("TC")) {
                                                            return new int[]{2, 2, 1, 3, 2, 2};
                                                        }
                                                        break;
                                                    case 2672:
                                                        break;
                                                    case 2675:
                                                        break;
                                                    case 2676:
                                                        if (str.equals("TH")) {
                                                            return new int[]{0, 1, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2678:
                                                        break;
                                                    case 2679:
                                                        break;
                                                    case 2680:
                                                        if (str.equals("TL")) {
                                                            return new int[]{4, 2, 4, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2681:
                                                        break;
                                                    case 2682:
                                                        break;
                                                    case 2683:
                                                        break;
                                                    case 2686:
                                                        if (str.equals("TR")) {
                                                            return new int[]{1, 0, 0, 1, 3, 2};
                                                        }
                                                        break;
                                                    case 2688:
                                                        if (str.equals("TT")) {
                                                            return new int[]{1, 4, 0, 0, 2, 2};
                                                        }
                                                        break;
                                                    case 2690:
                                                        break;
                                                    case 2691:
                                                        if (str.equals("TW")) {
                                                            return new int[]{0, 2, 0, 0, 0, 0};
                                                        }
                                                        break;
                                                    case 2694:
                                                        break;
                                                    case 2700:
                                                        if (str.equals("UA")) {
                                                            return new int[]{0, 1, 1, 2, 4, 2};
                                                        }
                                                        break;
                                                    case 2706:
                                                        break;
                                                    case 2718:
                                                        if (str.equals("US")) {
                                                            return new int[]{1, 1, 4, 1, 3, 1};
                                                        }
                                                        break;
                                                    case 2724:
                                                        break;
                                                    case 2725:
                                                        if (str.equals("UZ")) {
                                                            return new int[]{2, 2, 3, 4, 3, 2};
                                                        }
                                                        break;
                                                    case 2731:
                                                        break;
                                                    case 2733:
                                                        break;
                                                    case 2735:
                                                        break;
                                                    case 2737:
                                                        if (str.equals("VG")) {
                                                            return new int[]{2, 2, 0, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2739:
                                                        if (str.equals("VI")) {
                                                            return new int[]{0, 2, 1, 2, 2, 2};
                                                        }
                                                        break;
                                                    case 2744:
                                                        if (str.equals("VN")) {
                                                            return new int[]{0, 0, 1, 2, 2, 1};
                                                        }
                                                        break;
                                                    case 2751:
                                                        if (str.equals("VU")) {
                                                            return new int[]{4, 3, 3, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2767:
                                                        break;
                                                    case 2780:
                                                        break;
                                                    case 2803:
                                                        if (str.equals("XK")) {
                                                            return new int[]{1, 2, 1, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2828:
                                                        break;
                                                    case 2843:
                                                        if (str.equals("YT")) {
                                                            return new int[]{2, 3, 3, 4, 2, 2};
                                                        }
                                                        break;
                                                    case 2855:
                                                        if (str.equals("ZA")) {
                                                            return new int[]{2, 3, 2, 1, 2, 2};
                                                        }
                                                        break;
                                                    case 2867:
                                                        if (str.equals("ZM")) {
                                                            return new int[]{4, 4, 4, 3, 3, 2};
                                                        }
                                                        break;
                                                    case 2877:
                                                        break;
                                                    default:
                                                        switch (hashCode) {
                                                            case 2098:
                                                                if (str.equals("AS")) {
                                                                    return new int[]{2, 2, 3, 3, 2, 2};
                                                                }
                                                                break;
                                                            case 2099:
                                                                if (str.equals("AT")) {
                                                                    return new int[]{1, 2, 1, 4, 1, 4};
                                                                }
                                                                break;
                                                            case 2100:
                                                                if (str.equals("AU")) {
                                                                    return new int[]{0, 2, 1, 1, 3, 0};
                                                                }
                                                                break;
                                                            default:
                                                                switch (hashCode) {
                                                                    case 2122:
                                                                        break;
                                                                    case 2123:
                                                                        break;
                                                                    case 2124:
                                                                        if (str.equals("BN")) {
                                                                            return new int[]{3, 2, 0, 1, 2, 2};
                                                                        }
                                                                        break;
                                                                    case 2125:
                                                                        if (str.equals("BO")) {
                                                                            return new int[]{1, 2, 3, 2, 2, 2};
                                                                        }
                                                                        break;
                                                                    default:
                                                                        switch (hashCode) {
                                                                            case 2127:
                                                                                break;
                                                                            case 2128:
                                                                                if (str.equals("BR")) {
                                                                                    return new int[]{1, 1, 2, 1, 1, 0};
                                                                                }
                                                                                break;
                                                                            case 2129:
                                                                                break;
                                                                            case 2130:
                                                                                break;
                                                                            default:
                                                                                switch (hashCode) {
                                                                                    case 2149:
                                                                                        if (str.equals("CH")) {
                                                                                            return new int[]{0, 0, 0, 0, 0, 3};
                                                                                        }
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                    }
                                } else if (str.equals("BY")) {
                                    return new int[]{1, 1, 2, 3, 2, 2};
                                }
                            }
                        }
                    }
                }
            } else if (str.equals("AM")) {
                return new int[]{2, 3, 2, 3, 2, 2};
            }
        } else if (str.equals("AL")) {
            return new int[]{1, 1, 1, 3, 2, 2};
        }
        return new int[]{2, 2, 2, 2, 2, 2};
    }

    public final long c(int i) {
        Long l = (Long) this.P.get(Integer.valueOf(i));
        if (l == null) {
            l = (Long) this.P.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    @Override // defpackage.bf5
    public final void d() {
    }

    public final void e(long j, int i, final long j2) {
        if (i == 0) {
            if (j == 0) {
                if (j2 != this.a0) {
                    j = 0;
                } else {
                    return;
                }
            }
            i = 0;
        }
        this.a0 = j2;
        Iterator it = this.Q.a.iterator();
        while (it.hasNext()) {
            final gz5 gz5Var = (gz5) it.next();
            if (!gz5Var.c) {
                final int i2 = i;
                final long j3 = j;
                gz5Var.a.post(new Runnable() { // from class: fz5
                    @Override // java.lang.Runnable
                    public final void run() {
                        rt4 rt4Var;
                        Object next;
                        Object obj;
                        ov5 ov5Var;
                        gz5 gz5Var2 = gz5.this;
                        final int i3 = i2;
                        final long j4 = j3;
                        final long j5 = j2;
                        pp5 pp5Var = (pp5) gz5Var2.b;
                        p43 p43Var = pp5Var.S;
                        if (((nv4) p43Var.b).isEmpty()) {
                            ov5Var = null;
                        } else {
                            nv4 nv4Var = (nv4) p43Var.b;
                            if (nv4Var instanceof List) {
                                if (!nv4Var.isEmpty()) {
                                    obj = nv4Var.get(nv4Var.size() - 1);
                                } else {
                                    throw new NoSuchElementException();
                                }
                            } else {
                                Iterator it2 = nv4Var.iterator();
                                do {
                                    rt4Var = (rt4) it2;
                                    next = rt4Var.next();
                                } while (rt4Var.hasNext());
                                obj = next;
                            }
                            ov5Var = (ov5) obj;
                        }
                        final io5 E = pp5Var.E(ov5Var);
                        pp5Var.D(E, 1006, new v64(i3, j4, j5) { // from class: so5
                            public final /* synthetic */ int Q;
                            public final /* synthetic */ long R;

                            @Override // defpackage.v64
                            /* renamed from: e */
                            public final void mo5e(Object obj2) {
                                ((jo5) obj2).l(io5.this, this.Q, this.R);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000f, code lost:
        if (r3 == false) goto L11;
     */
    @Override // defpackage.bf5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void g(kz4 kz4Var, boolean z, int i) {
        boolean z2;
        boolean z3 = true;
        if (z) {
            if ((kz4Var.f & 8) == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        z3 = false;
        if (!z3) {
            return;
        }
        this.V += i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0016 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x0007, B:17:0x0018, B:21:0x001e, B:23:0x0039, B:25:0x0053, B:28:0x0065, B:27:0x005c, B:29:0x0073), top: B:35:0x0007 }] */
    @Override // defpackage.bf5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void h(kz4 kz4Var, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (z) {
            if ((kz4Var.f & 8) == 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                z2 = true;
                if (z2) {
                    return;
                }
                if (this.T <= 0) {
                    z4 = false;
                }
                tv2.I(z4);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i = (int) (elapsedRealtime - this.U);
                this.X += i;
                long j = this.Y;
                long j2 = this.V;
                this.Y = j + j2;
                if (i > 0) {
                    this.R.b((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i);
                    if (this.X >= 2000 || this.Y >= 524288) {
                        this.Z = this.R.a();
                    }
                    e(this.V, i, this.Z);
                    this.U = elapsedRealtime;
                    this.V = 0L;
                }
                this.T--;
                return;
            }
        }
        z2 = false;
        if (z2) {
        }
    }

    @Override // defpackage.bf5
    public final synchronized void i(fv4 fv4Var, kz4 kz4Var, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (z) {
            if ((kz4Var.f & 8) == 8) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = true;
            }
        }
        if (!z3) {
            return;
        }
        if (this.T == 0) {
            this.U = SystemClock.elapsedRealtime();
        }
        this.T++;
    }
}