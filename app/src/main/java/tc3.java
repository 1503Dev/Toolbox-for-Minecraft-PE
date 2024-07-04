package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: tc3  reason: default package */
public final class tc3 {
    public final ol4 a;
    public final xv2 b;
    public final ApplicationInfo c;
    public final String d;
    public final List e;
    public final PackageInfo f;
    public final hj5 g;
    public final String h;
    public final qc4 i;
    public final f25 j;
    public final li4 k;

    public tc3(ol4 ol4Var, xv2 xv2Var, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, hj5 hj5Var, nl5 nl5Var, String str2, qc4 qc4Var, li4 li4Var) {
        this.a = ol4Var;
        this.b = xv2Var;
        this.c = applicationInfo;
        this.d = str;
        this.e = arrayList;
        this.f = packageInfo;
        this.g = hj5Var;
        this.h = str2;
        this.i = qc4Var;
        this.j = nl5Var;
        this.k = li4Var;
    }

    public final el4 a() {
        el4 a = hl4.a(this.i.a(new Bundle()), ml4.SIGNALS, this.a).a();
        return this.a.a(ml4.REQUEST_PARCEL, a, (dz4) this.g.c()).a(new sc3(0, this, a)).a();
    }
}