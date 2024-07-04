package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public class ActionBarContainer extends FrameLayout {
    public boolean P;
    public d Q;
    public View R;
    public View S;
    public Drawable T;
    public Drawable U;
    public Drawable V;
    public boolean W;
    public boolean a0;
    public int b0;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c1 c1Var = new c1(this);
        WeakHashMap<View, String> weakHashMap = a41.a;
        setBackground(c1Var);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.ActionBar);
        this.T = obtainStyledAttributes.getDrawable(lj0.ActionBar_background);
        this.U = obtainStyledAttributes.getDrawable(lj0.ActionBar_backgroundStacked);
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(lj0.ActionBar_height, -1);
        boolean z = true;
        if (getId() == hi0.split_action_bar) {
            this.W = true;
            this.V = obtainStyledAttributes.getDrawable(lj0.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        if (!this.W ? this.T != null || this.U != null : this.V != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    public static int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.T;
        if (drawable != null && drawable.isStateful()) {
            this.T.setState(getDrawableState());
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null && drawable2.isStateful()) {
            this.U.setState(getDrawableState());
        }
        Drawable drawable3 = this.V;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.V.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.Q;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.V;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.R = findViewById(hi0.action_bar);
        this.S = findViewById(hi0.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.P || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        d dVar = this.Q;
        boolean z2 = false;
        boolean z3 = (dVar == null || dVar.getVisibility() == 8) ? false : true;
        if (dVar != null && dVar.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) dVar.getLayoutParams()).bottomMargin;
            dVar.layout(i, (measuredHeight - dVar.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.W) {
            Drawable drawable3 = this.V;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z2 = true;
            }
        } else {
            if (this.T != null) {
                if (this.R.getVisibility() == 0) {
                    drawable2 = this.T;
                    left = this.R.getLeft();
                    top = this.R.getTop();
                    right = this.R.getRight();
                    view = this.R;
                } else {
                    View view2 = this.S;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.T.setBounds(0, 0, 0, 0);
                        z2 = true;
                    } else {
                        drawable2 = this.T;
                        left = this.S.getLeft();
                        top = this.S.getTop();
                        right = this.S.getRight();
                        view = this.S;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z2 = true;
            }
            this.a0 = z3;
            if (z3 && (drawable = this.U) != null) {
                drawable.setBounds(dVar.getLeft(), dVar.getTop(), dVar.getRight(), dVar.getBottom());
                z2 = true;
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        View view;
        int i3;
        int i4;
        if (this.R == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i4 = this.b0) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i4, View.MeasureSpec.getSize(i2)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i, i2);
        if (this.R == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        d dVar = this.Q;
        if (dVar != null && dVar.getVisibility() != 8 && mode != 1073741824) {
            View view2 = this.R;
            boolean z2 = true;
            int i5 = 0;
            if (view2 != null && view2.getVisibility() != 8 && view2.getMeasuredHeight() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                view = this.R;
            } else {
                View view3 = this.S;
                if (view3 != null && view3.getVisibility() != 8 && view3.getMeasuredHeight() != 0) {
                    z2 = false;
                }
                if (!z2) {
                    view = this.S;
                }
                if (mode != Integer.MIN_VALUE) {
                    i3 = View.MeasureSpec.getSize(i2);
                } else {
                    i3 = Integer.MAX_VALUE;
                }
                setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.Q) + i5, i3));
            }
            i5 = a(view);
            if (mode != Integer.MIN_VALUE) {
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(a(this.Q) + i5, i3));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.T;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.T);
        }
        this.T = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.R;
            if (view != null) {
                this.T.setBounds(view.getLeft(), this.R.getTop(), this.R.getRight(), this.R.getBottom());
            }
        }
        boolean z = true;
        if (!this.W ? this.T != null || this.U != null : this.V != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.V;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.V);
        }
        this.V = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.W && (drawable2 = this.V) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.W ? !(this.T != null || this.U != null) : this.V == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.U;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.U);
        }
        this.U = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.a0 && (drawable2 = this.U) != null) {
                drawable2.setBounds(this.Q.getLeft(), this.Q.getTop(), this.Q.getRight(), this.Q.getBottom());
            }
        }
        boolean z = true;
        if (!this.W ? this.T != null || this.U != null : this.V != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setTabContainer(d dVar) {
        d dVar2 = this.Q;
        if (dVar2 != null) {
            removeView(dVar2);
        }
        this.Q = dVar;
        if (dVar != null) {
            addView(dVar);
            ViewGroup.LayoutParams layoutParams = dVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            dVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.P = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.T;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.U;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.V;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.T && !this.W) || (drawable == this.U && this.a0) || ((drawable == this.V && this.W) || super.verifyDrawable(drawable));
    }
}