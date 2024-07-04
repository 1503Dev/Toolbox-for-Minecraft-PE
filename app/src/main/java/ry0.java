package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* renamed from: ry0  reason: default package */
public final class ry0 extends View {
    public static final Paint a0 = new Paint();
    public static final Paint b0 = new Paint();
    public static final Paint c0 = new Paint();
    public static final Paint d0 = new Paint();
    public Path P;
    public final RectF Q;
    public int R;
    public float S;
    public float T;
    public float U;
    public float[] V;
    public int[] W;

    public ry0(Context context) {
        super(context, null, 0);
        this.P = new Path();
        this.Q = new RectF();
        this.R = 8;
        this.V = new float[3];
        this.W = new int[]{-7829368, -1, -8947849};
        setWillNotDraw(false);
        this.S = context.getResources().getDimensionPixelSize(2131165355);
        this.T = context.getResources().getDimension(2131165356);
        this.U = context.getResources().getDimension(2131165357);
        Paint paint = a0;
        paint.setAntiAlias(false);
        paint.setDither(false);
        paint.setFilterBitmap(false);
        paint.setColor(-16777216);
        Paint paint2 = b0;
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        c0.setColor(822083583);
        d0.setAntiAlias(true);
        invalidate();
    }

    private float getMapScale() {
        return ((getWidth() - getPaddingStart()) - getPaddingEnd()) / ((this.R * 2) * 16);
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        this.P.reset();
        this.Q.set(getPaddingStart(), getPaddingTop(), getWidth() - getPaddingEnd(), getHeight() - getPaddingBottom());
        this.P.addOval(this.Q, Path.Direction.CCW);
        float width = ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2.0f;
        Paint paint = b0;
        paint.setStrokeWidth(this.S);
        float[] fArr = this.V;
        float f = this.S;
        fArr[0] = 1.0f - (f / ((f / 2.0f) + width));
        fArr[1] = 1.0f - ((f / 2.0f) / ((f / 2.0f) + width));
        fArr[2] = 1.0f - ((f / 6.0f) / ((f / 2.0f) + width));
        paint.setShader(new RadialGradient(getWidth() / 2, getHeight() / 2, (this.S / 2.0f) + width, this.W, this.V, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.P);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), a0);
        canvas.save();
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.translate(width, height);
        float mapScale = getMapScale();
        canvas.scale(mapScale, mapScale);
        synchronized (j60.class) {
            float e = j60.e();
            float f = j60.f();
            float d = j60.d();
            float[] c = j60.c();
            int floor = ((int) Math.floor(e)) >> 4;
            int floor2 = ((int) Math.floor(f)) >> 4;
            canvas.rotate(d);
            canvas.save();
            canvas.translate(-(e - (floor * 16)), -(f - (floor2 * 16)));
            int i2 = -this.R;
            while (true) {
                int i3 = this.R;
                if (i2 > i3) {
                    break;
                }
                for (int i4 = -i3; i4 <= this.R; i4++) {
                    Bitmap g = j60.g(floor + i2, floor2 + i4);
                    if (g != null) {
                        canvas.drawBitmap(g, i2 * 16.0f, i4 * 16.0f, a0);
                    }
                }
                i2++;
            }
            canvas.restore();
            d0.setColor(-256);
            if (c != null) {
                i = c.length / 2;
            } else {
                i = 0;
            }
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i5 * 2;
                canvas.drawCircle(c[i6] - e, c[i6 + 1] - f, this.U, d0);
            }
        }
        canvas.restore();
        Paint paint = c0;
        canvas.drawRect(0.0f, height - (this.T / 2.0f), getWidth(), (this.T / 2.0f) + height, paint);
        float f2 = this.T / 2.0f;
        canvas.drawRect(width - f2, 0.0f, f2 + width, getHeight(), paint);
        canvas.restore();
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, ((getWidth() - getPaddingStart()) - getPaddingEnd()) / 2.0f, b0);
        post(new nk0(2, this));
    }

    public void setRadius(int i) {
        this.R = i;
    }
}