package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import com.google.android.material.datepicker.b;

/* renamed from: l40  reason: default package */
public final class l40<S> extends il {
    public static boolean J(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y30.b(gh0.materialCalendarStyle, context, b.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}