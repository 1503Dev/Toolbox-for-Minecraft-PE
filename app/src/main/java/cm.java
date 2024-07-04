package defpackage;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: cm  reason: default package */
public final class cm extends Property<Drawable, Integer> {
    public static final cm a = new cm();

    public cm() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    public final Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}