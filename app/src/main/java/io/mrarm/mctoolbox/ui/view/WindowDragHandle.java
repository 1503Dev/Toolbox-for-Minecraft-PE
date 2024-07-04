package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class WindowDragHandle extends LinearLayout {
    public final bm P;

    public WindowDragHandle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.P = new bm(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
    }

    public bm getDragHelper() {
        return this.P;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.P.a(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.P.a(motionEvent);
        return true;
    }
}