package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: sa1  reason: default package */
public final class sa1 {
    public static WindowManager a;
    public static String[] b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put("y", i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
        } catch (JSONException e) {
            s45.b("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject) {
        float f;
        float f2 = 0.0f;
        if (a != null) {
            Point point = new Point(0, 0);
            a.getDefaultDisplay().getRealSize(point);
            float f3 = c;
            f2 = point.x / f3;
            f = point.y / f3;
        } else {
            f = 0.0f;
        }
        try {
            jSONObject.put("width", f2);
            jSONObject.put("height", f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static void c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            s45.b("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = b;
        int i = 0;
        while (true) {
            if (i < 4) {
                String str = strArr[i];
                if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z && jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
            JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
            if (optJSONArray != null || optJSONArray2 != null) {
                if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        if (optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                        }
                    }
                }
                z3 = false;
                if (z3) {
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (d(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                        z5 = false;
                        if (!z5) {
                            return true;
                        }
                    }
                    z5 = true;
                    if (!z5) {
                    }
                }
            }
            z3 = true;
            if (z3) {
            }
        }
        return false;
    }
}