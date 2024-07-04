package defpackage;

import android.graphics.Color;
import android.view.View;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: nu2  reason: default package */
public class nu2 implements ta0, wg3 {
    public static final v22 P = new v22(0);
    public static final /* synthetic */ nu2 Q = new nu2();
    public static final ir3 R = new ir3(1);

    public static int a(View view, int i) {
        return y30.b(i, view.getContext(), view.getClass().getCanonicalName());
    }

    public static e81 b(ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec instanceof sn) {
            sn snVar = (sn) eCParameterSpec;
            o i = h50.i(snVar.a);
            if (i == null) {
                i = new o(snVar.a);
            }
            return new e81(i);
        } else if (eCParameterSpec == null) {
            return new e81(gi.P);
        } else {
            hn a = en.a(eCParameterSpec.getCurve());
            wn c = en.c(a, eCParameterSpec.getGenerator());
            return new e81(new g81(a, new i81(c), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed()));
        }
    }

    public static int c(float f, int i, int i2) {
        return be.a(be.c(i2, Math.round(Color.alpha(i2) * f)), i);
    }

    public static String f(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray(str2)) != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (j(optJSONArray2, str) && !j(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", "");
                    }
                }
            }
        }
        return "";
    }

    public static m05 g(wk1 wk1Var) {
        try {
            ab5 B = ab5.B((InputStream) wk1Var.P, ud5.c);
            ((InputStream) wk1Var.P).close();
            return m05.a(B);
        } catch (Throwable th) {
            ((InputStream) wk1Var.P).close();
            throw th;
        }
    }

    public static void h(int i, int i2) {
        String b;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw new IllegalArgumentException(k6.a("negative size: ", i2));
            }
            b = lp5.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            b = lp5.b("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(b);
    }

    public static void i(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(l(i, i2, "index"));
        }
    }

    public static boolean j(JSONArray jSONArray, String str) {
        Pattern compile;
        if (jSONArray != null && str != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                try {
                    if (((Boolean) w82.d.c.a(x92.x8)).booleanValue()) {
                        compile = Pattern.compile(optString, 2);
                    } else {
                        compile = Pattern.compile(optString);
                    }
                } catch (PatternSyntaxException e) {
                    jv5.A.g.f("RtbAdapterMap.hasAtleastOneRegexMatch", e);
                }
                if (compile.matcher(str).lookingAt()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void k(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? l(i, i3, "start index") : (i2 < 0 || i2 > i3) ? l(i2, i3, "end index") : lp5.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String l(int i, int i2, String str) {
        if (i < 0) {
            return lp5.b("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return lp5.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(k6.a("negative size: ", i2));
    }

    @Override // defpackage.ta0
    public Object d() {
        return new TreeMap();
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zp5) obj).Z();
    }
}