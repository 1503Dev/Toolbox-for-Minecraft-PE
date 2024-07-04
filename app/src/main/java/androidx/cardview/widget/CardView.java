package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class CardView extends FrameLayout {
    public static final int[] W = {16842801};
    public static final jc a0;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public final Rect T;
    public final Rect U;
    public final a V;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ic {
        public Drawable a;

        public a() {
        }

        public final void a(int i, int i2, int i3, int i4) {
            CardView.this.U.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.T;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }
    }

    static {
        a0 = Build.VERSION.SDK_INT >= 21 ? new gc() : new ec();
        a0.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        Resources resources;
        int i;
        ColorStateList valueOf;
        int i2 = ch0.cardViewStyle;
        Rect rect = new Rect();
        this.T = rect;
        this.U = new Rect();
        a aVar = new a();
        this.V = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, dj0.CardView, i2, xi0.CardView);
        int i3 = dj0.CardView_cardBackgroundColor;
        if (obtainStyledAttributes.hasValue(i3)) {
            valueOf = obtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(W);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i = lh0.cardview_light_background;
            } else {
                resources = getResources();
                i = lh0.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(dj0.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(dj0.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(dj0.CardView_cardMaxElevation, 0.0f);
        this.P = obtainStyledAttributes.getBoolean(dj0.CardView_cardUseCompatPadding, false);
        this.Q = obtainStyledAttributes.getBoolean(dj0.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_contentPadding, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.R = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_android_minWidth, 0);
        this.S = obtainStyledAttributes.getDimensionPixelSize(dj0.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        a0.m(aVar, context, colorStateList, dimension, dimension2, f);
    }

    public ColorStateList getCardBackgroundColor() {
        return a0.d(this.V);
    }

    public float getCardElevation() {
        return a0.k(this.V);
    }

    public int getContentPaddingBottom() {
        return this.T.bottom;
    }

    public int getContentPaddingLeft() {
        return this.T.left;
    }

    public int getContentPaddingRight() {
        return this.T.right;
    }

    public int getContentPaddingTop() {
        return this.T.top;
    }

    public float getMaxCardElevation() {
        return a0.n(this.V);
    }

    public boolean getPreventCornerOverlap() {
        return this.Q;
    }

    public float getRadius() {
        return a0.h(this.V);
    }

    public boolean getUseCompatPadding() {
        return this.P;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        jc jcVar = a0;
        if (!(jcVar instanceof gc)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(jcVar.c(this.V)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(jcVar.b(this.V)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        a0.f(this.V, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        a0.f(this.V, colorStateList);
    }

    public void setCardElevation(float f) {
        a0.j(this.V, f);
    }

    public void setMaxCardElevation(float f) {
        a0.g(this.V, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.S = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.R = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.Q) {
            this.Q = z;
            a0.l(this.V);
        }
    }

    public void setRadius(float f) {
        a0.e(this.V, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.P != z) {
            this.P = z;
            a0.a(this.V);
        }
    }
}