package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.b;

public class FitWindowsFrameLayout extends FrameLayout implements b {
    public b.a P;

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        b.a aVar = this.P;
        if (aVar != null) {
            rect.top = ((h5) aVar).a.N(rect.top);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.b
    public void setOnFitSystemWindowsListener(b.a aVar) {
        this.P = aVar;
    }
}