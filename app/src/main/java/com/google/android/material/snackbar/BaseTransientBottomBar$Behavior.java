package com.google.android.material.snackbar;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final n9 h = new n9(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        this.h.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (lt0.b == null) {
                    lt0.b = new lt0();
                }
                synchronized (lt0.b.a) {
                }
            }
        } else if (coordinatorLayout.l(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (lt0.b == null) {
                lt0.b = new lt0();
            }
            synchronized (lt0.b.a) {
            }
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean t(View view) {
        this.h.getClass();
        return view instanceof q9;
    }
}