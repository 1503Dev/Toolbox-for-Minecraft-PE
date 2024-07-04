package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* renamed from: xt3  reason: default package */
public final class xt3 {
    public final jt3 a;
    public final yq3 b;
    public final Object c = new Object();
    public final ArrayList d = new ArrayList();
    public boolean e;

    public xt3(jt3 jt3Var, yq3 yq3Var) {
        this.a = jt3Var;
        this.b = yq3Var;
    }

    public final JSONArray a() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.c) {
            try {
                if (!this.e) {
                    jt3 jt3Var = this.a;
                    if (jt3Var.b) {
                        b(jt3Var.a());
                    } else {
                        jt3Var.e.b(new hq1(4, jt3Var, new vt3(this)), jt3Var.j);
                        return jSONArray;
                    }
                }
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((wt3) it.next()).a());
                }
                return jSONArray;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0074 A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0009, B:9:0x000d, B:11:0x0014, B:13:0x002c, B:15:0x0036, B:18:0x003b, B:20:0x0042, B:22:0x0053, B:25:0x005e, B:29:0x0066, B:31:0x0074, B:34:0x0079, B:38:0x0082, B:39:0x0092, B:40:0x0094), top: B:46:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(List list) {
        String str;
        boolean z;
        xq3 a;
        String str2;
        mn2 mn2Var;
        xq3 a2;
        xq3 a3;
        mn2 mn2Var2;
        synchronized (this.c) {
            try {
                if (this.e) {
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    vh2 vh2Var = (vh2) it.next();
                    l92 l92Var = x92.R7;
                    w82 w82Var = w82.d;
                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && (a3 = this.b.a(vh2Var.P)) != null && (mn2Var2 = a3.c) != null) {
                        str = mn2Var2.toString();
                        String str3 = str;
                        if (((Boolean) w82Var.c.a(x92.S7)).booleanValue() && (a2 = this.b.a(vh2Var.P)) != null && a2.d) {
                            z = true;
                            ArrayList arrayList = this.d;
                            String str4 = vh2Var.P;
                            a = this.b.a(str4);
                            if (a != null && (mn2Var = a.b) != null) {
                                str2 = mn2Var.toString();
                                arrayList.add(new wt3(str4, str3, str2, vh2Var.Q ? 1 : 0, vh2Var.S, vh2Var.R, z));
                            }
                            str2 = "";
                            arrayList.add(new wt3(str4, str3, str2, vh2Var.Q ? 1 : 0, vh2Var.S, vh2Var.R, z));
                        }
                        z = false;
                        ArrayList arrayList2 = this.d;
                        String str42 = vh2Var.P;
                        a = this.b.a(str42);
                        if (a != null) {
                            str2 = mn2Var.toString();
                            arrayList2.add(new wt3(str42, str3, str2, vh2Var.Q ? 1 : 0, vh2Var.S, vh2Var.R, z));
                        }
                        str2 = "";
                        arrayList2.add(new wt3(str42, str3, str2, vh2Var.Q ? 1 : 0, vh2Var.S, vh2Var.R, z));
                    }
                    str = "";
                    String str32 = str;
                    if (((Boolean) w82Var.c.a(x92.S7)).booleanValue()) {
                        z = true;
                        ArrayList arrayList22 = this.d;
                        String str422 = vh2Var.P;
                        a = this.b.a(str422);
                        if (a != null) {
                        }
                        str2 = "";
                        arrayList22.add(new wt3(str422, str32, str2, vh2Var.Q ? 1 : 0, vh2Var.S, vh2Var.R, z));
                    }
                    z = false;
                    ArrayList arrayList222 = this.d;
                    String str4222 = vh2Var.P;
                    a = this.b.a(str4222);
                    if (a != null) {
                    }
                    str2 = "";
                    arrayList222.add(new wt3(str4222, str32, str2, vh2Var.Q ? 1 : 0, vh2Var.S, vh2Var.R, z));
                }
                this.e = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}