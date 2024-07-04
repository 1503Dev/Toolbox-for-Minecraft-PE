package defpackage;

import android.content.Context;
import android.view.View;
import android.view.WindowInsets;
import java.io.File;

/* renamed from: dg */
public final /* synthetic */ class dg {
    public static /* bridge */ /* synthetic */ int a(WindowInsets windowInsets) {
        return windowInsets.getStableInsetLeft();
    }

    public static /* bridge */ /* synthetic */ File b(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static /* bridge */ /* synthetic */ void c(View view, float f, float f2) {
        view.drawableHotspotChanged(f, f2);
    }
}