package defpackage;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import io.mrarm.mctoolbox.ui.view.AutoClearErrorTextInputLayout;

/* renamed from: ql  reason: default package */
public final class ql extends pl {
    public static final SparseIntArray r0;
    public final Button o0;
    public final Button p0;
    public long q0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        r0 = sparseIntArray;
        sparseIntArray.put(2131296427, 5);
        sparseIntArray.put(2131296532, 6);
        sparseIntArray.put(2131296531, 7);
        sparseIntArray.put(2131296534, 8);
        sparseIntArray.put(2131296533, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ql(View view, hj hjVar) {
        super(hjVar, view, r5, (TextInputEditText) r0[7], (AutoClearErrorTextInputLayout) r0[6], (TextInputEditText) r0[9], (AutoClearErrorTextInputLayout) r0[8], (TextView) r0[2]);
        Object[] L = ViewDataBinding.L(view, 10, r0);
        ImageButton imageButton = (ImageButton) L[1];
        LinearLayout linearLayout = (LinearLayout) L[5];
        this.q0 = -1L;
        this.e0.setTag(null);
        ((LinearLayout) L[0]).setTag(null);
        Button button = (Button) L[3];
        this.o0 = button;
        button.setTag(null);
        Button button2 = (Button) L[4];
        this.p0 = button2;
        button2.setTag(null);
        this.j0.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.q0 = 16L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        Resources resources;
        int i;
        synchronized (this) {
            j = this.q0;
            this.q0 = 0L;
        }
        String str = null;
        View.OnClickListener onClickListener = this.n0;
        View.OnClickListener onClickListener2 = this.l0;
        View.OnClickListener onClickListener3 = this.m0;
        boolean z = this.k0;
        long j2 = j & 17;
        int i2 = 0;
        if (j2 != 0) {
            boolean z2 = onClickListener != null;
            if (j2 != 0) {
                j |= z2 ? 256L : 128L;
            }
            if (!z2) {
                i2 = 8;
            }
        }
        long j3 = j & 24;
        if (j3 != 0) {
            boolean z3 = !z;
            if (j3 != 0) {
                j |= z3 ? 64L : 32L;
            }
            if (z3) {
                resources = this.j0.getResources();
                i = 2131755178;
            } else {
                resources = this.j0.getResources();
                i = 2131755179;
            }
            str = resources.getString(i);
        }
        if ((j & 18) != 0) {
            this.e0.setOnClickListener(onClickListener2);
        }
        if ((j & 20) != 0) {
            this.o0.setOnClickListener(onClickListener3);
        }
        if ((j & 17) != 0) {
            this.p0.setVisibility(i2);
            this.p0.setOnClickListener(onClickListener);
        }
        if ((j & 24) != 0) {
            qw0.c(this.j0, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.q0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (21 == i) {
            S((View.OnClickListener) obj);
        } else if (12 == i) {
            R((View.OnClickListener) obj);
        } else if (23 == i) {
            T((View.OnClickListener) obj);
        } else if (34 != i) {
            return false;
        } else {
            U(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // defpackage.pl
    public final void R(View.OnClickListener onClickListener) {
        this.l0 = onClickListener;
        synchronized (this) {
            this.q0 |= 2;
        }
        G(12);
        O();
    }

    @Override // defpackage.pl
    public final void S(View.OnClickListener onClickListener) {
        this.n0 = onClickListener;
        synchronized (this) {
            this.q0 |= 1;
        }
        G(21);
        O();
    }

    @Override // defpackage.pl
    public final void T(View.OnClickListener onClickListener) {
        this.m0 = onClickListener;
        synchronized (this) {
            this.q0 |= 4;
        }
        G(23);
        O();
    }

    @Override // defpackage.pl
    public final void U(boolean z) {
        this.k0 = z;
        synchronized (this) {
            this.q0 |= 8;
        }
        G(34);
        O();
    }
}