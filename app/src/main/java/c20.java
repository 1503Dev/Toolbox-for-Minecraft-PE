package defpackage;

import android.view.View;
import android.widget.EditText;
import androidx.databinding.ViewDataBinding;

/* renamed from: c20  reason: default package */
public final class c20 extends lc {
    public a g0;
    public long h0;

    /* renamed from: c20$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean z;
            String a = qw0.a((EditText) c20.this.e0);
            nw0 nw0Var = (nw0) c20.this.f0;
            boolean z2 = false;
            if (nw0Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                za0<String> za0Var = nw0Var.k;
                if (za0Var != null) {
                    z2 = true;
                }
                if (z2) {
                    za0Var.H(a);
                }
            }
        }
    }

    public c20(View view, hj hjVar) {
        super(hjVar, view, 1, (EditText) ViewDataBinding.L(view, 1, null)[0]);
        this.g0 = new a();
        this.h0 = -1L;
        ((EditText) this.e0).setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.h0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        za0<String> za0Var;
        synchronized (this) {
            j = this.h0;
            this.h0 = 0L;
        }
        nw0 nw0Var = (nw0) this.f0;
        long j2 = 7 & j;
        String str = null;
        if (j2 != 0) {
            if (nw0Var != null) {
                za0Var = nw0Var.k;
            } else {
                za0Var = null;
            }
            Q(0, za0Var);
            if (za0Var != null) {
                str = za0Var.Q;
            }
        }
        if (j2 != 0) {
            qw0.c((EditText) this.e0, str);
        }
        if ((j & 4) != 0) {
            qw0.d((EditText) this.e0, this.g0);
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
        if (i != 0) {
            return false;
        }
        za0 za0Var = (za0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.h0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (nw0) obj;
            synchronized (this) {
                this.h0 |= 2;
            }
            G(35);
            O();
            return true;
        }
        return false;
    }
}