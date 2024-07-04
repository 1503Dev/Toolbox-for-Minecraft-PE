package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* renamed from: g41  reason: default package */
public final class g41 {
    public static final a v = new a();
    public int a;
    public int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public float m;
    public float n;
    public int o;
    public OverScroller p;
    public final c q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public int c = -1;
    public final b u = new b();

    /* renamed from: g41$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: g41$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g41.this.p(0);
        }
    }

    /* renamed from: g41$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
        public abstract int a(View view, int i);

        public abstract int b(View view, int i);

        public int c(View view) {
            return 0;
        }

        public int d() {
            return 0;
        }

        public void e(View view, int i) {
        }

        public abstract void f(int i);

        public abstract void g(View view, int i, int i2);

        public abstract void h(View view, float f, float f2);

        public abstract boolean i(View view, int i);
    }

    public g41(Context context, ViewGroup viewGroup, c cVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (cVar == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.t = viewGroup;
        this.q = cVar;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.b = viewConfiguration.getScaledTouchSlop();
        this.m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.p = new OverScroller(context, v);
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        if (view.getParent() == this.t) {
            this.r = view;
            this.c = i;
            this.q.e(view, i);
            p(1);
            return;
        }
        StringBuilder b2 = e5.b("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
        b2.append(this.t);
        b2.append(")");
        throw new IllegalArgumentException(b2.toString());
    }

    public final boolean c(float f, float f2, int i, int i2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if ((this.h[i] & i2) != i2 || (0 & i2) == 0 || (this.j[i] & i2) == i2 || (this.i[i] & i2) == i2) {
            return false;
        }
        int i3 = this.b;
        if (abs > i3 || abs2 > i3) {
            if (abs < abs2 * 0.5f) {
                this.q.getClass();
            }
            return (this.i[i] & i2) == 0 && abs > ((float) this.b);
        }
        return false;
    }

    public final boolean d(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        boolean z = this.q.c(view) > 0;
        boolean z2 = this.q.d() > 0;
        if (!z || !z2) {
            return z ? Math.abs(f) > ((float) this.b) : z2 && Math.abs(f2) > ((float) this.b);
        }
        float f3 = f2 * f2;
        int i = this.b;
        return f3 + (f * f) > ((float) (i * i));
    }

    public final void e(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            boolean z = true;
            int i3 = 1 << i;
            if ((i3 & i2) == 0) {
                z = false;
            }
            if (z) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (i3 ^ (-1)) & i2;
            }
        }
    }

    public final int f(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean g() {
        if (this.a == 2) {
            boolean computeScrollOffset = this.p.computeScrollOffset();
            int currX = this.p.getCurrX();
            int currY = this.p.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                a41.i(this.r, left);
            }
            if (top != 0) {
                a41.j(this.r, top);
            }
            if (left != 0 || top != 0) {
                this.q.g(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == this.p.getFinalX() && currY == this.p.getFinalY()) {
                this.p.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.u);
            }
        }
        return this.a == 2;
    }

    public final View h(int i, int i2) {
        for (int childCount = this.t.getChildCount() - 1; childCount >= 0; childCount--) {
            ViewGroup viewGroup = this.t;
            this.q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        if (i5 == 0 && i6 == 0) {
            this.p.abortAnimation();
            p(0);
            return false;
        }
        View view = this.r;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            if (i3 > 0) {
                i3 = i8;
            } else {
                i3 = -i8;
            }
        }
        int i9 = (int) this.n;
        int i10 = (int) this.m;
        int abs2 = Math.abs(i4);
        if (abs2 < i9) {
            i4 = 0;
        } else if (abs2 > i10) {
            if (i4 > 0) {
                i4 = i10;
            } else {
                i4 = -i10;
            }
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i11 = abs5 + abs6;
        int i12 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i11;
        } else {
            f = abs3;
            f2 = i12;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i11;
        } else {
            f3 = abs4;
            f4 = i12;
        }
        float f6 = f3 / f4;
        this.p.startScroll(left, top, i5, i6, (int) ((f(i6, i4, this.q.d()) * f6) + (f(i5, i3, this.q.c(view)) * f5)));
        p(2);
        return true;
    }

    public final boolean j(int i) {
        boolean z;
        if ((this.k & (1 << i)) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public final void k(MotionEvent motionEvent) {
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.c) {
                                                View h = h((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.r;
                                                if (h == view && s(view, pointerId2)) {
                                                    i = this.c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        l();
                                    }
                                }
                                e(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        n(x, y, pointerId3);
                        if (this.a == 0) {
                            s(h((int) x, (int) y), pointerId3);
                            if ((this.h[pointerId3] & 0) == 0) {
                                return;
                            }
                        } else {
                            int i3 = (int) x;
                            int i4 = (int) y;
                            View view2 = this.r;
                            if (view2 != null && i3 >= view2.getLeft() && i3 < view2.getRight() && i4 >= view2.getTop() && i4 < view2.getBottom()) {
                                i2 = 1;
                            }
                            if (i2 != 0) {
                                s(this.r, pointerId3);
                                return;
                            }
                            return;
                        }
                    } else if (this.a == 1) {
                        this.s = true;
                        this.q.h(this.r, 0.0f, 0.0f);
                        this.s = false;
                        if (this.a == 1) {
                            p(0);
                        }
                    }
                } else {
                    if (this.a == 1) {
                        if (j(this.c)) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.c);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.f;
                            int i5 = this.c;
                            int i6 = (int) (x2 - fArr[i5]);
                            int i7 = (int) (y2 - this.g[i5]);
                            int left = this.r.getLeft() + i6;
                            int top = this.r.getTop() + i7;
                            int left2 = this.r.getLeft();
                            int top2 = this.r.getTop();
                            if (i6 != 0) {
                                left = this.q.a(this.r, left);
                                a41.i(this.r, left - left2);
                            }
                            if (i7 != 0) {
                                top = this.q.b(this.r, top);
                                a41.j(this.r, top - top2);
                            }
                            if (i6 != 0 || i7 != 0) {
                                this.q.g(this.r, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        while (i2 < pointerCount2) {
                            int pointerId4 = motionEvent.getPointerId(i2);
                            if (j(pointerId4)) {
                                float x3 = motionEvent.getX(i2);
                                float y3 = motionEvent.getY(i2);
                                float f = x3 - this.d[pointerId4];
                                float f2 = y3 - this.e[pointerId4];
                                m(f, f2, pointerId4);
                                if (this.a != 1) {
                                    View h2 = h((int) x3, (int) y3);
                                    if (d(h2, f, f2) && s(h2, pointerId4)) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            i2++;
                        }
                    }
                    o(motionEvent);
                    return;
                }
            } else if (this.a == 1) {
                l();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View h3 = h((int) x4, (int) y4);
        n(x4, y4, pointerId5);
        s(h3, pointerId5);
        if ((this.h[pointerId5] & 0) == 0) {
            return;
        }
        this.q.getClass();
    }

    public final void l() {
        this.l.computeCurrentVelocity(1000, this.m);
        float xVelocity = this.l.getXVelocity(this.c);
        float f = this.n;
        float f2 = this.m;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f) {
            xVelocity = 0.0f;
        } else if (abs > f2) {
            if (xVelocity > 0.0f) {
                xVelocity = f2;
            } else {
                xVelocity = -f2;
            }
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float f4 = this.n;
        float f5 = this.m;
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f4) {
            if (abs2 > f5) {
                if (yVelocity > 0.0f) {
                    f3 = f5;
                } else {
                    yVelocity = -f5;
                }
            }
            f3 = yVelocity;
        }
        this.s = true;
        this.q.h(this.r, xVelocity, f3);
        this.s = false;
        if (this.a == 1) {
            p(0);
        }
    }

    public final void m(float f, float f2, int i) {
        boolean c2 = c(f, f2, i, 1);
        if (c(f2, f, i, 4)) {
            c2 |= true;
        }
        if (c(f, f2, i, 2)) {
            c2 |= true;
        }
        if (c(f2, f, i, 8)) {
            c2 |= true;
        }
        if (c2) {
            int[] iArr = this.i;
            iArr[i] = iArr[i] | c2;
            this.q.getClass();
        }
    }

    public final void n(float f, float f2, int i) {
        float[] fArr = this.d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
        }
        float[] fArr9 = this.d;
        this.f[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.e;
        this.g[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.h;
        int i4 = (int) f;
        int i5 = (int) f2;
        if (i4 < this.t.getLeft() + this.o) {
            i2 = 1;
        }
        if (i5 < this.t.getTop() + this.o) {
            i2 |= 4;
        }
        if (i4 > this.t.getRight() - this.o) {
            i2 |= 2;
        }
        if (i5 > this.t.getBottom() - this.o) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.k |= 1 << i;
    }

    public final void o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if (j(pointerId)) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void p(int i) {
        this.t.removeCallbacks(this.u);
        if (this.a != i) {
            this.a = i;
            this.q.f(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean q(int i, int i2) {
        if (this.s) {
            return i(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
        if (r12 != r11) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(MotionEvent motionEvent) {
        View h;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.l == null) {
            this.l = VelocityTracker.obtain();
        }
        this.l.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            n(x, y, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                if ((this.h[pointerId] & 0) != 0) {
                                    this.q.getClass();
                                }
                            } else if (i == 2 && (h = h((int) x, (int) y)) == this.r) {
                                s(h, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            e(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i2 = 0; i2 < pointerCount; i2++) {
                        int pointerId2 = motionEvent.getPointerId(i2);
                        if (j(pointerId2)) {
                            float x2 = motionEvent.getX(i2);
                            float y2 = motionEvent.getY(i2);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y2 - this.e[pointerId2];
                            View h2 = h((int) x2, (int) y2);
                            boolean z = h2 != null && d(h2, f, f2);
                            if (z) {
                                int left = h2.getLeft();
                                int a2 = this.q.a(h2, ((int) f) + left);
                                int top = h2.getTop();
                                int b2 = this.q.b(h2, ((int) f2) + top);
                                int c2 = this.q.c(h2);
                                int d = this.q.d();
                                if (c2 != 0) {
                                    if (c2 > 0) {
                                    }
                                }
                                if (d == 0) {
                                    break;
                                } else if (d > 0 && b2 == top) {
                                    break;
                                }
                            }
                            m(f, f2, pointerId2);
                            if (this.a != 1) {
                                if (z && s(h2, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    o(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            n(x3, y3, pointerId3);
            View h3 = h((int) x3, (int) y3);
            if (h3 == this.r && this.a == 2) {
                s(h3, pointerId3);
            }
            if ((this.h[pointerId3] & 0) != 0) {
                this.q.getClass();
            }
        }
        return this.a == 1;
    }

    public final boolean s(View view, int i) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view == null || !this.q.i(view, i)) {
            return false;
        }
        this.c = i;
        b(view, i);
        return true;
    }
}