package defpackage;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: je1  reason: default package */
public final class je1 {
    public static int a;
    public static HashMap<String, Integer> b = new HashMap<>();
    public static HashMap<String, Integer> c = new HashMap<>();

    public static boolean a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i == 0) {
            if (currentTimeMillis - a < 5) {
                return true;
            }
            a = currentTimeMillis;
            return false;
        } else if (i == 1 && bundle != null) {
            String string = bundle.getString("zone_id");
            if (b.get(string) == null) {
                b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (c.get(string) == null) {
                c.put(string, 0);
            }
            if (currentTimeMillis - b.get(string).intValue() > 1) {
                c.put(string, 1);
                b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = c.get(string).intValue() + 1;
            c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else {
            return false;
        }
    }
}