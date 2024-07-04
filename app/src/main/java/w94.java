package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: w94  reason: default package */
public final /* synthetic */ class w94 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nc4 b;

    public /* synthetic */ w94(nc4 nc4Var, int i) {
        this.a = i;
        this.b = nc4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        Bundle bundle = null;
        switch (this.a) {
            case 0:
                y94 y94Var = (y94) this.b;
                y94Var.getClass();
                cu5 cu5Var = jv5.A.c;
                Context context = y94Var.a;
                l92 l92Var = x92.Y4;
                w82 w82Var = w82.d;
                String str = "";
                if (!((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    string = "";
                } else {
                    string = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", "");
                }
                if (((Boolean) w82Var.c.a(x92.a5)).booleanValue()) {
                    str = y94Var.a.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", "");
                }
                Context context2 = y94Var.a;
                if (((Boolean) w82Var.c.a(x92.Z4)).booleanValue()) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
                    Bundle bundle2 = new Bundle();
                    if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                        bundle2.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
                    }
                    String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
                    for (int i = 0; i < 4; i++) {
                        String str2 = strArr[i];
                        if (defaultSharedPreferences.contains(str2)) {
                            bundle2.putString(str2, defaultSharedPreferences.getString(str2, null));
                        }
                    }
                    bundle = bundle2;
                }
                return new x94(string, str, bundle);
            default:
                lc4 lc4Var = (lc4) this.b;
                lc4Var.getClass();
                String str3 = (String) w82.d.c.a(x92.b5);
                if (TextUtils.isEmpty(str3)) {
                    return null;
                }
                try {
                    return new j84(1, lc4.b(lc4Var.b, new JSONArray(str3)));
                } catch (JSONException e) {
                    sv2.c("JSON parsing error", e);
                    return null;
                }
        }
    }
}