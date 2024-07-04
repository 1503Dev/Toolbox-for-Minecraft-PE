package defpackage;

import android.app.Activity;
import android.os.Handler;
import defpackage.me;
import defpackage.mz0;
import java.util.UUID;

/* renamed from: hy0  reason: default package */
public final class hy0 extends me {
    public zv p;
    public b01 q;

    /* renamed from: hy0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends me.a {
        public a(wv wvVar) {
            super(wvVar);
        }
    }

    public hy0(Activity activity, Handler handler, zv zvVar, s01 s01Var, ab0 ab0Var, ky0 ky0Var, UUID uuid) {
        super(uuid, handler);
        this.p = zvVar;
        this.q = new b01(activity, this.l, s01Var, ab0Var, ky0Var);
        this.k.a(new xs0(new ey0(0, this)));
        this.d.a(new xs0(new fy0(this)));
        this.q.a(this.k.Q);
        mz0.a aVar = this.q.f;
        aVar.c.add(new Runnable() { // from class: gy0
            @Override // java.lang.Runnable
            public final void run() {
                hy0.this.b();
            }
        });
    }

    @Override // defpackage.me
    public final void a() {
        zv zvVar;
        Runnable oc0Var;
        me.b bVar = this.i;
        if ((bVar == me.b.Single || bVar == me.b.Repeat) && this.e != null) {
            zvVar = this.p;
            oc0Var = new oc0(1, this);
        } else if (bVar != me.b.Teleport) {
            return;
        } else {
            zvVar = this.p;
            oc0Var = new dy0(0, this);
        }
        ((iy0) zvVar).I0(oc0Var);
    }

    @Override // defpackage.me
    public final void c() {
        super.c();
        this.q.a(false);
    }
}