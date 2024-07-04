package defpackage;

import defpackage.lu;
import defpackage.nb0;
import defpackage.nl0;
import java.util.ArrayList;
import java.util.Collections;
import javax.annotation.Nullable;

/* renamed from: jb  reason: default package */
public final class jb implements cy {
    public jb(@Nullable ey eyVar) {
    }

    public static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static nl0 d(nl0 nl0Var) {
        if (nl0Var != null && nl0Var.V != null) {
            nl0.a aVar = new nl0.a(nl0Var);
            aVar.g = null;
            return aVar.a();
        }
        return nl0Var;
    }

    @Override // defpackage.cy
    public final nl0 a(bk0 bk0Var) {
        System.currentTimeMillis();
        uk0 uk0Var = bk0Var.e;
        lb lbVar = new lb(uk0Var, null);
        if (lbVar.a != null) {
            hb hbVar = uk0Var.f;
            if (hbVar == null) {
                hbVar = hb.a(uk0Var.c);
                uk0Var.f = hbVar;
            }
            if (hbVar.j) {
                lbVar = new lb(null, null);
            }
        }
        uk0 uk0Var2 = lbVar.a;
        nl0 nl0Var = lbVar.b;
        if (uk0Var2 == null && nl0Var == null) {
            nl0.a aVar = new nl0.a();
            aVar.a = bk0Var.e;
            aVar.b = ig0.HTTP_1_1;
            aVar.c = 504;
            aVar.d = "Unsatisfiable Request (only-if-cached)";
            aVar.g = c31.d;
            aVar.k = -1L;
            aVar.l = System.currentTimeMillis();
            return aVar.a();
        } else if (uk0Var2 == null) {
            nl0Var.getClass();
            nl0.a aVar2 = new nl0.a(nl0Var);
            nl0 d = d(nl0Var);
            if (d != null) {
                nl0.a.b("cacheResponse", d);
            }
            aVar2.i = d;
            return aVar2.a();
        } else {
            nl0 a = bk0Var.a(uk0Var2);
            if (nl0Var != null) {
                if (a.R == 304) {
                    nl0.a aVar3 = new nl0.a(nl0Var);
                    lu luVar = nl0Var.U;
                    lu luVar2 = a.U;
                    ArrayList arrayList = new ArrayList(20);
                    int length = luVar.a.length / 2;
                    for (int i = 0; i < length; i++) {
                        String d2 = luVar.d(i);
                        String g = luVar.g(i);
                        if ((!"Warning".equalsIgnoreCase(d2) || !g.startsWith("1")) && (b(d2) || !c(d2) || luVar2.c(d2) == null)) {
                            dy.a.getClass();
                            arrayList.add(d2);
                            arrayList.add(g.trim());
                        }
                    }
                    int length2 = luVar2.a.length / 2;
                    for (int i2 = 0; i2 < length2; i2++) {
                        String d3 = luVar2.d(i2);
                        if (!b(d3) && c(d3)) {
                            nb0.a aVar4 = dy.a;
                            String g2 = luVar2.g(i2);
                            aVar4.getClass();
                            arrayList.add(d3);
                            arrayList.add(g2.trim());
                        }
                    }
                    lu.a aVar5 = new lu.a();
                    Collections.addAll(aVar5.a, (String[]) arrayList.toArray(new String[arrayList.size()]));
                    aVar3.f = aVar5;
                    aVar3.k = a.Z;
                    aVar3.l = a.a0;
                    nl0 d4 = d(nl0Var);
                    if (d4 != null) {
                        nl0.a.b("cacheResponse", d4);
                    }
                    aVar3.i = d4;
                    nl0 d5 = d(a);
                    if (d5 != null) {
                        nl0.a.b("networkResponse", d5);
                    }
                    aVar3.h = d5;
                    aVar3.a();
                    a.V.close();
                    throw null;
                }
                c31.c(nl0Var.V);
            }
            nl0.a aVar6 = new nl0.a(a);
            nl0 d6 = d(nl0Var);
            if (d6 != null) {
                nl0.a.b("cacheResponse", d6);
            }
            aVar6.i = d6;
            nl0 d7 = d(a);
            if (d7 != null) {
                nl0.a.b("networkResponse", d7);
            }
            aVar6.h = d7;
            return aVar6.a();
        }
    }
}