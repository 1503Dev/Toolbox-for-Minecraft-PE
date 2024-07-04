package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: c11  reason: default package */
public final class c11 {
    public View b;
    public final HashMap a = new HashMap();
    public final ArrayList<u01> c = new ArrayList<>();

    @Deprecated
    public c11() {
    }

    public c11(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c11) {
            c11 c11Var = (c11) obj;
            return this.b == c11Var.b && this.a.equals(c11Var.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder b = e5.b("TransitionValues@");
        b.append(Integer.toHexString(hashCode()));
        b.append(":\n");
        StringBuilder c = yg.c(b.toString(), "    view = ");
        c.append(this.b);
        c.append("\n");
        String b2 = k6.b(c.toString(), "    values:");
        for (String str : this.a.keySet()) {
            b2 = b2 + "    " + str + ": " + this.a.get(str) + "\n";
        }
        return b2;
    }
}