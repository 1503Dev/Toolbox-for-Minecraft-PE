package defpackage;

import android.os.Bundle;

/* renamed from: i84  reason: default package */
public final class i84 implements nc4 {
    public final ez4 a;
    public final zq3 b;
    public final jt3 c;
    public final k84 d;

    public i84(yw2 yw2Var, zq3 zq3Var, jt3 jt3Var, k84 k84Var) {
        this.a = yw2Var;
        this.b = zq3Var;
        this.c = jt3Var;
        this.d = k84Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 1;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        if (!ft4.a((String) w82.d.c.a(x92.b1)) && !this.d.a.get() && this.c.b) {
            this.d.a.set(true);
            return this.a.b(new h84(this, 0));
        }
        return zw4.C(new j84(new Bundle()));
    }
}