package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.wb0;
import io.mrarm.mctoolbox.ui.view.SwitchNoGlitch;

/* renamed from: e20  reason: default package */
public final class e20 extends d20 implements wb0.a {
    public final TextView g0;
    public final wb0 h0;
    public long i0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e20(View view, hj hjVar) {
        super(hjVar, view, 1, (SwitchNoGlitch) r0[2]);
        Object[] L = ViewDataBinding.L(view, 3, null);
        this.i0 = -1L;
        ((LinearLayout) L[0]).setTag(null);
        TextView textView = (TextView) L[1];
        this.g0 = textView;
        textView.setTag(null);
        this.e0.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.h0 = new wb0(this);
        synchronized (this) {
            this.i0 = 4L;
        }
        O();
    }

    @Override // defpackage.wb0.a
    public final void C(CompoundButton compoundButton, boolean z) {
        px0 px0Var = this.f0;
        if (px0Var != null) {
            px0Var.m(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        String str;
        ya0 ya0Var;
        synchronized (this) {
            j = this.i0;
            this.i0 = 0L;
        }
        px0 px0Var = this.f0;
        long j2 = 7 & j;
        boolean z = false;
        if (j2 != 0) {
            if (px0Var != null) {
                ya0Var = px0Var.k;
            } else {
                ya0Var = null;
            }
            Q(0, ya0Var);
            if (ya0Var != null) {
                z = ya0Var.Q;
            }
            if ((j & 6) != 0 && px0Var != null) {
                str = px0Var.f(this.T.getContext());
                if ((6 & j) != 0) {
                    qw0.c(this.g0, str);
                }
                if (j2 != 0) {
                    we.a(this.e0, z);
                }
                if ((j & 4) == 0) {
                    we.b(this.e0, this.h0, null);
                    return;
                }
                return;
            }
        }
        str = null;
        if ((6 & j) != 0) {
        }
        if (j2 != 0) {
        }
        if ((j & 4) == 0) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.i0 != 0;
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
                this.i0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (px0) obj;
            synchronized (this) {
                this.i0 |= 2;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }
}