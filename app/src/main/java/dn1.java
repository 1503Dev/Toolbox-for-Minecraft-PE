package defpackage;

import android.util.SparseBooleanArray;

/* renamed from: dn1  reason: default package */
public final class dn1 {
    public final SparseBooleanArray a = new SparseBooleanArray();
    public boolean b;

    public final void a(int i) {
        tv2.I(!this.b);
        this.a.append(i, true);
    }

    public final hp1 b() {
        tv2.I(!this.b);
        this.b = true;
        return new hp1(this.a);
    }
}