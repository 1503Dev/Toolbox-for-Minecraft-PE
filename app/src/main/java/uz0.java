package defpackage;

import android.app.Activity;

/* renamed from: uz0  reason: default package */
public final class uz0 {
    public final Activity a;
    public final ow b;
    public final ya0 c;
    public sz0 d;
    public int e = -1;
    public int f = -1;

    public uz0(Activity activity, ow owVar, q01 q01Var) {
        this.a = activity;
        this.b = owVar;
        this.c = q01Var;
        owVar.isVisible().a(new xs0(new tz0(0, this)));
        a();
    }

    public final void a() {
        boolean z;
        if (this.d != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.b.isVisible().Q;
        if (z == z2) {
            return;
        }
        if (z2) {
            sz0 sz0Var = new sz0(this.a, this.b);
            this.d = sz0Var;
            if (this.e == -1 && this.f == -1) {
                sz0Var.getContentView().measure(0, 0);
                this.e = (this.a.getWindow().getDecorView().getWidth() / 2) - (this.d.getContentView().getMeasuredWidth() / 2);
                this.f = 0;
            }
            sz0 sz0Var2 = this.d;
            int i = this.e;
            int i2 = this.f;
            sz0Var2.b = i;
            sz0Var2.c = i2;
            if (sz0Var2.isShowing()) {
                sz0Var2.update(sz0Var2.b, sz0Var2.c, sz0Var2.getWidth(), sz0Var2.getHeight());
            }
            sz0 sz0Var3 = this.d;
            ya0 ya0Var = this.c;
            ya0 ya0Var2 = sz0Var3.f;
            if (ya0Var2 != null) {
                ya0Var2.z(sz0Var3.g);
            }
            sz0Var3.f = ya0Var;
            if (ya0Var != null) {
                ya0Var.a(sz0Var3.g);
                sz0Var3.g.g(0, null);
                return;
            }
            return;
        }
        sz0 sz0Var4 = this.d;
        this.e = sz0Var4.b;
        this.f = sz0Var4.c;
        ya0 ya0Var3 = sz0Var4.f;
        if (ya0Var3 != null) {
            ya0Var3.z(sz0Var4.g);
        }
        sz0Var4.f = null;
        this.d.dismiss();
        this.d = null;
    }
}