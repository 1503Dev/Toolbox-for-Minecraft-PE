package com.warkiz.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class IndicatorSeekBar extends View {
    public int A0;
    public Typeface B0;
    public int C0;
    public int D0;
    public int E0;
    public CharSequence[] F0;
    public gx G0;
    public int H0;
    public int I0;
    public boolean J0;
    public int K0;
    public View L0;
    public View M0;
    public int N0;
    public ix O0;
    public Context P;
    public float[] P0;
    public Paint Q;
    public int Q0;
    public TextPaint R;
    public int R0;
    public gc0 S;
    public int S0;
    public Rect T;
    public float T0;
    public float U;
    public Bitmap U0;
    public float V;
    public Bitmap V0;
    public float W;
    public Drawable W0;
    public int X0;
    public boolean Y0;
    public boolean Z0;
    public float a0;
    public int a1;
    public boolean b0;
    public boolean b1;
    public rq0 c0;
    public RectF c1;
    public int d0;
    public RectF d1;
    public int e0;
    public int e1;
    public int f0;
    public int f1;
    public int g0;
    public int g1;
    public float h0;
    public int h1;
    public float i0;
    public float i1;
    public boolean j0;
    public float j1;
    public float k0;
    public Bitmap k1;
    public float l0;
    public int l1;
    public float m0;
    public int m1;
    public boolean n0;
    public Drawable n1;
    public int o0;
    public Bitmap o1;
    public boolean p0;
    public int p1;
    public boolean q0;
    public boolean q1;
    public boolean r0;
    public float r1;
    public float[] s0;
    public int s1;
    public boolean t0;
    public boolean t1;
    public boolean u0;
    public int v0;
    public String[] w0;
    public float[] x0;
    public float[] y0;
    public float z0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IndicatorSeekBar.this.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IndicatorSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Typeface typeface;
        int resourceId;
        ViewGroup viewGroup;
        int resourceId2;
        float min;
        int min2;
        boolean z;
        this.W = -1.0f;
        this.a0 = -1.0f;
        this.o0 = 1;
        this.P = context;
        int parseColor = Color.parseColor("#FF4081");
        int parseColor2 = Color.parseColor("#FFFFFF");
        int parseColor3 = Color.parseColor("#D7D7D7");
        int parseColor4 = Color.parseColor("#FF4081");
        int parseColor5 = Color.parseColor("#FF4081");
        int parseColor6 = Color.parseColor("#FF4081");
        int parseColor7 = Color.parseColor("#FF4081");
        Typeface typeface2 = Typeface.DEFAULT;
        int parseColor8 = Color.parseColor("#FF4081");
        int t = mh.t(context, 14.0f);
        int d = mh.d(context, 2.0f);
        int d2 = mh.d(context, 2.0f);
        int d3 = mh.d(context, 10.0f);
        int t2 = mh.t(context, 13.0f);
        int d4 = mh.d(context, 14.0f);
        if (attributeSet == null) {
            this.k0 = 100.0f;
            this.l0 = 0.0f;
            this.m0 = 0.0f;
            this.n0 = false;
            this.Q0 = 0;
            this.r0 = false;
            this.t0 = false;
            this.p0 = true;
            this.b0 = false;
            this.q0 = false;
            this.N0 = 2;
            this.H0 = parseColor;
            this.I0 = parseColor2;
            this.K0 = t;
            this.L0 = null;
            this.M0 = null;
            this.e1 = d;
            this.g1 = parseColor3;
            this.f1 = d2;
            this.h1 = parseColor4;
            this.b1 = false;
            this.m1 = d4;
            this.n1 = null;
            this.s1 = parseColor5;
            m(null, parseColor6);
            this.q1 = false;
            this.X0 = 0;
            this.a1 = d3;
            this.W0 = null;
            this.Y0 = false;
            this.Z0 = false;
            o(null, parseColor8);
            this.u0 = false;
            this.A0 = t2;
            this.F0 = null;
            this.B0 = typeface2;
            p(null, parseColor7);
        } else {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, jj0.IndicatorSeekBar);
            this.k0 = obtainStyledAttributes.getFloat(jj0.IndicatorSeekBar_isb_max, 100.0f);
            this.l0 = obtainStyledAttributes.getFloat(jj0.IndicatorSeekBar_isb_min, 0.0f);
            this.m0 = obtainStyledAttributes.getFloat(jj0.IndicatorSeekBar_isb_progress, 0.0f);
            this.n0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_progress_value_float, false);
            this.p0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_user_seekable, true);
            this.b0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_clear_default_padding, false);
            this.q0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_only_thumb_draggable, false);
            this.r0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_seek_smoothly, false);
            this.t0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_r2l, false);
            this.e1 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_track_background_size, d);
            this.f1 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_track_progress_size, d2);
            this.g1 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_track_background_color, parseColor3);
            this.h1 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_track_progress_color, parseColor4);
            this.b1 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_track_rounded_corners, false);
            this.m1 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_thumb_size, d4);
            this.n1 = obtainStyledAttributes.getDrawable(jj0.IndicatorSeekBar_isb_thumb_drawable);
            this.t1 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_thumb_adjust_auto, true);
            m(obtainStyledAttributes.getColorStateList(jj0.IndicatorSeekBar_isb_thumb_color), parseColor6);
            this.q1 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_show_thumb_text, false);
            this.s1 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_thumb_text_color, parseColor5);
            this.Q0 = obtainStyledAttributes.getInt(jj0.IndicatorSeekBar_isb_ticks_count, 0);
            this.X0 = obtainStyledAttributes.getInt(jj0.IndicatorSeekBar_isb_show_tick_marks_type, 0);
            this.a1 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_tick_marks_size, d3);
            o(obtainStyledAttributes.getColorStateList(jj0.IndicatorSeekBar_isb_tick_marks_color), parseColor8);
            this.W0 = obtainStyledAttributes.getDrawable(jj0.IndicatorSeekBar_isb_tick_marks_drawable);
            this.Z0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_tick_marks_swept_hide, false);
            this.Y0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_tick_marks_ends_hide, false);
            this.u0 = obtainStyledAttributes.getBoolean(jj0.IndicatorSeekBar_isb_show_tick_texts, false);
            this.A0 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_tick_texts_size, t2);
            p(obtainStyledAttributes.getColorStateList(jj0.IndicatorSeekBar_isb_tick_texts_color), parseColor7);
            this.F0 = obtainStyledAttributes.getTextArray(jj0.IndicatorSeekBar_isb_tick_texts_array);
            int i = obtainStyledAttributes.getInt(jj0.IndicatorSeekBar_isb_tick_texts_typeface, -1);
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (typeface2 != null) {
                                typeface = typeface2;
                            }
                        } else {
                            typeface = Typeface.SERIF;
                        }
                    } else {
                        typeface = Typeface.SANS_SERIF;
                    }
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.B0 = typeface;
                this.N0 = obtainStyledAttributes.getInt(jj0.IndicatorSeekBar_isb_show_indicator, 2);
                this.H0 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_indicator_color, parseColor);
                this.K0 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_indicator_text_size, t);
                this.I0 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_indicator_text_color, parseColor2);
                resourceId = obtainStyledAttributes.getResourceId(jj0.IndicatorSeekBar_isb_indicator_content_layout, 0);
                if (resourceId <= 0) {
                    viewGroup = null;
                    this.L0 = View.inflate(this.P, resourceId, null);
                } else {
                    viewGroup = null;
                }
                resourceId2 = obtainStyledAttributes.getResourceId(jj0.IndicatorSeekBar_isb_indicator_top_content_layout, 0);
                if (resourceId2 > 0) {
                    this.M0 = View.inflate(this.P, resourceId2, viewGroup);
                }
                obtainStyledAttributes.recycle();
            }
            typeface = Typeface.DEFAULT;
            this.B0 = typeface;
            this.N0 = obtainStyledAttributes.getInt(jj0.IndicatorSeekBar_isb_show_indicator, 2);
            this.H0 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_indicator_color, parseColor);
            this.K0 = obtainStyledAttributes.getDimensionPixelSize(jj0.IndicatorSeekBar_isb_indicator_text_size, t);
            this.I0 = obtainStyledAttributes.getColor(jj0.IndicatorSeekBar_isb_indicator_text_color, parseColor2);
            resourceId = obtainStyledAttributes.getResourceId(jj0.IndicatorSeekBar_isb_indicator_content_layout, 0);
            if (resourceId <= 0) {
            }
            resourceId2 = obtainStyledAttributes.getResourceId(jj0.IndicatorSeekBar_isb_indicator_top_content_layout, 0);
            if (resourceId2 > 0) {
            }
            obtainStyledAttributes.recycle();
        }
        i();
        int i2 = this.e1;
        int i3 = this.f1;
        if (i2 > i3) {
            this.e1 = i3;
        }
        if (this.n1 == null) {
            float f = this.m1 / 2.0f;
            this.i1 = f;
            min = f * 1.2f;
        } else {
            min = Math.min(mh.d(this.P, 30.0f), this.m1) / 2.0f;
            this.i1 = min;
        }
        this.j1 = min;
        if (this.W0 == null) {
            min2 = this.a1;
        } else {
            min2 = Math.min(mh.d(this.P, 30.0f), this.a1);
        }
        float f2 = min2 / 2.0f;
        this.T0 = f2;
        this.U = Math.max(this.j1, f2) * 2.0f;
        if (this.Q == null) {
            this.Q = new Paint();
        }
        if (this.b1) {
            this.Q.setStrokeCap(Paint.Cap.ROUND);
        }
        this.Q.setAntiAlias(true);
        int i4 = this.e1;
        if (i4 > this.f1) {
            this.f1 = i4;
        }
        if (!this.q1 && (this.Q0 == 0 || !this.u0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (this.R == null) {
                TextPaint textPaint = new TextPaint();
                this.R = textPaint;
                textPaint.setAntiAlias(true);
                this.R.setTextAlign(Paint.Align.CENTER);
                this.R.setTextSize(this.A0);
            }
            if (this.T == null) {
                this.T = new Rect();
            }
            this.R.setTypeface(this.B0);
            this.R.getTextBounds("j", 0, 1, this.T);
            this.v0 = mh.d(this.P, 3.0f) + this.T.height();
        }
        this.V = this.m0;
        b();
        this.c1 = new RectF();
        this.d1 = new RectF();
        if (!this.b0) {
            int d5 = mh.d(this.P, 16.0f);
            if (getPaddingLeft() == 0) {
                setPadding(d5, getPaddingTop(), getPaddingRight(), getPaddingBottom());
            }
            if (getPaddingRight() == 0) {
                setPadding(getPaddingLeft(), getPaddingTop(), d5, getPaddingBottom());
            }
        }
        int i5 = this.N0;
        if (i5 != 0 && this.G0 == null) {
            gx gxVar = new gx(this.P, this, this.H0, i5, this.K0, this.I0, this.L0, this.M0);
            this.G0 = gxVar;
            this.L0 = gxVar.m;
        }
    }

    private float getAmplitude() {
        float f = this.k0;
        float f2 = this.l0;
        if (f - f2 > 0.0f) {
            return f - f2;
        }
        return 1.0f;
    }

    private int getClosestIndex() {
        float abs = Math.abs(this.k0 - this.l0);
        int i = 0;
        int i2 = 0;
        while (true) {
            float[] fArr = this.s0;
            if (i >= fArr.length) {
                return i2;
            }
            float abs2 = Math.abs(fArr[i] - this.m0);
            if (abs2 <= abs) {
                i2 = i;
                abs = abs2;
            }
            i++;
        }
    }

    private int getLeftSideTickColor() {
        return this.t0 ? this.R0 : this.S0;
    }

    private int getLeftSideTickTextsColor() {
        return this.t0 ? this.D0 : this.C0;
    }

    private int getLeftSideTrackSize() {
        return this.t0 ? this.e1 : this.f1;
    }

    private int getRightSideTickColor() {
        return this.t0 ? this.S0 : this.R0;
    }

    private int getRightSideTickTextsColor() {
        return this.t0 ? this.C0 : this.D0;
    }

    private int getRightSideTrackSize() {
        return this.t0 ? this.f1 : this.e1;
    }

    private float getThumbCenterX() {
        return (this.t0 ? this.d1 : this.c1).right;
    }

    private int getThumbPosOnTick() {
        if (this.Q0 != 0) {
            return Math.round((getThumbCenterX() - this.d0) / this.i0);
        }
        return 0;
    }

    private float getThumbPosOnTickFloat() {
        if (this.Q0 != 0) {
            return (getThumbCenterX() - this.d0) / this.i0;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSeekListener(boolean z) {
        String[] strArr;
        if (this.S == null) {
            return;
        }
        boolean z2 = true;
        if (!this.n0 ? Math.round(this.V) == Math.round(this.m0) : this.V == this.m0) {
            z2 = false;
        }
        if (z2) {
            gc0 gc0Var = this.S;
            if (this.c0 == null) {
                this.c0 = new rq0();
            }
            this.c0.a = getProgress();
            this.c0.b = getProgressFloat();
            this.c0.getClass();
            if (this.Q0 > 2) {
                int thumbPosOnTick = getThumbPosOnTick();
                if (this.u0 && (strArr = this.w0) != null) {
                    rq0 rq0Var = this.c0;
                    String str = strArr[thumbPosOnTick];
                    rq0Var.getClass();
                }
                this.c0.getClass();
            }
            gc0Var.a(this.c0);
        }
    }

    public final void b() {
        int i;
        int i2 = this.Q0;
        if (i2 >= 0 && i2 <= 50) {
            if (i2 != 0) {
                this.P0 = new float[i2];
                if (this.u0) {
                    this.y0 = new float[i2];
                    this.x0 = new float[i2];
                }
                this.s0 = new float[i2];
                int i3 = 0;
                while (true) {
                    float[] fArr = this.s0;
                    if (i3 < fArr.length) {
                        float f = this.l0;
                        float f2 = (this.k0 - f) * i3;
                        int i4 = this.Q0;
                        if (i4 - 1 > 0) {
                            i = i4 - 1;
                        } else {
                            i = 1;
                        }
                        fArr[i3] = (f2 / i) + f;
                        i3++;
                    } else {
                        return;
                    }
                }
            }
        } else {
            StringBuilder b = e5.b("the Argument: TICK COUNT must be limited between (0-50), Now is ");
            b.append(this.Q0);
            throw new IllegalArgumentException(b.toString());
        }
    }

    public final void c(Canvas canvas) {
        Paint paint;
        int i;
        Bitmap bitmap;
        float width;
        float f;
        Bitmap bitmap2;
        float thumbCenterX = getThumbCenterX();
        if (this.n1 == null) {
            if (this.j0) {
                paint = this.Q;
                i = this.p1;
            } else {
                paint = this.Q;
                i = this.l1;
            }
            paint.setColor(i);
            canvas.drawCircle(thumbCenterX, this.c1.top, this.j0 ? this.j1 : this.i1, this.Q);
            return;
        }
        if (this.k1 == null || this.o1 == null) {
            l();
        }
        if (this.k1 == null || this.o1 == null) {
            throw new IllegalArgumentException("the format of the selector thumb drawable is wrong!");
        }
        this.Q.setAlpha(255);
        if (this.j0) {
            bitmap = this.o1;
            width = thumbCenterX - (bitmap.getWidth() / 2.0f);
            f = this.c1.top;
            bitmap2 = this.o1;
        } else {
            bitmap = this.k1;
            width = thumbCenterX - (bitmap.getWidth() / 2.0f);
            f = this.c1.top;
            bitmap2 = this.k1;
        }
        canvas.drawBitmap(bitmap, width, f - (bitmap2.getHeight() / 2.0f), this.Q);
    }

    public final void d(Canvas canvas) {
        Paint paint;
        int rightSideTickColor;
        float f;
        float f2;
        float f3;
        float f4;
        Bitmap bitmap;
        if (this.Q0 != 0) {
            if (this.X0 == 0 && this.W0 == null) {
                return;
            }
            float thumbCenterX = getThumbCenterX();
            for (int i = 0; i < this.P0.length; i++) {
                float thumbPosOnTickFloat = getThumbPosOnTickFloat();
                if ((!this.Z0 || thumbCenterX < this.P0[i]) && ((!this.Y0 || (i != 0 && i != this.P0.length - 1)) && (i != getThumbPosOnTick() || this.Q0 <= 2 || this.r0))) {
                    float f5 = i;
                    if (f5 <= thumbPosOnTickFloat) {
                        paint = this.Q;
                        rightSideTickColor = getLeftSideTickColor();
                    } else {
                        paint = this.Q;
                        rightSideTickColor = getRightSideTickColor();
                    }
                    paint.setColor(rightSideTickColor);
                    if (this.W0 != null) {
                        if (this.V0 == null || this.U0 == null) {
                            n();
                        }
                        Bitmap bitmap2 = this.V0;
                        if (bitmap2 == null || (bitmap = this.U0) == null) {
                            throw new IllegalArgumentException("the format of the selector TickMarks drawable is wrong!");
                        }
                        if (f5 <= thumbPosOnTickFloat) {
                            canvas.drawBitmap(bitmap2, this.P0[i] - (bitmap.getWidth() / 2.0f), this.c1.top - (this.U0.getHeight() / 2.0f), this.Q);
                        } else {
                            canvas.drawBitmap(bitmap, this.P0[i] - (bitmap.getWidth() / 2.0f), this.c1.top - (this.U0.getHeight() / 2.0f), this.Q);
                        }
                    } else {
                        int i2 = this.X0;
                        if (i2 == 1) {
                            canvas.drawCircle(this.P0[i], this.c1.top, this.T0, this.Q);
                        } else {
                            if (i2 == 3) {
                                int d = mh.d(this.P, 1.0f);
                                int leftSideTrackSize = thumbCenterX >= this.P0[i] ? getLeftSideTrackSize() : getRightSideTrackSize();
                                float f6 = this.P0[i];
                                float f7 = d;
                                f = f6 - f7;
                                float f8 = this.c1.top;
                                float f9 = leftSideTrackSize / 2.0f;
                                f2 = f8 - f9;
                                f3 = f6 + f7;
                                f4 = f8 + f9;
                            } else if (i2 == 2) {
                                float f10 = this.P0[i];
                                int i3 = this.a1;
                                f = f10 - (i3 / 2.0f);
                                float f11 = this.c1.top;
                                f2 = f11 - (i3 / 2.0f);
                                f3 = (i3 / 2.0f) + f10;
                                f4 = (i3 / 2.0f) + f11;
                            }
                            canvas.drawRect(f, f2, f3, f4, this.Q);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ViewParent parent = getParent();
        if (parent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            parent.requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(Canvas canvas) {
        TextPaint textPaint;
        int rightSideTickTextsColor;
        if (this.w0 == null) {
            return;
        }
        float thumbPosOnTickFloat = getThumbPosOnTickFloat();
        for (int i = 0; i < this.w0.length; i++) {
            if (i == getThumbPosOnTick() && i == thumbPosOnTickFloat) {
                textPaint = this.R;
                rightSideTickTextsColor = this.E0;
            } else if (i < thumbPosOnTickFloat) {
                textPaint = this.R;
                rightSideTickTextsColor = getLeftSideTickTextsColor();
            } else {
                textPaint = this.R;
                rightSideTickTextsColor = getRightSideTickTextsColor();
            }
            textPaint.setColor(rightSideTickTextsColor);
            int length = this.t0 ? (this.w0.length - i) - 1 : i;
            String[] strArr = this.w0;
            if (i == 0) {
                canvas.drawText(strArr[length], (this.x0[length] / 2.0f) + this.y0[i], this.z0, this.R);
            } else if (i == strArr.length - 1) {
                canvas.drawText(strArr[length], this.y0[i] - (this.x0[length] / 2.0f), this.z0, this.R);
            } else {
                canvas.drawText(strArr[length], this.y0[i], this.z0, this.R);
            }
        }
    }

    public final void f(Canvas canvas) {
        this.Q.setColor(this.h1);
        this.Q.setStrokeWidth(this.f1);
        RectF rectF = this.c1;
        canvas.drawLine(rectF.left, rectF.top, rectF.right, rectF.bottom, this.Q);
        this.Q.setColor(this.g1);
        this.Q.setStrokeWidth(this.e1);
        RectF rectF2 = this.d1;
        canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.Q);
    }

    public final Bitmap g(Drawable drawable, boolean z) {
        int intrinsicHeight;
        int i;
        if (drawable == null) {
            return null;
        }
        int d = mh.d(this.P, 30.0f);
        if (drawable.getIntrinsicWidth() > d) {
            if (z) {
                i = this.m1;
            } else {
                i = this.a1;
            }
            intrinsicHeight = Math.round(((i * 1.0f) * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth());
            if (i > d) {
                intrinsicHeight = Math.round(((d * 1.0f) * drawable.getIntrinsicHeight()) / drawable.getIntrinsicWidth());
            } else {
                d = i;
            }
        } else {
            d = drawable.getIntrinsicWidth();
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        Bitmap createBitmap = Bitmap.createBitmap(d, intrinsicHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public gx getIndicator() {
        return this.G0;
    }

    public View getIndicatorContentView() {
        return this.L0;
    }

    public String getIndicatorTextString() {
        ix ixVar = this.O0;
        return ixVar != null ? ixVar.a(this.m0) : h(this.m0);
    }

    public float getMax() {
        return this.k0;
    }

    public float getMin() {
        return this.l0;
    }

    public gc0 getOnSeekChangeListener() {
        return this.S;
    }

    public int getProgress() {
        return Math.round(this.m0);
    }

    public synchronized float getProgressFloat() {
        return BigDecimal.valueOf(this.m0).setScale(this.o0, 4).floatValue();
    }

    public int getTickCount() {
        return this.Q0;
    }

    public final String h(float f) {
        String bigDecimal;
        char[] cArr;
        if (this.n0) {
            double d = f;
            int i = this.o0;
            char[][] cArr2 = hr.a;
            int abs = Math.abs(i);
            double pow = (Math.pow(10.0d, abs) * Math.abs(d)) + 0.5d;
            if (pow <= 9.99999999999999E14d && abs <= 16) {
                long nextUp = (long) Math.nextUp(pow);
                if (nextUp < 1) {
                    return "0";
                }
                char[] charArray = Long.toString(nextUp).toCharArray();
                if (charArray.length > abs) {
                    int length = charArray.length - 1;
                    int length2 = charArray.length - abs;
                    while (length >= length2 && charArray[length] == '0') {
                        length--;
                    }
                    if (length >= length2) {
                        cArr = new char[length + 2];
                        System.arraycopy(charArray, 0, cArr, 0, length2);
                        cArr[length2] = '.';
                        System.arraycopy(charArray, length2, cArr, length2 + 1, (length - length2) + 1);
                    } else {
                        cArr = new char[length2];
                        System.arraycopy(charArray, 0, cArr, 0, length2);
                    }
                } else {
                    int length3 = charArray.length;
                    do {
                        length3--;
                        if (length3 < 0) {
                            break;
                        }
                    } while (charArray[length3] == '0');
                    char[] cArr3 = hr.a[abs - charArray.length];
                    char[] copyOf = Arrays.copyOf(cArr3, cArr3.length + length3 + 1);
                    System.arraycopy(charArray, 0, copyOf, cArr3.length, length3 + 1);
                    cArr = copyOf;
                }
                if (Math.signum(d) > 0.0d) {
                    bigDecimal = new String(cArr);
                } else {
                    StringBuilder b = e5.b("-");
                    b.append(new String(cArr));
                    return b.toString();
                }
            } else {
                bigDecimal = new BigDecimal(Double.toString(d)).setScale(Math.abs(abs), RoundingMode.HALF_UP).toString();
                if (abs != 0) {
                    int length4 = bigDecimal.length();
                    do {
                        length4--;
                        if (length4 < 0) {
                            break;
                        }
                    } while (bigDecimal.charAt(length4) == '0');
                    String substring = bigDecimal.substring(0, length4 + 1);
                    if (substring.charAt(substring.length() - 1) == '.') {
                        return substring.substring(0, substring.length() - 1);
                    }
                    return substring;
                }
            }
            return bigDecimal;
        }
        return String.valueOf(Math.round(f));
    }

    public final void i() {
        float f = this.k0;
        float f2 = this.l0;
        if (f < f2) {
            throw new IllegalArgumentException("the Argument: MAX's value must be larger than MIN's.");
        }
        if (this.m0 < f2) {
            this.m0 = f2;
        }
        if (this.m0 > f) {
            this.m0 = f;
        }
    }

    public final void j() {
        int i;
        this.f0 = getMeasuredWidth();
        this.d0 = getPaddingStart();
        this.e0 = getPaddingEnd();
        this.g0 = getPaddingTop();
        float f = (this.f0 - this.d0) - this.e0;
        this.h0 = f;
        this.i0 = f / (this.Q0 + (-1) > 0 ? i - 1 : 1);
    }

    public final void k() {
        String str;
        int i = this.Q0;
        if (i == 0) {
            return;
        }
        if (this.u0) {
            this.w0 = new String[i];
        }
        for (int i2 = 0; i2 < this.P0.length; i2++) {
            if (this.u0) {
                String[] strArr = this.w0;
                CharSequence[] charSequenceArr = this.F0;
                if (charSequenceArr == null) {
                    str = h(this.s0[i2]);
                } else if (i2 < charSequenceArr.length) {
                    str = String.valueOf(charSequenceArr[i2]);
                } else {
                    str = "";
                }
                strArr[i2] = str;
                TextPaint textPaint = this.R;
                String str2 = this.w0[i2];
                textPaint.getTextBounds(str2, 0, str2.length(), this.T);
                this.x0[i2] = this.T.width();
                this.y0[i2] = (this.i0 * i2) + this.d0;
            }
            this.P0[i2] = (this.i0 * i2) + this.d0;
        }
    }

    public final void l() {
        Drawable drawable = this.n1;
        if (drawable == null) {
            return;
        }
        if (drawable instanceof StateListDrawable) {
            try {
                StateListDrawable stateListDrawable = (StateListDrawable) drawable;
                Class<?> cls = stateListDrawable.getClass();
                int intValue = ((Integer) cls.getMethod("getStateCount", new Class[0]).invoke(stateListDrawable, new Object[0])).intValue();
                if (intValue != 2) {
                    throw new IllegalArgumentException("the format of the selector thumb drawable is wrong!");
                }
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("getStateSet", cls2);
                Method method2 = cls.getMethod("getStateDrawable", cls2);
                for (int i = 0; i < intValue; i++) {
                    int[] iArr = (int[]) method.invoke(stateListDrawable, Integer.valueOf(i));
                    if (iArr.length <= 0) {
                        this.k1 = g((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), true);
                    } else if (iArr[0] != 16842919) {
                        throw new IllegalArgumentException("the state of the selector thumb drawable is wrong!");
                    } else {
                        this.o1 = g((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), true);
                    }
                }
                return;
            } catch (Exception unused) {
                drawable = this.n1;
            }
        }
        Bitmap g = g(drawable, true);
        this.k1 = g;
        this.o1 = g;
    }

    public final void m(ColorStateList colorStateList, int i) {
        Field[] declaredFields;
        if (colorStateList == null) {
            this.l1 = i;
            this.p1 = i;
            return;
        }
        try {
            int[][] iArr = null;
            int[] iArr2 = null;
            for (Field field : colorStateList.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("mStateSpecs".equals(field.getName())) {
                    iArr = (int[][]) field.get(colorStateList);
                }
                if ("mColors".equals(field.getName())) {
                    iArr2 = (int[]) field.get(colorStateList);
                }
            }
            if (iArr == null || iArr2 == null) {
                return;
            }
            if (iArr.length == 1) {
                int i2 = iArr2[0];
                this.l1 = i2;
                this.p1 = i2;
            } else if (iArr.length != 2) {
                throw new IllegalArgumentException("the selector color file you set for the argument: isb_thumb_color is in wrong format.");
            } else {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    int[] iArr3 = iArr[i3];
                    if (iArr3.length == 0) {
                        this.p1 = iArr2[i3];
                    } else if (iArr3[0] != 16842919) {
                        throw new IllegalArgumentException("the selector color file you set for the argument: isb_thumb_color is in wrong format.");
                    } else {
                        this.l1 = iArr2[i3];
                    }
                }
            }
        } catch (Exception unused) {
            throw new RuntimeException("Something wrong happened when parseing thumb selector color.");
        }
    }

    public final void n() {
        Drawable drawable = this.W0;
        if (drawable instanceof StateListDrawable) {
            StateListDrawable stateListDrawable = (StateListDrawable) drawable;
            try {
                Class<?> cls = stateListDrawable.getClass();
                int intValue = ((Integer) cls.getMethod("getStateCount", new Class[0]).invoke(stateListDrawable, new Object[0])).intValue();
                if (intValue != 2) {
                    throw new IllegalArgumentException("the format of the selector TickMarks drawable is wrong!");
                }
                Class<?> cls2 = Integer.TYPE;
                Method method = cls.getMethod("getStateSet", cls2);
                Method method2 = cls.getMethod("getStateDrawable", cls2);
                for (int i = 0; i < intValue; i++) {
                    int[] iArr = (int[]) method.invoke(stateListDrawable, Integer.valueOf(i));
                    if (iArr.length <= 0) {
                        this.U0 = g((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), false);
                    } else if (iArr[0] != 16842913) {
                        throw new IllegalArgumentException("the state of the selector TickMarks drawable is wrong!");
                    } else {
                        this.V0 = g((Drawable) method2.invoke(stateListDrawable, Integer.valueOf(i)), false);
                    }
                }
                return;
            } catch (Exception unused) {
                drawable = this.W0;
            }
        }
        Bitmap g = g(drawable, false);
        this.U0 = g;
        this.V0 = g;
    }

    public final void o(ColorStateList colorStateList, int i) {
        Field[] declaredFields;
        if (colorStateList == null) {
            this.S0 = i;
            this.R0 = i;
            return;
        }
        try {
            int[][] iArr = null;
            int[] iArr2 = null;
            for (Field field : colorStateList.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("mStateSpecs".equals(field.getName())) {
                    iArr = (int[][]) field.get(colorStateList);
                }
                if ("mColors".equals(field.getName())) {
                    iArr2 = (int[]) field.get(colorStateList);
                }
            }
            if (iArr != null && iArr2 != null) {
                if (iArr.length == 1) {
                    int i2 = iArr2[0];
                    this.S0 = i2;
                    this.R0 = i2;
                } else if (iArr.length == 2) {
                    for (int i3 = 0; i3 < iArr.length; i3++) {
                        int[] iArr3 = iArr[i3];
                        if (iArr3.length == 0) {
                            this.R0 = iArr2[i3];
                        } else if (iArr3[0] == 16842913) {
                            this.S0 = iArr2[i3];
                        } else {
                            throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_marks_color is in wrong format.");
                        }
                    }
                } else {
                    throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_marks_color is in wrong format.");
                }
            }
        } catch (Exception e) {
            StringBuilder b = e5.b("Something wrong happened when parsing thumb selector color.");
            b.append(e.getMessage());
            throw new RuntimeException(b.toString());
        }
    }

    @Override // android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        f(canvas);
        d(canvas);
        e(canvas);
        c(canvas);
        if (this.q1 && (!this.u0 || this.Q0 <= 2)) {
            this.R.setColor(this.s1);
            canvas.drawText(h(this.m0), getThumbCenterX(), this.r1, this.R);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.resolveSize(mh.d(this.P, 170.0f), i), Math.round(this.U + getPaddingTop() + getPaddingBottom()) + this.v0);
        j();
        r();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        setProgress(bundle.getFloat("isb_progress"));
        super.onRestoreInstanceState(bundle.getParcelable("isb_instance_state"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("isb_instance_state", super.onSaveInstanceState());
        bundle.putFloat("isb_progress", this.m0);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (r0 != 3) goto L11;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        RectF rectF;
        boolean z4;
        PopupWindow popupWindow;
        boolean z5 = false;
        if (!this.p0 || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    q(motionEvent);
                }
            }
            this.j0 = false;
            gc0 gc0Var = this.S;
            if (gc0Var != null) {
                gc0Var.c(this);
            }
            if (this.Q0 >= 3 && this.r0 && this.t1) {
                int closestIndex = getClosestIndex();
                float f = this.m0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, Math.abs(f - this.s0[closestIndex]));
                ofFloat.start();
                ofFloat.addUpdateListener(new hx(this, f, closestIndex));
                z5 = true;
            }
            if (!z5) {
                invalidate();
            }
            gx gxVar = this.G0;
            if (gxVar != null && (popupWindow = gxVar.e) != null) {
                popupWindow.dismiss();
            }
        } else {
            performClick();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.W == -1.0f) {
                this.W = mh.d(this.P, 5.0f);
            }
            float f2 = this.W;
            float f3 = f2 * 2.0f;
            if (x >= this.d0 - f3 && x <= f3 + (this.f0 - this.e0)) {
                z = true;
            } else {
                z = false;
            }
            float f4 = this.c1.top;
            float f5 = this.j1;
            if (y >= (f4 - f5) - f2 && y <= f4 + f5 + f2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                if (this.q0) {
                    s(this.m0);
                    if (this.t0) {
                        rectF = this.d1;
                    } else {
                        rectF = this.c1;
                    }
                    float f6 = rectF.right;
                    float f7 = this.m1 / 2.0f;
                    if (f6 - f7 <= x && x <= f7 + f6) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        return false;
                    }
                }
                this.j0 = true;
                gc0 gc0Var2 = this.S;
                if (gc0Var2 != null) {
                    gc0Var2.b();
                }
                q(motionEvent);
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p(ColorStateList colorStateList, int i) {
        Field[] declaredFields;
        if (colorStateList == null) {
            this.D0 = i;
            this.C0 = i;
            this.E0 = i;
            return;
        }
        try {
            int[][] iArr = null;
            int[] iArr2 = null;
            for (Field field : colorStateList.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if ("mStateSpecs".equals(field.getName())) {
                    iArr = (int[][]) field.get(colorStateList);
                }
                if ("mColors".equals(field.getName())) {
                    iArr2 = (int[]) field.get(colorStateList);
                }
            }
            if (iArr == null || iArr2 == null) {
                return;
            }
            if (iArr.length == 1) {
                int i2 = iArr2[0];
                this.D0 = i2;
                this.C0 = i2;
                this.E0 = i2;
            } else if (iArr.length != 3) {
                throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_texts_color is in wrong format.");
            } else {
                for (int i3 = 0; i3 < iArr.length; i3++) {
                    int[] iArr3 = iArr[i3];
                    if (iArr3.length == 0) {
                        this.D0 = iArr2[i3];
                    } else {
                        int i4 = iArr3[0];
                        if (i4 == 16842913) {
                            this.C0 = iArr2[i3];
                        } else if (i4 != 16843623) {
                            throw new IllegalArgumentException("the selector color file you set for the argument: isb_tick_texts_color is in wrong format.");
                        } else {
                            this.E0 = iArr2[i3];
                        }
                    }
                }
            }
        } catch (Exception unused) {
            throw new RuntimeException("Something wrong happened when parseing thumb selector color.");
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        return super.performClick();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(MotionEvent motionEvent) {
        float f;
        View view;
        float x = motionEvent.getX();
        int i = this.d0;
        if (x >= i) {
            float x2 = motionEvent.getX();
            i = this.f0 - this.e0;
            if (x2 <= i) {
                f = motionEvent.getX();
                if (this.Q0 > 2 && !this.r0) {
                    f = this.d0 + (this.i0 * Math.round((f - this.d0) / this.i0));
                }
                if (this.t0) {
                    f = (this.d0 * 2) + (this.h0 - f);
                }
                this.V = this.m0;
                float amplitude = (((f - this.d0) * getAmplitude()) / this.h0) + this.l0;
                this.m0 = amplitude;
                s(amplitude);
                boolean z = true;
                setSeekListener(true);
                invalidate();
                if (!this.J0) {
                    t();
                    return;
                }
                gx gxVar = this.G0;
                if (gxVar != null) {
                    if (gxVar.e == null && gxVar.j != 0 && (view = gxVar.l) != null) {
                        view.measure(0, 0);
                        View view2 = gxVar.l;
                        int i2 = Build.VERSION.SDK_INT;
                        FrameLayout frameLayout = view2;
                        if (i2 < 23) {
                            FrameLayout frameLayout2 = new FrameLayout(gxVar.i);
                            frameLayout2.addView(gxVar.l);
                            frameLayout = frameLayout2;
                        }
                        PopupWindow popupWindow = new PopupWindow(frameLayout, -1, -2, false);
                        gxVar.e = popupWindow;
                        if (i2 >= 26) {
                            popupWindow.setAnimationStyle(aj0.SimpleFadeAnimation);
                        } else {
                            popupWindow.setAnimationStyle(0);
                        }
                    }
                    PopupWindow popupWindow2 = this.G0.e;
                    if ((popupWindow2 == null || !popupWindow2.isShowing()) ? false : false) {
                        this.G0.e(getThumbCenterX());
                        return;
                    }
                    gx gxVar2 = this.G0;
                    float thumbCenterX = getThumbCenterX();
                    if (gxVar2.k.isEnabled() && gxVar2.k.getVisibility() == 0) {
                        gxVar2.b();
                        if (gxVar2.e != null) {
                            gxVar2.f.measure(0, 0);
                            PopupWindow popupWindow3 = gxVar2.e;
                            IndicatorSeekBar indicatorSeekBar = gxVar2.k;
                            int i3 = -(((gxVar2.f.getMeasuredHeight() + indicatorSeekBar.getMeasuredHeight()) - gxVar2.k.getPaddingTop()) + gxVar2.g);
                            if (Build.VERSION.SDK_INT >= 26) {
                                popupWindow3.showAsDropDown(indicatorSeekBar, 0, i3);
                            } else {
                                popupWindow3.showAsDropDown(new x6(indicatorSeekBar.getContext(), indicatorSeekBar), 0, i3);
                            }
                        }
                        gxVar2.e(thumbCenterX);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        f = i;
        if (this.Q0 > 2) {
            f = this.d0 + (this.i0 * Math.round((f - this.d0) / this.i0));
        }
        if (this.t0) {
        }
        this.V = this.m0;
        float amplitude2 = (((f - this.d0) * getAmplitude()) / this.h0) + this.l0;
        this.m0 = amplitude2;
        s(amplitude2);
        boolean z2 = true;
        setSeekListener(true);
        invalidate();
        if (!this.J0) {
        }
    }

    public final void r() {
        RectF rectF;
        float f;
        RectF rectF2;
        boolean z;
        if (this.t0) {
            RectF rectF3 = this.d1;
            float f2 = this.d0;
            rectF3.left = f2;
            rectF3.top = this.g0 + this.j1;
            rectF3.right = ((1.0f - ((this.m0 - this.l0) / getAmplitude())) * this.h0) + f2;
            rectF = this.d1;
            f = rectF.top;
            rectF.bottom = f;
            rectF2 = this.c1;
        } else {
            RectF rectF4 = this.c1;
            rectF4.left = this.d0;
            rectF4.top = this.g0 + this.j1;
            rectF4.right = (((this.m0 - this.l0) * this.h0) / getAmplitude()) + this.d0;
            rectF = this.c1;
            f = rectF.top;
            rectF.bottom = f;
            rectF2 = this.d1;
        }
        rectF2.left = rectF.right;
        rectF2.top = f;
        rectF2.right = this.f0 - this.e0;
        rectF2.bottom = f;
        if (!this.q1 && (this.Q0 == 0 || !this.u0)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.R.getTextBounds("j", 0, 1, this.T);
            float round = this.g0 + this.U + Math.round(this.T.height() - this.R.descent()) + mh.d(this.P, 3.0f);
            this.z0 = round;
            this.r1 = round;
        }
        if (this.P0 == null) {
            return;
        }
        k();
        if (this.Q0 > 2) {
            float f3 = this.s0[getClosestIndex()];
            this.m0 = f3;
            this.V = f3;
        }
        s(this.m0);
    }

    public final void s(float f) {
        RectF rectF;
        RectF rectF2;
        if (this.t0) {
            this.d1.right = ((1.0f - ((f - this.l0) / getAmplitude())) * this.h0) + this.d0;
            rectF = this.c1;
            rectF2 = this.d1;
        } else {
            this.c1.right = (((f - this.l0) * this.h0) / getAmplitude()) + this.d0;
            rectF = this.d1;
            rectF2 = this.c1;
        }
        rectF.left = rectF2.right;
    }

    public void setDecimalScale(int i) {
        this.o0 = i;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        float f;
        if (z == isEnabled()) {
            return;
        }
        super.setEnabled(z);
        if (isEnabled()) {
            f = 1.0f;
            setAlpha(1.0f);
            if (!this.J0) {
                return;
            }
        } else {
            f = 0.3f;
            setAlpha(0.3f);
            if (!this.J0) {
                return;
            }
        }
        this.L0.setAlpha(f);
    }

    public void setFloatProgress(boolean z) {
        this.n0 = z;
    }

    public void setIndicatorStayAlways(boolean z) {
        this.J0 = z;
    }

    public void setIndicatorTextCallback(ix ixVar) {
        this.O0 = ixVar;
        k();
        t();
    }

    public synchronized void setMax(float f) {
        this.k0 = Math.max(this.l0, f);
        i();
        b();
        r();
        invalidate();
        t();
    }

    public synchronized void setMin(float f) {
        this.l0 = Math.min(this.k0, f);
        i();
        b();
        r();
        invalidate();
        t();
    }

    public void setOnSeekChangeListener(gc0 gc0Var) {
        this.S = gc0Var;
    }

    public synchronized void setProgress(float f) {
        this.V = this.m0;
        float f2 = this.l0;
        if (f >= f2) {
            f2 = this.k0;
            if (f > f2) {
            }
            this.m0 = f;
            if (!this.r0 && this.Q0 > 2) {
                this.m0 = this.s0[getClosestIndex()];
            }
            setSeekListener(false);
            s(this.m0);
            postInvalidate();
            t();
        }
        f = f2;
        this.m0 = f;
        if (!this.r0) {
            this.m0 = this.s0[getClosestIndex()];
        }
        setSeekListener(false);
        s(this.m0);
        postInvalidate();
        t();
    }

    public void setR2L(boolean z) {
        this.t0 = z;
        requestLayout();
        invalidate();
        t();
    }

    public void setThumbAdjustAuto(boolean z) {
        this.t1 = z;
    }

    public void setThumbDrawable(Drawable drawable) {
        if (drawable == null) {
            this.n1 = null;
            this.k1 = null;
            this.o1 = null;
        } else {
            this.n1 = drawable;
            float min = Math.min(mh.d(this.P, 30.0f), this.m1) / 2.0f;
            this.i1 = min;
            this.j1 = min;
            this.U = Math.max(min, this.T0) * 2.0f;
            l();
        }
        requestLayout();
        invalidate();
    }

    public synchronized void setTickCount(int i) {
        int i2 = this.Q0;
        if (i2 < 0 || i2 > 50) {
            throw new IllegalArgumentException("the Argument: TICK COUNT must be limited between (0-50), Now is " + this.Q0);
        }
        this.Q0 = i;
        b();
        k();
        j();
        r();
        invalidate();
        t();
    }

    public void setTickMarksDrawable(Drawable drawable) {
        if (drawable == null) {
            this.W0 = null;
            this.U0 = null;
            this.V0 = null;
        } else {
            this.W0 = drawable;
            float min = Math.min(mh.d(this.P, 30.0f), this.a1) / 2.0f;
            this.T0 = min;
            this.U = Math.max(this.j1, min) * 2.0f;
            n();
        }
        invalidate();
    }

    public void setUserSeekAble(boolean z) {
        this.p0 = z;
    }

    public final void t() {
        gx gxVar;
        int i;
        if (this.J0 && (gxVar = this.G0) != null) {
            String indicatorTextString = getIndicatorTextString();
            View view = gxVar.m;
            if (view instanceof xc) {
                ((xc) view).setProgress(indicatorTextString);
            } else {
                TextView textView = gxVar.d;
                if (textView != null) {
                    textView.setText(indicatorTextString);
                }
            }
            int i2 = 0;
            this.L0.measure(0, 0);
            int measuredWidth = this.L0.getMeasuredWidth();
            float thumbCenterX = getThumbCenterX();
            if (this.a0 == -1.0f) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                WindowManager windowManager = (WindowManager) this.P.getSystemService("window");
                if (windowManager != null) {
                    windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                    this.a0 = displayMetrics.widthPixels;
                }
            }
            float f = measuredWidth / 2;
            int i3 = this.f0;
            if (f + thumbCenterX > i3) {
                i2 = i3 - measuredWidth;
                i = (int) ((thumbCenterX - i2) - f);
            } else if (thumbCenterX - f < 0.0f) {
                i = -((int) (f - thumbCenterX));
            } else {
                i2 = (int) (getThumbCenterX() - f);
                i = 0;
            }
            gx.c(this.G0.l, i2, -1, -1, -1);
            gx.c(this.G0.c, i, -1, -1, -1);
        }
    }
}