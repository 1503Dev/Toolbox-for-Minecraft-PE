package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import defpackage.ec0;
import io.mrarm.mctoolbox.ui.b;
import io.mrarm.mctoolbox.ui.view.PopupCrashWorkaroundLinearLayout;

/* renamed from: z80  reason: default package */
public final class z80 extends y80 implements ec0.a {
    public final PopupCrashWorkaroundLinearLayout f0;
    public final ec0 g0;
    public long h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z80(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 2, null);
        this.h0 = -1L;
        ((LinearLayout) L[0]).setTag(null);
        PopupCrashWorkaroundLinearLayout popupCrashWorkaroundLinearLayout = (PopupCrashWorkaroundLinearLayout) L[1];
        this.f0 = popupCrashWorkaroundLinearLayout;
        popupCrashWorkaroundLinearLayout.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.g0 = new ec0(this, 1);
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
        b.a aVar = this.e0;
        long j2 = 3 & j;
        int i = 0;
        if (j2 != 0) {
            if (aVar != null) {
                i = aVar.c;
            }
            i = (int) (this.f0.getResources().getDimension(2131165505) + (this.f0.getResources().getDimension(2131165504) * i));
        }
        if (j2 != 0) {
            r31.a(this.f0, i);
        }
        if ((j & 2) != 0) {
            this.f0.setOnLongClickListener(this.g0);
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
        if (19 == i) {
            this.e0 = (b.a) obj;
            synchronized (this) {
                this.h0 |= 1;
            }
            G(19);
            O();
            return true;
        }
        return false;
    }

    @Override // defpackage.ec0.a
    public final boolean c(View view) {
        b.a aVar = this.e0;
        if (aVar != null) {
            aVar.a(view);
            return true;
        }
        return false;
    }
}