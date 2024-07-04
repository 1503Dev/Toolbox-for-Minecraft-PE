package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.a;

public class ActionMenuItemView extends AppCompatTextView implements l.a, View.OnClickListener, ActionMenuView.a {
    public h T;
    public CharSequence U;
    public Drawable V;
    public f.b W;
    public a a0;
    public b b0;
    public boolean c0;
    public boolean d0;
    public int e0;
    public int f0;
    public int g0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends ir {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // defpackage.ir
        public final bs0 b() {
            a.C0003a c0003a;
            b bVar = ActionMenuItemView.this.b0;
            if (bVar == null || (c0003a = androidx.appcompat.widget.a.this.i0) == null) {
                return null;
            }
            return c0003a.a();
        }

        @Override // defpackage.ir
        public final boolean c() {
            bs0 b;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            f.b bVar = actionMenuItemView.W;
            return bVar != null && bVar.a(actionMenuItemView.T) && (b = b()) != null && b.c();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.c0 = h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.ActionMenuItemView, 0, 0);
        this.e0 = obtainStyledAttributes.getDimensionPixelSize(lj0.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.g0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f0 = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public final boolean b() {
        return d() && this.T.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.l.a
    public final void c(h hVar) {
        int i;
        this.T = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.getTitleCondensed());
        setId(hVar.a);
        if (hVar.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.a0 == null) {
            this.a0 = new a();
        }
    }

    public final boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.l.a
    public h getItemData() {
        return this.T;
    }

    public final boolean h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void i() {
        CharSequence charSequence;
        boolean z;
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.U);
        if (this.V != null) {
            if ((this.T.y & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.c0 && !this.d0)) {
                z2 = false;
            }
        }
        boolean z4 = z3 & z2;
        CharSequence charSequence2 = null;
        if (z4) {
            charSequence = this.U;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.T.q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z4) {
                charSequence3 = null;
            } else {
                charSequence3 = this.T.e;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.T.r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z4) {
                charSequence2 = this.T.e;
            }
            f01.a(charSequence2, this);
            return;
        }
        f01.a(charSequence4, this);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f.b bVar = this.W;
        if (bVar != null) {
            bVar.a(this.T);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c0 = h();
        i();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean d = d();
        if (d && (i3 = this.f0) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.e0) : this.e0;
        if (mode != 1073741824 && this.e0 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (d || this.V == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.V.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.T.hasSubMenu() && (aVar = this.a0) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.d0 != z) {
            this.d0 = z;
            h hVar = this.T;
            if (hVar != null) {
                f fVar = hVar.n;
                fVar.k = true;
                fVar.p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.V = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.g0;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        i();
    }

    public void setItemInvoker(f.b bVar) {
        this.W = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.b0 = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.U = charSequence;
        i();
    }
}