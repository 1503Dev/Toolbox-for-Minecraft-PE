package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.kr0;
import defpackage.o40;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public class TextInputLayout extends LinearLayout {
    public static final int g1 = zi0.Widget_Design_TextInputLayout;
    public PorterDuff.Mode A0;
    public boolean B0;
    public ColorDrawable C0;
    public View.OnLongClickListener D0;
    public final LinkedHashSet<f> E0;
    public int F0;
    public final SparseArray<vo> G0;
    public final CheckableImageButton H0;
    public final LinkedHashSet<g> I0;
    public ColorStateList J0;
    public boolean K0;
    public PorterDuff.Mode L0;
    public boolean M0;
    public ColorDrawable N0;
    public Drawable O0;
    public final FrameLayout P;
    public final CheckableImageButton P0;
    public final FrameLayout Q;
    public View.OnLongClickListener Q0;
    public EditText R;
    public ColorStateList R0;
    public CharSequence S;
    public ColorStateList S0;
    public final jx T;
    public final int T0;
    public boolean U;
    public final int U0;
    public int V;
    public int V0;
    public boolean W;
    public int W0;
    public final int X0;
    public final int Y0;
    public final int Z0;
    public AppCompatTextView a0;
    public boolean a1;
    public int b0;
    public final nd b1;
    public int c0;
    public boolean c1;
    public ColorStateList d0;
    public ValueAnimator d1;
    public ColorStateList e0;
    public boolean e1;
    public boolean f0;
    public boolean f1;
    public CharSequence g0;
    public boolean h0;
    public o40 i0;
    public o40 j0;
    public kr0 k0;
    public final int l0;
    public int m0;
    public final int n0;
    public int o0;
    public final int p0;
    public final int q0;
    public int r0;
    public int s0;
    public final Rect t0;
    public final Rect u0;
    public final RectF v0;
    public Typeface w0;
    public final CheckableImageButton x0;
    public ColorStateList y0;
    public boolean z0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.r(!textInputLayout.f1, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.U) {
                textInputLayout2.m(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.H0.performClick();
            TextInputLayout.this.H0.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            TextInputLayout.this.R.requestLayout();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.b1.j(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends h0 {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        @Override // defpackage.h0
        public void d(View view, s0 s0Var) {
            Editable editable;
            boolean z;
            this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
            EditText editText = this.d.getEditText();
            if (editText != null) {
                editable = editText.getText();
            } else {
                editable = null;
            }
            CharSequence hint = this.d.getHint();
            CharSequence error = this.d.getError();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(editable);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = false;
            if (!z4 && TextUtils.isEmpty(counterOverflowDescription)) {
                z = false;
            } else {
                z = true;
            }
            if (z2) {
                s0Var.a.setText(editable);
            } else if (z3) {
                s0Var.a.setText(hint);
            }
            if (z3) {
                s0Var.k(hint);
                if (!z2 && z3) {
                    z5 = true;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    q0.b(s0Var.a, z5);
                } else {
                    s0Var.g(4, z5);
                }
            }
            if (z) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    s0Var.a.setError(error);
                }
                s0Var.a.setContentInvalid(true);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class h extends c0 {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public CharSequence R;
        public boolean S;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<h> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new h[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.R = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.S = parcel.readInt() == 1;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public final String toString() {
            StringBuilder b = e5.b("TextInputLayout.SavedState{");
            b.append(Integer.toHexString(System.identityHashCode(this)));
            b.append(" error=");
            b.append((Object) this.R);
            b.append("}");
            return b.toString();
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            TextUtils.writeToParcel(this.R, parcel, i);
            parcel.writeInt(this.S ? 1 : 0);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gh0.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v48 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(yw0.d(context, attributeSet, i, r9), attributeSet, i);
        ?? r2;
        int colorForState;
        int i2 = g1;
        this.T = new jx(this);
        this.t0 = new Rect();
        this.u0 = new Rect();
        this.v0 = new RectF();
        this.E0 = new LinkedHashSet<>();
        this.F0 = 0;
        SparseArray<vo> sparseArray = new SparseArray<>();
        this.G0 = sparseArray;
        this.I0 = new LinkedHashSet<>();
        nd ndVar = new nd(this);
        this.b1 = ndVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.P = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.Q = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 8388629));
        frameLayout.addView(frameLayout2);
        LinearInterpolator linearInterpolator = i4.a;
        ndVar.H = linearInterpolator;
        ndVar.h();
        ndVar.G = linearInterpolator;
        ndVar.h();
        if (ndVar.h != 8388659) {
            ndVar.h = 8388659;
            ndVar.h();
        }
        int[] iArr = ij0.TextInputLayout;
        int i3 = ij0.TextInputLayout_counterTextAppearance;
        int i4 = ij0.TextInputLayout_counterOverflowTextAppearance;
        int i5 = ij0.TextInputLayout_errorTextAppearance;
        int i6 = ij0.TextInputLayout_helperTextTextAppearance;
        int i7 = ij0.TextInputLayout_hintTextAppearance;
        yw0.a(context2, attributeSet, i, i2);
        yw0.b(context2, attributeSet, iArr, i, i2, i3, i4, i5, i6, i7);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        hx0 hx0Var = new hx0(context2, obtainStyledAttributes);
        this.f0 = hx0Var.a(ij0.TextInputLayout_hintEnabled, true);
        setHint(hx0Var.k(ij0.TextInputLayout_android_hint));
        this.c1 = hx0Var.a(ij0.TextInputLayout_hintAnimationEnabled, true);
        this.k0 = new kr0(kr0.b(context2, attributeSet, i, i2));
        this.l0 = context2.getResources().getDimensionPixelOffset(rh0.mtrl_textinput_box_label_cutout_padding);
        this.n0 = hx0Var.c(ij0.TextInputLayout_boxCollapsedPaddingTop, 0);
        int d2 = hx0Var.d(ij0.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(rh0.mtrl_textinput_box_stroke_width_default));
        this.p0 = d2;
        this.q0 = hx0Var.d(ij0.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(rh0.mtrl_textinput_box_stroke_width_focused));
        this.o0 = d2;
        float dimension = obtainStyledAttributes.getDimension(ij0.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(ij0.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(ij0.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(ij0.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        kr0 kr0Var = this.k0;
        kr0Var.getClass();
        kr0.a aVar = new kr0.a(kr0Var);
        if (dimension >= 0.0f) {
            aVar.e = new d0(dimension);
        }
        if (dimension2 >= 0.0f) {
            aVar.f = new d0(dimension2);
        }
        if (dimension3 >= 0.0f) {
            aVar.g = new d0(dimension3);
        }
        if (dimension4 >= 0.0f) {
            aVar.h = new d0(dimension4);
        }
        this.k0 = new kr0(aVar);
        ColorStateList a2 = n40.a(context2, hx0Var, ij0.TextInputLayout_boxBackgroundColor);
        if (a2 != null) {
            int defaultColor = a2.getDefaultColor();
            this.W0 = defaultColor;
            this.s0 = defaultColor;
            if (a2.isStateful()) {
                this.X0 = a2.getColorForState(new int[]{-16842910}, -1);
                colorForState = a2.getColorForState(new int[]{16843623}, -1);
            } else {
                ColorStateList a3 = z5.a(context2, mh0.mtrl_filled_background_color);
                this.X0 = a3.getColorForState(new int[]{-16842910}, -1);
                colorForState = a3.getColorForState(new int[]{16843623}, -1);
            }
            this.Y0 = colorForState;
        } else {
            this.s0 = 0;
            this.W0 = 0;
            this.X0 = 0;
            this.Y0 = 0;
        }
        int i8 = ij0.TextInputLayout_android_textColorHint;
        if (hx0Var.l(i8)) {
            ColorStateList b2 = hx0Var.b(i8);
            this.S0 = b2;
            this.R0 = b2;
        }
        int i9 = ij0.TextInputLayout_boxStrokeColor;
        ColorStateList a4 = n40.a(context2, hx0Var, i9);
        if (a4 != null && a4.isStateful()) {
            this.T0 = a4.getDefaultColor();
            this.Z0 = a4.getColorForState(new int[]{-16842910}, -1);
            this.U0 = a4.getColorForState(new int[]{16843623}, -1);
            this.V0 = a4.getColorForState(new int[]{16842908}, -1);
        } else {
            this.V0 = obtainStyledAttributes.getColor(i9, 0);
            this.T0 = cg.a(context2, mh0.mtrl_textinput_default_box_stroke_color);
            this.Z0 = cg.a(context2, mh0.mtrl_textinput_disabled_color);
            this.U0 = cg.a(context2, mh0.mtrl_textinput_hovered_box_stroke_color);
        }
        if (hx0Var.i(i7, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(hx0Var.i(i7, 0));
        } else {
            r2 = 0;
        }
        int i10 = hx0Var.i(i5, r2);
        boolean a5 = hx0Var.a(ij0.TextInputLayout_errorEnabled, r2);
        LayoutInflater from = LayoutInflater.from(getContext());
        int i11 = ki0.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(i11, frameLayout, (boolean) r2);
        this.P0 = checkableImageButton;
        frameLayout.addView(checkableImageButton);
        checkableImageButton.setVisibility(8);
        int i12 = ij0.TextInputLayout_errorIconDrawable;
        if (hx0Var.l(i12)) {
            setErrorIconDrawable(hx0Var.e(i12));
        }
        int i13 = ij0.TextInputLayout_errorIconTint;
        if (hx0Var.l(i13)) {
            setErrorIconTintList(n40.a(context2, hx0Var, i13));
        }
        int i14 = ij0.TextInputLayout_errorIconTintMode;
        if (hx0Var.l(i14)) {
            setErrorIconTintMode(b51.b(hx0Var.h(i14, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(ui0.error_icon_content_description));
        WeakHashMap<View, String> weakHashMap = a41.a;
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int i15 = hx0Var.i(i6, 0);
        boolean a6 = hx0Var.a(ij0.TextInputLayout_helperTextEnabled, false);
        CharSequence k = hx0Var.k(ij0.TextInputLayout_helperText);
        boolean a7 = hx0Var.a(ij0.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(hx0Var.h(ij0.TextInputLayout_counterMaxLength, -1));
        this.c0 = hx0Var.i(i3, 0);
        this.b0 = hx0Var.i(i4, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(ki0.design_text_input_start_icon, (ViewGroup) frameLayout, false);
        this.x0 = checkableImageButton2;
        frameLayout.addView(checkableImageButton2);
        checkableImageButton2.setVisibility(8);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i16 = ij0.TextInputLayout_startIconDrawable;
        if (hx0Var.l(i16)) {
            setStartIconDrawable(hx0Var.e(i16));
            int i17 = ij0.TextInputLayout_startIconContentDescription;
            if (hx0Var.l(i17)) {
                setStartIconContentDescription(hx0Var.k(i17));
            }
            setStartIconCheckable(hx0Var.a(ij0.TextInputLayout_startIconCheckable, true));
        }
        int i18 = ij0.TextInputLayout_startIconTint;
        if (hx0Var.l(i18)) {
            setStartIconTintList(n40.a(context2, hx0Var, i18));
        }
        int i19 = ij0.TextInputLayout_startIconTintMode;
        if (hx0Var.l(i19)) {
            setStartIconTintMode(b51.b(hx0Var.h(i19, -1), null));
        }
        setHelperTextEnabled(a6);
        setHelperText(k);
        setHelperTextTextAppearance(i15);
        setErrorEnabled(a5);
        setErrorTextAppearance(i10);
        setCounterTextAppearance(this.c0);
        setCounterOverflowTextAppearance(this.b0);
        int i20 = ij0.TextInputLayout_errorTextColor;
        if (hx0Var.l(i20)) {
            setErrorTextColor(hx0Var.b(i20));
        }
        int i21 = ij0.TextInputLayout_helperTextTextColor;
        if (hx0Var.l(i21)) {
            setHelperTextColor(hx0Var.b(i21));
        }
        int i22 = ij0.TextInputLayout_hintTextColor;
        if (hx0Var.l(i22)) {
            setHintTextColor(hx0Var.b(i22));
        }
        int i23 = ij0.TextInputLayout_counterTextColor;
        if (hx0Var.l(i23)) {
            setCounterTextColor(hx0Var.b(i23));
        }
        int i24 = ij0.TextInputLayout_counterOverflowTextColor;
        if (hx0Var.l(i24)) {
            setCounterOverflowTextColor(hx0Var.b(i24));
        }
        setCounterEnabled(a7);
        setBoxBackgroundMode(hx0Var.h(ij0.TextInputLayout_boxBackgroundMode, 0));
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i11, (ViewGroup) frameLayout2, false);
        this.H0 = checkableImageButton3;
        frameLayout2.addView(checkableImageButton3);
        checkableImageButton3.setVisibility(8);
        sparseArray.append(-1, new fh(this));
        sparseArray.append(0, new q90(this));
        sparseArray.append(1, new com.google.android.material.textfield.c(this));
        sparseArray.append(2, new com.google.android.material.textfield.a(this));
        sparseArray.append(3, new com.google.android.material.textfield.b(this));
        int i25 = ij0.TextInputLayout_endIconMode;
        if (hx0Var.l(i25)) {
            setEndIconMode(hx0Var.h(i25, 0));
            int i26 = ij0.TextInputLayout_endIconDrawable;
            if (hx0Var.l(i26)) {
                setEndIconDrawable(hx0Var.e(i26));
            }
            int i27 = ij0.TextInputLayout_endIconContentDescription;
            if (hx0Var.l(i27)) {
                setEndIconContentDescription(hx0Var.k(i27));
            }
            setEndIconCheckable(hx0Var.a(ij0.TextInputLayout_endIconCheckable, true));
        } else {
            int i28 = ij0.TextInputLayout_passwordToggleEnabled;
            if (hx0Var.l(i28)) {
                setEndIconMode(hx0Var.a(i28, false) ? 1 : 0);
                setEndIconDrawable(hx0Var.e(ij0.TextInputLayout_passwordToggleDrawable));
                setEndIconContentDescription(hx0Var.k(ij0.TextInputLayout_passwordToggleContentDescription));
                int i29 = ij0.TextInputLayout_passwordToggleTint;
                if (hx0Var.l(i29)) {
                    setEndIconTintList(n40.a(context2, hx0Var, i29));
                }
                int i30 = ij0.TextInputLayout_passwordToggleTintMode;
                if (hx0Var.l(i30)) {
                    setEndIconTintMode(b51.b(hx0Var.h(i30, -1), null));
                }
            }
        }
        if (!hx0Var.l(ij0.TextInputLayout_passwordToggleEnabled)) {
            int i31 = ij0.TextInputLayout_endIconTint;
            if (hx0Var.l(i31)) {
                setEndIconTintList(n40.a(context2, hx0Var, i31));
            }
            int i32 = ij0.TextInputLayout_endIconTintMode;
            if (hx0Var.l(i32)) {
                setEndIconTintMode(b51.b(hx0Var.h(i32, -1), null));
            }
        }
        hx0Var.n();
        setImportantForAccessibility(2);
    }

    public static void d(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = km.h(drawable).mutate();
            if (z) {
                km.f(drawable, colorStateList);
            }
            if (z2) {
                km.g(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private vo getEndIconDelegate() {
        vo voVar = this.G0.get(this.F0);
        return voVar != null ? voVar : this.G0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        boolean z;
        if (this.P0.getVisibility() == 0) {
            return this.P0;
        }
        if (this.F0 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && g()) {
            return this.H0;
        }
        return null;
    }

    public static void j(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                j((ViewGroup) childAt, z);
            }
        }
    }

    public static void k(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        WeakHashMap<View, String> weakHashMap = a41.a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        z2 = (hasOnClickListeners || z) ? true : true;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }

    private void setEditText(EditText editText) {
        boolean z;
        boolean z2;
        if (this.R == null) {
            if (this.F0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.R = editText;
            h();
            setTextInputAccessibilityDelegate(new e(this));
            nd ndVar = this.b1;
            Typeface typeface = this.R.getTypeface();
            bc bcVar = ndVar.v;
            if (bcVar != null) {
                bcVar.h = true;
            }
            if (ndVar.s != typeface) {
                ndVar.s = typeface;
                z = true;
            } else {
                z = false;
            }
            if (ndVar.t != typeface) {
                ndVar.t = typeface;
                z2 = true;
            } else {
                z2 = false;
            }
            if (z || z2) {
                ndVar.h();
            }
            nd ndVar2 = this.b1;
            float textSize = this.R.getTextSize();
            if (ndVar2.i != textSize) {
                ndVar2.i = textSize;
                ndVar2.h();
            }
            int gravity = this.R.getGravity();
            nd ndVar3 = this.b1;
            int i = (gravity & (-113)) | 48;
            if (ndVar3.h != i) {
                ndVar3.h = i;
                ndVar3.h();
            }
            nd ndVar4 = this.b1;
            if (ndVar4.g != gravity) {
                ndVar4.g = gravity;
                ndVar4.h();
            }
            this.R.addTextChangedListener(new a());
            if (this.R0 == null) {
                this.R0 = this.R.getHintTextColors();
            }
            if (this.f0) {
                if (TextUtils.isEmpty(this.g0)) {
                    CharSequence hint = this.R.getHint();
                    this.S = hint;
                    setHint(hint);
                    this.R.setHint((CharSequence) null);
                }
                this.h0 = true;
            }
            if (this.a0 != null) {
                m(this.R.getText().length());
            }
            o();
            this.T.b();
            this.x0.bringToFront();
            this.Q.bringToFront();
            this.P0.bringToFront();
            Iterator<f> it = this.E0.iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            r(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z) {
        int i;
        CheckableImageButton checkableImageButton = this.P0;
        int i2 = 8;
        boolean z2 = false;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        FrameLayout frameLayout = this.Q;
        if (!z) {
            i2 = 0;
        }
        frameLayout.setVisibility(i2);
        if (this.F0 != 0) {
            z2 = true;
        }
        if (!z2) {
            p();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.g0)) {
            this.g0 = charSequence;
            nd ndVar = this.b1;
            if (charSequence == null || !TextUtils.equals(ndVar.w, charSequence)) {
                ndVar.w = charSequence;
                ndVar.x = null;
                Bitmap bitmap = ndVar.z;
                if (bitmap != null) {
                    bitmap.recycle();
                    ndVar.z = null;
                }
                ndVar.h();
            }
            if (!this.a1) {
                i();
            }
        }
    }

    public final void a(float f2) {
        if (this.b1.c == f2) {
            return;
        }
        if (this.d1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.d1 = valueAnimator;
            valueAnimator.setInterpolator(i4.b);
            this.d1.setDuration(167L);
            this.d1.addUpdateListener(new d());
        }
        this.d1.setFloatValues(this.b1.c, f2);
        this.d1.start();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.P.addView(view, layoutParams2);
        this.P.setLayoutParams(layoutParams);
        q();
        setEditText((EditText) view);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b() {
        boolean z;
        o40 o40Var;
        int i;
        boolean z2;
        o40 o40Var2 = this.i0;
        if (o40Var2 == null) {
            return;
        }
        o40Var2.setShapeAppearanceModel(this.k0);
        boolean z3 = false;
        if (this.m0 == 2) {
            if (this.o0 > -1 && this.r0 != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = true;
                if (z) {
                    o40 o40Var3 = this.i0;
                    int i2 = this.r0;
                    o40Var3.P.k = this.o0;
                    o40Var3.invalidateSelf();
                    ColorStateList valueOf = ColorStateList.valueOf(i2);
                    o40.b bVar = o40Var3.P;
                    if (bVar.d != valueOf) {
                        bVar.d = valueOf;
                        o40Var3.onStateChange(o40Var3.getState());
                    }
                }
                int i3 = this.s0;
                if (this.m0 == 1) {
                    TypedValue a2 = y30.a(getContext(), gh0.colorSurface);
                    if (a2 != null) {
                        i = a2.data;
                    } else {
                        i = 0;
                    }
                    i3 = be.a(this.s0, i);
                }
                this.s0 = i3;
                this.i0.i(ColorStateList.valueOf(i3));
                if (this.F0 == 3) {
                    this.R.getBackground().invalidateSelf();
                }
                o40Var = this.j0;
                if (o40Var != null) {
                    if (this.o0 > -1 && this.r0 != 0) {
                        z3 = true;
                    }
                    if (z3) {
                        o40Var.i(ColorStateList.valueOf(this.r0));
                    }
                    invalidate();
                }
                invalidate();
            }
        }
        z = false;
        if (z) {
        }
        int i32 = this.s0;
        if (this.m0 == 1) {
        }
        this.s0 = i32;
        this.i0.i(ColorStateList.valueOf(i32));
        if (this.F0 == 3) {
        }
        o40Var = this.j0;
        if (o40Var != null) {
        }
        invalidate();
    }

    public final void c() {
        d(this.H0, this.K0, this.J0, this.M0, this.L0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.S == null || (editText = this.R) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.h0;
        this.h0 = false;
        CharSequence hint = editText.getHint();
        this.R.setHint(this.S);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.R.setHint(hint);
            this.h0 = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f1 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f0) {
            nd ndVar = this.b1;
            ndVar.getClass();
            int save = canvas.save();
            if (ndVar.x != null && ndVar.b) {
                float f2 = ndVar.q;
                float f3 = ndVar.r;
                ndVar.E.ascent();
                ndVar.E.descent();
                float f4 = ndVar.A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                CharSequence charSequence = ndVar.x;
                canvas.drawText(charSequence, 0, charSequence.length(), f2, f3, ndVar.E);
            }
            canvas.restoreToCount(save);
        }
        o40 o40Var = this.j0;
        if (o40Var != null) {
            Rect bounds = o40Var.getBounds();
            bounds.top = bounds.bottom - this.o0;
            this.j0.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        if (this.e1) {
            return;
        }
        boolean z4 = true;
        this.e1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        nd ndVar = this.b1;
        if (ndVar != null) {
            ndVar.C = drawableState;
            ColorStateList colorStateList2 = ndVar.l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = ndVar.k) != null && colorStateList.isStateful())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                ndVar.h();
                z3 = true;
            } else {
                z3 = false;
            }
            z = z3 | false;
        } else {
            z = false;
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        r((isLaidOut() && isEnabled()) ? false : false, false);
        o();
        s();
        if (z) {
            invalidate();
        }
        this.e1 = false;
    }

    public final int e() {
        float d2;
        if (this.f0) {
            int i = this.m0;
            if (i == 0 || i == 1) {
                d2 = this.b1.d();
            } else if (i != 2) {
                return 0;
            } else {
                d2 = this.b1.d() / 2.0f;
            }
            return (int) d2;
        }
        return 0;
    }

    public final boolean f() {
        return this.f0 && !TextUtils.isEmpty(this.g0) && (this.i0 instanceof uh);
    }

    public final boolean g() {
        return this.Q.getVisibility() == 0 && this.H0.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.R;
        if (editText != null) {
            return e() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public o40 getBoxBackground() {
        int i = this.m0;
        if (i == 1 || i == 2) {
            return this.i0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.s0;
    }

    public int getBoxBackgroundMode() {
        return this.m0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        o40 o40Var = this.i0;
        return o40Var.P.a.h.a(o40Var.f());
    }

    public float getBoxCornerRadiusBottomStart() {
        o40 o40Var = this.i0;
        return o40Var.P.a.g.a(o40Var.f());
    }

    public float getBoxCornerRadiusTopEnd() {
        o40 o40Var = this.i0;
        return o40Var.P.a.f.a(o40Var.f());
    }

    public float getBoxCornerRadiusTopStart() {
        o40 o40Var = this.i0;
        return o40Var.P.a.e.a(o40Var.f());
    }

    public int getBoxStrokeColor() {
        return this.V0;
    }

    public int getCounterMaxLength() {
        return this.V;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.U && this.W && (appCompatTextView = this.a0) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.d0;
    }

    public ColorStateList getCounterTextColor() {
        return this.d0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.R0;
    }

    public EditText getEditText() {
        return this.R;
    }

    public CharSequence getEndIconContentDescription() {
        return this.H0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.H0.getDrawable();
    }

    public int getEndIconMode() {
        return this.F0;
    }

    public CheckableImageButton getEndIconView() {
        return this.H0;
    }

    public CharSequence getError() {
        jx jxVar = this.T;
        if (jxVar.l) {
            return jxVar.k;
        }
        return null;
    }

    public int getErrorCurrentTextColors() {
        return this.T.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.P0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.T.g();
    }

    public CharSequence getHelperText() {
        jx jxVar = this.T;
        if (jxVar.q) {
            return jxVar.p;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.T.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f0) {
            return this.g0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.b1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        nd ndVar = this.b1;
        return ndVar.e(ndVar.l);
    }

    public ColorStateList getHintTextColor() {
        return this.S0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.H0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.H0.getDrawable();
    }

    public CharSequence getStartIconContentDescription() {
        return this.x0.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.x0.getDrawable();
    }

    public Typeface getTypeface() {
        return this.w0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        EditText editText;
        o40 o40Var;
        int i = this.m0;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.f0 && !(this.i0 instanceof uh)) {
                        o40Var = new uh(this.k0);
                    } else {
                        o40Var = new o40(this.k0);
                    }
                    this.i0 = o40Var;
                } else {
                    throw new IllegalArgumentException(this.m0 + " is illegal; only @BoxBackgroundMode constants are supported.");
                }
            } else {
                this.i0 = new o40(this.k0);
                this.j0 = new o40();
                editText = this.R;
                if ((editText != null || this.i0 == null || editText.getBackground() != null || this.m0 == 0) ? false : false) {
                    EditText editText2 = this.R;
                    o40 o40Var2 = this.i0;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    editText2.setBackground(o40Var2);
                }
                s();
                if (this.m0 == 0) {
                    q();
                    return;
                }
                return;
            }
        } else {
            this.i0 = null;
        }
        this.j0 = null;
        editText = this.R;
        if ((editText != null || this.i0 == null || editText.getBackground() != null || this.m0 == 0) ? false : false) {
        }
        s();
        if (this.m0 == 0) {
        }
    }

    public final void i() {
        float measureText;
        float f2;
        float f3;
        float measureText2;
        if (!f()) {
            return;
        }
        RectF rectF = this.v0;
        nd ndVar = this.b1;
        boolean b2 = ndVar.b(ndVar.w);
        Rect rect = ndVar.e;
        if (!b2) {
            f2 = rect.left;
        } else {
            float f4 = rect.right;
            if (ndVar.w == null) {
                measureText = 0.0f;
            } else {
                TextPaint textPaint = ndVar.F;
                textPaint.setTextSize(ndVar.j);
                textPaint.setTypeface(ndVar.s);
                TextPaint textPaint2 = ndVar.F;
                CharSequence charSequence = ndVar.w;
                measureText = textPaint2.measureText(charSequence, 0, charSequence.length());
            }
            f2 = f4 - measureText;
        }
        rectF.left = f2;
        Rect rect2 = ndVar.e;
        rectF.top = rect2.top;
        if (!b2) {
            if (ndVar.w == null) {
                measureText2 = 0.0f;
            } else {
                TextPaint textPaint3 = ndVar.F;
                textPaint3.setTextSize(ndVar.j);
                textPaint3.setTypeface(ndVar.s);
                TextPaint textPaint4 = ndVar.F;
                CharSequence charSequence2 = ndVar.w;
                measureText2 = textPaint4.measureText(charSequence2, 0, charSequence2.length());
            }
            f3 = measureText2 + f2;
        } else {
            f3 = rect2.right;
        }
        rectF.right = f3;
        float d2 = ndVar.d() + ndVar.e.top;
        float f5 = rectF.left;
        float f6 = this.l0;
        rectF.left = f5 - f6;
        rectF.top -= f6;
        rectF.right += f6;
        rectF.bottom = d2 + f6;
        rectF.offset(-getPaddingLeft(), 0.0f);
        uh uhVar = (uh) this.i0;
        uhVar.getClass();
        uhVar.m(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(TextView textView, int i) {
        boolean z = true;
        try {
            xw0.e(textView, i);
            if (Build.VERSION.SDK_INT >= 23) {
            }
            z = false;
        } catch (Exception unused) {
        }
        if (z) {
            xw0.e(textView, zi0.TextAppearance_AppCompat_Caption);
            textView.setTextColor(cg.a(getContext(), mh0.design_error));
        }
    }

    public final void m(int i) {
        boolean z;
        int i2;
        boolean z2 = this.W;
        if (this.V == -1) {
            this.a0.setText(String.valueOf(i));
            this.a0.setContentDescription(null);
            this.W = false;
        } else {
            AppCompatTextView appCompatTextView = this.a0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (appCompatTextView.getAccessibilityLiveRegion() == 1) {
                this.a0.setAccessibilityLiveRegion(0);
            }
            if (i > this.V) {
                z = true;
            } else {
                z = false;
            }
            this.W = z;
            Context context = getContext();
            AppCompatTextView appCompatTextView2 = this.a0;
            int i3 = this.V;
            if (this.W) {
                i2 = ui0.character_counter_overflowed_content_description;
            } else {
                i2 = ui0.character_counter_content_description;
            }
            appCompatTextView2.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i3)));
            if (z2 != this.W) {
                n();
                if (this.W) {
                    this.a0.setAccessibilityLiveRegion(1);
                }
            }
            this.a0.setText(getContext().getString(ui0.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.V)));
        }
        if (this.R != null && z2 != this.W) {
            r(false, false);
            s();
            o();
        }
    }

    public final void n() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.a0;
        if (appCompatTextView != null) {
            l(appCompatTextView, this.W ? this.b0 : this.c0);
            if (!this.W && (colorStateList2 = this.d0) != null) {
                this.a0.setTextColor(colorStateList2);
            }
            if (!this.W || (colorStateList = this.e0) == null) {
                return;
            }
            this.a0.setTextColor(colorStateList);
        }
    }

    public final void o() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        int currentTextColor;
        EditText editText = this.R;
        if (editText == null || this.m0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (um.a(background)) {
            background = background.mutate();
        }
        if (this.T.e()) {
            currentTextColor = this.T.g();
        } else if (!this.W || (appCompatTextView = this.a0) == null) {
            km.a(background);
            this.R.refreshDrawableState();
            return;
        } else {
            currentTextColor = appCompatTextView.getCurrentTextColor();
        }
        background.setColorFilter(n5.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0148  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        Rect rect;
        boolean z2;
        boolean z3;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.R;
        if (editText != null) {
            Rect rect2 = this.t0;
            rk.a(this, editText, rect2);
            o40 o40Var = this.j0;
            if (o40Var != null) {
                int i9 = rect2.bottom;
                o40Var.setBounds(rect2.left, i9 - this.q0, rect2.right, i9);
            }
            if (this.f0) {
                nd ndVar = this.b1;
                EditText editText2 = this.R;
                if (editText2 != null) {
                    Rect rect3 = this.u0;
                    rect3.bottom = rect2.bottom;
                    int i10 = this.m0;
                    if (i10 != 1) {
                        if (i10 != 2) {
                            rect3.left = editText2.getCompoundPaddingLeft() + rect2.left;
                            i5 = getPaddingTop();
                        } else {
                            rect3.left = editText2.getPaddingLeft() + rect2.left;
                            rect3.top = rect2.top - e();
                            i7 = rect2.right;
                            i6 = this.R.getPaddingRight();
                            rect3.right = i7 - i6;
                            ndVar.getClass();
                            i8 = rect3.left;
                            int i11 = rect3.top;
                            int i12 = rect3.right;
                            int i13 = rect3.bottom;
                            rect = ndVar.e;
                            boolean z4 = false;
                            if (rect.left != i8 && rect.top == i11 && rect.right == i12 && rect.bottom == i13) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                rect.set(i8, i11, i12, i13);
                                ndVar.D = true;
                                ndVar.g();
                            }
                            nd ndVar2 = this.b1;
                            if (this.R == null) {
                                Rect rect4 = this.u0;
                                TextPaint textPaint = ndVar2.F;
                                textPaint.setTextSize(ndVar2.i);
                                textPaint.setTypeface(ndVar2.t);
                                float f2 = -ndVar2.F.ascent();
                                rect4.left = this.R.getCompoundPaddingLeft() + rect2.left;
                                if (this.m0 == 1 && this.R.getMinLines() <= 1) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    compoundPaddingTop = (int) (rect2.centerY() - (f2 / 2.0f));
                                } else {
                                    compoundPaddingTop = rect2.top + this.R.getCompoundPaddingTop();
                                }
                                rect4.top = compoundPaddingTop;
                                rect4.right = rect2.right - this.R.getCompoundPaddingRight();
                                if (this.m0 == 1) {
                                    compoundPaddingBottom = (int) (rect4.top + f2);
                                } else {
                                    compoundPaddingBottom = rect2.bottom - this.R.getCompoundPaddingBottom();
                                }
                                rect4.bottom = compoundPaddingBottom;
                                int i14 = rect4.left;
                                int i15 = rect4.top;
                                int i16 = rect4.right;
                                Rect rect5 = ndVar2.d;
                                if (rect5.left == i14 && rect5.top == i15 && rect5.right == i16 && rect5.bottom == compoundPaddingBottom) {
                                    z4 = true;
                                }
                                if (!z4) {
                                    rect5.set(i14, i15, i16, compoundPaddingBottom);
                                    ndVar2.D = true;
                                    ndVar2.g();
                                }
                                this.b1.h();
                                if (f() && !this.a1) {
                                    i();
                                    return;
                                }
                                return;
                            }
                            throw new IllegalStateException();
                        }
                    } else {
                        rect3.left = editText2.getCompoundPaddingLeft() + rect2.left;
                        i5 = rect2.top + this.n0;
                    }
                    rect3.top = i5;
                    i7 = rect2.right;
                    i6 = this.R.getCompoundPaddingRight();
                    rect3.right = i7 - i6;
                    ndVar.getClass();
                    i8 = rect3.left;
                    int i112 = rect3.top;
                    int i122 = rect3.right;
                    int i132 = rect3.bottom;
                    rect = ndVar.e;
                    boolean z42 = false;
                    if (rect.left != i8) {
                    }
                    z2 = false;
                    if (!z2) {
                    }
                    nd ndVar22 = this.b1;
                    if (this.R == null) {
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.R != null && this.R.getMeasuredHeight() < (max = Math.max(this.H0.getMeasuredHeight(), this.x0.getMeasuredHeight()))) {
            this.R.setMinimumHeight(max);
            z = true;
        }
        boolean p = p();
        if (z || p) {
            this.R.post(new c());
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.P);
        setError(hVar.R);
        if (hVar.S) {
            this.H0.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        h hVar = new h(super.onSaveInstanceState());
        if (this.T.e()) {
            hVar.R = getError();
        }
        boolean z2 = true;
        if (this.F0 != 0) {
            z = true;
        } else {
            z = false;
        }
        hVar.S = (z && this.H0.isChecked()) ? false : false;
        return hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean p() {
        boolean z;
        boolean z2;
        CheckableImageButton endIconToUpdateDummyDrawable;
        boolean z3;
        if (this.R == null) {
            return false;
        }
        boolean z4 = true;
        if (getStartIconDrawable() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.x0.getVisibility() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && this.x0.getMeasuredWidth() > 0) {
                if (this.C0 == null) {
                    this.C0 = new ColorDrawable();
                    this.C0.setBounds(0, 0, ((ViewGroup.MarginLayoutParams) this.x0.getLayoutParams()).getMarginEnd() + (this.x0.getMeasuredWidth() - this.R.getPaddingLeft()), 1);
                }
                Drawable[] compoundDrawablesRelative = this.R.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable = this.C0;
                if (drawable != colorDrawable) {
                    this.R.setCompoundDrawablesRelative(colorDrawable, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z2 = true;
                    endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
                    if (endIconToUpdateDummyDrawable == null && endIconToUpdateDummyDrawable.getMeasuredWidth() > 0) {
                        if (this.N0 == null) {
                            this.N0 = new ColorDrawable();
                            this.N0.setBounds(0, 0, ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + (endIconToUpdateDummyDrawable.getMeasuredWidth() - this.R.getPaddingRight()), 1);
                        }
                        Drawable[] compoundDrawablesRelative2 = this.R.getCompoundDrawablesRelative();
                        Drawable drawable2 = compoundDrawablesRelative2[2];
                        ColorDrawable colorDrawable2 = this.N0;
                        if (drawable2 != colorDrawable2) {
                            this.O0 = drawable2;
                            this.R.setCompoundDrawablesRelative(compoundDrawablesRelative2[0], compoundDrawablesRelative2[1], colorDrawable2, compoundDrawablesRelative2[3]);
                        } else {
                            z4 = z2;
                        }
                    } else if (this.N0 == null) {
                        Drawable[] compoundDrawablesRelative3 = this.R.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.N0) {
                            this.R.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.O0, compoundDrawablesRelative3[3]);
                        } else {
                            z4 = z2;
                        }
                        this.N0 = null;
                    } else {
                        return z2;
                    }
                    return z4;
                }
                z2 = false;
                endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
                if (endIconToUpdateDummyDrawable == null) {
                }
                if (this.N0 == null) {
                }
            }
        }
        if (this.C0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.R.getCompoundDrawablesRelative();
            this.R.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.C0 = null;
            z2 = true;
            endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable == null) {
            }
            if (this.N0 == null) {
            }
        }
        z2 = false;
        endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
        if (endIconToUpdateDummyDrawable == null) {
        }
        if (this.N0 == null) {
        }
    }

    public final void q() {
        if (this.m0 != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.P.getLayoutParams();
            int e2 = e();
            if (e2 != layoutParams.topMargin) {
                layoutParams.topMargin = e2;
                this.P.requestLayout();
            }
        }
    }

    public final void r(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        nd ndVar;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        boolean isEnabled = isEnabled();
        EditText editText = this.R;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.R;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean e2 = this.T.e();
        ColorStateList colorStateList3 = this.R0;
        if (colorStateList3 != null) {
            this.b1.i(colorStateList3);
            nd ndVar2 = this.b1;
            ColorStateList colorStateList4 = this.R0;
            if (ndVar2.k != colorStateList4) {
                ndVar2.k = colorStateList4;
                ndVar2.h();
            }
        }
        if (!isEnabled) {
            this.b1.i(ColorStateList.valueOf(this.Z0));
            nd ndVar3 = this.b1;
            ColorStateList valueOf = ColorStateList.valueOf(this.Z0);
            if (ndVar3.k != valueOf) {
                ndVar3.k = valueOf;
                ndVar3.h();
            }
        } else if (e2) {
            nd ndVar4 = this.b1;
            AppCompatTextView appCompatTextView2 = this.T.m;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            ndVar4.i(colorStateList2);
        } else {
            if (this.W && (appCompatTextView = this.a0) != null) {
                ndVar = this.b1;
                colorStateList = appCompatTextView.getTextColors();
            } else if (z4 && (colorStateList = this.S0) != null) {
                ndVar = this.b1;
            }
            ndVar.i(colorStateList);
        }
        if (!z3 && (!isEnabled() || (!z4 && !e2))) {
            if (z2 || !this.a1) {
                ValueAnimator valueAnimator = this.d1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.d1.cancel();
                }
                if (z && this.c1) {
                    a(0.0f);
                } else {
                    this.b1.j(0.0f);
                }
                if (f() && (!((uh) this.i0).m0.isEmpty()) && f()) {
                    ((uh) this.i0).m(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.a1 = true;
            }
        } else if (z2 || this.a1) {
            ValueAnimator valueAnimator2 = this.d1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.d1.cancel();
            }
            if (z && this.c1) {
                a(1.0f);
            } else {
                this.b1.j(1.0f);
            }
            this.a1 = false;
            if (f()) {
                i();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        boolean z;
        boolean z2;
        int i;
        AppCompatTextView appCompatTextView;
        boolean z3;
        int i2;
        int i3;
        EditText editText;
        EditText editText2;
        if (this.i0 != null && this.m0 != 0) {
            boolean z4 = false;
            if (!isFocused() && ((editText2 = this.R) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (!isHovered() && ((editText = this.R) == null || !editText.isHovered())) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!isEnabled()) {
                i = this.Z0;
            } else if (this.T.e()) {
                i = this.T.g();
            } else if (this.W && (appCompatTextView = this.a0) != null) {
                i = appCompatTextView.getCurrentTextColor();
            } else if (z) {
                i = this.V0;
            } else if (z2) {
                i = this.U0;
            } else {
                i = this.T0;
            }
            this.r0 = i;
            if (this.T.e()) {
                vo endIconDelegate = getEndIconDelegate();
                endIconDelegate.getClass();
                if (endIconDelegate instanceof com.google.android.material.textfield.b) {
                    z3 = true;
                    if (!z3 && getEndIconDrawable() != null) {
                        Drawable mutate = km.h(getEndIconDrawable()).mutate();
                        km.e(mutate, this.T.g());
                        this.H0.setImageDrawable(mutate);
                    } else {
                        c();
                    }
                    if (getErrorIconDrawable() != null) {
                        jx jxVar = this.T;
                        if (jxVar.l && jxVar.e()) {
                            z4 = true;
                        }
                    }
                    setErrorIconVisible(z4);
                    if ((!z2 || z) && isEnabled()) {
                        i2 = this.q0;
                    } else {
                        i2 = this.p0;
                    }
                    this.o0 = i2;
                    if (this.m0 == 1) {
                        if (!isEnabled()) {
                            i3 = this.X0;
                        } else if (z2) {
                            i3 = this.Y0;
                        } else {
                            i3 = this.W0;
                        }
                        this.s0 = i3;
                    }
                    b();
                }
            }
            z3 = false;
            if (!z3) {
            }
            c();
            if (getErrorIconDrawable() != null) {
            }
            setErrorIconVisible(z4);
            if (!z2) {
            }
            i2 = this.q0;
            this.o0 = i2;
            if (this.m0 == 1) {
            }
            b();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            this.W0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(cg.a(getContext(), i));
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.m0) {
            return;
        }
        this.m0 = i;
        if (this.R != null) {
            h();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.V0 != i) {
            this.V0 = i;
            s();
        }
    }

    public void setCounterEnabled(boolean z) {
        int length;
        if (this.U != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.a0 = appCompatTextView;
                appCompatTextView.setId(fi0.textinput_counter);
                Typeface typeface = this.w0;
                if (typeface != null) {
                    this.a0.setTypeface(typeface);
                }
                this.a0.setMaxLines(1);
                this.T.a(this.a0, 2);
                n();
                if (this.a0 != null) {
                    EditText editText = this.R;
                    if (editText == null) {
                        length = 0;
                    } else {
                        length = editText.getText().length();
                    }
                    m(length);
                }
            } else {
                this.T.i(this.a0, 2);
                this.a0 = null;
            }
            this.U = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.V != i) {
            if (i <= 0) {
                i = -1;
            }
            this.V = i;
            if (!this.U || this.a0 == null) {
                return;
            }
            EditText editText = this.R;
            m(editText == null ? 0 : editText.getText().length());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.b0 != i) {
            this.b0 = i;
            n();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.e0 != colorStateList) {
            this.e0 = colorStateList;
            n();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.c0 != i) {
            this.c0 = i;
            n();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            n();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.R0 = colorStateList;
        this.S0 = colorStateList;
        if (this.R != null) {
            r(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        j(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.H0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.H0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.H0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? z5.b(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.H0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.F0;
        this.F0 = i;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().b(this.m0)) {
            getEndIconDelegate().a();
            c();
            Iterator<g> it = this.I0.iterator();
            while (it.hasNext()) {
                it.next().a(this, i2);
            }
            return;
        }
        StringBuilder b2 = e5.b("The current box background mode ");
        b2.append(this.m0);
        b2.append(" is not supported by the end icon mode ");
        b2.append(i);
        throw new IllegalStateException(b2.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.H0;
        View.OnLongClickListener onLongClickListener = this.Q0;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.Q0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.H0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.J0 != colorStateList) {
            this.J0 = colorStateList;
            this.K0 = true;
            c();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.L0 != mode) {
            this.L0 = mode;
            this.M0 = true;
            c();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (g() != z) {
            this.H0.setVisibility(z ? 0 : 4);
            p();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.T.l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            jx jxVar = this.T;
            jxVar.c();
            jxVar.k = charSequence;
            jxVar.m.setText(charSequence);
            int i = jxVar.i;
            if (i != 1) {
                jxVar.j = 1;
            }
            jxVar.k(i, jxVar.j, jxVar.j(jxVar.m, charSequence));
            return;
        }
        this.T.h();
    }

    public void setErrorEnabled(boolean z) {
        jx jxVar = this.T;
        if (jxVar.l != z) {
            jxVar.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(jxVar.a, null);
                jxVar.m = appCompatTextView;
                appCompatTextView.setId(fi0.textinput_error);
                Typeface typeface = jxVar.u;
                if (typeface != null) {
                    jxVar.m.setTypeface(typeface);
                }
                int i = jxVar.n;
                jxVar.n = i;
                AppCompatTextView appCompatTextView2 = jxVar.m;
                if (appCompatTextView2 != null) {
                    jxVar.b.l(appCompatTextView2, i);
                }
                ColorStateList colorStateList = jxVar.o;
                jxVar.o = colorStateList;
                AppCompatTextView appCompatTextView3 = jxVar.m;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                jxVar.m.setVisibility(4);
                AppCompatTextView appCompatTextView4 = jxVar.m;
                WeakHashMap<View, String> weakHashMap = a41.a;
                appCompatTextView4.setAccessibilityLiveRegion(1);
                jxVar.a(jxVar.m, 0);
            } else {
                jxVar.h();
                jxVar.i(jxVar.m, 0);
                jxVar.m = null;
                jxVar.b.o();
                jxVar.b.s();
            }
            jxVar.l = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? z5.b(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        boolean z;
        this.P0.setImageDrawable(drawable);
        if (drawable != null && this.T.l) {
            z = true;
        } else {
            z = false;
        }
        setErrorIconVisible(z);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Drawable drawable = this.P0.getDrawable();
        if (drawable != null) {
            drawable = km.h(drawable).mutate();
            km.f(drawable, colorStateList);
        }
        if (this.P0.getDrawable() != drawable) {
            this.P0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.P0.getDrawable();
        if (drawable != null) {
            drawable = km.h(drawable).mutate();
            km.g(drawable, mode);
        }
        if (this.P0.getDrawable() != drawable) {
            this.P0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        jx jxVar = this.T;
        jxVar.n = i;
        AppCompatTextView appCompatTextView = jxVar.m;
        if (appCompatTextView != null) {
            jxVar.b.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        jx jxVar = this.T;
        jxVar.o = colorStateList;
        AppCompatTextView appCompatTextView = jxVar.m;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.T.q) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.T.q) {
            setHelperTextEnabled(true);
        }
        jx jxVar = this.T;
        jxVar.c();
        jxVar.p = charSequence;
        jxVar.r.setText(charSequence);
        int i = jxVar.i;
        if (i != 2) {
            jxVar.j = 2;
        }
        jxVar.k(i, jxVar.j, jxVar.j(jxVar.r, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        jx jxVar = this.T;
        jxVar.t = colorStateList;
        AppCompatTextView appCompatTextView = jxVar.r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        jx jxVar = this.T;
        if (jxVar.q != z) {
            jxVar.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(jxVar.a, null);
                jxVar.r = appCompatTextView;
                appCompatTextView.setId(fi0.textinput_helper_text);
                Typeface typeface = jxVar.u;
                if (typeface != null) {
                    jxVar.r.setTypeface(typeface);
                }
                jxVar.r.setVisibility(4);
                AppCompatTextView appCompatTextView2 = jxVar.r;
                WeakHashMap<View, String> weakHashMap = a41.a;
                appCompatTextView2.setAccessibilityLiveRegion(1);
                int i = jxVar.s;
                jxVar.s = i;
                AppCompatTextView appCompatTextView3 = jxVar.r;
                if (appCompatTextView3 != null) {
                    xw0.e(appCompatTextView3, i);
                }
                ColorStateList colorStateList = jxVar.t;
                jxVar.t = colorStateList;
                AppCompatTextView appCompatTextView4 = jxVar.r;
                if (appCompatTextView4 != null && colorStateList != null) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                jxVar.a(jxVar.r, 1);
            } else {
                jxVar.c();
                int i2 = jxVar.i;
                if (i2 == 2) {
                    jxVar.j = 0;
                }
                jxVar.k(i2, jxVar.j, jxVar.j(jxVar.r, null));
                jxVar.i(jxVar.r, 1);
                jxVar.r = null;
                jxVar.b.o();
                jxVar.b.s();
            }
            jxVar.q = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        jx jxVar = this.T;
        jxVar.s = i;
        AppCompatTextView appCompatTextView = jxVar.r;
        if (appCompatTextView != null) {
            xw0.e(appCompatTextView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f0) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.c1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f0) {
            this.f0 = z;
            if (z) {
                CharSequence hint = this.R.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.g0)) {
                        setHint(hint);
                    }
                    this.R.setHint((CharSequence) null);
                }
                this.h0 = true;
            } else {
                this.h0 = false;
                if (!TextUtils.isEmpty(this.g0) && TextUtils.isEmpty(this.R.getHint())) {
                    this.R.setHint(this.g0);
                }
                setHintInternal(null);
            }
            if (this.R != null) {
                q();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        nd ndVar = this.b1;
        iw0 iw0Var = new iw0(ndVar.a.getContext(), i);
        ColorStateList colorStateList = iw0Var.b;
        if (colorStateList != null) {
            ndVar.l = colorStateList;
        }
        float f2 = iw0Var.a;
        if (f2 != 0.0f) {
            ndVar.j = f2;
        }
        ColorStateList colorStateList2 = iw0Var.f;
        if (colorStateList2 != null) {
            ndVar.L = colorStateList2;
        }
        ndVar.J = iw0Var.g;
        ndVar.K = iw0Var.h;
        ndVar.I = iw0Var.i;
        bc bcVar = ndVar.v;
        if (bcVar != null) {
            bcVar.h = true;
        }
        md mdVar = new md(ndVar);
        iw0Var.a();
        ndVar.v = new bc(mdVar, iw0Var.l);
        iw0Var.b(ndVar.a.getContext(), ndVar.v);
        ndVar.h();
        this.S0 = this.b1.l;
        if (this.R != null) {
            r(false, false);
            q();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.S0 != colorStateList) {
            if (this.R0 == null) {
                this.b1.i(colorStateList);
            }
            this.S0 = colorStateList;
            if (this.R != null) {
                r(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.H0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? z5.b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.H0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.F0 != 1) {
            setEndIconMode(1);
        } else if (z) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.J0 = colorStateList;
        this.K0 = true;
        c();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.L0 = mode;
        this.M0 = true;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.x0.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.x0.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? z5.b(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.x0.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            d(this.x0, this.z0, this.y0, this.B0, this.A0);
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.x0;
        View.OnLongClickListener onLongClickListener = this.D0;
        checkableImageButton.setOnClickListener(onClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.D0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.x0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        k(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.y0 != colorStateList) {
            this.y0 = colorStateList;
            this.z0 = true;
            d(this.x0, true, colorStateList, this.B0, this.A0);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.A0 != mode) {
            this.A0 = mode;
            this.B0 = true;
            d(this.x0, this.z0, this.y0, true, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        boolean z2;
        int i = 0;
        if (this.x0.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            CheckableImageButton checkableImageButton = this.x0;
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            p();
        }
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.R;
        if (editText != null) {
            a41.n(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        boolean z;
        if (typeface != this.w0) {
            this.w0 = typeface;
            nd ndVar = this.b1;
            bc bcVar = ndVar.v;
            boolean z2 = true;
            if (bcVar != null) {
                bcVar.h = true;
            }
            if (ndVar.s != typeface) {
                ndVar.s = typeface;
                z = true;
            } else {
                z = false;
            }
            if (ndVar.t != typeface) {
                ndVar.t = typeface;
            } else {
                z2 = false;
            }
            if (z || z2) {
                ndVar.h();
            }
            jx jxVar = this.T;
            if (typeface != jxVar.u) {
                jxVar.u = typeface;
                AppCompatTextView appCompatTextView = jxVar.m;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = jxVar.r;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.a0;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }
}