package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jo4  reason: default package */
public final class jo4 {
    public static WindowManager a;
    public static final String[] b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put("y", i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
        } catch (JSONException e) {
            ar.o("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            ar.o("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void c(JSONObject jSONObject) {
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

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                if (!optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (optJSONArray3 != null || optJSONArray4 != null) {
                        if ((optJSONArray3 == null && optJSONArray4 == null) || (optJSONArray3 != null && optJSONArray4 != null && optJSONArray3.length() == optJSONArray4.length())) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                if (d(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}