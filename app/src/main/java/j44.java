package defpackage;

import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: j44  reason: default package */
public final class j44 {
    public final jj4 a;
    public final yq3 b;
    public final zr3 c;
    public final wl4 d;

    public j44(jj4 jj4Var, yq3 yq3Var, zr3 zr3Var, wl4 wl4Var) {
        this.a = jj4Var;
        this.b = yq3Var;
        this.c = zr3Var;
        this.d = wl4Var;
    }

    public final void a(ci4 ci4Var, yh4 yh4Var, int i, @Nullable i14 i14Var, long j) {
        xq3 xq3Var = null;
        if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
            vl4 b = vl4.b("adapter_status");
            b.e(ci4Var);
            b.a.put("aai", yh4Var.w);
            b.a("adapter_l", String.valueOf(j));
            b.a("sc", Integer.toString(i));
            if (i14Var != null) {
                b.a("arec", Integer.toString(i14Var.Q.P));
                String a = this.a.a(i14Var.getMessage());
                if (a != null) {
                    b.a("areec", a);
                }
            }
            yq3 yq3Var = this.b;
            List list = yh4Var.t;
            yq3Var.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xq3 a2 = yq3Var.a((String) it.next());
                if (a2 != null) {
                    xq3Var = a2;
                    break;
                }
            }
            if (xq3Var != null) {
                b.a("ancn", xq3Var.a);
                mn2 mn2Var = xq3Var.b;
                if (mn2Var != null) {
                    b.a("adapter_v", mn2Var.toString());
                }
                mn2 mn2Var2 = xq3Var.c;
                if (mn2Var2 != null) {
                    b.a("adapter_sv", mn2Var2.toString());
                }
            }
            this.d.a(b);
            return;
        }
        yr3 a3 = this.c.a();
        a3.a.put("gqi", ci4Var.b);
        a3.b(yh4Var);
        a3.a("action", "adapter_status");
        a3.a("adapter_l", String.valueOf(j));
        a3.a("sc", Integer.toString(i));
        if (i14Var != null) {
            a3.a("arec", Integer.toString(i14Var.Q.P));
            String a4 = this.a.a(i14Var.getMessage());
            if (a4 != null) {
                a3.a("areec", a4);
            }
        }
        yq3 yq3Var2 = this.b;
        List list2 = yh4Var.t;
        yq3Var2.getClass();
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            xq3 a5 = yq3Var2.a((String) it2.next());
            if (a5 != null) {
                xq3Var = a5;
                break;
            }
        }
        if (xq3Var != null) {
            a3.a("ancn", xq3Var.a);
            mn2 mn2Var3 = xq3Var.b;
            if (mn2Var3 != null) {
                a3.a("adapter_v", mn2Var3.toString());
            }
            mn2 mn2Var4 = xq3Var.c;
            if (mn2Var4 != null) {
                a3.a("adapter_sv", mn2Var4.toString());
            }
        }
        a3.c();
    }
}