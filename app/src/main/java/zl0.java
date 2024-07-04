package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: zl0  reason: default package */
public final class zl0 extends Drawable implements or0, dx0 {
    public a P;

    /* renamed from: zl0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends Drawable.ConstantState {
        public o40 a;
        public boolean b;

        public a(o40 o40Var) {
            this.a = o40Var;
            this.b = false;
        }

        public a(a aVar) {
            this.a = (o40) aVar.a.P.newDrawable();
            this.b = aVar.b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new zl0(new a(this));
        }
    }

    public zl0(a aVar) {
        this.P = aVar;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        a aVar = this.P;
        if (aVar.b) {
            aVar.a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.P;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.P.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.P = new a(this.P);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.P.a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.P.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean c = am0.c(iArr);
        a aVar = this.P;
        if (aVar.b != c) {
            aVar.b = c;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.P.a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.P.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.or0
    public final void setShapeAppearanceModel(kr0 kr0Var) {
        this.P.a.setShapeAppearanceModel(kr0Var);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTint(int i) {
        this.P.a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintList(ColorStateList colorStateList) {
        this.P.a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.dx0
    public final void setTintMode(PorterDuff.Mode mode) {
        this.P.a.setTintMode(mode);
    }
}