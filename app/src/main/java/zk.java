package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.warkiz.widget.IndicatorSeekBar;
import defpackage.ie;
import defpackage.me;
import defpackage.xb0;
import io.mrarm.mctoolbox.ui.view.AutoClearErrorTextInputLayout;
import io.mrarm.mctoolbox.ui.view.LabelLayout;

/* renamed from: zk  reason: default package */
public final class zk extends yk implements xb0.a {
    public static final SparseIntArray I0;
    public final TextInputLayout A0;
    public final TextInputEditText B0;
    public final xb0 C0;
    public final xb0 D0;
    public final xb0 E0;
    public a F0;
    public b G0;
    public long H0;
    public final LabelLayout s0;
    public final LabelLayout t0;
    public final Button u0;
    public final Button v0;
    public final Button w0;
    public final Button x0;
    public final ImageButton y0;
    public final TextInputEditText z0;

    /* renamed from: zk$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            String a = qw0.a(zk.this.z0);
            zk zkVar = zk.this;
            String str = zkVar.m0;
            zkVar.Y(a);
        }
    }

    /* renamed from: zk$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements jy {
        public b() {
        }

        @Override // defpackage.jy
        public final void a() {
            String a = qw0.a(zk.this.B0);
            zk zkVar = zk.this;
            String str = zkVar.n0;
            zkVar.S(a);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I0 = sparseIntArray;
        sparseIntArray.put(2131296427, 12);
        sparseIntArray.put(2131296501, 13);
        sparseIntArray.put(2131296646, 14);
        sparseIntArray.put(2131296647, 15);
        sparseIntArray.put(2131296648, 16);
        sparseIntArray.put(2131296542, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zk(View view, hj hjVar) {
        super(hjVar, view, r6, (AutoClearErrorTextInputLayout) r0[13], (IndicatorSeekBar) r0[17], (EditText) r0[14], (EditText) r0[15], (EditText) r0[16]);
        Object[] L = ViewDataBinding.L(view, 18, I0);
        ImageButton imageButton = (ImageButton) L[1];
        LinearLayout linearLayout = (LinearLayout) L[12];
        this.F0 = new a();
        this.G0 = new b();
        this.H0 = -1L;
        this.e0.setTag(null);
        ((LinearLayout) L[0]).setTag(null);
        LabelLayout labelLayout = (LabelLayout) L[10];
        this.s0 = labelLayout;
        labelLayout.setTag(null);
        LabelLayout labelLayout2 = (LabelLayout) L[11];
        this.t0 = labelLayout2;
        labelLayout2.setTag(null);
        Button button = (Button) L[2];
        this.u0 = button;
        button.setTag(null);
        Button button2 = (Button) L[3];
        this.v0 = button2;
        button2.setTag(null);
        Button button3 = (Button) L[4];
        this.w0 = button3;
        button3.setTag(null);
        Button button4 = (Button) L[5];
        this.x0 = button4;
        button4.setTag(null);
        ImageButton imageButton2 = (ImageButton) L[6];
        this.y0 = imageButton2;
        imageButton2.setTag(null);
        TextInputEditText textInputEditText = (TextInputEditText) L[7];
        this.z0 = textInputEditText;
        textInputEditText.setTag(null);
        TextInputLayout textInputLayout = (TextInputLayout) L[8];
        this.A0 = textInputLayout;
        textInputLayout.setTag(null);
        TextInputEditText textInputEditText2 = (TextInputEditText) L[9];
        this.B0 = textInputEditText2;
        textInputEditText2.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.C0 = new xb0(this, 2);
        this.D0 = new xb0(this, 3);
        this.E0 = new xb0(this, 1);
        synchronized (this) {
            this.H0 = 512L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        long j2;
        boolean z;
        int i;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        long j3;
        long j4;
        long j5;
        long j6;
        synchronized (this) {
            j = this.H0;
            this.H0 = 0L;
        }
        int i4 = this.l0;
        String str = this.m0;
        String str2 = this.n0;
        me.b bVar = this.k0;
        View.OnClickListener onClickListener = this.q0;
        View.OnClickListener onClickListener2 = this.o0;
        View.OnClickListener onClickListener3 = this.p0;
        long j7 = j & 520;
        int i5 = 8;
        boolean z4 = true;
        if (j7 != 0) {
            if (bVar == me.b.Repeat) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar == me.b.Teleport) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (bVar == me.b.Single) {
                z = true;
            } else {
                z = false;
            }
            if (j7 != 0) {
                if (z2) {
                    j6 = 2048;
                } else {
                    j6 = 1024;
                }
                j |= j6;
            }
            if ((j & 520) != 0) {
                if (z3) {
                    j5 = 8192;
                } else {
                    j5 = 4096;
                }
                j |= j5;
            }
            if ((j & 520) != 0) {
                if (z) {
                    j4 = 32768;
                } else {
                    j4 = 16384;
                }
                j |= j4;
            }
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            if (z3) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            j2 = 520;
        } else {
            j2 = 520;
            z = false;
            i = 0;
            i2 = 0;
            z2 = false;
            z3 = false;
        }
        long j8 = j & j2;
        if (j8 != 0) {
            if (!z) {
                z4 = z2;
            }
            if (j8 != 0) {
                if (z4) {
                    j3 = 131072;
                } else {
                    j3 = 65536;
                }
                j |= j3;
            }
            if (z4) {
                i5 = 0;
            }
            i3 = i5;
        } else {
            i3 = 0;
        }
        if ((576 & j) != 0) {
            this.e0.setOnClickListener(onClickListener2);
        }
        if ((520 & j) != 0) {
            this.s0.setVisibility(i2);
            this.t0.setVisibility(i);
            this.u0.setSelected(z);
            this.v0.setSelected(z2);
            this.w0.setSelected(z3);
            this.A0.setVisibility(i3);
        }
        if ((512 & j) != 0) {
            this.u0.setOnClickListener(this.E0);
            this.v0.setOnClickListener(this.C0);
            this.w0.setOnClickListener(this.D0);
            qw0.d(this.z0, this.F0);
            qw0.d(this.B0, this.G0);
        }
        if ((640 & j) != 0) {
            this.x0.setOnClickListener(onClickListener3);
        }
        if ((513 & j) != 0) {
            this.y0.setImageResource(i4);
        }
        if ((528 & j) != 0) {
            this.y0.setOnClickListener(onClickListener);
        }
        if ((514 & j) != 0) {
            qw0.c(this.z0, str);
        }
        if ((j & 516) != 0) {
            qw0.c(this.B0, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.H0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (33 == i) {
            V(((Integer) obj).intValue());
        } else if (38 == i) {
            Y((String) obj);
        } else if (16 == i) {
            S((String) obj);
        } else if (37 == i) {
            X((me.b) obj);
        } else if (32 == i) {
            U((View.OnClickListener) obj);
        } else if (43 == i) {
            Z((ie.b) obj);
        } else if (12 == i) {
            R((View.OnClickListener) obj);
        } else if (23 == i) {
            T((View.OnClickListener) obj);
        } else if (34 != i) {
            return false;
        } else {
            ((Boolean) obj).booleanValue();
        }
        return true;
    }

    @Override // defpackage.yk
    public final void R(View.OnClickListener onClickListener) {
        this.o0 = onClickListener;
        synchronized (this) {
            this.H0 |= 64;
        }
        G(12);
        O();
    }

    @Override // defpackage.yk
    public final void S(String str) {
        this.n0 = str;
        synchronized (this) {
            this.H0 |= 4;
        }
        G(16);
        O();
    }

    @Override // defpackage.yk
    public final void T(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        synchronized (this) {
            this.H0 |= 128;
        }
        G(23);
        O();
    }

    @Override // defpackage.yk
    public final void U(View.OnClickListener onClickListener) {
        this.q0 = onClickListener;
        synchronized (this) {
            this.H0 |= 16;
        }
        G(32);
        O();
    }

    @Override // defpackage.yk
    public final void V(int i) {
        this.l0 = i;
        synchronized (this) {
            this.H0 |= 1;
        }
        G(33);
        O();
    }

    @Override // defpackage.yk
    public final void W(boolean z) {
    }

    @Override // defpackage.yk
    public final void X(me.b bVar) {
        this.k0 = bVar;
        synchronized (this) {
            this.H0 |= 8;
        }
        G(37);
        O();
    }

    @Override // defpackage.yk
    public final void Y(String str) {
        this.m0 = str;
        synchronized (this) {
            this.H0 |= 2;
        }
        G(38);
        O();
    }

    @Override // defpackage.yk
    public final void Z(ie.b bVar) {
        this.r0 = bVar;
        synchronized (this) {
            this.H0 |= 32;
        }
        G(43);
        O();
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        ie.b bVar;
        me.b bVar2;
        if (i == 1) {
            bVar = this.r0;
            if (!(bVar != null)) {
                return;
            }
            bVar2 = me.b.Single;
        } else if (i == 2) {
            bVar = this.r0;
            if (!(bVar != null)) {
                return;
            }
            bVar2 = me.b.Repeat;
        } else if (i != 3) {
            return;
        } else {
            bVar = this.r0;
            if (!(bVar != null)) {
                return;
            }
            bVar2 = me.b.Teleport;
        }
        bVar.a(bVar2);
    }
}