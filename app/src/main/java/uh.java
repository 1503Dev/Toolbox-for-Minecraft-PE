package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* renamed from: uh  reason: default package */
public final class uh extends o40 {
    public final Paint l0;
    public final RectF m0;
    public int n0;

    public uh() {
        this(null);
    }

    public uh(kr0 kr0Var) {
        super(kr0Var == null ? new kr0() : kr0Var);
        Paint paint = new Paint(1);
        this.l0 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.m0 = new RectF();
    }

    @Override // defpackage.o40, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int saveLayer;
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                saveLayer = th.a(canvas, canvas.getWidth(), canvas.getHeight());
            } else {
                saveLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null, 31);
            }
            this.n0 = saveLayer;
        }
        super.draw(canvas);
        canvas.drawRect(this.m0, this.l0);
        if (!(getCallback() instanceof View)) {
            canvas.restoreToCount(this.n0);
        }
    }

    public final void m(float f, float f2, float f3, float f4) {
        RectF rectF = this.m0;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }
}