package defpackage;

import android.view.View;
import androidx.databinding.ViewDataBinding;

/* renamed from: hl  reason: default package */
public final class hl extends gl {
    public final View e0;
    public long f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hl(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.f0 = -1L;
        View view2 = (View) L[0];
        this.e0 = view2;
        view2.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.f0 = 1L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        synchronized (this) {
            this.f0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.f0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        return true;
    }
}