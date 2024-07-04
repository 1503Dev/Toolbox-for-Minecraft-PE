package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ij5  reason: default package */
public abstract class ij5 implements lj5 {
    public final Map a;

    public ij5(LinkedHashMap linkedHashMap) {
        this.a = Collections.unmodifiableMap(linkedHashMap);
    }
}