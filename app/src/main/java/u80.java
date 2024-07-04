package defpackage;

import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import defpackage.xb0;
import io.mrarm.mctoolbox.ui.c;
import io.mrarm.mctoolbox.ui.d;
import io.mrarm.mctoolbox.ui.e;
import io.mrarm.mctoolbox.ui.f;

/* renamed from: u80  reason: default package */
public final class u80 extends t80 implements xb0.a {
    public final Button f0;
    public final xb0 g0;
    public long h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(View view, hj hjVar) {
        super(0, view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.h0 = -1L;
        Button button = (Button) L[0];
        this.f0 = button;
        button.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.g0 = new xb0(this, 1);
        synchronized (this) {
            this.h0 = 2L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.h0;
            this.h0 = 0L;
        }
        if ((j & 2) != 0) {
            this.f0.setOnClickListener(this.g0);
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
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (17 == i) {
            this.e0 = (e) obj;
            synchronized (this) {
                this.h0 |= 1;
            }
            G(17);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        tv0 tv0Var;
        ze zeVar;
        e eVar = (e) this.e0;
        boolean z2 = false;
        if (eVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e.a aVar = eVar.f;
            if (aVar != null) {
                z2 = true;
            }
            if (z2) {
                f fVar = (f) aVar;
                c.d dVar = ((d) fVar.c).s;
                String str = null;
                if (dVar != null) {
                    tv0Var = dVar.b();
                } else {
                    tv0Var = null;
                }
                if (!(tv0Var instanceof ze)) {
                    zeVar = null;
                } else {
                    zeVar = (ze) tv0Var;
                }
                if (zeVar != null) {
                    str = zeVar.v(512);
                }
                new o70(fVar.d, fVar.e, null, str, false).show();
            }
        }
    }
}