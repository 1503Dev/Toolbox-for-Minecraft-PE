package defpackage;

import android.os.Bundle;

/* renamed from: kc4  reason: default package */
public final class kc4 implements nc4 {
    public final boolean a;

    public kc4(zg4 zg4Var) {
        this.a = zg4Var != null;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 36;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return zw4.C(this.a ? new mc4() { // from class: jc4
            @Override // defpackage.mc4
            public final void b(Object obj) {
                ((Bundle) obj).putBoolean("sdk_prefetch", true);
            }
        } : null);
    }
}