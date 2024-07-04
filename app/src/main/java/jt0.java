package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.o;

/* renamed from: jt0  reason: default package */
public final class jt0 extends o {
    public jt0(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.o
    public final float f(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}