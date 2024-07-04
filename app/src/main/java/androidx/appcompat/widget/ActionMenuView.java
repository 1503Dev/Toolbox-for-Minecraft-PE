package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.widget.a;
import androidx.appcompat.widget.c;
import androidx.recyclerview.widget.RecyclerView;

public class ActionMenuView extends androidx.appcompat.widget.c implements f.b, l {
    public f h0;
    public Context i0;
    public int j0;
    public boolean k0;
    public androidx.appcompat.widget.a l0;
    public k.a m0;
    public f.a n0;
    public boolean o0;
    public int p0;
    public int q0;
    public int r0;
    public e s0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
        boolean a();

        boolean b();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements k.a {
        @Override // androidx.appcompat.view.menu.k.a
        public final void b(f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final boolean c(f fVar) {
            return false;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends c.a {
        @ViewDebug.ExportedProperty
        public boolean c;
        @ViewDebug.ExportedProperty
        public int d;
        @ViewDebug.ExportedProperty
        public int e;
        @ViewDebug.ExportedProperty
        public boolean f;
        @ViewDebug.ExportedProperty
        public boolean g;
        public boolean h;

        public c() {
            super(-2, -2);
            this.c = false;
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.c = cVar.c;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements f.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.s0;
            if (eVar != null) {
                Toolbar.this.getClass();
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            f.a aVar = ActionMenuView.this.n0;
            if (aVar != null) {
                aVar.b(fVar);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface e {
    }

    public ActionMenuView() {
        throw null;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.q0 = (int) (56.0f * f);
        this.r0 = (int) (f * 4.0f);
        this.i0 = context;
        this.j0 = 0;
    }

    public static c j(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            c cVar = new c();
            cVar.b = 16;
            return cVar;
        }
        c cVar2 = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar2.b <= 0) {
            cVar2.b = 16;
        }
        return cVar2;
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.h0.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.l
    public final void b(f fVar) {
        this.h0 = fVar;
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.c
    public final c.a f() {
        c cVar = new c();
        cVar.b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.c
    public final c.a g(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = new c();
        cVar.b = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.h0 == null) {
            Context context = getContext();
            f fVar = new f(context);
            this.h0 = fVar;
            fVar.e = new d();
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.l0 = aVar;
            aVar.a0 = true;
            aVar.b0 = true;
            k.a aVar2 = this.m0;
            if (aVar2 == null) {
                aVar2 = new b();
            }
            aVar.T = aVar2;
            this.h0.b(aVar, this.i0);
            androidx.appcompat.widget.a aVar3 = this.l0;
            aVar3.W = this;
            this.h0 = aVar3.R;
        }
        return this.h0;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        androidx.appcompat.widget.a aVar = this.l0;
        a.d dVar = aVar.X;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (aVar.Z) {
            return aVar.Y;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.j0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.widget.c
    public final /* bridge */ /* synthetic */ c.a h(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public final boolean k(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).b();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.l0;
        if (aVar != null) {
            aVar.f();
            if (this.l0.g()) {
                this.l0.c();
                this.l0.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.l0;
        if (aVar != null) {
            aVar.c();
            a.C0003a c0003a = aVar.i0;
            if (c0003a != null && c0003a.b()) {
                c0003a.j.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.c, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.o0) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = c51.a(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i5 = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.c) {
                    int i16 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.c) {
                int i19 = paddingLeft + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = e1.d(measuredWidth4, ((ViewGroup.MarginLayoutParams) cVar3).rightMargin, max, i19);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v32 */
    @Override // androidx.appcompat.widget.c, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? r12;
        boolean z4;
        int i7;
        int i8;
        int i9;
        int i10;
        ActionMenuItemView actionMenuItemView;
        boolean z5;
        int i11;
        boolean z6;
        f fVar;
        boolean z7 = this.o0;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.o0 = z;
        if (z7 != z) {
            this.p0 = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.o0 && (fVar = this.h0) != null && size != this.p0) {
            this.p0 = size;
            fVar.p(true);
        }
        int childCount = getChildCount();
        if (this.o0 && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i12 = size2 - paddingRight;
            int i13 = this.q0;
            int i14 = i12 / i13;
            int i15 = i12 % i13;
            if (i14 == 0) {
                setMeasuredDimension(i12, 0);
                return;
            }
            int i16 = (i15 / i14) + i13;
            int childCount2 = getChildCount();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            boolean z8 = false;
            long j = 0;
            int i21 = 0;
            while (i20 < childCount2) {
                View childAt = getChildAt(i20);
                int i22 = size3;
                if (childAt.getVisibility() == 8) {
                    i9 = mode;
                    i8 = i12;
                    i10 = paddingBottom;
                } else {
                    boolean z9 = childAt instanceof ActionMenuItemView;
                    int i23 = i18 + 1;
                    if (z9) {
                        int i24 = this.r0;
                        i6 = i23;
                        r12 = 0;
                        childAt.setPadding(i24, 0, i24, 0);
                    } else {
                        i6 = i23;
                        r12 = 0;
                    }
                    c cVar = (c) childAt.getLayoutParams();
                    cVar.h = r12;
                    cVar.e = r12;
                    cVar.d = r12;
                    cVar.f = r12;
                    ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r12;
                    ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r12;
                    if (z9 && ((ActionMenuItemView) childAt).d()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    cVar.g = z4;
                    if (cVar.c) {
                        i7 = 1;
                    } else {
                        i7 = i14;
                    }
                    i8 = i12;
                    c cVar2 = (c) childAt.getLayoutParams();
                    i9 = mode;
                    i10 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z9) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.d()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (i7 > 0 && (!z5 || i7 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i7 * i16, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i11 = measuredWidth / i16;
                        if (measuredWidth % i16 != 0) {
                            i11++;
                        }
                        if (z5 && i11 < 2) {
                            i11 = 2;
                        }
                    } else {
                        i11 = 0;
                    }
                    if (!cVar2.c && z5) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    cVar2.f = z6;
                    cVar2.d = i11;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i16 * i11, 1073741824), makeMeasureSpec);
                    i19 = Math.max(i19, i11);
                    if (cVar.f) {
                        i21++;
                    }
                    if (cVar.c) {
                        z8 = true;
                    }
                    i14 -= i11;
                    i17 = Math.max(i17, childAt.getMeasuredHeight());
                    if (i11 == 1) {
                        j |= 1 << i20;
                    }
                    i18 = i6;
                }
                i20++;
                size3 = i22;
                paddingBottom = i10;
                i12 = i8;
                mode = i9;
            }
            int i25 = mode;
            int i26 = i12;
            int i27 = size3;
            if (z8 && i18 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z10 = false;
            while (i21 > 0 && i14 > 0) {
                int i28 = Integer.MAX_VALUE;
                int i29 = 0;
                long j2 = 0;
                for (int i30 = 0; i30 < childCount2; i30++) {
                    c cVar3 = (c) getChildAt(i30).getLayoutParams();
                    if (cVar3.f) {
                        int i31 = cVar3.d;
                        if (i31 < i28) {
                            j2 = 1 << i30;
                            i28 = i31;
                            i29 = 1;
                        } else if (i31 == i28) {
                            i29++;
                            j2 |= 1 << i30;
                        }
                    }
                }
                j |= j2;
                if (i29 > i14) {
                    break;
                }
                int i32 = i28 + 1;
                int i33 = 0;
                while (i33 < childCount2) {
                    View childAt2 = getChildAt(i33);
                    c cVar4 = (c) childAt2.getLayoutParams();
                    int i34 = childMeasureSpec;
                    int i35 = childCount2;
                    long j3 = 1 << i33;
                    if ((j2 & j3) == 0) {
                        if (cVar4.d == i32) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && cVar4.g && i14 == 1) {
                            int i36 = this.r0;
                            childAt2.setPadding(i36 + i16, 0, i36, 0);
                        }
                        cVar4.d++;
                        cVar4.h = true;
                        i14--;
                    }
                    i33++;
                    childMeasureSpec = i34;
                    childCount2 = i35;
                }
                z10 = true;
            }
            int i37 = childMeasureSpec;
            int i38 = childCount2;
            if (!z8 && i18 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (i14 > 0 && j != 0 && (i14 < i18 - 1 || z3 || i19 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z3) {
                    if ((j & 1) != 0 && !((c) getChildAt(0).getLayoutParams()).g) {
                        bitCount -= 0.5f;
                    }
                    int i39 = i38 - 1;
                    if ((j & (1 << i39)) != 0 && !((c) getChildAt(i39).getLayoutParams()).g) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i5 = (int) ((i14 * i16) / bitCount);
                } else {
                    i5 = 0;
                }
                boolean z11 = z10;
                i3 = i38;
                for (int i40 = 0; i40 < i3; i40++) {
                    if ((j & (1 << i40)) != 0) {
                        View childAt3 = getChildAt(i40);
                        c cVar5 = (c) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            cVar5.e = i5;
                            cVar5.h = true;
                            if (i40 == 0 && !cVar5.g) {
                                ((ViewGroup.MarginLayoutParams) cVar5).leftMargin = (-i5) / 2;
                            }
                        } else if (cVar5.c) {
                            cVar5.e = i5;
                            cVar5.h = true;
                            ((ViewGroup.MarginLayoutParams) cVar5).rightMargin = (-i5) / 2;
                        } else {
                            if (i40 != 0) {
                                ((ViewGroup.MarginLayoutParams) cVar5).leftMargin = i5 / 2;
                            }
                            if (i40 != i3 - 1) {
                                ((ViewGroup.MarginLayoutParams) cVar5).rightMargin = i5 / 2;
                            }
                        }
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                i3 = i38;
            }
            if (z10) {
                for (int i41 = 0; i41 < i3; i41++) {
                    View childAt4 = getChildAt(i41);
                    c cVar6 = (c) childAt4.getLayoutParams();
                    if (cVar6.h) {
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar6.d * i16) + cVar6.e, 1073741824), i37);
                    }
                }
            }
            if (i25 != 1073741824) {
                i4 = i17;
            } else {
                i4 = i27;
            }
            setMeasuredDimension(i26, i4);
            return;
        }
        for (int i42 = 0; i42 < childCount; i42++) {
            c cVar7 = (c) getChildAt(i42).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar7).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.l0.f0 = z;
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.s0 = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        androidx.appcompat.widget.a aVar = this.l0;
        a.d dVar = aVar.X;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        aVar.Z = true;
        aVar.Y = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.k0 = z;
    }

    public void setPopupTheme(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            if (i == 0) {
                this.i0 = getContext();
            } else {
                this.i0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.l0 = aVar;
        aVar.W = this;
        this.h0 = aVar.R;
    }
}