package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: bl  reason: default package */
public final class bl extends al {
    public static final SparseIntArray k0;
    public final Button i0;
    public long j0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        k0 = sparseIntArray;
        sparseIntArray.put(2131296427, 3);
        sparseIntArray.put(2131296639, 4);
        sparseIntArray.put(2131296450, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bl(View view, hj hjVar) {
        super(hjVar, view, (ImageButton) r0[1], (RecyclerView) r0[5]);
        Object[] L = ViewDataBinding.L(view, 6, k0);
        LinearLayout linearLayout = (LinearLayout) L[3];
        TextView textView = (TextView) L[4];
        this.j0 = -1L;
        this.e0.setTag(null);
        ((LinearLayout) L[0]).setTag(null);
        Button button = (Button) L[2];
        this.i0 = button;
        button.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.j0 = 4L;
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
        View.OnClickListener onClickListener = this.h0;
        View.OnClickListener onClickListener2 = this.g0;
        long j2 = 5 & j;
        if ((j & 6) != 0) {
            this.e0.setOnClickListener(onClickListener2);
        }
        if (j2 != 0) {
            this.i0.setOnClickListener(onClickListener);
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
        if (23 == i) {
            S((View.OnClickListener) obj);
        } else if (12 != i) {
            return false;
        } else {
            R((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // defpackage.al
    public final void R(View.OnClickListener onClickListener) {
        this.g0 = onClickListener;
        synchronized (this) {
            this.j0 |= 2;
        }
        G(12);
        O();
    }

    @Override // defpackage.al
    public final void S(View.OnClickListener onClickListener) {
        this.h0 = onClickListener;
        synchronized (this) {
            this.j0 |= 1;
        }
        G(23);
        O();
    }
}