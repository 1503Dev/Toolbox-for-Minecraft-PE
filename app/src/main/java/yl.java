package defpackage;

import java.util.Objects;

/* renamed from: yl  reason: default package */
public final class yl {
    public final Object a;

    public yl(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yl.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((yl) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder b = e5.b("DisplayCutoutCompat{");
        b.append(this.a);
        b.append("}");
        return b.toString();
    }
}