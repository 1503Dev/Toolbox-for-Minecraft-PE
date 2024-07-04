package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jz1  reason: default package */
public final class jz1 implements qt4, h23, i52, kg4, fc5, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ jz1(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[Catch: all -> 0x0058, TryCatch #5 {, blocks: (B:7:0x0014, B:40:0x0096, B:10:0x001a, B:12:0x001f, B:13:0x0021, B:17:0x002d, B:18:0x002f, B:39:0x008f, B:16:0x0029, B:20:0x0044, B:21:0x0046, B:25:0x0051, B:31:0x005b, B:33:0x0069, B:34:0x006c, B:37:0x007b, B:38:0x008d), top: B:55:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.qt4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        Context applicationContext;
        Context context;
        SharedPreferences sharedPreferences;
        Context context2 = (Context) this.Q;
        p92 p92Var = x92.a;
        w92 w92Var = w82.d.c;
        if (!w92Var.c) {
            synchronized (w92Var.a) {
                if (!w92Var.c) {
                    if (!w92Var.d) {
                        w92Var.d = true;
                    }
                    if (context2.getApplicationContext() == null) {
                        applicationContext = context2;
                    } else {
                        applicationContext = context2.getApplicationContext();
                    }
                    w92Var.g = applicationContext;
                    try {
                        w92Var.f = c81.a(applicationContext).a(w92Var.g.getPackageName(), 128).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    AtomicBoolean atomicBoolean = ot.a;
                    try {
                        context = context2.createPackageContext("com.google.android.gms", 3);
                    } catch (PackageManager.NameNotFoundException unused2) {
                        context = null;
                    }
                    if (context == null) {
                        context = context2.getApplicationContext();
                        if (context != null) {
                        }
                        s92 s92Var = w82.d.b;
                        sharedPreferences = context2.getSharedPreferences("google_ads_flags", 0);
                        w92Var.e = sharedPreferences;
                        if (sharedPreferences != null) {
                            sharedPreferences.registerOnSharedPreferenceChangeListener(w92Var);
                        }
                        fc2.a.set(new v92(w92Var));
                        if (w92Var.e != null) {
                            try {
                                w92Var.h = new JSONObject((String) aa2.a(new zw5(1, w92Var)));
                            } catch (JSONException unused3) {
                            }
                        }
                        w92Var.c = true;
                        w92Var.d = false;
                        w92Var.b.open();
                    }
                    context2 = context;
                    s92 s92Var2 = w82.d.b;
                    sharedPreferences = context2.getSharedPreferences("google_ads_flags", 0);
                    w92Var.e = sharedPreferences;
                    if (sharedPreferences != null) {
                    }
                    fc2.a.set(new v92(w92Var));
                    if (w92Var.e != null) {
                    }
                    w92Var.c = true;
                    w92Var.d = false;
                    w92Var.b.open();
                }
            }
        }
        return null;
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        ((ax2) this.Q).d();
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 4:
                ((gf2) obj).p((tz3) this.Q);
                return;
            default:
                jn5 jn5Var = (jn5) this.Q;
                int i = bm5.X;
                ((b53) obj).b(jn5Var.e, jn5Var.l);
                return;
        }
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        t52 t52Var = (t52) ((u62) t62Var.Q).w().g();
        j62 j62Var = (j62) ((u62) t62Var.Q).w().y().g();
        String str = ((ci4) ((hi4) this.Q).b.Q).b;
        j62Var.j();
        k62.y((k62) j62Var.Q, str);
        t52Var.j();
        u52.A((u52) t52Var.Q, (k62) j62Var.h());
        t62Var.j();
        u62.G((u62) t62Var.Q, (u52) t52Var.h());
    }

    @Override // defpackage.fc5
    public final Object m(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        gc5 gc5Var = gc5.b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return ((hc5) this.Q).c(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return ((hc5) this.Q).c(str, null);
    }

    public jz1(dt4 dt4Var) {
        this.P = 0;
        this.Q = dt4Var;
    }

    public /* synthetic */ jz1(hc5 hc5Var) {
        this.P = 7;
        this.Q = hc5Var;
    }
}