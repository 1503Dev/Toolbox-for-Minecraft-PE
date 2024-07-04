package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* renamed from: xq4  reason: default package */
public abstract class xq4 implements fv4 {
    public final boolean a;
    public final ArrayList b = new ArrayList(1);
    public int c;
    public kz4 d;

    public xq4(boolean z) {
        this.a = z;
    }

    @Override // defpackage.fv4
    public /* synthetic */ Map b() {
        return Collections.emptyMap();
    }

    @Override // defpackage.fv4
    public final void c(bf5 bf5Var) {
        bf5Var.getClass();
        if (this.b.contains(bf5Var)) {
            return;
        }
        this.b.add(bf5Var);
        this.c++;
    }

    public final void f() {
        kz4 kz4Var = this.d;
        int i = zn4.a;
        for (int i2 = 0; i2 < this.c; i2++) {
            ((bf5) this.b.get(i2)).h(kz4Var, this.a);
        }
        this.d = null;
    }

    public final void g(kz4 kz4Var) {
        for (int i = 0; i < this.c; i++) {
            ((bf5) this.b.get(i)).d();
        }
    }

    public final void h(kz4 kz4Var) {
        this.d = kz4Var;
        for (int i = 0; i < this.c; i++) {
            ((bf5) this.b.get(i)).i(this, kz4Var, this.a);
        }
    }

    public final void v(int i) {
        kz4 kz4Var = this.d;
        int i2 = zn4.a;
        for (int i3 = 0; i3 < this.c; i3++) {
            ((bf5) this.b.get(i3)).g(kz4Var, this.a, i);
        }
    }
}