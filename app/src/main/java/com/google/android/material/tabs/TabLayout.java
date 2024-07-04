package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b1;
import defpackage.f9;
import defpackage.t41;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

@t41.b
public class TabLayout extends HorizontalScrollView {
    public static final if0 E0 = new if0(16);
    public g A0;
    public b B0;
    public boolean C0;
    public final hf0 D0;
    public final ArrayList<f> P;
    public f Q;
    public final RectF R;
    public final e S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public ColorStateList b0;
    public ColorStateList c0;
    public ColorStateList d0;
    public Drawable e0;
    public PorterDuff.Mode f0;
    public float g0;
    public float h0;
    public final int i0;
    public int j0;
    public final int k0;
    public final int l0;
    public final int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final ArrayList<d> v0;
    public i w0;
    public final HashMap<c<? extends f>, d> x0;
    public ValueAnimator y0;
    public t41 z0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements t41.e {
        public b() {
        }

        @Override // defpackage.t41.e
        public final void a(t41 t41Var) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.z0 == t41Var) {
                tabLayout.g();
            }
        }
    }

    @Deprecated
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c<T extends f> {
        void a();

        void b();

        void c();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface d {
        void a(f fVar);

        void b(f fVar);

        void c(f fVar);
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends LinearLayout {
        public int P;
        public final Paint Q;
        public final GradientDrawable R;
        public int S;
        public float T;
        public int U;
        public int V;
        public int W;
        public ValueAnimator a0;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;
            public final /* synthetic */ int c;
            public final /* synthetic */ int d;

            public a(int i, int i2, int i3, int i4) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.d = i4;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float animatedFraction = valueAnimator.getAnimatedFraction();
                e eVar = e.this;
                int i = this.a;
                int i2 = this.b;
                LinearInterpolator linearInterpolator = i4.a;
                int round = Math.round((i2 - i) * animatedFraction) + i;
                int i3 = this.c;
                int round2 = Math.round(animatedFraction * (this.d - i3)) + i3;
                if (round != eVar.V || round2 != eVar.W) {
                    eVar.V = round;
                    eVar.W = round2;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    eVar.postInvalidateOnAnimation();
                }
            }
        }

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class b extends AnimatorListenerAdapter {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                e eVar = e.this;
                eVar.S = this.a;
                eVar.T = 0.0f;
            }
        }

        public e(Context context) {
            super(context);
            this.S = -1;
            this.U = -1;
            this.V = -1;
            this.W = -1;
            setWillNotDraw(false);
            this.Q = new Paint();
            this.R = new GradientDrawable();
        }

        public final void a(int i, int i2) {
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.a0.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                c();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            TabLayout tabLayout = TabLayout.this;
            if (!tabLayout.t0 && (childAt instanceof h)) {
                b((h) childAt, tabLayout.R);
                RectF rectF = TabLayout.this.R;
                left = (int) rectF.left;
                right = (int) rectF.right;
            }
            int i3 = left;
            int i4 = right;
            int i5 = this.V;
            int i6 = this.W;
            if (i5 != i3 || i6 != i4) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.a0 = valueAnimator2;
                valueAnimator2.setInterpolator(i4.b);
                valueAnimator2.setDuration(i2);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(new a(i5, i3, i6, i4));
                valueAnimator2.addListener(new b(i));
                valueAnimator2.start();
            }
        }

        public final void b(h hVar, RectF rectF) {
            int contentWidth = hVar.getContentWidth();
            int a2 = (int) b51.a(getContext(), 24);
            if (contentWidth < a2) {
                contentWidth = a2;
            }
            int right = (hVar.getRight() + hVar.getLeft()) / 2;
            int i = contentWidth / 2;
            rectF.set(right - i, 0.0f, right + i, 0.0f);
        }

        public final void c() {
            int i;
            View childAt = getChildAt(this.S);
            int i2 = -1;
            if (childAt != null && childAt.getWidth() > 0) {
                int left = childAt.getLeft();
                int right = childAt.getRight();
                TabLayout tabLayout = TabLayout.this;
                if (!tabLayout.t0 && (childAt instanceof h)) {
                    b((h) childAt, tabLayout.R);
                    RectF rectF = TabLayout.this.R;
                    left = (int) rectF.left;
                    right = (int) rectF.right;
                }
                if (this.T > 0.0f && this.S < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.S + 1);
                    int left2 = childAt2.getLeft();
                    int right2 = childAt2.getRight();
                    TabLayout tabLayout2 = TabLayout.this;
                    if (!tabLayout2.t0 && (childAt2 instanceof h)) {
                        b((h) childAt2, tabLayout2.R);
                        RectF rectF2 = TabLayout.this.R;
                        left2 = (int) rectF2.left;
                        right2 = (int) rectF2.right;
                    }
                    float f = this.T;
                    float f2 = 1.0f - f;
                    i2 = (int) ((left * f2) + (left2 * f));
                    i = (int) ((f2 * right) + (right2 * f));
                } else {
                    i2 = left;
                    i = right;
                }
            } else {
                i = -1;
            }
            if (i2 != this.V || i != this.W) {
                this.V = i2;
                this.W = i;
                WeakHashMap<View, String> weakHashMap = a41.a;
                postInvalidateOnAnimation();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void draw(Canvas canvas) {
            int i;
            Drawable drawable;
            Paint paint;
            Drawable drawable2 = TabLayout.this.e0;
            int i2 = 0;
            int intrinsicHeight = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
            int i3 = this.P;
            if (i3 >= 0) {
                intrinsicHeight = i3;
            }
            int i4 = TabLayout.this.q0;
            if (i4 != 0) {
                if (i4 == 1) {
                    i2 = (getHeight() - intrinsicHeight) / 2;
                    intrinsicHeight = (getHeight() + intrinsicHeight) / 2;
                } else if (i4 != 2) {
                    if (i4 != 3) {
                        intrinsicHeight = 0;
                    }
                }
                i = this.V;
                if (i >= 0 && this.W > i) {
                    drawable = TabLayout.this.e0;
                    if (drawable == null) {
                        drawable = this.R;
                    }
                    Drawable h = km.h(drawable);
                    h.setBounds(this.V, i2, this.W, intrinsicHeight);
                    paint = this.Q;
                    if (paint != null) {
                        int i5 = Build.VERSION.SDK_INT;
                        int color = paint.getColor();
                        if (i5 == 21) {
                            h.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                        } else {
                            km.e(h, color);
                        }
                    }
                    h.draw(canvas);
                }
                super.draw(canvas);
            }
            i2 = getHeight() - intrinsicHeight;
            intrinsicHeight = getHeight();
            i = this.V;
            if (i >= 0) {
                drawable = TabLayout.this.e0;
                if (drawable == null) {
                }
                Drawable h2 = km.h(drawable);
                h2.setBounds(this.V, i2, this.W, intrinsicHeight);
                paint = this.Q;
                if (paint != null) {
                }
                h2.draw(canvas);
            }
            super.draw(canvas);
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.a0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                c();
                return;
            }
            this.a0.cancel();
            a(this.S, Math.round((1.0f - this.a0.getAnimatedFraction()) * ((float) this.a0.getDuration())));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (View.MeasureSpec.getMode(i) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z = true;
            if (tabLayout.o0 == 1 || tabLayout.r0 == 2) {
                int childCount = getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        i3 = Math.max(i3, childAt.getMeasuredWidth());
                    }
                }
                if (i3 <= 0) {
                    return;
                }
                if (i3 * childCount <= getMeasuredWidth() - (((int) b51.a(getContext(), 16)) * 2)) {
                    boolean z2 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                            layoutParams.width = i3;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                    }
                    z = z2;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.o0 = 0;
                    tabLayout2.k(false);
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT >= 23 || this.U == i) {
                return;
            }
            requestLayout();
            this.U = i;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class f {
        public Object a;
        public Drawable b;
        public CharSequence c;
        public CharSequence d;
        public View f;
        public TabLayout h;
        public h i;
        public int e = -1;
        public int g = 1;
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g implements t41.f {
        public g(TabLayout tabLayout) {
            new WeakReference(tabLayout);
        }

        @Override // defpackage.t41.f
        public final void a(int i) {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class h extends LinearLayout {
        public static final /* synthetic */ int d0 = 0;
        public f P;
        public TextView Q;
        public ImageView R;
        public View S;
        public f9 T;
        public View U;
        public TextView V;
        public ImageView W;
        public Drawable a0;
        public int b0;

        public h(Context context) {
            super(context);
            this.b0 = 2;
            g(context);
            int i = TabLayout.this.T;
            int i2 = TabLayout.this.U;
            int i3 = TabLayout.this.V;
            int i4 = TabLayout.this.W;
            WeakHashMap<View, String> weakHashMap = a41.a;
            setPaddingRelative(i, i2, i3, i4);
            setGravity(17);
            setOrientation(!TabLayout.this.s0 ? 1 : 0);
            setClickable(true);
            ef0 a = ef0.a(getContext());
            if (Build.VERSION.SDK_INT >= 24) {
                setPointerIcon((PointerIcon) a.a);
            }
            a41.n(this, null);
        }

        private f9 getBadge() {
            return this.T;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getContentWidth() {
            View[] viewArr = {this.Q, this.R, this.U};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    i2 = z ? Math.min(i2, view.getLeft()) : view.getLeft();
                    i = z ? Math.max(i, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return i - i2;
        }

        private f9 getOrCreateBadge() {
            ViewGroup viewGroup;
            if (this.T == null) {
                Context context = getContext();
                int i = f9.g0;
                int i2 = f9.f0;
                f9 f9Var = new f9(context);
                TypedArray e = yw0.e(context, null, ij0.Badge, i, i2, new int[0]);
                int i3 = e.getInt(ij0.Badge_maxCharacterCount, 4);
                f9.a aVar = f9Var.W;
                if (aVar.T != i3) {
                    aVar.T = i3;
                    double d = i3;
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    f9Var.Z = ((int) Math.pow(10.0d, d - 1.0d)) - 1;
                    f9Var.R.d = true;
                    f9Var.e();
                    f9Var.invalidateSelf();
                }
                int i4 = ij0.Badge_number;
                if (e.hasValue(i4)) {
                    int max = Math.max(0, e.getInt(i4, 0));
                    f9.a aVar2 = f9Var.W;
                    if (aVar2.S != max) {
                        aVar2.S = max;
                        f9Var.R.d = true;
                        f9Var.e();
                        f9Var.invalidateSelf();
                    }
                }
                int defaultColor = n40.b(context, e, ij0.Badge_backgroundColor).getDefaultColor();
                f9Var.W.P = defaultColor;
                ColorStateList valueOf = ColorStateList.valueOf(defaultColor);
                o40 o40Var = f9Var.Q;
                if (o40Var.P.c != valueOf) {
                    o40Var.i(valueOf);
                    f9Var.invalidateSelf();
                }
                int i5 = ij0.Badge_badgeTextColor;
                if (e.hasValue(i5)) {
                    int defaultColor2 = n40.b(context, e, i5).getDefaultColor();
                    f9Var.W.Q = defaultColor2;
                    if (f9Var.R.a.getColor() != defaultColor2) {
                        f9Var.R.a.setColor(defaultColor2);
                        f9Var.invalidateSelf();
                    }
                }
                int i6 = e.getInt(ij0.Badge_badgeGravity, 8388661);
                f9.a aVar3 = f9Var.W;
                if (aVar3.W != i6) {
                    aVar3.W = i6;
                    WeakReference<View> weakReference = f9Var.d0;
                    if (weakReference != null && weakReference.get() != null) {
                        View view = f9Var.d0.get();
                        WeakReference<ViewGroup> weakReference2 = f9Var.e0;
                        if (weakReference2 != null) {
                            viewGroup = weakReference2.get();
                        } else {
                            viewGroup = null;
                        }
                        f9Var.d0 = new WeakReference<>(view);
                        f9Var.e0 = new WeakReference<>(viewGroup);
                        f9Var.e();
                        f9Var.invalidateSelf();
                    }
                }
                e.recycle();
                this.T = f9Var;
            }
            d();
            f9 f9Var2 = this.T;
            if (f9Var2 != null) {
                return f9Var2;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void b(View view) {
            boolean z;
            if (this.T != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && view != null) {
                setClipChildren(false);
                setClipToPadding(false);
                f9 f9Var = this.T;
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                f9Var.setBounds(rect);
                f9Var.d0 = new WeakReference<>(view);
                f9Var.e0 = new WeakReference<>(null);
                f9Var.e();
                f9Var.invalidateSelf();
                view.getOverlay().add(f9Var);
                this.S = view;
            }
        }

        public final void c() {
            boolean z;
            if (this.T != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && this.S != null) {
                setClipChildren(true);
                setClipToPadding(true);
                f9 f9Var = this.T;
                View view = this.S;
                if (f9Var != null) {
                    view.getOverlay().remove(f9Var);
                }
                this.S = null;
            }
        }

        public final void d() {
            boolean z;
            f fVar;
            View view;
            f fVar2;
            if (this.T != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            if (this.U == null) {
                View view2 = this.R;
                if (view2 != null && (fVar2 = this.P) != null && fVar2.b != null) {
                    if (this.S != view2) {
                        c();
                        view = this.R;
                        b(view);
                        return;
                    }
                    e(view2);
                    return;
                }
                view2 = this.Q;
                if (view2 != null && (fVar = this.P) != null && fVar.g == 1) {
                    if (this.S != view2) {
                        c();
                        view = this.Q;
                        b(view);
                        return;
                    }
                    e(view2);
                    return;
                }
            }
            c();
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.a0;
            boolean z = false;
            if (drawable != null && drawable.isStateful()) {
                z = false | this.a0.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(View view) {
            boolean z;
            f9 f9Var = this.T;
            if (f9Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && view == this.S) {
                Rect rect = new Rect();
                view.getDrawingRect(rect);
                f9Var.setBounds(rect);
                f9Var.d0 = new WeakReference<>(view);
                f9Var.e0 = new WeakReference<>(null);
                f9Var.e();
                f9Var.invalidateSelf();
            }
        }

        public final void f() {
            View view;
            boolean z;
            Drawable drawable;
            f fVar = this.P;
            Drawable drawable2 = null;
            if (fVar != null) {
                view = fVar.f;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.U = view;
                TextView textView = this.Q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.R;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.R.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(16908308);
                this.V = textView2;
                if (textView2 != null) {
                    this.b0 = textView2.getMaxLines();
                }
                this.W = (ImageView) view.findViewById(16908294);
            } else {
                View view2 = this.U;
                if (view2 != null) {
                    removeView(view2);
                    this.U = null;
                }
                this.V = null;
                this.W = null;
            }
            boolean z2 = false;
            if (this.U == null) {
                if (this.R == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(ki0.design_layout_tab_icon, (ViewGroup) this, false);
                    this.R = imageView2;
                    addView(imageView2, 0);
                }
                if (fVar != null && (drawable = fVar.b) != null) {
                    drawable2 = km.h(drawable).mutate();
                }
                if (drawable2 != null) {
                    km.f(drawable2, TabLayout.this.c0);
                    PorterDuff.Mode mode = TabLayout.this.f0;
                    if (mode != null) {
                        km.g(drawable2, mode);
                    }
                }
                if (this.Q == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(ki0.design_layout_tab_text, (ViewGroup) this, false);
                    this.Q = textView3;
                    addView(textView3);
                    this.b0 = this.Q.getMaxLines();
                }
                xw0.e(this.Q, TabLayout.this.a0);
                ColorStateList colorStateList = TabLayout.this.b0;
                if (colorStateList != null) {
                    this.Q.setTextColor(colorStateList);
                }
                h(this.Q, this.R);
                d();
                ImageView imageView3 = this.R;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, imageView3));
                }
                TextView textView4 = this.Q;
                if (textView4 != null) {
                    textView4.addOnLayoutChangeListener(new com.google.android.material.tabs.b(this, textView4));
                }
            } else {
                TextView textView5 = this.V;
                if (textView5 != null || this.W != null) {
                    h(textView5, this.W);
                }
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.d)) {
                setContentDescription(fVar.d);
            }
            if (fVar != null) {
                TabLayout tabLayout = fVar.h;
                if (tabLayout != null) {
                    if (tabLayout.getSelectedTabPosition() == fVar.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        z2 = true;
                    }
                } else {
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
            }
            setSelected(z2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v4, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.material.tabs.TabLayout$h, android.view.View] */
        /* JADX WARN: Type inference failed for: r2v3, types: [android.graphics.drawable.LayerDrawable] */
        public final void g(Context context) {
            ColorStateList colorStateList;
            int i = TabLayout.this.i0;
            GradientDrawable gradientDrawable = null;
            if (i != 0) {
                Drawable b = z5.b(context, i);
                this.a0 = b;
                if (b != null && b.isStateful()) {
                    this.a0.setState(getDrawableState());
                }
            } else {
                this.a0 = null;
            }
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setColor(0);
            if (TabLayout.this.d0 != null) {
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setCornerRadius(1.0E-5f);
                gradientDrawable3.setColor(-1);
                ColorStateList colorStateList2 = TabLayout.this.d0;
                if (am0.a) {
                    colorStateList = new ColorStateList(new int[][]{am0.j, StateSet.NOTHING}, new int[]{am0.a(colorStateList2, am0.f), am0.a(colorStateList2, am0.b)});
                } else {
                    int[] iArr = am0.f;
                    int[] iArr2 = am0.g;
                    int[] iArr3 = am0.h;
                    int[] iArr4 = am0.i;
                    int[] iArr5 = am0.b;
                    int[] iArr6 = am0.c;
                    int[] iArr7 = am0.d;
                    int[] iArr8 = am0.e;
                    colorStateList = new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, am0.j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{am0.a(colorStateList2, iArr), am0.a(colorStateList2, iArr2), am0.a(colorStateList2, iArr3), am0.a(colorStateList2, iArr4), 0, am0.a(colorStateList2, iArr5), am0.a(colorStateList2, iArr6), am0.a(colorStateList2, iArr7), am0.a(colorStateList2, iArr8), 0});
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    boolean z = TabLayout.this.u0;
                    if (z) {
                        gradientDrawable2 = null;
                    }
                    if (!z) {
                        gradientDrawable = gradientDrawable3;
                    }
                    gradientDrawable2 = new RippleDrawable(colorStateList, gradientDrawable2, gradientDrawable);
                } else {
                    Drawable h = km.h(gradientDrawable3);
                    km.f(h, colorStateList);
                    gradientDrawable2 = new LayerDrawable(new Drawable[]{gradientDrawable2, h});
                }
            }
            WeakHashMap<View, String> weakHashMap = a41.a;
            setBackground(gradientDrawable2);
            TabLayout.this.invalidate();
        }

        public f getTab() {
            return this.P;
        }

        public final void h(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i;
            Drawable drawable2;
            f fVar = this.P;
            CharSequence charSequence3 = null;
            if (fVar != null && (drawable2 = fVar.b) != null) {
                drawable = km.h(drawable2).mutate();
            } else {
                drawable = null;
            }
            f fVar2 = this.P;
            if (fVar2 != null) {
                charSequence = fVar2.c;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    if (this.P.g == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = (int) b51.a(getContext(), 8);
                } else {
                    i = 0;
                }
                if (TabLayout.this.s0) {
                    if (i != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            f fVar3 = this.P;
            if (fVar3 != null) {
                charSequence2 = fVar3.d;
            } else {
                charSequence2 = null;
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            f01.a(charSequence3, this);
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(b1.c.class.getName());
        }

        @Override // android.view.View
        @TargetApi(14)
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            Context context;
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(b1.c.class.getName());
            f9 f9Var = this.T;
            if (f9Var != null && f9Var.isVisible()) {
                CharSequence contentDescription = getContentDescription();
                StringBuilder sb = new StringBuilder();
                sb.append((Object) contentDescription);
                sb.append(", ");
                f9 f9Var2 = this.T;
                String str = null;
                if (f9Var2.isVisible()) {
                    if (f9Var2.d()) {
                        if (f9Var2.W.V > 0 && (context = f9Var2.P.get()) != null) {
                            str = context.getResources().getQuantityString(f9Var2.W.V, f9Var2.c(), Integer.valueOf(f9Var2.c()));
                        }
                    } else {
                        str = f9Var2.W.U;
                    }
                }
                sb.append((Object) str);
                accessibilityNodeInfo.setContentDescription(sb.toString());
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
            if (((r0 / r2.getPaint().getTextSize()) * r2.getLineWidth(0)) > ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) goto L29;
         */
        @Override // android.widget.LinearLayout, android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(TabLayout.this.j0, RecyclerView.UNDEFINED_DURATION);
            }
            super.onMeasure(i, i2);
            if (this.Q != null) {
                float f = TabLayout.this.g0;
                int i3 = this.b0;
                ImageView imageView = this.R;
                boolean z = true;
                if (imageView != null && imageView.getVisibility() == 0) {
                    i3 = 1;
                } else {
                    TextView textView = this.Q;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = TabLayout.this.h0;
                    }
                }
                float textSize = this.Q.getTextSize();
                int lineCount = this.Q.getLineCount();
                int maxLines = this.Q.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (TabLayout.this.r0 == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.Q.getLayout();
                        if (layout != null) {
                        }
                        z = false;
                    }
                    if (z) {
                        this.Q.setTextSize(0, f);
                        this.Q.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.P != null) {
                if (!performClick) {
                    playSoundEffect(0);
                }
                f fVar = this.P;
                TabLayout tabLayout = fVar.h;
                if (tabLayout != null) {
                    tabLayout.h(fVar, true);
                    return true;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return performClick;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            if (isSelected() != z) {
            }
            super.setSelected(z);
            TextView textView = this.Q;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.R;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.U;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(f fVar) {
            if (fVar != this.P) {
                this.P = fVar;
                f();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class i implements d {
        public final t41 a;

        public i(t41 t41Var) {
            this.a = t41Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.d
        public final void a(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d
        public final void b(f fVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.d
        public final void c(f fVar) {
            this.a.setCurrentItem(fVar.e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r3);
        int i2 = gh0.tabStyle;
        this.P = new ArrayList<>();
        this.R = new RectF();
        this.j0 = Integer.MAX_VALUE;
        this.v0 = new ArrayList<>();
        this.x0 = new HashMap<>();
        this.D0 = new hf0(12);
        setHorizontalScrollBarEnabled(false);
        e eVar = new e(context);
        this.S = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = ij0.TabLayout;
        int i3 = zi0.Widget_Design_TabLayout;
        int i4 = ij0.TabLayout_tabTextAppearance;
        TypedArray e2 = yw0.e(context, attributeSet, iArr, i2, i3, i4);
        if (getBackground() instanceof ColorDrawable) {
            o40 o40Var = new o40();
            o40Var.i(ColorStateList.valueOf(((ColorDrawable) getBackground()).getColor()));
            o40Var.g(context);
            o40Var.h(a41.e(this));
            setBackground(o40Var);
        }
        int dimensionPixelSize = e2.getDimensionPixelSize(ij0.TabLayout_tabIndicatorHeight, -1);
        if (eVar.P != dimensionPixelSize) {
            eVar.P = dimensionPixelSize;
            WeakHashMap<View, String> weakHashMap = a41.a;
            eVar.postInvalidateOnAnimation();
        }
        int color = e2.getColor(ij0.TabLayout_tabIndicatorColor, 0);
        if (eVar.Q.getColor() != color) {
            eVar.Q.setColor(color);
            WeakHashMap<View, String> weakHashMap2 = a41.a;
            eVar.postInvalidateOnAnimation();
        }
        setSelectedTabIndicator(n40.c(context, e2, ij0.TabLayout_tabIndicator));
        setSelectedTabIndicatorGravity(e2.getInt(ij0.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorFullWidth(e2.getBoolean(ij0.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize2 = e2.getDimensionPixelSize(ij0.TabLayout_tabPadding, 0);
        this.W = dimensionPixelSize2;
        this.V = dimensionPixelSize2;
        this.U = dimensionPixelSize2;
        this.T = dimensionPixelSize2;
        this.T = e2.getDimensionPixelSize(ij0.TabLayout_tabPaddingStart, dimensionPixelSize2);
        this.U = e2.getDimensionPixelSize(ij0.TabLayout_tabPaddingTop, this.U);
        this.V = e2.getDimensionPixelSize(ij0.TabLayout_tabPaddingEnd, this.V);
        this.W = e2.getDimensionPixelSize(ij0.TabLayout_tabPaddingBottom, this.W);
        int resourceId = e2.getResourceId(i4, zi0.TextAppearance_Design_Tab);
        this.a0 = resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId, lj0.TextAppearance);
        try {
            this.g0 = obtainStyledAttributes.getDimensionPixelSize(lj0.TextAppearance_android_textSize, 0);
            this.b0 = n40.b(context, obtainStyledAttributes, lj0.TextAppearance_android_textColor);
            obtainStyledAttributes.recycle();
            int i5 = ij0.TabLayout_tabTextColor;
            if (e2.hasValue(i5)) {
                this.b0 = n40.b(context, e2, i5);
            }
            int i6 = ij0.TabLayout_tabSelectedTextColor;
            if (e2.hasValue(i6)) {
                this.b0 = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{e2.getColor(i6, 0), this.b0.getDefaultColor()});
            }
            this.c0 = n40.b(context, e2, ij0.TabLayout_tabIconTint);
            this.f0 = b51.b(e2.getInt(ij0.TabLayout_tabIconTintMode, -1), null);
            this.d0 = n40.b(context, e2, ij0.TabLayout_tabRippleColor);
            this.p0 = e2.getInt(ij0.TabLayout_tabIndicatorAnimationDuration, 300);
            this.k0 = e2.getDimensionPixelSize(ij0.TabLayout_tabMinWidth, -1);
            this.l0 = e2.getDimensionPixelSize(ij0.TabLayout_tabMaxWidth, -1);
            this.i0 = e2.getResourceId(ij0.TabLayout_tabBackground, 0);
            this.n0 = e2.getDimensionPixelSize(ij0.TabLayout_tabContentStart, 0);
            this.r0 = e2.getInt(ij0.TabLayout_tabMode, 1);
            this.o0 = e2.getInt(ij0.TabLayout_tabGravity, 0);
            this.s0 = e2.getBoolean(ij0.TabLayout_tabInlineLabel, false);
            this.u0 = e2.getBoolean(ij0.TabLayout_tabUnboundedRipple, false);
            e2.recycle();
            Resources resources = getResources();
            this.h0 = resources.getDimensionPixelSize(rh0.design_tab_text_size_2line);
            this.m0 = resources.getDimensionPixelSize(rh0.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private int getDefaultHeight() {
        int size = this.P.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                f fVar = this.P.get(i2);
                if (fVar != null && fVar.b != null && !TextUtils.isEmpty(fVar.c)) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        if (z && !this.s0) {
            return 72;
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i2 = this.k0;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.r0;
        if (i3 == 0 || i3 == 2) {
            return this.m0;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.S.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.S.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.S.getChildAt(i3);
                boolean z = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z = false;
                }
                childAt.setActivated(z);
                i3++;
            }
        }
    }

    public final void a(View view) {
        float f2;
        if (view instanceof qv0) {
            qv0 qv0Var = (qv0) view;
            f f3 = f();
            qv0Var.getClass();
            if (!TextUtils.isEmpty(qv0Var.getContentDescription())) {
                f3.d = qv0Var.getContentDescription();
                h hVar = f3.i;
                if (hVar != null) {
                    hVar.f();
                }
            }
            boolean isEmpty = this.P.isEmpty();
            int size = this.P.size();
            if (f3.h == this) {
                f3.e = size;
                this.P.add(size, f3);
                int size2 = this.P.size();
                while (true) {
                    size++;
                    if (size >= size2) {
                        break;
                    }
                    this.P.get(size).e = size;
                }
                h hVar2 = f3.i;
                hVar2.setSelected(false);
                hVar2.setActivated(false);
                e eVar = this.S;
                int i2 = f3.e;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (this.r0 == 1 && this.o0 == 0) {
                    layoutParams.width = 0;
                    f2 = 1.0f;
                } else {
                    layoutParams.width = -2;
                    f2 = 0.0f;
                }
                layoutParams.weight = f2;
                eVar.addView(hVar2, i2, layoutParams);
                if (isEmpty) {
                    TabLayout tabLayout = f3.h;
                    if (tabLayout != null) {
                        tabLayout.h(f3, true);
                        return;
                    }
                    throw new IllegalArgumentException("Tab not attached to a TabLayout");
                }
                return;
            }
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public final void b(int i2) {
        boolean z;
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (isLaidOut()) {
                e eVar = this.S;
                int childCount = eVar.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 < childCount) {
                        if (eVar.getChildAt(i3).getWidth() <= 0) {
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    int scrollX = getScrollX();
                    int d2 = d(i2);
                    if (scrollX != d2) {
                        e();
                        this.y0.setIntValues(scrollX, d2);
                        this.y0.start();
                    }
                    this.S.a(i2, this.p0);
                    return;
                }
            }
        }
        i(i2, true, true);
    }

    public final void c() {
        int max;
        int i2 = this.r0;
        if (i2 != 0 && i2 != 2) {
            max = 0;
        } else {
            max = Math.max(0, this.n0 - this.T);
        }
        e eVar = this.S;
        WeakHashMap<View, String> weakHashMap = a41.a;
        eVar.setPaddingRelative(max, 0, 0, 0);
        int i3 = this.r0;
        if (i3 != 0) {
            if (i3 == 1 || i3 == 2) {
                this.S.setGravity(1);
            }
        } else {
            this.S.setGravity(8388611);
        }
        k(true);
    }

    public final int d(int i2) {
        int i3 = this.r0;
        if (i3 == 0 || i3 == 2) {
            View childAt = this.S.getChildAt(i2);
            int i4 = i2 + 1;
            View childAt2 = i4 < this.S.getChildCount() ? this.S.getChildAt(i4) : null;
            int width = childAt != null ? childAt.getWidth() : 0;
            int width2 = childAt2 != null ? childAt2.getWidth() : 0;
            int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
            int i5 = (int) ((width + width2) * 0.5f * 0.0f);
            WeakHashMap<View, String> weakHashMap = a41.a;
            return getLayoutDirection() == 0 ? left + i5 : left - i5;
        }
        return 0;
    }

    public final void e() {
        if (this.y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.y0 = valueAnimator;
            valueAnimator.setInterpolator(i4.b);
            this.y0.setDuration(this.p0);
            this.y0.addUpdateListener(new a());
        }
    }

    public final f f() {
        h hVar;
        CharSequence charSequence;
        f fVar = (f) E0.a();
        if (fVar == null) {
            fVar = new f();
        }
        fVar.h = this;
        hf0 hf0Var = this.D0;
        if (hf0Var != null) {
            hVar = (h) hf0Var.a();
        } else {
            hVar = null;
        }
        if (hVar == null) {
            hVar = new h(getContext());
        }
        hVar.setTab(fVar);
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.d)) {
            charSequence = fVar.c;
        } else {
            charSequence = fVar.d;
        }
        hVar.setContentDescription(charSequence);
        fVar.i = hVar;
        return fVar;
    }

    public final void g() {
        for (int childCount = this.S.getChildCount() - 1; childCount >= 0; childCount--) {
            h hVar = (h) this.S.getChildAt(childCount);
            this.S.removeViewAt(childCount);
            if (hVar != null) {
                hVar.setTab(null);
                hVar.setSelected(false);
                this.D0.b(hVar);
            }
            requestLayout();
        }
        Iterator<f> it = this.P.iterator();
        while (it.hasNext()) {
            f next = it.next();
            it.remove();
            next.h = null;
            next.i = null;
            next.a = null;
            next.b = null;
            next.c = null;
            next.d = null;
            next.e = -1;
            next.f = null;
            E0.b(next);
        }
        this.Q = null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        f fVar = this.Q;
        if (fVar != null) {
            return fVar.e;
        }
        return -1;
    }

    public int getTabCount() {
        return this.P.size();
    }

    public int getTabGravity() {
        return this.o0;
    }

    public ColorStateList getTabIconTint() {
        return this.c0;
    }

    public int getTabIndicatorGravity() {
        return this.q0;
    }

    public int getTabMaxWidth() {
        return this.j0;
    }

    public int getTabMode() {
        return this.r0;
    }

    public ColorStateList getTabRippleColor() {
        return this.d0;
    }

    public Drawable getTabSelectedIndicator() {
        return this.e0;
    }

    public ColorStateList getTabTextColors() {
        return this.b0;
    }

    public final void h(f fVar, boolean z) {
        int i2;
        f fVar2 = this.Q;
        if (fVar2 == fVar) {
            if (fVar2 != null) {
                for (int size = this.v0.size() - 1; size >= 0; size--) {
                    this.v0.get(size).a(fVar);
                }
                b(fVar.e);
                return;
            }
            return;
        }
        if (fVar != null) {
            i2 = fVar.e;
        } else {
            i2 = -1;
        }
        if (z) {
            if ((fVar2 == null || fVar2.e == -1) && i2 != -1) {
                i(i2, true, true);
            } else {
                b(i2);
            }
            if (i2 != -1) {
                setSelectedTabView(i2);
            }
        }
        this.Q = fVar;
        if (fVar2 != null) {
            for (int size2 = this.v0.size() - 1; size2 >= 0; size2--) {
                this.v0.get(size2).b(fVar2);
            }
        }
        if (fVar != null) {
            for (int size3 = this.v0.size() - 1; size3 >= 0; size3--) {
                this.v0.get(size3).c(fVar);
            }
        }
    }

    public final void i(int i2, boolean z, boolean z2) {
        int round = Math.round(i2 + 0.0f);
        if (round >= 0 && round < this.S.getChildCount()) {
            if (z2) {
                e eVar = this.S;
                ValueAnimator valueAnimator = eVar.a0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    eVar.a0.cancel();
                }
                eVar.S = i2;
                eVar.T = 0.0f;
                eVar.c();
            }
            ValueAnimator valueAnimator2 = this.y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.y0.cancel();
            }
            scrollTo(d(i2), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    public final void j(t41 t41Var, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        t41 t41Var2 = this.z0;
        if (t41Var2 != null) {
            g gVar = this.A0;
            if (gVar != null && (arrayList2 = t41Var2.i0) != null) {
                arrayList2.remove(gVar);
            }
            b bVar = this.B0;
            if (bVar != null && (arrayList = this.z0.k0) != null) {
                arrayList.remove(bVar);
            }
        }
        i iVar = this.w0;
        if (iVar != null) {
            this.v0.remove(iVar);
            this.w0 = null;
        }
        if (t41Var != null) {
            this.z0 = t41Var;
            if (this.A0 == null) {
                this.A0 = new g(this);
            }
            g gVar2 = this.A0;
            gVar2.getClass();
            if (t41Var.i0 == null) {
                t41Var.i0 = new ArrayList();
            }
            t41Var.i0.add(gVar2);
            i iVar2 = new i(t41Var);
            this.w0 = iVar2;
            if (!this.v0.contains(iVar2)) {
                this.v0.add(iVar2);
            }
            t41Var.getAdapter();
            if (this.B0 == null) {
                this.B0 = new b();
            }
            b bVar2 = this.B0;
            bVar2.getClass();
            if (t41Var.k0 == null) {
                t41Var.k0 = new ArrayList();
            }
            t41Var.k0.add(bVar2);
            i(t41Var.getCurrentItem(), true, true);
        } else {
            this.z0 = null;
            g();
        }
        this.C0 = z;
    }

    public final void k(boolean z) {
        float f2;
        for (int i2 = 0; i2 < this.S.getChildCount(); i2++) {
            View childAt = this.S.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.r0 == 1 && this.o0 == 0) {
                layoutParams.width = 0;
                f2 = 1.0f;
            } else {
                layoutParams.width = -2;
                f2 = 0.0f;
            }
            layoutParams.weight = f2;
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof o40) {
            vj.B(this, (o40) background);
        }
        if (this.z0 == null) {
            ViewParent parent = getParent();
            if (parent instanceof t41) {
                j((t41) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.C0) {
            setupWithViewPager(null);
            this.C0 = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        h hVar;
        Drawable drawable;
        for (int i2 = 0; i2 < this.S.getChildCount(); i2++) {
            View childAt = this.S.getChildAt(i2);
            if ((childAt instanceof h) && (drawable = (hVar = (h) childAt).a0) != null) {
                drawable.setBounds(hVar.getLeft(), hVar.getTop(), hVar.getRight(), hVar.getBottom());
                hVar.a0.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r0 != 2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r7.getMeasuredWidth() != getMeasuredWidth()) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
        if (r7.getMeasuredWidth() < getMeasuredWidth()) goto L25;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i2, int i3) {
        int a2 = (int) b51.a(getContext(), getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i3);
        boolean z = false;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + a2, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i3) >= a2) {
            getChildAt(0).setMinimumHeight(a2);
        }
        int size = View.MeasureSpec.getSize(i2);
        if (View.MeasureSpec.getMode(i2) != 0) {
            int i4 = this.l0;
            if (i4 <= 0) {
                i4 = (int) (size - b51.a(getContext(), 56));
            }
            this.j0 = i4;
        }
        super.onMeasure(i2, i3);
        if (getChildCount() != 1) {
            return;
        }
        View childAt = getChildAt(0);
        int i5 = this.r0;
        if (i5 != 0) {
            if (i5 != 1) {
            }
            if (z) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof o40) {
            ((o40) background).h(f2);
        }
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.s0 != z) {
            this.s0 = z;
            for (int i2 = 0; i2 < this.S.getChildCount(); i2++) {
                View childAt = this.S.getChildAt(i2);
                if (childAt instanceof h) {
                    h hVar = (h) childAt;
                    hVar.setOrientation(!TabLayout.this.s0 ? 1 : 0);
                    TextView textView = hVar.V;
                    if (textView == null && hVar.W == null) {
                        textView = hVar.Q;
                        imageView = hVar.R;
                    } else {
                        imageView = hVar.W;
                    }
                    hVar.h(textView, imageView);
                }
            }
            c();
        }
    }

    public void setInlineLabelResource(int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        d dVar;
        this.v0.clear();
        this.x0.clear();
        if (cVar == null) {
            dVar = null;
        } else if (this.x0.containsKey(cVar)) {
            dVar = this.x0.get(cVar);
        } else {
            com.google.android.material.tabs.a aVar = new com.google.android.material.tabs.a(cVar);
            this.x0.put(cVar, aVar);
            dVar = aVar;
        }
        if (!this.v0.contains(dVar)) {
            this.v0.add(dVar);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.y0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i2) {
        setSelectedTabIndicator(i2 != 0 ? z5.b(getContext(), i2) : null);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.e0 != drawable) {
            this.e0 = drawable;
            e eVar = this.S;
            WeakHashMap<View, String> weakHashMap = a41.a;
            eVar.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorColor(int i2) {
        e eVar = this.S;
        if (eVar.Q.getColor() != i2) {
            eVar.Q.setColor(i2);
            WeakHashMap<View, String> weakHashMap = a41.a;
            eVar.postInvalidateOnAnimation();
        }
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.q0 != i2) {
            this.q0 = i2;
            e eVar = this.S;
            WeakHashMap<View, String> weakHashMap = a41.a;
            eVar.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        e eVar = this.S;
        if (eVar.P != i2) {
            eVar.P = i2;
            WeakHashMap<View, String> weakHashMap = a41.a;
            eVar.postInvalidateOnAnimation();
        }
    }

    public void setTabGravity(int i2) {
        if (this.o0 != i2) {
            this.o0 = i2;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.c0 != colorStateList) {
            this.c0 = colorStateList;
            int size = this.P.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = this.P.get(i2).i;
                if (hVar != null) {
                    hVar.f();
                }
            }
        }
    }

    public void setTabIconTintResource(int i2) {
        setTabIconTint(z5.a(getContext(), i2));
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.t0 = z;
        e eVar = this.S;
        WeakHashMap<View, String> weakHashMap = a41.a;
        eVar.postInvalidateOnAnimation();
    }

    public void setTabMode(int i2) {
        if (i2 != this.r0) {
            this.r0 = i2;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            for (int i2 = 0; i2 < this.S.getChildCount(); i2++) {
                View childAt = this.S.getChildAt(i2);
                if (childAt instanceof h) {
                    Context context = getContext();
                    int i3 = h.d0;
                    ((h) childAt).g(context);
                }
            }
        }
    }

    public void setTabRippleColorResource(int i2) {
        setTabRippleColor(z5.a(getContext(), i2));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.b0 != colorStateList) {
            this.b0 = colorStateList;
            int size = this.P.size();
            for (int i2 = 0; i2 < size; i2++) {
                h hVar = this.P.get(i2).i;
                if (hVar != null) {
                    hVar.f();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(nd0 nd0Var) {
        g();
    }

    public void setUnboundedRipple(boolean z) {
        if (this.u0 != z) {
            this.u0 = z;
            for (int i2 = 0; i2 < this.S.getChildCount(); i2++) {
                View childAt = this.S.getChildAt(i2);
                if (childAt instanceof h) {
                    Context context = getContext();
                    int i3 = h.d0;
                    ((h) childAt).g(context);
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(t41 t41Var) {
        j(t41Var, false);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }
}