package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;

/* renamed from: ka  reason: default package */
public final class ka extends View {
    public static final float[] S = {0.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f};
    public Bitmap[] P;
    public Paint Q;
    public Matrix[] R;

    public ka(Context context) {
        super(context, null, 0);
        this.Q = new Paint();
        setWillNotDraw(false);
        this.Q.setFilterBitmap(false);
        invalidate();
    }

    public final void a() {
        Bitmap[] bitmapArr = this.P;
        if (bitmapArr != null) {
            if (bitmapArr[0] != null) {
                float[] fArr = new float[24];
                float[] fArr2 = new float[16];
                android.opengl.Matrix.orthoM(fArr2, 0, -2.0f, 2.0f, 3.82f, -0.18f, 0.1f, 100.0f);
                float[] fArr3 = new float[16];
                android.opengl.Matrix.setLookAtM(fArr3, 0, -2.0f, 2.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
                float[] fArr4 = new float[16];
                android.opengl.Matrix.setIdentityM(fArr4, 0);
                android.opengl.Matrix.translateM(fArr4, 0, 0.5f, 0.0f, 0.0f);
                float[] fArr5 = new float[16];
                android.opengl.Matrix.multiplyMM(fArr5, 0, fArr4, 0, fArr2, 0);
                android.opengl.Matrix.multiplyMM(fArr4, 0, fArr5, 0, fArr3, 0);
                float[] fArr6 = new float[16];
                int i = 0;
                while (true) {
                    float[][] fArr7 = ja.P;
                    if (i >= 3) {
                        break;
                    }
                    float[] fArr8 = fArr7[i];
                    for (int i2 = 0; i2 < 4; i2++) {
                        int i3 = i2 * 4;
                        android.opengl.Matrix.multiplyMV(fArr6, i3, fArr4, 0, fArr8, i3);
                        int i4 = (i2 * 2) + (i * 8);
                        fArr[i4] = fArr6[i3];
                        fArr[i4 + 1] = fArr6[i3 + 1];
                    }
                    i++;
                }
                this.R = new Matrix[3];
                Bitmap bitmap = this.P[0];
                for (int i5 = 0; i5 < 3; i5++) {
                    this.R[i5] = new Matrix();
                    this.R[i5].setPolyToPoly(S, 0, fArr, i5 * 8, 4);
                    this.R[i5].preScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
                    this.R[i5].postScale(getWidth(), getHeight());
                }
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.P == null || this.R == null) {
            return;
        }
        int i = 0;
        while (true) {
            Matrix[] matrixArr = this.R;
            if (i >= matrixArr.length) {
                return;
            }
            Bitmap bitmap = this.P[i];
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, matrixArr[i], this.Q);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        a();
        invalidate();
    }

    public void setBitmap(Bitmap bitmap) {
        setBitmaps(new Bitmap[]{bitmap, bitmap, bitmap});
    }

    public void setBitmaps(Bitmap[] bitmapArr) {
        if (bitmapArr == this.P) {
            return;
        }
        this.P = bitmapArr;
        a();
        invalidate();
    }
}