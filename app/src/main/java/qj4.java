package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: qj4  reason: default package */
public final class qj4 implements qd3 {
    public final HashSet P = new HashSet();
    public final Context Q;
    public final hv2 R;

    public qj4(Context context, hv2 hv2Var) {
        this.Q = context;
        this.R = hv2Var;
    }

    public final Bundle a() {
        String str;
        Bundle bundle;
        boolean z;
        Bundle bundle2;
        hv2 hv2Var = this.R;
        Context context = this.Q;
        hv2Var.getClass();
        HashSet hashSet = new HashSet();
        synchronized (hv2Var.a) {
            hashSet.addAll(hv2Var.e);
            hv2Var.e.clear();
        }
        Bundle bundle3 = new Bundle();
        zu2 zu2Var = hv2Var.d;
        av2 av2Var = hv2Var.c;
        synchronized (av2Var) {
            str = (String) av2Var.R;
        }
        synchronized (zu2Var.f) {
            bundle = new Bundle();
            if (!zu2Var.h.C()) {
                bundle.putString("session_id", zu2Var.g);
            }
            bundle.putLong("basets", zu2Var.b);
            bundle.putLong("currts", zu2Var.a);
            bundle.putString("seq_num", str);
            bundle.putInt("preqs", zu2Var.c);
            bundle.putInt("preqs_in_session", zu2Var.d);
            bundle.putLong("time_in_session", zu2Var.e);
            bundle.putInt("pclick", zu2Var.i);
            bundle.putInt("pimp", zu2Var.j);
            Context a = br2.a(context);
            int identifier = a.getResources().getIdentifier("Theme.Translucent", "style", "android");
            if (identifier != 0) {
                try {
                } catch (PackageManager.NameNotFoundException unused) {
                    sv2.g("Fail to fetch AdActivity theme");
                }
                if (identifier == a.getPackageManager().getActivityInfo(new ComponentName(a.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                    z = true;
                    bundle.putBoolean("support_transparent_background", z);
                } else {
                    sv2.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    z = false;
                    bundle.putBoolean("support_transparent_background", z);
                }
            }
            sv2.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            z = false;
            bundle.putBoolean("support_transparent_background", z);
        }
        bundle3.putBundle("app", bundle);
        Bundle bundle4 = new Bundle();
        Iterator it = hv2Var.f.iterator();
        if (!it.hasNext()) {
            bundle3.putBundle("slots", bundle4);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                ru2 ru2Var = (ru2) it2.next();
                synchronized (ru2Var.d) {
                    bundle2 = new Bundle();
                    bundle2.putString("seq_num", ru2Var.e);
                    bundle2.putString("slotid", ru2Var.f);
                    bundle2.putBoolean("ismediation", false);
                    bundle2.putLong("treq", ru2Var.j);
                    bundle2.putLong("tresponse", ru2Var.k);
                    bundle2.putLong("timp", ru2Var.g);
                    bundle2.putLong("tload", ru2Var.h);
                    bundle2.putLong("pcc", ru2Var.i);
                    bundle2.putLong("tfetch", -1L);
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    Iterator it3 = ru2Var.c.iterator();
                    while (it3.hasNext()) {
                        qu2 qu2Var = (qu2) it3.next();
                        qu2Var.getClass();
                        Bundle bundle5 = new Bundle();
                        bundle5.putLong("topen", qu2Var.a);
                        bundle5.putLong("tclose", qu2Var.b);
                        arrayList2.add(bundle5);
                    }
                    bundle2.putParcelableArrayList("tclick", arrayList2);
                }
                arrayList.add(bundle2);
            }
            bundle3.putParcelableArrayList("ads", arrayList);
            synchronized (this) {
                this.P.clear();
                this.P.addAll(hashSet);
            }
            return bundle3;
        }
        gv2 gv2Var = (gv2) it.next();
        throw null;
    }

    @Override // defpackage.qd3
    public final synchronized void p(tz3 tz3Var) {
        if (tz3Var.P != 3) {
            hv2 hv2Var = this.R;
            HashSet hashSet = this.P;
            synchronized (hv2Var.a) {
                hv2Var.e.addAll(hashSet);
            }
        }
    }
}