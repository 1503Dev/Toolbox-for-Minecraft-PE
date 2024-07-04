package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.ne;
import defpackage.xb0;
import io.mrarm.mctoolbox.ui.view.SwitchNoGlitch;

/* renamed from: n10  reason: default package */
public final class n10 extends m10 implements xb0.a {
    public final LinearLayout h0;
    public final TextView i0;
    public final ImageButton j0;
    public final xb0 k0;
    public final xb0 l0;
    public a m0;
    public long n0;

    /* renamed from: n10$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements jy {
        public a() {
        }

        @Override // defpackage.jy
        public final void a() {
            boolean isChecked = n10.this.e0.isChecked();
            me meVar = n10.this.f0;
            if (meVar != null) {
                ya0 ya0Var = meVar.k;
                if (ya0Var != null) {
                    ya0Var.H(isChecked);
                }
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n10(View view, hj hjVar) {
        super(hjVar, view, (SwitchNoGlitch) r0[3]);
        Object[] L = ViewDataBinding.L(view, 4, null);
        this.m0 = new a();
        this.n0 = -1L;
        LinearLayout linearLayout = (LinearLayout) L[0];
        this.h0 = linearLayout;
        linearLayout.setTag(null);
        TextView textView = (TextView) L[1];
        this.i0 = textView;
        textView.setTag(null);
        ImageButton imageButton = (ImageButton) L[2];
        this.j0 = imageButton;
        imageButton.setTag(null);
        this.e0.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.k0 = new xb0(this, 1);
        this.l0 = new xb0(this, 2);
        synchronized (this) {
            this.n0 = 32L;
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        String str;
        boolean z;
        long j2;
        int i;
        ya0 ya0Var;
        boolean z2;
        int i2;
        long j3;
        long j4;
        ya0 ya0Var2;
        za0<String> za0Var;
        synchronized (this) {
            j = this.n0;
            this.n0 = 0L;
        }
        me meVar = this.f0;
        ne.a aVar = this.g0;
        int i3 = 0;
        if ((46 & j) != 0) {
            if ((j & 42) != 0) {
                if (meVar != null) {
                    za0Var = meVar.c;
                } else {
                    za0Var = null;
                }
                Q(1, za0Var);
                if (za0Var != null) {
                    str = za0Var.Q;
                    if ((j & 44) != 0) {
                        if (meVar != null) {
                            ya0Var2 = meVar.k;
                        } else {
                            ya0Var2 = null;
                        }
                        Q(2, ya0Var2);
                        if (ya0Var2 != null) {
                            z = ya0Var2.Q;
                            j2 = j & 49;
                            if (j2 == 0) {
                                if (aVar != null) {
                                    ya0Var = aVar.a;
                                } else {
                                    ya0Var = null;
                                }
                                Q(0, ya0Var);
                                if (ya0Var != null) {
                                    z2 = ya0Var.Q;
                                } else {
                                    z2 = false;
                                }
                                if (j2 != 0) {
                                    if (z2) {
                                        j3 = j | 128;
                                        j4 = 512;
                                    } else {
                                        j3 = j | 64;
                                        j4 = 256;
                                    }
                                    j = j3 | j4;
                                }
                                if (z2) {
                                    i2 = 8;
                                } else {
                                    i2 = 0;
                                }
                                if (!z2) {
                                    i3 = 8;
                                }
                                i = i2;
                            } else {
                                i = 0;
                            }
                            if ((j & 32) != 0) {
                                this.h0.setOnClickListener(this.k0);
                                this.j0.setOnClickListener(this.l0);
                                we.b(this.e0, null, this.m0);
                            }
                            if ((42 & j) != 0) {
                                qw0.c(this.i0, str);
                            }
                            if ((j & 49) != 0) {
                                this.j0.setVisibility(i3);
                                this.e0.setVisibility(i);
                            }
                            if ((j & 44) == 0) {
                                we.a(this.e0, z);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
            str = null;
            if ((j & 44) != 0) {
            }
        } else {
            str = null;
        }
        z = false;
        j2 = j & 49;
        if (j2 == 0) {
        }
        if ((j & 32) != 0) {
        }
        if ((42 & j) != 0) {
        }
        if ((j & 49) != 0) {
        }
        if ((j & 44) == 0) {
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.n0 != 0;
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
                    this.n0 |= 4;
                }
                return true;
            }
            za0 za0Var = (za0) obj;
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.n0 |= 2;
            }
            return true;
        }
        ya0 ya0Var2 = (ya0) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.n0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (35 == i) {
            this.f0 = (me) obj;
            synchronized (this) {
                this.n0 |= 8;
            }
            G(35);
            O();
        } else if (19 == i) {
            this.g0 = (ne.a) obj;
            synchronized (this) {
                this.n0 |= 16;
            }
            G(19);
            O();
        } else {
            return false;
        }
        return true;
    }

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i != 1) {
            if (i == 2) {
                me meVar = this.f0;
                ne.a aVar = this.g0;
                if (aVar != null) {
                    z3 = true;
                }
                if (z3) {
                    xz0 xz0Var = (xz0) ne.this.b;
                    xz0Var.k.remove(meVar);
                    xz0Var.l.remove(meVar.b);
                    meVar.c();
                    xz0Var.e.a();
                    return;
                }
                return;
            }
            return;
        }
        me meVar2 = this.f0;
        ne.a aVar2 = this.g0;
        if (aVar2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ya0 ya0Var = aVar2.a;
            if (ya0Var != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (ya0Var.Q) {
                    Context context = view.getContext();
                    ne neVar = ne.this;
                    new ie(context, neVar.a, neVar.b, meVar2).show();
                    return;
                }
                if (meVar2 != null) {
                    z3 = true;
                }
                if (z3) {
                    meVar2.d();
                }
            }
        }
    }
}