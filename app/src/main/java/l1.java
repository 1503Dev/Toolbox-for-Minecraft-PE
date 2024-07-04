package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* renamed from: l1  reason: default package */
public final class l1 extends k1 {
    public static final SparseIntArray l0;
    public long k0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        l0 = sparseIntArray;
        sparseIntArray.put(2131296388, 1);
        sparseIntArray.put(2131296419, 2);
        sparseIntArray.put(2131296455, 3);
        sparseIntArray.put(2131296543, 4);
        sparseIntArray.put(2131296406, 5);
        sparseIntArray.put(2131296454, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l1(View view, hj hjVar) {
        super(hjVar, view, (TextView) r0[1], (Button) r0[5], (TextView) r0[2], (Button) r0[6], (TextView) r0[3], (Button) r0[4]);
        Object[] L = ViewDataBinding.L(view, 7, l0);
        this.k0 = -1L;
        ((LinearLayout) L[0]).setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.k0 = 1L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        synchronized (this) {
            this.k0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.k0 != 0;
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