package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;

/* renamed from: k10  reason: default package */
public final class k10 extends j10 {
    public final Button f0;
    public long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k10(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.g0 = -1L;
        Button button = (Button) L[0];
        this.f0 = button;
        button.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.g0 = 2L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.g0;
            this.g0 = 0L;
        }
        View.OnClickListener onClickListener = this.e0;
        if ((j & 3) != 0) {
            this.f0.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.g0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (1 == i) {
            this.e0 = (View.OnClickListener) obj;
            synchronized (this) {
                this.g0 |= 1;
            }
            G(1);
            O();
            return true;
        }
        return false;
    }
}