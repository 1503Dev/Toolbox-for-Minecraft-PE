package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: op1  reason: default package */
public final class op1 implements lk1 {
    public static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final UUID g0;
    public static final Map h0;
    public long A;
    public long B;
    public gc4 C;
    public gc4 D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;
    public final lp1 a;
    public boolean a0;
    public final qp1 b;
    public nk1 b0;
    public final SparseArray c;
    public final boolean d;
    public final kh4 e;
    public final kh4 f;
    public final kh4 g;
    public final kh4 h;
    public final kh4 i;
    public final kh4 j;
    public final kh4 k;
    public final kh4 l;
    public final kh4 m;
    public final kh4 n;
    public ByteBuffer o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public np1 u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public long z;

    static {
        int i = zn4.a;
        d0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(zs4.c);
        e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        h0 = Collections.unmodifiableMap(hashMap);
    }

    public op1() {
        lp1 lp1Var = new lp1();
        this.q = -1L;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.t = -9223372036854775807L;
        this.z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.a = lp1Var;
        lp1Var.d = new mp1(this);
        this.d = true;
        this.b = new qp1();
        this.c = new SparseArray();
        this.g = new kh4(4);
        this.h = new kh4(ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new kh4(4);
        this.e = new kh4(hl1.a);
        this.f = new kh4(4);
        this.j = new kh4();
        this.k = new kh4();
        this.l = new kh4(8);
        this.m = new kh4();
        this.n = new kh4();
        this.L = new int[1];
    }

    public static byte[] n(long j, String str, long j2) {
        tv2.G(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        int i4 = zn4.a;
        return format.getBytes(zs4.c);
    }

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        pp1 pp1Var = new pp1();
        long j = p16Var.c;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        p16Var.B(((kh4) pp1Var.Q).a, 0, 4, false);
        pp1Var.P = 4;
        for (long u = ((kh4) pp1Var.Q).u(); u != 440786851; u = ((u << 8) & (-256)) | (((kh4) pp1Var.Q).a[0] & 255)) {
            int i = (int) j2;
            int i2 = pp1Var.P + 1;
            pp1Var.P = i2;
            if (i2 == i) {
                return false;
            }
            p16Var.B(((kh4) pp1Var.Q).a, 0, 1, false);
        }
        long a = pp1Var.a(p16Var);
        long j3 = pp1Var.P;
        if (a == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j3 + a >= j) {
            return false;
        }
        while (true) {
            long j4 = pp1Var.P;
            long j5 = j3 + a;
            if (j4 < j5) {
                if (pp1Var.a(p16Var) == Long.MIN_VALUE) {
                    return false;
                }
                long a2 = pp1Var.a(p16Var);
                if (a2 < 0) {
                    return false;
                }
                if (a2 != 0) {
                    int i3 = (int) a2;
                    p16Var.h(i3, false);
                    pp1Var.P += i3;
                }
            } else if (j4 != j5) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0557, code lost:
        if (r3.t() == r5.getLeastSignificantBits()) goto L249;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:331:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x07e3  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x093b  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x09c4  */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, np1] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.ArrayIndexOutOfBoundsException] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.ArrayIndexOutOfBoundsException] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        int i2;
        char c;
        char c2;
        String str;
        List singletonList;
        String str2;
        List list;
        String str3;
        String str4;
        String str5;
        long s;
        Pair pair;
        String str6;
        ArrayList arrayList;
        int i3;
        ArrayList arrayList2;
        String str7;
        boolean z;
        String str8;
        int m;
        int i4;
        StringBuilder sb;
        String str9;
        int i5;
        int i6;
        String str10;
        String str11;
        bs1 bs1Var;
        int i7;
        int i8;
        int i9;
        eu5 eu5Var;
        int i10;
        byte[] bArr;
        int i11;
        String str12;
        jk1 a;
        ml1 ll1Var;
        int i12;
        int i13;
        tv2.B(this.b0);
        if (i == 160) {
            if (this.G != 2) {
                return;
            }
            np1 np1Var = (np1) this.c.get(this.M);
            np1Var.X.getClass();
            if (this.R > 0 && "A_OPUS".equals(np1Var.b)) {
                kh4 kh4Var = this.n;
                byte[] array = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array();
                kh4Var.c(array, array.length);
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.K; i15++) {
                i14 += this.L[i15];
            }
            int i16 = 0;
            while (i16 < this.K) {
                long j = this.H + ((np1Var.e * i16) / 1000);
                int i17 = this.O;
                if (i16 == 0) {
                    if (!this.Q) {
                        i17 |= 1;
                    }
                    i2 = 0;
                } else {
                    i2 = i16;
                }
                int i18 = this.L[i2];
                int i19 = i14 - i18;
                j(np1Var, j, i17, i18, i19);
                i16 = i2 + 1;
                i14 = i19;
            }
            this.G = 0;
        } else if (i == 174) {
            ?? r0 = this.u;
            tv2.B(r0);
            String str13 = r0.b;
            if (str13 == null) {
                throw jy2.a("CodecId is missing in TrackEntry element", null);
            }
            switch (str13.hashCode()) {
                case -2095576542:
                    if (str13.equals("V_MPEG4/ISO/AP")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -2095575984:
                    if (str13.equals("V_MPEG4/ISO/SP")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1985379776:
                    if (str13.equals("A_MS/ACM")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -1784763192:
                    if (str13.equals("A_TRUEHD")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -1730367663:
                    if (str13.equals("A_VORBIS")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641358:
                    if (str13.equals("A_MPEG/L2")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1482641357:
                    if (str13.equals("A_MPEG/L3")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -1373388978:
                    if (str13.equals("V_MS/VFW/FOURCC")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -933872740:
                    if (str13.equals("S_DVBSUB")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case -538363189:
                    if (str13.equals("V_MPEG4/ISO/ASP")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -538363109:
                    if (str13.equals("V_MPEG4/ISO/AVC")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -425012669:
                    if (str13.equals("S_VOBSUB")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case -356037306:
                    if (str13.equals("A_DTS/LOSSLESS")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case 62923557:
                    if (str13.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 62923603:
                    if (str13.equals("A_AC3")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case 62927045:
                    if (str13.equals("A_DTS")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case 82318131:
                    if (str13.equals("V_AV1")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338133:
                    if (str13.equals("V_VP8")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 82338134:
                    if (str13.equals("V_VP9")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 99146302:
                    if (str13.equals("S_HDMV/PGS")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 444813526:
                    if (str13.equals("V_THEORA")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 542569478:
                    if (str13.equals("A_DTS/EXPRESS")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case 635596514:
                    if (str13.equals("A_PCM/FLOAT/IEEE")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case 725948237:
                    if (str13.equals("A_PCM/INT/BIG")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case 725957860:
                    if (str13.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case 738597099:
                    if (str13.equals("S_TEXT/ASS")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case 855502857:
                    if (str13.equals("V_MPEGH/ISO/HEVC")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1045209816:
                    if (str13.equals("S_TEXT/WEBVTT")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case 1422270023:
                    if (str13.equals("S_TEXT/UTF8")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case 1809237540:
                    if (str13.equals("V_MPEG2")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950749482:
                    if (str13.equals("A_EAC3")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case 1950789798:
                    if (str13.equals("A_FLAC")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case 1951062397:
                    if (str13.equals("A_OPUS")) {
                        c = 11;
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
                    nk1 nk1Var = this.b0;
                    int i20 = r0.c;
                    String str14 = r0.b;
                    switch (str14.hashCode()) {
                        case -2095576542:
                            if (str14.equals("V_MPEG4/ISO/AP")) {
                                c2 = 6;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -2095575984:
                            if (str14.equals("V_MPEG4/ISO/SP")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1985379776:
                            if (str14.equals("A_MS/ACM")) {
                                c2 = 23;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1784763192:
                            if (str14.equals("A_TRUEHD")) {
                                c2 = 18;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1730367663:
                            if (str14.equals("A_VORBIS")) {
                                c2 = 11;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1482641358:
                            if (str14.equals("A_MPEG/L2")) {
                                c2 = 14;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1482641357:
                            if (str14.equals("A_MPEG/L3")) {
                                c2 = 15;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -1373388978:
                            if (str14.equals("V_MS/VFW/FOURCC")) {
                                c2 = '\t';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -933872740:
                            if (str14.equals("S_DVBSUB")) {
                                c2 = ' ';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -538363189:
                            if (str14.equals("V_MPEG4/ISO/ASP")) {
                                c2 = 5;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -538363109:
                            if (str14.equals("V_MPEG4/ISO/AVC")) {
                                c2 = 7;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -425012669:
                            if (str14.equals("S_VOBSUB")) {
                                c2 = 30;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -356037306:
                            if (str14.equals("A_DTS/LOSSLESS")) {
                                c2 = 21;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62923557:
                            if (str14.equals("A_AAC")) {
                                c2 = '\r';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62923603:
                            if (str14.equals("A_AC3")) {
                                c2 = 16;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 62927045:
                            if (str14.equals("A_DTS")) {
                                c2 = 19;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82318131:
                            if (str14.equals("V_AV1")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82338133:
                            if (str14.equals("V_VP8")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 82338134:
                            if (str14.equals("V_VP9")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 99146302:
                            if (str14.equals("S_HDMV/PGS")) {
                                c2 = 31;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 444813526:
                            if (str14.equals("V_THEORA")) {
                                c2 = '\n';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 542569478:
                            if (str14.equals("A_DTS/EXPRESS")) {
                                c2 = 20;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 635596514:
                            if (str14.equals("A_PCM/FLOAT/IEEE")) {
                                c2 = 26;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 725948237:
                            if (str14.equals("A_PCM/INT/BIG")) {
                                c2 = 25;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 725957860:
                            if (str14.equals("A_PCM/INT/LIT")) {
                                c2 = 24;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 738597099:
                            if (str14.equals("S_TEXT/ASS")) {
                                c2 = 28;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 855502857:
                            if (str14.equals("V_MPEGH/ISO/HEVC")) {
                                c2 = '\b';
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1045209816:
                            if (str14.equals("S_TEXT/WEBVTT")) {
                                c2 = 29;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1422270023:
                            if (str14.equals("S_TEXT/UTF8")) {
                                c2 = 27;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1809237540:
                            if (str14.equals("V_MPEG2")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1950749482:
                            if (str14.equals("A_EAC3")) {
                                c2 = 17;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1950789798:
                            if (str14.equals("A_FLAC")) {
                                c2 = 22;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 1951062397:
                            if (str14.equals("A_OPUS")) {
                                c2 = '\f';
                                break;
                            }
                            c2 = 65535;
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    ?? r6 = "MatroskaExtractor";
                    String str15 = "audio/raw";
                    switch (c2) {
                        case 0:
                            str = "video/x-vnd.on2.vp8";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null || (a = jk1.a(new kh4(r0.N))) == null) {
                                str11 = str10;
                            } else {
                                str11 = a.a;
                                str15 = "video/dolby-vision";
                            }
                            int i21 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                                bs1Var.w = r0.O;
                                bs1Var.x = r0.Q;
                                bs1Var.y = i5;
                                i7 = 1;
                            } else if (mx2.f(str15)) {
                                if (r0.q == 0) {
                                    int i22 = r0.o;
                                    i8 = -1;
                                    if (i22 == -1) {
                                        i22 = r0.m;
                                    }
                                    r0.o = i22;
                                    int i23 = r0.p;
                                    if (i23 == -1) {
                                        i23 = r0.n;
                                    }
                                    r0.p = i23;
                                } else {
                                    i8 = -1;
                                }
                                float f = (r0.o == i8 || (i11 = r0.p) == i8) ? -1.0f : (r0.n * i9) / (r0.m * i11);
                                if (r0.x) {
                                    if (r0.D == -1.0f || r0.E == -1.0f || r0.F == -1.0f || r0.G == -1.0f || r0.H == -1.0f || r0.I == -1.0f || r0.J == -1.0f || r0.K == -1.0f || r0.L == -1.0f || r0.M == -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = new byte[25];
                                        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                                        order.put((byte) 0);
                                        order.putShort((short) ((r0.D * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.E * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.F * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.G * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.H * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.I * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.J * 50000.0f) + 0.5f));
                                        order.putShort((short) ((r0.K * 50000.0f) + 0.5f));
                                        order.putShort((short) (r0.L + 0.5f));
                                        order.putShort((short) (r0.M + 0.5f));
                                        order.putShort((short) r0.B);
                                        order.putShort((short) r0.C);
                                    }
                                    eu5Var = new eu5(r0.y, r0.A, r0.z, bArr);
                                } else {
                                    eu5Var = null;
                                }
                                String str16 = r0.a;
                                if (str16 != null) {
                                    Map map = h0;
                                    if (map.containsKey(str16)) {
                                        i10 = ((Integer) map.get(r0.a)).intValue();
                                        if (r0.r == 0 && Float.compare(r0.s, 0.0f) == 0 && Float.compare(r0.t, 0.0f) == 0) {
                                            if (Float.compare(r0.u, 0.0f) != 0) {
                                                i10 = 0;
                                            } else if (Float.compare(r0.t, 90.0f) == 0) {
                                                i10 = 90;
                                            } else if (Float.compare(r0.t, -180.0f) == 0 || Float.compare(r0.t, 180.0f) == 0) {
                                                i10 = 180;
                                            } else if (Float.compare(r0.t, -90.0f) == 0) {
                                                i10 = 270;
                                            }
                                        }
                                        bs1Var.o = r0.m;
                                        bs1Var.p = r0.n;
                                        bs1Var.s = f;
                                        bs1Var.r = i10;
                                        bs1Var.t = r0.v;
                                        bs1Var.u = r0.w;
                                        bs1Var.v = eu5Var;
                                        i7 = 2;
                                    }
                                }
                                i10 = -1;
                                if (r0.r == 0) {
                                    if (Float.compare(r0.u, 0.0f) != 0) {
                                    }
                                }
                                bs1Var.o = r0.m;
                                bs1Var.p = r0.n;
                                bs1Var.s = f;
                                bs1Var.r = i10;
                                bs1Var.t = r0.v;
                                bs1Var.u = r0.w;
                                bs1Var.v = eu5Var;
                                i7 = 2;
                            } else if (!"application/x-subrip".equals(str15) && !"text/x-ssa".equals(str15) && !"text/vtt".equals(str15) && !"application/vobsub".equals(str15) && !"application/pgs".equals(str15) && !"application/dvbsubs".equals(str15)) {
                                throw jy2.a("Unexpected MIME type.", null);
                            } else {
                                i7 = 3;
                            }
                            str12 = r0.a;
                            if (str12 != null && !h0.containsKey(str12)) {
                                bs1Var.b = r0.a;
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var = new cu1(bs1Var);
                            pl1 q = nk1Var.q(r0.c, i7);
                            r0.X = q;
                            q.e(cu1Var);
                            this.c.put(r0.c, r0);
                            break;
                        case 1:
                            str = "video/x-vnd.on2.vp9";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                                break;
                            }
                            str11 = str10;
                            int i212 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                                bs1Var.b = r0.a;
                                break;
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2 = new cu1(bs1Var);
                            pl1 q2 = nk1Var.q(r0.c, i7);
                            r0.X = q2;
                            q2.e(cu1Var2);
                            this.c.put(r0.c, r0);
                            break;
                        case 2:
                            str = "video/av01";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22 = new cu1(bs1Var);
                            pl1 q22 = nk1Var.q(r0.c, i7);
                            r0.X = q22;
                            q22.e(cu1Var22);
                            this.c.put(r0.c, r0);
                            break;
                        case 3:
                            str = "video/mpeg2";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222 = new cu1(bs1Var);
                            pl1 q222 = nk1Var.q(r0.c, i7);
                            r0.X = q222;
                            q222.e(cu1Var222);
                            this.c.put(r0.c, r0);
                            break;
                        case 4:
                        case 5:
                        case 6:
                            byte[] bArr2 = r0.k;
                            singletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                            str2 = "video/mp4v-es";
                            str4 = str2;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222 = new cu1(bs1Var);
                            pl1 q2222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222;
                            q2222.e(cu1Var2222);
                            this.c.put(r0.c, r0);
                            break;
                        case 7:
                            h16 a2 = h16.a(new kh4(r0.a(r0.b)));
                            list = a2.a;
                            r0.Y = a2.b;
                            str3 = a2.f;
                            str4 = "video/avc";
                            List list2 = list;
                            str5 = str3;
                            singletonList = list2;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222 = new cu1(bs1Var);
                            pl1 q22222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222;
                            q22222.e(cu1Var22222);
                            this.c.put(r0.c, r0);
                            break;
                        case '\b':
                            vk1 a3 = vk1.a(new kh4(r0.a(r0.b)));
                            list = a3.a;
                            r0.Y = a3.b;
                            str3 = a3.d;
                            str4 = "video/hevc";
                            List list22 = list;
                            str5 = str3;
                            singletonList = list22;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222 = new cu1(bs1Var);
                            pl1 q222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222;
                            q222222.e(cu1Var222222);
                            this.c.put(r0.c, r0);
                            break;
                        case '\t':
                            kh4 kh4Var2 = new kh4(r0.a(r0.b));
                            try {
                                kh4Var2.f(16);
                                s = kh4Var2.s();
                            } catch (ArrayIndexOutOfBoundsException unused) {
                                r6 = 0;
                            }
                            try {
                                if (s == 1482049860) {
                                    r6 = 0;
                                    pair = new Pair("video/divx", null);
                                } else if (s == 859189832) {
                                    r6 = 0;
                                    pair = new Pair("video/3gpp", null);
                                } else if (s == 826496599) {
                                    int i24 = kh4Var2.b + 20;
                                    byte[] bArr3 = kh4Var2.a;
                                    while (true) {
                                        int length = bArr3.length;
                                        if (i24 >= length - 4) {
                                            throw jy2.a("Failed to find FourCC VC1 initialization data", null);
                                        }
                                        if (bArr3[i24] == 0 && bArr3[i24 + 1] == 0 && bArr3[i24 + 2] == 1) {
                                            if (bArr3[i24 + 3] == 15) {
                                                pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr3, i24, length)));
                                            }
                                        }
                                        i24++;
                                    }
                                } else {
                                    lb4.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                    pair = new Pair("video/x-unknown", null);
                                    str2 = (String) pair.first;
                                    singletonList = (List) pair.second;
                                    str4 = str2;
                                    str5 = null;
                                    str15 = str4;
                                    str7 = str5;
                                    i3 = -1;
                                    arrayList2 = singletonList;
                                    str10 = str7;
                                    i6 = i3;
                                    i5 = -1;
                                    if (r0.N != null) {
                                    }
                                    str11 = str10;
                                    int i212222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                    bs1Var = new bs1();
                                    if (mx2.e(str15)) {
                                    }
                                    str12 = r0.a;
                                    if (str12 != null) {
                                    }
                                    bs1Var.c(i20);
                                    bs1Var.j = str15;
                                    bs1Var.k = i6;
                                    bs1Var.c = r0.W;
                                    bs1Var.d = i212222222;
                                    bs1Var.l = arrayList2;
                                    bs1Var.g = str11;
                                    bs1Var.m = r0.l;
                                    cu1 cu1Var2222222 = new cu1(bs1Var);
                                    pl1 q2222222 = nk1Var.q(r0.c, i7);
                                    r0.X = q2222222;
                                    q2222222.e(cu1Var2222222);
                                    this.c.put(r0.c, r0);
                                    break;
                                }
                                str2 = (String) pair.first;
                                singletonList = (List) pair.second;
                                str4 = str2;
                                str5 = null;
                                str15 = str4;
                                str7 = str5;
                                i3 = -1;
                                arrayList2 = singletonList;
                                str10 = str7;
                                i6 = i3;
                                i5 = -1;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i2122222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i2122222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var22222222 = new cu1(bs1Var);
                                pl1 q22222222 = nk1Var.q(r0.c, i7);
                                r0.X = q22222222;
                                q22222222.e(cu1Var22222222);
                                this.c.put(r0.c, r0);
                            } catch (ArrayIndexOutOfBoundsException unused2) {
                                throw jy2.a("Error parsing FourCC private data", r6);
                            }
                            break;
                        case '\n':
                            str = "video/x-unknown";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222222 = new cu1(bs1Var);
                            pl1 q222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222222;
                            q222222222.e(cu1Var222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 11:
                            byte[] a4 = r0.a(str14);
                            try {
                            } catch (ArrayIndexOutOfBoundsException unused3) {
                                r0 = 0;
                            }
                            try {
                                if (a4[0] != 2) {
                                    throw jy2.a("Error parsing vorbis codec private", null);
                                }
                                int i25 = 1;
                                int i26 = 0;
                                while (true) {
                                    int i27 = a4[i25] & 255;
                                    if (i27 != 255) {
                                        int i28 = i26 + i27;
                                        int i29 = i25 + 1;
                                        int i30 = 0;
                                        while (true) {
                                            int i31 = a4[i29] & 255;
                                            if (i31 != 255) {
                                                int i32 = i29 + 1;
                                                int i33 = i30 + i31;
                                                if (a4[i32] != 1) {
                                                    throw jy2.a("Error parsing vorbis codec private", null);
                                                }
                                                byte[] bArr4 = new byte[i28];
                                                System.arraycopy(a4, i32, bArr4, 0, i28);
                                                int i34 = i32 + i28;
                                                if (a4[i34] != 3) {
                                                    throw jy2.a("Error parsing vorbis codec private", null);
                                                }
                                                int i35 = i34 + i33;
                                                if (a4[i35] != 5) {
                                                    throw jy2.a("Error parsing vorbis codec private", null);
                                                }
                                                int length2 = a4.length - i35;
                                                byte[] bArr5 = new byte[length2];
                                                System.arraycopy(a4, i35, bArr5, 0, length2);
                                                ArrayList arrayList3 = new ArrayList(2);
                                                arrayList3.add(bArr4);
                                                arrayList3.add(bArr5);
                                                str6 = "audio/vorbis";
                                                arrayList = arrayList3;
                                                i3 = 8192;
                                                str15 = str6;
                                                arrayList2 = arrayList;
                                                str7 = null;
                                                str10 = str7;
                                                i6 = i3;
                                                i5 = -1;
                                                if (r0.N != null) {
                                                }
                                                str11 = str10;
                                                int i212222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                                bs1Var = new bs1();
                                                if (mx2.e(str15)) {
                                                }
                                                str12 = r0.a;
                                                if (str12 != null) {
                                                }
                                                bs1Var.c(i20);
                                                bs1Var.j = str15;
                                                bs1Var.k = i6;
                                                bs1Var.c = r0.W;
                                                bs1Var.d = i212222222222;
                                                bs1Var.l = arrayList2;
                                                bs1Var.g = str11;
                                                bs1Var.m = r0.l;
                                                cu1 cu1Var2222222222 = new cu1(bs1Var);
                                                pl1 q2222222222 = nk1Var.q(r0.c, i7);
                                                r0.X = q2222222222;
                                                q2222222222.e(cu1Var2222222222);
                                                this.c.put(r0.c, r0);
                                                break;
                                            } else {
                                                i29++;
                                                i30 += 255;
                                            }
                                        }
                                    } else {
                                        i25++;
                                        i26 += 255;
                                    }
                                }
                            } catch (ArrayIndexOutOfBoundsException unused4) {
                                throw jy2.a("Error parsing vorbis codec private", r0);
                            }
                            break;
                        case '\f':
                            ArrayList arrayList4 = new ArrayList(3);
                            arrayList4.add(r0.a(r0.b));
                            ByteBuffer allocate = ByteBuffer.allocate(8);
                            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                            arrayList4.add(allocate.order(byteOrder).putLong(r0.R).array());
                            arrayList4.add(ByteBuffer.allocate(8).order(byteOrder).putLong(r0.S).array());
                            str6 = "audio/opus";
                            arrayList = arrayList4;
                            i3 = 5760;
                            str15 = str6;
                            arrayList2 = arrayList;
                            str7 = null;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222222222 = new cu1(bs1Var);
                            pl1 q22222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222222222;
                            q22222222222.e(cu1Var22222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case '\r':
                            singletonList = Collections.singletonList(r0.a(str14));
                            byte[] bArr6 = r0.k;
                            e16 a5 = f16.a(new eh4(bArr6, bArr6.length), false);
                            r0.Q = a5.a;
                            r0.O = a5.b;
                            str5 = a5.c;
                            str4 = "audio/mp4a-latm";
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222222222 = new cu1(bs1Var);
                            pl1 q222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222222222;
                            q222222222222.e(cu1Var222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 14:
                            str6 = "audio/mpeg-L2";
                            i3 = 4096;
                            arrayList = null;
                            str15 = str6;
                            arrayList2 = arrayList;
                            str7 = null;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222222222222 = new cu1(bs1Var);
                            pl1 q2222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222222222222;
                            q2222222222222.e(cu1Var2222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 15:
                            str6 = "audio/mpeg";
                            i3 = 4096;
                            arrayList = null;
                            str15 = str6;
                            arrayList2 = arrayList;
                            str7 = null;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222222222222 = new cu1(bs1Var);
                            pl1 q22222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222222222222;
                            q22222222222222.e(cu1Var22222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 16:
                            str = "audio/ac3";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222222222222 = new cu1(bs1Var);
                            pl1 q222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222222222222;
                            q222222222222222.e(cu1Var222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 17:
                            str = "audio/eac3";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222222222222222 = new cu1(bs1Var);
                            pl1 q2222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222222222222222;
                            q2222222222222222.e(cu1Var2222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 18:
                            r0.T = new ql1();
                            str = "audio/true-hd";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222222222222222 = new cu1(bs1Var);
                            pl1 q22222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222222222222222;
                            q22222222222222222.e(cu1Var22222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 19:
                        case 20:
                            str = "audio/vnd.dts";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222222222222222 = new cu1(bs1Var);
                            pl1 q222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222222222222222;
                            q222222222222222222.e(cu1Var222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 21:
                            str = "audio/vnd.dts.hd";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222222222222222222 = new cu1(bs1Var);
                            pl1 q2222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222222222222222222;
                            q2222222222222222222.e(cu1Var2222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 22:
                            singletonList = Collections.singletonList(r0.a(str14));
                            str2 = "audio/flac";
                            str4 = str2;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222222222222222222 = new cu1(bs1Var);
                            pl1 q22222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222222222222222222;
                            q22222222222222222222.e(cu1Var22222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 23:
                            kh4 kh4Var3 = new kh4(r0.a(r0.b));
                            try {
                                int l = kh4Var3.l();
                                if (l != 1) {
                                    if (l == 65534) {
                                        kh4Var3.e(24);
                                        long t = kh4Var3.t();
                                        UUID uuid = g0;
                                        if (t == uuid.getMostSignificantBits()) {
                                            break;
                                        }
                                    }
                                    z = false;
                                    if (!z) {
                                        m = zn4.m(r0.P);
                                        if (m == 0) {
                                            i4 = r0.P;
                                            sb = new StringBuilder();
                                            str9 = "Unsupported PCM bit depth: ";
                                            sb.append(str9);
                                            sb.append(i4);
                                            sb.append(". Setting mimeType to audio/x-unknown");
                                            str8 = sb.toString();
                                            lb4.c("MatroskaExtractor", str8);
                                            str = "audio/x-unknown";
                                            str4 = str;
                                            singletonList = null;
                                            str5 = null;
                                            str15 = str4;
                                            str7 = str5;
                                            i3 = -1;
                                            arrayList2 = singletonList;
                                            str10 = str7;
                                            i6 = i3;
                                            i5 = -1;
                                            if (r0.N != null) {
                                            }
                                            str11 = str10;
                                            int i21222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                            bs1Var = new bs1();
                                            if (mx2.e(str15)) {
                                            }
                                            str12 = r0.a;
                                            if (str12 != null) {
                                            }
                                            bs1Var.c(i20);
                                            bs1Var.j = str15;
                                            bs1Var.k = i6;
                                            bs1Var.c = r0.W;
                                            bs1Var.d = i21222222222222222222222;
                                            bs1Var.l = arrayList2;
                                            bs1Var.g = str11;
                                            bs1Var.m = r0.l;
                                            cu1 cu1Var222222222222222222222 = new cu1(bs1Var);
                                            pl1 q222222222222222222222 = nk1Var.q(r0.c, i7);
                                            r0.X = q222222222222222222222;
                                            q222222222222222222222.e(cu1Var222222222222222222222);
                                            this.c.put(r0.c, r0);
                                            break;
                                        }
                                        i5 = m;
                                        arrayList2 = null;
                                        i6 = -1;
                                        str10 = null;
                                        if (r0.N != null) {
                                        }
                                        str11 = str10;
                                        int i212222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                        bs1Var = new bs1();
                                        if (mx2.e(str15)) {
                                        }
                                        str12 = r0.a;
                                        if (str12 != null) {
                                        }
                                        bs1Var.c(i20);
                                        bs1Var.j = str15;
                                        bs1Var.k = i6;
                                        bs1Var.c = r0.W;
                                        bs1Var.d = i212222222222222222222222;
                                        bs1Var.l = arrayList2;
                                        bs1Var.g = str11;
                                        bs1Var.m = r0.l;
                                        cu1 cu1Var2222222222222222222222 = new cu1(bs1Var);
                                        pl1 q2222222222222222222222 = nk1Var.q(r0.c, i7);
                                        r0.X = q2222222222222222222222;
                                        q2222222222222222222222.e(cu1Var2222222222222222222222);
                                        this.c.put(r0.c, r0);
                                    } else {
                                        str8 = "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown";
                                        lb4.c("MatroskaExtractor", str8);
                                        str = "audio/x-unknown";
                                        str4 = str;
                                        singletonList = null;
                                        str5 = null;
                                        str15 = str4;
                                        str7 = str5;
                                        i3 = -1;
                                        arrayList2 = singletonList;
                                        str10 = str7;
                                        i6 = i3;
                                        i5 = -1;
                                        if (r0.N != null) {
                                        }
                                        str11 = str10;
                                        int i2122222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                        bs1Var = new bs1();
                                        if (mx2.e(str15)) {
                                        }
                                        str12 = r0.a;
                                        if (str12 != null) {
                                        }
                                        bs1Var.c(i20);
                                        bs1Var.j = str15;
                                        bs1Var.k = i6;
                                        bs1Var.c = r0.W;
                                        bs1Var.d = i2122222222222222222222222;
                                        bs1Var.l = arrayList2;
                                        bs1Var.g = str11;
                                        bs1Var.m = r0.l;
                                        cu1 cu1Var22222222222222222222222 = new cu1(bs1Var);
                                        pl1 q22222222222222222222222 = nk1Var.q(r0.c, i7);
                                        r0.X = q22222222222222222222222;
                                        q22222222222222222222222.e(cu1Var22222222222222222222222);
                                        this.c.put(r0.c, r0);
                                    }
                                }
                                z = true;
                                if (!z) {
                                }
                            } catch (ArrayIndexOutOfBoundsException unused5) {
                                throw jy2.a("Error parsing MS/ACM codec private", null);
                            }
                            break;
                        case 24:
                            m = zn4.m(r0.P);
                            if (m == 0) {
                                i4 = r0.P;
                                sb = new StringBuilder();
                                str9 = "Unsupported little endian PCM bit depth: ";
                                sb.append(str9);
                                sb.append(i4);
                                sb.append(". Setting mimeType to audio/x-unknown");
                                str8 = sb.toString();
                                lb4.c("MatroskaExtractor", str8);
                                str = "audio/x-unknown";
                                str4 = str;
                                singletonList = null;
                                str5 = null;
                                str15 = str4;
                                str7 = str5;
                                i3 = -1;
                                arrayList2 = singletonList;
                                str10 = str7;
                                i6 = i3;
                                i5 = -1;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i21222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i21222222222222222222222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var222222222222222222222222 = new cu1(bs1Var);
                                pl1 q222222222222222222222222 = nk1Var.q(r0.c, i7);
                                r0.X = q222222222222222222222222;
                                q222222222222222222222222.e(cu1Var222222222222222222222222);
                                this.c.put(r0.c, r0);
                                break;
                            }
                            i5 = m;
                            arrayList2 = null;
                            i6 = -1;
                            str10 = null;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222222222222222222222222 = new cu1(bs1Var);
                            pl1 q2222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222222222222222222222222;
                            q2222222222222222222222222.e(cu1Var2222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 25:
                            int i36 = r0.P;
                            if (i36 == 8) {
                                arrayList2 = null;
                                i5 = 3;
                                i6 = -1;
                                str10 = null;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i2122222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i2122222222222222222222222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var22222222222222222222222222 = new cu1(bs1Var);
                                pl1 q22222222222222222222222222 = nk1Var.q(r0.c, i7);
                                r0.X = q22222222222222222222222222;
                                q22222222222222222222222222.e(cu1Var22222222222222222222222222);
                                this.c.put(r0.c, r0);
                                break;
                            } else if (i36 == 16) {
                                m = 268435456;
                                i5 = m;
                                arrayList2 = null;
                                i6 = -1;
                                str10 = null;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i21222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i21222222222222222222222222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var222222222222222222222222222 = new cu1(bs1Var);
                                pl1 q222222222222222222222222222 = nk1Var.q(r0.c, i7);
                                r0.X = q222222222222222222222222222;
                                q222222222222222222222222222.e(cu1Var222222222222222222222222222);
                                this.c.put(r0.c, r0);
                            } else {
                                str9 = "Unsupported big endian PCM bit depth: ";
                                sb = new StringBuilder();
                                i4 = i36;
                                sb.append(str9);
                                sb.append(i4);
                                sb.append(". Setting mimeType to audio/x-unknown");
                                str8 = sb.toString();
                                lb4.c("MatroskaExtractor", str8);
                                str = "audio/x-unknown";
                                str4 = str;
                                singletonList = null;
                                str5 = null;
                                str15 = str4;
                                str7 = str5;
                                i3 = -1;
                                arrayList2 = singletonList;
                                str10 = str7;
                                i6 = i3;
                                i5 = -1;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i212222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i212222222222222222222222222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var2222222222222222222222222222 = new cu1(bs1Var);
                                pl1 q2222222222222222222222222222 = nk1Var.q(r0.c, i7);
                                r0.X = q2222222222222222222222222222;
                                q2222222222222222222222222222.e(cu1Var2222222222222222222222222222);
                                this.c.put(r0.c, r0);
                            }
                            break;
                        case 26:
                            i4 = r0.P;
                            if (i4 == 32) {
                                m = 4;
                                i5 = m;
                                arrayList2 = null;
                                i6 = -1;
                                str10 = null;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i2122222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i2122222222222222222222222222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var22222222222222222222222222222 = new cu1(bs1Var);
                                pl1 q22222222222222222222222222222 = nk1Var.q(r0.c, i7);
                                r0.X = q22222222222222222222222222222;
                                q22222222222222222222222222222.e(cu1Var22222222222222222222222222222);
                                this.c.put(r0.c, r0);
                                break;
                            } else {
                                sb = new StringBuilder();
                                str9 = "Unsupported floating point PCM bit depth: ";
                                sb.append(str9);
                                sb.append(i4);
                                sb.append(". Setting mimeType to audio/x-unknown");
                                str8 = sb.toString();
                                lb4.c("MatroskaExtractor", str8);
                                str = "audio/x-unknown";
                                str4 = str;
                                singletonList = null;
                                str5 = null;
                                str15 = str4;
                                str7 = str5;
                                i3 = -1;
                                arrayList2 = singletonList;
                                str10 = str7;
                                i6 = i3;
                                i5 = -1;
                                if (r0.N != null) {
                                }
                                str11 = str10;
                                int i21222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                                bs1Var = new bs1();
                                if (mx2.e(str15)) {
                                }
                                str12 = r0.a;
                                if (str12 != null) {
                                }
                                bs1Var.c(i20);
                                bs1Var.j = str15;
                                bs1Var.k = i6;
                                bs1Var.c = r0.W;
                                bs1Var.d = i21222222222222222222222222222222;
                                bs1Var.l = arrayList2;
                                bs1Var.g = str11;
                                bs1Var.m = r0.l;
                                cu1 cu1Var222222222222222222222222222222 = new cu1(bs1Var);
                                pl1 q222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                                r0.X = q222222222222222222222222222222;
                                q222222222222222222222222222222.e(cu1Var222222222222222222222222222222);
                                this.c.put(r0.c, r0);
                            }
                            break;
                        case 27:
                            str = "application/x-subrip";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222222222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222222222222222222222222222222 = new cu1(bs1Var);
                            pl1 q2222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222222222222222222222222222222;
                            q2222222222222222222222222222222.e(cu1Var2222222222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 28:
                            byte[] bArr7 = d0;
                            byte[] a6 = r0.a(r0.b);
                            lv4 lv4Var = nv4.Q;
                            Object[] objArr = {bArr7, a6};
                            lw4.a(2, objArr);
                            singletonList = nv4.s(2, objArr);
                            str2 = "text/x-ssa";
                            str4 = str2;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222222222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222222222222222222222222222222 = new cu1(bs1Var);
                            pl1 q22222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222222222222222222222222222222;
                            q22222222222222222222222222222222.e(cu1Var22222222222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 29:
                            str = "text/vtt";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222222222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222222222222222222222222222222 = new cu1(bs1Var);
                            pl1 q222222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222222222222222222222222222222;
                            q222222222222222222222222222222222.e(cu1Var222222222222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 30:
                            singletonList = nv4.v(r0.a(str14));
                            str2 = "application/vobsub";
                            str4 = str2;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i212222222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i212222222222222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var2222222222222222222222222222222222 = new cu1(bs1Var);
                            pl1 q2222222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q2222222222222222222222222222222222;
                            q2222222222222222222222222222222222.e(cu1Var2222222222222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case 31:
                            str = "application/pgs";
                            str4 = str;
                            singletonList = null;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i2122222222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i2122222222222222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var22222222222222222222222222222222222 = new cu1(bs1Var);
                            pl1 q22222222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q22222222222222222222222222222222222;
                            q22222222222222222222222222222222222.e(cu1Var22222222222222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        case ' ':
                            byte[] bArr8 = new byte[4];
                            System.arraycopy(r0.a(str14), 0, bArr8, 0, 4);
                            singletonList = nv4.v(bArr8);
                            str2 = "application/dvbsubs";
                            str4 = str2;
                            str5 = null;
                            str15 = str4;
                            str7 = str5;
                            i3 = -1;
                            arrayList2 = singletonList;
                            str10 = str7;
                            i6 = i3;
                            i5 = -1;
                            if (r0.N != null) {
                            }
                            str11 = str10;
                            int i21222222222222222222222222222222222222 = (r0.V ? 1 : 0) | (true != r0.U ? 0 : 2);
                            bs1Var = new bs1();
                            if (mx2.e(str15)) {
                            }
                            str12 = r0.a;
                            if (str12 != null) {
                            }
                            bs1Var.c(i20);
                            bs1Var.j = str15;
                            bs1Var.k = i6;
                            bs1Var.c = r0.W;
                            bs1Var.d = i21222222222222222222222222222222222222;
                            bs1Var.l = arrayList2;
                            bs1Var.g = str11;
                            bs1Var.m = r0.l;
                            cu1 cu1Var222222222222222222222222222222222222 = new cu1(bs1Var);
                            pl1 q222222222222222222222222222222222222 = nk1Var.q(r0.c, i7);
                            r0.X = q222222222222222222222222222222222222;
                            q222222222222222222222222222222222222.e(cu1Var222222222222222222222222222222222222);
                            this.c.put(r0.c, r0);
                            break;
                        default:
                            throw jy2.a("Unrecognized codec identifier.", null);
                    }
            }
            this.u = null;
        } else if (i == 19899) {
            int i37 = this.w;
            if (i37 != -1) {
                long j2 = this.x;
                if (j2 != -1) {
                    if (i37 == 475249515) {
                        this.z = j2;
                        return;
                    }
                    return;
                }
            }
            throw jy2.a("Mandatory element SeekID or SeekPosition not found", null);
        } else if (i == 25152) {
            h(i);
            np1 np1Var2 = this.u;
            if (np1Var2.h) {
                ol1 ol1Var = np1Var2.j;
                if (ol1Var == null) {
                    throw jy2.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                np1Var2.l = new al1(null, true, new ek1(cq5.a, "video/webm", ol1Var.b));
            }
        } else if (i == 28032) {
            h(i);
            np1 np1Var3 = this.u;
            if (np1Var3.h && np1Var3.i != null) {
                throw jy2.a("Combining encryption and compression is not supported", null);
            }
        } else if (i == 357149030) {
            if (this.r == -9223372036854775807L) {
                this.r = 1000000L;
            }
            long j3 = this.s;
            if (j3 != -9223372036854775807L) {
                this.t = f(j3);
            }
        } else if (i == 374648427) {
            if (this.c.size() == 0) {
                throw jy2.a("No valid tracks were found", null);
            }
            this.b0.j();
        } else if (i == 475249515) {
            if (!this.v) {
                nk1 nk1Var2 = this.b0;
                gc4 gc4Var = this.C;
                gc4 gc4Var2 = this.D;
                if (this.q == -1 || this.t == -9223372036854775807L || gc4Var == null || (i12 = gc4Var.a) == 0 || gc4Var2 == null || gc4Var2.a != i12) {
                    ll1Var = new ll1(this.t, 0L);
                } else {
                    int[] iArr = new int[i12];
                    long[] jArr = new long[i12];
                    long[] jArr2 = new long[i12];
                    long[] jArr3 = new long[i12];
                    for (int i38 = 0; i38 < i12; i38++) {
                        jArr3[i38] = gc4Var.a(i38);
                        jArr[i38] = gc4Var2.a(i38) + this.q;
                    }
                    int i39 = 0;
                    while (true) {
                        i13 = i12 - 1;
                        if (i39 >= i13) {
                            break;
                        }
                        int i40 = i39 + 1;
                        iArr[i39] = (int) (jArr[i40] - jArr[i39]);
                        jArr2[i39] = jArr3[i40] - jArr3[i39];
                        i39 = i40;
                    }
                    iArr[i13] = (int) ((this.q + this.p) - jArr[i13]);
                    long j4 = this.t - jArr3[i13];
                    jArr2[i13] = j4;
                    if (j4 <= 0) {
                        lb4.c("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j4);
                        iArr = Arrays.copyOf(iArr, i13);
                        jArr = Arrays.copyOf(jArr, i13);
                        jArr2 = Arrays.copyOf(jArr2, i13);
                        jArr3 = Arrays.copyOf(jArr3, i13);
                    }
                    ll1Var = new o16(iArr, jArr, jArr2, jArr3);
                }
                nk1Var2.n(ll1Var);
                this.v = true;
            }
            this.C = null;
            this.D = null;
        }
    }

    @RequiresNonNull({"#2.output"})
    public final int c(p16 p16Var, np1 np1Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        if ("S_TEXT/UTF8".equals(np1Var.b)) {
            m(p16Var, c0, i);
        } else if ("S_TEXT/ASS".equals(np1Var.b)) {
            m(p16Var, e0, i);
        } else if ("S_TEXT/WEBVTT".equals(np1Var.b)) {
            m(p16Var, f0, i);
        } else {
            pl1 pl1Var = np1Var.X;
            boolean z2 = true;
            if (!this.V) {
                if (np1Var.h) {
                    this.O &= -1073741825;
                    int i3 = 128;
                    if (!this.W) {
                        p16Var.A(this.g.a, 0, 1, false);
                        this.S++;
                        byte b = this.g.a[0];
                        if ((b & 128) != 128) {
                            this.Z = b;
                            this.W = true;
                        } else {
                            throw jy2.a("Extension bit is set in signal byte", null);
                        }
                    }
                    byte b2 = this.Z;
                    if ((b2 & 1) == 1) {
                        int i4 = b2 & 2;
                        this.O |= 1073741824;
                        if (!this.a0) {
                            p16Var.A(this.l.a, 0, 8, false);
                            this.S += 8;
                            this.a0 = true;
                            kh4 kh4Var = this.g;
                            byte[] bArr = kh4Var.a;
                            if (i4 != 2) {
                                i3 = 0;
                            }
                            bArr[0] = (byte) (i3 | 8);
                            kh4Var.e(0);
                            pl1Var.c(this.g, 1);
                            this.T++;
                            this.l.e(0);
                            pl1Var.c(this.l, 8);
                            this.T += 8;
                        }
                        if (i4 == 2) {
                            if (!this.X) {
                                p16Var.A(this.g.a, 0, 1, false);
                                this.S++;
                                this.g.e(0);
                                this.Y = this.g.n();
                                this.X = true;
                            }
                            int i5 = this.Y * 4;
                            this.g.b(i5);
                            p16Var.A(this.g.a, 0, i5, false);
                            this.S += i5;
                            int i6 = (this.Y >> 1) + 1;
                            int i7 = (i6 * 6) + 2;
                            ByteBuffer byteBuffer = this.o;
                            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                                this.o = ByteBuffer.allocate(i7);
                            }
                            this.o.position(0);
                            this.o.putShort((short) i6);
                            int i8 = 0;
                            int i9 = 0;
                            while (true) {
                                i2 = this.Y;
                                if (i8 >= i2) {
                                    break;
                                }
                                int p = this.g.p();
                                if (i8 % 2 == 0) {
                                    this.o.putShort((short) (p - i9));
                                } else {
                                    this.o.putInt(p - i9);
                                }
                                i8++;
                                i9 = p;
                            }
                            int i10 = (i - this.S) - i9;
                            if ((i2 & 1) == 1) {
                                this.o.putInt(i10);
                            } else {
                                this.o.putShort((short) i10);
                                this.o.putInt(0);
                            }
                            this.m.c(this.o.array(), i7);
                            pl1Var.c(this.m, i7);
                            this.T += i7;
                        }
                    }
                } else {
                    byte[] bArr2 = np1Var.i;
                    if (bArr2 != null) {
                        this.j.c(bArr2, bArr2.length);
                    }
                }
                if (!"A_OPUS".equals(np1Var.b) ? np1Var.f > 0 : z) {
                    this.O |= 268435456;
                    this.n.b(0);
                    int i11 = (this.j.c + i) - this.S;
                    this.g.b(4);
                    kh4 kh4Var2 = this.g;
                    byte[] bArr3 = kh4Var2.a;
                    bArr3[0] = (byte) ((i11 >> 24) & 255);
                    bArr3[1] = (byte) ((i11 >> 16) & 255);
                    bArr3[2] = (byte) ((i11 >> 8) & 255);
                    bArr3[3] = (byte) (i11 & 255);
                    pl1Var.c(kh4Var2, 4);
                    this.T += 4;
                }
                this.V = true;
            }
            int i12 = i + this.j.c;
            if (!"V_MPEG4/ISO/AVC".equals(np1Var.b) && !"V_MPEGH/ISO/HEVC".equals(np1Var.b)) {
                if (np1Var.T != null) {
                    if (this.j.c != 0) {
                        z2 = false;
                    }
                    tv2.I(z2);
                    np1Var.T.c(p16Var);
                }
                while (true) {
                    int i13 = this.S;
                    if (i13 >= i12) {
                        break;
                    }
                    int i14 = i12 - i13;
                    kh4 kh4Var3 = this.j;
                    int i15 = kh4Var3.c - kh4Var3.b;
                    if (i15 > 0) {
                        f2 = Math.min(i14, i15);
                        pl1Var.c(this.j, f2);
                    } else {
                        f2 = pl1Var.f(p16Var, i14, false);
                    }
                    this.S += f2;
                    this.T += f2;
                }
            } else {
                byte[] bArr4 = this.f.a;
                bArr4[0] = 0;
                bArr4[1] = 0;
                bArr4[2] = 0;
                int i16 = np1Var.Y;
                int i17 = 4 - i16;
                while (this.S < i12) {
                    int i18 = this.U;
                    if (i18 == 0) {
                        kh4 kh4Var4 = this.j;
                        int min = Math.min(i16, kh4Var4.c - kh4Var4.b);
                        p16Var.A(bArr4, i17 + min, i16 - min, false);
                        if (min > 0) {
                            this.j.a(bArr4, i17, min);
                        }
                        this.S += i16;
                        this.f.e(0);
                        this.U = this.f.p();
                        this.e.e(0);
                        pl1Var.c(this.e, 4);
                        this.T += 4;
                    } else {
                        kh4 kh4Var5 = this.j;
                        int i19 = kh4Var5.c - kh4Var5.b;
                        if (i19 > 0) {
                            f = Math.min(i18, i19);
                            pl1Var.c(this.j, f);
                        } else {
                            f = pl1Var.f(p16Var, i18, false);
                        }
                        this.S += f;
                        this.T += f;
                        this.U -= f;
                    }
                }
            }
            if ("A_VORBIS".equals(np1Var.b)) {
                this.h.e(0);
                pl1Var.c(this.h, 4);
                this.T += 4;
            }
        }
        int i20 = this.T;
        l();
        return i20;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.b0 = nk1Var;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        this.B = -9223372036854775807L;
        this.G = 0;
        lp1 lp1Var = this.a;
        lp1Var.e = 0;
        lp1Var.b.clear();
        qp1 qp1Var = lp1Var.c;
        qp1Var.b = 0;
        qp1Var.c = 0;
        qp1 qp1Var2 = this.b;
        qp1Var2.b = 0;
        qp1Var2.c = 0;
        l();
        for (int i = 0; i < this.c.size(); i++) {
            ql1 ql1Var = ((np1) this.c.valueAt(i)).T;
            if (ql1Var != null) {
                ql1Var.b = false;
                ql1Var.c = 0;
            }
        }
    }

    public final long f(long j) {
        long j2 = this.r;
        if (j2 != -9223372036854775807L) {
            return zn4.r(j, j2, 1000L);
        }
        throw jy2.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @EnsuresNonNull({"cueTimesUs", "cueClusterPositions"})
    public final void g(int i) {
        if (this.C == null || this.D == null) {
            throw jy2.a("Element " + i + " must be in a Cues", null);
        }
    }

    @EnsuresNonNull({"currentTrack"})
    public final void h(int i) {
        if (this.u != null) {
            return;
        }
        throw jy2.a("Element " + i + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x02fa, code lost:
        r6 = r3;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0498, code lost:
        throw defpackage.jy2.a("EBML lacing sample size out of range.", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x04e0, code lost:
        if ((r13.g.a[2] & 128) == 128) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (r4 == 1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09b5, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x09b6, code lost:
        r6.e = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x09b8, code lost:
        r2 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0976  */
    /* JADX WARN: Type inference failed for: r11v11, types: [int[]] */
    /* JADX WARN: Type inference failed for: r2v104 */
    /* JADX WARN: Type inference failed for: r2v111 */
    /* JADX WARN: Type inference failed for: r2v138, types: [int] */
    /* JADX WARN: Type inference failed for: r2v176 */
    /* JADX WARN: Type inference failed for: r2v177 */
    /* JADX WARN: Type inference failed for: r2v92 */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        lp1 lp1Var;
        boolean z;
        np1 np1Var;
        int i;
        boolean z2;
        int i2;
        String str;
        lp1 lp1Var2;
        np1 np1Var2;
        lp1 lp1Var3;
        np1 np1Var3;
        long j;
        int i3;
        byte[] bArr;
        int i4;
        double longBitsToDouble;
        long j2;
        int i5;
        p16 p16Var;
        int a;
        p16 p16Var2;
        boolean z3 = false;
        this.F = false;
        while (!this.F) {
            lp1 lp1Var4 = this.a;
            tv2.B(lp1Var4.d);
            boolean z4 = z3;
            while (true) {
                kp1 kp1Var = (kp1) lp1Var4.b.peek();
                int i6 = 1;
                if (kp1Var != null && ((p16) mk1Var).d >= kp1Var.b) {
                    lp1Var4.d.a.b(((kp1) lp1Var4.b.pop()).a);
                } else {
                    int i7 = lp1Var4.e;
                    int i8 = 8;
                    int i9 = 4;
                    if (i7 == 0) {
                        p16 p16Var3 = (p16) mk1Var;
                        long b = lp1Var4.c.b(p16Var3, true, z4, 4);
                        if (b == -2) {
                            p16Var3.f = z4 ? 1 : 0;
                            while (true) {
                                p16 p16Var4 = (p16) mk1Var;
                                p16Var4.B(lp1Var4.a, z4 ? 1 : 0, 4, z4);
                                byte b2 = lp1Var4.a[z4 ? 1 : 0];
                                i5 = 0;
                                while (true) {
                                    if (i5 < i8) {
                                        p16Var = p16Var4;
                                        int i10 = ((qp1.d[i5] & b2) > 0L ? 1 : ((qp1.d[i5] & b2) == 0L ? 0 : -1));
                                        i5++;
                                        if (i10 == 0) {
                                            p16Var4 = p16Var;
                                            i8 = 8;
                                        }
                                    } else {
                                        p16Var = p16Var4;
                                        i5 = -1;
                                    }
                                }
                                if (i5 != -1 && i5 <= 4) {
                                    a = (int) qp1.a(i5, z4, lp1Var4.a);
                                    op1 op1Var = lp1Var4.d.a;
                                    if (a != 357149030 && a != 524531317 && a != 475249515) {
                                        if (a == 374648427) {
                                            p16Var2 = p16Var;
                                            a = 374648427;
                                        }
                                    }
                                }
                                p16Var.k(1);
                                i8 = 8;
                            }
                            p16Var2 = p16Var;
                            p16Var2.k(i5);
                            j2 = a;
                        } else {
                            j2 = b;
                        }
                        if (j2 != -1) {
                            lp1Var4.f = (int) j2;
                            lp1Var4.e = 1;
                        }
                    }
                    lp1Var4.g = lp1Var4.c.b((p16) mk1Var, z4, true, 8);
                    lp1Var4.e = 2;
                    mp1 mp1Var = lp1Var4.d;
                    int i11 = lp1Var4.f;
                    op1 op1Var2 = mp1Var.a;
                    byte b3 = 255;
                    switch (i11) {
                        case 131:
                        case 136:
                        case 155:
                        case 159:
                        case 176:
                        case 179:
                        case 186:
                        case 215:
                        case 231:
                        case 238:
                        case 241:
                        case 251:
                        case 16871:
                        case 16980:
                        case 17029:
                        case 17143:
                        case 18401:
                        case 18408:
                        case 20529:
                        case 20530:
                        case 21420:
                        case 21432:
                        case 21680:
                        case 21682:
                        case 21690:
                        case 21930:
                        case 21945:
                        case 21946:
                        case 21947:
                        case 21948:
                        case 21949:
                        case 21998:
                        case 22186:
                        case 22203:
                        case 25188:
                        case 30114:
                        case 30321:
                        case 2352003:
                        case 2807729:
                            lp1Var = lp1Var4;
                            long j3 = lp1Var.g;
                            if (j3 <= 8) {
                                int i12 = (int) j3;
                                ((p16) mk1Var).A(lp1Var.a, 0, i12, false);
                                int i13 = 0;
                                long j4 = 0;
                                while (i13 < i12) {
                                    long j5 = lp1Var.a[i13] & 255;
                                    i13++;
                                    j4 = j5 | (j4 << 8);
                                    i12 = i12;
                                }
                                op1 op1Var3 = mp1Var.a;
                                op1Var3.getClass();
                                if (i11 != 20529) {
                                    if (i11 != 20530) {
                                        switch (i11) {
                                            case 131:
                                                op1Var3.h(i11);
                                                op1Var3.u.d = (int) j4;
                                                break;
                                            case 136:
                                                op1Var3.h(i11);
                                                np1 np1Var4 = op1Var3.u;
                                                if (j4 == 1) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                np1Var4.V = z;
                                                break;
                                            case 155:
                                                op1Var3.I = op1Var3.f(j4);
                                                break;
                                            case 159:
                                                op1Var3.h(i11);
                                                op1Var3.u.O = (int) j4;
                                                break;
                                            case 176:
                                                op1Var3.h(i11);
                                                op1Var3.u.m = (int) j4;
                                                break;
                                            case 179:
                                                op1Var3.g(i11);
                                                gc4 gc4Var = op1Var3.C;
                                                long f = op1Var3.f(j4);
                                                int i14 = gc4Var.a;
                                                long[] jArr = gc4Var.b;
                                                if (i14 == jArr.length) {
                                                    gc4Var.b = Arrays.copyOf(jArr, i14 + i14);
                                                }
                                                long[] jArr2 = gc4Var.b;
                                                int i15 = gc4Var.a;
                                                gc4Var.a = i15 + 1;
                                                jArr2[i15] = f;
                                                break;
                                            case 186:
                                                op1Var3.h(i11);
                                                op1Var3.u.n = (int) j4;
                                                break;
                                            case 215:
                                                op1Var3.h(i11);
                                                op1Var3.u.c = (int) j4;
                                                break;
                                            case 231:
                                                op1Var3.B = op1Var3.f(j4);
                                                break;
                                            case 238:
                                                op1Var3.P = (int) j4;
                                                break;
                                            case 241:
                                                if (!op1Var3.E) {
                                                    op1Var3.g(i11);
                                                    gc4 gc4Var2 = op1Var3.D;
                                                    int i16 = gc4Var2.a;
                                                    long[] jArr3 = gc4Var2.b;
                                                    if (i16 == jArr3.length) {
                                                        gc4Var2.b = Arrays.copyOf(jArr3, i16 + i16);
                                                    }
                                                    long[] jArr4 = gc4Var2.b;
                                                    int i17 = gc4Var2.a;
                                                    gc4Var2.a = i17 + 1;
                                                    jArr4[i17] = j4;
                                                    op1Var3.E = true;
                                                    break;
                                                }
                                                break;
                                            case 251:
                                                op1Var3.Q = true;
                                                break;
                                            case 16871:
                                                op1Var3.h(i11);
                                                op1Var3.u.g = (int) j4;
                                                break;
                                            case 16980:
                                                if (j4 != 3) {
                                                    throw jy2.a("ContentCompAlgo " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 17029:
                                                if (j4 < 1 || j4 > 2) {
                                                    throw jy2.a("DocTypeReadVersion " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 17143:
                                                if (j4 != 1) {
                                                    throw jy2.a("EBMLReadVersion " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 18401:
                                                if (j4 != 5) {
                                                    throw jy2.a("ContentEncAlgo " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 18408:
                                                if (j4 != 1) {
                                                    throw jy2.a("AESSettingsCipherMode " + j4 + " not supported", null);
                                                }
                                                break;
                                            case 21420:
                                                op1Var3.x = j4 + op1Var3.q;
                                                break;
                                            case 21432:
                                                int i18 = (int) j4;
                                                op1Var3.h(i11);
                                                if (i18 != 0) {
                                                    if (i18 != 1) {
                                                        if (i18 != 3) {
                                                            if (i18 == 15) {
                                                                op1Var3.u.w = 3;
                                                                break;
                                                            }
                                                        } else {
                                                            op1Var3.u.w = 1;
                                                            break;
                                                        }
                                                    } else {
                                                        np1Var = op1Var3.u;
                                                        i = 2;
                                                    }
                                                } else {
                                                    np1Var = op1Var3.u;
                                                    i = 0;
                                                }
                                                np1Var.w = i;
                                                break;
                                            case 21680:
                                                op1Var3.h(i11);
                                                op1Var3.u.o = (int) j4;
                                                break;
                                            case 21682:
                                                op1Var3.h(i11);
                                                op1Var3.u.q = (int) j4;
                                                break;
                                            case 21690:
                                                op1Var3.h(i11);
                                                op1Var3.u.p = (int) j4;
                                                break;
                                            case 21930:
                                                op1Var3.h(i11);
                                                np1 np1Var5 = op1Var3.u;
                                                if (j4 == 1) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                np1Var5.U = z2;
                                                break;
                                            case 21998:
                                                op1Var3.h(i11);
                                                op1Var3.u.f = (int) j4;
                                                break;
                                            case 22186:
                                                op1Var3.h(i11);
                                                op1Var3.u.R = j4;
                                                break;
                                            case 22203:
                                                op1Var3.h(i11);
                                                op1Var3.u.S = j4;
                                                break;
                                            case 25188:
                                                op1Var3.h(i11);
                                                op1Var3.u.P = (int) j4;
                                                break;
                                            case 30114:
                                                op1Var3.R = j4;
                                                break;
                                            case 30321:
                                                op1Var3.h(i11);
                                                int i19 = (int) j4;
                                                if (i19 != 0) {
                                                    if (i19 != 1) {
                                                        if (i19 != 2) {
                                                            if (i19 == 3) {
                                                                op1Var3.u.r = 3;
                                                                break;
                                                            }
                                                        } else {
                                                            op1Var3.u.r = 2;
                                                            break;
                                                        }
                                                    } else {
                                                        op1Var3.u.r = 1;
                                                        break;
                                                    }
                                                } else {
                                                    op1Var3.u.r = 0;
                                                    break;
                                                }
                                                break;
                                            case 2352003:
                                                op1Var3.h(i11);
                                                op1Var3.u.e = (int) j4;
                                                break;
                                            case 2807729:
                                                op1Var3.r = j4;
                                                break;
                                            default:
                                                int i20 = 7;
                                                switch (i11) {
                                                    case 21945:
                                                        op1Var3.h(i11);
                                                        int i21 = (int) j4;
                                                        if (i21 != 1) {
                                                            if (i21 == 2) {
                                                                op1Var3.u.A = 1;
                                                                break;
                                                            }
                                                        } else {
                                                            op1Var3.u.A = 2;
                                                            break;
                                                        }
                                                        break;
                                                    case 21946:
                                                        op1Var3.h(i11);
                                                        int i22 = (int) j4;
                                                        int i23 = eu5.f;
                                                        if (i22 != 1) {
                                                            if (i22 != 16) {
                                                                if (i22 != 18) {
                                                                    if (i22 != 6 && i22 != 7) {
                                                                        i20 = -1;
                                                                    }
                                                                }
                                                            } else {
                                                                i20 = 6;
                                                            }
                                                            if (i20 != -1) {
                                                                op1Var3.u.z = i20;
                                                                break;
                                                            }
                                                        }
                                                        i20 = 3;
                                                        if (i20 != -1) {
                                                        }
                                                        break;
                                                    case 21947:
                                                        op1Var3.h(i11);
                                                        np1 np1Var6 = op1Var3.u;
                                                        np1Var6.x = true;
                                                        int i24 = (int) j4;
                                                        int i25 = eu5.f;
                                                        if (i24 != 1) {
                                                            if (i24 != 9) {
                                                                if (i24 != 4 && i24 != 5 && i24 != 6 && i24 != 7) {
                                                                    i2 = -1;
                                                                } else {
                                                                    i2 = 2;
                                                                }
                                                            } else {
                                                                i2 = 6;
                                                            }
                                                        } else {
                                                            i2 = 1;
                                                        }
                                                        if (i2 != -1) {
                                                            np1Var6.y = i2;
                                                            break;
                                                        }
                                                        break;
                                                    case 21948:
                                                        op1Var3.h(i11);
                                                        op1Var3.u.B = (int) j4;
                                                        break;
                                                    case 21949:
                                                        op1Var3.h(i11);
                                                        op1Var3.u.C = (int) j4;
                                                        break;
                                                }
                                        }
                                    } else if (j4 != 1) {
                                        throw jy2.a("ContentEncodingScope " + j4 + " not supported", null);
                                    }
                                } else if (j4 != 0) {
                                    throw jy2.a("ContentEncodingOrder " + j4 + " not supported", null);
                                }
                            } else {
                                throw jy2.a("Invalid integer size: " + j3, null);
                            }
                            break;
                        case 134:
                        case 17026:
                        case 21358:
                        case 2274716:
                            lp1Var = lp1Var4;
                            long j6 = lp1Var.g;
                            if (j6 <= 2147483647L) {
                                int i26 = (int) j6;
                                if (i26 == 0) {
                                    str = "";
                                } else {
                                    byte[] bArr2 = new byte[i26];
                                    ((p16) mk1Var).A(bArr2, 0, i26, false);
                                    while (i26 > 0) {
                                        int i27 = i26 - 1;
                                        if (bArr2[i27] == 0) {
                                            i26 = i27;
                                        } else {
                                            str = new String(bArr2, 0, i26);
                                        }
                                    }
                                    str = new String(bArr2, 0, i26);
                                }
                                op1 op1Var4 = mp1Var.a;
                                op1Var4.getClass();
                                if (i11 != 134) {
                                    if (i11 != 17026) {
                                        if (i11 != 21358) {
                                            if (i11 == 2274716) {
                                                op1Var4.h(i11);
                                                op1Var4.u.W = str;
                                                break;
                                            }
                                        } else {
                                            op1Var4.h(i11);
                                            op1Var4.u.a = str;
                                            break;
                                        }
                                    } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                                        throw jy2.a("DocType " + str + " not supported", null);
                                    }
                                } else {
                                    op1Var4.h(i11);
                                    op1Var4.u.b = str;
                                    break;
                                }
                            } else {
                                throw jy2.a("String element size: " + j6, null);
                            }
                            break;
                        case 160:
                        case 166:
                        case 174:
                        case 183:
                        case 187:
                        case 224:
                        case 225:
                        case 16868:
                        case 18407:
                        case 19899:
                        case 20532:
                        case 20533:
                        case 21936:
                        case 21968:
                        case 25152:
                        case 28032:
                        case 30113:
                        case 30320:
                        case 290298740:
                        case 357149030:
                        case 374648427:
                        case 408125543:
                        case 440786851:
                        case 475249515:
                        case 524531317:
                            long j7 = ((p16) mk1Var).d;
                            lp1Var = lp1Var4;
                            lp1Var.b.push(new kp1(i11, lp1Var.g + j7));
                            mp1 mp1Var2 = lp1Var.d;
                            int i28 = lp1Var.f;
                            long j8 = lp1Var.g;
                            op1 op1Var5 = mp1Var2.a;
                            tv2.B(op1Var5.b0);
                            if (i28 != 160) {
                                if (i28 != 174) {
                                    if (i28 != 187) {
                                        if (i28 != 19899) {
                                            if (i28 != 20533) {
                                                if (i28 != 21968) {
                                                    if (i28 != 408125543) {
                                                        if (i28 != 475249515) {
                                                            if (i28 == 524531317 && !op1Var5.v) {
                                                                if (op1Var5.d && op1Var5.z != -1) {
                                                                    op1Var5.y = true;
                                                                    break;
                                                                } else {
                                                                    op1Var5.b0.n(new ll1(op1Var5.t, 0L));
                                                                    op1Var5.v = true;
                                                                    break;
                                                                }
                                                            }
                                                        } else {
                                                            op1Var5.C = new gc4();
                                                            op1Var5.D = new gc4();
                                                            break;
                                                        }
                                                    } else {
                                                        long j9 = op1Var5.q;
                                                        if (j9 != -1 && j9 != j7) {
                                                            throw jy2.a("Multiple Segment elements not supported", null);
                                                        }
                                                        op1Var5.q = j7;
                                                        op1Var5.p = j8;
                                                        break;
                                                    }
                                                } else {
                                                    op1Var5.h(i28);
                                                    op1Var5.u.x = true;
                                                    break;
                                                }
                                            } else {
                                                op1Var5.h(i28);
                                                op1Var5.u.h = true;
                                                break;
                                            }
                                        } else {
                                            op1Var5.w = -1;
                                            op1Var5.x = -1L;
                                            break;
                                        }
                                    } else {
                                        op1Var5.E = false;
                                        break;
                                    }
                                } else {
                                    op1Var5.u = new np1();
                                    break;
                                }
                            } else {
                                op1Var5.Q = false;
                                op1Var5.R = 0L;
                                break;
                            }
                            break;
                        case 161:
                        case 163:
                        case 165:
                        case 16877:
                        case 16981:
                        case 18402:
                        case 21419:
                        case 25506:
                        case 30322:
                            int i29 = (int) lp1Var4.g;
                            op1Var2.getClass();
                            if (i11 != 161 && i11 != 163) {
                                if (i11 != 165) {
                                    if (i11 != 16877) {
                                        if (i11 != 16981) {
                                            if (i11 != 18402) {
                                                if (i11 != 21419) {
                                                    if (i11 != 25506) {
                                                        if (i11 == 30322) {
                                                            op1Var2.h(i11);
                                                            byte[] bArr3 = new byte[i29];
                                                            op1Var2.u.v = bArr3;
                                                            ((p16) mk1Var).A(bArr3, z4 ? 1 : 0, i29, z4);
                                                            break;
                                                        } else {
                                                            throw jy2.a("Unexpected id: " + i11, null);
                                                        }
                                                    } else {
                                                        op1Var2.h(i11);
                                                        byte[] bArr4 = new byte[i29];
                                                        op1Var2.u.k = bArr4;
                                                        ((p16) mk1Var).A(bArr4, z4 ? 1 : 0, i29, z4);
                                                        break;
                                                    }
                                                } else {
                                                    Arrays.fill(op1Var2.i.a, z4 ? (byte) 1 : (byte) 0);
                                                    ((p16) mk1Var).A(op1Var2.i.a, 4 - i29, i29, z4);
                                                    op1Var2.i.e(z4 ? 1 : 0);
                                                    op1Var2.w = (int) op1Var2.i.u();
                                                    break;
                                                }
                                            } else {
                                                byte[] bArr5 = new byte[i29];
                                                ((p16) mk1Var).A(bArr5, z4 ? 1 : 0, i29, z4);
                                                op1Var2.h(i11);
                                                op1Var2.u.j = new ol1(1, z4 ? 1 : 0, z4 ? 1 : 0, bArr5);
                                                break;
                                            }
                                        } else {
                                            op1Var2.h(i11);
                                            byte[] bArr6 = new byte[i29];
                                            op1Var2.u.i = bArr6;
                                            ((p16) mk1Var).A(bArr6, z4 ? 1 : 0, i29, z4);
                                            break;
                                        }
                                    } else {
                                        op1Var2.h(i11);
                                        np1 np1Var7 = op1Var2.u;
                                        int i30 = np1Var7.g;
                                        if (i30 == 1685485123 || i30 == 1685480259) {
                                            byte[] bArr7 = new byte[i29];
                                            np1Var7.N = bArr7;
                                            ((p16) mk1Var).A(bArr7, z4 ? 1 : 0, i29, z4);
                                            break;
                                        }
                                        ((p16) mk1Var).k(i29);
                                        break;
                                    }
                                } else if (op1Var2.G == 2) {
                                    np1 np1Var8 = (np1) op1Var2.c.get(op1Var2.M);
                                    if (op1Var2.P == 4 && "V_VP9".equals(np1Var8.b)) {
                                        op1Var2.n.b(i29);
                                        ((p16) mk1Var).A(op1Var2.n.a, z4 ? 1 : 0, i29, z4);
                                        break;
                                    }
                                    ((p16) mk1Var).k(i29);
                                }
                            } else {
                                if (op1Var2.G == 0) {
                                    op1Var2.M = (int) op1Var2.b.b((p16) mk1Var, z4, true, 8);
                                    op1Var2.N = op1Var2.b.c;
                                    op1Var2.I = -9223372036854775807L;
                                    op1Var2.G = 1;
                                    op1Var2.g.b(z4 ? 1 : 0);
                                }
                                np1 np1Var9 = (np1) op1Var2.c.get(op1Var2.M);
                                if (np1Var9 == null) {
                                    ((p16) mk1Var).k(i29 - op1Var2.N);
                                    lp1Var2 = lp1Var4;
                                } else {
                                    np1Var9.X.getClass();
                                    if (op1Var2.G == 1) {
                                        p16 p16Var5 = (p16) mk1Var;
                                        op1Var2.k(p16Var5, 3);
                                        int i31 = (op1Var2.g.a[2] & 6) >> 1;
                                        if (i31 == 0) {
                                            op1Var2.K = 1;
                                            int[] iArr = op1Var2.L;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                            } else {
                                                int length = iArr.length;
                                                if (length < 1) {
                                                    iArr = new int[Math.max(length + length, 1)];
                                                }
                                            }
                                            op1Var2.L = iArr;
                                            iArr[z4 ? 1 : 0] = (i29 - op1Var2.N) - 3;
                                        } else {
                                            op1Var2.k(p16Var5, 4);
                                            int i32 = (op1Var2.g.a[3] & 255) + 1;
                                            op1Var2.K = i32;
                                            int[] iArr2 = op1Var2.L;
                                            if (iArr2 == null) {
                                                iArr2 = new int[i32];
                                            } else {
                                                int length2 = iArr2.length;
                                                if (length2 < i32) {
                                                    iArr2 = new int[Math.max(length2 + length2, i32)];
                                                }
                                            }
                                            op1Var2.L = iArr2;
                                            if (i31 == 2) {
                                                int i33 = op1Var2.K;
                                                Arrays.fill(iArr2, z4 ? 1 : 0, i33, ((i29 - op1Var2.N) - 4) / i33);
                                            } else if (i31 == 1) {
                                                int i34 = 0;
                                                int i35 = 0;
                                                while (true) {
                                                    int i36 = op1Var2.K - 1;
                                                    if (i34 < i36) {
                                                        op1Var2.L[i34] = z4 ? 1 : 0;
                                                        while (true) {
                                                            i9++;
                                                            op1Var2.k(p16Var5, i9);
                                                            int i37 = op1Var2.g.a[i9 - 1] & 255;
                                                            int[] iArr3 = op1Var2.L;
                                                            i3 = iArr3[i34] + i37;
                                                            iArr3[i34] = i3;
                                                            if (i37 != 255) {
                                                                break;
                                                            }
                                                        }
                                                        i35 += i3;
                                                        i34++;
                                                    } else {
                                                        op1Var2.L[i36] = ((i29 - op1Var2.N) - i9) - i35;
                                                    }
                                                }
                                            } else if (i31 == 3) {
                                                int i38 = 0;
                                                int i39 = 0;
                                                ?? r2 = z4;
                                                while (true) {
                                                    int i40 = op1Var2.K - 1;
                                                    if (i38 < i40) {
                                                        op1Var2.L[i38] = r2;
                                                        i9++;
                                                        op1Var2.k(p16Var5, i9);
                                                        int i41 = i9 - 1;
                                                        if (op1Var2.g.a[i41] != 0) {
                                                            int i42 = 0;
                                                            while (true) {
                                                                if (i42 < 8) {
                                                                    int i43 = i6 << (7 - i42);
                                                                    if ((op1Var2.g.a[i41] & i43) != 0) {
                                                                        i9 += i42;
                                                                        op1Var2.k(p16Var5, i9);
                                                                        np1Var3 = np1Var9;
                                                                        j = op1Var2.g.a[i41] & 255 & (i43 ^ (-1));
                                                                        int i44 = i41 + 1;
                                                                        while (i44 < i9) {
                                                                            j = (j << 8) | (op1Var2.g.a[i44] & 255);
                                                                            i44++;
                                                                            lp1Var4 = lp1Var4;
                                                                        }
                                                                        lp1Var3 = lp1Var4;
                                                                        if (i38 > 0) {
                                                                            j -= (1 << ((i42 * 7) + 6)) - 1;
                                                                        }
                                                                    } else {
                                                                        i42++;
                                                                        i6 = 1;
                                                                    }
                                                                } else {
                                                                    lp1Var3 = lp1Var4;
                                                                    np1Var3 = np1Var9;
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j >= -2147483648L && j <= 2147483647L) {
                                                                int[] iArr4 = op1Var2.L;
                                                                int i45 = (int) j;
                                                                if (i38 != 0) {
                                                                    i45 += iArr4[i38 - 1];
                                                                }
                                                                iArr4[i38] = i45;
                                                                i39 += i45;
                                                                i38++;
                                                                np1Var9 = np1Var3;
                                                                lp1Var4 = lp1Var3;
                                                                r2 = 0;
                                                                i6 = 1;
                                                            }
                                                        } else {
                                                            throw jy2.a("No valid varint length mask found", null);
                                                        }
                                                    } else {
                                                        lp1Var2 = lp1Var4;
                                                        np1Var2 = np1Var9;
                                                        op1Var2.L[i40] = ((i29 - op1Var2.N) - i9) - i39;
                                                    }
                                                }
                                                int i46 = op1Var2.g.a[1] & 255;
                                                op1Var2.H = op1Var2.f(i46 | (bArr[0] << 8)) + op1Var2.B;
                                                np1Var9 = np1Var2;
                                                if (np1Var9.d != 2) {
                                                    if (i11 == 163) {
                                                        i11 = 163;
                                                        break;
                                                    }
                                                    i4 = 0;
                                                    op1Var2.O = i4;
                                                    op1Var2.G = 2;
                                                    op1Var2.J = 0;
                                                }
                                                i4 = 1;
                                                op1Var2.O = i4;
                                                op1Var2.G = 2;
                                                op1Var2.J = 0;
                                            } else {
                                                throw jy2.a("Unexpected lacing value: 2", null);
                                            }
                                        }
                                        lp1Var2 = lp1Var4;
                                        np1Var2 = np1Var9;
                                        int i462 = op1Var2.g.a[1] & 255;
                                        op1Var2.H = op1Var2.f(i462 | (bArr[0] << 8)) + op1Var2.B;
                                        np1Var9 = np1Var2;
                                        if (np1Var9.d != 2) {
                                        }
                                        i4 = 1;
                                        op1Var2.O = i4;
                                        op1Var2.G = 2;
                                        op1Var2.J = 0;
                                    } else {
                                        lp1Var2 = lp1Var4;
                                    }
                                    if (i11 != 163) {
                                        while (true) {
                                            int i47 = op1Var2.J;
                                            if (i47 >= op1Var2.K) {
                                                lp1Var = lp1Var2;
                                                break;
                                            } else {
                                                int[] iArr5 = op1Var2.L;
                                                iArr5[i47] = op1Var2.c((p16) mk1Var, np1Var9, iArr5[i47], true);
                                                op1Var2.J++;
                                            }
                                        }
                                    } else {
                                        while (true) {
                                            int i48 = op1Var2.J;
                                            if (i48 < op1Var2.K) {
                                                op1Var2.j(np1Var9, ((op1Var2.J * np1Var9.e) / 1000) + op1Var2.H, op1Var2.O, op1Var2.c((p16) mk1Var, np1Var9, op1Var2.L[i48], false), 0);
                                                op1Var2.J++;
                                            }
                                        }
                                    }
                                }
                                op1Var2.G = 0;
                                lp1Var = lp1Var2;
                            }
                            break;
                        case 181:
                        case 17545:
                        case 21969:
                        case 21970:
                        case 21971:
                        case 21972:
                        case 21973:
                        case 21974:
                        case 21975:
                        case 21976:
                        case 21977:
                        case 21978:
                        case 30323:
                        case 30324:
                        case 30325:
                            long j10 = lp1Var4.g;
                            if (j10 != 4 && j10 != 8) {
                                throw jy2.a("Invalid float size: " + j10, null);
                            }
                            int i49 = (int) j10;
                            ((p16) mk1Var).A(lp1Var4.a, z4 ? 1 : 0, i49, z4);
                            long j11 = 0;
                            int i50 = 0;
                            while (i50 < i49) {
                                j11 = (j11 << 8) | (lp1Var4.a[i50] & b3);
                                i50++;
                                b3 = 255;
                            }
                            if (i49 == 4) {
                                longBitsToDouble = Float.intBitsToFloat((int) j11);
                            } else {
                                longBitsToDouble = Double.longBitsToDouble(j11);
                            }
                            op1 op1Var6 = mp1Var.a;
                            if (i11 != 181) {
                                if (i11 != 17545) {
                                    switch (i11) {
                                        case 21969:
                                            op1Var6.h(i11);
                                            op1Var6.u.D = (float) longBitsToDouble;
                                            break;
                                        case 21970:
                                            op1Var6.h(i11);
                                            op1Var6.u.E = (float) longBitsToDouble;
                                            break;
                                        case 21971:
                                            op1Var6.h(i11);
                                            op1Var6.u.F = (float) longBitsToDouble;
                                            break;
                                        case 21972:
                                            op1Var6.h(i11);
                                            op1Var6.u.G = (float) longBitsToDouble;
                                            break;
                                        case 21973:
                                            op1Var6.h(i11);
                                            op1Var6.u.H = (float) longBitsToDouble;
                                            break;
                                        case 21974:
                                            op1Var6.h(i11);
                                            op1Var6.u.I = (float) longBitsToDouble;
                                            break;
                                        case 21975:
                                            op1Var6.h(i11);
                                            op1Var6.u.J = (float) longBitsToDouble;
                                            break;
                                        case 21976:
                                            op1Var6.h(i11);
                                            op1Var6.u.K = (float) longBitsToDouble;
                                            break;
                                        case 21977:
                                            op1Var6.h(i11);
                                            op1Var6.u.L = (float) longBitsToDouble;
                                            break;
                                        case 21978:
                                            op1Var6.h(i11);
                                            op1Var6.u.M = (float) longBitsToDouble;
                                            break;
                                        default:
                                            switch (i11) {
                                                case 30323:
                                                    op1Var6.h(i11);
                                                    op1Var6.u.s = (float) longBitsToDouble;
                                                    break;
                                                case 30324:
                                                    op1Var6.h(i11);
                                                    op1Var6.u.t = (float) longBitsToDouble;
                                                    break;
                                                case 30325:
                                                    op1Var6.h(i11);
                                                    op1Var6.u.u = (float) longBitsToDouble;
                                                    break;
                                                default:
                                                    op1Var6.getClass();
                                                    break;
                                            }
                                    }
                                } else {
                                    op1Var6.s = (long) longBitsToDouble;
                                    break;
                                }
                            } else {
                                op1Var6.h(i11);
                                op1Var6.u.Q = (int) longBitsToDouble;
                                break;
                            }
                            break;
                        default:
                            lp1 lp1Var5 = lp1Var4;
                            ((p16) mk1Var).k((int) lp1Var5.g);
                            z4 = false;
                            lp1Var5.e = 0;
                            lp1Var4 = lp1Var5;
                    }
                }
            }
            if (z4) {
                long j12 = ((p16) mk1Var).d;
                if (this.y) {
                    this.A = j12;
                    jl1Var.a = this.z;
                    this.y = false;
                    return 1;
                }
                if (this.v) {
                    long j13 = this.A;
                    if (j13 != -1) {
                        jl1Var.a = j13;
                        this.A = -1L;
                        return 1;
                    }
                }
                z3 = false;
            } else {
                for (int i51 = 0; i51 < this.c.size(); i51++) {
                    np1 np1Var10 = (np1) this.c.valueAt(i51);
                    np1Var10.X.getClass();
                    ql1 ql1Var = np1Var10.T;
                    if (ql1Var != null) {
                        ql1Var.a(np1Var10.X, np1Var10.j);
                    }
                }
                return -1;
            }
        }
        return z3 ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9 A[EDGE_INSN: B:63:0x00c9->B:52:0x00c9 ?: BREAK  , SYNTHETIC] */
    @RequiresNonNull({"#1.output"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(np1 np1Var, long j, int i, int i2, int i3) {
        char c;
        int i4;
        String str;
        int i5;
        kh4 kh4Var;
        int i6;
        String str2;
        ql1 ql1Var = np1Var.T;
        if (ql1Var != null) {
            ql1Var.b(np1Var.X, j, i, i2, i3, np1Var.j);
        } else {
            if ("S_TEXT/UTF8".equals(np1Var.b) || "S_TEXT/ASS".equals(np1Var.b) || "S_TEXT/WEBVTT".equals(np1Var.b)) {
                if (this.K > 1) {
                    str2 = "Skipping subtitle sample in laced block.";
                } else {
                    long j2 = this.I;
                    if (j2 == -9223372036854775807L) {
                        str2 = "Skipping subtitle sample with no duration.";
                    } else {
                        String str3 = np1Var.b;
                        byte[] bArr = this.k.a;
                        int hashCode = str3.hashCode();
                        if (hashCode != 738597099) {
                            if (hashCode != 1045209816) {
                                if (hashCode == 1422270023 && str3.equals("S_TEXT/UTF8")) {
                                    c = 0;
                                    long j3 = 1000;
                                    if (c == 0) {
                                        if (c != 1) {
                                            if (c == 2) {
                                                i4 = 25;
                                                str = "%02d:%02d:%02d.%03d";
                                            } else {
                                                throw new IllegalArgumentException();
                                            }
                                        } else {
                                            i4 = 21;
                                            j3 = 10000;
                                            str = "%01d:%02d:%02d:%02d";
                                        }
                                    } else {
                                        i4 = 19;
                                        str = "%02d:%02d:%02d,%03d";
                                    }
                                    byte[] n = n(j2, str, j3);
                                    System.arraycopy(n, 0, bArr, i4, n.length);
                                    i5 = this.k.b;
                                    while (true) {
                                        kh4Var = this.k;
                                        if (i5 >= kh4Var.c) {
                                            break;
                                        } else if (kh4Var.a[i5] == 0) {
                                            kh4Var.d(i5);
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    }
                                    pl1 pl1Var = np1Var.X;
                                    kh4 kh4Var2 = this.k;
                                    pl1Var.c(kh4Var2, kh4Var2.c);
                                    i6 = i2 + this.k.c;
                                    if ((i & 268435456) != 0) {
                                        if (this.K > 1) {
                                            this.n.b(0);
                                        } else {
                                            kh4 kh4Var3 = this.n;
                                            int i7 = kh4Var3.c;
                                            np1Var.X.c(kh4Var3, i7);
                                            i6 += i7;
                                        }
                                    }
                                    np1Var.X.b(j, i, i6, i3, np1Var.j);
                                }
                                c = 65535;
                                long j32 = 1000;
                                if (c == 0) {
                                }
                                byte[] n2 = n(j2, str, j32);
                                System.arraycopy(n2, 0, bArr, i4, n2.length);
                                i5 = this.k.b;
                                while (true) {
                                    kh4Var = this.k;
                                    if (i5 >= kh4Var.c) {
                                    }
                                    i5++;
                                }
                                pl1 pl1Var2 = np1Var.X;
                                kh4 kh4Var22 = this.k;
                                pl1Var2.c(kh4Var22, kh4Var22.c);
                                i6 = i2 + this.k.c;
                                if ((i & 268435456) != 0) {
                                }
                                np1Var.X.b(j, i, i6, i3, np1Var.j);
                            } else {
                                if (str3.equals("S_TEXT/WEBVTT")) {
                                    c = 2;
                                    long j322 = 1000;
                                    if (c == 0) {
                                    }
                                    byte[] n22 = n(j2, str, j322);
                                    System.arraycopy(n22, 0, bArr, i4, n22.length);
                                    i5 = this.k.b;
                                    while (true) {
                                        kh4Var = this.k;
                                        if (i5 >= kh4Var.c) {
                                        }
                                        i5++;
                                    }
                                    pl1 pl1Var22 = np1Var.X;
                                    kh4 kh4Var222 = this.k;
                                    pl1Var22.c(kh4Var222, kh4Var222.c);
                                    i6 = i2 + this.k.c;
                                    if ((i & 268435456) != 0) {
                                    }
                                    np1Var.X.b(j, i, i6, i3, np1Var.j);
                                }
                                c = 65535;
                                long j3222 = 1000;
                                if (c == 0) {
                                }
                                byte[] n222 = n(j2, str, j3222);
                                System.arraycopy(n222, 0, bArr, i4, n222.length);
                                i5 = this.k.b;
                                while (true) {
                                    kh4Var = this.k;
                                    if (i5 >= kh4Var.c) {
                                    }
                                    i5++;
                                }
                                pl1 pl1Var222 = np1Var.X;
                                kh4 kh4Var2222 = this.k;
                                pl1Var222.c(kh4Var2222, kh4Var2222.c);
                                i6 = i2 + this.k.c;
                                if ((i & 268435456) != 0) {
                                }
                                np1Var.X.b(j, i, i6, i3, np1Var.j);
                            }
                        } else {
                            if (str3.equals("S_TEXT/ASS")) {
                                c = 1;
                                long j32222 = 1000;
                                if (c == 0) {
                                }
                                byte[] n2222 = n(j2, str, j32222);
                                System.arraycopy(n2222, 0, bArr, i4, n2222.length);
                                i5 = this.k.b;
                                while (true) {
                                    kh4Var = this.k;
                                    if (i5 >= kh4Var.c) {
                                    }
                                    i5++;
                                }
                                pl1 pl1Var2222 = np1Var.X;
                                kh4 kh4Var22222 = this.k;
                                pl1Var2222.c(kh4Var22222, kh4Var22222.c);
                                i6 = i2 + this.k.c;
                                if ((i & 268435456) != 0) {
                                }
                                np1Var.X.b(j, i, i6, i3, np1Var.j);
                            }
                            c = 65535;
                            long j322222 = 1000;
                            if (c == 0) {
                            }
                            byte[] n22222 = n(j2, str, j322222);
                            System.arraycopy(n22222, 0, bArr, i4, n22222.length);
                            i5 = this.k.b;
                            while (true) {
                                kh4Var = this.k;
                                if (i5 >= kh4Var.c) {
                                }
                                i5++;
                            }
                            pl1 pl1Var22222 = np1Var.X;
                            kh4 kh4Var222222 = this.k;
                            pl1Var22222.c(kh4Var222222, kh4Var222222.c);
                            i6 = i2 + this.k.c;
                            if ((i & 268435456) != 0) {
                            }
                            np1Var.X.b(j, i, i6, i3, np1Var.j);
                        }
                    }
                }
                lb4.c("MatroskaExtractor", str2);
            }
            i6 = i2;
            if ((i & 268435456) != 0) {
            }
            np1Var.X.b(j, i, i6, i3, np1Var.j);
        }
        this.F = true;
    }

    public final void k(p16 p16Var, int i) {
        kh4 kh4Var = this.g;
        if (kh4Var.c >= i) {
            return;
        }
        byte[] bArr = kh4Var.a;
        if (bArr.length < i) {
            int length = bArr.length;
            int max = Math.max(length + length, i);
            byte[] bArr2 = kh4Var.a;
            if (max > bArr2.length) {
                kh4Var.a = Arrays.copyOf(bArr2, max);
            }
        }
        kh4 kh4Var2 = this.g;
        byte[] bArr3 = kh4Var2.a;
        int i2 = kh4Var2.c;
        p16Var.A(bArr3, i2, i - i2, false);
        this.g.d(i);
    }

    public final void l() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.a0 = false;
        this.j.b(0);
    }

    public final void m(p16 p16Var, byte[] bArr, int i) {
        int length = bArr.length;
        int i2 = length + i;
        kh4 kh4Var = this.k;
        byte[] bArr2 = kh4Var.a;
        if (bArr2.length < i2) {
            byte[] copyOf = Arrays.copyOf(bArr, i2 + i);
            kh4Var.c(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        p16Var.A(this.k.a, length, i, false);
        this.k.e(0);
        this.k.d(i2);
    }
}