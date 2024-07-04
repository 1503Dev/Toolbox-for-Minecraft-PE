package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

public class ActionBarContextView extends b0 {
    public CharSequence a0;
    public CharSequence b0;
    public View c0;
    public View d0;
    public LinearLayout e0;
    public TextView f0;
    public TextView g0;
    public int h0;
    public int i0;
    public boolean j0;
    public int k0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements View.OnClickListener {
        public final /* synthetic */ f1 P;

        public a(f1 f1Var) {
            this.P = f1Var;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.P.c();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, r0);
        Drawable drawable;
        int resourceId;
        int i = ih0.actionModeStyle;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.ActionMode, i, 0);
        int i2 = lj0.ActionMode_background;
        if (obtainStyledAttributes.hasValue(i2) && (resourceId = obtainStyledAttributes.getResourceId(i2, 0)) != 0) {
            drawable = z5.b(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(i2);
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        setBackground(drawable);
        this.h0 = obtainStyledAttributes.getResourceId(lj0.ActionMode_titleTextStyle, 0);
        this.i0 = obtainStyledAttributes.getResourceId(lj0.ActionMode_subtitleTextStyle, 0);
        this.T = obtainStyledAttributes.getLayoutDimension(lj0.ActionMode_height, 0);
        this.k0 = obtainStyledAttributes.getResourceId(lj0.ActionMode_closeItemLayout, ni0.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(f1 f1Var) {
        View view;
        androidx.appcompat.widget.a aVar;
        l lVar;
        l lVar2;
        View view2 = this.c0;
        if (view2 == null) {
            view = LayoutInflater.from(getContext()).inflate(this.k0, (ViewGroup) this, false);
            this.c0 = view;
        } else {
            if (view2.getParent() == null) {
                view = this.c0;
            }
            this.c0.findViewById(hi0.action_mode_close_button).setOnClickListener(new a(f1Var));
            f e = f1Var.e();
            aVar = this.S;
            if (aVar != null) {
                aVar.c();
                a.C0003a c0003a = aVar.i0;
                if (c0003a != null && c0003a.b()) {
                    c0003a.j.dismiss();
                }
            }
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
            this.S = aVar2;
            aVar2.a0 = true;
            aVar2.b0 = true;
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
            e.b(this.S, this.Q);
            androidx.appcompat.widget.a aVar3 = this.S;
            lVar = aVar3.W;
            if (lVar == null) {
                l lVar3 = (l) aVar3.S.inflate(aVar3.U, (ViewGroup) this, false);
                aVar3.W = lVar3;
                lVar3.b(aVar3.R);
                aVar3.f();
            }
            lVar2 = aVar3.W;
            if (lVar != lVar2) {
                ((ActionMenuView) lVar2).setPresenter(aVar3);
            }
            ActionMenuView actionMenuView = (ActionMenuView) lVar2;
            this.R = actionMenuView;
            WeakHashMap<View, String> weakHashMap = a41.a;
            actionMenuView.setBackground(null);
            addView(this.R, layoutParams);
        }
        addView(view);
        this.c0.findViewById(hi0.action_mode_close_button).setOnClickListener(new a(f1Var));
        f e2 = f1Var.e();
        aVar = this.S;
        if (aVar != null) {
        }
        androidx.appcompat.widget.a aVar22 = new androidx.appcompat.widget.a(getContext());
        this.S = aVar22;
        aVar22.a0 = true;
        aVar22.b0 = true;
        ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
        e2.b(this.S, this.Q);
        androidx.appcompat.widget.a aVar32 = this.S;
        lVar = aVar32.W;
        if (lVar == null) {
        }
        lVar2 = aVar32.W;
        if (lVar != lVar2) {
        }
        ActionMenuView actionMenuView2 = (ActionMenuView) lVar2;
        this.R = actionMenuView2;
        WeakHashMap<View, String> weakHashMap2 = a41.a;
        actionMenuView2.setBackground(null);
        addView(this.R, layoutParams2);
    }

    public final void g() {
        if (this.e0 == null) {
            LayoutInflater.from(getContext()).inflate(ni0.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.e0 = linearLayout;
            this.f0 = (TextView) linearLayout.findViewById(hi0.action_bar_title);
            this.g0 = (TextView) this.e0.findViewById(hi0.action_bar_subtitle);
            if (this.h0 != 0) {
                this.f0.setTextAppearance(getContext(), this.h0);
            }
            if (this.i0 != 0) {
                this.g0.setTextAppearance(getContext(), this.i0);
            }
        }
        this.f0.setText(this.a0);
        this.g0.setText(this.b0);
        boolean z = !TextUtils.isEmpty(this.a0);
        boolean z2 = !TextUtils.isEmpty(this.b0);
        int i = 0;
        this.g0.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout2 = this.e0;
        if (!z && !z2) {
            i = 8;
        }
        linearLayout2.setVisibility(i);
        if (this.e0.getParent() == null) {
            addView(this.e0);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.b0
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.b0
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.b0;
    }

    public CharSequence getTitle() {
        return this.a0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.S;
        if (aVar != null) {
            aVar.c();
            a.C0003a c0003a = this.S.i0;
            if (c0003a != null && c0003a.b()) {
                c0003a.j.dismiss();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.a0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean a2 = c51.a(this);
        int paddingRight = a2 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.c0;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c0.getLayoutParams();
            int i5 = a2 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = a2 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = a2 ? paddingRight - i5 : paddingRight + i5;
            int d = b0.d(i7, paddingTop, paddingTop2, this.c0, a2) + i7;
            paddingRight = a2 ? d - i6 : d + i6;
        }
        LinearLayout linearLayout = this.e0;
        if (linearLayout != null && this.d0 == null && linearLayout.getVisibility() != 8) {
            paddingRight += b0.d(paddingRight, paddingTop, paddingTop2, this.e0, a2);
        }
        View view2 = this.d0;
        if (view2 != null) {
            b0.d(paddingRight, paddingTop, paddingTop2, view2, a2);
        }
        int paddingLeft = a2 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.R;
        if (actionMenuView != null) {
            b0.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !a2);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        } else {
            int size = View.MeasureSpec.getSize(i);
            int i3 = this.T;
            if (i3 <= 0) {
                i3 = View.MeasureSpec.getSize(i2);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i4 = i3 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, RecyclerView.UNDEFINED_DURATION);
            View view = this.c0;
            if (view != null) {
                int c = b0.c(view, paddingLeft, makeMeasureSpec);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.c0.getLayoutParams();
                paddingLeft = c - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.R;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = b0.c(this.R, paddingLeft, makeMeasureSpec);
            }
            LinearLayout linearLayout = this.e0;
            if (linearLayout != null && this.d0 == null) {
                if (this.j0) {
                    this.e0.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.e0.getMeasuredWidth();
                    boolean z = measuredWidth <= paddingLeft;
                    if (z) {
                        paddingLeft -= measuredWidth;
                    }
                    this.e0.setVisibility(z ? 0 : 8);
                } else {
                    paddingLeft = b0.c(linearLayout, paddingLeft, makeMeasureSpec);
                }
            }
            View view2 = this.d0;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i5 = layoutParams.width;
                int i6 = i5 != -2 ? 1073741824 : RecyclerView.UNDEFINED_DURATION;
                if (i5 >= 0) {
                    paddingLeft = Math.min(i5, paddingLeft);
                }
                int i7 = layoutParams.height;
                int i8 = i7 == -2 ? RecyclerView.UNDEFINED_DURATION : 1073741824;
                if (i7 >= 0) {
                    i4 = Math.min(i7, i4);
                }
                this.d0.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
            }
            if (this.T <= 0) {
                int childCount = getChildCount();
                i3 = 0;
                for (int i9 = 0; i9 < childCount; i9++) {
                    int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i3) {
                        i3 = measuredHeight;
                    }
                }
            }
            setMeasuredDimension(size, i3);
        }
    }

    @Override // defpackage.b0
    public void setContentHeight(int i) {
        this.T = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.d0;
        if (view2 != null) {
            removeView(view2);
        }
        this.d0 = view;
        if (view != null && (linearLayout = this.e0) != null) {
            removeView(linearLayout);
            this.e0 = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b0 = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.a0 = charSequence;
        g();
    }

    public void setTitleOptional(boolean z) {
        if (z != this.j0) {
            requestLayout();
        }
        this.j0 = z;
    }

    @Override // defpackage.b0, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}