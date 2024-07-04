package defpackage;

import java.util.Map;
import javax.annotation.CheckForNull;

/* renamed from: fw4  reason: default package */
public final class fw4 {
    public static boolean a(@CheckForNull Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }
}