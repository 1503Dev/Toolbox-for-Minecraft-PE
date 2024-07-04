package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.WindowInsets;

/* renamed from: gk */
public final /* synthetic */ class gk {
    public static /* bridge */ /* synthetic */ Handler a(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static /* bridge */ /* synthetic */ WindowInsets b(WindowInsets windowInsets) {
        return windowInsets.consumeDisplayCutout();
    }
}