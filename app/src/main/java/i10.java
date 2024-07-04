package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.xb0;

/* renamed from: i10  reason: default package */
public final class i10 extends lc implements xb0.a {
    public static final SparseIntArray k0;
    public final LinearLayout g0;
    public final TextView h0;
    public final xb0 i0;
    public long j0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        k0 = sparseIntArray;
        sparseIntArray.put(2131296642, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i10(View view, hj hjVar) {
        super(hjVar, view, 0, (ImageView) r0[2]);
        Object[] L = ViewDataBinding.L(view, 3, k0);
        this.j0 = -1L;
        LinearLayout linearLayout = (LinearLayout) L[0];
        this.g0 = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) L[1];
        this.h0 = textView;
        textView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.i0 = new xb0(this, 1);
        synchronized (this) {
            this.j0 = 2L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.j0;
            this.j0 = 0L;
        }
        g1 g1Var = (g1) this.f0;
        String str = null;
        long j2 = 3 & j;
        if (j2 != 0 && g1Var != null) {
            str = g1Var.f(this.T.getContext());
        }
        if ((j & 2) != 0) {
            this.g0.setOnClickListener(this.i0);
        }
        if (j2 != 0) {
            qw0.c(this.h0, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.j0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (g1) obj;
            synchronized (this) {
                this.j0 |= 1;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        g1 g1Var = (g1) this.f0;
        if (g1Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g1Var.l.a(g1Var.f);
        }
    }
}