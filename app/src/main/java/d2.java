package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import defpackage.r2;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: d2  reason: default package */
public final class d2 implements r2.e {
    public final HashMap<String, String> a;
    public final HashMap<String, String> b;

    /* renamed from: d2$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements r2.c {
        public i2 a;
        public r2.d b;

        public a(i2 i2Var, r2.d dVar) {
            this.a = i2Var;
            this.b = dVar;
        }

        @Override // defpackage.r2.c
        public final void a() {
            boolean z;
            i2 i2Var = this.a;
            int i = i2Var.k;
            if (i != 4 && i != 5 && i != 6) {
                z = false;
            } else {
                z = true;
            }
            if (!z && !i2Var.c()) {
                ((r2.a) this.b).b();
            } else {
                ((r2.a) this.b).a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.content.Context] */
    public d2(Activity activity) {
        String absolutePath;
        nc1 n;
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        this.a = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        this.b = hashMap2;
        ExecutorService executorService = w1.a;
        Activity activity2 = activity;
        if (je1.a(0, null)) {
            n = ga1.h().n();
            str = "Cannot configure AdColony; configuration mechanism requires 5 seconds between attempts.";
        } else {
            activity2 = activity == null ? ga1.P : activity2;
            if (activity2 == null) {
                n = ga1.h().n();
                str = "Ignoring call to AdColony.configure() as the provided Activity or Application context is null and we do not currently hold a reference to either for our use.";
            } else {
                if (Looper.myLooper() == null) {
                    Looper.prepare();
                }
                e2 e2Var = new e2();
                if (ga1.j() && !ga1.h().p().b.j("reconfigurable") && !ga1.h().p().a.equals("appd786f04f228d499b87")) {
                    n = ga1.h().n();
                    str = "Ignoring call to AdColony.configure() as the app id does not match what was used during the initial configuration.";
                } else {
                    ga1.R = true;
                    e2Var.a = "appd786f04f228d499b87";
                    eb1.j(e2Var.b, "app_id", "appd786f04f228d499b87");
                    if (Build.VERSION.SDK_INT < 21) {
                        t1.b(0, 1, "The minimum API level for the AdColony SDK is 21.", false);
                        ga1.d(activity2, e2Var, true);
                    } else {
                        ga1.d(activity2, e2Var, false);
                    }
                    StringBuilder sb = new StringBuilder();
                    ga1.h().r().getClass();
                    Context context = ga1.P;
                    if (context == null) {
                        absolutePath = "";
                    } else {
                        absolutePath = context.getFilesDir().getAbsolutePath();
                    }
                    String d = qq.d(sb, absolutePath, "/adc3/AppInfo");
                    ic1 ic1Var = new ic1();
                    eb1.j(ic1Var, "appId", "appd786f04f228d499b87");
                    eb1.q(ic1Var, d);
                    e2 e2Var2 = new e2();
                    eb1.m(e2Var2.b, "keep_screen_on", true);
                    w1.g(e2Var2);
                    hashMap.put("leave_world", "vz432fe8cc502b48a99e");
                    hashMap.put("play_clicked", "vz1e70ec98cbce410e9a");
                    hashMap2.put("premium_ticket", "vz765e72cdcfcc4b8c80");
                }
            }
        }
        n.d(0, 1, str, false);
        e2 e2Var22 = new e2();
        eb1.m(e2Var22.b, "keep_screen_on", true);
        w1.g(e2Var22);
        hashMap.put("leave_world", "vz432fe8cc502b48a99e");
        hashMap.put("play_clicked", "vz1e70ec98cbce410e9a");
        hashMap2.put("premium_ticket", "vz765e72cdcfcc4b8c80");
    }

    @Override // defpackage.r2.e
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.r2.e
    public final void b(boolean z) {
        String str;
        e2 e2Var = null;
        if (z) {
            ExecutorService executorService = w1.a;
            if (ga1.R) {
                e2Var = ga1.h().p();
            }
            str = "1";
        } else {
            ExecutorService executorService2 = w1.a;
            if (ga1.R) {
                e2Var = ga1.h().p();
            }
            str = "0";
        }
        e2Var.d(str);
        e2Var.e();
        w1.g(e2Var);
    }

    @Override // defpackage.r2.e
    public final void c(String str, r2.b bVar) {
        String str2 = this.b.get(str);
        if (str2 == null) {
            bVar.b();
        } else {
            w1.f(new c2(bVar), str2);
        }
    }

    @Override // defpackage.r2.e
    public final void d(String str, r2.a aVar) {
        String str2 = this.a.get(str);
        if (str2 == null) {
            aVar.b();
        } else {
            w1.f(new b2(aVar), str2);
        }
    }
}