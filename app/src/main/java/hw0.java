package defpackage;

import defpackage.l4;
import java.util.Arrays;

/* renamed from: hw0  reason: default package */
public final class hw0 implements l4.c {
    public static final hw0 c = new hw0();
    public final String b = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hw0) {
            return wa0.a(this.b, ((hw0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }
}