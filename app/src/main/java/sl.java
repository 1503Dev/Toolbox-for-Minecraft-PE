package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.warkiz.widget.IndicatorSeekBar;

/* renamed from: sl  reason: default package */
public final class sl extends rl {
    public static final SparseIntArray y0;
    public final Button t0;
    public a u0;
    public b v0;
    public c w0;
    public long x0;

    /* renamed from: sl$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean isChecked = sl.this.g0.isChecked();
            ya0 ya0Var = sl.this.r0;
            if (ya0Var != null) {
                ya0Var.H(isChecked);
            }
        }
    }

    /* renamed from: sl$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements jy {
        public b() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean isChecked = sl.this.k0.isChecked();
            ya0 ya0Var = sl.this.s0;
            if (ya0Var != null) {
                ya0Var.H(isChecked);
            }
        }
    }

    /* renamed from: sl$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements jy {
        public c() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean isChecked = sl.this.m0.isChecked();
            ya0 ya0Var = sl.this.q0;
            if (ya0Var != null) {
                ya0Var.H(isChecked);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        y0 = sparseIntArray;
        sparseIntArray.put(2131296427, 7);
        sparseIntArray.put(2131296639, 8);
        sparseIntArray.put(2131296340, 9);
        sparseIntArray.put(2131296424, 10);
        sparseIntArray.put(2131296420, 11);
        sparseIntArray.put(2131296516, 12);
        sparseIntArray.put(2131296654, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public sl(View view, hj hjVar) {
        super(hjVar, view, r4, r5, r6, r7, r8, r9, r10, r11, r12, (TextView) r15[13]);
        Object[] L = ViewDataBinding.L(view, 14, y0);
        ImageButton imageButton = (ImageButton) L[1];
        IndicatorSeekBar indicatorSeekBar = (IndicatorSeekBar) L[9];
        CheckBox checkBox = (CheckBox) L[4];
        Button button = (Button) L[6];
        Button button2 = (Button) L[11];
        Button button3 = (Button) L[10];
        LinearLayout linearLayout = (LinearLayout) L[7];
        CheckBox checkBox2 = (CheckBox) L[5];
        Button button4 = (Button) L[12];
        CheckBox checkBox3 = (CheckBox) L[3];
        TextView textView = (TextView) L[8];
        this.u0 = new a();
        this.v0 = new b();
        this.w0 = new c();
        this.x0 = -1L;
        this.e0.setTag(null);
        this.g0.setTag(null);
        this.h0.setTag(null);
        this.k0.setTag(null);
        ((LinearLayout) L[0]).setTag(null);
        Button button5 = (Button) L[2];
        this.t0 = button5;
        button5.setTag(null);
        this.m0.setTag(null);
        view.setTag(bi0.dataBinding, this);
        synchronized (this) {
            this.x0 = 32L;
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b6  */
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
        long j3;
        synchronized (this) {
            j = this.x0;
            this.x0 = 0L;
        }
        ya0 ya0Var = this.r0;
        ya0 ya0Var2 = this.s0;
        boolean z3 = this.o0;
        ya0 ya0Var3 = this.q0;
        View.OnClickListener onClickListener = this.p0;
        boolean z4 = false;
        if ((j & 33) != 0 && ya0Var != null) {
            z = ya0Var.Q;
        } else {
            z = false;
        }
        if ((j & 34) != 0 && ya0Var2 != null) {
            z2 = ya0Var2.Q;
        } else {
            z2 = false;
        }
        long j4 = j & 40;
        if (j4 != 0) {
            if (j4 != 0) {
                if (z3) {
                    j3 = 128;
                } else {
                    j3 = 64;
                }
                j |= j3;
            }
            if (!z3) {
                i = 8;
                j2 = j & 36;
                if (j2 != 0 && ya0Var3 != null) {
                    z4 = ya0Var3.Q;
                }
                if ((j & 48) != 0) {
                    this.e0.setOnClickListener(onClickListener);
                    this.t0.setOnClickListener(onClickListener);
                }
                if ((j & 33) != 0) {
                    we.a(this.g0, z);
                }
                if ((j & 40) != 0) {
                    this.g0.setVisibility(i);
                    this.h0.setVisibility(i);
                    this.k0.setVisibility(i);
                }
                if ((32 & j) != 0) {
                    we.b(this.g0, null, this.u0);
                    we.b(this.k0, null, this.v0);
                    we.b(this.m0, null, this.w0);
                }
                if ((j & 34) != 0) {
                    we.a(this.k0, z2);
                }
                if (j2 == 0) {
                    we.a(this.m0, z4);
                    return;
                }
                return;
            }
        }
        i = 0;
        j2 = j & 36;
        if (j2 != 0) {
            z4 = ya0Var3.Q;
        }
        if ((j & 48) != 0) {
        }
        if ((j & 33) != 0) {
        }
        if ((j & 40) != 0) {
        }
        if ((32 & j) != 0) {
        }
        if ((j & 34) != 0) {
        }
        if (j2 == 0) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.x0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                ya0 ya0Var = (ya0) obj;
                if (i2 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.x0 |= 4;
                }
                return true;
            }
            ya0 ya0Var2 = (ya0) obj;
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.x0 |= 2;
            }
            return true;
        }
        ya0 ya0Var3 = (ya0) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.x0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (24 == i) {
            T((ya0) obj);
        } else if (25 == i) {
            U((ya0) obj);
        } else if (20 == i) {
            R(((Boolean) obj).booleanValue());
        } else if (26 == i) {
            V((ya0) obj);
        } else if (23 != i) {
            return false;
        } else {
            S((View.OnClickListener) obj);
        }
        return true;
    }

    @Override // defpackage.rl
    public final void R(boolean z) {
        this.o0 = z;
        synchronized (this) {
            this.x0 |= 8;
        }
        G(20);
        O();
    }

    @Override // defpackage.rl
    public final void S(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        synchronized (this) {
            this.x0 |= 16;
        }
        G(23);
        O();
    }

    @Override // defpackage.rl
    public final void T(ya0 ya0Var) {
        Q(0, ya0Var);
        this.r0 = ya0Var;
        synchronized (this) {
            this.x0 |= 1;
        }
        G(24);
        O();
    }

    @Override // defpackage.rl
    public final void U(ya0 ya0Var) {
        Q(1, ya0Var);
        this.s0 = ya0Var;
        synchronized (this) {
            this.x0 |= 2;
        }
        G(25);
        O();
    }

    @Override // defpackage.rl
    public final void V(ya0 ya0Var) {
        Q(2, ya0Var);
        this.q0 = ya0Var;
        synchronized (this) {
            this.x0 |= 4;
        }
        G(26);
        O();
    }
}