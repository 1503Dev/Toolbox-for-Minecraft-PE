package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    public int a;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View P;
        public final /* synthetic */ int Q;
        public final /* synthetic */ op R;

        public a(View view, int i, op opVar) {
            this.P = view;
            this.Q = i;
            this.R = opVar;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            this.P.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.a == this.Q) {
                op opVar = this.R;
                expandableBehavior.t((View) opVar, this.P, opVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean b(View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        int i;
        op opVar = (op) view2;
        int i2 = 2;
        if (!opVar.a() ? this.a != 1 : (i = this.a) != 0 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (opVar.a()) {
            i2 = 1;
        }
        this.a = i2;
        t((View) opVar, view, opVar.a(), true);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        op opVar;
        boolean z;
        int i2;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (!view.isLaidOut()) {
            ArrayList d = coordinatorLayout.d(view);
            int size = d.size();
            int i3 = 0;
            while (true) {
                if (i3 < size) {
                    View view2 = (View) d.get(i3);
                    if (b(view, view2)) {
                        opVar = (op) view2;
                        break;
                    }
                    i3++;
                } else {
                    opVar = null;
                    break;
                }
            }
            if (opVar != null) {
                int i4 = 2;
                if (!opVar.a() ? this.a != 1 : (i2 = this.a) != 0 && i2 != 2) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (opVar.a()) {
                        i4 = 1;
                    }
                    this.a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(view, i4, opVar));
                }
            }
        }
        return false;
    }

    public abstract void t(View view, View view2, boolean z, boolean z2);
}