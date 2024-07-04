package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.warkiz.widget.ArrowView;
import com.warkiz.widget.IndicatorSeekBar;

/* renamed from: gx  reason: default package */
public final class gx {
    public final int a;
    public int[] b = new int[2];
    public ArrowView c;
    public TextView d;
    public PopupWindow e;
    public LinearLayout f;
    public int g;
    public int h;
    public Context i;
    public int j;
    public IndicatorSeekBar k;
    public View l;
    public View m;
    public View n;
    public View o;
    public float p;
    public int q;

    public gx(Context context, IndicatorSeekBar indicatorSeekBar, int i, int i2, int i3, int i4, View view, View view2) {
        View findViewById;
        View findViewById2;
        this.i = context;
        this.k = indicatorSeekBar;
        this.h = i;
        this.j = i2;
        this.n = view;
        this.o = view2;
        this.p = i3;
        this.q = i4;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.a = windowManager != null ? windowManager.getDefaultDisplay().getWidth() : 0;
        this.g = mh.d(this.i, 2.0f);
        int i5 = this.j;
        if (i5 == 4) {
            View view3 = this.n;
            if (view3 == null) {
                throw new IllegalArgumentException("the attr：indicator_custom_layout must be set while you set the indicator type to CUSTOM.");
            }
            this.l = view3;
            int identifier = this.i.getResources().getIdentifier("isb_progress", "id", this.i.getApplicationContext().getPackageName());
            if (identifier <= 0 || (findViewById2 = this.l.findViewById(identifier)) == null) {
                return;
            }
            if (!(findViewById2 instanceof TextView)) {
                throw new ClassCastException("the view identified by isb_progress in indicator custom layout can not be cast to TextView");
            }
            TextView textView = (TextView) findViewById2;
            this.d = textView;
            textView.setText(this.k.getIndicatorTextString());
            this.d.setTextSize((int) ((this.p / this.i.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
            this.d.setTextColor(this.q);
        } else if (i5 == 1) {
            xc xcVar = new xc(this.i, this.p, this.q, this.h);
            this.l = xcVar;
            this.m = xcVar;
            xcVar.setProgress(this.k.getIndicatorTextString());
        } else {
            View inflate = View.inflate(this.i, li0.isb_indicator, null);
            this.l = inflate;
            this.m = inflate.findViewById(gi0.root);
            this.f = (LinearLayout) this.l.findViewById(gi0.indicator_container);
            ArrowView arrowView = (ArrowView) this.l.findViewById(gi0.indicator_arrow);
            this.c = arrowView;
            arrowView.setColor(this.h);
            TextView textView2 = (TextView) this.l.findViewById(gi0.isb_progress);
            this.d = textView2;
            textView2.setText(this.k.getIndicatorTextString());
            this.d.setTextSize((int) ((this.p / this.i.getResources().getDisplayMetrics().scaledDensity) + 0.5f));
            this.d.setTextColor(this.q);
            this.f.setBackground(a());
            if (this.o != null) {
                int identifier2 = this.i.getResources().getIdentifier("isb_progress", "id", this.i.getApplicationContext().getPackageName());
                View view4 = this.o;
                if (identifier2 <= 0 || (findViewById = view4.findViewById(identifier2)) == null || !(findViewById instanceof TextView)) {
                    d(view4, null);
                } else {
                    d(view4, (TextView) findViewById);
                }
            }
        }
    }

    public static void c(View view, int i, int i2, int i3, int i4) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (i == -1) {
                i = marginLayoutParams.leftMargin;
            }
            if (i2 == -1) {
                i2 = marginLayoutParams.topMargin;
            }
            if (i3 == -1) {
                i3 = marginLayoutParams.rightMargin;
            }
            if (i4 == -1) {
                i4 = marginLayoutParams.bottomMargin;
            }
            marginLayoutParams.setMargins(i, i2, i3, i4);
            view.requestLayout();
        }
    }

    public final GradientDrawable a() {
        Resources resources;
        int i;
        if (this.j == 2) {
            resources = this.i.getResources();
            i = xh0.isb_indicator_rounded_corners;
        } else {
            resources = this.i.getResources();
            i = xh0.isb_indicator_square_corners;
        }
        GradientDrawable gradientDrawable = (GradientDrawable) resources.getDrawable(i);
        gradientDrawable.setColor(this.h);
        return gradientDrawable;
    }

    public final void b() {
        String indicatorTextString = this.k.getIndicatorTextString();
        View view = this.m;
        if (view instanceof xc) {
            ((xc) view).setProgress(indicatorTextString);
            return;
        }
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(indicatorTextString);
        }
    }

    public final void d(View view, TextView textView) {
        this.d = textView;
        this.f.removeAllViews();
        view.setBackground(a());
        this.f.addView(view);
    }

    public final void e(float f) {
        ArrowView arrowView;
        int measuredWidth;
        if (this.k.isEnabled() && this.k.getVisibility() == 0) {
            b();
            if (this.e != null) {
                this.f.measure(0, 0);
                PopupWindow popupWindow = this.e;
                IndicatorSeekBar indicatorSeekBar = this.k;
                popupWindow.update(indicatorSeekBar, 0, -(((this.f.getMeasuredHeight() + indicatorSeekBar.getMeasuredHeight()) - this.k.getPaddingTop()) + this.g), -1, -1);
                this.k.getLocationOnScreen(this.b);
                ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).leftMargin = this.b[0] + ((int) (f - (this.f.getMeasuredWidth() / 2)));
                this.l.requestLayout();
                int i = this.j;
                if (i != 4 && i != 1) {
                    this.k.getLocationOnScreen(this.b);
                    int i2 = this.b[0];
                    if (i2 + f < this.f.getMeasuredWidth() / 2) {
                        arrowView = this.c;
                        measuredWidth = -((int) (((this.f.getMeasuredWidth() / 2) - i2) - f));
                    } else if ((this.a - i2) - f < this.f.getMeasuredWidth() / 2) {
                        arrowView = this.c;
                        measuredWidth = (int) ((this.f.getMeasuredWidth() / 2) - ((this.a - i2) - f));
                    } else {
                        c(this.c, 0, 0, 0, 0);
                        return;
                    }
                    c(arrowView, measuredWidth, -1, -1, -1);
                }
            }
        }
    }
}