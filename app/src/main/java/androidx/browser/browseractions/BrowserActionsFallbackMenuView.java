package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int P;
    public final int Q;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.P = getResources().getDimensionPixelOffset(oh0.browser_actions_context_menu_min_padding);
        this.Q = getResources().getDimensionPixelOffset(oh0.browser_actions_context_menu_max_width);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.P * 2), this.Q), 1073741824), i2);
    }
}