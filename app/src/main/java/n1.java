package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.xb0;

/* renamed from: n1  reason: default package */
public final class n1 extends m1 implements xb0.a {
    public final TextView k0;
    public final TextView l0;
    public final Button m0;
    public final Button n0;
    public final xb0 o0;
    public final xb0 p0;
    public long q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 5, null);
        this.q0 = -1L;
        ((RelativeLayout) L[0]).setTag(null);
        TextView textView = (TextView) L[1];
        this.k0 = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) L[2];
        this.l0 = textView2;
        textView2.setTag(null);
        Button button = (Button) L[3];
        this.m0 = button;
        button.setTag(null);
        Button button2 = (Button) L[4];
        this.n0 = button2;
        button2.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.o0 = new xb0(this, 1);
        this.p0 = new xb0(this, 2);
        synchronized (this) {
            this.q0 = 64L;
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        int i;
        long j2;
        synchronized (this) {
            j = this.q0;
            this.q0 = 0L;
        }
        CharSequence charSequence = this.f0;
        boolean z = this.g0;
        boolean z2 = this.h0;
        int i2 = this.e0;
        long j3 = j & 66;
        int i3 = 0;
        if (j3 != 0) {
            if (j3 != 0) {
                j |= z ? 256L : 128L;
            }
            if (!z) {
                i = 8;
                j2 = j & 68;
                if (j2 != 0) {
                    if (j2 != 0) {
                        j |= z2 ? 1024L : 512L;
                    }
                    i3 = z2 ? 0 : 8;
                }
                if ((96 & j) != 0) {
                    this.k0.setText(i2);
                }
                if ((65 & j) != 0) {
                    qw0.c(this.l0, charSequence);
                }
                if ((j & 66) != 0) {
                    this.m0.setVisibility(i);
                }
                if ((64 & j) != 0) {
                    this.m0.setOnClickListener(this.o0);
                    this.n0.setOnClickListener(this.p0);
                }
                if ((j & 68) == 0) {
                    this.n0.setVisibility(i3);
                    return;
                }
                return;
            }
        }
        i = 0;
        j2 = j & 68;
        if (j2 != 0) {
        }
        if ((96 & j) != 0) {
        }
        if ((65 & j) != 0) {
        }
        if ((j & 66) != 0) {
        }
        if ((64 & j) != 0) {
        }
        if ((j & 68) == 0) {
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
        if (28 == i) {
            T((CharSequence) obj);
        } else if (10 == i) {
            R(((Boolean) obj).booleanValue());
        } else if (11 == i) {
            S(((Boolean) obj).booleanValue());
        } else if (40 == i) {
            V((Runnable) obj);
        } else if (41 == i) {
            W((Runnable) obj);
        } else if (29 != i) {
            return false;
        } else {
            U(((Integer) obj).intValue());
        }
        return true;
    }

    @Override // defpackage.m1
    public final void R(boolean z) {
        this.g0 = z;
        synchronized (this) {
            this.q0 |= 2;
        }
        G(10);
        O();
    }

    @Override // defpackage.m1
    public final void S(boolean z) {
        this.h0 = z;
        synchronized (this) {
            this.q0 |= 4;
        }
        G(11);
        O();
    }

    @Override // defpackage.m1
    public final void T(CharSequence charSequence) {
        this.f0 = charSequence;
        synchronized (this) {
            this.q0 |= 1;
        }
        G(28);
        O();
    }

    @Override // defpackage.m1
    public final void U(int i) {
        this.e0 = i;
        synchronized (this) {
            this.q0 |= 32;
        }
        G(29);
        O();
    }

    @Override // defpackage.m1
    public final void V(Runnable runnable) {
        this.i0 = runnable;
        synchronized (this) {
            this.q0 |= 8;
        }
        G(40);
        O();
    }

    @Override // defpackage.m1
    public final void W(Runnable runnable) {
        this.j0 = runnable;
        synchronized (this) {
            this.q0 |= 16;
        }
        G(41);
        O();
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        Runnable runnable;
        if (i == 1) {
            runnable = this.i0;
            if (!(runnable != null)) {
                return;
            }
        } else if (i != 2) {
            return;
        } else {
            runnable = this.j0;
            if (!(runnable != null)) {
                return;
            }
        }
        runnable.run();
    }
}