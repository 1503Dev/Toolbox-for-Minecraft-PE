package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: ml  reason: default package */
public final class ml extends ll {
    public static final SparseIntArray n0;
    public final Button k0;
    public final TextInputLayout l0;
    public long m0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n0 = sparseIntArray;
        sparseIntArray.put(2131296427, 4);
        sparseIntArray.put(2131296639, 5);
        sparseIntArray.put(2131296614, 6);
        sparseIntArray.put(2131296655, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ml(View view, hj hjVar) {
        super(hjVar, view, r5, r6, (FlexboxLayout) r0[7]);
        Object[] L = ViewDataBinding.L(view, 8, n0);
        ImageButton imageButton = (ImageButton) L[1];
        LinearLayout linearLayout = (LinearLayout) L[4];
        TextInputEditText textInputEditText = (TextInputEditText) L[6];
        TextView textView = (TextView) L[5];
        this.m0 = -1L;
        this.e0.setTag(null);
        ((LinearLayout) L[0]).setTag(null);
        Button button = (Button) L[2];
        this.k0 = button;
        button.setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) L[3];
        this.l0 = textInputLayout;
        textInputLayout.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.m0 = 8L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.m0;
            this.m0 = 0L;
        }
        View.OnClickListener onClickListener = this.i0;
        boolean z = this.h0;
        View.OnClickListener onClickListener2 = this.j0;
        long j2 = j & 10;
        int i = 0;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= z ? 32L : 16L;
            }
            if (z) {
                i = 8;
            }
        }
        long j3 = 12 & j;
        if ((9 & j) != 0) {
            this.e0.setOnClickListener(onClickListener);
        }
        if (j3 != 0) {
            this.k0.setOnClickListener(onClickListener2);
        }
        if ((j & 10) != 0) {
            this.l0.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.m0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (12 == i) {
            R((View.OnClickListener) obj);
        } else if (22 == i) {
            S(((Boolean) obj).booleanValue());
        } else if (23 != i) {
            return false;
        } else {
            T((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // defpackage.ll
    public final void R(View.OnClickListener onClickListener) {
        this.i0 = onClickListener;
        synchronized (this) {
            this.m0 |= 1;
        }
        G(12);
        O();
    }

    @Override // defpackage.ll
    public final void S(boolean z) {
        this.h0 = z;
        synchronized (this) {
            this.m0 |= 2;
        }
        G(22);
        O();
    }

    @Override // defpackage.ll
    public final void T(View.OnClickListener onClickListener) {
        this.j0 = onClickListener;
        synchronized (this) {
            this.m0 |= 4;
        }
        G(23);
        O();
    }
}