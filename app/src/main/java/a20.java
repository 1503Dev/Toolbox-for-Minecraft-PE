package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;

/* renamed from: a20  reason: default package */
public final class a20 extends z10 {
    public static final SparseIntArray i0;
    public final TextView g0;
    public long h0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        i0 = sparseIntArray;
        sparseIntArray.put(2131296575, 2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a20(View view, hj hjVar) {
        super(hjVar, view, (IndicatorSeekBar) r0[2]);
        Object[] L = ViewDataBinding.L(view, 3, i0);
        this.h0 = -1L;
        ((LinearLayout) L[0]).setTag(null);
        TextView textView = (TextView) L[1];
        this.g0 = textView;
        textView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.h0 = 2L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.h0;
            this.h0 = 0L;
        }
        it0 it0Var = this.f0;
        String str = null;
        long j2 = j & 3;
        if (j2 != 0 && it0Var != null) {
            str = it0Var.f(this.T.getContext());
        }
        if (j2 != 0) {
            qw0.c(this.g0, str);
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
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (it0) obj;
            synchronized (this) {
                this.h0 |= 1;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }
}