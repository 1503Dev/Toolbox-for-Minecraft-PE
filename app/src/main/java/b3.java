package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import defpackage.d3;
import defpackage.r2;
import java.util.HashMap;

/* renamed from: b3  reason: default package */
public final class b3 implements r2.e {
    public final Activity a;
    public d3 b;
    public final HashMap<String, String> c = new HashMap<>();
    public final HashMap<String, String> d = new HashMap<>();
    public boolean e;

    /* renamed from: b3$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements r2.c {
        public fy a;

        public a(fy fyVar) {
            this.a = fyVar;
        }

        @Override // defpackage.r2.c
        public final void a() {
            this.a.e(null);
        }
    }

    public b3(final Activity activity) {
        this.a = activity;
        final x64 b = x64.b();
        synchronized (b.a) {
            if (!b.c && !b.d) {
                b.c = true;
                if (activity != null) {
                    synchronized (b.e) {
                        try {
                            b.a(activity);
                            b.f.Q1(new o64(b));
                            b.f.i2(new tk2());
                            b.g.getClass();
                            b.g.getClass();
                        } catch (RemoteException e) {
                            sv2.h("MobileAdsSettingManager initialization failed", e);
                        }
                        x92.a(activity);
                        if (((Boolean) kb2.a.d()).booleanValue()) {
                            if (((Boolean) w82.d.c.a(x92.J8)).booleanValue()) {
                                sv2.b("Initializing on bg thread");
                                jv2.a.execute(new t14(b, activity));
                            }
                        }
                        if (((Boolean) kb2.b.d()).booleanValue()) {
                            if (((Boolean) w82.d.c.a(x92.J8)).booleanValue()) {
                                jv2.b.execute(new Runnable() { // from class: o24
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        x64 x64Var = x64.this;
                                        Context context = activity;
                                        synchronized (x64Var.e) {
                                            x64Var.d(context);
                                        }
                                    }
                                });
                            }
                        }
                        sv2.b("Initializing on calling thread");
                        b.d(activity);
                    }
                } else {
                    throw new IllegalArgumentException("Context cannot be null.");
                }
            }
        }
        e();
        this.c.put("leave_world", "ca-app-pub-9335396028317773/2294917441");
        this.c.put("play_clicked", "ca-app-pub-9335396028317773/1759463520");
        this.d.put("premium_ticket", "ca-app-pub-9335396028317773/7431700402");
    }

    @Override // defpackage.r2.e
    public final /* synthetic */ boolean a() {
        return false;
    }

    @Override // defpackage.r2.e
    public final void b(boolean z) {
        this.e = z;
        e();
    }

    @Override // defpackage.r2.e
    public final void c(String str, r2.b bVar) {
        String str2 = this.d.get(str);
        if (str2 == null) {
            bVar.b();
        } else {
            xl0.b(this.a, str2, this.b, new a3(this, bVar));
        }
    }

    @Override // defpackage.r2.e
    public final void d(String str, r2.a aVar) {
        String str2 = this.c.get(str);
        if (str2 == null) {
            aVar.b();
        } else {
            fy.b(this.a, str2, this.b, new x2(this, aVar));
        }
    }

    public final void e() {
        d3.a aVar = new d3.a();
        if (this.e) {
            Bundle bundle = new Bundle();
            bundle.putString("npa", "1");
            aVar.a(bundle);
        }
        this.b = new d3(aVar);
    }
}