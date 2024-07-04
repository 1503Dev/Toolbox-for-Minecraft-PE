package defpackage;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.wb0;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.ui.view.SwitchNoGlitch;

/* renamed from: f20  reason: default package */
public final class f20 extends d20 implements wb0.a {
    public final TextView g0;
    public final wb0 h0;
    public long i0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f20(View view, hj hjVar) {
        super(hjVar, view, 0, (SwitchNoGlitch) r0[2]);
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
            this.i0 = 2L;
        }
        O();
    }

    @Override // defpackage.wb0.a
    public final void C(CompoundButton compoundButton, boolean z) {
        boolean z2;
        px0 px0Var = this.f0;
        if (px0Var != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            a aVar = px0Var.a;
            tv tvVar = px0Var.b;
            uv uvVar = px0Var.c;
            if (compoundButton.isChecked() != px0Var.l()) {
                new n21(compoundButton.getContext(), aVar, tvVar, uvVar, false).show();
                compoundButton.setChecked(px0Var.l());
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        boolean z;
        String str;
        synchronized (this) {
            j = this.i0;
            this.i0 = 0L;
        }
        px0 px0Var = this.f0;
        long j2 = 3 & j;
        if (j2 != 0 && px0Var != null) {
            str = px0Var.f(this.T.getContext());
            z = px0Var.l();
        } else {
            z = false;
            str = null;
        }
        if (j2 != 0) {
            qw0.c(this.g0, str);
            we.a(this.e0, z);
        }
        if ((j & 2) != 0) {
            we.b(this.e0, this.h0, null);
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
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (px0) obj;
            synchronized (this) {
                this.i0 |= 1;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }
}