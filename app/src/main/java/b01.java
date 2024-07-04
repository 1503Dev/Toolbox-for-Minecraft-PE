package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import defpackage.b01;
import defpackage.mz0;
import defpackage.xs0;
import defpackage.y21;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: b01  reason: default package */
public final class b01 extends y21 {
    public final Activity c;
    public final bw d;
    public mz0 e;
    public final mz0.a f;
    public ya0 g;
    public final b h;
    public final ab0 i;

    /* renamed from: b01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends y21.a {
        public a(mw mwVar, HashMap hashMap) {
            super(mwVar, hashMap);
        }
    }

    /* renamed from: b01$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public final LayerDrawable a;
        public final ShapeDrawable b;
        public final ValueAnimator c;
        public int d;
        public int e;
        public ya0 f;
        public final xs0 g = new xs0(new xs0.a() { // from class: c01
            @Override // defpackage.xs0.a
            public final void a() {
                b01.b bVar = b01.b.this;
                bVar.a(bVar.f.Q, true);
            }
        });

        public b(Context context, int i) {
            int color = context.getResources().getColor(2131099876);
            this.e = color;
            this.d = be.c(color, 0);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(2131165534);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            this.b = shapeDrawable;
            shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
            shapeDrawable.getPaint().setStrokeWidth(dimensionPixelSize);
            shapeDrawable.getPaint().setColor(this.d);
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
            shapeDrawable2.getPaint().setColor(be.c(i, 192));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable2, shapeDrawable});
            this.a = layerDrawable;
            int i2 = dimensionPixelSize / 2;
            layerDrawable.setLayerInset(1, i2, i2, i2, i2);
            ValueAnimator valueAnimator = new ValueAnimator();
            this.c = valueAnimator;
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.setDuration(200L);
            valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: d01
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    b01.b bVar = b01.b.this;
                    bVar.c(((Float) bVar.c.getAnimatedValue()).floatValue());
                }
            });
        }

        public final void a(boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.c;
            float[] fArr = new float[2];
            fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            fArr[1] = z ? 1.0f : 0.0f;
            valueAnimator.setFloatValues(fArr);
            if (z2) {
                this.c.start();
                return;
            }
            this.c.cancel();
            c(z ? 1.0f : 0.0f);
        }

        public final void b(ya0 ya0Var) {
            ya0 ya0Var2 = this.f;
            if (ya0Var2 != null) {
                ya0Var2.z(this.g);
            }
            this.f = ya0Var;
            if (ya0Var != null) {
                a(ya0Var.Q, false);
                this.f.a(this.g);
            }
        }

        public final void c(float f) {
            Paint paint = this.b.getPaint();
            int i = this.d;
            int i2 = this.e;
            int i3 = be.a;
            float f2 = 1.0f - f;
            paint.setColor(Color.argb((int) ((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), (int) ((Color.red(i2) * f) + (Color.red(i) * f2)), (int) ((Color.green(i2) * f) + (Color.green(i) * f2)), (int) ((Color.blue(i2) * f) + (Color.blue(i) * f2))));
            this.b.invalidateSelf();
        }
    }

    public b01(Activity activity, lw lwVar, q01 q01Var, ab0 ab0Var, ky0 ky0Var) {
        super(lwVar);
        this.f = new mz0.a();
        this.c = activity;
        this.d = ky0Var;
        this.g = q01Var;
        this.i = ab0Var;
        this.h = new b(activity, lwVar.b(activity));
        this.b.a(new a01(this));
        b();
    }

    public final void b() {
        boolean z;
        ya0 ya0Var;
        b bVar;
        xx xxVar;
        ky0 ky0Var;
        b01 b01Var;
        mz0 mz0Var = this.e;
        int i = 0;
        if (mz0Var != null) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = this.b.Q;
        if (z == z2) {
            return;
        }
        if (z2) {
            mz0 mz0Var2 = new mz0(this.c, this.f);
            this.e = mz0Var2;
            mz0.a aVar = this.f;
            if (aVar.a == -1 && aVar.b == -1) {
                bw bwVar = this.d;
                int width = mz0Var2.getWidth();
                int height = this.e.getHeight();
                ky0 ky0Var2 = (ky0) bwVar;
                int dimensionPixelSize = ky0Var2.a.getResources().getDimensionPixelSize(2131165531);
                int dimensionPixelSize2 = ky0Var2.a.getResources().getDimensionPixelSize(2131165533);
                int dimensionPixelSize3 = ky0Var2.a.getResources().getDimensionPixelSize(2131165535);
                int width2 = ky0Var2.a.getWindow().getDecorView().getWidth();
                int height2 = ky0Var2.a.getWindow().getDecorView().getHeight();
                int i2 = (width2 - dimensionPixelSize3) - dimensionPixelSize;
                loop0: while (true) {
                    if (i2 >= dimensionPixelSize) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new xx(i, dimensionPixelSize));
                        arrayList.add(new xx(height2 - dimensionPixelSize, height2));
                        Iterator<T> it = ky0Var2.b.i.iterator();
                        while (it.hasNext()) {
                            b01 b01Var2 = (b01) ((y21) it.next());
                            if (b01Var2 != null) {
                                mz0.a aVar2 = b01Var2.f;
                                int i3 = aVar2.a;
                                int i4 = aVar2.b;
                                if (dimensionPixelSize3 + i3 >= i2 && i3 <= i2 + width) {
                                    arrayList.add(new xx(i4 - dimensionPixelSize2, i4 + dimensionPixelSize3 + dimensionPixelSize2));
                                }
                            }
                        }
                        Iterator<T> it2 = ky0Var2.b.k.iterator();
                        while (it2.hasNext()) {
                            me meVar = (me) it2.next();
                            if ((meVar instanceof hy0) && (b01Var = ((hy0) meVar).q) != null) {
                                mz0.a aVar3 = b01Var.f;
                                int i5 = aVar3.a;
                                int i6 = aVar3.b;
                                if (dimensionPixelSize3 + i5 >= i2 && i5 <= i2 + width) {
                                    arrayList.add(new xx(i6 - dimensionPixelSize2, i6 + dimensionPixelSize3 + dimensionPixelSize2));
                                }
                            }
                        }
                        Collections.sort(arrayList, new Comparator() { // from class: jy0
                            @Override // java.util.Comparator
                            public final int compare(Object obj, Object obj2) {
                                return ((xx) obj).a - ((xx) obj2).a;
                            }
                        });
                        ArrayList arrayList2 = new ArrayList();
                        int i7 = 0;
                        while (i7 < arrayList.size()) {
                            int i8 = i7 + 1;
                            xx xxVar2 = (xx) arrayList.get(i7);
                            int i9 = xxVar2.b;
                            while (true) {
                                if (i8 < arrayList.size()) {
                                    ky0Var = ky0Var2;
                                    if (((xx) arrayList.get(i8)).a == xxVar2.a) {
                                        i9 = Math.max(i9, ((xx) arrayList.get(i8)).b);
                                        i8++;
                                        ky0Var2 = ky0Var;
                                    }
                                } else {
                                    ky0Var = ky0Var2;
                                    break;
                                }
                            }
                            arrayList2.add(new xx(xxVar2.a, i9));
                            i7 = i8;
                            ky0Var2 = ky0Var;
                        }
                        ky0 ky0Var3 = ky0Var2;
                        int i10 = 0;
                        while (i10 < arrayList2.size() - 1) {
                            i10++;
                            int i11 = ((xx) arrayList2.get(i10)).a;
                            int i12 = ((xx) arrayList2.get(i10)).b;
                            if (i11 - i12 > height) {
                                xxVar = new xx(i2, i12);
                                break loop0;
                            }
                        }
                        i2 -= dimensionPixelSize3 + dimensionPixelSize2;
                        ky0Var2 = ky0Var3;
                        i = 0;
                    } else {
                        double random = Math.random();
                        double d = width2 - width;
                        Double.isNaN(d);
                        Double.isNaN(d);
                        Double.isNaN(d);
                        int i13 = (int) (random * d);
                        double random2 = Math.random();
                        double d2 = height2 - height;
                        Double.isNaN(d2);
                        Double.isNaN(d2);
                        Double.isNaN(d2);
                        xxVar = new xx(i13, (int) (random2 * d2));
                        break;
                    }
                }
                mz0.a aVar4 = this.f;
                aVar4.a = xxVar.a;
                aVar4.b = xxVar.b;
            }
            mz0 mz0Var3 = this.e;
            final lw lwVar = this.a;
            Objects.requireNonNull(lwVar);
            mz0Var3.getContentView().setOnClickListener(new iz0(0, new Runnable() { // from class: zz0
                @Override // java.lang.Runnable
                public final void run() {
                    lw.this.d();
                }
            }));
            this.e.g(this.g);
            this.e.f(this.i);
            this.e.e().setImageResource(this.a.c(this.c));
            cx.a(this.e.e(), ColorStateList.valueOf(-1));
            this.e.e().setBackground(this.h.a);
            bVar = this.h;
            ya0Var = this.a.a();
        } else {
            ya0Var = null;
            mz0Var.g(null);
            this.e.f(this.i);
            this.e.dismiss();
            this.e = null;
            bVar = this.h;
        }
        bVar.b(ya0Var);
    }
}