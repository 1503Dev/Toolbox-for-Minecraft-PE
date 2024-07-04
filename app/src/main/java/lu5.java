package defpackage;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* renamed from: lu5  reason: default package */
public final class lu5 {
    public static final Pattern a = Pattern.compile("^\\D?(\\d+)$");
    public static final HashMap b = new HashMap();
    public static int c = -1;

    public static int a() {
        pt5 pt5Var;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2;
        int i3 = c;
        if (i3 == -1) {
            List d = d("video/avc", false, false);
            if (d.isEmpty()) {
                pt5Var = null;
            } else {
                pt5Var = (pt5) d.get(0);
            }
            if (pt5Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = pt5Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int i4 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                    int i5 = codecProfileLevel.level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                continue;
                            case 64:
                                i2 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i2 = 414720;
                                continue;
                            case 512:
                                i2 = 921600;
                                continue;
                            case 1024:
                                i2 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                continue;
                            case 8192:
                                i2 = 2228224;
                                continue;
                            case 16384:
                                i2 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                continue;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                continue;
                            default:
                                i2 = -1;
                                continue;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                }
                if (zn4.a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            } else {
                i3 = 0;
            }
            c = i3;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a5 A[Catch: NumberFormatException -> 0x023a, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x023a, blocks: (B:149:0x024a, B:151:0x025c, B:162:0x0278, B:178:0x02a5), top: B:499:0x024a }] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x058c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair b(cu1 cu1Var) {
        char c2;
        int parseInt;
        int parseInt2;
        int i;
        int i2;
        String str;
        int i3;
        String str2;
        String valueOf;
        String str3;
        int i4;
        char c3;
        Integer num;
        int i5;
        int i6;
        int i7;
        StringBuilder sb;
        int i8;
        String sb2;
        int i9;
        int i10;
        char c4;
        Integer num2;
        Integer num3;
        int i11;
        String valueOf2;
        String str4;
        String str5 = cu1Var.h;
        if (str5 == null) {
            return null;
        }
        String[] split = str5.split("\\.");
        int i12 = 2;
        int i13 = 1;
        if ("video/dolby-vision".equals(cu1Var.k)) {
            String str6 = cu1Var.h;
            if (split.length >= 3) {
                Matcher matcher = a.matcher(split[1]);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    if (group != null) {
                        switch (group.hashCode()) {
                            case 1536:
                                if (group.equals("00")) {
                                    c4 = 0;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1537:
                                if (group.equals("01")) {
                                    c4 = 1;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1538:
                                if (group.equals("02")) {
                                    c4 = 2;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1539:
                                if (group.equals("03")) {
                                    c4 = 3;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1540:
                                if (group.equals("04")) {
                                    c4 = 4;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1541:
                                if (group.equals("05")) {
                                    c4 = 5;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1542:
                                if (group.equals("06")) {
                                    c4 = 6;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1543:
                                if (group.equals("07")) {
                                    c4 = 7;
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1544:
                                if (group.equals("08")) {
                                    c4 = '\b';
                                    break;
                                }
                                c4 = 65535;
                                break;
                            case 1545:
                                if (group.equals("09")) {
                                    c4 = '\t';
                                    break;
                                }
                                c4 = 65535;
                                break;
                            default:
                                c4 = 65535;
                                break;
                        }
                        switch (c4) {
                            case 0:
                                num2 = 1;
                                break;
                            case 1:
                                num2 = 2;
                                break;
                            case 2:
                                num2 = 4;
                                break;
                            case 3:
                                num2 = 8;
                                break;
                            case 4:
                                num2 = 16;
                                break;
                            case 5:
                                num2 = 32;
                                break;
                            case 6:
                                num2 = 64;
                                break;
                            case 7:
                                num2 = 128;
                                break;
                            case '\b':
                                num2 = 256;
                                break;
                            case '\t':
                                num2 = 512;
                                break;
                        }
                        if (num2 != null) {
                            valueOf2 = String.valueOf(group);
                            str4 = "Unknown Dolby Vision profile string: ";
                        } else {
                            String str7 = split[2];
                            if (str7 != null) {
                                int hashCode = str7.hashCode();
                                switch (hashCode) {
                                    case 1537:
                                        if (str7.equals("01")) {
                                            num3 = 1;
                                            break;
                                        }
                                        break;
                                    case 1538:
                                        if (str7.equals("02")) {
                                            num3 = 2;
                                            break;
                                        }
                                        break;
                                    case 1539:
                                        if (str7.equals("03")) {
                                            num3 = 4;
                                            break;
                                        }
                                        break;
                                    case 1540:
                                        if (str7.equals("04")) {
                                            num3 = 8;
                                            break;
                                        }
                                        break;
                                    case 1541:
                                        if (str7.equals("05")) {
                                            num3 = 16;
                                            break;
                                        }
                                        break;
                                    case 1542:
                                        if (str7.equals("06")) {
                                            num3 = 32;
                                            break;
                                        }
                                        break;
                                    case 1543:
                                        if (str7.equals("07")) {
                                            num3 = 64;
                                            break;
                                        }
                                        break;
                                    case 1544:
                                        if (str7.equals("08")) {
                                            num3 = 128;
                                            break;
                                        }
                                        break;
                                    case 1545:
                                        if (str7.equals("09")) {
                                            num3 = 256;
                                            break;
                                        }
                                        break;
                                    default:
                                        switch (hashCode) {
                                            case 1567:
                                                if (str7.equals("10")) {
                                                    num3 = 512;
                                                    break;
                                                }
                                                break;
                                            case 1568:
                                                if (str7.equals("11")) {
                                                    i11 = 1024;
                                                    num3 = Integer.valueOf(i11);
                                                    break;
                                                }
                                                break;
                                            case 1569:
                                                if (str7.equals("12")) {
                                                    i11 = 2048;
                                                    num3 = Integer.valueOf(i11);
                                                    break;
                                                }
                                                break;
                                            case 1570:
                                                if (str7.equals("13")) {
                                                    num3 = 4096;
                                                    break;
                                                }
                                                break;
                                        }
                                }
                                if (num3 == null) {
                                    return new Pair(num2, num3);
                                }
                                valueOf2 = String.valueOf(str7);
                                str4 = "Unknown Dolby Vision level string: ";
                            }
                            num3 = null;
                            if (num3 == null) {
                            }
                        }
                        lb4.c("MediaCodecUtil", str4.concat(valueOf2));
                        return null;
                    }
                    num2 = null;
                    if (num2 != null) {
                    }
                    lb4.c("MediaCodecUtil", str4.concat(valueOf2));
                    return null;
                }
            }
            valueOf2 = String.valueOf(str6);
            str4 = "Ignoring malformed Dolby Vision codec string: ";
            lb4.c("MediaCodecUtil", str4.concat(valueOf2));
            return null;
        }
        String str8 = split[0];
        switch (str8.hashCode()) {
            case 3004662:
                if (str8.equals("av01")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3006243:
                if (str8.equals("avc1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str8.equals("avc2")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str8.equals("hev1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str8.equals("hvc1")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3356560:
                if (str8.equals("mp4a")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3624515:
                if (str8.equals("vp09")) {
                    c2 = 2;
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
                String str9 = cu1Var.h;
                int length = split.length;
                if (length >= 2) {
                    if (split[1].length() == 6) {
                        parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                        parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                    } else if (length < 3) {
                        lb4.c("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str9);
                        return null;
                    } else {
                        parseInt = Integer.parseInt(split[1]);
                        parseInt2 = Integer.parseInt(split[2]);
                    }
                    if (parseInt == 66) {
                        i = -1;
                        i12 = 1;
                    } else if (parseInt == 77) {
                        i = -1;
                    } else if (parseInt == 88) {
                        i = -1;
                        i12 = 4;
                    } else if (parseInt == 100) {
                        i = -1;
                        i12 = 8;
                    } else if (parseInt == 110) {
                        i = -1;
                        i12 = 16;
                    } else if (parseInt == 122) {
                        i = -1;
                        i12 = 32;
                    } else if (parseInt != 244) {
                        i = -1;
                        i12 = -1;
                    } else {
                        i = -1;
                        i12 = 64;
                    }
                    if (i12 == i) {
                        str = "Unknown AVC profile: " + parseInt;
                    } else {
                        switch (parseInt2) {
                            case 10:
                                i2 = 1;
                                break;
                            case 11:
                                i2 = 4;
                                break;
                            case 12:
                                i2 = 8;
                                break;
                            case 13:
                                i2 = 16;
                                break;
                            default:
                                switch (parseInt2) {
                                    case 20:
                                        i2 = 32;
                                        break;
                                    case 21:
                                        i2 = 64;
                                        break;
                                    case 22:
                                        i2 = 128;
                                        break;
                                    default:
                                        switch (parseInt2) {
                                            case 30:
                                                i2 = 256;
                                                break;
                                            case 31:
                                                i2 = 512;
                                                break;
                                            case 32:
                                                i2 = 1024;
                                                break;
                                            default:
                                                switch (parseInt2) {
                                                    case 40:
                                                        i2 = 2048;
                                                        break;
                                                    case 41:
                                                        i2 = 4096;
                                                        break;
                                                    case 42:
                                                        i2 = 8192;
                                                        break;
                                                    default:
                                                        switch (parseInt2) {
                                                            case 50:
                                                                i2 = 16384;
                                                                break;
                                                            case 51:
                                                                i2 = 32768;
                                                                break;
                                                            case 52:
                                                                i2 = 65536;
                                                                break;
                                                            default:
                                                                i2 = -1;
                                                                break;
                                                        }
                                                }
                                        }
                                }
                        }
                        if (i2 != -1) {
                            return new Pair(Integer.valueOf(i12), Integer.valueOf(i2));
                        }
                        str = "Unknown AVC level: " + parseInt2;
                    }
                    lb4.c("MediaCodecUtil", str);
                    return null;
                }
                str = "Ignoring malformed AVC codec string: ".concat(String.valueOf(str9));
                lb4.c("MediaCodecUtil", str);
                return null;
            case 2:
                String str10 = cu1Var.h;
                if (split.length >= 3) {
                    try {
                        int parseInt3 = Integer.parseInt(split[1]);
                        int parseInt4 = Integer.parseInt(split[2]);
                        int i14 = parseInt3 != 0 ? parseInt3 != 1 ? parseInt3 != 2 ? parseInt3 != 3 ? -1 : 8 : 4 : 2 : 1;
                        if (i14 == -1) {
                            str2 = "Unknown VP9 profile: " + parseInt3;
                        } else {
                            if (parseInt4 == 10) {
                                i3 = -1;
                            } else if (parseInt4 == 11) {
                                i3 = -1;
                                i13 = 2;
                            } else if (parseInt4 == 20) {
                                i3 = -1;
                                i13 = 4;
                            } else if (parseInt4 == 21) {
                                i3 = -1;
                                i13 = 8;
                            } else if (parseInt4 == 30) {
                                i3 = -1;
                                i13 = 16;
                            } else if (parseInt4 == 31) {
                                i3 = -1;
                                i13 = 32;
                            } else if (parseInt4 == 40) {
                                i3 = -1;
                                i13 = 64;
                            } else if (parseInt4 == 41) {
                                i3 = -1;
                                i13 = 128;
                            } else if (parseInt4 == 50) {
                                i3 = -1;
                                i13 = 256;
                            } else if (parseInt4 != 51) {
                                i3 = -1;
                                switch (parseInt4) {
                                    case 60:
                                        i13 = 2048;
                                        break;
                                    case 61:
                                        i13 = 4096;
                                        break;
                                    case 62:
                                        i13 = 8192;
                                        break;
                                    default:
                                        i13 = -1;
                                        break;
                                }
                            } else {
                                i3 = -1;
                                i13 = 512;
                            }
                            if (i13 != i3) {
                                return new Pair(Integer.valueOf(i14), Integer.valueOf(i13));
                            }
                            str2 = "Unknown VP9 level: " + parseInt4;
                        }
                    } catch (NumberFormatException unused) {
                    }
                    lb4.c("MediaCodecUtil", str2);
                    return null;
                }
                str2 = "Ignoring malformed VP9 codec string: ".concat(String.valueOf(str10));
                lb4.c("MediaCodecUtil", str2);
                return null;
            case 3:
            case 4:
                String str11 = cu1Var.h;
                eu5 eu5Var = cu1Var.w;
                if (split.length >= 4) {
                    Matcher matcher2 = a.matcher(split[1]);
                    if (matcher2.matches()) {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            i4 = 1;
                        } else if (!"2".equals(group2)) {
                            valueOf = String.valueOf(group2);
                            str3 = "Unknown HEVC profile string: ";
                            lb4.c("MediaCodecUtil", str3.concat(valueOf));
                            return null;
                        } else {
                            i4 = (eu5Var == null || eu5Var.c != 6) ? 2 : 4096;
                        }
                        String str12 = split[3];
                        if (str12 != null) {
                            switch (str12.hashCode()) {
                                case 70821:
                                    if (str12.equals("H30")) {
                                        c3 = '\r';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 70914:
                                    if (str12.equals("H60")) {
                                        c3 = 14;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 70917:
                                    if (str12.equals("H63")) {
                                        c3 = 15;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 71007:
                                    if (str12.equals("H90")) {
                                        c3 = 16;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 71010:
                                    if (str12.equals("H93")) {
                                        c3 = 17;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74665:
                                    if (str12.equals("L30")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74758:
                                    if (str12.equals("L60")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74761:
                                    if (str12.equals("L63")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74851:
                                    if (str12.equals("L90")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 74854:
                                    if (str12.equals("L93")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193639:
                                    if (str12.equals("H120")) {
                                        c3 = 18;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193642:
                                    if (str12.equals("H123")) {
                                        c3 = 19;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193732:
                                    if (str12.equals("H150")) {
                                        c3 = 20;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193735:
                                    if (str12.equals("H153")) {
                                        c3 = 21;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193738:
                                    if (str12.equals("H156")) {
                                        c3 = 22;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193825:
                                    if (str12.equals("H180")) {
                                        c3 = 23;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193828:
                                    if (str12.equals("H183")) {
                                        c3 = 24;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2193831:
                                    if (str12.equals("H186")) {
                                        c3 = 25;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312803:
                                    if (str12.equals("L120")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312806:
                                    if (str12.equals("L123")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312896:
                                    if (str12.equals("L150")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312899:
                                    if (str12.equals("L153")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312902:
                                    if (str12.equals("L156")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312989:
                                    if (str12.equals("L180")) {
                                        c3 = '\n';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312992:
                                    if (str12.equals("L183")) {
                                        c3 = 11;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 2312995:
                                    if (str12.equals("L186")) {
                                        c3 = '\f';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    num = 1;
                                    break;
                                case 1:
                                    num = 4;
                                    break;
                                case 2:
                                    i5 = 16;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 3:
                                    num = 64;
                                    break;
                                case 4:
                                    num = 256;
                                    break;
                                case 5:
                                    num = 1024;
                                    break;
                                case 6:
                                    num = 4096;
                                    break;
                                case 7:
                                    i5 = 16384;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\b':
                                    i5 = 65536;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\t':
                                    i5 = 262144;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\n':
                                    i5 = 1048576;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 11:
                                    i5 = 4194304;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\f':
                                    i5 = 16777216;
                                    num = Integer.valueOf(i5);
                                    break;
                                case '\r':
                                    num = 2;
                                    break;
                                case 14:
                                    num = 8;
                                    break;
                                case 15:
                                    num = 32;
                                    break;
                                case 16:
                                    num = 128;
                                    break;
                                case 17:
                                    num = 512;
                                    break;
                                case 18:
                                    i5 = 2048;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 19:
                                    num = 8192;
                                    break;
                                case 20:
                                    i5 = 32768;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 21:
                                    i5 = 131072;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 22:
                                    i5 = 524288;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 23:
                                    i5 = 2097152;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 24:
                                    i5 = 8388608;
                                    num = Integer.valueOf(i5);
                                    break;
                                case 25:
                                    i5 = 33554432;
                                    num = Integer.valueOf(i5);
                                    break;
                            }
                            if (num != null) {
                                valueOf = String.valueOf(str12);
                                str3 = "Unknown HEVC level string: ";
                                lb4.c("MediaCodecUtil", str3.concat(valueOf));
                                return null;
                            }
                            return new Pair(Integer.valueOf(i4), num);
                        }
                        num = null;
                        if (num != null) {
                        }
                    }
                }
                valueOf = String.valueOf(str11);
                str3 = "Ignoring malformed HEVC codec string: ";
                lb4.c("MediaCodecUtil", str3.concat(valueOf));
                return null;
            case 5:
                String str13 = cu1Var.h;
                eu5 eu5Var2 = cu1Var.w;
                if (split.length >= 4) {
                    try {
                        int parseInt5 = Integer.parseInt(split[1]);
                        int parseInt6 = Integer.parseInt(split[2].substring(0, 2));
                        int parseInt7 = Integer.parseInt(split[3]);
                        if (parseInt5 != 0) {
                            sb = new StringBuilder();
                            sb.append("Unknown AV1 profile: ");
                            sb.append(parseInt5);
                        } else {
                            if (parseInt7 == 8) {
                                i6 = 1;
                            } else if (parseInt7 != 10) {
                                sb = new StringBuilder();
                                sb.append("Unknown AV1 bit depth: ");
                                sb.append(parseInt7);
                            } else {
                                i6 = (eu5Var2 == null || !(eu5Var2.d != null || (i8 = eu5Var2.c) == 7 || i8 == 6)) ? 2 : 4096;
                            }
                            switch (parseInt6) {
                                case 0:
                                    i7 = 1;
                                    break;
                                case 1:
                                    i7 = 2;
                                    break;
                                case 2:
                                    i7 = 4;
                                    break;
                                case 3:
                                    i7 = 8;
                                    break;
                                case 4:
                                    i7 = 16;
                                    break;
                                case 5:
                                    i7 = 32;
                                    break;
                                case 6:
                                    i7 = 64;
                                    break;
                                case 7:
                                    i7 = 128;
                                    break;
                                case 8:
                                    i7 = 256;
                                    break;
                                case 9:
                                    i7 = 512;
                                    break;
                                case 10:
                                    i7 = 1024;
                                    break;
                                case 11:
                                    i7 = 2048;
                                    break;
                                case 12:
                                    i7 = 4096;
                                    break;
                                case 13:
                                    i7 = 8192;
                                    break;
                                case 14:
                                    i7 = 16384;
                                    break;
                                case 15:
                                    i7 = 32768;
                                    break;
                                case 16:
                                    i7 = 65536;
                                    break;
                                case 17:
                                    i7 = 131072;
                                    break;
                                case 18:
                                    i7 = 262144;
                                    break;
                                case 19:
                                    i7 = 524288;
                                    break;
                                case 20:
                                    i7 = 1048576;
                                    break;
                                case 21:
                                    i7 = 2097152;
                                    break;
                                case 22:
                                    i7 = 4194304;
                                    break;
                                case 23:
                                    i7 = 8388608;
                                    break;
                                default:
                                    i7 = -1;
                                    break;
                            }
                            if (i7 != -1) {
                                return new Pair(Integer.valueOf(i6), Integer.valueOf(i7));
                            }
                            sb = new StringBuilder();
                            sb.append("Unknown AV1 level: ");
                            sb.append(parseInt6);
                        }
                        sb2 = sb.toString();
                    } catch (NumberFormatException unused2) {
                    }
                    lb4.c("MediaCodecUtil", sb2);
                    return null;
                }
                sb2 = "Ignoring malformed AV1 codec string: ".concat(String.valueOf(str13));
                lb4.c("MediaCodecUtil", sb2);
                return null;
            case 6:
                String str14 = cu1Var.h;
                if (split.length == 3) {
                    try {
                        if ("audio/mp4a-latm".equals(mx2.c(Integer.parseInt(split[1], 16)))) {
                            int parseInt8 = Integer.parseInt(split[2]);
                            if (parseInt8 != 17) {
                                if (parseInt8 == 20) {
                                    i10 = -1;
                                    i9 = 20;
                                } else if (parseInt8 == 23) {
                                    i9 = 23;
                                } else if (parseInt8 == 29) {
                                    i9 = 29;
                                } else if (parseInt8 == 39) {
                                    i9 = 39;
                                } else if (parseInt8 != 42) {
                                    switch (parseInt8) {
                                        case 1:
                                            i10 = -1;
                                            i9 = 1;
                                            break;
                                        case 2:
                                            i10 = -1;
                                            i9 = 2;
                                            break;
                                        case 3:
                                            i10 = -1;
                                            i9 = 3;
                                            break;
                                        case 4:
                                            i10 = -1;
                                            i9 = 4;
                                            break;
                                        case 5:
                                            i10 = -1;
                                            i9 = 5;
                                            break;
                                        case 6:
                                            i10 = -1;
                                            i9 = 6;
                                            break;
                                        default:
                                            i10 = -1;
                                            i9 = -1;
                                            break;
                                    }
                                } else {
                                    i9 = 42;
                                }
                                if (i9 != i10) {
                                    return new Pair(Integer.valueOf(i9), 0);
                                }
                            } else {
                                i9 = 17;
                            }
                            i10 = -1;
                            if (i9 != i10) {
                            }
                        }
                    } catch (NumberFormatException unused3) {
                    }
                    return null;
                }
                lb4.c("MediaCodecUtil", "Ignoring malformed MP4A codec string: ".concat(String.valueOf(str14)));
                return null;
            default:
                return null;
        }
    }

    public static String c(cu1 cu1Var) {
        Pair b2;
        if ("audio/eac3-joc".equals(cu1Var.k)) {
            return "audio/eac3";
        }
        if (!"video/dolby-vision".equals(cu1Var.k) || (b2 = b(cu1Var)) == null) {
            return null;
        }
        int intValue = ((Integer) b2.first).intValue();
        if (intValue == 16 || intValue == 256) {
            return "video/hevc";
        }
        if (intValue == 512) {
            return "video/avc";
        }
        return null;
    }

    public static synchronized List d(String str, boolean z, boolean z2) {
        yt5 zt5Var;
        synchronized (lu5.class) {
            wt5 wt5Var = new wt5(str, z, z2);
            HashMap hashMap = b;
            List list = (List) hashMap.get(wt5Var);
            if (list != null) {
                return list;
            }
            int i = zn4.a;
            if (i >= 21) {
                zt5Var = new hu5(z, z2);
            } else {
                zt5Var = new zt5();
            }
            ArrayList e = e(wt5Var, zt5Var);
            if (z && e.isEmpty() && i >= 21 && i <= 23) {
                e = e(wt5Var, new zt5());
                if (!e.isEmpty()) {
                    String str2 = ((pt5) e.get(0)).a;
                    lb4.c("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && zn4.b.equals("R9") && e.size() == 1 && ((pt5) e.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    e.add(pt5.b("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
                }
                Collections.sort(e, new vt5(yf.W));
            }
            if (i < 21 && e.size() > 1) {
                String str3 = ((pt5) e.get(0)).a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    Collections.sort(e, new vt5(zf.Q));
                }
            }
            if (i < 32 && e.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((pt5) e.get(0)).a)) {
                e.add((pt5) e.remove(0));
            }
            nv4 t = nv4.t(e);
            hashMap.put(wt5Var, t);
            return t;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
        if ("SCV31".equals(r9) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0114, code lost:
        if (r7.startsWith("t0") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
        if (r8 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e3 A[Catch: Exception -> 0x0244, TryCatch #1 {Exception -> 0x0244, blocks: (B:115:0x01b2, B:121:0x01c9, B:127:0x01dd, B:129:0x01e3, B:134:0x01f1, B:136:0x01f9, B:146:0x0223, B:149:0x0229, B:137:0x01fe, B:139:0x020e, B:141:0x0216, B:130:0x01e8), top: B:177:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e8 A[Catch: Exception -> 0x0244, TryCatch #1 {Exception -> 0x0244, blocks: (B:115:0x01b2, B:121:0x01c9, B:127:0x01dd, B:129:0x01e3, B:134:0x01f1, B:136:0x01f9, B:146:0x0223, B:149:0x0229, B:137:0x01fe, B:139:0x020e, B:141:0x0216, B:130:0x01e8), top: B:177:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f9 A[Catch: Exception -> 0x0244, TryCatch #1 {Exception -> 0x0244, blocks: (B:115:0x01b2, B:121:0x01c9, B:127:0x01dd, B:129:0x01e3, B:134:0x01f1, B:136:0x01f9, B:146:0x0223, B:149:0x0229, B:137:0x01fe, B:139:0x020e, B:141:0x0216, B:130:0x01e8), top: B:177:0x01b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fe A[Catch: Exception -> 0x0244, TryCatch #1 {Exception -> 0x0244, blocks: (B:115:0x01b2, B:121:0x01c9, B:127:0x01dd, B:129:0x01e3, B:134:0x01f1, B:136:0x01f9, B:146:0x0223, B:149:0x0229, B:137:0x01fe, B:139:0x020e, B:141:0x0216, B:130:0x01e8), top: B:177:0x01b2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList e(wt5 wt5Var, yt5 yt5Var) {
        String str;
        String str2;
        String str3;
        int i;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean c2;
        boolean d;
        int i2;
        boolean a2;
        boolean f;
        boolean z;
        boolean isAlias;
        wt5 wt5Var2 = wt5Var;
        yt5 yt5Var2 = yt5Var;
        try {
            ArrayList arrayList = new ArrayList();
            String str4 = wt5Var2.a;
            int a3 = yt5Var.a();
            boolean b2 = yt5Var.b();
            int i3 = 0;
            while (i3 < a3) {
                MediaCodecInfo B = yt5Var2.B(i3);
                int i4 = zn4.a;
                if (i4 >= 29) {
                    isAlias = B.isAlias();
                }
                String name = B.getName();
                if (!B.isEncoder() && ((b2 || !name.endsWith(".secure")) && (i4 >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))))) {
                    if (i4 < 24 && (("OMX.SEC.aac.dec".equals(name) || "OMX.Exynos.AAC.Decoder".equals(name)) && "samsung".equals(zn4.c))) {
                        String str5 = zn4.b;
                        if (!str5.startsWith("zeroflte")) {
                            if (!str5.startsWith("zerolte")) {
                                if (!str5.startsWith("zenlte")) {
                                    if (!"SC-05G".equals(str5)) {
                                        if (!"marinelteatt".equals(str5)) {
                                            if (!"404SC".equals(str5)) {
                                                if (!"SC-04G".equals(str5)) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (i4 <= 19 && "OMX.SEC.vp8.dec".equals(name) && "samsung".equals(zn4.c)) {
                        String str6 = zn4.b;
                        if (!str6.startsWith("d2")) {
                            if (!str6.startsWith("serrano")) {
                                if (!str6.startsWith("jflte")) {
                                    if (!str6.startsWith("santos")) {
                                    }
                                }
                            }
                        }
                    }
                    if ((i4 > 19 || !zn4.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)) && (i4 > 23 || !"audio/eac3-joc".equals(str4) || !"OMX.MTK.AUDIO.DECODER.DSPAC3".equals(name))) {
                        String[] supportedTypes = B.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length) {
                                str = supportedTypes[i5];
                                if (str.equalsIgnoreCase(str4)) {
                                    break;
                                }
                                i5++;
                            } else if (str4.equals("video/dolby-vision")) {
                                if ("OMX.MS.HEVCDV.Decoder".equals(name)) {
                                    str = "video/hevcdv";
                                } else {
                                    if ("OMX.RTK.video.decoder".equals(name) || "OMX.realtek.video.decoder.tunneled".equals(name)) {
                                        str = "video/dv_hevc";
                                    }
                                    str = null;
                                }
                            } else if (str4.equals("audio/alac") && "OMX.lge.alac.decoder".equals(name)) {
                                str = "audio/x-lg-alac";
                            } else if (str4.equals("audio/flac") && "OMX.lge.flac.decoder".equals(name)) {
                                str = "audio/x-lg-flac";
                            } else {
                                if (str4.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(name)) {
                                    str = "audio/lg-ac3";
                                }
                                str = null;
                            }
                        }
                        if (str != null) {
                            try {
                                capabilitiesForType = B.getCapabilitiesForType(str);
                                c2 = yt5Var2.c("tunneled-playback", str, capabilitiesForType);
                                d = yt5Var2.d("tunneled-playback", capabilitiesForType);
                            } catch (Exception e) {
                                e = e;
                                str2 = str;
                                str3 = name;
                                i = i3;
                            }
                            if (wt5Var2.c) {
                                if (!c2) {
                                }
                                boolean c3 = yt5Var2.c("secure-playback", str, capabilitiesForType);
                                boolean d2 = yt5Var2.d("secure-playback", capabilitiesForType);
                                if (wt5Var2.b) {
                                }
                                i3 = i + 1;
                                wt5Var2 = wt5Var;
                                yt5Var2 = yt5Var;
                            } else if (!d) {
                                boolean c32 = yt5Var2.c("secure-playback", str, capabilitiesForType);
                                boolean d22 = yt5Var2.d("secure-playback", capabilitiesForType);
                                if (wt5Var2.b) {
                                    if (!d22) {
                                        i2 = zn4.a;
                                        a2 = i2 < 29 ? ju5.a(B) : !f(B, str4);
                                        f = f(B, str4);
                                        if (i2 < 29) {
                                            z = B.isVendor();
                                        } else {
                                            String c4 = q05.c(B.getName());
                                            z = (c4.startsWith("omx.google.") || c4.startsWith("c2.android.") || c4.startsWith("c2.google.")) ? false : true;
                                        }
                                        if ((b2 || wt5Var2.b != c32) && (b2 || wt5Var2.b)) {
                                            str2 = str;
                                            str3 = name;
                                            i = i3;
                                            if (!b2 && c32) {
                                                arrayList.add(pt5.b(str3 + ".secure", str4, str2, capabilitiesForType, a2, f, z, true));
                                                return arrayList;
                                            }
                                        } else {
                                            str2 = str;
                                            str3 = name;
                                            i = i3;
                                            try {
                                                arrayList.add(pt5.b(name, str4, str, capabilitiesForType, a2, f, z, false));
                                            } catch (Exception e2) {
                                                e = e2;
                                                if (zn4.a > 23 || arrayList.isEmpty()) {
                                                    lb4.a("MediaCodecUtil", "Failed to query codec " + str3 + " (" + str2 + ")");
                                                    throw e;
                                                }
                                                lb4.a("MediaCodecUtil", "Skipping codec " + str3 + " (failed to query capabilities)");
                                                i3 = i + 1;
                                                wt5Var2 = wt5Var;
                                                yt5Var2 = yt5Var;
                                            }
                                        }
                                    }
                                } else if (c32) {
                                    c32 = true;
                                    i2 = zn4.a;
                                    if (i2 < 29) {
                                    }
                                    f = f(B, str4);
                                    if (i2 < 29) {
                                    }
                                    if (b2) {
                                    }
                                    str2 = str;
                                    str3 = name;
                                    i = i3;
                                    if (!b2) {
                                        arrayList.add(pt5.b(str3 + ".secure", str4, str2, capabilitiesForType, a2, f, z, true));
                                        return arrayList;
                                    }
                                    continue;
                                }
                                i3 = i + 1;
                                wt5Var2 = wt5Var;
                                yt5Var2 = yt5Var;
                            }
                        }
                    }
                }
                i = i3;
                i3 = i + 1;
                wt5Var2 = wt5Var;
                yt5Var2 = yt5Var;
            }
            return arrayList;
        } catch (Exception e3) {
            throw new xt5(e3);
        }
    }

    public static boolean f(MediaCodecInfo mediaCodecInfo, String str) {
        if (zn4.a >= 29) {
            return ku5.a(mediaCodecInfo);
        }
        if (mx2.e(str)) {
            return true;
        }
        String c2 = q05.c(mediaCodecInfo.getName());
        if (c2.startsWith("arc.")) {
            return false;
        }
        if (c2.startsWith("omx.google.") || c2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((c2.startsWith("omx.sec.") && c2.contains(".sw.")) || c2.equals("omx.qcom.video.decoder.hevcswvdec") || c2.startsWith("c2.android.") || c2.startsWith("c2.google.")) {
            return true;
        }
        return (c2.startsWith("omx.") || c2.startsWith("c2.")) ? false : true;
    }
}