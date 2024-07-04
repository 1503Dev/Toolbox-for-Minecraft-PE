package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;

/* renamed from: gs0  reason: default package */
public final class gs0 extends fs0 {
    public static final SparseIntArray m0;
    public long l0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        m0 = sparseIntArray;
        sparseIntArray.put(2131296465, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gs0(View view, hj hjVar) {
        super(hjVar, view, (ImageView) r0[1], (TextView) r0[2], (ImageView) r0[4], (TextView) r0[3]);
        Object[] L = ViewDataBinding.L(view, 5, m0);
        this.l0 = -1L;
        this.e0.setTag(null);
        this.f0.setTag(null);
        ((RelativeLayout) L[0]).setTag(null);
        this.h0.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.l0 = 4L;
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        int i;
        int i2;
        long j2;
        synchronized (this) {
            j = this.l0;
            this.l0 = 0L;
        }
        String str = this.i0;
        String str2 = this.j0;
        long j3 = j & 5;
        int i3 = 0;
        if (j3 != 0) {
            boolean z = str == null;
            boolean z2 = str != null;
            if (j3 != 0) {
                j |= z ? 16L : 8L;
            }
            if ((j & 5) != 0) {
                j |= z2 ? 256L : 128L;
            }
            i = z ? 0 : 8;
            if (!z2) {
                i2 = 8;
                j2 = j & 6;
                if (j2 != 0) {
                    boolean z3 = str2 != null;
                    if (j2 != 0) {
                        j |= z3 ? 64L : 32L;
                    }
                    i3 = z3 ? 0 : 8;
                }
                if ((5 & j) != 0) {
                    this.e0.setVisibility(i);
                    this.f0.setVisibility(i2);
                    qw0.c(this.f0, str);
                }
                if ((j & 6) == 0) {
                    this.h0.setVisibility(i3);
                    qw0.c(this.h0, str2);
                    return;
                }
                return;
            }
        } else {
            i = 0;
        }
        i2 = 0;
        j2 = j & 6;
        if (j2 != 0) {
        }
        if ((5 & j) != 0) {
        }
        if ((j & 6) == 0) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.l0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (15 == i) {
            R((String) obj);
        } else if (42 != i) {
            return false;
        } else {
            S((String) obj);
        }
        return true;
    }

    @Override // defpackage.fs0
    public final void R(String str) {
        this.i0 = str;
        synchronized (this) {
            this.l0 |= 1;
        }
        G(15);
        O();
    }

    @Override // defpackage.fs0
    public final void S(String str) {
        this.j0 = str;
        synchronized (this) {
            this.l0 |= 2;
        }
        G(42);
        O();
    }
}