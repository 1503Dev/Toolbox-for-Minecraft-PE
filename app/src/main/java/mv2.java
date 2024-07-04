package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mv2  reason: default package */
public final class mv2 {
    public static final br4 b = new br4(Looper.getMainLooper());
    public static final String c = i3.class.getName();
    public static final String d = fy.class.getName();
    public static final String e = t2.class.getName();
    public static final String f = v2.class.getName();
    public static final String g = on0.class.getName();
    public static final String h = s2.class.getName();
    public float a = -1.0f;

    public static void h(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject2.get(next);
            try {
                Object obj2 = jSONObject.get(next);
                if (JSONObject.class.isInstance(obj2) && JSONObject.class.isInstance(obj)) {
                    h((JSONObject) obj2, (JSONObject) obj);
                }
            } catch (JSONException unused) {
                jSONObject.put(next, obj);
            }
        }
    }

    public static final boolean i() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.FINGERPRINT;
            return str.contains("generic") || str.contains("emulator");
        }
        return Build.DEVICE.startsWith("generic");
    }

    public static final void j(Context context, String str, Bundle bundle, lv2 lv2Var) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", Build.VERSION.RELEASE);
        bundle.putString("api", String.valueOf(Build.VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        if (str == null) {
            jt.b.getClass();
            str = jt.a(context) + ".231004000";
        }
        bundle.putString("js", str);
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", "gmob-apps");
        for (String str2 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str2, bundle.getString(str2));
        }
        lv2Var.m(appendQueryParameter.toString());
    }

    public static final int k(Context context, int i) {
        return (int) TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static final String l(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        return m(((contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id")) == null || i()) ? "emulator" : "emulator", "MD5");
    }

    public static String m(String str, String str2) {
        for (int i = 0; i < 2; i++) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(str2);
                messageDigest.update(str.getBytes());
                return String.format(Locale.US, "%032X", new BigInteger(1, messageDigest.digest()));
            } catch (ArithmeticException unused) {
                return null;
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        return null;
    }

    public final JSONArray a(Collection collection) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : collection) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final void b(JSONArray jSONArray, Object obj) {
        Object e2;
        if (obj instanceof Bundle) {
            e2 = f((Bundle) obj);
        } else if (obj instanceof Map) {
            e2 = g((Map) obj);
        } else if (obj instanceof Collection) {
            e2 = a((Collection) obj);
        } else if (!(obj instanceof Object[])) {
            jSONArray.put(obj);
            return;
        } else {
            e2 = e((Object[]) obj);
        }
        jSONArray.put(e2);
    }

    public final void c(JSONObject jSONObject, String str, Object obj) {
        Boolean[] boolArr;
        Object e2;
        Long[] lArr;
        Double[] dArr;
        Integer[] numArr;
        Collection asList;
        if (((Boolean) w82.d.c.a(x92.n)).booleanValue()) {
            str = String.valueOf(str);
        }
        if (obj instanceof Bundle) {
            e2 = f((Bundle) obj);
        } else if (obj instanceof Map) {
            e2 = g((Map) obj);
        } else {
            if (obj instanceof Collection) {
                str = String.valueOf(str);
                asList = (Collection) obj;
            } else if (obj instanceof Object[]) {
                asList = Arrays.asList((Object[]) obj);
            } else {
                int i = 0;
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    if (iArr == null) {
                        numArr = new Integer[0];
                    } else {
                        int length = iArr.length;
                        Integer[] numArr2 = new Integer[length];
                        while (i < length) {
                            numArr2[i] = Integer.valueOf(iArr[i]);
                            i++;
                        }
                        numArr = numArr2;
                    }
                    e2 = e(numArr);
                } else if (obj instanceof double[]) {
                    double[] dArr2 = (double[]) obj;
                    if (dArr2 == null) {
                        dArr = new Double[0];
                    } else {
                        int length2 = dArr2.length;
                        Double[] dArr3 = new Double[length2];
                        while (i < length2) {
                            dArr3[i] = Double.valueOf(dArr2[i]);
                            i++;
                        }
                        dArr = dArr3;
                    }
                    e2 = e(dArr);
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    if (jArr == null) {
                        lArr = new Long[0];
                    } else {
                        int length3 = jArr.length;
                        Long[] lArr2 = new Long[length3];
                        while (i < length3) {
                            lArr2[i] = Long.valueOf(jArr[i]);
                            i++;
                        }
                        lArr = lArr2;
                    }
                    e2 = e(lArr);
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    if (zArr == null) {
                        boolArr = new Boolean[0];
                    } else {
                        int length4 = zArr.length;
                        Boolean[] boolArr2 = new Boolean[length4];
                        while (i < length4) {
                            boolArr2[i] = Boolean.valueOf(zArr[i]);
                            i++;
                        }
                        boolArr = boolArr2;
                    }
                    e2 = e(boolArr);
                } else {
                    jSONObject.put(str, obj);
                    return;
                }
            }
            e2 = a(asList);
        }
        jSONObject.put(str, e2);
    }

    public final int d(Context context, int i) {
        if (this.a < 0.0f) {
            synchronized (this) {
                if (this.a < 0.0f) {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        return 0;
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    defaultDisplay.getMetrics(displayMetrics);
                    this.a = displayMetrics.density;
                }
            }
        }
        return Math.round(i / this.a);
    }

    public final JSONArray e(Object[] objArr) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : objArr) {
            b(jSONArray, obj);
        }
        return jSONArray;
    }

    public final JSONObject f(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            c(jSONObject, str, bundle.get(str));
        }
        return jSONObject;
    }

    public final JSONObject g(Map map) {
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                c(jSONObject, str, map.get(str));
            }
            return jSONObject;
        } catch (ClassCastException e2) {
            throw new JSONException("Could not convert map to JSON: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}