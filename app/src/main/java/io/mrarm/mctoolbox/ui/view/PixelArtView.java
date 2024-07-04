package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

public class PixelArtView extends View {
    public final Paint P;
    public Bitmap Q;
    public final Rect R;
    public final Rect S;

    public PixelArtView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint();
        this.P = paint;
        this.R = new Rect();
        this.S = new Rect();
        setWillNotDraw(false);
        paint.setAntiAlias(false);
        paint.setFilterBitmap(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.Q;
        if (bitmap != null) {
            this.R.set(0, 0, bitmap.getWidth(), this.Q.getHeight());
            this.S.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
            canvas.drawBitmap(this.Q, this.R, this.S, this.P);
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.Q = bitmap;
    }
}