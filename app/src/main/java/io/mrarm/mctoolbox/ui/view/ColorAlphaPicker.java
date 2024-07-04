package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;

public class ColorAlphaPicker extends a {
    public Bitmap h0;
    public Paint i0;
    public RectF j0;
    public float k0;
    public Paint l0;
    public int m0;

    public ColorAlphaPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j0 = new RectF();
        this.i0 = new Paint();
        float applyDimension = TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        this.k0 = applyDimension;
        int i = (int) (applyDimension * 2.0f);
        this.h0 = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.h0);
        Paint paint = new Paint();
        paint.setColor(-1118482);
        float f = this.k0;
        canvas.drawRect(0.0f, 0.0f, f, f, paint);
        float f2 = this.k0;
        float f3 = f2 * 2.0f;
        canvas.drawRect(f2, f2, f3, f3, paint);
        paint.setColor(-9079435);
        float f4 = this.k0;
        canvas.drawRect(f4, 0.0f, f4 * 2.0f, f4, paint);
        float f5 = this.k0;
        canvas.drawRect(0.0f, f5, f5, f5 * 2.0f, paint);
        Paint paint2 = this.i0;
        Bitmap bitmap = this.h0;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        paint2.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        Paint paint3 = new Paint();
        this.l0 = paint3;
        paint3.setDither(true);
        setColor(-1);
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public final void a(Canvas canvas) {
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        this.j0.set(0.0f, 0.0f, width, height);
        RectF rectF = this.j0;
        float f = this.R;
        canvas.drawRoundRect(rectF, f, f, this.i0);
        this.l0.setColor(-65536);
        RectF rectF2 = this.j0;
        float f2 = this.R;
        canvas.drawRoundRect(rectF2, f2, f2, this.l0);
        canvas.restore();
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public int getHandleFillColor() {
        return this.m0;
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public float getMaxValue() {
        return 0.0f;
    }

    @Override // io.mrarm.mctoolbox.ui.view.a
    public float getMinValue() {
        return 1.0f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.l0.setShader(new LinearGradient(0.0f, getPaddingTop(), 0.0f, i2 - getPaddingRight(), -1, 16777215, Shader.TileMode.CLAMP));
    }

    public void setColor(int i) {
        int i2 = i | (-16777216);
        this.m0 = i2;
        this.l0.setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.MULTIPLY));
        invalidate();
    }
}