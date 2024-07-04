package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: jw1  reason: default package */
public final class jw1 extends dt4 {
    public static ArrayList n(Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getKey() != null) {
                for (String str : (List) entry.getValue()) {
                    arrayList.add(new uu1((String) entry.getKey(), str));
                }
            }
        }
        return arrayList;
    }
}