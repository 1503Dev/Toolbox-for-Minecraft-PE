package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.kr0;
import defpackage.o40;
import java.util.WeakHashMap;

public final class b extends vo {
    public static final boolean o;
    public final a d;
    public final C0031b e;
    public final c f;
    public boolean g;
    public boolean h;
    public long i;
    public StateListDrawable j;
    public o40 k;
    public AccessibilityManager l;
    public ValueAnimator m;
    public ValueAnimator n;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements TextWatcher {

        /* renamed from: com.google.android.material.textfield.b$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class RunnableC0030a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView P;

            public RunnableC0030a(AutoCompleteTextView autoCompleteTextView) {
                this.P = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean isPopupShowing = this.P.isPopupShowing();
                b bVar = b.this;
                boolean z = b.o;
                bVar.g(isPopupShowing);
                b.this.g = isPopupShowing;
            }
        }

        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            b bVar = b.this;
            AutoCompleteTextView c = b.c(bVar, bVar.a.getEditText());
            c.post(new RunnableC0030a(c));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.b$b  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class C0031b extends TextInputLayout.e {
        public C0031b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, defpackage.h0
        public final void d(View view, s0 s0Var) {
            super.d(view, s0Var);
            s0Var.h(Spinner.class.getName());
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 26) {
                z = j0.c(s0Var.a);
            } else {
                Bundle extras = s0Var.a.getExtras();
                if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4) {
                    z = true;
                }
            }
            if (z) {
                s0Var.k(null);
            }
        }

        @Override // defpackage.h0
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            super.e(view, accessibilityEvent);
            b bVar = b.this;
            AutoCompleteTextView c = b.c(bVar, bVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && b.this.l.isTouchExplorationEnabled()) {
                b.d(b.this, c);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements TextInputLayout.f {
        public c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public final void a(TextInputLayout textInputLayout) {
            Drawable drawable;
            AutoCompleteTextView c = b.c(b.this, textInputLayout.getEditText());
            b bVar = b.this;
            boolean z = b.o;
            if (z) {
                int boxBackgroundMode = bVar.a.getBoxBackgroundMode();
                if (boxBackgroundMode == 2) {
                    drawable = bVar.k;
                } else if (boxBackgroundMode == 1) {
                    drawable = bVar.j;
                }
                c.setDropDownBackgroundDrawable(drawable);
            } else {
                bVar.getClass();
            }
            b.e(b.this, c);
            b bVar2 = b.this;
            bVar2.getClass();
            c.setOnTouchListener(new xm(bVar2, c));
            c.setOnFocusChangeListener(new ym(bVar2));
            if (z) {
                c.setOnDismissListener(new zm(bVar2));
            }
            c.setThreshold(0);
            c.removeTextChangedListener(b.this.d);
            c.addTextChangedListener(b.this.d);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            textInputLayout.setTextInputAccessibilityDelegate(b.this.e);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            b.d(b.this, (AutoCompleteTextView) b.this.a.getEditText());
        }
    }

    static {
        o = Build.VERSION.SDK_INT >= 21;
    }

    public b(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.d = new a();
        this.e = new C0031b(this.a);
        this.f = new c();
        this.g = false;
        this.h = false;
        this.i = RecyclerView.FOREVER_NS;
    }

    public static AutoCompleteTextView c(b bVar, EditText editText) {
        bVar.getClass();
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void d(b bVar, AutoCompleteTextView autoCompleteTextView) {
        boolean z;
        if (autoCompleteTextView == null) {
            bVar.getClass();
            return;
        }
        bVar.getClass();
        long currentTimeMillis = System.currentTimeMillis() - bVar.i;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.g = false;
        }
        if (!bVar.g) {
            if (o) {
                bVar.g(!bVar.h);
            } else {
                bVar.h = !bVar.h;
                bVar.c.toggle();
            }
            if (bVar.h) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        bVar.g = false;
    }

    public static void e(b bVar, AutoCompleteTextView autoCompleteTextView) {
        LayerDrawable layerDrawable;
        bVar.getClass();
        if (autoCompleteTextView.getKeyListener() == null) {
            int boxBackgroundMode = bVar.a.getBoxBackgroundMode();
            o40 boxBackground = bVar.a.getBoxBackground();
            int a2 = nu2.a(autoCompleteTextView, gh0.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                int a3 = nu2.a(autoCompleteTextView, gh0.colorSurface);
                o40 o40Var = new o40(boxBackground.P.a);
                int c2 = nu2.c(0.1f, a2, a3);
                o40Var.i(new ColorStateList(iArr, new int[]{c2, 0}));
                if (o) {
                    o40Var.setTint(a3);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{c2, a3});
                    o40 o40Var2 = new o40(boxBackground.P.a);
                    o40Var2.setTint(-1);
                    layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, o40Var, o40Var2), boxBackground});
                } else {
                    layerDrawable = new LayerDrawable(new Drawable[]{o40Var, boxBackground});
                }
                WeakHashMap<View, String> weakHashMap = a41.a;
                autoCompleteTextView.setBackground(layerDrawable);
            } else if (boxBackgroundMode == 1) {
                int boxBackgroundColor = bVar.a.getBoxBackgroundColor();
                int[] iArr2 = {nu2.c(0.1f, a2, boxBackgroundColor), boxBackgroundColor};
                if (o) {
                    RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(iArr, iArr2), boxBackground, boxBackground);
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    autoCompleteTextView.setBackground(rippleDrawable);
                    return;
                }
                o40 o40Var3 = new o40(boxBackground.P.a);
                o40Var3.i(new ColorStateList(iArr, iArr2));
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{boxBackground, o40Var3});
                WeakHashMap<View, String> weakHashMap3 = a41.a;
                int paddingStart = autoCompleteTextView.getPaddingStart();
                int paddingTop = autoCompleteTextView.getPaddingTop();
                int paddingEnd = autoCompleteTextView.getPaddingEnd();
                int paddingBottom = autoCompleteTextView.getPaddingBottom();
                autoCompleteTextView.setBackground(layerDrawable2);
                autoCompleteTextView.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            }
        }
    }

    @Override // defpackage.vo
    public final void a() {
        int i;
        float dimensionPixelOffset = this.b.getResources().getDimensionPixelOffset(rh0.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.b.getResources().getDimensionPixelOffset(rh0.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.b.getResources().getDimensionPixelOffset(rh0.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        o40 f = f(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        o40 f2 = f(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.k = f;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, f);
        this.j.addState(new int[0], f2);
        if (o) {
            i = wh0.mtrl_dropdown_arrow;
        } else {
            i = wh0.mtrl_ic_arrow_drop_down;
        }
        this.a.setEndIconDrawable(z5.b(this.b, i));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(ui0.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new d());
        TextInputLayout textInputLayout2 = this.a;
        c cVar = this.f;
        textInputLayout2.E0.add(cVar);
        if (textInputLayout2.R != null) {
            cVar.a(textInputLayout2);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        LinearInterpolator linearInterpolator = i4.a;
        ofFloat.setInterpolator(linearInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new bn(this));
        this.n = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(linearInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new bn(this));
        this.m = ofFloat2;
        ofFloat2.addListener(new an(this));
        CheckableImageButton checkableImageButton = this.c;
        WeakHashMap<View, String> weakHashMap = a41.a;
        checkableImageButton.setImportantForAccessibility(2);
        this.l = (AccessibilityManager) this.b.getSystemService("accessibility");
    }

    @Override // defpackage.vo
    public final boolean b(int i) {
        return i != 0;
    }

    public final o40 f(float f, float f2, float f3, int i) {
        kr0.a aVar = new kr0.a();
        aVar.e = new d0(f);
        aVar.f = new d0(f);
        aVar.h = new d0(f2);
        aVar.g = new d0(f2);
        kr0 kr0Var = new kr0(aVar);
        Context context = this.b;
        Paint paint = o40.k0;
        int b = y30.b(gh0.colorSurface, context, o40.class.getSimpleName());
        o40 o40Var = new o40();
        o40Var.g(context);
        o40Var.i(ColorStateList.valueOf(b));
        o40Var.h(f3);
        o40Var.setShapeAppearanceModel(kr0Var);
        o40.b bVar = o40Var.P;
        if (bVar.h == null) {
            bVar.h = new Rect();
        }
        o40Var.P.h.set(0, i, 0, i);
        o40Var.i0 = o40Var.P.h;
        o40Var.invalidateSelf();
        return o40Var;
    }

    public final void g(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.n.cancel();
            this.m.start();
        }
    }
}