package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: d84  reason: default package */
public final class d84 implements mc4 {
    public final zr5 a;
    public final String b;
    public final boolean c;
    public final String d;
    public final float e;
    public final int f;
    public final int g;
    public final String h;
    public final boolean i;

    public d84(zr5 zr5Var, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        this.a = zr5Var;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = str3;
        this.i = z2;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str;
        Bundle bundle = (Bundle) obj;
        hj4.c(bundle, "smart_w", "full", this.a.T == -1);
        hj4.c(bundle, "smart_h", "auto", this.a.Q == -2);
        hj4.d(bundle, "ene", true, this.a.Y);
        hj4.c(bundle, "rafmt", "102", this.a.b0);
        hj4.c(bundle, "rafmt", "103", this.a.c0);
        hj4.c(bundle, "rafmt", "105", this.a.d0);
        hj4.d(bundle, "inline_adaptive_slot", true, this.i);
        hj4.d(bundle, "interscroller_slot", true, this.a.d0);
        hj4.b(bundle, "format", this.b);
        hj4.c(bundle, "fluid", "height", this.c);
        hj4.c(bundle, "sz", this.d, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.e);
        bundle.putInt("sw", this.f);
        bundle.putInt("sh", this.g);
        String str2 = this.h;
        hj4.c(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        zr5[] zr5VarArr = this.a.V;
        if (zr5VarArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.a.Q);
            bundle2.putInt("width", this.a.T);
            bundle2.putBoolean("is_fluid_height", this.a.X);
            arrayList.add(bundle2);
        } else {
            for (zr5 zr5Var : zr5VarArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zr5Var.X);
                bundle3.putInt("height", zr5Var.Q);
                bundle3.putInt("width", zr5Var.T);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}