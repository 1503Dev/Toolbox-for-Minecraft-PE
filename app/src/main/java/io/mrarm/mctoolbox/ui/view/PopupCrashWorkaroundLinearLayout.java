package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class PopupCrashWorkaroundLinearLayout extends LinearLayout {
    public PopupCrashWorkaroundLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public IBinder getWindowToken() {
        return getApplicationWindowToken();
    }
}