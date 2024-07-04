package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;

/* renamed from: k7  reason: default package */
public final class k7 extends FrameLayout {
    public final Paint P;
    public final RectF Q;
    public final Path R;
    public int S;
    public float T;
    public float U;
    public float V;
    public int W;

    public k7(ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper, null, 0);
        this.P = new Paint();
        this.Q = new RectF();
        Path path = new Path();
        this.R = path;
        this.S = 0;
        this.T = TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.U = TypedValue.applyDimension(1, 12.0f, getResources().getDisplayMetrics());
        this.V = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        setPadding(0, (int) this.U, 0, 0);
        setWillNotDraw(false);
        path.reset();
        path.moveTo((-this.T) / 2.0f, this.U);
        path.lineTo(this.T / 2.0f, this.U);
        path.lineTo(0.0f, 0.0f);
        path.close();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        this.P.setColor(this.W);
        canvas.save();
        float f = this.S;
        float f2 = this.T / 2.0f;
        float width = getWidth() - (this.T / 2.0f);
        if (f < f2) {
            f = f2;
        } else if (f > width) {
            f = width;
        }
        canvas.translate(f, 0.0f);
        canvas.drawPath(this.R, this.P);
        canvas.restore();
        this.Q.set(0.0f, this.U, getWidth(), getHeight());
        RectF rectF = this.Q;
        float f3 = this.V;
        canvas.drawRoundRect(rectF, f3, f3, this.P);
        super.draw(canvas);
    }

    public void setArrowOffset(int i) {
        this.S = i;
    }

    public void setColor(int i) {
        this.W = i;
    }
}