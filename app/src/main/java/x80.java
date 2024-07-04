package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import defpackage.ec0;
import defpackage.xb0;
import io.mrarm.mctoolbox.ui.b;
import io.mrarm.mctoolbox.ui.c;
import io.mrarm.mctoolbox.ui.view.PopupCrashWorkaroundLinearLayout;

/* renamed from: x80  reason: default package */
public final class x80 extends w80 implements ec0.a, xb0.a {
    public final PopupCrashWorkaroundLinearLayout f0;
    public final ImageView g0;
    public final TextView h0;
    public final ec0 i0;
    public final xb0 j0;
    public long k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x80(View view, hj hjVar) {
        super(view, hjVar);
        Object[] L = ViewDataBinding.L(view, 3, null);
        this.k0 = -1L;
        PopupCrashWorkaroundLinearLayout popupCrashWorkaroundLinearLayout = (PopupCrashWorkaroundLinearLayout) L[0];
        this.f0 = popupCrashWorkaroundLinearLayout;
        popupCrashWorkaroundLinearLayout.setTag(null);
        ImageView imageView = (ImageView) L[1];
        this.g0 = imageView;
        imageView.setTag(null);
        TextView textView = (TextView) L[2];
        this.h0 = textView;
        textView.setTag(null);
        view.setTag(bi0.dataBinding, this);
        this.i0 = new ec0(this, 2);
        this.j0 = new xb0(this, 1);
        synchronized (this) {
            this.k0 = 8L;
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0081  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        long j;
        String str;
        long j2;
        c.b bVar;
        boolean z;
        Context context;
        int i;
        long j3;
        c.d dVar;
        za0<String> za0Var;
        synchronized (this) {
            j = this.k0;
            this.k0 = 0L;
        }
        b.a aVar = this.e0;
        Drawable drawable = null;
        ya0 ya0Var = null;
        drawable = null;
        int i2 = 0;
        if ((15 & j) != 0) {
            if ((j & 13) != 0) {
                if (aVar != null) {
                    dVar = aVar.a;
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    za0Var = dVar.a;
                } else {
                    za0Var = null;
                }
                Q(0, za0Var);
                if (za0Var != null) {
                    str = za0Var.Q;
                    j2 = j & 14;
                    if (j2 != 0) {
                        if (aVar != null) {
                            bVar = (c.b) aVar.a;
                        } else {
                            bVar = null;
                        }
                        if (bVar != null) {
                            ya0Var = bVar.d;
                        }
                        Q(1, ya0Var);
                        if (ya0Var != null) {
                            z = ya0Var.Q;
                        } else {
                            z = false;
                        }
                        if (j2 != 0) {
                            if (z) {
                                j3 = 32;
                            } else {
                                j3 = 16;
                            }
                            j |= j3;
                        }
                        if (z) {
                            context = this.g0.getContext();
                            i = 2131230906;
                        } else {
                            context = this.g0.getContext();
                            i = 2131230905;
                        }
                        drawable = z5.b(context, i);
                    }
                    if ((j & 12) != 0) {
                        if (aVar != null) {
                            i2 = aVar.c;
                        }
                        i2 = (int) (this.f0.getResources().getDimension(2131165505) + (this.f0.getResources().getDimension(2131165504) * i2));
                    }
                }
            }
            str = null;
            j2 = j & 14;
            if (j2 != 0) {
            }
            if ((j & 12) != 0) {
            }
        } else {
            str = null;
        }
        if ((12 & j) != 0) {
            r31.a(this.f0, i2);
        }
        if ((8 & j) != 0) {
            this.f0.setOnClickListener(this.j0);
            this.f0.setOnLongClickListener(this.i0);
        }
        if ((14 & j) != 0) {
            this.g0.setImageDrawable(drawable);
        }
        if ((j & 13) != 0) {
            qw0.c(this.h0, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean J() {
        synchronized (this) {
            return this.k0 != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean M(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            ya0 ya0Var = (ya0) obj;
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.k0 |= 2;
            }
            return true;
        }
        za0 za0Var = (za0) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.k0 |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean P(int i, Object obj) {
        if (19 == i) {
            this.e0 = (b.a) obj;
            synchronized (this) {
                this.k0 |= 4;
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

    @Override // defpackage.xb0.a
    public final void d(View view, int i) {
        boolean z;
        boolean z2;
        b.a aVar = this.e0;
        boolean z3 = false;
        if (aVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c.b bVar = (c.b) aVar.a;
            if (bVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ya0 ya0Var = bVar.d;
                if (ya0Var != null) {
                    z3 = true;
                }
                if (z3) {
                    ya0Var.H(!ya0Var.Q);
                }
            }
        }
    }
}