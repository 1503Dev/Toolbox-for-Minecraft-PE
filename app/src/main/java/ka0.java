package defpackage;

import android.content.Context;
import android.os.Handler;
import android.preference.PreferenceManager;
import io.mrarm.mctoolbox.bridge.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: ka0  reason: default package */
public final class ka0 {
    public final pw a;
    public final a c;
    public String d;
    public long g;
    public final Handler b = new Handler();
    public final ja0 e = new ja0(0, this);
    public boolean f = false;

    /* renamed from: ka0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public ka0(Context context, pw pwVar, tt0 tt0Var) {
        this.a = pwVar;
        this.c = tt0Var;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("online_anon_stat_id", null);
        this.d = string;
        if (string == null) {
            this.d = UUID.randomUUID().toString();
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("online_anon_stat_id", this.d).apply();
        }
        this.g = System.currentTimeMillis() + 180;
    }

    public final void a(long j) {
        this.b.removeCallbacks(this.e);
        this.b.postDelayed(this.e, j * 1000);
    }

    public final void b() {
        String str;
        if (!this.f) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        tt0 tt0Var = (tt0) this.c;
        io.mrarm.mctoolbox.bridge.a aVar = tt0Var.a;
        tc0 tc0Var = tt0Var.b;
        zv zvVar = tt0Var.c;
        ArrayList arrayList = new ArrayList();
        arrayList.add("default");
        arrayList.add("ver-5.4.58");
        if (((b) aVar).c.Q) {
            arrayList.add("premium");
        }
        if (tc0Var.g) {
            arrayList.add("subscription");
        }
        iy0 iy0Var = (iy0) zvVar;
        if (iy0Var.M() != null) {
            if (iy0Var.O()) {
                str = "playing_server";
            } else {
                str = "playing_local";
            }
            arrayList.add(str);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(str2);
        }
        pb<vt0> b = this.a.b(this.d, sb.toString());
        qs0 qs0Var = new qs0();
        qs0Var.d(new te0(this));
        qs0Var.c(new ia0(0, this));
        b.g(qs0Var);
    }
}