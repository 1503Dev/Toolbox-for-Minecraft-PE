package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

/* renamed from: sa0  reason: default package */
public final class sa0 {
    public static <T> ObjectAnimator a(T t, Property<T, PointF> property, Path path) {
        ObjectAnimator ofObject;
        if (Build.VERSION.SDK_INT >= 21) {
            ofObject = ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
            return ofObject;
        }
        return ObjectAnimator.ofFloat(t, new ee0(property, path), 0.0f, 1.0f);
    }
}