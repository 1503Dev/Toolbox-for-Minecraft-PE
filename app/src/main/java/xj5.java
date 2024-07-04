package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: xj5  reason: default package */
public final class xj5 {
    public final int a;
    public final ViewGroup.LayoutParams b;
    public final ViewGroup c;
    public final Context d;

    public xj5(y03 y03Var) {
        this.b = y03Var.getLayoutParams();
        ViewParent parent = y03Var.getParent();
        this.d = y03Var.s0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new vi4("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.c = viewGroup;
        this.a = viewGroup.indexOfChild(y03Var.x());
        viewGroup.removeView(y03Var.x());
        y03Var.w0(true);
    }
}