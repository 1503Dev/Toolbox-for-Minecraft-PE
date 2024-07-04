package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;

/* renamed from: nv  reason: default package */
public final class nv implements cy {
    public static final Charset b = Charset.forName("UTF-8");
    public volatile int a = 1;

    public static boolean b(za zaVar) {
        long j;
        try {
            za zaVar2 = new za();
            long j2 = zaVar.Q;
            if (j2 < 64) {
                j = j2;
            } else {
                j = 64;
            }
            zaVar.F(zaVar2, 0L, j);
            for (int i = 0; i < 16; i++) {
                if (!zaVar2.n()) {
                    int N = zaVar2.N();
                    if (Character.isISOControl(N) && !Character.isWhitespace(N)) {
                        return false;
                    }
                } else {
                    return true;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    @Override // defpackage.cy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nl0 a(bk0 bk0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        zj0 zj0Var;
        ig0 ig0Var;
        boolean z4;
        String str;
        String str2;
        String str3;
        String str4;
        lu luVar;
        ne0 ne0Var;
        String str5;
        boolean z5;
        String str6;
        int length;
        int i;
        String str7;
        StringBuilder b2;
        String str8;
        StringBuilder sb;
        boolean z6;
        lu luVar2;
        String str9;
        int i2 = this.a;
        uk0 uk0Var = bk0Var.e;
        if (i2 == 1) {
            return bk0Var.a(uk0Var);
        }
        if (i2 == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z && i2 != 3) {
            z2 = false;
        } else {
            z2 = true;
        }
        vk0 vk0Var = uk0Var.d;
        if (vk0Var != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        hp hpVar = bk0Var.c;
        if (hpVar != null) {
            zj0Var = hpVar.b();
        } else {
            zj0Var = null;
        }
        if (zj0Var != null) {
            ig0Var = zj0Var.g;
        } else {
            ig0Var = ig0.HTTP_1_1;
        }
        StringBuilder b3 = e5.b("--> ");
        b3.append(uk0Var.b);
        b3.append(' ');
        b3.append(uk0Var.a);
        b3.append(' ');
        b3.append(ig0Var);
        String sb2 = b3.toString();
        if (!z2 && z3) {
            StringBuilder c = yg.c(sb2, " (");
            c.append(vk0Var.contentLength());
            c.append("-byte body)");
            sb2 = c.toString();
        }
        ne0 ne0Var2 = ne0.a;
        ne0Var2.m(4, sb2, null);
        if (z2) {
            if (z3) {
                if (vk0Var.contentType() != null) {
                    StringBuilder b4 = e5.b("Content-Type: ");
                    b4.append(vk0Var.contentType());
                    z4 = z2;
                    ne0Var2.m(4, b4.toString(), null);
                } else {
                    z4 = z2;
                }
                if (vk0Var.contentLength() != -1) {
                    StringBuilder b5 = e5.b("Content-Length: ");
                    str = "-byte body)";
                    str6 = " (";
                    b5.append(vk0Var.contentLength());
                    ne0Var2.m(4, b5.toString(), null);
                    lu luVar3 = uk0Var.c;
                    length = luVar3.a.length / 2;
                    i = 0;
                    while (i < length) {
                        String d = luVar3.d(i);
                        int i3 = length;
                        if (!"Content-Type".equalsIgnoreCase(d) && !"Content-Length".equalsIgnoreCase(d)) {
                            StringBuilder c2 = yg.c(d, ": ");
                            c2.append(luVar3.g(i));
                            luVar2 = luVar3;
                            str9 = str6;
                            ne0.a.m(4, c2.toString(), null);
                        } else {
                            luVar2 = luVar3;
                            str9 = str6;
                        }
                        i++;
                        length = i3;
                        luVar3 = luVar2;
                        str6 = str9;
                    }
                    str7 = str6;
                    if (!z && z3) {
                        String c3 = uk0Var.c.c("Content-Encoding");
                        if (c3 != null && !c3.equalsIgnoreCase("identity")) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        if (z6) {
                            b2 = e5.b("--> END ");
                            b2.append(uk0Var.b);
                            str8 = " (encoded body omitted)";
                            str2 = str7;
                        } else {
                            za zaVar = new za();
                            vk0Var.writeTo(zaVar);
                            Charset charset = b;
                            e50 contentType = vk0Var.contentType();
                            if (contentType != null) {
                                try {
                                    String str10 = contentType.c;
                                    if (str10 != null) {
                                        charset = Charset.forName(str10);
                                    }
                                } catch (IllegalArgumentException unused) {
                                }
                            }
                            ne0 ne0Var3 = ne0.a;
                            ne0Var3.m(4, "", null);
                            if (b(zaVar)) {
                                ne0Var3.m(4, zaVar.C(charset), null);
                                sb = new StringBuilder();
                                sb.append("--> END ");
                                sb.append(uk0Var.b);
                                str2 = str7;
                                sb.append(str2);
                                sb.append(vk0Var.contentLength());
                                sb.append(str);
                            } else {
                                str2 = str7;
                                sb = e5.b("--> END ");
                                sb.append(uk0Var.b);
                                sb.append(" (binary ");
                                sb.append(vk0Var.contentLength());
                                sb.append("-byte body omitted)");
                            }
                            ne0.a.m(4, sb.toString(), null);
                        }
                    } else {
                        str2 = str7;
                        b2 = e5.b("--> END ");
                        str8 = uk0Var.b;
                    }
                    b2.append(str8);
                    sb = b2;
                    ne0.a.m(4, sb.toString(), null);
                }
            } else {
                z4 = z2;
            }
            str = "-byte body)";
            str6 = " (";
            lu luVar32 = uk0Var.c;
            length = luVar32.a.length / 2;
            i = 0;
            while (i < length) {
            }
            str7 = str6;
            if (!z) {
            }
            str2 = str7;
            b2 = e5.b("--> END ");
            str8 = uk0Var.b;
            b2.append(str8);
            sb = b2;
            ne0.a.m(4, sb.toString(), null);
        } else {
            z4 = z2;
            str = "-byte body)";
            str2 = " (";
        }
        long nanoTime = System.nanoTime();
        try {
            nl0 a = bk0Var.a(uk0Var);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            ql0 ql0Var = a.V;
            long g = ql0Var.g();
            if (g != -1) {
                str3 = g + "-byte";
            } else {
                str3 = "unknown-length";
            }
            StringBuilder b6 = e5.b("<-- ");
            String str11 = str;
            b6.append(a.R);
            b6.append(' ');
            b6.append(a.S);
            b6.append(' ');
            b6.append(a.P.a);
            b6.append(str2);
            b6.append(millis);
            b6.append("ms");
            if (z4) {
                str4 = "";
            } else {
                str4 = ij.c(", ", str3, " body");
            }
            b6.append(str4);
            b6.append(')');
            ne0.a.m(4, b6.toString(), null);
            if (z4) {
                int length2 = a.U.a.length / 2;
                for (int i4 = 0; i4 < length2; i4++) {
                    ne0.a.m(4, luVar.d(i4) + ": " + luVar.g(i4), null);
                }
                if (z && mv.b(a)) {
                    String c4 = a.U.c("Content-Encoding");
                    if (c4 != null && !c4.equalsIgnoreCase("identity")) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        ne0.a.m(4, "<-- END HTTP (encoded body omitted)", null);
                    } else {
                        bb y = ql0Var.y();
                        y.j(RecyclerView.FOREVER_NS);
                        za b7 = y.b();
                        Charset charset2 = b;
                        e50 t = ql0Var.t();
                        if (t != null) {
                            try {
                                String str12 = t.c;
                                if (str12 != null) {
                                    charset2 = Charset.forName(str12);
                                }
                            } catch (IllegalArgumentException unused2) {
                            }
                        }
                        if (!b(b7)) {
                            ne0 ne0Var4 = ne0.a;
                            ne0Var4.m(4, "", null);
                            ne0Var4.m(4, "<-- END HTTP (binary " + b7.Q + "-byte body omitted)", null);
                            return a;
                        }
                        if (g != 0) {
                            ne0 ne0Var5 = ne0.a;
                            ne0Var5.m(4, "", null);
                            ne0Var5.m(4, b7.clone().C(charset2), null);
                        }
                        StringBuilder b8 = e5.b("<-- END HTTP (");
                        b8.append(b7.Q);
                        b8.append(str11);
                        str5 = b8.toString();
                        ne0Var = ne0.a;
                    }
                } else {
                    ne0Var = ne0.a;
                    str5 = "<-- END HTTP";
                }
                ne0Var.m(4, str5, null);
            }
            return a;
        } catch (Exception e) {
            ne0.a.m(4, "<-- HTTP FAILED: " + e, null);
            throw e;
        }
    }
}