package defpackage;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: c85  reason: default package */
public final class c85 {
    public final z75 a;
    public final List b;
    @Nullable
    public final Integer c;

    public /* synthetic */ c85(z75 z75Var, List list, Integer num) {
        this.a = z75Var;
        this.b = list;
        this.c = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c85) {
            c85 c85Var = (c85) obj;
            if (this.a.equals(c85Var.a) && this.b.equals(c85Var.b)) {
                Integer num = this.c;
                Integer num2 = c85Var.c;
                if (num == num2) {
                    return true;
                }
                if (num != null && num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.a, this.b, this.c);
    }
}