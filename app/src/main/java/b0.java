package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: b0  reason: default package */
public abstract class b0 extends ViewGroup {
    public final a P;
    public final Context Q;
    public ActionMenuView R;
    public androidx.appcompat.widget.a S;
    public int T;
    public w41 U;
    public boolean V;
    public boolean W;

    /* renamed from: b0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements y41 {
        public boolean a = false;
        public int b;

        public a() {
        }

        @Override // defpackage.y41
        public final void a() {
            if (this.a) {
                return;
            }
            b0 b0Var = b0.this;
            b0Var.U = null;
            b0.super.setVisibility(this.b);
        }

        @Override // defpackage.y41
        public final void b(View view) {
            this.a = true;
        }

        @Override // defpackage.y41
        public final void c() {
            b0.super.setVisibility(0);
            this.a = false;
        }
    }

    public b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.P = new a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(ih0.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.Q = context;
        } else {
            this.Q = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int c(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - 0);
    }

    public static int d(int i, int i2, int i3, View view, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public final w41 e(long j, int i) {
        w41 w41Var = this.U;
        if (w41Var != null) {
            w41Var.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            w41 a2 = a41.a(this);
            a2.a(1.0f);
            a2.c(j);
            a aVar = this.P;
            b0.this.U = a2;
            aVar.b = i;
            a2.d(aVar);
            return a2;
        }
        w41 a3 = a41.a(this);
        a3.a(0.0f);
        a3.c(j);
        a aVar2 = this.P;
        b0.this.U = a3;
        aVar2.b = i;
        a3.d(aVar2);
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.U != null ? this.P.b : getVisibility();
    }

    public int getContentHeight() {
        return this.T;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, lj0.ActionBar, ih0.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(lj0.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        androidx.appcompat.widget.a aVar = this.S;
        if (aVar != null) {
            Configuration configuration2 = aVar.Q.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
                if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                    if (i2 >= 360) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                } else {
                    i = 4;
                }
            } else {
                i = 5;
            }
            aVar.e0 = i;
            f fVar = aVar.R;
            if (fVar != null) {
                fVar.p(true);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.W = false;
        }
        if (!this.W) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.W = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.W = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V = false;
        }
        if (!this.V) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.V = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.V = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.T = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            w41 w41Var = this.U;
            if (w41Var != null) {
                w41Var.b();
            }
            super.setVisibility(i);
        }
    }
}