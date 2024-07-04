package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* renamed from: gx0  reason: default package */
public final class gx0 extends ml0 {
    public final WeakReference<Context> b;

    public gx0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // defpackage.ml0, android.content.res.Resources
    public final Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = this.b.get();
        if (drawable != null && context != null) {
            gl0.d().j(context, i, drawable);
        }
        return drawable;
    }
}