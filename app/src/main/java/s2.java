package defpackage;

import android.content.Context;
import android.os.RemoteException;

/* renamed from: s2  reason: default package */
public final class s2 {
    public final zq5 a;
    public final Context b;
    public final ik2 c;

    /* renamed from: s2$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final Context a;
        public final jn2 b;

        public a(Context context, String str) {
            if (context != null) {
                t42 t42Var = n62.f.b;
                tk2 tk2Var = new tk2();
                t42Var.getClass();
                this.a = context;
                this.b = (jn2) new xx1(t42Var, context, str, tk2Var).d(context, false);
                return;
            }
            throw new NullPointerException("context cannot be null");
        }
    }

    public s2(Context context, ik2 ik2Var) {
        zq5 zq5Var = zq5.a;
        this.b = context;
        this.c = ik2Var;
        this.a = zq5Var;
    }

    public final void a(d3 d3Var) {
        fx3 fx3Var = d3Var.a;
        x92.a(this.b);
        if (((Boolean) kb2.c.d()).booleanValue()) {
            if (((Boolean) w82.d.c.a(x92.K8)).booleanValue()) {
                jv2.b.execute(new hq1(2, this, fx3Var));
                return;
            }
        }
        try {
            ik2 ik2Var = this.c;
            zq5 zq5Var = this.a;
            Context context = this.b;
            zq5Var.getClass();
            ik2Var.X2(zq5.a(context, fx3Var));
        } catch (RemoteException e) {
            sv2.e("Failed to load ad.", e);
        }
    }
}