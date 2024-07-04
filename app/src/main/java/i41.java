package defpackage;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

/* renamed from: i41  reason: default package */
public final class i41 {
    public static final ThreadLocal<Matrix> a = new ThreadLocal<>();
    public static final ThreadLocal<RectF> b = new ThreadLocal<>();

    public static void a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            a(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}