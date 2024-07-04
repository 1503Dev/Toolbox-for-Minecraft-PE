package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@TargetApi(28)
/* renamed from: az5  reason: default package */
public class az5 extends ax5 {
    public static final WindowInsets l(Activity activity, View view, WindowInsets windowInsets) {
        String str;
        nl5 b;
        jv5 jv5Var = jv5.A;
        nl5 b2 = jv5Var.g.b();
        b2.B();
        synchronized (b2.a) {
            str = b2.y;
        }
        if (str == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String str2 = "";
            if (displayCutout != null) {
                b = jv5Var.g.b();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str2)) {
                        str2 = str2.concat("|");
                    }
                    str2 = str2.concat(String.valueOf(format));
                }
            } else {
                b = jv5Var.g.b();
            }
            b.x(str2);
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (2 != attributes.layoutInDisplayCutoutMode) {
            attributes.layoutInDisplayCutoutMode = 2;
            window.setAttributes(attributes);
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    @Override // defpackage.ck1
    public final int i(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // defpackage.ck1
    public final void j(final Activity activity) {
        String str;
        boolean isInMultiWindowMode;
        if (((Boolean) w82.d.c.a(x92.R0)).booleanValue()) {
            nl5 b = jv5.A.g.b();
            b.B();
            synchronized (b.a) {
                str = b.y;
            }
            if (str == null) {
                isInMultiWindowMode = activity.isInMultiWindowMode();
                if (!isInMultiWindowMode) {
                    Window window = activity.getWindow();
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (1 != attributes.layoutInDisplayCutoutMode) {
                        attributes.layoutInDisplayCutoutMode = 1;
                        window.setAttributes(attributes);
                    }
                    activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListener() { // from class: yx5
                        @Override // android.view.View$OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            return az5.l(activity, view, windowInsets);
                        }
                    });
                }
            }
        }
    }
}