package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import org.json.JSONException;

/* renamed from: m82  reason: default package */
public final class m82 {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        String concat;
        if (bundle == null) {
            concat = "Unexpected null bundle received!";
        } else {
            Object obj = bundle.get("RESPONSE_CODE");
            if (obj == null) {
                d(str, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            } else if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            } else {
                concat = "Unexpected type for bundle response code: ".concat(obj.getClass().getName());
            }
        }
        e(str, concat);
        return 6;
    }

    public static da b(Intent intent, String str) {
        if (intent == null) {
            e("BillingHelper", "Got null intent!");
            da daVar = new da();
            daVar.a = 6;
            daVar.b = "An internal error occurred.";
            return daVar;
        }
        int a2 = a(intent.getExtras(), str);
        String c = c(intent.getExtras(), str);
        da daVar2 = new da();
        daVar2.a = a2;
        daVar2.b = c;
        return daVar2;
    }

    public static String c(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            d(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            e(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static void d(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void f(String str, String str2, Exception exc) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, exc);
        }
    }

    public static sg0 g(String str, String str2) {
        if (str == null || str2 == null) {
            d("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new sg0(str, str2);
        } catch (JSONException e) {
            e("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
            return null;
        }
    }
}