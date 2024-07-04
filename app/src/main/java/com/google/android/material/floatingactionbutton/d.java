package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.wt0;
import java.util.ArrayList;
import java.util.Iterator;

public class d {
    public kr0 a;
    public boolean b;
    public float d;
    public float e;
    public float f;
    public final wt0 g;
    public q60 h;
    public q60 i;
    public Animator j;
    public q60 k;
    public q60 l;
    public float m;
    public ArrayList<Animator.AnimatorListener> p;
    public ArrayList<Animator.AnimatorListener> q;
    public ArrayList<e> r;
    public final FloatingActionButton s;
    public final jr0 t;
    public final Matrix v;
    public lq w;
    public static final tp x = i4.c;
    public static final int[] y = {16842919, 16842910};
    public static final int[] z = {16843623, 16842908, 16842910};
    public static final int[] A = {16842908, 16842910};
    public static final int[] B = {16843623, 16842910};
    public static final int[] C = {16842910};
    public static final int[] D = new int[0];
    public boolean c = true;
    public float n = 1.0f;
    public int o = 0;
    public final Rect u = new Rect();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends p40 {
        public a() {
        }

        @Override // android.animation.TypeEvaluator
        public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            d.this.n = f;
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i = 0; i < 9; i++) {
                float[] fArr = this.b;
                float f2 = fArr[i];
                float f3 = this.a[i];
                fArr[i] = ((f2 - f3) * f) + f3;
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends h {
        public b(d dVar) {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        public final float a() {
            return 0.0f;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends h {
        public c() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        public final float a() {
            d dVar = d.this;
            return dVar.d + dVar.e;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class C0027d extends h {
        public C0027d() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        public final float a() {
            d dVar = d.this;
            return dVar.d + dVar.f;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface e {
        void a();

        void b();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface f {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g extends h {
        public g() {
            super();
        }

        @Override // com.google.android.material.floatingactionbutton.d.h
        public final float a() {
            return d.this.d;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public abstract class h extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public boolean a;

        public h() {
        }

        public abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            d.this.getClass();
            this.a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.a) {
                d.this.getClass();
                a();
                this.a = true;
            }
            d dVar = d.this;
            valueAnimator.getAnimatedFraction();
            dVar.getClass();
        }
    }

    public d(FloatingActionButton floatingActionButton, FloatingActionButton.b bVar) {
        new RectF();
        new RectF();
        this.v = new Matrix();
        this.s = floatingActionButton;
        this.t = bVar;
        wt0 wt0Var = new wt0();
        this.g = wt0Var;
        wt0Var.a(y, b(new C0027d()));
        wt0Var.a(z, b(new c()));
        wt0Var.a(A, b(new c()));
        wt0Var.a(B, b(new c()));
        wt0Var.a(C, b(new g()));
        wt0Var.a(D, b(new b(this)));
        this.m = floatingActionButton.getRotation();
    }

    public static ValueAnimator b(h hVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(x);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(hVar);
        valueAnimator.addUpdateListener(hVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    public final AnimatorSet a(q60 q60Var, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.s, View.ALPHA, f2);
        q60Var.c("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.s, View.SCALE_X, f3);
        q60Var.c("scale").a(ofFloat2);
        int i = Build.VERSION.SDK_INT;
        if (i == 26) {
            ofFloat2.setEvaluator(new kq());
        }
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.s, View.SCALE_Y, f3);
        q60Var.c("scale").a(ofFloat3);
        if (i == 26) {
            ofFloat3.setEvaluator(new kq());
        }
        arrayList.add(ofFloat3);
        this.v.reset();
        this.s.getDrawable();
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.s, new ax(), new a(), new Matrix(this.v));
        q60Var.c("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        eb1.r(animatorSet, arrayList);
        return animatorSet;
    }

    public float c() {
        return this.d;
    }

    public void d(Rect rect) {
        int sizeDimension = this.b ? (0 - this.s.getSizeDimension()) / 2 : 0;
        float c2 = this.c ? c() + this.f : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(c2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(c2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public void e() {
        wt0 wt0Var = this.g;
        ValueAnimator valueAnimator = wt0Var.c;
        if (valueAnimator != null) {
            valueAnimator.end();
            wt0Var.c = null;
        }
    }

    public void f() {
    }

    public void g(int[] iArr) {
        wt0.b bVar;
        ValueAnimator valueAnimator;
        wt0 wt0Var = this.g;
        int size = wt0Var.a.size();
        int i = 0;
        while (true) {
            if (i < size) {
                bVar = wt0Var.a.get(i);
                if (StateSet.stateSetMatches(bVar.a, iArr)) {
                    break;
                }
                i++;
            } else {
                bVar = null;
                break;
            }
        }
        wt0.b bVar2 = wt0Var.b;
        if (bVar != bVar2) {
            if (bVar2 != null && (valueAnimator = wt0Var.c) != null) {
                valueAnimator.cancel();
                wt0Var.c = null;
            }
            wt0Var.b = bVar;
            if (bVar != null) {
                ValueAnimator valueAnimator2 = bVar.b;
                wt0Var.c = valueAnimator2;
                valueAnimator2.start();
            }
        }
    }

    public void h(float f2, float f3, float f4) {
        l();
        throw null;
    }

    public final void i() {
        ArrayList<e> arrayList = this.r;
        if (arrayList != null) {
            Iterator<e> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    public void j() {
    }

    public void k() {
        FloatingActionButton floatingActionButton;
        int i;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.m % 90.0f != 0.0f) {
                i = 1;
                if (this.s.getLayerType() == 1) {
                    return;
                }
                floatingActionButton = this.s;
            } else if (this.s.getLayerType() == 0) {
                return;
            } else {
                floatingActionButton = this.s;
                i = 0;
            }
            floatingActionButton.setLayerType(i, null);
        }
    }

    public final void l() {
        d(this.u);
        throw new NullPointerException("Didn't initialize content background");
    }
}