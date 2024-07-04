package defpackage;

import android.content.pm.PackageInfo;

/* renamed from: ya4  reason: default package */
public final class ya4 implements nc4 {
    public final ez4 a;
    public final li4 b;
    public final PackageInfo c;
    public final f25 d;

    public ya4(yw2 yw2Var, li4 li4Var, PackageInfo packageInfo, nl5 nl5Var) {
        this.a = yw2Var;
        this.b = li4Var;
        this.c = packageInfo;
        this.d = nl5Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 26;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new tu2(2, this));
    }
}