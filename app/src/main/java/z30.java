package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import defpackage.o40;
import defpackage.zl0;
import java.util.WeakHashMap;

/* renamed from: z30  reason: default package */
public final class z30 {
    public static final boolean s;
    public final MaterialButton a;
    public kr0 b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q;
    public LayerDrawable r;

    static {
        s = Build.VERSION.SDK_INT >= 21;
    }

    public z30(MaterialButton materialButton, kr0 kr0Var) {
        this.a = materialButton;
        this.b = kr0Var;
    }

    public final or0 a() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (or0) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    public final o40 b(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (o40) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void c(TypedArray typedArray) {
        int i;
        InsetDrawable insetDrawable;
        this.c = typedArray.getDimensionPixelOffset(ij0.MaterialButton_android_insetLeft, 0);
        this.d = typedArray.getDimensionPixelOffset(ij0.MaterialButton_android_insetRight, 0);
        this.e = typedArray.getDimensionPixelOffset(ij0.MaterialButton_android_insetTop, 0);
        this.f = typedArray.getDimensionPixelOffset(ij0.MaterialButton_android_insetBottom, 0);
        int i2 = ij0.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.g = dimensionPixelSize;
            e(this.b.e(dimensionPixelSize));
            this.p = true;
        }
        this.h = typedArray.getDimensionPixelSize(ij0.MaterialButton_strokeWidth, 0);
        this.i = b51.b(typedArray.getInt(ij0.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = n40.b(this.a.getContext(), typedArray, ij0.MaterialButton_backgroundTint);
        this.k = n40.b(this.a.getContext(), typedArray, ij0.MaterialButton_strokeColor);
        this.l = n40.b(this.a.getContext(), typedArray, ij0.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(ij0.MaterialButton_android_checkable, false);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(ij0.MaterialButton_elevation, 0);
        MaterialButton materialButton = this.a;
        WeakHashMap<View, String> weakHashMap = a41.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = this.a.getPaddingTop();
        int paddingEnd = this.a.getPaddingEnd();
        int paddingBottom = this.a.getPaddingBottom();
        MaterialButton materialButton2 = this.a;
        o40 o40Var = new o40(this.b);
        o40Var.g(this.a.getContext());
        km.f(o40Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            km.g(o40Var, mode);
        }
        ColorStateList colorStateList = this.k;
        o40Var.P.k = this.h;
        o40Var.invalidateSelf();
        o40.b bVar = o40Var.P;
        if (bVar.d != colorStateList) {
            bVar.d = colorStateList;
            o40Var.onStateChange(o40Var.getState());
        }
        o40 o40Var2 = new o40(this.b);
        o40Var2.setTint(0);
        float f = this.h;
        if (this.n) {
            i = nu2.a(this.a, gh0.colorSurface);
        } else {
            i = 0;
        }
        o40Var2.P.k = f;
        o40Var2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        o40.b bVar2 = o40Var2.P;
        if (bVar2.d != valueOf) {
            bVar2.d = valueOf;
            o40Var2.onStateChange(o40Var2.getState());
        }
        if (s) {
            o40 o40Var3 = new o40(this.b);
            this.m = o40Var3;
            km.e(o40Var3, -1);
            ?? rippleDrawable = new RippleDrawable(am0.b(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{o40Var2, o40Var}), this.c, this.e, this.d, this.f), this.m);
            this.r = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            zl0 zl0Var = new zl0(new zl0.a(new o40(this.b)));
            this.m = zl0Var;
            km.f(zl0Var, am0.b(this.l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{o40Var2, o40Var, this.m});
            this.r = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.c, this.e, this.d, this.f);
        }
        materialButton2.setInternalBackground(insetDrawable);
        o40 b = b(false);
        if (b != null) {
            b.h(dimensionPixelSize2);
        }
        this.a.setPaddingRelative(paddingStart + this.c, paddingTop + this.e, paddingEnd + this.d, paddingBottom + this.f);
    }

    public final void d(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            boolean z = s;
            if (z && (this.a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.a.getBackground()).setColor(am0.b(colorStateList));
            } else if (z || !(this.a.getBackground() instanceof zl0)) {
            } else {
                ((zl0) this.a.getBackground()).setTintList(am0.b(colorStateList));
            }
        }
    }

    public final void e(kr0 kr0Var) {
        this.b = kr0Var;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kr0Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kr0Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kr0Var);
        }
    }

    public final void f() {
        int i = 0;
        o40 b = b(false);
        o40 b2 = b(true);
        if (b != null) {
            ColorStateList colorStateList = this.k;
            b.P.k = this.h;
            b.invalidateSelf();
            o40.b bVar = b.P;
            if (bVar.d != colorStateList) {
                bVar.d = colorStateList;
                b.onStateChange(b.getState());
            }
            if (b2 != null) {
                float f = this.h;
                if (this.n) {
                    i = nu2.a(this.a, gh0.colorSurface);
                }
                b2.P.k = f;
                b2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                o40.b bVar2 = b2.P;
                if (bVar2.d != valueOf) {
                    bVar2.d = valueOf;
                    b2.onStateChange(b2.getState());
                }
            }
        }
    }
}