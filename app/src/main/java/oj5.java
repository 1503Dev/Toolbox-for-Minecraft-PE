package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: oj5  reason: default package */
public final class oj5 extends ij5 {
    public static final /* synthetic */ int b = 0;

    static {
        mj5.a(Collections.emptyMap());
    }

    public /* synthetic */ oj5(LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
    }

    public static nj5 a(int i) {
        return new nj5(i);
    }

    @Override // defpackage.uj5
    /* renamed from: b */
    public final Map c() {
        int i;
        int size = this.a.size();
        if (size < 3) {
            i = size + 1;
        } else if (size < 1073741824) {
            i = (int) ((size / 0.75f) + 1.0f);
        } else {
            i = Integer.MAX_VALUE;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        for (Map.Entry entry : this.a.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((uj5) entry.getValue()).c());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}