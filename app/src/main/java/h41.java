package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: h41  reason: default package */
public final class h41 {
    public static boolean a = true;

    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}