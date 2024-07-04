package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;

public class PopupCrashWorkaroundImageButton extends q5 {
    public PopupCrashWorkaroundImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public IBinder getWindowToken() {
        return getApplicationWindowToken();
    }
}