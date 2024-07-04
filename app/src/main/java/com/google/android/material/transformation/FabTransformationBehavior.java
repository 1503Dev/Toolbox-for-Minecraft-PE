package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.dd;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ View b;
        public final /* synthetic */ View c;

        public a(boolean z, View view, View view2) {
            this.a = z;
            this.b = view;
            this.c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                return;
            }
            this.b.setVisibility(4);
            this.c.setAlpha(1.0f);
            this.c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.a) {
                this.b.setVisibility(0);
                this.c.setAlpha(0.0f);
                this.c.setVisibility(4);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public q60 a;
        public p5 b;
    }

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static Pair v(float f, float f2, boolean z, b bVar) {
        r60 c;
        q60 q60Var;
        String str;
        if (f == 0.0f || f2 == 0.0f) {
            c = bVar.a.c("translationXLinear");
            q60Var = bVar.a;
            str = "translationYLinear";
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            c = bVar.a.c("translationXCurveDownwards");
            q60Var = bVar.a;
            str = "translationYCurveDownwards";
        } else {
            c = bVar.a.c("translationXCurveUpwards");
            q60Var = bVar.a;
            str = "translationYCurveUpwards";
        }
        return new Pair(c, q60Var.c(str));
    }

    public static float y(b bVar, r60 r60Var, float f) {
        long j = r60Var.a;
        long j2 = r60Var.b;
        r60 c = bVar.a.c("expansion");
        float interpolation = r60Var.b().getInterpolation(((float) (((c.a + c.b) + 17) - j)) / ((float) j2));
        LinearInterpolator linearInterpolator = i4.a;
        return ((0.0f - f) * interpolation) + f;
    }

    public abstract b A(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean b(View view, View view2) {
        if (view.getVisibility() != 8) {
            if (view2 instanceof FloatingActionButton) {
                int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
                return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
            }
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void c(CoordinatorLayout.f fVar) {
        if (fVar.h == 0) {
            fVar.h = 80;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x043a A[LOOP:0: B:143:0x0438->B:144:0x043a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0343  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AnimatorSet u(View view, View view2, boolean z, boolean z2) {
        int i;
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float f;
        b bVar;
        ArrayList arrayList;
        boolean z3;
        dd ddVar;
        ArrayList arrayList2;
        Animator animator;
        ArrayList arrayList3;
        ArrayList arrayList4;
        View view3;
        ColorStateList colorStateList;
        int i2;
        boolean z4;
        ObjectAnimator ofInt;
        b bVar2;
        ColorStateList backgroundTintList;
        boolean z5;
        int size;
        int i3;
        View findViewById;
        ViewGroup viewGroup;
        ObjectAnimator ofFloat3;
        ObjectAnimator ofInt2;
        ObjectAnimator ofFloat4;
        View view4 = view2;
        b A = A(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 21) {
            float e = a41.e(view2) - a41.e(view);
            if (z) {
                if (!z2) {
                    view4.setTranslationZ(-e);
                }
                ofFloat4 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Z, 0.0f);
            } else {
                ofFloat4 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Z, -e);
            }
            A.a.c("elevation").a(ofFloat4);
            arrayList5.add(ofFloat4);
        }
        RectF rectF = this.d;
        float w = w(view, view4, A.b);
        float x = x(view, view4, A.b);
        Pair v = v(w, x, z, A);
        r60 r60Var = (r60) v.first;
        r60 r60Var2 = (r60) v.second;
        if (z) {
            if (!z2) {
                view4.setTranslationX(-w);
                view4.setTranslationY(-x);
            }
            i = i4;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, 0.0f);
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, 0.0f);
            float y = y(A, r60Var, -w);
            float y2 = y(A, r60Var2, -x);
            Rect rect = this.c;
            view4.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.d;
            rectF2.set(rect);
            RectF rectF3 = this.e;
            z(view4, rectF3);
            rectF3.offset(y, y2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
            ofFloat2 = ofFloat6;
            ofFloat = ofFloat5;
        } else {
            i = i4;
            ofFloat = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, -w);
            ofFloat2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, -x);
        }
        r60Var.a(ofFloat);
        r60Var2.a(ofFloat2);
        arrayList5.add(ofFloat);
        arrayList5.add(ofFloat2);
        float width = rectF.width();
        float height = rectF.height();
        float w2 = w(view, view4, A.b);
        float x2 = x(view, view4, A.b);
        Pair v2 = v(w2, x2, z, A);
        r60 r60Var3 = (r60) v2.first;
        r60 r60Var4 = (r60) v2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            w2 = this.g;
        }
        fArr[0] = w2;
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            x2 = this.h;
        }
        fArr2[0] = x2;
        ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(view, property2, fArr2);
        r60Var3.a(ofFloat7);
        r60Var4.a(ofFloat8);
        arrayList5.add(ofFloat7);
        arrayList5.add(ofFloat8);
        boolean z6 = view4 instanceof dd;
        if (z6 && (view instanceof ImageView)) {
            dd ddVar2 = (dd) view4;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    ofInt2 = ObjectAnimator.ofInt(drawable, cm.a, 0);
                    f = height;
                } else {
                    f = height;
                    ofInt2 = ObjectAnimator.ofInt(drawable, cm.a, 255);
                }
                ofInt2.addUpdateListener(new com.google.android.material.transformation.a(view4));
                A.a.c("iconFade").a(ofInt2);
                arrayList5.add(ofInt2);
                arrayList6.add(new com.google.android.material.transformation.b(ddVar2, drawable));
                if (z6) {
                    bVar = A;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    z3 = z6;
                } else {
                    dd ddVar3 = (dd) view4;
                    p5 p5Var = A.b;
                    RectF rectF4 = this.d;
                    RectF rectF5 = this.e;
                    z(view, rectF4);
                    rectF4.offset(this.g, this.h);
                    z(view4, rectF5);
                    rectF5.offset(-w(view, view4, p5Var), 0.0f);
                    float centerX = rectF4.centerX() - rectF5.left;
                    p5 p5Var2 = A.b;
                    RectF rectF6 = this.d;
                    RectF rectF7 = this.e;
                    z(view, rectF6);
                    rectF6.offset(this.g, this.h);
                    z(view4, rectF7);
                    rectF7.offset(0.0f, -x(view, view4, p5Var2));
                    float centerY = rectF6.centerY() - rectF7.top;
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    Rect rect2 = this.c;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    if (!floatingActionButton.isLaidOut()) {
                        float width2 = this.c.width() / 2.0f;
                        r60 c = A.a.c("expansion");
                        if (z) {
                            if (!z2) {
                                ddVar3.setRevealInfo(new dd.d(centerX, centerY, width2));
                            }
                            if (z2) {
                                width2 = ddVar3.getRevealInfo().c;
                            }
                            double d = 0.0f - centerX;
                            double d2 = 0.0f - centerY;
                            bVar = A;
                            float hypot = (float) Math.hypot(d, d2);
                            double d3 = width - centerX;
                            float hypot2 = (float) Math.hypot(d3, d2);
                            arrayList = arrayList6;
                            double d4 = f - centerY;
                            float hypot3 = (float) Math.hypot(d3, d4);
                            float hypot4 = (float) Math.hypot(d, d4);
                            if (hypot <= hypot2 || hypot <= hypot3 || hypot <= hypot4) {
                                if (hypot2 > hypot3 && hypot2 > hypot4) {
                                    hypot = hypot2;
                                } else if (hypot3 > hypot4) {
                                    hypot = hypot3;
                                } else {
                                    hypot = hypot4;
                                }
                            }
                            Animator a2 = ad.a(ddVar3, centerX, centerY, hypot);
                            a2.addListener(new c(ddVar3));
                            long j = c.a;
                            int i5 = (int) centerX;
                            int i6 = (int) centerY;
                            if (i >= 21 && j > 0) {
                                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view4, i5, i6, width2, width2);
                                createCircularReveal.setStartDelay(0L);
                                createCircularReveal.setDuration(j);
                                arrayList4 = arrayList5;
                                arrayList4.add(createCircularReveal);
                            } else {
                                arrayList4 = arrayList5;
                            }
                            animator = a2;
                            arrayList2 = arrayList4;
                            z3 = z6;
                            ddVar = ddVar3;
                        } else {
                            bVar = A;
                            ArrayList arrayList7 = arrayList5;
                            arrayList = arrayList6;
                            int i7 = i;
                            float f2 = ddVar3.getRevealInfo().c;
                            Animator a3 = ad.a(ddVar3, centerX, centerY, width2);
                            long j2 = c.a;
                            int i8 = (int) centerX;
                            int i9 = (int) centerY;
                            if (i7 >= 21 && j2 > 0) {
                                Animator createCircularReveal2 = ViewAnimationUtils.createCircularReveal(view4, i8, i9, f2, f2);
                                createCircularReveal2.setStartDelay(0L);
                                createCircularReveal2.setDuration(j2);
                                arrayList7.add(createCircularReveal2);
                            }
                            long j3 = c.a;
                            long j4 = c.b;
                            q60 q60Var = bVar.a;
                            int i10 = q60Var.a.R;
                            z3 = z6;
                            long j5 = 0;
                            int i11 = 0;
                            while (i11 < i10) {
                                int i12 = i10;
                                r60 j6 = q60Var.a.j(i11);
                                j5 = Math.max(j5, j6.a + j6.b);
                                i11++;
                                i10 = i12;
                                arrayList7 = arrayList7;
                                ddVar3 = ddVar3;
                            }
                            ArrayList arrayList8 = arrayList7;
                            ddVar = ddVar3;
                            if (Build.VERSION.SDK_INT >= 21) {
                                long j7 = j3 + j4;
                                if (j7 < j5) {
                                    view4 = view2;
                                    Animator createCircularReveal3 = ViewAnimationUtils.createCircularReveal(view4, i8, i9, width2, width2);
                                    createCircularReveal3.setStartDelay(j7);
                                    createCircularReveal3.setDuration(j5 - j7);
                                    arrayList2 = arrayList8;
                                    arrayList2.add(createCircularReveal3);
                                    animator = a3;
                                }
                            }
                            view4 = view2;
                            arrayList2 = arrayList8;
                            animator = a3;
                        }
                        c.a(animator);
                        arrayList2.add(animator);
                        arrayList3 = arrayList;
                        arrayList3.add(new zc(ddVar));
                    } else {
                        rect2.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                        throw null;
                    }
                }
                if (z3) {
                    view3 = view;
                    z4 = z;
                    bVar2 = bVar;
                } else {
                    dd ddVar4 = (dd) view4;
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    if (Build.VERSION.SDK_INT >= 21) {
                        backgroundTintList = view.getBackgroundTintList();
                        colorStateList = backgroundTintList;
                        view3 = view;
                    } else {
                        view3 = view;
                        if (view3 instanceof ix0) {
                            colorStateList = ((ix0) view3).getSupportBackgroundTintList();
                        } else {
                            colorStateList = null;
                        }
                    }
                    if (colorStateList != null) {
                        i2 = colorStateList.getColorForState(view.getDrawableState(), colorStateList.getDefaultColor());
                    } else {
                        i2 = 0;
                    }
                    int i13 = 16777215 & i2;
                    z4 = z;
                    if (z4) {
                        if (!z2) {
                            ddVar4.setCircularRevealScrimColor(i2);
                        }
                        ofInt = ObjectAnimator.ofInt(ddVar4, dd.c.a, i13);
                    } else {
                        ofInt = ObjectAnimator.ofInt(ddVar4, dd.c.a, i2);
                    }
                    ofInt.setEvaluator(c7.a);
                    bVar2 = bVar;
                    bVar2.a.c("color").a(ofInt);
                    arrayList2.add(ofInt);
                }
                z5 = view4 instanceof ViewGroup;
                if (z5 && (!z3 || cd.a != 0)) {
                    findViewById = view4.findViewById(fi0.mtrl_child_content_container);
                    if (findViewById == null) {
                        if (!(view4 instanceof o01) && !(view4 instanceof n01)) {
                            if (z5) {
                                viewGroup = (ViewGroup) view4;
                                if (viewGroup != null) {
                                    if (z4) {
                                        if (!z2) {
                                            sc.a.set(viewGroup, Float.valueOf(0.0f));
                                        }
                                        ofFloat3 = ObjectAnimator.ofFloat(viewGroup, sc.a, 1.0f);
                                    } else {
                                        ofFloat3 = ObjectAnimator.ofFloat(viewGroup, sc.a, 0.0f);
                                    }
                                    bVar2.a.c("contentFade").a(ofFloat3);
                                    arrayList2.add(ofFloat3);
                                }
                            }
                            viewGroup = null;
                            if (viewGroup != null) {
                            }
                        } else {
                            findViewById = ((ViewGroup) view4).getChildAt(0);
                        }
                    }
                    if (findViewById instanceof ViewGroup) {
                        viewGroup = (ViewGroup) findViewById;
                        if (viewGroup != null) {
                        }
                    }
                    viewGroup = null;
                    if (viewGroup != null) {
                    }
                }
                AnimatorSet animatorSet = new AnimatorSet();
                eb1.r(animatorSet, arrayList2);
                animatorSet.addListener(new a(z4, view4, view3));
                size = arrayList3.size();
                for (i3 = 0; i3 < size; i3++) {
                    animatorSet.addListener((Animator.AnimatorListener) arrayList3.get(i3));
                }
                return animatorSet;
            }
        }
        f = height;
        if (z6) {
        }
        if (z3) {
        }
        z5 = view4 instanceof ViewGroup;
        if (z5) {
            findViewById = view4.findViewById(fi0.mtrl_child_content_container);
            if (findViewById == null) {
            }
            if (findViewById instanceof ViewGroup) {
            }
            viewGroup = null;
            if (viewGroup != null) {
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        eb1.r(animatorSet2, arrayList2);
        animatorSet2.addListener(new a(z4, view4, view3));
        size = arrayList3.size();
        while (i3 < size) {
        }
        return animatorSet2;
    }

    public final float w(View view, View view2, p5 p5Var) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        z(view, rectF);
        rectF.offset(this.g, this.h);
        z(view2, rectF2);
        p5Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float x(View view, View view2, p5 p5Var) {
        RectF rectF = this.d;
        RectF rectF2 = this.e;
        z(view, rectF);
        rectF.offset(this.g, this.h);
        z(view2, rectF2);
        p5Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void z(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }
}