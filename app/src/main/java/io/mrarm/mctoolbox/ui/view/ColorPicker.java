package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class ColorPicker extends View {
    public float P;
    public float Q;
    public float R;
    public Paint S;
    public RectF T;
    public Paint U;
    public Paint V;
    public float W;
    public Paint a0;
    public Paint b0;
    public float c0;
    public boolean d0;
    public float[] e0;
    public ColorHuePicker f0;
    public ArrayList g0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        void a(int i);
    }

    public ColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.P = 0.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.T = new RectF();
        this.d0 = false;
        this.e0 = new float[3];
        this.g0 = new ArrayList();
        this.S = new Paint();
        Paint paint = new Paint();
        this.U = paint;
        paint.setDither(true);
        Paint paint2 = new Paint();
        this.V = paint2;
        paint2.setDither(true);
        Paint paint3 = new Paint();
        this.a0 = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.a0.setStrokeWidth(TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics()));
        this.b0 = new Paint();
        this.c0 = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.W = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
    }

    private float getHandleX() {
        return (((getWidth() - getPaddingLeft()) - getPaddingRight()) * this.Q) + getPaddingLeft();
    }

    private float getHandleY() {
        return ((1.0f - this.R) * ((getHeight() - getPaddingTop()) - getPaddingBottom())) + getPaddingTop();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Paint paint;
        int i;
        super.draw(canvas);
        float[] fArr = this.e0;
        fArr[0] = this.P;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        this.S.setColor(Color.HSVToColor(fArr));
        this.T.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        RectF rectF = this.T;
        float f = this.W;
        canvas.drawRoundRect(rectF, f, f, this.S);
        RectF rectF2 = this.T;
        float f2 = this.W;
        canvas.drawRoundRect(rectF2, f2, f2, this.U);
        RectF rectF3 = this.T;
        float f3 = this.W;
        canvas.drawRoundRect(rectF3, f3, f3, this.V);
        int color = getColor();
        this.b0.setColor(color);
        if (Color.red(color) <= 140 || Color.green(color) <= 140 || Color.blue(color) <= 140) {
            paint = this.a0;
            i = -1;
        } else {
            paint = this.a0;
            i = -16777216;
        }
        paint.setColor(i);
        float handleX = getHandleX();
        float handleY = getHandleY();
        canvas.drawCircle(handleX, handleY, this.c0, this.b0);
        canvas.drawCircle(handleX, handleY, this.c0, this.a0);
    }

    public int getColor() {
        float[] fArr = this.e0;
        fArr[0] = this.P;
        fArr[1] = this.Q;
        fArr[2] = this.R;
        return Color.HSVToColor(fArr);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.U.setShader(new LinearGradient(getPaddingLeft(), 0.0f, i - getPaddingRight(), 0.0f, -1, 16777215, Shader.TileMode.CLAMP));
        this.V.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i2 - getPaddingRight(), 0, -16777216, Shader.TileMode.CLAMP));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.d0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if (this.d0 && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1)) {
            this.Q = (motionEvent.getX() - getPaddingLeft()) / ((getWidth() - getPaddingLeft()) - getPaddingRight());
            this.R = 1.0f - ((motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom()));
            this.Q = Math.min(Math.max(this.Q, 0.0f), 1.0f);
            this.R = Math.min(Math.max(this.R, 0.0f), 1.0f);
            invalidate();
            int color = getColor();
            Iterator it = this.g0.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(color);
            }
        }
        return motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || super.onTouchEvent(motionEvent);
    }

    public void setColor(int i) {
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), this.e0);
        float[] fArr = this.e0;
        this.Q = fArr[1];
        this.R = fArr[2];
        ColorHuePicker colorHuePicker = this.f0;
        if (colorHuePicker != null) {
            colorHuePicker.setValue(fArr[0]);
        } else {
            setHue(fArr[0]);
        }
    }

    public void setHue(float f) {
        this.P = f;
        invalidate();
        int color = getColor();
        Iterator it = this.g0.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(color);
        }
    }
}