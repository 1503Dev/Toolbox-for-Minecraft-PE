package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public final class l extends RecyclerView.n implements RecyclerView.s {
    public static final int[] C = {16842919};
    public static final int[] D = new int[0];
    public int A;
    public final a B;
    public final int a;
    public final int b;
    public final StateListDrawable c;
    public final Drawable d;
    public final int e;
    public final int f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            l lVar = l.this;
            int i = lVar.A;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                lVar.z.cancel();
            }
            lVar.A = 3;
            ValueAnimator valueAnimator = lVar.z;
            valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
            lVar.z.setDuration(500);
            lVar.z.start();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends RecyclerView.t {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public final void b(RecyclerView recyclerView, int i, int i2) {
            boolean z;
            boolean z2;
            l lVar = l.this;
            int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
            int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
            int computeVerticalScrollRange = lVar.s.computeVerticalScrollRange();
            int i3 = lVar.r;
            if (computeVerticalScrollRange - i3 > 0 && i3 >= lVar.a) {
                z = true;
            } else {
                z = false;
            }
            lVar.t = z;
            int computeHorizontalScrollRange = lVar.s.computeHorizontalScrollRange();
            int i4 = lVar.q;
            if (computeHorizontalScrollRange - i4 > 0 && i4 >= lVar.a) {
                z2 = true;
            } else {
                z2 = false;
            }
            lVar.u = z2;
            boolean z3 = lVar.t;
            if (!z3 && !z2) {
                if (lVar.v != 0) {
                    lVar.i(0);
                    return;
                }
                return;
            }
            if (z3) {
                float f = i3;
                lVar.l = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
                lVar.k = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
            }
            if (lVar.u) {
                float f2 = computeHorizontalScrollOffset;
                float f3 = i4;
                lVar.o = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
                lVar.n = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
            }
            int i5 = lVar.v;
            if (i5 == 0 || i5 == 1) {
                lVar.i(1);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends AnimatorListenerAdapter {
        public boolean a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.a) {
                this.a = false;
            } else if (((Float) l.this.z.getAnimatedValue()).floatValue() == 0.0f) {
                l lVar = l.this;
                lVar.A = 0;
                lVar.i(0);
            } else {
                l lVar2 = l.this;
                lVar2.A = 2;
                lVar2.s.invalidate();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            l.this.c.setAlpha(floatValue);
            l.this.d.setAlpha(floatValue);
            l.this.s.invalidate();
        }
    }

    public l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        a aVar = new a();
        this.B = aVar;
        b bVar = new b();
        this.c = stateListDrawable;
        this.d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.a = i2;
        this.b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new d());
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.removeItemDecoration(this);
                this.s.removeOnItemTouchListener(this);
                this.s.removeOnScrollListener(bVar);
                this.s.removeCallbacks(aVar);
            }
            this.s = recyclerView;
            if (recyclerView != null) {
                recyclerView.addItemDecoration(this);
                this.s.addOnItemTouchListener(this);
                this.s.addOnScrollListener(bVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bc, code lost:
        if (r8 >= 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
        if (r5 >= 0) goto L47;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(MotionEvent motionEvent) {
        int i;
        int i2;
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            if (g || f) {
                if (f) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (g) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                i(2);
            }
        } else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            i(1);
            this.w = 0;
        } else if (motionEvent.getAction() == 2 && this.v == 2) {
            j();
            if (this.w == 1) {
                float x = motionEvent.getX();
                int[] iArr = this.y;
                int i3 = this.b;
                iArr[0] = i3;
                int i4 = this.q - i3;
                iArr[1] = i4;
                float max = Math.max(i3, Math.min(i4, x));
                if (Math.abs(this.o - max) >= 2.0f) {
                    float f2 = this.p;
                    int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
                    int computeHorizontalScrollOffset = this.s.computeHorizontalScrollOffset();
                    int i5 = this.q;
                    int i6 = iArr[1] - iArr[0];
                    if (i6 != 0) {
                        int i7 = computeHorizontalScrollRange - i5;
                        i2 = (int) (((max - f2) / i6) * i7);
                        int i8 = computeHorizontalScrollOffset + i2;
                        if (i8 < i7) {
                        }
                    }
                    i2 = 0;
                    if (i2 != 0) {
                        this.s.scrollBy(i2, 0);
                    }
                    this.p = max;
                }
            }
            if (this.w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.x;
                int i9 = this.b;
                iArr2[0] = i9;
                int i10 = this.r - i9;
                iArr2[1] = i10;
                float max2 = Math.max(i9, Math.min(i10, y));
                if (Math.abs(this.l - max2) >= 2.0f) {
                    float f3 = this.m;
                    int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
                    int computeVerticalScrollOffset = this.s.computeVerticalScrollOffset();
                    int i11 = this.r;
                    int i12 = iArr2[1] - iArr2[0];
                    if (i12 != 0) {
                        int i13 = computeVerticalScrollRange - i11;
                        i = (int) (((max2 - f3) / i12) * i13);
                        int i14 = computeVerticalScrollOffset + i;
                        if (i14 < i13) {
                        }
                    }
                    i = 0;
                    if (i != 0) {
                        this.s.scrollBy(0, i);
                    }
                    this.m = max2;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final boolean b(MotionEvent motionEvent) {
        int i = this.v;
        if (i == 1) {
            boolean g = g(motionEvent.getX(), motionEvent.getY());
            boolean f = f(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() == 0 && (g || f)) {
                if (f) {
                    this.w = 1;
                    this.p = (int) motionEvent.getX();
                } else if (g) {
                    this.w = 2;
                    this.m = (int) motionEvent.getY();
                }
                i(2);
                return true;
            }
        } else if (i == 2) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void c() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    int i = this.q;
                    int i2 = this.e;
                    int i3 = i - i2;
                    int i4 = this.l;
                    int i5 = this.k;
                    int i6 = i4 - (i5 / 2);
                    this.c.setBounds(0, 0, i2, i5);
                    this.d.setBounds(0, 0, this.f, this.r);
                    RecyclerView recyclerView2 = this.s;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    boolean z = true;
                    if (recyclerView2.getLayoutDirection() != 1) {
                        z = false;
                    }
                    if (z) {
                        this.d.draw(canvas);
                        canvas.translate(this.e, i6);
                        canvas.scale(-1.0f, 1.0f);
                        this.c.draw(canvas);
                        canvas.scale(1.0f, 1.0f);
                        i3 = this.e;
                    } else {
                        canvas.translate(i3, 0.0f);
                        this.d.draw(canvas);
                        canvas.translate(0.0f, i6);
                        this.c.draw(canvas);
                    }
                    canvas.translate(-i3, -i6);
                }
                if (this.u) {
                    int i7 = this.r;
                    int i8 = this.i;
                    int i9 = i7 - i8;
                    int i10 = this.o;
                    int i11 = this.n;
                    int i12 = i10 - (i11 / 2);
                    this.g.setBounds(0, 0, i11, i8);
                    this.h.setBounds(0, 0, this.q, this.j);
                    canvas.translate(0.0f, i9);
                    this.h.draw(canvas);
                    canvas.translate(i12, 0.0f);
                    this.g.draw(canvas);
                    canvas.translate(-i12, -i9);
                    return;
                }
                return;
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        i(0);
    }

    public final boolean f(float f, float f2) {
        if (f2 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f >= i - (i2 / 2) && f <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public final boolean g(float f, float f2) {
        boolean z;
        RecyclerView recyclerView = this.s;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (recyclerView.getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f > this.e / 2) {
                return false;
            }
        } else if (f < this.q - this.e) {
            return false;
        }
        int i = this.l;
        int i2 = this.k / 2;
        if (f2 < i - i2 || f2 > i2 + i) {
            return false;
        }
        return true;
    }

    public final void h(int i) {
        this.s.removeCallbacks(this.B);
        this.s.postDelayed(this.B, i);
    }

    public final void i(int i) {
        int i2;
        if (i == 2 && this.v != 2) {
            this.c.setState(C);
            this.s.removeCallbacks(this.B);
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            j();
        }
        if (this.v == 2 && i != 2) {
            this.c.setState(D);
            i2 = 1200;
        } else {
            i2 = i == 1 ? 1500 : 1500;
            this.v = i;
        }
        h(i2);
        this.v = i;
    }

    public final void j() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }
}