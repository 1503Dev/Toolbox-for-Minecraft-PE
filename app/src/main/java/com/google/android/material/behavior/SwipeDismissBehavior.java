package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.g41;
import java.util.WeakHashMap;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public g41 a;
    public boolean b;
    public int c = 2;
    public float d = 0.5f;
    public float e = 0.0f;
    public float f = 0.5f;
    public final a g = new a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends g41.c {
        public int a;
        public int b = -1;

        public a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
            if (r0 != false) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
            r0 = r3.a;
            r4 = r4.getWidth() + r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
            r0 = r3.a - r4.getWidth();
            r4 = r3.a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
            if (r0 != false) goto L11;
         */
        @Override // defpackage.g41.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int a(View view, int i) {
            boolean z;
            int width;
            int width2;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (view.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            int i2 = SwipeDismissBehavior.this.c;
            if (i2 != 0) {
                if (i2 != 1) {
                    width = this.a - view.getWidth();
                    width2 = view.getWidth() + this.a;
                }
            }
            return Math.min(Math.max(width, i), width2);
        }

        @Override // defpackage.g41.c
        public final int b(View view, int i) {
            return view.getTop();
        }

        @Override // defpackage.g41.c
        public final int c(View view) {
            return view.getWidth();
        }

        @Override // defpackage.g41.c
        public final void e(View view, int i) {
            this.b = i;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // defpackage.g41.c
        public final void f(int i) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // defpackage.g41.c
        public final void g(View view, int i, int i2) {
            float width = (view.getWidth() * SwipeDismissBehavior.this.e) + this.a;
            float width2 = (view.getWidth() * SwipeDismissBehavior.this.f) + this.a;
            float f = i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
            if (java.lang.Math.abs(r7.getLeft() - r6.a) >= java.lang.Math.round(r7.getWidth() * r6.c.d)) goto L36;
         */
        @Override // defpackage.g41.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void h(View view, float f, float f2) {
            boolean z;
            int i;
            boolean z2;
            this.b = -1;
            int width = view.getWidth();
            boolean z3 = true;
            if (f != 0.0f) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (view.getLayoutDirection() == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i2 = SwipeDismissBehavior.this.c;
                if (i2 != 2) {
                    z = i2 == 0 ? false : false;
                }
                z = true;
            }
            if (z) {
                int left = view.getLeft();
                int i3 = this.a;
                if (left < i3) {
                    i = i3 - width;
                } else {
                    i = i3 + width;
                }
            } else {
                i = this.a;
                z3 = false;
            }
            if (SwipeDismissBehavior.this.a.q(i, view.getTop())) {
                b bVar = new b(view, z3);
                WeakHashMap<View, String> weakHashMap2 = a41.a;
                view.postOnAnimation(bVar);
            } else if (z3) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // defpackage.g41.c
        public final boolean i(View view, int i) {
            int i2 = this.b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.t(view);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public final View P;
        public final boolean Q;

        public b(View view, boolean z) {
            this.P = view;
            this.Q = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            g41 g41Var = SwipeDismissBehavior.this.a;
            if (g41Var != null && g41Var.g()) {
                View view = this.P;
                WeakHashMap<View, String> weakHashMap = a41.a;
                view.postOnAnimation(this);
            } else if (this.Q) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean f(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.b = false;
            }
        } else {
            z = coordinatorLayout.l(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.b = z;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = new g41(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return this.a.r(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean s(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        g41 g41Var = this.a;
        if (g41Var != null) {
            g41Var.k(motionEvent);
            return true;
        }
        return false;
    }

    public boolean t(View view) {
        return true;
    }
}