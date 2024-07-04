package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* renamed from: xc  reason: default package */
public final class xc extends View {
    public int P;
    public int Q;
    public float R;
    public Context S;
    public Path T;
    public Paint U;
    public float V;
    public float W;
    public float a0;
    public String b0;

    public xc(Context context, float f, int i, int i2) {
        super(context, null, 0);
        Rect rect;
        this.S = context;
        this.R = f;
        this.P = i;
        this.Q = i2;
        Paint paint = new Paint();
        this.U = paint;
        paint.setAntiAlias(true);
        this.U.setStrokeWidth(1.0f);
        this.U.setTextAlign(Paint.Align.CENTER);
        this.U.setTextSize(this.R);
        this.U.getTextBounds("1000", 0, 4, new Rect());
        this.V = mh.d(this.S, 4.0f) + rect.width();
        float d = mh.d(this.S, 36.0f);
        if (this.V < d) {
            this.V = d;
        }
        this.a0 = rect.height();
        this.W = this.V * 1.2f;
        this.T = new Path();
        float f2 = this.V;
        this.T.arcTo(new RectF(0.0f, 0.0f, f2, f2), 135.0f, 270.0f);
        this.T.lineTo(this.V / 2.0f, this.W);
        this.T.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.U.setColor(this.Q);
        canvas.drawPath(this.T, this.U);
        this.U.setColor(this.P);
        canvas.drawText(this.b0, this.V / 2.0f, (this.a0 / 4.0f) + (this.W / 2.0f), this.U);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension((int) this.V, (int) this.W);
    }

    public void setProgress(String str) {
        this.b0 = str;
        invalidate();
    }
}