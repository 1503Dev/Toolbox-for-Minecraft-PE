package defpackage;

import java.util.ArrayDeque;

/* renamed from: pk4  reason: default package */
public final class pk4 {
    public final wj4 a;
    public final jz1 b;
    public vk4 d;
    public int e = 1;
    public final ArrayDeque c = new ArrayDeque();

    public pk4(xj4 xj4Var, tj4 tj4Var, jz1 jz1Var) {
        this.a = xj4Var;
        this.b = jz1Var;
        tj4Var.a = new wr1(5, this);
    }

    public final synchronized void a() {
        boolean z;
        boolean z2;
        if (((Boolean) w82.d.c.a(x92.l5)).booleanValue() && !jv5.A.g.b().f().j) {
            this.c.clear();
            return;
        }
        synchronized (this) {
            if (this.d == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                while (!this.c.isEmpty()) {
                    lk4 lk4Var = (lk4) this.c.pollFirst();
                    if (lk4Var != null) {
                        if (lk4Var.a() != null) {
                            wj4 wj4Var = this.a;
                            ek4 a = lk4Var.a();
                            xj4 xj4Var = (xj4) wj4Var;
                            synchronized (xj4Var) {
                                vj4 vj4Var = (vj4) xj4Var.a.get(a);
                                if (vj4Var != null) {
                                    vj4Var.a();
                                    if (vj4Var.a.size() >= xj4Var.b.T) {
                                        z2 = false;
                                    }
                                }
                                z2 = true;
                            }
                            if (z2) {
                            }
                        }
                    }
                    vk4 vk4Var = new vk4(this.a, this.b, lk4Var);
                    this.d = vk4Var;
                    x93 x93Var = new x93(this, lk4Var);
                    synchronized (vk4Var) {
                        zw4.J(zw4.F(vk4Var.b, new ky4() { // from class: sk4
                            @Override // defpackage.ky4
                            public final dz4 e(Object obj) {
                                kk4 kk4Var = (kk4) obj;
                                return zy4.Q;
                            }
                        }, lk4Var.c()), x93Var, lk4Var.c());
                    }
                    return;
                }
            }
        }
    }
}