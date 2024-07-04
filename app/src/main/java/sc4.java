package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: sc4  reason: default package */
public final class sc4 implements mc4 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final ArrayList h;
    @Nullable
    public final String i;
    @Nullable
    public final String j;
    public final String k;
    public final boolean l;
    public final String m;
    public final long n;
    public final boolean o;

    public sc4(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j, boolean z7) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = str2;
        this.h = arrayList;
        this.i = str3;
        this.j = str4;
        this.k = str5;
        this.l = z6;
        this.m = str6;
        this.n = j;
        this.o = z7;
    }

    @Override // defpackage.mc4
    public final void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putBoolean("cog", this.a);
        bundle.putBoolean("coh", this.b);
        bundle.putString("gl", this.c);
        bundle.putBoolean("simulator", this.d);
        bundle.putBoolean("is_latchsky", this.e);
        l92 l92Var = x92.D8;
        w82 w82Var = w82.d;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.f);
        }
        bundle.putString("hl", this.g);
        if (!this.h.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.h);
        }
        bundle.putString("mv", this.i);
        bundle.putString("submodel", this.m);
        Bundle a = hj4.a(bundle, "device");
        bundle.putBundle("device", a);
        a.putString("build", this.k);
        a.putLong("remaining_data_partition_space", this.n);
        Bundle a2 = hj4.a(a, "browser");
        a.putBundle("browser", a2);
        a2.putBoolean("is_browser_custom_tabs_capable", this.l);
        if (!TextUtils.isEmpty(this.j)) {
            Bundle a3 = hj4.a(a, "play_store");
            a.putBundle("play_store", a3);
            a3.putString("package_version", this.j);
        }
        if (((Boolean) w82Var.c.a(x92.P8)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.o);
        }
        if (((Boolean) w82Var.c.a(x92.N8)).booleanValue()) {
            hj4.d(bundle, "gotmt_l", true, ((Boolean) w82Var.c.a(x92.K8)).booleanValue());
            hj4.d(bundle, "gotmt_i", true, ((Boolean) w82Var.c.a(x92.J8)).booleanValue());
        }
    }
}