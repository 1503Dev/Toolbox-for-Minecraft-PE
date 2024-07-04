package defpackage;

/* renamed from: vk4  reason: default package */
public final class vk4 {
    public final lk4 a;
    public final hx4 b;
    public boolean c = false;
    public boolean d = false;

    public vk4(final wj4 wj4Var, final jz1 jz1Var, final lk4 lk4Var) {
        this.a = lk4Var;
        jz1Var.getClass();
        zf4 zf4Var = (zf4) lk4Var;
        this.b = zw4.B(zw4.F(((wf4) ((vg4) jz1Var.Q)).b(zf4Var.b, zf4Var.a, null), new ky4() { // from class: tk4
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                zy4 C;
                vk4 vk4Var = vk4.this;
                jz1 jz1Var2 = jz1Var;
                wj4 wj4Var2 = wj4Var;
                lk4 lk4Var2 = lk4Var;
                dk4 dk4Var = (dk4) obj;
                synchronized (vk4Var) {
                    vk4Var.d = true;
                    dk4Var.a = ((wf4) ((vg4) jz1Var2.Q)).a;
                    if (!vk4Var.c) {
                        ((xj4) wj4Var2).a(lk4Var2.a(), dk4Var);
                        C = zw4.C(null);
                    } else {
                        C = zw4.C(new kk4(dk4Var, lk4Var2));
                    }
                }
                return C;
            }
        }, lk4Var.c()), Exception.class, new ky4(jz1Var) { // from class: uk4
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                vk4 vk4Var = vk4.this;
                Exception exc = (Exception) obj;
                synchronized (vk4Var) {
                    vk4Var.d = true;
                    throw exc;
                }
            }
        }, lk4Var.c());
    }

    public final synchronized hx4 a(zf4 zf4Var) {
        if (!this.d && !this.c) {
            if (this.a.a() != null && zf4Var.g != null && this.a.a().equals(zf4Var.g)) {
                this.c = true;
                return this.b;
            }
            return null;
        }
        return null;
    }
}