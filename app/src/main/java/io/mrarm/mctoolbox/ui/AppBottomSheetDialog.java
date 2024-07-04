package io.mrarm.mctoolbox.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehaviorMod;
import defpackage.xs0;
import io.mrarm.mctoolbox.ui.AppBottomSheetDialog;
import java.lang.ref.WeakReference;

public class AppBottomSheetDialog extends m5 {
    public ViewGroup R;
    public BottomSheetBehavior S;
    public boolean T;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class AutoSizedFrameLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {
        public static final /* synthetic */ int V = 0;
        public int P;
        public float Q;
        public int R;
        public boolean S;
        public bb0 T;
        public ValueAnimator U;

        public AutoSizedFrameLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, 0);
            this.S = false;
            setWillNotDraw(false);
            this.P = context.getResources().getDimensionPixelSize(2131165354);
            ValueAnimator valueAnimator = new ValueAnimator();
            this.U = valueAnimator;
            valueAnimator.setFloatValues(1.0f, 1.0f);
            this.U.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AppBottomSheetDialog.AutoSizedFrameLayout autoSizedFrameLayout = AppBottomSheetDialog.AutoSizedFrameLayout.this;
                    int i = AppBottomSheetDialog.AutoSizedFrameLayout.V;
                    autoSizedFrameLayout.getClass();
                    autoSizedFrameLayout.setScaleX(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    autoSizedFrameLayout.setScaleY(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
            this.U.setDuration(200L);
            this.U.setInterpolator(new DecelerateInterpolator(2.0f));
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            boolean z;
            BottomSheetBehavior y = BottomSheetBehavior.y(this);
            if (this.Q < this.P) {
                z = true;
            } else {
                z = false;
            }
            y.t = z;
            a41.j(this, this.R - getTop());
            if (y.t) {
                if (y.u == 4) {
                    this.S = true;
                    y.B(3);
                }
            } else if (this.S) {
                y.A((int) this.Q, false);
                y.B(4);
                this.S = false;
            } else {
                y.A((int) this.Q, true);
                if (this.T.H() != 0) {
                    y.B(4);
                }
            }
            getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            this.R = getTop();
            super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * 0.75f), View.MeasureSpec.getMode(i)), i2);
            this.Q = View.MeasureSpec.getSize(i2) * 0.85f;
            bb0 bb0Var = this.T;
            if (bb0Var != null && bb0Var.H() != 0) {
                this.Q = (getMeasuredWidth() * 0.09f) + this.Q;
            }
            getRootView().getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void setStackIndex(final bb0 bb0Var) {
            this.T = bb0Var;
            bb0Var.a(new xs0(new xs0.a() { // from class: s4
                @Override // defpackage.xs0.a
                public final void a() {
                    AppBottomSheetDialog.AutoSizedFrameLayout autoSizedFrameLayout = AppBottomSheetDialog.AutoSizedFrameLayout.this;
                    autoSizedFrameLayout.U.setFloatValues(autoSizedFrameLayout.getScaleX(), 1.0f - (bb0Var.H() * 0.05f));
                    autoSizedFrameLayout.U.start();
                    autoSizedFrameLayout.requestLayout();
                }
            }));
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends BottomSheetBehavior.d {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void a() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.d
        public final void b(int i) {
            if (i == 5) {
                AppBottomSheetDialog.this.dismiss();
            }
            this.a.a(i != 3, true);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final ShapeDrawable a;
        public RoundRectShape b;
        public final ValueAnimator c;
        public final float d;
        public boolean e;
        public final float[] f;

        public b(int i, float f) {
            this.d = f;
            float[] fArr = new float[8];
            this.f = fArr;
            this.b = new RoundRectShape(fArr, null, null);
            ShapeDrawable shapeDrawable = new ShapeDrawable(this.b);
            this.a = shapeDrawable;
            shapeDrawable.getPaint().setColor(i);
            ValueAnimator valueAnimator = new ValueAnimator();
            this.c = valueAnimator;
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: u4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    AppBottomSheetDialog.b bVar = AppBottomSheetDialog.b.this;
                    bVar.getClass();
                    bVar.b(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
            valueAnimator.setDuration(200L);
            a(true, false);
        }

        public final void a(boolean z, boolean z2) {
            if (this.e == z && z2) {
                return;
            }
            this.e = z;
            float f = z ? this.d : 0.0f;
            if (z2) {
                ValueAnimator valueAnimator = this.c;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), f);
                this.c.start();
                return;
            }
            this.c.cancel();
            b(f);
            this.c.setFloatValues(f, f);
        }

        public final void b(float f) {
            float[] fArr = this.f;
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = f;
            fArr[3] = f;
            RoundRectShape roundRectShape = new RoundRectShape(this.f, null, null);
            this.b = roundRectShape;
            this.a.setShape(roundRectShape);
        }
    }

    public AppBottomSheetDialog(Context context) {
        super(context, 2131820554);
        this.T = true;
        a().q(1);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        BottomSheetBehavior bottomSheetBehavior = this.S;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.B(5);
        } else {
            super.cancel();
        }
    }

    public final void d(ViewGroup viewGroup) {
        b bVar = new b(getContext().getResources().getColor(2131099680), getContext().getResources().getDimensionPixelSize(2131165266));
        viewGroup.setBackground(bVar.a);
        this.R = viewGroup;
        BottomSheetBehavior y = BottomSheetBehavior.y(viewGroup);
        this.S = y;
        if (!y.s) {
            y.s = true;
            y.H();
        }
        BottomSheetBehavior bottomSheetBehavior = this.S;
        ((BottomSheetBehaviorMod) bottomSheetBehavior).L = new q4(this, viewGroup, getContext().getResources().getDimensionPixelSize(2131165267));
        a aVar = new a(bVar);
        if (!bottomSheetBehavior.D.contains(aVar)) {
            bottomSheetBehavior.D.add(aVar);
        }
        findViewById(2131296341).setOnClickListener(new View.OnClickListener() { // from class: r4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppBottomSheetDialog appBottomSheetDialog = AppBottomSheetDialog.this;
                if (appBottomSheetDialog.T) {
                    appBottomSheetDialog.cancel();
                }
            }
        });
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        Window window = getWindow();
        if (window != null) {
            ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(window.getDecorView().getRootView().getWindowToken(), 2);
        }
        super.dismiss();
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final Window window = getWindow();
        window.setLayout(-1, -1);
        window.setFlags(1024, 1024);
        if (Build.VERSION.SDK_INT >= 24) {
            window.setSoftInputMode(16);
        } else {
            window.getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: p4
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    AppBottomSheetDialog appBottomSheetDialog = AppBottomSheetDialog.this;
                    Window window2 = window;
                    appBottomSheetDialog.getClass();
                    Rect rect = new Rect();
                    window2.getDecorView().getWindowVisibleDisplayFrame(rect);
                    if (appBottomSheetDialog.R != null) {
                        ((ViewGroup.MarginLayoutParams) appBottomSheetDialog.findViewById(gi0.root).getLayoutParams()).bottomMargin = window2.getDecorView().getRootView().getHeight() - rect.height();
                        appBottomSheetDialog.findViewById(gi0.root).requestLayout();
                    }
                }
            });
        }
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.S;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.B(4);
        }
        q6 b2 = q6.b(getContext());
        if (b2 != null) {
            b2.a.add(new WeakReference(this));
            b2.b.add(new bb0(0));
            int size = b2.b.size();
            while (true) {
                int i = -1;
                size--;
                if (size >= 0) {
                    bb0 bb0Var = (bb0) b2.b.get(size);
                    Dialog dialog = (Dialog) ((WeakReference) b2.a.get(size)).get();
                    if (dialog != null) {
                        i = (b2.a.size() - 1) - b2.a(dialog);
                    }
                    bb0Var.I(i);
                } else {
                    ((AutoSizedFrameLayout) this.R).setStackIndex((bb0) b2.b.get(b2.a(this)));
                    return;
                }
            }
        }
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void onStop() {
        int a2;
        int size;
        super.onStop();
        q6 b2 = q6.b(getContext());
        if (b2 != null && (a2 = b2.a(this)) != -1) {
            b2.a.remove(a2);
            b2.b.remove(a2);
            for (int i = a2 - 1; i >= 0; i--) {
                bb0 bb0Var = (bb0) b2.b.get(i);
                Dialog dialog = (Dialog) ((WeakReference) b2.a.get(i)).get();
                if (dialog == null) {
                    size = -1;
                } else {
                    size = (b2.a.size() - 1) - b2.a(dialog);
                }
                bb0Var.I(size);
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.T = z;
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(2131492896);
        ViewGroup viewGroup = (ViewGroup) findViewById(fi0.container);
        LayoutInflater.from(getContext()).inflate(i, viewGroup);
        d(viewGroup);
    }

    @Override // defpackage.m5, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(2131492896);
        ViewGroup viewGroup = (ViewGroup) findViewById(fi0.container);
        viewGroup.addView(view);
        d(viewGroup);
    }
}