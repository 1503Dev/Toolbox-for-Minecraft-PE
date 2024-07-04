package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: iu  reason: default package */
public abstract class iu<V extends View> extends q41<V> {
    public a c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    /* renamed from: iu$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final CoordinatorLayout P;
        public final V Q;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.P = coordinatorLayout;
            this.Q = v;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller;
            if (this.Q != null && (overScroller = iu.this.d) != null) {
                if (overScroller.computeScrollOffset()) {
                    iu iuVar = iu.this;
                    iuVar.B(this.P, this.Q, iuVar.d.getCurrY());
                    V v = this.Q;
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    v.postOnAnimation(this);
                    return;
                }
                iu.this.z(this.Q, this.P);
            }
        }
    }

    public iu() {
        this.f = -1;
        this.h = -1;
    }

    public iu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = -1;
        this.h = -1;
    }

    public int A(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int f;
        int t = t();
        if (i2 != 0 && t >= i2 && t <= i3 && t != (f = p5.f(i, i2, i3))) {
            r41 r41Var = this.a;
            if (r41Var != null) {
                if (r41Var.d != f) {
                    r41Var.d = f;
                    r41Var.a();
                }
            } else {
                this.b = f;
            }
            return t - f;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(CoordinatorLayout coordinatorLayout, View view, int i) {
        A(coordinatorLayout, view, i, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getAction() == 2 && this.e) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f;
                    if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) != -1) {
                        int y = (int) motionEvent.getY(findPointerIndex);
                        if (Math.abs(y - this.g) > this.h) {
                            this.e = true;
                            this.g = y;
                        }
                    }
                }
            }
            this.e = false;
            this.f = -1;
            VelocityTracker velocityTracker = this.i;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.i = null;
            }
        } else {
            this.e = false;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (v(v) && coordinatorLayout.l(v, x, y2)) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
            }
        }
        VelocityTracker velocityTracker2 = this.i;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
        if (r0 != 3) goto L15;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f);
                    if (findPointerIndex == -1) {
                        return false;
                    }
                    int y = (int) motionEvent.getY(findPointerIndex);
                    int i = this.g - y;
                    if (!this.e) {
                        int abs = Math.abs(i);
                        int i2 = this.h;
                        if (abs > i2) {
                            this.e = true;
                            i = i > 0 ? i - i2 : i + i2;
                        }
                    }
                    if (this.e) {
                        this.g = y;
                        A(coordinatorLayout, v, y() - i, w(v), 0);
                    }
                }
            } else {
                VelocityTracker velocityTracker = this.i;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                    this.i.computeCurrentVelocity(1000);
                    float yVelocity = this.i.getYVelocity(this.f);
                    int i3 = -x(v);
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        v.removeCallbacks(runnable);
                        this.c = null;
                    }
                    if (this.d == null) {
                        this.d = new OverScroller(v.getContext());
                    }
                    this.d.fling(0, t(), 0, Math.round(yVelocity), 0, 0, i3, 0);
                    if (this.d.computeScrollOffset()) {
                        a aVar = new a(coordinatorLayout, v);
                        this.c = aVar;
                        WeakHashMap<View, String> weakHashMap = a41.a;
                        v.postOnAnimation(aVar);
                    } else {
                        z(v, coordinatorLayout);
                    }
                }
            }
            this.e = false;
            this.f = -1;
            VelocityTracker velocityTracker2 = this.i;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.i = null;
            }
        } else {
            int y2 = (int) motionEvent.getY();
            if (!coordinatorLayout.l(v, (int) motionEvent.getX(), y2) || !v(v)) {
                return false;
            }
            this.g = y2;
            this.f = motionEvent.getPointerId(0);
            if (this.i == null) {
                this.i = VelocityTracker.obtain();
            }
        }
        VelocityTracker velocityTracker3 = this.i;
        if (velocityTracker3 != null) {
            velocityTracker3.addMovement(motionEvent);
        }
        return true;
    }

    public boolean v(V v) {
        return false;
    }

    public int w(V v) {
        return -v.getHeight();
    }

    public int x(V v) {
        return v.getHeight();
    }

    public int y() {
        return t();
    }

    public void z(View view, CoordinatorLayout coordinatorLayout) {
    }
}