package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

/* renamed from: g06  reason: default package */
public final class g06 {
    public static boolean a(Context context) {
        boolean isHdr;
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        Display display = displayManager != null ? displayManager.getDisplay(0) : null;
        if (display != null) {
            isHdr = display.isHdr();
            if (isHdr) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}