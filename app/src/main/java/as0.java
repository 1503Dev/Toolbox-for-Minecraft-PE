package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import defpackage.vr0;
import defpackage.xb0;

/* renamed from: as0  reason: default package */
public final class as0 extends zr0 implements xb0.a {
    public final LinearLayout g0;
    public final AppCompatTextView h0;
    public final xb0 i0;
    public a j0;
    public long k0;

    /* renamed from: as0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean isChecked = as0.this.e0.isChecked();
            vr0.a aVar = as0.this.f0;
            if (aVar != null) {
                ya0 ya0Var = aVar.c;
                if (ya0Var != null) {
                    ya0Var.H(isChecked);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public as0(View view, hj hjVar) {
        super(hjVar, view, (CheckBox) r0[2]);
        Object[] L = ViewDataBinding.L(view, 3, null);
        this.j0 = new a();
        this.k0 = -1L;
        this.e0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) L[0];
        this.g0 = linearLayout;
        linearLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) L[1];
        this.h0 = appCompatTextView;
        appCompatTextView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.i0 = new xb0(this, 1);
        synchronized (this) {
            this.k0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        boolean z;
        String str;
        boolean z2;
        Drawable drawable;
        int i;
        ya0 ya0Var;
        lw lwVar;
        synchronized (this) {
            j = this.k0;
            this.k0 = 0L;
        }
        vr0.a aVar = this.f0;
        int i2 = 0;
        if ((j & 7) != 0) {
            long j2 = j & 6;
            if (j2 != 0) {
                if (aVar != null) {
                    lwVar = aVar.a;
                } else {
                    lwVar = null;
                }
                if (lwVar != null) {
                    str = lwVar.e(this.T.getContext());
                    i = lwVar.c(this.T.getContext());
                } else {
                    str = null;
                    i = 0;
                }
                if (i != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (j2 != 0) {
                    j = z2 ? j | 16 : j | 8;
                }
            } else {
                str = null;
                i = 0;
                z2 = false;
            }
            if (aVar != null) {
                ya0Var = aVar.c;
            } else {
                ya0Var = null;
            }
            Q(0, ya0Var);
            if (ya0Var != null) {
                z = ya0Var.Q;
                i2 = i;
            } else {
                i2 = i;
                z = false;
            }
        } else {
            z = false;
            str = null;
            z2 = false;
        }
        if ((j & 16) != 0) {
            drawable = this.T.getContext().getResources().getDrawable(i2);
        } else {
            drawable = null;
        }
        long j3 = j & 6;
        drawable = (j3 == 0 || !z2) ? null : null;
        if ((7 & j) != 0) {
            we.a(this.e0, z);
        }
        if ((j & 4) != 0) {
            we.b(this.e0, null, this.j0);
            this.g0.setOnClickListener(this.i0);
        }
        if (j3 != 0) {
            qw0.c(this.h0, str);
            qw0.b(this.h0, drawable);
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
        if (i != 0) {
            return false;
        }
        ya0 ya0Var = (ya0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.k0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (19 == i) {
            this.f0 = (vr0.a) obj;
            synchronized (this) {
                this.k0 |= 2;
            }
            G(19);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        vr0.a aVar = this.f0;
        boolean z2 = false;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ya0 ya0Var = aVar.c;
            if (ya0Var != null) {
                z2 = true;
            }
            if (z2) {
                ya0Var.H(!ya0Var.Q);
            }
        }
    }
}