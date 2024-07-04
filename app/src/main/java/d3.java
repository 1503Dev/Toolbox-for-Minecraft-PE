package defpackage;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;

/* renamed from: d3  reason: default package */
public final class d3 {
    public final fx3 a;

    /* renamed from: d3$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final lw3 a;

        public a() {
            lw3 lw3Var = new lw3();
            this.a = lw3Var;
            lw3Var.d.add("B3EEABB8EE11C2BE770B684D95219ECB");
        }

        public final void a(Bundle bundle) {
            this.a.b.putBundle(AdMobAdapter.class.getName(), bundle);
            if (AdMobAdapter.class.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
                this.a.d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
            }
        }
    }

    public d3(a aVar) {
        this.a = new fx3(aVar.a);
    }
}