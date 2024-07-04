package defpackage;

import android.content.Context;

/* renamed from: bc4  reason: default package */
public final class bc4 implements nc4 {
    public final qt2 a;
    public final ez4 b;
    public final Context c;

    public bc4(qt2 qt2Var, yw2 yw2Var, Context context) {
        this.a = qt2Var;
        this.b = yw2Var;
        this.c = context;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 34;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.b.b(new ac4(0, this));
    }
}