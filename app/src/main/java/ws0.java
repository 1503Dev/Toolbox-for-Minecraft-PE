package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* renamed from: ws0  reason: default package */
public final class ws0 extends t80 {
    public final TextView f0;
    public long g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws0(View view, hj hjVar) {
        super(0, view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.g0 = -1L;
        TextView textView = (TextView) L[0];
        this.f0 = textView;
        textView.setTag(null);
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
        CharSequence charSequence = (CharSequence) this.e0;
        if ((j & 3) != 0) {
            qw0.c(this.f0, charSequence);
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
        if (44 == i) {
            this.e0 = (CharSequence) obj;
            synchronized (this) {
                this.g0 |= 1;
            }
            G(44);
            O();
            return true;
        }
        return false;
    }
}