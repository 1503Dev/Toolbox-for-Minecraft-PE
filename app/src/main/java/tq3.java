package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* renamed from: tq3  reason: default package */
public final class tq3 extends FrameLayout {
    public final y02 P;

    public tq3(Context context, View view, y02 y02Var) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.P = y02Var;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.P.a(motionEvent);
        return false;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof y03)) {
                arrayList.add((y03) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((y03) arrayList.get(i2)).destroy();
        }
    }
}