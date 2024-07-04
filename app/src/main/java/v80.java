package defpackage;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.ViewDataBinding;
import defpackage.ec0;
import defpackage.xb0;
import io.mrarm.mctoolbox.ui.d;
import io.mrarm.mctoolbox.ui.e;
import io.mrarm.mctoolbox.ui.f;
import java.io.IOException;

/* renamed from: v80  reason: default package */
public final class v80 extends lc implements ec0.a, xb0.a {
    public final TextView g0;
    public final ec0 h0;
    public final xb0 i0;
    public long j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v80(View view, hj hjVar) {
        super(0, view, hjVar);
        Object[] L = ViewDataBinding.L(view, 1, null);
        this.j0 = -1L;
        TextView textView = (TextView) L[0];
        this.g0 = textView;
        textView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.h0 = new ec0(this, 2);
        this.i0 = new xb0(this, 1);
        synchronized (this) {
            this.j0 = 4L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        synchronized (this) {
            j = this.j0;
            this.j0 = 0L;
        }
        String str = (String) this.e0;
        if ((5 & j) != 0) {
            qw0.c(this.g0, str);
        }
        if ((j & 4) != 0) {
            this.g0.setOnClickListener(this.i0);
            this.g0.setOnLongClickListener(this.h0);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.j0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (38 == i) {
            this.e0 = (String) obj;
            synchronized (this) {
                this.j0 |= 1;
            }
            G(38);
            O();
        } else if (17 == i) {
            this.f0 = (e) obj;
            synchronized (this) {
                this.j0 |= 2;
            }
            G(17);
            O();
        } else {
            return false;
        }
        return true;
    }

    @Override // defpackage.ec0.a
    public final boolean c(View view) {
        boolean z;
        boolean z2;
        String str = (String) this.e0;
        e eVar = (e) this.f0;
        if (eVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e.a aVar = eVar.f;
            if (aVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f fVar = (f) aVar;
                fVar.getClass();
                try {
                    new o70(fVar.d, fVar.e, str, fVar.e.c(str), true).show();
                    return true;
                } catch (IOException unused) {
                    Toast.makeText(fVar.d, 2131755103, 0).show();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        Toast makeText;
        String str = (String) this.e0;
        e eVar = (e) this.f0;
        boolean z2 = true;
        if (eVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            e.a aVar = eVar.f;
            if (aVar == null) {
                z2 = false;
            }
            if (z2) {
                f fVar = (f) aVar;
                fVar.getClass();
                try {
                    ((d) fVar.c).j(m60.b(fVar.e.c(str)));
                } catch (IOException unused) {
                    makeText = Toast.makeText(fVar.d, 2131755103, 0);
                    makeText.show();
                } catch (l60 e) {
                    makeText = Toast.makeText(fVar.d, e.getMessage(), 0);
                    makeText.show();
                }
            }
        }
    }
}