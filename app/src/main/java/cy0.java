package defpackage;

import android.app.Activity;
import com.google.ads.consent.ConsentForm;
import com.google.ads.consent.ConsentFormListener;
import com.google.ads.consent.ConsentInfoUpdateListener;
import com.google.ads.consent.ConsentInformation;
import com.google.ads.consent.ConsentStatus;
import defpackage.r2;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* renamed from: cy0  reason: default package */
public final class cy0 implements tv {
    public final Activity a;
    public final r2 b;
    public final HashMap c = new HashMap();
    public ConsentInformation d;
    public ConsentForm e;

    /* renamed from: cy0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ConsentInfoUpdateListener {
        public a() {
        }

        @Override // com.google.ads.consent.ConsentInfoUpdateListener
        public final void a() {
        }

        @Override // com.google.ads.consent.ConsentInfoUpdateListener
        public final void b(ConsentStatus consentStatus) {
            r2 r2Var;
            boolean z;
            if (consentStatus == ConsentStatus.PERSONALIZED) {
                r2Var = cy0.this.b;
                z = true;
            } else if (consentStatus == ConsentStatus.NON_PERSONALIZED) {
                r2Var = cy0.this.b;
                z = false;
            } else {
                cy0.this.c();
                return;
            }
            r2Var.c(z);
        }
    }

    /* renamed from: cy0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends ConsentFormListener {
        public b() {
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public final void a(ConsentStatus consentStatus) {
            r2 r2Var;
            boolean z;
            if (consentStatus == ConsentStatus.PERSONALIZED) {
                r2Var = cy0.this.b;
                z = true;
            } else if (consentStatus == ConsentStatus.NON_PERSONALIZED) {
                r2Var = cy0.this.b;
                z = false;
            } else {
                return;
            }
            r2Var.c(z);
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public final void b() {
        }

        @Override // com.google.ads.consent.ConsentFormListener
        public final void c() {
            cy0.this.e.h();
        }
    }

    public cy0(Activity activity) {
        this.a = activity;
        r2 r2Var = new r2();
        this.b = r2Var;
        r2Var.a.add(new ae0(activity));
        r2Var.a.add(new d2(activity));
        r2Var.a.add(new b3(activity));
    }

    public final void a() {
        if (this.d != null) {
            return;
        }
        ConsentInformation e = ConsentInformation.e(this.a);
        this.d = e;
        e.b();
        this.d.j(new String[]{"ca-app-pub-9335396028317773"}, new a());
    }

    public final r2.c b() {
        if (!this.c.containsKey("play_clicked")) {
            HashMap hashMap = this.c;
            r2 r2Var = this.b;
            r2.f fVar = new r2.f();
            r2Var.a(fVar, "play_clicked", 0);
            hashMap.put("play_clicked", fVar);
        }
        return (r2.c) this.c.get("play_clicked");
    }

    public final void c() {
        URL url;
        try {
            url = new URL("https://mrarm.io/u/tb_privacy_policy.html");
        } catch (MalformedURLException unused) {
            url = null;
        }
        ConsentForm.Builder builder = new ConsentForm.Builder(this.a, url);
        builder.g(new b());
        builder.i();
        builder.h();
        ConsentForm consentForm = new ConsentForm(builder);
        this.e = consentForm;
        consentForm.g();
    }
}