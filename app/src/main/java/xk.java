package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import io.mrarm.mctoolbox.ui.view.ColorAlphaPicker;
import io.mrarm.mctoolbox.ui.view.ColorHuePicker;
import io.mrarm.mctoolbox.ui.view.ColorPicker;

/* renamed from: xk  reason: default package */
public final class xk extends wk {
    public static final SparseIntArray t0;
    public final Button r0;
    public long s0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        t0 = sparseIntArray;
        sparseIntArray.put(2131296427, 3);
        sparseIntArray.put(2131296664, 4);
        sparseIntArray.put(2131296665, 5);
        sparseIntArray.put(2131296663, 6);
        sparseIntArray.put(2131296662, 7);
        sparseIntArray.put(2131296661, 8);
        sparseIntArray.put(2131296528, 9);
        sparseIntArray.put(2131296432, 10);
        sparseIntArray.put(2131296323, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xk(View view, hj hjVar) {
        super(hjVar, view, r4, r5, r6, (ColorHuePicker) r15[10], (ColorPicker) r15[9], (TextInputEditText) r15[8], (TextInputEditText) r15[7], (TextInputEditText) r15[6], (TextInputEditText) r15[4], (TextInputEditText) r15[5]);
        Object[] L = ViewDataBinding.L(view, 12, t0);
        ColorAlphaPicker colorAlphaPicker = (ColorAlphaPicker) L[11];
        ImageButton imageButton = (ImageButton) L[1];
        LinearLayout linearLayout = (LinearLayout) L[0];
        LinearLayout linearLayout2 = (LinearLayout) L[3];
        this.s0 = -1L;
        this.f0.setTag(null);
        this.g0.setTag(null);
        Button button = (Button) L[2];
        this.r0 = button;
        button.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.s0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.s0;
            this.s0 = 0L;
        }
        View.OnClickListener onClickListener = this.o0;
        View.OnClickListener onClickListener2 = this.p0;
        long j2 = 5 & j;
        long j3 = j & 6;
        if (j2 != 0) {
            this.f0.setOnClickListener(onClickListener);
        }
        if (j3 != 0) {
            this.r0.setOnClickListener(onClickListener2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.s0 != 0;
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
        } else if (23 != i) {
            return false;
        } else {
            S((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // defpackage.wk
    public final void R(View.OnClickListener onClickListener) {
        this.o0 = onClickListener;
        synchronized (this) {
            this.s0 |= 1;
        }
        G(12);
        O();
    }

    @Override // defpackage.wk
    public final void S(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        synchronized (this) {
            this.s0 |= 2;
        }
        G(23);
        O();
    }
}