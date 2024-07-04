package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: x5  reason: default package */
public final class x5 extends RatingBar {
    public final v5 P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        int i = ih0.ratingBarStyle;
        v5 v5Var = new v5(this);
        this.P = v5Var;
        v5Var.a(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.P.b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}