package defpackage;

import android.view.View;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import defpackage.vw;
import defpackage.xb0;

/* renamed from: x21  reason: default package */
public final class x21 extends w21 implements xb0.a {
    public final ImageView g0;
    public final xb0 h0;
    public long i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x21(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.i0 = -1L;
        ImageView imageView = (ImageView) L[0];
        this.g0 = imageView;
        imageView.setTag(null);
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
        int i = this.e0;
        if ((5 & j) != 0) {
            this.g0.setImageResource(i);
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
        if (31 == i) {
            this.e0 = ((Integer) obj).intValue();
            synchronized (this) {
                this.i0 |= 1;
            }
            G(31);
            O();
        } else if (36 == i) {
            this.f0 = (vw.a) obj;
            synchronized (this) {
                this.i0 |= 2;
            }
            G(36);
            O();
        } else {
            return false;
        }
        return true;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        int i2 = this.e0;
        vw.a aVar = this.f0;
        if (aVar != null) {
            aVar.a(i2);
        }
    }
}