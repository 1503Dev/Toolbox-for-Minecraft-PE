package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* renamed from: h01  reason: default package */
public final class h01 {
    public final Context a;
    public final View b;
    public final TextView c;
    public final WindowManager.LayoutParams d;
    public final Rect e;
    public final int[] f;
    public final int[] g;

    public h01(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.d = layoutParams;
        this.e = new Rect();
        this.f = new int[2];
        this.g = new int[2];
        this.a = context;
        View inflate = LayoutInflater.from(context).inflate(ni0.abc_tooltip, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(hi0.message);
        layoutParams.setTitle(h01.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = bj0.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }
}