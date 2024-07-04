package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: zs2  reason: default package */
public final class zs2 implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final Context a;
    public final SharedPreferences b;
    public final f25 c;
    public final qt2 d;
    public String e = "-1";
    public int f = -1;

    public zs2(Context context, f25 f25Var, qt2 qt2Var) {
        this.b = PreferenceManager.getDefaultSharedPreferences(context);
        this.c = f25Var;
        this.a = context;
        this.d = qt2Var;
    }

    public final void a() {
        SharedPreferences sharedPreferences;
        String str;
        this.b.registerOnSharedPreferenceChangeListener(this);
        onSharedPreferenceChanged(this.b, "gad_has_consent_for_cookies");
        if (((Boolean) w82.d.c.a(x92.q0)).booleanValue()) {
            onSharedPreferenceChanged(this.b, "IABTCF_gdprApplies");
            sharedPreferences = this.b;
            str = "IABTCF_TCString";
        } else {
            sharedPreferences = this.b;
            str = "IABTCF_PurposeConsents";
        }
        onSharedPreferenceChanged(sharedPreferences, str);
    }

    public final void b(int i, String str) {
        Context context;
        l92 l92Var = x92.o0;
        w82 w82Var = w82.d;
        boolean z = false;
        if (!((Boolean) w82Var.c.a(l92Var)).booleanValue() ? str.isEmpty() || str.charAt(0) != '1' : i == 0 || str.isEmpty() || (str.charAt(0) != '1' && !str.equals("-1"))) {
            z = true;
        }
        if (((Boolean) w82Var.c.a(x92.m0)).booleanValue()) {
            this.c.o(z);
            if (((Boolean) w82Var.c.a(x92.f5)).booleanValue() && z && (context = this.a) != null) {
                context.deleteDatabase("OfflineUpload.db");
            }
        }
        if (((Boolean) w82Var.c.a(x92.i0)).booleanValue()) {
            synchronized (this.d.l) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        char c;
        l92 l92Var = x92.q0;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (gv4.g(str, "gad_has_consent_for_cookies")) {
                if (!((Boolean) w82Var.c.a(x92.o0)).booleanValue()) {
                    return;
                }
                int i = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
                if (i != this.c.c()) {
                    this.c.o(true);
                }
                this.c.q(i);
                return;
            } else if (gv4.g(str, "IABTCF_gdprApplies") || gv4.g(str, "IABTCF_TCString") || gv4.g(str, "IABTCF_PurposeConsents")) {
                String string = sharedPreferences.getString(str, "-1");
                if (string != null && !string.equals(this.c.q0(str))) {
                    this.c.o(true);
                }
                this.c.l(str, string);
                return;
            } else {
                return;
            }
        }
        String string2 = sharedPreferences.getString("IABTCF_PurposeConsents", "-1");
        int i2 = sharedPreferences.getInt("gad_has_consent_for_cookies", -1);
        String valueOf = String.valueOf(str);
        int hashCode = valueOf.hashCode();
        if (hashCode != -2004976699) {
            if (hashCode == -527267622 && valueOf.equals("gad_has_consent_for_cookies")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (valueOf.equals("IABTCF_PurposeConsents")) {
                c = 0;
            }
            c = 65535;
        }
        if (c != 0) {
            if (c != 1) {
                return;
            }
            if (((Boolean) w82Var.c.a(x92.o0)).booleanValue() && i2 != -1 && this.f != i2) {
                this.f = i2;
                b(i2, string2);
            }
        } else if (!string2.equals("-1") && !this.e.equals(string2)) {
            this.e = string2;
            b(i2, string2);
        }
    }
}