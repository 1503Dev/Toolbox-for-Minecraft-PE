package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: ke2  reason: default package */
public class ke2 {
    public final Uri a;
    public final List b;
    public final nv4 c;

    public ke2(Uri uri, List list, nw4 nw4Var) {
        this.a = uri;
        this.b = list;
        this.c = nw4Var;
        kv4 kv4Var = new kv4();
        if (nw4Var.S <= 0) {
            kv4Var.s();
        } else {
            kj2 kj2Var = (kj2) nw4Var.get(0);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ke2) {
            ke2 ke2Var = (ke2) obj;
            return this.a.equals(ke2Var.a) && zn4.b(null, null) && zn4.b(null, null) && zn4.b(null, null) && this.b.equals(ke2Var.b) && zn4.b(null, null) && this.c.equals(ke2Var.c) && zn4.b(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b.hashCode() + (this.a.hashCode() * 923521)) * 961) + this.c.hashCode()) * 31;
    }
}