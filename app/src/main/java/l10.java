package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.xb0;

/* renamed from: l10  reason: default package */
public final class l10 extends lc implements xb0.a {
    public final LinearLayout g0;
    public final TextView h0;
    public final xb0 i0;
    public long j0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l10(View view, hj hjVar) {
        super(hjVar, view, 1, (ImageView) r0[2]);
        Object[] L = ViewDataBinding.L(view, 3, null);
        this.j0 = -1L;
        LinearLayout linearLayout = (LinearLayout) L[0];
        this.g0 = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) L[1];
        this.h0 = textView;
        textView.setTag(null);
        ((ImageView) this.e0).setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.i0 = new xb0(this, 1);
        synchronized (this) {
            this.j0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        String str;
        synchronized (this) {
            j = this.j0;
            this.j0 = 0L;
        }
        pd pdVar = (pd) this.f0;
        long j2 = 7 & j;
        int i = 0;
        String str2 = null;
        bb0 bb0Var = null;
        if (j2 != 0) {
            if ((j & 6) != 0 && pdVar != null) {
                str = pdVar.f(this.T.getContext());
            } else {
                str = null;
            }
            if (pdVar != null) {
                bb0Var = pdVar.k;
            }
            Q(0, bb0Var);
            if (bb0Var != null) {
                i = bb0Var.H();
            }
            str2 = str;
        }
        if ((4 & j) != 0) {
            this.g0.setOnClickListener(this.i0);
        }
        if ((j & 6) != 0) {
            qw0.c(this.h0, str2);
        }
        if (j2 != 0) {
            cx.a((ImageView) this.e0, ColorStateList.valueOf(i));
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
        if (i != 0) {
            return false;
        }
        bb0 bb0Var = (bb0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.j0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (pd) obj;
            synchronized (this) {
                this.j0 |= 2;
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
        pd pdVar = (pd) this.f0;
        if (pdVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Context context = this.T.getContext();
            pdVar.getClass();
            zd zdVar = new zd(context, pdVar.k.Q);
            zdVar.U = new fy0(pdVar);
            zdVar.show();
        }
    }
}