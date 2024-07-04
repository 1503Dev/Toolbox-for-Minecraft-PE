package defpackage;

import android.content.Context;
import android.os.Handler;
import android.preference.PreferenceManager;
import defpackage.ah0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* renamed from: tc0  reason: default package */
public final class tc0 {
    public static final int[] n = {1000, 2500, 5000, 10000, 30000, 60000};
    public final Context a;
    public final io.mrarm.mctoolbox.bridge.a b;
    public final pw c;
    private final a.InterfaceC0035a d;
    public final String f;
    public boolean g;
    public a h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final Handler e = new Handler();
    public int l = -1;
    public oc0 m = new oc0(0, this);

    /* renamed from: tc0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public tc0(Context context, final b bVar, pw pwVar) {
        this.a = context;
        this.b = bVar;
        this.c = pwVar;
        this.f = bVar.r("internal/premium/device_id");
        a.InterfaceC0035a interfaceC0035a = new a.InterfaceC0035a() { // from class: pc0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                final tc0 tc0Var = tc0.this;
                final a aVar = bVar;
                tc0Var.getClass();
                h21.a(new Runnable() { // from class: qc0
                    @Override // java.lang.Runnable
                    public final void run() {
                        tc0 tc0Var2 = tc0.this;
                        a aVar2 = aVar;
                        tc0Var2.getClass();
                        boolean j = ((b) aVar2).j("internal/premium/needs_validation");
                        if (j != tc0Var2.i) {
                            tc0Var2.i = j;
                            if (j) {
                                tc0Var2.l = -1;
                                tc0Var2.c();
                                return;
                            }
                            tc0Var2.k = false;
                            tc0Var2.e.removeCallbacks(tc0Var2.m);
                        }
                    }
                });
            }
        };
        this.d = interfaceC0035a;
        bVar.P("internal/premium/needs_validation", interfaceC0035a);
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("cached_entitlement", null);
        if (string != null) {
            bVar.h(string, true);
        }
    }

    public final void a(String str) {
        PreferenceManager.getDefaultSharedPreferences(this.a).edit().putString("cached_entitlement", str).apply();
    }

    public final void b() {
        if (this.i) {
            this.k = true;
            int i = n[Math.min(this.l, 5)];
            this.e.removeCallbacks(this.m);
            this.e.postDelayed(this.m, i);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [nc0] */
    public final void c() {
        a aVar;
        if (this.i && !this.j && (aVar = this.h) != null) {
            this.j = true;
            final mc0 mc0Var = new mc0(0, this);
            final ?? r2 = new Runnable() { // from class: nc0
                @Override // java.lang.Runnable
                public final void run() {
                    tc0 tc0Var = tc0.this;
                    tc0Var.j = false;
                    if (tc0Var.k) {
                        return;
                    }
                    tc0Var.l++;
                    tc0Var.b();
                }
            };
            final ve0 ve0Var = (ve0) ((re0) aVar).a;
            aa aaVar = ve0Var.a;
            ah0.a aVar2 = new ah0.a();
            aVar2.a = "subs";
            aaVar.j(new ah0(aVar2), new tg0() { // from class: ue0
                @Override // defpackage.tg0
                public final void c(da daVar, List list) {
                    ve0 ve0Var2 = ve0.this;
                    Runnable runnable = r2;
                    Runnable runnable2 = mc0Var;
                    ve0Var2.getClass();
                    if (daVar.a == 0) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            sg0 sg0Var = (sg0) it.next();
                            Iterator<String> it2 = sg0Var.a().iterator();
                            while (it2.hasNext()) {
                                String next = it2.next();
                                if (next.equals("premium_weekly")) {
                                    tc0 tc0Var = ve0Var2.b;
                                    if (!tc0Var.g) {
                                        tc0Var.d(true);
                                    }
                                    tc0 tc0Var2 = ve0Var2.b;
                                    JSONObject jSONObject = sg0Var.c;
                                    String optString = jSONObject.optString("token", jSONObject.optString("purchaseToken"));
                                    pb<k31> a2 = tc0Var2.c.a(new j31(System.currentTimeMillis(), tc0Var2.f, next, optString));
                                    qs0 qs0Var = new qs0();
                                    qs0Var.d(new rc0(tc0Var2, runnable2));
                                    qs0Var.c(new sc0(runnable));
                                    a2.g(qs0Var);
                                    return;
                                }
                            }
                        }
                        ve0Var2.b.d(false);
                    }
                    runnable.run();
                }
            });
        }
    }

    public final void d(boolean z) {
        this.g = z;
        ((b) this.b).R("internal/premium/purchased", z);
        if (z) {
            return;
        }
        a(null);
    }
}