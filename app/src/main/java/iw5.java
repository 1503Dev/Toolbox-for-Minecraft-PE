package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: iw5  reason: default package */
public final class iw5 {
    public final Uri a;
    public final fe5 b;
    public final aw5 c;
    public final nk1 d;
    public final sy3 e;
    public volatile boolean g;
    public long i;
    public kz4 j;
    public vw5 k;
    public boolean l;
    public final /* synthetic */ mw5 m;
    public final jl1 f = new jl1();
    public boolean h = true;

    public iw5(mw5 mw5Var, Uri uri, fv4 fv4Var, aw5 aw5Var, nk1 nk1Var, sy3 sy3Var) {
        this.m = mw5Var;
        this.a = uri;
        this.b = new fe5(fv4Var);
        this.c = aw5Var;
        this.d = nk1Var;
        this.e = sy3Var;
        xu5.a.getAndIncrement();
        this.j = b(0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(34:5|6|(1:8)|9|10|(5:12|13|14|15|(28:17|18|(1:20)(1:133)|21|(1:23)(1:132)|24|(1:26)(1:131)|27|(1:29)(1:130)|30|(4:32|33|34|(16:36|(1:38)|39|(1:121)(1:43)|44|(2:46|(1:48))|49|(1:51)|52|(1:(3:54|55|(6:57|58|19e|66|(5:72|73|1cf|78|79)(3:68|69|70)|71)(2:88|89))(2:119|120))|(1:91)(3:103|(1:105)|106)|92|93|94|96|(2:98|99))(2:122|123))|129|(0)|39|(1:41)|121|44|(0)|49|(0)|52|(2:(0)(0)|71)|(0)(0)|92|93|94|96|(0))(2:134|135))|141|18|(0)(0)|21|(0)(0)|24|(0)(0)|27|(0)(0)|30|(0)|129|(0)|39|(0)|121|44|(0)|49|(0)|52|(2:(0)(0)|71)|(0)(0)|92|93|94|96|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0217, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0198 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a1 A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cd A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9 A[Catch: all -> 0x021a, TRY_LEAVE, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011f A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130 A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d A[Catch: all -> 0x021a, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017f A[Catch: all -> 0x021a, TRY_LEAVE, TryCatch #4 {all -> 0x021a, blocks: (B:6:0x000c, B:8:0x0020, B:9:0x002e, B:12:0x0044, B:13:0x004a, B:22:0x0080, B:24:0x008b, B:26:0x0097, B:28:0x00a1, B:30:0x00ad, B:32:0x00b7, B:34:0x00c3, B:36:0x00cd, B:38:0x00df, B:40:0x00e9, B:41:0x00ef, B:50:0x011f, B:51:0x0126, B:53:0x0130, B:55:0x0134, B:57:0x0151, B:59:0x016d, B:61:0x0177, B:62:0x017b, B:64:0x017f, B:44:0x00f9, B:47:0x010d, B:17:0x0056, B:20:0x006c), top: B:132:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int i;
        boolean z;
        int i2;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean z2;
        List list5;
        int i3;
        fe5 fe5Var;
        rn1 rn1Var;
        fv4 fv4Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        while (!this.g) {
            try {
                long j = this.f.a;
                kz4 b = b(j);
                this.j = b;
                long a = this.b.a(b);
                if (a != -1) {
                    a += j;
                    mw5 mw5Var = this.m;
                    mw5Var.a0.post(new xj1(5, mw5Var));
                }
                long j2 = a;
                mw5 mw5Var2 = this.m;
                Map b2 = this.b.b();
                List list6 = (List) b2.get("icy-br");
                if (list6 != null) {
                    String str4 = (String) list6.get(0);
                    try {
                        i8 = Integer.parseInt(str4) * 1000;
                    } catch (NumberFormatException unused) {
                        i8 = -1;
                    }
                    if (i8 > 0) {
                        i2 = i8;
                        z = true;
                        list = (List) b2.get("icy-genre");
                        rn1 rn1Var2 = null;
                        if (list != null) {
                            str = (String) list.get(0);
                            z = true;
                        } else {
                            str = null;
                        }
                        list2 = (List) b2.get("icy-name");
                        if (list2 != null) {
                            str2 = (String) list2.get(0);
                            z = true;
                        } else {
                            str2 = null;
                        }
                        list3 = (List) b2.get("icy-url");
                        if (list3 != null) {
                            str3 = (String) list3.get(0);
                            z = true;
                        } else {
                            str3 = null;
                        }
                        list4 = (List) b2.get("icy-pub");
                        if (list4 != null) {
                            z2 = ((String) list4.get(0)).equals("1");
                            z = true;
                        } else {
                            z2 = false;
                        }
                        list5 = (List) b2.get("icy-metaint");
                        if (list5 != null) {
                            String str5 = (String) list5.get(0);
                            try {
                                i7 = Integer.parseInt(str5);
                            } catch (NumberFormatException unused2) {
                                i7 = -1;
                            }
                            if (i7 > 0) {
                                i3 = i7;
                                z = true;
                                if (z) {
                                    rn1Var2 = new rn1(i2, i3, str, str2, str3, z2);
                                }
                                mw5Var2.c0 = rn1Var2;
                                fe5Var = this.b;
                                rn1Var = this.m.c0;
                                if (rn1Var == null && (i6 = rn1Var.U) != -1) {
                                    fv4 wu5Var = new wu5(fe5Var, i6, this);
                                    mw5 mw5Var3 = this.m;
                                    mw5Var3.getClass();
                                    vw5 t = mw5Var3.t(new kw5(0, true));
                                    this.k = t;
                                    t.e(mw5.z0);
                                    fv4Var = wu5Var;
                                } else {
                                    fv4Var = fe5Var;
                                }
                                ((ou5) this.c).b(fv4Var, this.a, this.b.b(), j, j2, this.d);
                                if (this.m.c0 != null) {
                                    lk1 lk1Var = ((ou5) this.c).b;
                                    if (lk1Var instanceof up1) {
                                        ((up1) lk1Var).o = true;
                                    }
                                }
                                if (this.h) {
                                    aw5 aw5Var = this.c;
                                    long j3 = this.i;
                                    lk1 lk1Var2 = ((ou5) aw5Var).b;
                                    lk1Var2.getClass();
                                    lk1Var2.e(j, j3);
                                    this.h = false;
                                }
                                long j4 = j;
                                i4 = 0;
                                while (true) {
                                    if (i4 != 0) {
                                        break;
                                    }
                                    try {
                                        if (!this.g) {
                                            try {
                                                sy3 sy3Var = this.e;
                                                synchronized (sy3Var) {
                                                    while (!sy3Var.a) {
                                                        sy3Var.wait();
                                                    }
                                                }
                                                aw5 aw5Var2 = this.c;
                                                jl1 jl1Var = this.f;
                                                ou5 ou5Var = (ou5) aw5Var2;
                                                lk1 lk1Var3 = ou5Var.b;
                                                lk1Var3.getClass();
                                                p16 p16Var = ou5Var.c;
                                                p16Var.getClass();
                                                i4 = lk1Var3.i(p16Var, jl1Var);
                                                long a2 = ((ou5) this.c).a();
                                                if (a2 > this.m.U + j4) {
                                                    sy3 sy3Var2 = this.e;
                                                    synchronized (sy3Var2) {
                                                        sy3Var2.a = false;
                                                    }
                                                    mw5 mw5Var4 = this.m;
                                                    mw5Var4.a0.post(mw5Var4.Z);
                                                    j4 = a2;
                                                }
                                            } catch (InterruptedException unused3) {
                                                throw new InterruptedIOException();
                                            }
                                        } else {
                                            i4 = 0;
                                            break;
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        i = i4;
                                        if (i != 1) {
                                            ou5 ou5Var2 = (ou5) this.c;
                                            if (ou5Var2.a() != -1) {
                                                this.f.a = ou5Var2.a();
                                            }
                                        }
                                        try {
                                            this.b.i();
                                        } catch (IOException unused4) {
                                        }
                                        throw th;
                                    }
                                }
                                if (i4 == 1) {
                                    i5 = 0;
                                } else {
                                    ou5 ou5Var3 = (ou5) this.c;
                                    if (ou5Var3.a() != -1) {
                                        this.f.a = ou5Var3.a();
                                    }
                                    i5 = i4;
                                }
                                this.b.i();
                                continue;
                                if (i5 != 0) {
                                    return;
                                }
                            } else {
                                try {
                                    lb4.c("IcyHeaders", "Invalid metadata interval: " + str5);
                                } catch (NumberFormatException unused5) {
                                    lb4.c("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                    i3 = i7;
                                    if (z) {
                                    }
                                    mw5Var2.c0 = rn1Var2;
                                    fe5Var = this.b;
                                    rn1Var = this.m.c0;
                                    if (rn1Var == null) {
                                    }
                                    fv4Var = fe5Var;
                                    ((ou5) this.c).b(fv4Var, this.a, this.b.b(), j, j2, this.d);
                                    if (this.m.c0 != null) {
                                    }
                                    if (this.h) {
                                    }
                                    long j42 = j;
                                    i4 = 0;
                                    while (true) {
                                        if (i4 != 0) {
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                    this.b.i();
                                    continue;
                                    if (i5 != 0) {
                                    }
                                }
                            }
                        }
                        i3 = -1;
                        if (z) {
                        }
                        mw5Var2.c0 = rn1Var2;
                        fe5Var = this.b;
                        rn1Var = this.m.c0;
                        if (rn1Var == null) {
                        }
                        fv4Var = fe5Var;
                        ((ou5) this.c).b(fv4Var, this.a, this.b.b(), j, j2, this.d);
                        if (this.m.c0 != null) {
                        }
                        if (this.h) {
                        }
                        long j422 = j;
                        i4 = 0;
                        while (true) {
                            if (i4 != 0) {
                            }
                        }
                        if (i4 == 1) {
                        }
                        this.b.i();
                        continue;
                        if (i5 != 0) {
                        }
                    } else {
                        try {
                            lb4.c("IcyHeaders", "Invalid bitrate: " + str4);
                        } catch (NumberFormatException unused6) {
                            lb4.c("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                            i2 = i8;
                            z = false;
                            list = (List) b2.get("icy-genre");
                            rn1 rn1Var22 = null;
                            if (list != null) {
                            }
                            list2 = (List) b2.get("icy-name");
                            if (list2 != null) {
                            }
                            list3 = (List) b2.get("icy-url");
                            if (list3 != null) {
                            }
                            list4 = (List) b2.get("icy-pub");
                            if (list4 != null) {
                            }
                            list5 = (List) b2.get("icy-metaint");
                            if (list5 != null) {
                            }
                            i3 = -1;
                            if (z) {
                            }
                            mw5Var2.c0 = rn1Var22;
                            fe5Var = this.b;
                            rn1Var = this.m.c0;
                            if (rn1Var == null) {
                            }
                            fv4Var = fe5Var;
                            ((ou5) this.c).b(fv4Var, this.a, this.b.b(), j, j2, this.d);
                            if (this.m.c0 != null) {
                            }
                            if (this.h) {
                            }
                            long j4222 = j;
                            i4 = 0;
                            while (true) {
                                if (i4 != 0) {
                                }
                            }
                            if (i4 == 1) {
                            }
                            this.b.i();
                            continue;
                            if (i5 != 0) {
                            }
                        }
                    }
                }
                z = false;
                i2 = -1;
                list = (List) b2.get("icy-genre");
                rn1 rn1Var222 = null;
                if (list != null) {
                }
                list2 = (List) b2.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) b2.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) b2.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) b2.get("icy-metaint");
                if (list5 != null) {
                }
                i3 = -1;
                if (z) {
                }
                mw5Var2.c0 = rn1Var222;
                fe5Var = this.b;
                rn1Var = this.m.c0;
                if (rn1Var == null) {
                }
                fv4Var = fe5Var;
                ((ou5) this.c).b(fv4Var, this.a, this.b.b(), j, j2, this.d);
                if (this.m.c0 != null) {
                }
                if (this.h) {
                }
                long j42222 = j;
                i4 = 0;
                while (true) {
                    if (i4 != 0) {
                    }
                }
                if (i4 == 1) {
                }
                this.b.i();
                continue;
                if (i5 != 0) {
                }
            } catch (Throwable th2) {
                th = th2;
                i = 0;
            }
        }
    }

    public final kz4 b(long j) {
        Collections.emptyMap();
        Uri uri = this.a;
        Map map = mw5.y0;
        if (uri != null) {
            return new kz4(uri, 0L, map, j, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}