package defpackage;

import android.graphics.drawable.Drawable;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: tm */
public final /* synthetic */ class tm {
    public static /* bridge */ /* synthetic */ boolean a(Drawable drawable, int i) {
        return drawable.setLayoutDirection(i);
    }

    public static /* bridge */ /* synthetic */ boolean b(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }
}