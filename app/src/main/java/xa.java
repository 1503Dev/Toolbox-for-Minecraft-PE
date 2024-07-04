package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: xa  reason: default package */
public abstract class xa<T> extends qf<T> {
    public static final String h = y20.e("BrdcstRcvrCnstrntTrckr");
    public final a g;

    /* renamed from: xa$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                xa.this.f(intent);
            }
        }
    }

    public xa(Context context, bw0 bw0Var) {
        super(context, bw0Var);
        this.g = new a();
    }

    @Override // defpackage.qf
    public final void c() {
        y20.c().a(h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.registerReceiver(this.g, e());
    }

    @Override // defpackage.qf
    public final void d() {
        y20.c().a(h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter e();

    public abstract void f(Intent intent);
}