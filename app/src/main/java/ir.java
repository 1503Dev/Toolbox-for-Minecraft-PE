package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* renamed from: ir  reason: default package */
public abstract class ir implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public final float P;
    public final int Q;
    public final int R;
    public final View S;
    public a T;
    public b U;
    public boolean V;
    public int W;
    public final int[] X = new int[2];

    /* renamed from: ir$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = ir.this.S.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: ir$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ir irVar = ir.this;
            irVar.a();
            View view = irVar.S;
            if (view.isEnabled() && !view.isLongClickable() && irVar.c()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(obtain);
                obtain.recycle();
                irVar.V = true;
            }
        }
    }

    public ir(View view) {
        this.S = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.P = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.Q = tapTimeout;
        this.R = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.U;
        if (bVar != null) {
            this.S.removeCallbacks(bVar);
        }
        a aVar = this.T;
        if (aVar != null) {
            this.S.removeCallbacks(aVar);
        }
    }

    public abstract bs0 b();

    public abstract boolean c();

    public boolean d() {
        bs0 b2 = b();
        if (b2 == null || !b2.c()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r4 != 3) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0110  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        wm g;
        boolean z5;
        boolean z6 = this.V;
        if (z6) {
            View view2 = this.S;
            bs0 b2 = b();
            if (b2 != null && b2.c() && (g = b2.g()) != null && g.isShown()) {
                MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.X;
                view2.getLocationOnScreen(iArr);
                obtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                int[] iArr2 = this.X;
                g.getLocationOnScreen(iArr2);
                obtainNoHistory.offsetLocation(-iArr2[0], -iArr2[1]);
                boolean b3 = g.b(obtainNoHistory, this.W);
                obtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 1 && actionMasked != 3) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (b3 && z5) {
                    z4 = true;
                    if (z4 && d()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                }
            }
            z4 = false;
            if (z4) {
            }
            z2 = true;
        } else {
            View view3 = this.S;
            if (view3.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 != 0) {
                    if (actionMasked2 != 1) {
                        if (actionMasked2 == 2) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.W);
                            if (findPointerIndex >= 0) {
                                float x = motionEvent.getX(findPointerIndex);
                                float y = motionEvent.getY(findPointerIndex);
                                float f = this.P;
                                float f2 = -f;
                                if (x >= f2 && y >= f2 && x < (view3.getRight() - view3.getLeft()) + f && y < (view3.getBottom() - view3.getTop()) + f) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    a();
                                    view3.getParent().requestDisallowInterceptTouchEvent(true);
                                    z = true;
                                    if (!z && c()) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        long uptimeMillis = SystemClock.uptimeMillis();
                                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                                        this.S.onTouchEvent(obtain);
                                        obtain.recycle();
                                    }
                                }
                            }
                        }
                    }
                    a();
                } else {
                    this.W = motionEvent.getPointerId(0);
                    if (this.T == null) {
                        this.T = new a();
                    }
                    view3.postDelayed(this.T, this.Q);
                    if (this.U == null) {
                        this.U = new b();
                    }
                    view3.postDelayed(this.U, this.R);
                }
            }
            z = false;
            if (!z) {
            }
            z2 = false;
            if (z2) {
            }
        }
        this.V = z2;
        if (!z2 && !z6) {
            return false;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.V = false;
        this.W = -1;
        a aVar = this.T;
        if (aVar != null) {
            this.S.removeCallbacks(aVar);
        }
    }
}