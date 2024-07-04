package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import defpackage.il0;

/* renamed from: iw0  reason: default package */
public final class iw0 {
    public final float a;
    public final ColorStateList b;
    public final int c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public boolean k = false;
    public Typeface l;

    /* renamed from: iw0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends il0.c {
        public final /* synthetic */ z61 a;

        public a(z61 z61Var) {
            this.a = z61Var;
        }

        @Override // defpackage.il0.c
        public final void c(int i) {
            iw0.this.k = true;
            this.a.S0(i);
        }

        @Override // defpackage.il0.c
        public final void d(Typeface typeface) {
            iw0 iw0Var = iw0.this;
            iw0Var.l = Typeface.create(typeface, iw0Var.c);
            iw0 iw0Var2 = iw0.this;
            iw0Var2.k = true;
            this.a.T0(iw0Var2.l, false);
        }
    }

    public iw0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ij0.TextAppearance);
        this.a = obtainStyledAttributes.getDimension(ij0.TextAppearance_android_textSize, 0.0f);
        this.b = n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_textColor);
        n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_textColorHint);
        n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_textColorLink);
        this.c = obtainStyledAttributes.getInt(ij0.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(ij0.TextAppearance_android_typeface, 1);
        int i2 = ij0.TextAppearance_fontFamily;
        i2 = obtainStyledAttributes.hasValue(i2) ? i2 : ij0.TextAppearance_android_fontFamily;
        this.j = obtainStyledAttributes.getResourceId(i2, 0);
        this.e = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(ij0.TextAppearance_textAllCaps, false);
        this.f = n40.b(context, obtainStyledAttributes, ij0.TextAppearance_android_shadowColor);
        this.g = obtainStyledAttributes.getFloat(ij0.TextAppearance_android_shadowDx, 0.0f);
        this.h = obtainStyledAttributes.getFloat(ij0.TextAppearance_android_shadowDy, 0.0f);
        this.i = obtainStyledAttributes.getFloat(ij0.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        String str;
        if (this.l == null && (str = this.e) != null) {
            this.l = Typeface.create(str, this.c);
        }
        if (this.l == null) {
            int i = this.d;
            this.l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.c);
        }
    }

    public final void b(Context context, z61 z61Var) {
        a();
        int i = this.j;
        if (i == 0) {
            this.k = true;
        }
        if (this.k) {
            z61Var.T0(this.l, true);
            return;
        }
        try {
            a aVar = new a(z61Var);
            ThreadLocal<TypedValue> threadLocal = il0.a;
            if (context.isRestricted()) {
                aVar.a(-4);
            } else {
                il0.a(context, i, new TypedValue(), 0, aVar, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            z61Var.S0(1);
        } catch (Exception e) {
            StringBuilder b = e5.b("Error loading font ");
            b.append(this.e);
            Log.d("TextAppearance", b.toString(), e);
            this.k = true;
            z61Var.S0(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, z61 z61Var) {
        int i;
        int i2;
        a();
        d(textPaint, this.l);
        b(context, new jw0(this, textPaint, z61Var));
        ColorStateList colorStateList = this.b;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i = -16777216;
        }
        textPaint.setColor(i);
        float f = this.i;
        float f2 = this.g;
        float f3 = this.h;
        ColorStateList colorStateList2 = this.f;
        if (colorStateList2 != null) {
            i2 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i2 = 0;
        }
        textPaint.setShadowLayer(f, f2, f3, i2);
    }

    public final void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.a);
    }
}