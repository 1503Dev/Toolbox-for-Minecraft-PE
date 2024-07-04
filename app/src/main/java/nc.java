package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.xb0;

/* renamed from: nc  reason: default package */
public final class nc extends lc implements xb0.a {
    public final TextView g0;
    public final xb0 h0;
    public long i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc(View view, hj hjVar) {
        super(1, view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.i0 = -1L;
        TextView textView = (TextView) L[0];
        this.g0 = textView;
        textView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.h0 = new xb0(this, 1);
        synchronized (this) {
            this.i0 = 8L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        Drawable drawable;
        float f;
        String str;
        String str2;
        za0<vv> za0Var;
        vv vvVar;
        float f2;
        long j2;
        int i;
        synchronized (this) {
            j = this.i0;
            this.i0 = 0L;
        }
        vv vvVar2 = (vv) this.e0;
        kc kcVar = (kc) this.f0;
        long j3 = j & 15;
        boolean z = false;
        if (j3 != 0) {
            if ((j & 10) != 0) {
                if (vvVar2 != null) {
                    int e = vvVar2.e();
                    str2 = vvVar2.g(this.T.getContext());
                    i = e;
                } else {
                    str2 = null;
                    i = 0;
                }
                drawable = this.T.getContext().getResources().getDrawable(i);
            } else {
                drawable = null;
                str2 = null;
            }
            if (kcVar != null) {
                za0Var = kcVar.f;
            } else {
                za0Var = null;
            }
            Q(0, za0Var);
            if (za0Var != null) {
                vvVar = za0Var.Q;
            } else {
                vvVar = null;
            }
            if (vvVar == vvVar2) {
                z = true;
            }
            if (j3 != 0) {
                if (z) {
                    j2 = 32;
                } else {
                    j2 = 16;
                }
                j |= j2;
            }
            if (z) {
                f2 = this.g0.getResources().getDimension(2131165273);
            } else {
                f2 = 0.0f;
            }
            str = str2;
            f = f2;
        } else {
            drawable = null;
            f = 0.0f;
            str = null;
        }
        if ((j & 10) != 0) {
            qw0.c(this.g0, str);
            qw0.b(this.g0, drawable);
        }
        if ((15 & j) != 0) {
            this.g0.setSelected(z);
            if (ViewDataBinding.Z >= 21) {
                mc.a(this.g0, f);
            }
        }
        if ((j & 8) != 0) {
            this.g0.setOnClickListener(this.h0);
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
        za0 za0Var = (za0) obj;
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
        if (13 == i) {
            this.e0 = (vv) obj;
            synchronized (this) {
                this.i0 |= 2;
            }
            G(13);
            O();
        } else if (8 == i) {
            this.f0 = (kc) obj;
            synchronized (this) {
                this.i0 |= 4;
            }
            G(8);
            O();
        } else {
            return false;
        }
        return true;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        vv vvVar = (vv) this.e0;
        kc kcVar = (kc) this.f0;
        if (kcVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            uy0 uy0Var = (uy0) kcVar.g;
            Context context = uy0Var.a;
            g21 g21Var = uy0Var.b;
            za0 za0Var = uy0Var.c;
            if (vvVar instanceof wr0) {
                new yr0(context, g21Var, ((wr0) vvVar).b).show();
            } else {
                za0Var.H(vvVar);
            }
        }
    }
}