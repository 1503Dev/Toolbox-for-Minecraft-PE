package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;

public class ColorHuePicker extends a {
    public Bitmap h0;
    public Paint i0;
    public float[] j0;
    public Rect k0;
    public RectF l0;

    public ColorHuePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j0 = new float[3];
        this.k0 = new Rect();
        this.l0 = new RectF();
        this.i0 = new Paint();
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public final void a(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        Bitmap bitmap = this.h0;
        if (bitmap == null || bitmap.getHeight() != height) {
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            this.h0 = Bitmap.createBitmap(1, height2, Bitmap.Config.ARGB_8888);
            float[] fArr = this.j0;
            fArr[1] = 1.0f;
            fArr[2] = 1.0f;
            for (int i = 0; i < height2; i++) {
                float[] fArr2 = this.j0;
                fArr2[0] = (i / (height2 - 1)) * 360.0f;
                this.h0.setPixel(0, i, Color.HSVToColor(fArr2));
            }
            Paint paint = this.i0;
            Bitmap bitmap2 = this.h0;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            this.k0.set(0, 0, 1, height2);
        }
        canvas.translate(getPaddingLeft(), getPaddingTop());
        this.l0.set(0.0f, 0.0f, width, height);
        RectF rectF = this.l0;
        float f = this.R;
        canvas.drawRoundRect(rectF, f, f, this.i0);
        canvas.translate(-getPaddingLeft(), -getPaddingTop());
    }

    public int getColorValue() {
        this.j0[0] = getValue();
        float[] fArr = this.j0;
        fArr[1] = 1.0f;
        fArr[2] = 1.0f;
        return Color.HSVToColor(fArr);
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public int getHandleFillColor() {
        return getColorValue();
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public float getMaxValue() {
        return 360.0f;
    }
}