package defpackage;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import io.mrarm.simpleads.SimpleInterstitialAdActivity;

/* renamed from: rs0  reason: default package */
public final class rs0 {
    public final Context a;
    public final vs0 b;

    /* renamed from: rs0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    /* renamed from: rs0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
    }

    public rs0(Context context, vs0 vs0Var) {
        this.a = context;
        this.b = vs0Var;
    }

    public final void a() {
        vs0 vs0Var = this.b;
        Context context = this.a;
        vs0.l.put(vs0Var.a, vs0Var);
        vs0.k.postDelayed(new m30(3, vs0Var), 30000L);
        if (c3.c == null) {
            c3.c = new c3(context.getApplicationContext());
        }
        c3 c3Var = c3.c;
        c3Var.b++;
        PreferenceManager.getDefaultSharedPreferences(c3Var.a).edit().putString("ad_cache_info", c3.a() + ":" + c3Var.b).apply();
        Intent intent = new Intent(context.getApplicationContext(), SimpleInterstitialAdActivity.class);
        intent.putExtra("uuid", vs0Var.a.toString());
        context.startActivity(intent);
    }
}