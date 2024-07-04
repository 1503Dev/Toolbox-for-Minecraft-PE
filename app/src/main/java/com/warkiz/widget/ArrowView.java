package com.warkiz.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class ArrowView extends View {
    public final int P;
    public final int Q;
    public final Path R;
    public final Paint S;

    public ArrowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        int d = mh.d(context, 12.0f);
        this.P = d;
        int d2 = mh.d(context, 7.0f);
        this.Q = d2;
        Path path = new Path();
        this.R = path;
        path.moveTo(0.0f, 0.0f);
        float f = d;
        path.lineTo(f, 0.0f);
        path.lineTo(f / 2.0f, d2);
        path.close();
        Paint paint = new Paint();
        this.S = paint;
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.R, this.S);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(this.P, this.Q);
    }

    public void setColor(int i) {
        this.S.setColor(i);
        invalidate();
    }
}