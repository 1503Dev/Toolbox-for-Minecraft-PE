package defpackage;

import android.content.Context;
import android.os.Handler;
import defpackage.b01;
import defpackage.hy0;
import defpackage.mz0;
import java.util.HashMap;
import java.util.List;

/* renamed from: yz0  reason: default package */
public final class yz0 {
    public final Context a;
    public final xt b;
    public final xz0 c;
    public final zo d = new zo(1, this);
    public final Handler e = new Handler();
    public boolean f = true;

    /* renamed from: yz0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        @wq0("mainButton")
        public mz0.a a;
        @wq0("commands")
        public List<me> b;
        @wq0("shortcuts")
        public List<y21> c;
    }

    public yz0(Context context, xz0 xz0Var) {
        this.a = context;
        this.c = xz0Var;
        yt ytVar = new yt();
        ytVar.c(me.class, new hy0.a(xz0Var));
        g21 g21Var = xz0Var.d;
        HashMap hashMap = new HashMap();
        for (vv vvVar : g21Var.b) {
            if (vvVar.d() != null) {
                for (lw lwVar : vvVar.d()) {
                    hashMap.put(lwVar.getId(), lwVar);
                }
            }
        }
        ytVar.c(y21.class, new b01.a(xz0Var, hashMap));
        this.b = ytVar.a();
    }

    public final void a() {
        if (this.f) {
            this.f = false;
            this.e.postDelayed(this.d, 200L);
        }
    }
}