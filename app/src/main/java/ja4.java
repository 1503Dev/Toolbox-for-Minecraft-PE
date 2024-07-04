package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.util.Set;

/* renamed from: ja4  reason: default package */
public final class ja4 implements nc4 {
    public final ez4 a;
    public final ViewGroup b;
    public final Context c;
    public final Set d;

    public ja4(yw2 yw2Var, ViewGroup viewGroup, Context context, Set set) {
        this.a = yw2Var;
        this.d = set;
        this.b = viewGroup;
        this.c = context;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 22;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new n04(2, this));
    }
}