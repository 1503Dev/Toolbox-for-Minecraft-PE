package defpackage;

import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.transition.Transition;
import java.util.List;

/* renamed from: fm  reason: default package */
public final /* synthetic */ class fm {
    public static /* bridge */ /* synthetic */ ColorFilter a(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static /* bridge */ /* synthetic */ List b(Transition transition) {
        return transition.getTargetTypes();
    }

    public static /* bridge */ /* synthetic */ boolean c(Path path) {
        return path.isConvex();
    }

    public static /* bridge */ /* synthetic */ boolean d(TextPaint textPaint) {
        return textPaint.isElegantTextHeight();
    }
}