package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import defpackage.xb0;

/* renamed from: ux0  reason: default package */
public final class ux0 extends t80 implements xb0.a {
    public final ImageView f0;
    public final xb0 g0;
    public long h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux0(View view, hj hjVar) {
        super(1, view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.h0 = -1L;
        ImageView imageView = (ImageView) L[0];
        this.f0 = imageView;
        imageView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.g0 = new xb0(this, 1);
        synchronized (this) {
            this.h0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        int i;
        synchronized (this) {
            j = this.h0;
            this.h0 = 0L;
        }
        lw lwVar = (lw) this.e0;
        ya0 ya0Var = null;
        long j2 = 7 & j;
        boolean z = false;
        if (j2 != 0) {
            if ((j & 6) != 0 && lwVar != null) {
                i = lwVar.c(this.T.getContext());
            } else {
                i = 0;
            }
            if (lwVar != null) {
                ya0Var = lwVar.a();
            }
            Q(0, ya0Var);
            if (ya0Var != null) {
                z = ya0Var.Q;
            }
        } else {
            i = 0;
        }
        if ((6 & j) != 0) {
            this.f0.setImageResource(i);
        }
        if ((j & 4) != 0) {
            this.f0.setOnClickListener(this.g0);
        }
        if (j2 != 0) {
            this.f0.setSelected(z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.h0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.h0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.e0 = (lw) obj;
            synchronized (this) {
                this.h0 |= 2;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        lw lwVar = (lw) this.e0;
        if (lwVar != null) {
            lwVar.d();
        }
    }
}