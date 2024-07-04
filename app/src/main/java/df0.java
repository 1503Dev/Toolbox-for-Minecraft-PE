package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import defpackage.bf0;
import defpackage.xb0;

/* renamed from: df0  reason: default package */
public final class df0 extends cf0 implements xb0.a {
    public final AppCompatTextView g0;
    public final xb0 h0;
    public long i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df0(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.i0 = -1L;
        AppCompatTextView appCompatTextView = (AppCompatTextView) L[0];
        this.g0 = appCompatTextView;
        appCompatTextView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.h0 = new xb0(this, 1);
        synchronized (this) {
            this.i0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.i0;
            this.i0 = 0L;
        }
        String str = null;
        bf0.c cVar = this.e0;
        long j2 = 5 & j;
        if (j2 != 0 && cVar != null) {
            str = cVar.a;
        }
        if (j2 != 0) {
            qw0.c(this.g0, str);
        }
        if ((j & 4) != 0) {
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
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.e0 = (bf0.c) obj;
            synchronized (this) {
                this.i0 |= 1;
            }
            G(35);
            O();
        } else if (9 == i) {
            this.f0 = (bf0.b) obj;
            synchronized (this) {
                this.i0 |= 2;
            }
            G(9);
            O();
        } else {
            return false;
        }
        return true;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        bf0.c cVar = this.e0;
        bf0.b bVar = this.f0;
        if (bVar != null) {
            if (cVar != null) {
                bVar.a(cVar.b);
            }
        }
    }
}