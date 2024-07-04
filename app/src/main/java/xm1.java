package defpackage;

import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: xm1  reason: default package */
public final class xm1 implements lk1 {
    public nk1 b;
    public int c;
    public int d;
    public int e;
    public zo1 g;
    public mk1 h;
    public an1 i;
    public vq1 j;
    public final kh4 a = new kh4(6);
    public long f = -1;

    @Override // defpackage.lk1
    public final boolean a(p16 p16Var) {
        if (b(p16Var) != 65496) {
            return false;
        }
        int b = b(p16Var);
        this.d = b;
        if (b == 65504) {
            this.a.b(2);
            p16Var.B(this.a.a, 0, 2, false);
            p16Var.h(this.a.q() - 2, false);
            b = b(p16Var);
            this.d = b;
        }
        if (b == 65505) {
            p16Var.h(2, false);
            this.a.b(6);
            p16Var.B(this.a.a, 0, 6, false);
            if (this.a.u() == 1165519206 && this.a.q() == 0) {
                return true;
            }
        }
        return false;
    }

    public final int b(mk1 mk1Var) {
        this.a.b(2);
        ((p16) mk1Var).B(this.a.a, 0, 2, false);
        return this.a.q();
    }

    public final void c() {
        f(new et2[0]);
        nk1 nk1Var = this.b;
        nk1Var.getClass();
        nk1Var.j();
        this.b.n(new ll1(-9223372036854775807L, 0L));
        this.c = 6;
    }

    @Override // defpackage.lk1
    public final void d(nk1 nk1Var) {
        this.b = nk1Var;
    }

