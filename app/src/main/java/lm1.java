package defpackage;

/* renamed from: lm1  reason: default package */
public final class lm1 implements wl1 {
    public final nv4 a;
    public final int b;

    public lm1(int i, nw4 nw4Var) {
        this.b = i;
        this.a = nw4Var;
    }

    public static lm1 c(int i, kh4 kh4Var) {
        String concat;
        String str;
        String str2;
        kv4 kv4Var = new kv4();
        int i2 = kh4Var.c;
        int i3 = -2;
        while (kh4Var.c - kh4Var.b > 8) {
            int j = kh4Var.j();
            int j2 = kh4Var.b + kh4Var.j();
            kh4Var.d(j2);
            wl1 wl1Var = null;
            if (j == 1414744396) {
                wl1Var = c(kh4Var.j(), kh4Var);
            } else {
                switch (j) {
                    case 1718776947:
                        if (i3 == 2) {
                            kh4Var.f(4);
                            int j3 = kh4Var.j();
                            int j4 = kh4Var.j();
                            kh4Var.f(4);
                            int j5 = kh4Var.j();
                            switch (j5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                concat = k6.a("Ignoring track with unsupported compression ", j5);
                                lb4.c("StreamFormatChunk", concat);
                                break;
                            } else {
                                bs1 bs1Var = new bs1();
                                bs1Var.o = j3;
                                bs1Var.p = j4;
                                bs1Var.j = str2;
                                wl1Var = new mm1(new cu1(bs1Var));
                                break;
                            }
                        } else {
                            if (i3 == 1) {
                                int l = kh4Var.l();
                                if (l == 1) {
                                    str = "audio/raw";
                                } else if (l != 85) {
                                    if (l == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (l != 8192) {
                                        if (l != 8193) {
                                            str = null;
                                        } else {
                                            str = "audio/vnd.dts";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/mpeg";
                                }
                                if (str == null) {
                                    concat = k6.a("Ignoring track with unsupported format tag ", l);
                                } else {
                                    int l2 = kh4Var.l();
                                    int j6 = kh4Var.j();
                                    kh4Var.f(6);
                                    int m = zn4.m(kh4Var.q());
                                    int l3 = kh4Var.l();
                                    byte[] bArr = new byte[l3];
                                    kh4Var.a(bArr, 0, l3);
                                    bs1 bs1Var2 = new bs1();
                                    bs1Var2.j = str;
                                    bs1Var2.w = l2;
                                    bs1Var2.x = j6;
                                    if ("audio/raw".equals(str) && m != 0) {
                                        bs1Var2.y = m;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && l3 > 0) {
                                        bs1Var2.l = nv4.v(bArr);
                                    }
                                    wl1Var = new mm1(new cu1(bs1Var2));
                                    break;
                                }
                            } else {
                                concat = "Ignoring strf box for unsupported track type: ".concat(zn4.v(i3));
                            }
                            lb4.c("StreamFormatChunk", concat);
                        }
                    case 1751742049:
                        int j7 = kh4Var.j();
                        kh4Var.f(8);
                        int j8 = kh4Var.j();
                        int j9 = kh4Var.j();
                        kh4Var.f(4);
                        kh4Var.j();
                        kh4Var.f(12);
                        wl1Var = new im1(j7, j8, j9);
                        break;
                    case 1752331379:
                        int j10 = kh4Var.j();
                        kh4Var.f(12);
                        kh4Var.j();
                        int j11 = kh4Var.j();
                        int j12 = kh4Var.j();
                        kh4Var.f(4);
                        int j13 = kh4Var.j();
                        int j14 = kh4Var.j();
                        kh4Var.f(8);
                        wl1Var = new jm1(j10, j11, j12, j13, j14);
                        break;
                    case 1852994675:
                        wl1Var = new nm1(kh4Var.z(kh4Var.c - kh4Var.b, zs4.c));
                        break;
                }
            }
            if (wl1Var != null) {
                if (wl1Var.a() == 1752331379) {
                    int i4 = ((jm1) wl1Var).a;
                    if (i4 != 1935960438) {
                        if (i4 != 1935963489) {
                            if (i4 != 1937012852) {
                                lb4.c("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i4))));
                                i3 = -1;
                            } else {
                                i3 = 3;
                            }
                        } else {
                            i3 = 1;
                        }
                    } else {
                        i3 = 2;
                    }
                }
                kv4Var.p(wl1Var);
            }
            kh4Var.e(j2);
            kh4Var.d(i2);
        }
        return new lm1(i, kv4Var.s());
    }

    @Override // defpackage.wl1
    public final int a() {
        return this.b;
    }

    public final wl1 b(Class cls) {
        nv4 nv4Var = this.a;
        int size = nv4Var.size();
        int i = 0;
        while (i < size) {
            wl1 wl1Var = (wl1) nv4Var.get(i);
            i++;
            if (wl1Var.getClass() == cls) {
                return wl1Var;
            }
        }
        return null;
    }
}