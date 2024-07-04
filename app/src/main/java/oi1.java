package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import defpackage.l4;

/* renamed from: oi1  reason: default package */
public final class oi1 {
    public final SparseIntArray a;
    public jt b;

    public oi1() {
        ht htVar = ht.d;
        this.a = new SparseIntArray();
        this.b = htVar;
    }

    public final int a(Context context, l4.e eVar) {
        uf0.f(context);
        uf0.f(eVar);
        int i = 0;
        if (!eVar.e()) {
            return 0;
        }
        int f = eVar.f();
        int i2 = this.a.get(f, -1);
        if (i2 == -1) {
            int i3 = 0;
            while (true) {
                if (i3 < this.a.size()) {
                    int keyAt = this.a.keyAt(i3);
                    if (keyAt > f && this.a.get(keyAt) == 0) {
                        break;
                    }
                    i3++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                i2 = this.b.c(context, f);
            } else {
                i2 = i;
            }
            this.a.put(f, i2);
        }
        return i2;
    }
}