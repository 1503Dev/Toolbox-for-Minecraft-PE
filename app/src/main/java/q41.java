package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: q41  reason: default package */
public class q41<V extends View> extends CoordinatorLayout.c<V> {
    public r41 a;
    public int b;

    public q41() {
        this.b = 0;
    }

    public q41(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean g(CoordinatorLayout coordinatorLayout, V v, int i) {
        u(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new r41(v);
        }
        r41 r41Var = this.a;
        r41Var.b = r41Var.a.getTop();
        r41Var.c = r41Var.a.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 != 0) {
            r41 r41Var2 = this.a;
            if (r41Var2.d != i2) {
                r41Var2.d = i2;
                r41Var2.a();
            }
            this.b = 0;
            return true;
        }
        return true;
    }

    public final int t() {
        r41 r41Var = this.a;
        if (r41Var != null) {
            return r41Var.d;
        }
        return 0;
    }

    public void u(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.q(v, i);
    }
}