package io.mrarm.mctoolbox.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public class a extends View {
    public RectF P;
    public float Q;
    public float R;
    public Paint S;
    public Paint T;
    public float U;
    public float V;
    public boolean W;
    public boolean a0;
    public float b0;
    public float c0;
    public long d0;
    public float e0;
    public float f0;
    public ArrayList g0;

    /* renamed from: io.mrarm.mctoolbox.ui.view.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0040a {
        void a(float f);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.P = new RectF();
        this.Q = 0.0f;
        this.g0 = new ArrayList();
        Paint paint = new Paint();
        this.S = paint;
        paint.setColor(-1);
        this.S.setStyle(Paint.Style.STROKE);
        this.S.setStrokeWidth(TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics()));
        this.T = new Paint();
        this.U = TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics());
        this.f0 = TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.R = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        this.V = TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
    }

    public void a(Canvas canvas) {
    }

    public int getHandleFillColor() {
        return -1;
    }

    public float getHandleY() {
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        return (((this.Q - getMinValue()) * height) / (getMaxValue() - getMinValue())) + getPaddingTop();
    }

    public float getMaxValue() {
        return 1.0f;
    }

    public float getMinValue() {
        return 0.0f;
    }

    public float getValue() {
        return this.Q;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a(canvas);
        float handleY = getHandleY();
        this.P.set(getPaddingLeft(), handleY - (this.U / 2.0f), getWidth() - getPaddingRight(), (this.U / 2.0f) + handleY);
        this.T.setColor(getHandleFillColor());
        RectF rectF = this.P;
        float f = this.V;
        canvas.drawRoundRect(rectF, f, f, this.T);
        RectF rectF2 = this.P;
        float f2 = this.V;
        canvas.drawRoundRect(rectF2, f2, f2, this.S);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            getHandleY();
            this.b0 = motionEvent.getX();
            this.c0 = motionEvent.getY();
            this.d0 = System.nanoTime();
            this.e0 = this.c0;
            this.W = true;
            this.a0 = true;
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((motionEvent.getAction() == 1 || motionEvent.getAction() == 2) && (Math.abs(motionEvent.getX() - this.b0) >= this.f0 || Math.abs(motionEvent.getY() - this.c0) >= this.f0)) {
            this.a0 = false;
        }
        if (motionEvent.getAction() == 1 && this.a0 && System.nanoTime() - this.d0 < 100000000) {
            setValue(((getMaxValue() - getMinValue()) * ((motionEvent.getY() - getPaddingTop()) / ((getHeight() - getPaddingTop()) - getPaddingBottom()))) + getMinValue());
        } else if (this.W && (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1)) {
            setValue(((getMaxValue() - getMinValue()) * ((motionEvent.getY() - this.e0) / ((getHeight() - getPaddingTop()) - getPaddingBottom()))) + this.Q);
            this.e0 = motionEvent.getY();
        }
        if (motionEvent.getAction() == 3 || motionEvent.getAction() == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            this.W = false;
        }
        return motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || super.onTouchEvent(motionEvent);
    }

    public void setValue(float f) {
        this.Q = Math.min(Math.max(f, Math.min(getMinValue(), getMaxValue())), Math.max(getMinValue(), getMaxValue()));
        invalidate();
        Iterator it = this.g0.iterator();
        while (it.hasNext()) {
            ((InterfaceC0040a) it.next()).a(this.Q);
        }
    }
}