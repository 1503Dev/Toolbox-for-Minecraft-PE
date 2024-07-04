package defpackage;

import android.os.Bundle;

/* renamed from: gb4  reason: default package */
public final class gb4 implements nc4 {
    public final ez4 a;
    public final Bundle b;

    public gb4(yw2 yw2Var, Bundle bundle) {
        this.a = yw2Var;
        this.b = bundle;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 30;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new o84(this, 2));
    }
}