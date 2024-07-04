package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: jv4  reason: default package */
public final class jv4 extends lu4 implements Serializable {
    public final Object P;
    public final Object Q;

    public jv4(Object obj, List list) {
        this.P = obj;
        this.Q = list;
    }

    @Override // defpackage.lu4, java.util.Map.Entry
    public final Object getKey() {
        return this.P;
    }

    @Override // defpackage.lu4, java.util.Map.Entry
    public final Object getValue() {
        return this.Q;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}