    @Override // defpackage.lk1
    public final void e(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            vq1 vq1Var = this.j;
            vq1Var.getClass();
            vq1Var.e(j, j2);
        }
    }

    public final void f(et2... et2VarArr) {
        nk1 nk1Var = this.b;
        nk1Var.getClass();
        pl1 q = nk1Var.q(1024, 4);
        bs1 bs1Var = new bs1();
        bs1Var.i = "image/jpeg";
        bs1Var.h = new yt2(-9223372036854775807L, et2VarArr);
        q.e(new cu1(bs1Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ef, code lost:
        r16 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024e, code lost:
        if (r2.isEmpty() == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0251, code lost:
        r1 = new defpackage.zm1(r8, r2);
        r2 = null;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x018e, code lost:
        r1 = defpackage.nv4.Q;
        r1 = defpackage.nw4.T;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258 A[LOOP:0: B:54:0x0107->B:124:0x0258, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024a A[EDGE_INSN: B:193:0x024a->B:120:0x024a ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.lk1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int i(mk1 mk1Var, jl1 jl1Var) {
        String x;
        zo1 zo1Var;
        zm1 zm1Var;
        int size;
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        XmlPullParser newPullParser;
        nw4 nw4Var;
        boolean z;
        String str;
        String str2;
        boolean z2;
        long j6;
        long j7;
        zo1 zo1Var2;
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i == 6) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.i == null || mk1Var != this.h) {
                            this.h = mk1Var;
                            this.i = new an1((p16) mk1Var, this.f);
                        }
                        vq1 vq1Var = this.j;
                        vq1Var.getClass();
                        int i2 = vq1Var.i(this.i, jl1Var);
                        if (i2 == 1) {
                            jl1Var.a += this.f;
                        }
                        return i2;
                    }
                    p16 p16Var = (p16) mk1Var;
                    long j8 = p16Var.d;
                    long j9 = this.f;
                    if (j8 == j9) {
                        if (p16Var.B(this.a.a, 0, 1, true)) {
                            p16Var.f = 0;
                            if (this.j == null) {
                                this.j = new vq1();
                            }
                            an1 an1Var = new an1(p16Var, this.f);
                            this.i = an1Var;
                            this.j.getClass();
                            if (vj.H(an1Var, false)) {
                                vq1 vq1Var2 = this.j;
                                long j10 = this.f;
                                nk1 nk1Var = this.b;
                                nk1Var.getClass();
                                vq1Var2.p = new hn1(j10, nk1Var);
                                zo1 zo1Var3 = this.g;
                                zo1Var3.getClass();
                                f(zo1Var3);
                                this.c = 5;
                                return 0;
                            }
                        }
                        c();
                        return 0;
                    }
                    jl1Var.a = j9;
                    return 1;
                }
                if (this.d == 65505) {
                    kh4 kh4Var = new kh4(this.e);
                    ((p16) mk1Var).A(kh4Var.a, 0, this.e, false);
                    if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(kh4Var.x()) && (x = kh4Var.x()) != null) {
                        long j11 = ((p16) mk1Var).c;
                        if (j11 == -1) {
                            zo1Var = null;
                        } else {
                            try {
                                newPullParser = XmlPullParserFactory.newInstance().newPullParser();
                                newPullParser.setInput(new StringReader(x));
                                newPullParser.next();
                            } catch (NumberFormatException | jy2 | XmlPullParserException unused) {
                                zo1Var = null;
                            }
                            if (eg4.p(newPullParser, "x:xmpmeta")) {
                                lv4 lv4Var = nv4.Q;
                                nw4 nw4Var2 = nw4.T;
                                long j12 = -9223372036854775807L;
                                loop0: while (true) {
                                    newPullParser.next();
                                    if (!eg4.p(newPullParser, "rdf:Description")) {
                                        if (eg4.p(newPullParser, "Container:Directory")) {
                                            str = "Container";
                                            str2 = "Item";
                                        } else {
                                            if (eg4.p(newPullParser, "GContainer:Directory")) {
                                                str = "GContainer";
                                                str2 = "GContainerItem";
                                            }
                                            long j13 = j12;
                                            if (newPullParser.getEventType() != 3 && newPullParser.getName().equals("x:xmpmeta")) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (!z) {
                                                break;
                                            }
                                            j12 = j13;
                                        }
                                        kv4 kv4Var = new kv4();
                                        while (true) {
                                            String concat = str.concat(":Item");
                                            newPullParser.next();
                                            if (eg4.p(newPullParser, concat)) {
                                                String concat2 = str2.concat(":Mime");
                                                String concat3 = str2.concat(":Semantic");
                                                String concat4 = str2.concat(":Length");
                                                String concat5 = str2.concat(":Padding");
                                                String m = eg4.m(newPullParser, concat2);
                                                String m2 = eg4.m(newPullParser, concat3);
                                                String m3 = eg4.m(newPullParser, concat4);
                                                String m4 = eg4.m(newPullParser, concat5);
                                                if (m == null || m2 == null) {
                                                    break;
                                                }
                                                if (m3 != null) {
                                                    j6 = Long.parseLong(m3);
                                                } else {
                                                    j6 = 0;
                                                }
                                                if (m4 != null) {
                                                    j7 = Long.parseLong(m4);
                                                } else {
                                                    j7 = 0;
                                                }
                                                kv4Var.p(new ym1(m, j6, j7));
                                            }
                                            String concat6 = str.concat(":Directory");
                                            if (newPullParser.getEventType() == 3 && newPullParser.getName().equals(concat6)) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                nw4Var = kv4Var.s();
                                                break;
                                            }
                                        }
                                    } else {
                                        String[] strArr = in1.a;
                                        int i3 = 0;
                                        while (true) {
                                            if (i3 >= 4) {
                                                break loop0;
                                            }
                                            String m5 = eg4.m(newPullParser, strArr[i3]);
                                            if (m5 != null) {
                                                if (Integer.parseInt(m5) != 1) {
                                                    break;
                                                }
                                                String[] strArr2 = in1.b;
                                                int i4 = 0;
                                                while (true) {
                                                    if (i4 >= 4) {
                                                        break;
                                                    }
                                                    String m6 = eg4.m(newPullParser, strArr2[i4]);
                                                    if (m6 != null) {
                                                        long parseLong = Long.parseLong(m6);
                                                        if (parseLong != -1) {
                                                            j12 = parseLong;
                                                        }
                                                    } else {
                                                        i4++;
                                                    }
                                                }
                                                String[] strArr3 = in1.c;
                                                int i5 = 0;
                                                while (true) {
                                                    if (i5 < 2) {
                                                        String m7 = eg4.m(newPullParser, strArr3[i5]);
                                                        if (m7 != null) {
                                                            Object[] objArr = {new ym1("image/jpeg", 0L, 0L), new ym1("video/mp4", Long.parseLong(m7), 0L)};
                                                            lw4.a(2, objArr);
                                                            nw4Var = nv4.s(2, objArr);
                                                            break;
                                                        }
                                                        i5++;
                                                    } else {
                                                        nw4Var = nw4.T;
                                                        break;
                                                    }
                                                }
                                            } else {
                                                i3++;
                                            }
                                        }
                                    }
                                    nw4Var2 = nw4Var;
                                    long j132 = j12;
                                    if (newPullParser.getEventType() != 3) {
                                    }
                                    z = false;
                                    if (!z) {
                                    }
                                }
                                zo1Var = null;
                                zm1Var = zo1Var;
                                if (zm1Var != 0 && zm1Var.b.size() >= 2) {
                                    boolean z3 = false;
                                    j = -1;
                                    j2 = -1;
                                    j3 = -1;
                                    j4 = -1;
                                    for (size = zm1Var.b.size() - 1; size >= 0; size--) {
                                        ym1 ym1Var = (ym1) zm1Var.b.get(size);
                                        z3 |= "video/mp4".equals(ym1Var.a);
                                        if (size == 0) {
                                            j5 = j11 - ym1Var.c;
                                            j11 = 0;
                                        } else {
                                            long j14 = j11 - ym1Var.b;
                                            j5 = j11;
                                            j11 = j14;
                                        }
                                        if (z3 && j11 != j5) {
                                            j4 = j5 - j11;
                                            j3 = j11;
                                            z3 = false;
                                        }
                                        if (size == 0) {
                                            j2 = j5;
                                        }
                                        if (size == 0) {
                                            j = j11;
                                        }
                                    }
                                    if (j3 != -1 && j4 != -1 && j != -1 && j2 != -1) {
                                        zo1Var = new zo1(j, j2, zm1Var.a, j3, j4);
                                    }
                                }
                            } else {
                                zo1Var = null;
                                try {
                                    throw jy2.a("Couldn't find xmp metadata", null);
                                } catch (NumberFormatException | jy2 | XmlPullParserException unused2) {
                                    lb4.c("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
                                    zm1Var = zo1Var;
                                    if (zm1Var != 0) {
                                        boolean z32 = false;
                                        j = -1;
                                        j2 = -1;
                                        j3 = -1;
                                        j4 = -1;
                                        while (size >= 0) {
                                        }
                                        if (j3 != -1) {
                                            zo1Var = new zo1(j, j2, zm1Var.a, j3, j4);
                                        }
                                    }
                                    zo1Var2 = zo1Var;
                                    this.g = zo1Var2;
                                    if (zo1Var2 != null) {
                                    }
                                    this.c = 0;
                                    return 0;
                                }
                            }
                        }
                        zo1Var2 = zo1Var;
                        this.g = zo1Var2;
                        if (zo1Var2 != null) {
                            this.f = zo1Var2.S;
                        }
                    }
                } else {
                    ((p16) mk1Var).k(this.e);
                }
                this.c = 0;
                return 0;
            }
            this.a.b(2);
            ((p16) mk1Var).A(this.a.a, 0, 2, false);
            this.e = this.a.q() - 2;
            this.c = 2;
            return 0;
        }
        this.a.b(2);
        ((p16) mk1Var).A(this.a.a, 0, 2, false);
        int q = this.a.q();
        this.d = q;
        if (q == 65498) {
            if (this.f != -1) {
                this.c = 4;
                return 0;
            }
            c();
            return 0;
        } else if ((q < 65488 || q > 65497) && q != 65281) {
            this.c = 1;
            return 0;
        } else {
            return 0;
        }
    }
}