package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: xj4  reason: default package */
public final class xj4 implements wj4 {
    public final ConcurrentHashMap a;
    public final bk4 b;
    public final zj4 c = new zj4();

    public xj4(bk4 bk4Var) {
        this.a = new ConcurrentHashMap(bk4Var.T);
        this.b = bk4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (r5 != null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean a(ek4 ek4Var, dk4 dk4Var) {
        boolean z;
        vj4 vj4Var = (vj4) this.a.get(ek4Var);
        jv5.A.j.getClass();
        dk4Var.d = System.currentTimeMillis();
        if (vj4Var == null) {
            bk4 bk4Var = this.b;
            vj4Var = new vj4(bk4Var.T, bk4Var.U * 1000);
            int size = this.a.size();
            bk4 bk4Var2 = this.b;
            if (size == bk4Var2.S) {
                int i = bk4Var2.Y;
                int i2 = i - 1;
                ek4 ek4Var2 = null;
                if (i != 0) {
                    long j = RecyclerView.FOREVER_NS;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                int i3 = Integer.MAX_VALUE;
                                for (Map.Entry entry : this.a.entrySet()) {
                                    if (((vj4) entry.getValue()).d.d < i3) {
                                        i3 = ((vj4) entry.getValue()).d.d;
                                        ek4Var2 = (ek4) entry.getKey();
                                    }
                                }
                            }
                            zj4 zj4Var = this.c;
                            zj4Var.c++;
                            zj4Var.a.Q = true;
                        } else {
                            for (Map.Entry entry2 : this.a.entrySet()) {
                                if (((vj4) entry2.getValue()).d.c < j) {
                                    j = ((vj4) entry2.getValue()).d.c;
                                    ek4Var2 = (ek4) entry2.getKey();
                                }
                            }
                            if (ek4Var2 != null) {
                                this.a.remove(ek4Var2);
                            }
                            zj4 zj4Var2 = this.c;
                            zj4Var2.c++;
                            zj4Var2.a.Q = true;
                        }
                    } else {
                        for (Map.Entry entry3 : this.a.entrySet()) {
                            if (((vj4) entry3.getValue()).d.a < j) {
                                j = ((vj4) entry3.getValue()).d.a;
                                ek4Var2 = (ek4) entry3.getKey();
                            }
                        }
                        if (ek4Var2 != null) {
                            this.a.remove(ek4Var2);
                        }
                        zj4 zj4Var22 = this.c;
                        zj4Var22.c++;
                        zj4Var22.a.Q = true;
                    }
                } else {
                    throw null;
                }
            }
            this.a.put(ek4Var, vj4Var);
            zj4 zj4Var3 = this.c;
            zj4Var3.b++;
            zj4Var3.a.P = true;
        }
        rk4 rk4Var = vj4Var.d;
        rk4Var.getClass();
        jv5.A.j.getClass();
        rk4Var.c = System.currentTimeMillis();
        rk4Var.d++;
        vj4Var.a();
        if (vj4Var.a.size() == vj4Var.b) {
            z = false;
        } else {
            vj4Var.a.add(dk4Var);
            z = true;
        }
        zj4 zj4Var4 = this.c;
        zj4Var4.f++;
        yj4 clone = zj4Var4.a.clone();
        yj4 yj4Var = zj4Var4.a;
        yj4Var.P = false;
        yj4Var.Q = false;
        rk4 rk4Var2 = vj4Var.d;
        qk4 clone2 = rk4Var2.b.clone();
        qk4 qk4Var = rk4Var2.b;
        qk4Var.P = false;
        qk4Var.Q = 0;
        x52 w = d62.w();
        v52 w2 = w52.w();
        w2.j();
        w52.A((w52) w2.Q);
        b62 w3 = c62.w();
        boolean z2 = clone.P;
        w3.j();
        c62.y((c62) w3.Q, z2);
        boolean z3 = clone.Q;
        w3.j();
        c62.z((c62) w3.Q, z3);
        int i4 = clone2.Q;
        w3.j();
        c62.A((c62) w3.Q, i4);
        w2.j();
        w52.z((w52) w2.Q, (c62) w3.h());
        w.k(w2);
        dk4Var.a.c().f.n0((d62) w.h());
        b();
        return z;
    }

    public final void b() {
        if (((Boolean) w82.d.c.a(x92.o5)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.R);
            sb.append(" PoolCollection");
            zj4 zj4Var = this.c;
            zj4Var.getClass();
            sb.append("\n\tPool does not exist: " + zj4Var.d + "\n\tNew pools created: " + zj4Var.b + "\n\tPools removed: " + zj4Var.c + "\n\tEntries added: " + zj4Var.f + "\n\tNo entries retrieved: " + zj4Var.e + "\n");
            int i = 0;
            for (Map.Entry entry : this.a.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((ek4) entry.getKey()).hashCode());
                sb.append("    ");
                int i2 = 0;
                while (true) {
                    vj4 vj4Var = (vj4) entry.getValue();
                    vj4Var.a();
                    if (i2 >= vj4Var.a.size()) {
                        break;
                    }
                    sb.append("[O]");
                    i2++;
                }
                vj4 vj4Var2 = (vj4) entry.getValue();
                vj4Var2.a();
                for (int size = vj4Var2.a.size(); size < this.b.T; size++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                rk4 rk4Var = ((vj4) entry.getValue()).d;
                rk4Var.getClass();
                sb.append("Created: " + rk4Var.a + " Last accessed: " + rk4Var.c + " Accesses: " + rk4Var.d + "\nEntries retrieved: Valid: " + rk4Var.e + " Stale: " + rk4Var.f);
                sb.append("\n");
            }
            while (i < this.b.S) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            sv2.b(sb.toString());
        }
    }
}