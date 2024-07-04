package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.xb0;
import io.mrarm.mctoolbox.ui.view.PopupCrashWorkaroundImageButton;
import io.mrarm.mctoolbox.ui.view.WindowDragHandle;

/* renamed from: ol  reason: default package */
public final class ol extends nl implements xb0.a {
    public static final SparseIntArray u0;
    public final LinearLayout q0;
    public final xb0 r0;
    public final xb0 s0;
    public long t0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        u0 = sparseIntArray;
        sparseIntArray.put(2131296427, 4);
        sparseIntArray.put(2131296362, 5);
        sparseIntArray.put(2131296535, 6);
        sparseIntArray.put(2131296555, 7);
        sparseIntArray.put(2131296478, 8);
        sparseIntArray.put(2131296450, 9);
        sparseIntArray.put(2131296544, 10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ol(View view, hj hjVar) {
        super(hjVar, view, (ImageButton) r15[1], (ImageButton) r15[2], (ImageButton) r15[5], (LinearLayout) r15[0], (WindowDragHandle) r15[4], (RecyclerView) r15[9], (PopupCrashWorkaroundImageButton) r15[8], (ImageButton) r15[6], (WindowDragHandle) r15[10], (ImageButton) r15[7]);
        Object[] L = ViewDataBinding.L(view, 11, u0);
        this.t0 = -1L;
        this.e0.setTag(null);
        this.f0.setTag(null);
        this.h0.setTag(null);
        LinearLayout linearLayout = (LinearLayout) L[3];
        this.q0 = linearLayout;
        linearLayout.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.r0 = new xb0(this, 2);
        this.s0 = new xb0(this, 1);
        synchronized (this) {
            this.t0 = 4L;
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        boolean z;
        boolean z2;
        int i;
        long j2;
        int i2;
        long j3;
        synchronized (this) {
            j = this.t0;
            this.t0 = 0L;
        }
        bb0 bb0Var = this.o0;
        boolean z3 = this.p0;
        long j4 = j & 7;
        if (j4 != 0) {
            if (bb0Var != null) {
                i2 = bb0Var.H();
            } else {
                i2 = 0;
            }
            z = true;
            if ((j & 5) != 0 && i2 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 != 1) {
                z = false;
            }
            if (j4 != 0) {
                if (z) {
                    j3 = 64;
                } else {
                    j3 = 32;
                }
                j |= j3;
            }
        } else {
            z = false;
            z2 = false;
        }
        long j5 = j & 7;
        if (j5 != 0) {
            if (!z) {
                z3 = false;
            }
            if (j5 != 0) {
                if (z3) {
                    j2 = 16;
                } else {
                    j2 = 8;
                }
                j |= j2;
            }
            if (!z3) {
                i = 8;
                if ((j & 5) != 0) {
                    this.e0.setSelected(z2);
                    this.f0.setSelected(z);
                }
                if ((4 & j) != 0) {
                    this.e0.setOnClickListener(this.s0);
                    this.f0.setOnClickListener(this.r0);
                }
                if ((j & 7) == 0) {
                    this.q0.setVisibility(i);
                    return;
                }
                return;
            }
        }
        i = 0;
        if ((j & 5) != 0) {
        }
        if ((4 & j) != 0) {
        }
        if ((j & 7) == 0) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.t0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        bb0 bb0Var = (bb0) obj;
        if (i2 == 0) {
            synchronized (this) {
                this.t0 |= 1;
            }
            return true;
        }
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (37 == i) {
            R((bb0) obj);
        } else if (39 != i) {
            return false;
        } else {
            S(((Boolean) obj).booleanValue());
        }
        return true;
    }

    @Override // defpackage.nl
    public final void R(bb0 bb0Var) {
        Q(0, bb0Var);
        this.o0 = bb0Var;
        synchronized (this) {
            this.t0 |= 1;
        }
        G(37);
        O();
    }

    @Override // defpackage.nl
    public final void S(boolean z) {
        this.p0 = z;
        synchronized (this) {
            this.t0 |= 2;
        }
        G(39);
        O();
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        if (i != 1) {
            if (i == 2) {
                this.o0.I(1);
                return;
            }
            return;
        }
        this.o0.I(0);
    }
}