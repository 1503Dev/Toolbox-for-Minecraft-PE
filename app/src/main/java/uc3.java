package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* renamed from: uc3  reason: default package */
public final class uc3 implements lj5 {
    public final uj5 a;
    public final uj5 b;
    public final uj5 c;
    public final uj5 d;
    public final uj5 e;
    public final uj5 f;
    public final uj5 g;
    public final uj5 h;
    public final uj5 i;
    public final uj5 j;
    public final uj5 k;

    public uc3(uj5 uj5Var, f33 f33Var, uj5 uj5Var2, uj5 uj5Var3, uj5 uj5Var4, uj5 uj5Var5, s23 s23Var, uj5 uj5Var6, uj5 uj5Var7, uj5 uj5Var8) {
        i33 i33Var = n42.T;
        this.a = uj5Var;
        this.b = f33Var;
        this.c = uj5Var2;
        this.d = uj5Var3;
        this.e = i33Var;
        this.f = uj5Var4;
        this.g = uj5Var5;
        this.h = s23Var;
        this.i = uj5Var6;
        this.j = uj5Var7;
        this.k = uj5Var8;
    }

    @Override // defpackage.uj5
    /* renamed from: a */
    public final tc3 c() {
        ol4 ol4Var = (ol4) this.a.c();
        xv2 a = ((f33) this.b).a();
        ApplicationInfo c = ((ev3) this.c).c();
        String packageName = ((t23) ((fv3) this.d).a).a().getPackageName();
        tv2.C(packageName);
        p92 p92Var = x92.a;
        return new tc3(ol4Var, a, c, packageName, w82.d.a.a(), (PackageInfo) this.f.c(), kj5.a(this.g), ((s23) this.h).c(), (String) this.i.c(), ((rc4) this.j).c(), ((ed3) this.k).a());
    }
}