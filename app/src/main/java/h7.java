package defpackage;

import java.lang.reflect.Array;

/* renamed from: h7  reason: default package */
public abstract class h7<T> extends tv0<T> {
    public h7(T t) {
        super(t);
        if (!t.getClass().isArray()) {
            throw new UnsupportedOperationException("type of array tag must be an array");
        }
    }

    @Override // defpackage.tv0
    public final void r(T t) {
        super.r(t);
    }

    @Override // defpackage.tv0
    public final String u(int i) {
        return w("", "");
    }

    public final String w(String str, String str2) {
        String str3;
        String str4;
        StringBuilder sb = new StringBuilder("[");
        sb.append(str);
        if ("".equals(str)) {
            str3 = "";
        } else {
            str3 = ";";
        }
        sb.append(str3);
        for (int i = 0; i < x(); i++) {
            if (i == 0) {
                str4 = "";
            } else {
                str4 = ",";
            }
            sb.append(str4);
            sb.append(Array.get(this.P, i));
            sb.append(str2);
        }
        sb.append("]");
        return sb.toString();
    }

    public final int x() {
        return Array.getLength(this.P);
    }
}