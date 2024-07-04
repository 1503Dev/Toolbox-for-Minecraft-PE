package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import defpackage.il0;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: l6  reason: default package */
public final class l6 {
    public final TextView a;
    public fx0 b;
    public fx0 c;
    public fx0 d;
    public fx0 e;
    public fx0 f;
    public fx0 g;
    public fx0 h;
    public final o6 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    /* renamed from: l6$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends il0.c {
        public final WeakReference<l6> a;
        public final int b;
        public final int c;

        /* renamed from: l6$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class RunnableC0044a implements Runnable {
            public final WeakReference<l6> P;
            public final Typeface Q;

            public RunnableC0044a(WeakReference weakReference, Typeface typeface) {
                this.P = weakReference;
                this.Q = typeface;
            }

            @Override // java.lang.Runnable
            public final void run() {
                l6 l6Var = this.P.get();
                if (l6Var == null) {
                    return;
                }
                Typeface typeface = this.Q;
                if (l6Var.m) {
                    l6Var.a.setTypeface(typeface);
                    l6Var.l = typeface;
                }
            }
        }

        public a(l6 l6Var, int i, int i2) {
            this.a = new WeakReference<>(l6Var);
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.il0.c
        public final void c(int i) {
        }

        @Override // defpackage.il0.c
        public final void d(Typeface typeface) {
            int i;
            l6 l6Var = this.a.get();
            if (l6Var == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && (i = this.b) != -1) {
                typeface = j6.b(typeface, i, (this.c & 2) != 0);
            }
            l6Var.a.post(new RunnableC0044a(this.a, typeface));
        }
    }

    public l6(TextView textView) {
        this.a = textView;
        this.i = new o6(textView);
    }

    public static fx0 c(Context context, n5 n5Var, int i) {
        ColorStateList i2;
        synchronized (n5Var) {
            i2 = n5Var.a.i(context, i);
        }
        if (i2 != null) {
            fx0 fx0Var = new fx0();
            fx0Var.d = true;
            fx0Var.a = i2;
            return fx0Var;
        }
        return null;
    }

    public final void a(Drawable drawable, fx0 fx0Var) {
        if (drawable == null || fx0Var == null) {
            return;
        }
        n5.e(drawable, fx0Var, this.a.getDrawableState());
    }

    public final void b() {
        if (this.b != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x036c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c3  */
    @SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i) {
        boolean z;
        ColorStateList colorStateList;
        String str;
        String str2;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        n5 n5Var;
        Typeface typeface;
        int i4;
        o6 o6Var;
        TypedArray obtainStyledAttributes;
        int i5;
        int i6;
        float f;
        int i7;
        float f2;
        int i8;
        float f3;
        int i9;
        hx0 hx0Var;
        int i10;
        Drawable drawable;
        int i11;
        Drawable drawable2;
        int i12;
        Drawable drawable3;
        int i13;
        Drawable drawable4;
        int i14;
        Drawable drawable5;
        int i15;
        Drawable drawable6;
        int i16;
        int i17;
        int d;
        int d2;
        int d3;
        int resourceId;
        int length;
        int i18;
        Context context = this.a.getContext();
        n5 a2 = n5.a();
        hx0 m = hx0.m(context, attributeSet, lj0.AppCompatTextHelper, i);
        int i19 = m.i(lj0.AppCompatTextHelper_android_textAppearance, -1);
        int i20 = lj0.AppCompatTextHelper_android_drawableLeft;
        if (m.l(i20)) {
            this.b = c(context, a2, m.i(i20, 0));
        }
        int i21 = lj0.AppCompatTextHelper_android_drawableTop;
        if (m.l(i21)) {
            this.c = c(context, a2, m.i(i21, 0));
        }
        int i22 = lj0.AppCompatTextHelper_android_drawableRight;
        if (m.l(i22)) {
            this.d = c(context, a2, m.i(i22, 0));
        }
        int i23 = lj0.AppCompatTextHelper_android_drawableBottom;
        if (m.l(i23)) {
            this.e = c(context, a2, m.i(i23, 0));
        }
        int i24 = Build.VERSION.SDK_INT;
        int i25 = lj0.AppCompatTextHelper_android_drawableStart;
        if (m.l(i25)) {
            this.f = c(context, a2, m.i(i25, 0));
        }
        int i26 = lj0.AppCompatTextHelper_android_drawableEnd;
        if (m.l(i26)) {
            this.g = c(context, a2, m.i(i26, 0));
        }
        m.n();
        boolean z5 = this.a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (i19 != -1) {
            hx0 hx0Var2 = new hx0(context, context.obtainStyledAttributes(i19, lj0.TextAppearance));
            if (!z5) {
                int i27 = lj0.TextAppearance_textAllCaps;
                if (hx0Var2.l(i27)) {
                    z = hx0Var2.a(i27, false);
                    z2 = true;
                    i(context, hx0Var2);
                    if (i24 >= 23) {
                        int i28 = lj0.TextAppearance_android_textColor;
                        if (hx0Var2.l(i28)) {
                            colorStateList3 = hx0Var2.b(i28);
                        } else {
                            colorStateList3 = null;
                        }
                        int i29 = lj0.TextAppearance_android_textColorHint;
                        if (hx0Var2.l(i29)) {
                            colorStateList2 = hx0Var2.b(i29);
                        } else {
                            colorStateList2 = null;
                        }
                        int i30 = lj0.TextAppearance_android_textColorLink;
                        if (hx0Var2.l(i30)) {
                            colorStateList = hx0Var2.b(i30);
                        } else {
                            colorStateList = null;
                        }
                    } else {
                        colorStateList = null;
                        colorStateList2 = null;
                        colorStateList3 = null;
                    }
                    i18 = lj0.TextAppearance_textLocale;
                    if (!hx0Var2.l(i18)) {
                        str = hx0Var2.j(i18);
                    } else {
                        str = null;
                    }
                    if (i24 >= 26) {
                        int i31 = lj0.TextAppearance_fontVariationSettings;
                        if (hx0Var2.l(i31)) {
                            str2 = hx0Var2.j(i31);
                            hx0Var2.n();
                        }
                    }
                    str2 = null;
                    hx0Var2.n();
                }
            }
            z = false;
            z2 = false;
            i(context, hx0Var2);
            if (i24 >= 23) {
            }
            i18 = lj0.TextAppearance_textLocale;
            if (!hx0Var2.l(i18)) {
            }
            if (i24 >= 26) {
            }
            str2 = null;
            hx0Var2.n();
        } else {
            z = false;
            colorStateList = null;
            str = null;
            str2 = null;
            colorStateList2 = null;
            colorStateList3 = null;
            z2 = false;
        }
        boolean z6 = z;
        hx0 hx0Var3 = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.TextAppearance, i, 0));
        if (!z5) {
            int i32 = lj0.TextAppearance_textAllCaps;
            if (hx0Var3.l(i32)) {
                z4 = hx0Var3.a(i32, false);
                i2 = 23;
                z3 = true;
                if (i24 < i2) {
                    int i33 = lj0.TextAppearance_android_textColor;
                    if (hx0Var3.l(i33)) {
                        colorStateList3 = hx0Var3.b(i33);
                    }
                    int i34 = lj0.TextAppearance_android_textColorHint;
                    if (hx0Var3.l(i34)) {
                        colorStateList2 = hx0Var3.b(i34);
                    }
                    int i35 = lj0.TextAppearance_android_textColorLink;
                    if (hx0Var3.l(i35)) {
                        colorStateList = hx0Var3.b(i35);
                    }
                }
                i3 = lj0.TextAppearance_textLocale;
                if (hx0Var3.l(i3)) {
                    str = hx0Var3.j(i3);
                }
                if (i24 >= 26) {
                    int i36 = lj0.TextAppearance_fontVariationSettings;
                    if (hx0Var3.l(i36)) {
                        str2 = hx0Var3.j(i36);
                    }
                }
                if (i24 >= 28) {
                    int i37 = lj0.TextAppearance_android_textSize;
                    if (hx0Var3.l(i37)) {
                        n5Var = a2;
                        if (hx0Var3.d(i37, -1) == 0) {
                            this.a.setTextSize(0, 0.0f);
                        }
                        i(context, hx0Var3);
                        hx0Var3.n();
                        if (colorStateList3 != null) {
                            this.a.setTextColor(colorStateList3);
                        }
                        if (colorStateList2 != null) {
                            this.a.setHintTextColor(colorStateList2);
                        }
                        if (colorStateList != null) {
                            this.a.setLinkTextColor(colorStateList);
                        }
                        if (!z5 && z3) {
                            this.a.setAllCaps(z4);
                        }
                        typeface = this.l;
                        if (typeface != null) {
                            if (this.k == -1) {
                                this.a.setTypeface(typeface, this.j);
                            } else {
                                this.a.setTypeface(typeface);
                            }
                        }
                        if (str2 != null) {
                            f6.b(this.a, str2);
                        }
                        if (str != null) {
                            if (i24 >= 24) {
                                this.a.setTextLocales(LocaleList.forLanguageTags(str));
                            } else if (i24 >= 21) {
                                i4 = 0;
                                this.a.setTextLocale(Locale.forLanguageTag(str.substring(0, str.indexOf(44))));
                                o6Var = this.i;
                                obtainStyledAttributes = o6Var.j.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView, i, i4);
                                i5 = lj0.AppCompatTextView_autoSizeTextType;
                                if (obtainStyledAttributes.hasValue(i5)) {
                                    o6Var.a = obtainStyledAttributes.getInt(i5, i4);
                                }
                                i6 = lj0.AppCompatTextView_autoSizeStepGranularity;
                                if (!obtainStyledAttributes.hasValue(i6)) {
                                    f = obtainStyledAttributes.getDimension(i6, -1.0f);
                                } else {
                                    f = -1.0f;
                                }
                                i7 = lj0.AppCompatTextView_autoSizeMinTextSize;
                                if (!obtainStyledAttributes.hasValue(i7)) {
                                    f2 = obtainStyledAttributes.getDimension(i7, -1.0f);
                                } else {
                                    f2 = -1.0f;
                                }
                                i8 = lj0.AppCompatTextView_autoSizeMaxTextSize;
                                if (!obtainStyledAttributes.hasValue(i8)) {
                                    f3 = obtainStyledAttributes.getDimension(i8, -1.0f);
                                } else {
                                    f3 = -1.0f;
                                }
                                i9 = lj0.AppCompatTextView_autoSizePresetSizes;
                                if (obtainStyledAttributes.hasValue(i9) && (resourceId = obtainStyledAttributes.getResourceId(i9, 0)) > 0) {
                                    TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                                    length = obtainTypedArray.length();
                                    int[] iArr = new int[length];
                                    if (length > 0) {
                                        for (int i38 = 0; i38 < length; i38++) {
                                            iArr[i38] = obtainTypedArray.getDimensionPixelSize(i38, -1);
                                        }
                                        o6Var.f = o6.b(iArr);
                                        o6Var.h();
                                    }
                                    obtainTypedArray.recycle();
                                }
                                obtainStyledAttributes.recycle();
                                if (!o6Var.i()) {
                                    if (o6Var.a == 1) {
                                        if (!o6Var.g) {
                                            DisplayMetrics displayMetrics = o6Var.j.getResources().getDisplayMetrics();
                                            if (f2 == -1.0f) {
                                                f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                                            }
                                            if (f3 == -1.0f) {
                                                f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                                            }
                                            if (f == -1.0f) {
                                                f = 1.0f;
                                            }
                                            o6Var.j(f2, f3, f);
                                        }
                                        o6Var.g();
                                    }
                                } else {
                                    o6Var.a = 0;
                                }
                                if (w7.a) {
                                    o6 o6Var2 = this.i;
                                    if (o6Var2.a != 0) {
                                        int[] iArr2 = o6Var2.f;
                                        if (iArr2.length > 0) {
                                            if (g6.a(this.a) != -1.0f) {
                                                h6.b(this.a, Math.round(this.i.d), Math.round(this.i.e), Math.round(this.i.c));
                                            } else {
                                                i6.a(this.a, iArr2);
                                            }
                                        }
                                    }
                                }
                                hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView));
                                i10 = hx0Var.i(lj0.AppCompatTextView_drawableLeftCompat, -1);
                                n5 n5Var2 = n5Var;
                                if (i10 == -1) {
                                    drawable = n5Var2.b(context, i10);
                                } else {
                                    drawable = null;
                                }
                                i11 = hx0Var.i(lj0.AppCompatTextView_drawableTopCompat, -1);
                                if (i11 == -1) {
                                    drawable2 = n5Var2.b(context, i11);
                                } else {
                                    drawable2 = null;
                                }
                                i12 = hx0Var.i(lj0.AppCompatTextView_drawableRightCompat, -1);
                                if (i12 == -1) {
                                    drawable3 = n5Var2.b(context, i12);
                                } else {
                                    drawable3 = null;
                                }
                                i13 = hx0Var.i(lj0.AppCompatTextView_drawableBottomCompat, -1);
                                if (i13 == -1) {
                                    drawable4 = n5Var2.b(context, i13);
                                } else {
                                    drawable4 = null;
                                }
                                i14 = hx0Var.i(lj0.AppCompatTextView_drawableStartCompat, -1);
                                if (i14 == -1) {
                                    drawable5 = n5Var2.b(context, i14);
                                } else {
                                    drawable5 = null;
                                }
                                i15 = hx0Var.i(lj0.AppCompatTextView_drawableEndCompat, -1);
                                if (i15 == -1) {
                                    drawable6 = n5Var2.b(context, i15);
                                } else {
                                    drawable6 = null;
                                }
                                if (drawable5 != null && drawable6 == null) {
                                    if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                                        Drawable[] compoundDrawablesRelative = this.a.getCompoundDrawablesRelative();
                                        Drawable drawable7 = compoundDrawablesRelative[0];
                                        if (drawable7 == null && compoundDrawablesRelative[2] == null) {
                                            Drawable[] compoundDrawables = this.a.getCompoundDrawables();
                                            TextView textView = this.a;
                                            if (drawable == null) {
                                                drawable = compoundDrawables[0];
                                            }
                                            if (drawable2 == null) {
                                                drawable2 = compoundDrawables[1];
                                            }
                                            if (drawable3 == null) {
                                                drawable3 = compoundDrawables[2];
                                            }
                                            if (drawable4 == null) {
                                                drawable4 = compoundDrawables[3];
                                            }
                                            textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                                        } else {
                                            TextView textView2 = this.a;
                                            if (drawable2 == null) {
                                                drawable2 = compoundDrawablesRelative[1];
                                            }
                                            Drawable drawable8 = compoundDrawablesRelative[2];
                                            if (drawable4 == null) {
                                                drawable4 = compoundDrawablesRelative[3];
                                            }
                                            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                                        }
                                    }
                                } else {
                                    Drawable[] compoundDrawablesRelative2 = this.a.getCompoundDrawablesRelative();
                                    TextView textView3 = this.a;
                                    if (drawable5 == null) {
                                        drawable5 = compoundDrawablesRelative2[0];
                                    }
                                    if (drawable2 == null) {
                                        drawable2 = compoundDrawablesRelative2[1];
                                    }
                                    if (drawable6 == null) {
                                        drawable6 = compoundDrawablesRelative2[2];
                                    }
                                    if (drawable4 == null) {
                                        drawable4 = compoundDrawablesRelative2[3];
                                    }
                                    textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
                                }
                                i16 = lj0.AppCompatTextView_drawableTint;
                                if (hx0Var.l(i16)) {
                                    ColorStateList b = hx0Var.b(i16);
                                    TextView textView4 = this.a;
                                    textView4.getClass();
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        textView4.setCompoundDrawableTintList(b);
                                    } else if (textView4 instanceof kx0) {
                                        ((kx0) textView4).setSupportCompoundDrawablesTintList(b);
                                    }
                                }
                                i17 = lj0.AppCompatTextView_drawableTintMode;
                                if (hx0Var.l(i17)) {
                                    PorterDuff.Mode d4 = um.d(hx0Var.h(i17, -1), null);
                                    TextView textView5 = this.a;
                                    textView5.getClass();
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        textView5.setCompoundDrawableTintMode(d4);
                                    } else if (textView5 instanceof kx0) {
                                        ((kx0) textView5).setSupportCompoundDrawablesTintMode(d4);
                                    }
                                }
                                d = hx0Var.d(lj0.AppCompatTextView_firstBaselineToTopHeight, -1);
                                d2 = hx0Var.d(lj0.AppCompatTextView_lastBaselineToBottomHeight, -1);
                                d3 = hx0Var.d(lj0.AppCompatTextView_lineHeight, -1);
                                hx0Var.n();
                                if (d != -1) {
                                    xw0.b(this.a, d);
                                }
                                if (d2 != -1) {
                                    xw0.c(this.a, d2);
                                }
                                if (d3 == -1) {
                                    TextView textView6 = this.a;
                                    ja.a(d3);
                                    int fontMetricsInt = textView6.getPaint().getFontMetricsInt(null);
                                    if (d3 != fontMetricsInt) {
                                        textView6.setLineSpacing(d3 - fontMetricsInt, 1.0f);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                        }
                        i4 = 0;
                        o6Var = this.i;
                        obtainStyledAttributes = o6Var.j.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView, i, i4);
                        i5 = lj0.AppCompatTextView_autoSizeTextType;
                        if (obtainStyledAttributes.hasValue(i5)) {
                        }
                        i6 = lj0.AppCompatTextView_autoSizeStepGranularity;
                        if (!obtainStyledAttributes.hasValue(i6)) {
                        }
                        i7 = lj0.AppCompatTextView_autoSizeMinTextSize;
                        if (!obtainStyledAttributes.hasValue(i7)) {
                        }
                        i8 = lj0.AppCompatTextView_autoSizeMaxTextSize;
                        if (!obtainStyledAttributes.hasValue(i8)) {
                        }
                        i9 = lj0.AppCompatTextView_autoSizePresetSizes;
                        if (obtainStyledAttributes.hasValue(i9)) {
                            TypedArray obtainTypedArray2 = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
                            length = obtainTypedArray2.length();
                            int[] iArr3 = new int[length];
                            if (length > 0) {
                            }
                            obtainTypedArray2.recycle();
                        }
                        obtainStyledAttributes.recycle();
                        if (!o6Var.i()) {
                        }
                        if (w7.a) {
                        }
                        hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView));
                        i10 = hx0Var.i(lj0.AppCompatTextView_drawableLeftCompat, -1);
                        n5 n5Var22 = n5Var;
                        if (i10 == -1) {
                        }
                        i11 = hx0Var.i(lj0.AppCompatTextView_drawableTopCompat, -1);
                        if (i11 == -1) {
                        }
                        i12 = hx0Var.i(lj0.AppCompatTextView_drawableRightCompat, -1);
                        if (i12 == -1) {
                        }
                        i13 = hx0Var.i(lj0.AppCompatTextView_drawableBottomCompat, -1);
                        if (i13 == -1) {
                        }
                        i14 = hx0Var.i(lj0.AppCompatTextView_drawableStartCompat, -1);
                        if (i14 == -1) {
                        }
                        i15 = hx0Var.i(lj0.AppCompatTextView_drawableEndCompat, -1);
                        if (i15 == -1) {
                        }
                        if (drawable5 != null) {
                        }
                        Drawable[] compoundDrawablesRelative22 = this.a.getCompoundDrawablesRelative();
                        TextView textView32 = this.a;
                        if (drawable5 == null) {
                        }
                        if (drawable2 == null) {
                        }
                        if (drawable6 == null) {
                        }
                        if (drawable4 == null) {
                        }
                        textView32.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
                        i16 = lj0.AppCompatTextView_drawableTint;
                        if (hx0Var.l(i16)) {
                        }
                        i17 = lj0.AppCompatTextView_drawableTintMode;
                        if (hx0Var.l(i17)) {
                        }
                        d = hx0Var.d(lj0.AppCompatTextView_firstBaselineToTopHeight, -1);
                        d2 = hx0Var.d(lj0.AppCompatTextView_lastBaselineToBottomHeight, -1);
                        d3 = hx0Var.d(lj0.AppCompatTextView_lineHeight, -1);
                        hx0Var.n();
                        if (d != -1) {
                        }
                        if (d2 != -1) {
                        }
                        if (d3 == -1) {
                        }
                    }
                }
                n5Var = a2;
                i(context, hx0Var3);
                hx0Var3.n();
                if (colorStateList3 != null) {
                }
                if (colorStateList2 != null) {
                }
                if (colorStateList != null) {
                }
                if (!z5) {
                    this.a.setAllCaps(z4);
                }
                typeface = this.l;
                if (typeface != null) {
                }
                if (str2 != null) {
                }
                if (str != null) {
                }
                i4 = 0;
                o6Var = this.i;
                obtainStyledAttributes = o6Var.j.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView, i, i4);
                i5 = lj0.AppCompatTextView_autoSizeTextType;
                if (obtainStyledAttributes.hasValue(i5)) {
                }
                i6 = lj0.AppCompatTextView_autoSizeStepGranularity;
                if (!obtainStyledAttributes.hasValue(i6)) {
                }
                i7 = lj0.AppCompatTextView_autoSizeMinTextSize;
                if (!obtainStyledAttributes.hasValue(i7)) {
                }
                i8 = lj0.AppCompatTextView_autoSizeMaxTextSize;
                if (!obtainStyledAttributes.hasValue(i8)) {
                }
                i9 = lj0.AppCompatTextView_autoSizePresetSizes;
                if (obtainStyledAttributes.hasValue(i9)) {
                }
                obtainStyledAttributes.recycle();
                if (!o6Var.i()) {
                }
                if (w7.a) {
                }
                hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView));
                i10 = hx0Var.i(lj0.AppCompatTextView_drawableLeftCompat, -1);
                n5 n5Var222 = n5Var;
                if (i10 == -1) {
                }
                i11 = hx0Var.i(lj0.AppCompatTextView_drawableTopCompat, -1);
                if (i11 == -1) {
                }
                i12 = hx0Var.i(lj0.AppCompatTextView_drawableRightCompat, -1);
                if (i12 == -1) {
                }
                i13 = hx0Var.i(lj0.AppCompatTextView_drawableBottomCompat, -1);
                if (i13 == -1) {
                }
                i14 = hx0Var.i(lj0.AppCompatTextView_drawableStartCompat, -1);
                if (i14 == -1) {
                }
                i15 = hx0Var.i(lj0.AppCompatTextView_drawableEndCompat, -1);
                if (i15 == -1) {
                }
                if (drawable5 != null) {
                }
                Drawable[] compoundDrawablesRelative222 = this.a.getCompoundDrawablesRelative();
                TextView textView322 = this.a;
                if (drawable5 == null) {
                }
                if (drawable2 == null) {
                }
                if (drawable6 == null) {
                }
                if (drawable4 == null) {
                }
                textView322.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
                i16 = lj0.AppCompatTextView_drawableTint;
                if (hx0Var.l(i16)) {
                }
                i17 = lj0.AppCompatTextView_drawableTintMode;
                if (hx0Var.l(i17)) {
                }
                d = hx0Var.d(lj0.AppCompatTextView_firstBaselineToTopHeight, -1);
                d2 = hx0Var.d(lj0.AppCompatTextView_lastBaselineToBottomHeight, -1);
                d3 = hx0Var.d(lj0.AppCompatTextView_lineHeight, -1);
                hx0Var.n();
                if (d != -1) {
                }
                if (d2 != -1) {
                }
                if (d3 == -1) {
                }
            }
        }
        z3 = z2;
        z4 = z6;
        i2 = 23;
        if (i24 < i2) {
        }
        i3 = lj0.TextAppearance_textLocale;
        if (hx0Var3.l(i3)) {
        }
        if (i24 >= 26) {
        }
        if (i24 >= 28) {
        }
        n5Var = a2;
        i(context, hx0Var3);
        hx0Var3.n();
        if (colorStateList3 != null) {
        }
        if (colorStateList2 != null) {
        }
        if (colorStateList != null) {
        }
        if (!z5) {
        }
        typeface = this.l;
        if (typeface != null) {
        }
        if (str2 != null) {
        }
        if (str != null) {
        }
        i4 = 0;
        o6Var = this.i;
        obtainStyledAttributes = o6Var.j.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView, i, i4);
        i5 = lj0.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i5)) {
        }
        i6 = lj0.AppCompatTextView_autoSizeStepGranularity;
        if (!obtainStyledAttributes.hasValue(i6)) {
        }
        i7 = lj0.AppCompatTextView_autoSizeMinTextSize;
        if (!obtainStyledAttributes.hasValue(i7)) {
        }
        i8 = lj0.AppCompatTextView_autoSizeMaxTextSize;
        if (!obtainStyledAttributes.hasValue(i8)) {
        }
        i9 = lj0.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i9)) {
        }
        obtainStyledAttributes.recycle();
        if (!o6Var.i()) {
        }
        if (w7.a) {
        }
        hx0Var = new hx0(context, context.obtainStyledAttributes(attributeSet, lj0.AppCompatTextView));
        i10 = hx0Var.i(lj0.AppCompatTextView_drawableLeftCompat, -1);
        n5 n5Var2222 = n5Var;
        if (i10 == -1) {
        }
        i11 = hx0Var.i(lj0.AppCompatTextView_drawableTopCompat, -1);
        if (i11 == -1) {
        }
        i12 = hx0Var.i(lj0.AppCompatTextView_drawableRightCompat, -1);
        if (i12 == -1) {
        }
        i13 = hx0Var.i(lj0.AppCompatTextView_drawableBottomCompat, -1);
        if (i13 == -1) {
        }
        i14 = hx0Var.i(lj0.AppCompatTextView_drawableStartCompat, -1);
        if (i14 == -1) {
        }
        i15 = hx0Var.i(lj0.AppCompatTextView_drawableEndCompat, -1);
        if (i15 == -1) {
        }
        if (drawable5 != null) {
        }
        Drawable[] compoundDrawablesRelative2222 = this.a.getCompoundDrawablesRelative();
        TextView textView3222 = this.a;
        if (drawable5 == null) {
        }
        if (drawable2 == null) {
        }
        if (drawable6 == null) {
        }
        if (drawable4 == null) {
        }
        textView3222.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        i16 = lj0.AppCompatTextView_drawableTint;
        if (hx0Var.l(i16)) {
        }
        i17 = lj0.AppCompatTextView_drawableTintMode;
        if (hx0Var.l(i17)) {
        }
        d = hx0Var.d(lj0.AppCompatTextView_firstBaselineToTopHeight, -1);
        d2 = hx0Var.d(lj0.AppCompatTextView_lastBaselineToBottomHeight, -1);
        d3 = hx0Var.d(lj0.AppCompatTextView_lineHeight, -1);
        hx0Var.n();
        if (d != -1) {
        }
        if (d2 != -1) {
        }
        if (d3 == -1) {
        }
    }

    public final void e(Context context, int i) {
        String j;
        ColorStateList b;
        hx0 hx0Var = new hx0(context, context.obtainStyledAttributes(i, lj0.TextAppearance));
        int i2 = lj0.TextAppearance_textAllCaps;
        if (hx0Var.l(i2)) {
            this.a.setAllCaps(hx0Var.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = lj0.TextAppearance_android_textColor;
            if (hx0Var.l(i4) && (b = hx0Var.b(i4)) != null) {
                this.a.setTextColor(b);
            }
        }
        int i5 = lj0.TextAppearance_android_textSize;
        if (hx0Var.l(i5) && hx0Var.d(i5, -1) == 0) {
            this.a.setTextSize(0, 0.0f);
        }
        i(context, hx0Var);
        if (i3 >= 26) {
            int i6 = lj0.TextAppearance_fontVariationSettings;
            if (hx0Var.l(i6) && (j = hx0Var.j(i6)) != null) {
                f6.b(this.a, j);
            }
        }
        hx0Var.n();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.a.setTypeface(typeface, this.j);
        }
    }

    public final void f(int i, int i2, int i3, int i4) {
        o6 o6Var = this.i;
        if (o6Var.i()) {
            DisplayMetrics displayMetrics = o6Var.j.getResources().getDisplayMetrics();
            o6Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (o6Var.g()) {
                o6Var.a();
            }
        }
    }

    public final void g(int[] iArr, int i) {
        o6 o6Var = this.i;
        if (o6Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = o6Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                o6Var.f = o6.b(iArr2);
                if (!o6Var.h()) {
                    StringBuilder b = e5.b("None of the preset sizes is valid: ");
                    b.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(b.toString());
                }
            } else {
                o6Var.g = false;
            }
            if (o6Var.g()) {
                o6Var.a();
            }
        }
    }

    public final void h(int i) {
        o6 o6Var = this.i;
        if (o6Var.i()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = o6Var.j.getResources().getDisplayMetrics();
                    o6Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (o6Var.g()) {
                        o6Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(k6.a("Unknown auto-size text type: ", i));
            }
            o6Var.a = 0;
            o6Var.d = -1.0f;
            o6Var.e = -1.0f;
            o6Var.c = -1.0f;
            o6Var.f = new int[0];
            o6Var.b = false;
        }
    }

    public final void i(Context context, hx0 hx0Var) {
        String j;
        Typeface create;
        Typeface typeface;
        this.j = hx0Var.h(lj0.TextAppearance_android_textStyle, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int h = hx0Var.h(lj0.TextAppearance_android_textFontWeight, -1);
            this.k = h;
            if (h != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = lj0.TextAppearance_android_fontFamily;
        if (!hx0Var.l(i2) && !hx0Var.l(lj0.TextAppearance_fontFamily)) {
            int i3 = lj0.TextAppearance_android_typeface;
            if (hx0Var.l(i3)) {
                this.m = false;
                int h2 = hx0Var.h(i3, 1);
                if (h2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (h2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (h2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = lj0.TextAppearance_fontFamily;
        if (hx0Var.l(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface g = hx0Var.g(i2, this.j, new a(this, i5, i6));
                if (g != null) {
                    if (i >= 28 && this.k != -1) {
                        g = j6.b(Typeface.create(g, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = g;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (j = hx0Var.j(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            create = Typeface.create(j, this.j);
        } else {
            create = j6.b(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
        }
        this.l = create;
    }
}