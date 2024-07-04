package defpackage;

/* renamed from: oc2  reason: default package */
public final class oc2 {
    public final long a = -9223372036854775807L;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof oc2) {
            long j = ((oc2) obj).a;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = (int) (-9223372034707292159L);
        int floatToIntBits = Float.floatToIntBits(-3.4028235E38f);
        return Float.floatToIntBits(-3.4028235E38f) + ((floatToIntBits + (((((i * 31) + i) * 31) + i) * 31)) * 31);
    }
}