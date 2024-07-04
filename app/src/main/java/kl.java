package defpackage;

import android.graphics.Bitmap;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.dz;
import defpackage.xb0;
import defpackage.zv;
import io.mrarm.mctoolbox.ui.view.PixelArtView;

/* renamed from: kl  reason: default package */
public final class kl extends jl implements xb0.a {
    public static final SparseIntArray M0;
    public final ImageButton A0;
    public final Button B0;
    public final LinearLayout C0;
    public final xb0 D0;
    public final xb0 E0;
    public final xb0 F0;
    public final xb0 G0;
    public final xb0 H0;
    public final xb0 I0;
    public final xb0 J0;
    public a K0;
    public long L0;
    public final FrameLayout z0;

    /* renamed from: kl$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            String a = qw0.a(kl.this.j0);
            za0<String> za0Var = kl.this.q0;
            if (za0Var != null) {
                za0Var.H(a);
            }
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M0 = sparseIntArray;
        sparseIntArray.put(2131296427, 13);
        sparseIntArray.put(2131296451, 14);
        sparseIntArray.put(2131296445, 15);
        sparseIntArray.put(2131296444, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public kl(View view, hj hjVar) {
        super(hjVar, view, r4, r5, r6, r7, r8, r17, r18, (ImageButton) r16[8], (ImageView) r16[9], (TextView) r16[10], (FrameLayout) r16[14]);
        Object[] L = ViewDataBinding.L(view, 17, M0);
        ImageButton imageButton = (ImageButton) L[1];
        PixelArtView pixelArtView = (PixelArtView) L[3];
        PixelArtView pixelArtView2 = (PixelArtView) L[4];
        PixelArtView pixelArtView3 = (PixelArtView) L[5];
        PixelArtView pixelArtView4 = (PixelArtView) L[6];
        EditText editText = (EditText) L[2];
        LinearLayout linearLayout = (LinearLayout) L[13];
        EditText editText2 = (EditText) L[16];
        TextView textView = (TextView) L[15];
        this.K0 = new a();
        this.L0 = -1L;
        this.e0.setTag(null);
        this.f0.setTag(null);
        this.g0.setTag(null);
        this.h0.setTag(null);
        this.i0.setTag(null);
        this.j0.setTag(null);
        this.l0.setTag(null);
        this.m0.setTag(null);
        this.n0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) L[0];
        this.z0 = frameLayout;
        frameLayout.setTag(null);
        ImageButton imageButton2 = (ImageButton) L[11];
        this.A0 = imageButton2;
        imageButton2.setTag(null);
        Button button = (Button) L[12];
        this.B0 = button;
        button.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) L[7];
        this.C0 = linearLayout2;
        linearLayout2.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.D0 = new xb0(this, 3);
        this.E0 = new xb0(this, 6);
        this.F0 = new xb0(this, 4);
        this.G0 = new xb0(this, 7);
        this.H0 = new xb0(this, 1);
        this.I0 = new xb0(this, 5);
        this.J0 = new xb0(this, 2);
        synchronized (this) {
            this.L0 = 1024L;
        }
        O();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void I() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        long j2;
        int i2;
        synchronized (this) {
            j = this.L0;
            this.L0 = 0L;
        }
        bb0 bb0Var = this.s0;
        za0<String> za0Var = this.q0;
        Bitmap bitmap = this.v0;
        View.OnClickListener onClickListener = this.p0;
        String str = this.u0;
        zv.b bVar = this.t0;
        boolean z5 = true;
        int i3 = 0;
        if ((j & 1025) != 0) {
            if (bb0Var != null) {
                i2 = bb0Var.H();
            } else {
                i2 = 0;
            }
            if (i2 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i2 == 3) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i2 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        String str2 = null;
        if ((j & 1026) != 0 && za0Var != null) {
            str2 = za0Var.Q;
        }
        long j3 = j & 1280;
        if (j3 != 0) {
            if (bVar == null) {
                z5 = false;
            }
            if (j3 != 0) {
                if (z5) {
                    j2 = 4096;
                } else {
                    j2 = 2048;
                }
                j |= j2;
            }
            if (!z5) {
                i3 = 8;
            }
            i = i3;
        } else {
            i = 0;
        }
        if ((1088 & j) != 0) {
            this.e0.setOnClickListener(onClickListener);
        }
        if ((1025 & j) != 0) {
            this.f0.setSelected(z);
            this.g0.setSelected(z4);
            this.h0.setSelected(z3);
            this.i0.setSelected(z2);
        }
        if ((1024 & j) != 0) {
            this.f0.setOnClickListener(this.H0);
            this.g0.setOnClickListener(this.J0);
            this.h0.setOnClickListener(this.D0);
            this.i0.setOnClickListener(this.F0);
            qw0.d(this.j0, this.K0);
            this.l0.setOnClickListener(this.I0);
            this.A0.setOnClickListener(this.E0);
            this.B0.setOnClickListener(this.G0);
        }
        if ((j & 1026) != 0) {
            qw0.c(this.j0, str2);
        }
        if ((1032 & j) != 0) {
            this.m0.setImageBitmap(bitmap);
        }
        if ((1152 & j) != 0) {
            qw0.c(this.n0, str);
        }
        if ((j & 1280) != 0) {
            this.C0.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.L0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            za0 za0Var = (za0) obj;
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.L0 |= 2;
            }
            return true;
        }
        bb0 bb0Var = (bb0) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.L0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (14 == i) {
            Y((dz.a) obj);
        } else if (18 == i) {
            Z((bb0) obj);
        } else if (30 == i) {
            a0((za0) obj);
        } else if (4 == i) {
            T((Bitmap) obj);
        } else if (7 == i) {
            W((Runnable) obj);
        } else if (3 == i) {
            S((Runnable) obj);
        } else if (12 == i) {
            X((View.OnClickListener) obj);
        } else if (6 == i) {
            V((String) obj);
        } else if (2 == i) {
            R((zv.b) obj);
        } else if (5 != i) {
            return false;
        } else {
            U((Runnable) obj);
        }
        return true;
    }

    @Override // defpackage.jl
    public final void R(zv.b bVar) {
        this.t0 = bVar;
        synchronized (this) {
            this.L0 |= 256;
        }
        G(2);
        O();
    }

    @Override // defpackage.jl
    public final void S(Runnable runnable) {
        this.w0 = runnable;
        synchronized (this) {
            this.L0 |= 32;
        }
        G(3);
        O();
    }

    @Override // defpackage.jl
    public final void T(Bitmap bitmap) {
        this.v0 = bitmap;
        synchronized (this) {
            this.L0 |= 8;
        }
        G(4);
        O();
    }

    @Override // defpackage.jl
    public final void U(Runnable runnable) {
        this.y0 = runnable;
        synchronized (this) {
            this.L0 |= 512;
        }
        G(5);
        O();
    }

    @Override // defpackage.jl
    public final void V(String str) {
        this.u0 = str;
        synchronized (this) {
            this.L0 |= 128;
        }
        G(6);
        O();
    }

    @Override // defpackage.jl
    public final void W(Runnable runnable) {
        this.x0 = runnable;
        synchronized (this) {
            this.L0 |= 16;
        }
        G(7);
        O();
    }

    @Override // defpackage.jl
    public final void X(View.OnClickListener onClickListener) {
        this.p0 = onClickListener;
        synchronized (this) {
            this.L0 |= 64;
        }
        G(12);
        O();
    }

    @Override // defpackage.jl
    public final void Y(dz.a aVar) {
        this.r0 = aVar;
        synchronized (this) {
            this.L0 |= 4;
        }
        G(14);
        O();
    }

    @Override // defpackage.jl
    public final void Z(bb0 bb0Var) {
        Q(0, bb0Var);
        this.s0 = bb0Var;
        synchronized (this) {
            this.L0 |= 1;
        }
        G(18);
        O();
    }

    @Override // defpackage.jl
    public final void a0(za0<String> za0Var) {
        Q(1, za0Var);
        this.q0 = za0Var;
        synchronized (this) {
            this.L0 |= 2;
        }
        G(30);
        O();
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        dz.a aVar;
        Runnable runnable;
        switch (i) {
            case 1:
                aVar = this.r0;
                if (!(aVar != null)) {
                    return;
                }
                aVar.a(r2);
                return;
            case 2:
                aVar = this.r0;
                if ((aVar == null ? 0 : 1) != 0) {
                    r2 = 3;
                    aVar.a(r2);
                    return;
                }
                return;
            case 3:
                aVar = this.r0;
                if ((aVar == null ? 0 : 1) != 0) {
                    r2 = 4;
                    aVar.a(r2);
                    return;
                }
                return;
            case 4:
                aVar = this.r0;
                if ((aVar == null ? 0 : 1) != 0) {
                    r2 = 2;
                    aVar.a(r2);
                    return;
                }
                return;
            case 5:
                runnable = this.y0;
                if ((runnable == null ? 0 : 1) == 0) {
                    return;
                }
                runnable.run();
                return;
            case 6:
                runnable = this.x0;
                if ((runnable == null ? 0 : 1) == 0) {
                    return;
                }
                runnable.run();
                return;
            case 7:
                runnable = this.w0;
                if ((runnable == null ? 0 : 1) == 0) {
                    return;
                }
                runnable.run();
                return;
            default:
                return;
        }
    }
}