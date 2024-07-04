package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;

/* renamed from: w4  reason: default package */
public final class w4 {
    public final View a;
    public fx0 d;
    public fx0 e;
    public fx0 f;
    public int c = -1;
    public final n5 b = n5.a();

    public w4(View view) {
        this.a = view;
    }

    public final void a() {
        boolean z;
        ColorStateList colorStateList;
        Drawable background = this.a.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            boolean z2 = true;
            if (i <= 21 ? i == 21 : this.d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f == null) {
                    this.f = new fx0();
                }
                fx0 fx0Var = this.f;
                PorterDuff.Mode mode = null;
                fx0Var.a = null;
                fx0Var.d = false;
                fx0Var.b = null;
                fx0Var.c = false;
                View view = this.a;
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (i >= 21) {
                    colorStateList = th.b(view);
                } else if (view instanceof ix0) {
                    colorStateList = ((ix0) view).getSupportBackgroundTintList();
                } else {
                    colorStateList = null;
                }
                if (colorStateList != null) {
                    fx0Var.d = true;
                    fx0Var.a = colorStateList;
                }
                View view2 = this.a;
                if (i >= 21) {
                    mode = view2.getBackgroundTintMode();
                } else if (view2 instanceof ix0) {
                    mode = ((ix0) view2).getSupportBackgroundTintMode();
                }
                if (mode != null) {
                    fx0Var.c = true;
                    fx0Var.b = mode;
                }
                if (!fx0Var.d && !fx0Var.c) {
                    z2 = false;
                } else {
                    n5.e(background, fx0Var, this.a.getDrawableState());
                }
                if (z2) {
                    return;
                }
            }
            fx0 fx0Var2 = this.e;
            if (fx0Var2 != null) {
                n5.e(background, fx0Var2, this.a.getDrawableState());
                return;
            }
            fx0 fx0Var3 = this.d;
            if (fx0Var3 != null) {
                n5.e(background, fx0Var3, this.a.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        fx0 fx0Var = this.e;
        if (fx0Var != null) {
            return fx0Var.a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        fx0 fx0Var = this.e;
        if (fx0Var != null) {
            return fx0Var.b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:3:0x000c, B:5:0x0015, B:6:0x0025, B:8:0x002c, B:10:0x002f, B:14:0x0036, B:16:0x0042, B:18:0x004e, B:20:0x0053, B:22:0x005d, B:29:0x006b, B:31:0x0071, B:32:0x0078, B:33:0x007c, B:35:0x0080, B:36:0x0085, B:38:0x008d, B:40:0x009e, B:42:0x00a3, B:44:0x00ad, B:50:0x00b9, B:52:0x00bf, B:53:0x00c6, B:54:0x00ca, B:56:0x00ce, B:7:0x0026), top: B:62:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i) {
        PorterDuff.Mode backgroundTintMode;
        boolean z;
        PorterDuff.Mode backgroundTintMode2;
        ColorStateList i2;
        hx0 m = hx0.m(this.a.getContext(), attributeSet, lj0.ViewBackgroundHelper, i);
        try {
            int i3 = lj0.ViewBackgroundHelper_android_background;
            if (m.l(i3)) {
                this.c = m.i(i3, -1);
                n5 n5Var = this.b;
                Context context = this.a.getContext();
                int i4 = this.c;
                synchronized (n5Var) {
                    i2 = n5Var.a.i(context, i4);
                }
                if (i2 != null) {
                    g(i2);
                }
            }
            int i5 = lj0.ViewBackgroundHelper_backgroundTint;
            boolean z2 = true;
            if (m.l(i5)) {
                View view = this.a;
                ColorStateList b = m.b(i5);
                WeakHashMap<View, String> weakHashMap = a41.a;
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 21) {
                    l5.d(view, b);
                    if (i6 == 21) {
                        Drawable background = view.getBackground();
                        if (th.b(view) == null) {
                            backgroundTintMode2 = view.getBackgroundTintMode();
                            if (backgroundTintMode2 == null) {
                                z = false;
                                if (background != null && z) {
                                    if (background.isStateful()) {
                                        background.setState(view.getDrawableState());
                                    }
                                    view.setBackground(background);
                                }
                            }
                        }
                        z = true;
                        if (background != null) {
                            if (background.isStateful()) {
                            }
                            view.setBackground(background);
                        }
                    }
                } else if (view instanceof ix0) {
                    ((ix0) view).setSupportBackgroundTintList(b);
                }
            }
            int i7 = lj0.ViewBackgroundHelper_backgroundTintMode;
            if (m.l(i7)) {
                View view2 = this.a;
                PorterDuff.Mode d = um.d(m.h(i7, -1), null);
                WeakHashMap<View, String> weakHashMap2 = a41.a;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 21) {
                    h4.c(view2, d);
                    if (i8 == 21) {
                        Drawable background2 = view2.getBackground();
                        if (th.b(view2) == null) {
                            backgroundTintMode = view2.getBackgroundTintMode();
                            if (backgroundTintMode == null) {
                                z2 = false;
                            }
                        }
                        if (background2 != null && z2) {
                            if (background2.isStateful()) {
                                background2.setState(view2.getDrawableState());
                            }
                            view2.setBackground(background2);
                        }
                    }
                } else if (view2 instanceof ix0) {
                    ((ix0) view2).setSupportBackgroundTintMode(d);
                }
            }
        } finally {
            m.n();
        }
    }

    public final void e() {
        this.c = -1;
        g(null);
        a();
    }

    public final void f(int i) {
        ColorStateList colorStateList;
        this.c = i;
        n5 n5Var = this.b;
        if (n5Var != null) {
            Context context = this.a.getContext();
            synchronized (n5Var) {
                colorStateList = n5Var.a.i(context, i);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.d == null) {
                this.d = new fx0();
            }
            fx0 fx0Var = this.d;
            fx0Var.a = colorStateList;
            fx0Var.d = true;
        } else {
            this.d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.e == null) {
            this.e = new fx0();
        }
        fx0 fx0Var = this.e;
        fx0Var.a = colorStateList;
        fx0Var.d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.e == null) {
            this.e = new fx0();
        }
        fx0 fx0Var = this.e;
        fx0Var.b = mode;
        fx0Var.c = true;
        a();
    }
}