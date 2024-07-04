package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b1;
import java.util.ArrayList;
import java.util.WeakHashMap;

public class Toolbar extends ViewGroup {
    public androidx.appcompat.widget.a A0;
    public d B0;
    public boolean C0;
    public final b D0;
    public ActionMenuView P;
    public AppCompatTextView Q;
    public AppCompatTextView R;
    public q5 S;
    public s5 T;
    public Drawable U;
    public CharSequence V;
    public q5 W;
    public View a0;
    public Context b0;
    public int c0;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public pm0 l0;
    public int m0;
    public int n0;
    public int o0;
    public CharSequence p0;
    public CharSequence q0;
    public ColorStateList r0;
    public ColorStateList s0;
    public boolean t0;
    public boolean u0;
    public final ArrayList<View> v0;
    public final ArrayList<View> w0;
    public final int[] x0;
    public final a y0;
    public androidx.appcompat.widget.e z0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            androidx.appcompat.widget.a aVar;
            ActionMenuView actionMenuView = Toolbar.this.P;
            if (actionMenuView != null && (aVar = actionMenuView.l0) != null) {
                aVar.l();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h hVar;
            d dVar = Toolbar.this.B0;
            if (dVar == null) {
                hVar = null;
            } else {
                hVar = dVar.Q;
            }
            if (hVar != null) {
                hVar.collapseActionView();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements k {
        public androidx.appcompat.view.menu.f P;
        public h Q;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.k
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.k
        public final boolean d(h hVar) {
            View view = Toolbar.this.a0;
            if (view instanceof ld) {
                ((ld) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.a0);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.W);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.a0 = null;
            int size = toolbar3.w0.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.w0.get(size));
                } else {
                    toolbar3.w0.clear();
                    this.Q = null;
                    Toolbar.this.requestLayout();
                    hVar.C = false;
                    hVar.n.p(false);
                    return true;
                }
            }
        }

        @Override // androidx.appcompat.view.menu.k
        public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
            h hVar;
            androidx.appcompat.view.menu.f fVar2 = this.P;
            if (fVar2 != null && (hVar = this.Q) != null) {
                fVar2.d(hVar);
            }
            this.P = fVar;
        }

        @Override // androidx.appcompat.view.menu.k
        public final void f() {
            if (this.Q != null) {
                androidx.appcompat.view.menu.f fVar = this.P;
                boolean z = false;
                if (fVar != null) {
                    int size = fVar.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.P.getItem(i) == this.Q) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (z) {
                    return;
                }
                d(this.Q);
            }
        }

        @Override // androidx.appcompat.view.menu.k
        public final boolean h(o oVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.k
        public final boolean i() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.k
        public final boolean k(h hVar) {
            Toolbar.this.c();
            ViewParent parent = Toolbar.this.W.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.W);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.W);
            }
            Toolbar.this.a0 = hVar.getActionView();
            this.Q = hVar;
            ViewParent parent2 = Toolbar.this.a0.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.a0);
                }
                Toolbar.this.getClass();
                e eVar = new e();
                Toolbar toolbar4 = Toolbar.this;
                eVar.a = 8388611 | (toolbar4.f0 & 112);
                eVar.b = 2;
                toolbar4.a0.setLayoutParams(eVar);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.a0);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (((e) childAt.getLayoutParams()).b != 2 && childAt != toolbar6.P) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.w0.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            hVar.C = true;
            hVar.n.p(false);
            View view = Toolbar.this.a0;
            if (view instanceof ld) {
                ((ld) view).onActionViewExpanded();
            }
            return true;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e extends b1.a {
        public int b;

        public e() {
            this.b = 0;
            this.a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.b = 0;
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(e eVar) {
            super((b1.a) eVar);
            this.b = 0;
            this.b = eVar.b;
        }

        public e(b1.a aVar) {
            super(aVar);
            this.b = 0;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface f {
        boolean a();
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class g extends c0 {
        public static final Parcelable.Creator<g> CREATOR = new a();
        public int R;
        public boolean S;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.ClassLoaderCreator<g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.R = parcel.readInt();
            this.S = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // defpackage.c0, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.P, i);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ih0.toolbarStyle);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o0 = 8388627;
        this.v0 = new ArrayList<>();
        this.w0 = new ArrayList<>();
        this.x0 = new int[2];
        this.y0 = new a();
        this.D0 = new b();
        hx0 m = hx0.m(getContext(), attributeSet, lj0.Toolbar, i);
        this.d0 = m.i(lj0.Toolbar_titleTextAppearance, 0);
        this.e0 = m.i(lj0.Toolbar_subtitleTextAppearance, 0);
        this.o0 = m.b.getInteger(lj0.Toolbar_android_gravity, this.o0);
        this.f0 = m.b.getInteger(lj0.Toolbar_buttonGravity, 48);
        int c2 = m.c(lj0.Toolbar_titleMargin, 0);
        int i2 = lj0.Toolbar_titleMargins;
        c2 = m.l(i2) ? m.c(i2, c2) : c2;
        this.k0 = c2;
        this.j0 = c2;
        this.i0 = c2;
        this.h0 = c2;
        int c3 = m.c(lj0.Toolbar_titleMarginStart, -1);
        if (c3 >= 0) {
            this.h0 = c3;
        }
        int c4 = m.c(lj0.Toolbar_titleMarginEnd, -1);
        if (c4 >= 0) {
            this.i0 = c4;
        }
        int c5 = m.c(lj0.Toolbar_titleMarginTop, -1);
        if (c5 >= 0) {
            this.j0 = c5;
        }
        int c6 = m.c(lj0.Toolbar_titleMarginBottom, -1);
        if (c6 >= 0) {
            this.k0 = c6;
        }
        this.g0 = m.d(lj0.Toolbar_maxButtonHeight, -1);
        int c7 = m.c(lj0.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int c8 = m.c(lj0.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int d2 = m.d(lj0.Toolbar_contentInsetLeft, 0);
        int d3 = m.d(lj0.Toolbar_contentInsetRight, 0);
        if (this.l0 == null) {
            this.l0 = new pm0();
        }
        pm0 pm0Var = this.l0;
        pm0Var.h = false;
        if (d2 != Integer.MIN_VALUE) {
            pm0Var.e = d2;
            pm0Var.a = d2;
        }
        if (d3 != Integer.MIN_VALUE) {
            pm0Var.f = d3;
            pm0Var.b = d3;
        }
        if (c7 != Integer.MIN_VALUE || c8 != Integer.MIN_VALUE) {
            pm0Var.a(c7, c8);
        }
        this.m0 = m.c(lj0.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.n0 = m.c(lj0.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.U = m.e(lj0.Toolbar_collapseIcon);
        this.V = m.k(lj0.Toolbar_collapseContentDescription);
        CharSequence k = m.k(lj0.Toolbar_title);
        if (!TextUtils.isEmpty(k)) {
            setTitle(k);
        }
        CharSequence k2 = m.k(lj0.Toolbar_subtitle);
        if (!TextUtils.isEmpty(k2)) {
            setSubtitle(k2);
        }
        this.b0 = getContext();
        setPopupTheme(m.i(lj0.Toolbar_popupTheme, 0));
        Drawable e2 = m.e(lj0.Toolbar_navigationIcon);
        if (e2 != null) {
            setNavigationIcon(e2);
        }
        CharSequence k3 = m.k(lj0.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(k3)) {
            setNavigationContentDescription(k3);
        }
        Drawable e3 = m.e(lj0.Toolbar_logo);
        if (e3 != null) {
            setLogo(e3);
        }
        CharSequence k4 = m.k(lj0.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(k4)) {
            setLogoDescription(k4);
        }
        int i3 = lj0.Toolbar_titleTextColor;
        if (m.l(i3)) {
            setTitleTextColor(m.b(i3));
        }
        int i4 = lj0.Toolbar_subtitleTextColor;
        if (m.l(i4)) {
            setSubtitleTextColor(m.b(i4));
        }
        int i5 = lj0.Toolbar_menu;
        if (m.l(i5)) {
            getMenuInflater().inflate(m.i(i5, 0), getMenu());
        }
        m.n();
    }

    public static e g(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof b1.a ? new e((b1.a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new tu0(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getLayoutDirection() == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.b == 0 && p(childAt)) {
                    int i3 = eVar.a;
                    WeakHashMap<View, String> weakHashMap2 = a41.a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.b == 0 && p(childAt2)) {
                int i5 = eVar2.a;
                WeakHashMap<View, String> weakHashMap3 = a41.a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = new e();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = g(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.b = 1;
        if (z && this.a0 != null) {
            view.setLayoutParams(eVar);
            this.w0.add(view);
            return;
        }
        addView(view, eVar);
    }

    public final void c() {
        if (this.W == null) {
            q5 q5Var = new q5(getContext(), null, ih0.toolbarNavigationButtonStyle);
            this.W = q5Var;
            q5Var.setImageDrawable(this.U);
            this.W.setContentDescription(this.V);
            e eVar = new e();
            eVar.a = 8388611 | (this.f0 & 112);
            eVar.b = 2;
            this.W.setLayoutParams(eVar);
            this.W.setOnClickListener(new c());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.P;
        if (actionMenuView.h0 == null) {
            androidx.appcompat.view.menu.f fVar = (androidx.appcompat.view.menu.f) actionMenuView.getMenu();
            if (this.B0 == null) {
                this.B0 = new d();
            }
            this.P.setExpandedActionViewsExclusive(true);
            fVar.b(this.B0, this.b0);
        }
    }

    public final void e() {
        if (this.P == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.P = actionMenuView;
            actionMenuView.setPopupTheme(this.c0);
            this.P.setOnMenuItemClickListener(this.y0);
            ActionMenuView actionMenuView2 = this.P;
            actionMenuView2.m0 = null;
            actionMenuView2.n0 = null;
            e eVar = new e();
            eVar.a = 8388613 | (this.f0 & 112);
            this.P.setLayoutParams(eVar);
            b(this.P, false);
        }
    }

    public final void f() {
        if (this.S == null) {
            this.S = new q5(getContext(), null, ih0.toolbarNavigationButtonStyle);
            e eVar = new e();
            eVar.a = 8388611 | (this.f0 & 112);
            this.S.setLayoutParams(eVar);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        q5 q5Var = this.W;
        if (q5Var != null) {
            return q5Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        q5 q5Var = this.W;
        if (q5Var != null) {
            return q5Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        pm0 pm0Var = this.l0;
        if (pm0Var != null) {
            if (pm0Var.g) {
                return pm0Var.a;
            }
            return pm0Var.b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.n0;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        pm0 pm0Var = this.l0;
        if (pm0Var != null) {
            return pm0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        pm0 pm0Var = this.l0;
        if (pm0Var != null) {
            return pm0Var.b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        pm0 pm0Var = this.l0;
        if (pm0Var != null) {
            if (pm0Var.g) {
                return pm0Var.b;
            }
            return pm0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.m0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        androidx.appcompat.view.menu.f fVar;
        ActionMenuView actionMenuView = this.P;
        if (actionMenuView != null && (fVar = actionMenuView.h0) != null && fVar.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.n0, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.m0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        s5 s5Var = this.T;
        if (s5Var != null) {
            return s5Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        s5 s5Var = this.T;
        if (s5Var != null) {
            return s5Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.P.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        q5 q5Var = this.S;
        if (q5Var != null) {
            return q5Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        q5 q5Var = this.S;
        if (q5Var != null) {
            return q5Var.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.A0;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.P.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.b0;
    }

    public int getPopupTheme() {
        return this.c0;
    }

    public CharSequence getSubtitle() {
        return this.q0;
    }

    public final TextView getSubtitleTextView() {
        return this.R;
    }

    public CharSequence getTitle() {
        return this.p0;
    }

    public int getTitleMarginBottom() {
        return this.k0;
    }

    public int getTitleMarginEnd() {
        return this.i0;
    }

    public int getTitleMarginStart() {
        return this.h0;
    }

    public int getTitleMarginTop() {
        return this.j0;
    }

    public final TextView getTitleTextView() {
        return this.Q;
    }

    public yj getWrapper() {
        if (this.z0 == null) {
            this.z0 = new androidx.appcompat.widget.e(this);
        }
        return this.z0;
    }

    public final int h(View view, int i) {
        int i2;
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = eVar.a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.o0 & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public final boolean k(View view) {
        return view.getParent() == this || this.w0.contains(view);
    }

    public final int l(View view, int i, int i2, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int h = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h, max + measuredWidth, view.getMeasuredHeight() + h);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin + max;
    }

    public final int m(View view, int i, int i2, int[] iArr) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int h = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h, max, view.getMeasuredHeight() + h);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int n(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void o(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.D0);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.u0 = false;
        }
        if (!this.u0) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.u0 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.u0 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x028a A[LOOP:0: B:107:0x0288->B:108:0x028a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ac A[LOOP:1: B:110:0x02aa->B:111:0x02ac, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d1 A[LOOP:2: B:113:0x02cf->B:114:0x02d1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0323 A[LOOP:3: B:122:0x0321->B:123:0x0323, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        int i7;
        boolean p;
        boolean p2;
        int i8;
        int i9;
        int i10;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        boolean z3;
        int i11;
        int i12;
        int i13;
        int paddingTop;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int size;
        int i20;
        int i21;
        int size2;
        int i22;
        int size3;
        int i23;
        int i24;
        int size4;
        int i25;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (getLayoutDirection() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i26 = width - paddingRight;
        int[] iArr = this.x0;
        iArr[1] = 0;
        iArr[0] = 0;
        int minimumHeight = getMinimumHeight();
        if (minimumHeight >= 0) {
            i5 = Math.min(minimumHeight, i4 - i2);
        } else {
            i5 = 0;
        }
        if (p(this.S)) {
            q5 q5Var = this.S;
            if (z2) {
                i7 = m(q5Var, i26, i5, iArr);
                i6 = paddingLeft;
                if (p(this.W)) {
                    q5 q5Var2 = this.W;
                    if (z2) {
                        i7 = m(q5Var2, i7, i5, iArr);
                    } else {
                        i6 = l(q5Var2, i6, i5, iArr);
                    }
                }
                if (p(this.P)) {
                    ActionMenuView actionMenuView = this.P;
                    if (z2) {
                        i6 = l(actionMenuView, i6, i5, iArr);
                    } else {
                        i7 = m(actionMenuView, i7, i5, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - i6);
                iArr[1] = Math.max(0, currentContentInsetRight - (i26 - i7));
                int max = Math.max(i6, currentContentInsetLeft);
                int min = Math.min(i7, i26 - currentContentInsetRight);
                if (p(this.a0)) {
                    View view = this.a0;
                    if (z2) {
                        min = m(view, min, i5, iArr);
                    } else {
                        max = l(view, max, i5, iArr);
                    }
                }
                if (p(this.T)) {
                    s5 s5Var = this.T;
                    if (z2) {
                        min = m(s5Var, min, i5, iArr);
                    } else {
                        max = l(s5Var, max, i5, iArr);
                    }
                }
                p = p(this.Q);
                p2 = p(this.R);
                if (!p) {
                    e eVar = (e) this.Q.getLayoutParams();
                    i8 = paddingRight;
                    i9 = this.Q.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin + 0;
                } else {
                    i8 = paddingRight;
                    i9 = 0;
                }
                if (!p2) {
                    e eVar2 = (e) this.R.getLayoutParams();
                    i10 = width;
                    i9 += this.R.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin;
                } else {
                    i10 = width;
                }
                if (p && !p2) {
                    i12 = paddingLeft;
                    i13 = i5;
                } else {
                    if (!p) {
                        appCompatTextView = this.Q;
                    } else {
                        appCompatTextView = this.R;
                    }
                    if (!p2) {
                        appCompatTextView2 = this.R;
                    } else {
                        appCompatTextView2 = this.Q;
                    }
                    e eVar3 = (e) appCompatTextView.getLayoutParams();
                    e eVar4 = (e) appCompatTextView2.getLayoutParams();
                    if ((!p && this.Q.getMeasuredWidth() > 0) || (p2 && this.R.getMeasuredWidth() > 0)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    i11 = this.o0 & 112;
                    i12 = paddingLeft;
                    if (i11 == 48) {
                        if (i11 != 80) {
                            int i27 = (((height - paddingTop2) - paddingBottom) - i9) / 2;
                            i13 = i5;
                            int i28 = ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.j0;
                            if (i27 < i28) {
                                i27 = i28;
                            } else {
                                int i29 = (((height - paddingBottom) - i9) - i27) - paddingTop2;
                                int i30 = ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin;
                                int i31 = this.k0;
                                if (i29 < i30 + i31) {
                                    i27 = Math.max(0, i27 - ((((ViewGroup.MarginLayoutParams) eVar4).bottomMargin + i31) - i29));
                                }
                            }
                            paddingTop = paddingTop2 + i27;
                        } else {
                            i13 = i5;
                            paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin) - this.k0) - i9;
                        }
                    } else {
                        i13 = i5;
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.j0;
                    }
                    if (!z2) {
                        if (z3) {
                            i17 = this.h0;
                        } else {
                            i17 = 0;
                        }
                        int i32 = i17 - iArr[1];
                        min -= Math.max(0, i32);
                        iArr[1] = Math.max(0, -i32);
                        if (p) {
                            int measuredWidth = min - this.Q.getMeasuredWidth();
                            int measuredHeight = this.Q.getMeasuredHeight() + paddingTop;
                            this.Q.layout(measuredWidth, paddingTop, min, measuredHeight);
                            i18 = measuredWidth - this.i0;
                            paddingTop = measuredHeight + ((ViewGroup.MarginLayoutParams) ((e) this.Q.getLayoutParams())).bottomMargin;
                        } else {
                            i18 = min;
                        }
                        if (p2) {
                            int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.R.getLayoutParams())).topMargin;
                            this.R.layout(min - this.R.getMeasuredWidth(), i33, min, this.R.getMeasuredHeight() + i33);
                            i19 = min - this.i0;
                        } else {
                            i19 = min;
                        }
                        if (z3) {
                            min = Math.min(i18, i19);
                        }
                    } else {
                        if (z3) {
                            i14 = this.h0;
                        } else {
                            i14 = 0;
                        }
                        int i34 = i14 - iArr[0];
                        max += Math.max(0, i34);
                        iArr[0] = Math.max(0, -i34);
                        if (p) {
                            int measuredWidth2 = this.Q.getMeasuredWidth() + max;
                            int measuredHeight2 = this.Q.getMeasuredHeight() + paddingTop;
                            this.Q.layout(max, paddingTop, measuredWidth2, measuredHeight2);
                            i15 = measuredWidth2 + this.i0;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) ((e) this.Q.getLayoutParams())).bottomMargin;
                        } else {
                            i15 = max;
                        }
                        if (p2) {
                            int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.R.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.R.getMeasuredWidth() + max;
                            this.R.layout(max, i35, measuredWidth3, this.R.getMeasuredHeight() + i35);
                            i16 = measuredWidth3 + this.i0;
                        } else {
                            i16 = max;
                        }
                        if (z3) {
                            max = Math.max(i15, i16);
                        }
                    }
                }
                a(3, this.v0);
                size = this.v0.size();
                i20 = max;
                for (i21 = 0; i21 < size; i21++) {
                    i20 = l(this.v0.get(i21), i20, i13, iArr);
                }
                int i36 = i13;
                a(5, this.v0);
                size2 = this.v0.size();
                for (i22 = 0; i22 < size2; i22++) {
                    min = m(this.v0.get(i22), min, i36, iArr);
                }
                a(1, this.v0);
                ArrayList<View> arrayList = this.v0;
                int i37 = iArr[0];
                int i38 = iArr[1];
                size3 = arrayList.size();
                int i39 = i37;
                i23 = 0;
                int i40 = 0;
                while (i23 < size3) {
                    View view2 = arrayList.get(i23);
                    e eVar5 = (e) view2.getLayoutParams();
                    int i41 = ((ViewGroup.MarginLayoutParams) eVar5).leftMargin - i39;
                    int i42 = ((ViewGroup.MarginLayoutParams) eVar5).rightMargin - i38;
                    int max2 = Math.max(0, i41);
                    int max3 = Math.max(0, i42);
                    int max4 = Math.max(0, -i41);
                    int max5 = Math.max(0, -i42);
                    i40 += view2.getMeasuredWidth() + max2 + max3;
                    i23++;
                    i38 = max5;
                    i39 = max4;
                }
                i24 = ((((i10 - i12) - i8) / 2) + i12) - (i40 / 2);
                int i43 = i40 + i24;
                if (i24 >= i20) {
                    if (i43 > min) {
                        i20 = i24 - (i43 - min);
                    } else {
                        i20 = i24;
                    }
                }
                size4 = this.v0.size();
                int i44 = i20;
                for (i25 = 0; i25 < size4; i25++) {
                    i44 = l(this.v0.get(i25), i44, i36, iArr);
                }
                this.v0.clear();
            }
            i6 = l(q5Var, paddingLeft, i5, iArr);
        } else {
            i6 = paddingLeft;
        }
        i7 = i26;
        if (p(this.W)) {
        }
        if (p(this.P)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - i6);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i26 - i7));
        int max6 = Math.max(i6, currentContentInsetLeft2);
        int min2 = Math.min(i7, i26 - currentContentInsetRight2);
        if (p(this.a0)) {
        }
        if (p(this.T)) {
        }
        p = p(this.Q);
        p2 = p(this.R);
        if (!p) {
        }
        if (!p2) {
        }
        if (p) {
        }
        if (!p) {
        }
        if (!p2) {
        }
        e eVar32 = (e) appCompatTextView.getLayoutParams();
        e eVar42 = (e) appCompatTextView2.getLayoutParams();
        if (!p) {
        }
        z3 = false;
        i11 = this.o0 & 112;
        i12 = paddingLeft;
        if (i11 == 48) {
        }
        if (!z2) {
        }
        a(3, this.v0);
        size = this.v0.size();
        i20 = max6;
        while (i21 < size) {
        }
        int i362 = i13;
        a(5, this.v0);
        size2 = this.v0.size();
        while (i22 < size2) {
        }
        a(1, this.v0);
        ArrayList<View> arrayList2 = this.v0;
        int i372 = iArr[0];
        int i382 = iArr[1];
        size3 = arrayList2.size();
        int i392 = i372;
        i23 = 0;
        int i402 = 0;
        while (i23 < size3) {
        }
        i24 = ((((i10 - i12) - i8) / 2) + i12) - (i402 / 2);
        int i432 = i402 + i24;
        if (i24 >= i20) {
        }
        size4 = this.v0.size();
        int i442 = i20;
        while (i25 < size4) {
        }
        this.v0.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        int[] iArr = this.x0;
        boolean a2 = c51.a(this);
        int i10 = !a2 ? 1 : 0;
        int i11 = 0;
        if (p(this.S)) {
            o(this.S, i, 0, i2, this.g0);
            i3 = i(this.S) + this.S.getMeasuredWidth();
            i4 = Math.max(0, j(this.S) + this.S.getMeasuredHeight());
            i5 = View.combineMeasuredStates(0, this.S.getMeasuredState());
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (p(this.W)) {
            o(this.W, i, 0, i2, this.g0);
            i3 = i(this.W) + this.W.getMeasuredWidth();
            i4 = Math.max(i4, j(this.W) + this.W.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.W.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3) + 0;
        iArr[a2 ? 1 : 0] = Math.max(0, currentContentInsetStart - i3);
        if (p(this.P)) {
            o(this.P, i, max, i2, this.g0);
            i6 = i(this.P) + this.P.getMeasuredWidth();
            i4 = Math.max(i4, j(this.P) + this.P.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.P.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[i10] = Math.max(0, currentContentInsetEnd - i6);
        if (p(this.a0)) {
            max2 += n(this.a0, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, j(this.a0) + this.a0.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.a0.getMeasuredState());
        }
        if (p(this.T)) {
            max2 += n(this.T, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, j(this.T) + this.T.getMeasuredHeight());
            i5 = View.combineMeasuredStates(i5, this.T.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).b == 0 && p(childAt)) {
                max2 += n(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, j(childAt) + childAt.getMeasuredHeight());
                i5 = View.combineMeasuredStates(i5, childAt.getMeasuredState());
            }
        }
        int i13 = this.j0 + this.k0;
        int i14 = this.h0 + this.i0;
        if (p(this.Q)) {
            n(this.Q, i, max2 + i14, i2, i13, iArr);
            int i15 = i(this.Q) + this.Q.getMeasuredWidth();
            i9 = j(this.Q) + this.Q.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i5, this.Q.getMeasuredState());
            i8 = i15;
        } else {
            i7 = i5;
            i8 = 0;
            i9 = 0;
        }
        if (p(this.R)) {
            i8 = Math.max(i8, n(this.R, i, max2 + i14, i2, i9 + i13, iArr));
            i9 += j(this.R) + this.R.getMeasuredHeight();
            i7 = View.combineMeasuredStates(i7, this.R.getMeasuredState());
        }
        int max3 = Math.max(i4, i9);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i8, getSuggestedMinimumWidth()), i, (-16777216) & i7);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, i7 << 16);
        if (this.C0) {
            int childCount2 = getChildCount();
            for (int i16 = 0; i16 < childCount2; i16++) {
                View childAt2 = getChildAt(i16);
                if (!p(childAt2) || childAt2.getMeasuredWidth() <= 0 || childAt2.getMeasuredHeight() <= 0) {
                }
            }
            z = true;
            if (!z) {
                i11 = resolveSizeAndState2;
            }
            setMeasuredDimension(resolveSizeAndState, i11);
        }
        z = false;
        if (!z) {
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        androidx.appcompat.view.menu.f fVar;
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.P);
        ActionMenuView actionMenuView = this.P;
        if (actionMenuView != null) {
            fVar = actionMenuView.h0;
        } else {
            fVar = null;
        }
        int i = gVar.R;
        if (i != 0 && this.B0 != null && fVar != null && (findItem = fVar.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (gVar.S) {
            removeCallbacks(this.D0);
            post(this.D0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onRtlPropertiesChanged(int i) {
        int i2;
        super.onRtlPropertiesChanged(i);
        if (this.l0 == null) {
            this.l0 = new pm0();
        }
        pm0 pm0Var = this.l0;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != pm0Var.g) {
            pm0Var.g = z;
            if (pm0Var.h) {
                if (z) {
                    int i3 = pm0Var.d;
                    if (i3 == Integer.MIN_VALUE) {
                        i3 = pm0Var.e;
                    }
                    pm0Var.a = i3;
                    i2 = pm0Var.c;
                } else {
                    int i4 = pm0Var.c;
                    if (i4 == Integer.MIN_VALUE) {
                        i4 = pm0Var.e;
                    }
                    pm0Var.a = i4;
                    i2 = pm0Var.d;
                }
            } else {
                pm0Var.a = pm0Var.e;
            }
            i2 = pm0Var.f;
            pm0Var.b = i2;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        h hVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.B0;
        if (dVar != null && (hVar = dVar.Q) != null) {
            gVar.R = hVar.a;
        }
        ActionMenuView actionMenuView = this.P;
        boolean z2 = false;
        if (actionMenuView != null) {
            androidx.appcompat.widget.a aVar = actionMenuView.l0;
            if (aVar != null && aVar.g()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        gVar.S = z2;
        return gVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.t0 = false;
        }
        if (!this.t0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.t0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.t0 = false;
        }
        return true;
    }

    public final boolean p(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        q5 q5Var = this.W;
        if (q5Var != null) {
            q5Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(z5.b(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.W.setImageDrawable(drawable);
            return;
        }
        q5 q5Var = this.W;
        if (q5Var != null) {
            q5Var.setImageDrawable(this.U);
        }
    }

    public void setCollapsible(boolean z) {
        this.C0 = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.n0) {
            this.n0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = RecyclerView.UNDEFINED_DURATION;
        }
        if (i != this.m0) {
            this.m0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(z5.b(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.T == null) {
                this.T = new s5(getContext());
            }
            if (!k(this.T)) {
                b(this.T, true);
            }
        } else {
            s5 s5Var = this.T;
            if (s5Var != null && k(s5Var)) {
                removeView(this.T);
                this.w0.remove(this.T);
            }
        }
        s5 s5Var2 = this.T;
        if (s5Var2 != null) {
            s5Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.T == null) {
            this.T = new s5(getContext());
        }
        s5 s5Var = this.T;
        if (s5Var != null) {
            s5Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        q5 q5Var = this.S;
        if (q5Var != null) {
            q5Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(z5.b(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!k(this.S)) {
                b(this.S, true);
            }
        } else {
            q5 q5Var = this.S;
            if (q5Var != null && k(q5Var)) {
                removeView(this.S);
                this.w0.remove(this.S);
            }
        }
        q5 q5Var2 = this.S;
        if (q5Var2 != null) {
            q5Var2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.S.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.P.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.c0 != i) {
            this.c0 = i;
            if (i == 0) {
                this.b0 = getContext();
            } else {
                this.b0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.R == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.R = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.R.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.e0;
                if (i != 0) {
                    this.R.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.s0;
                if (colorStateList != null) {
                    this.R.setTextColor(colorStateList);
                }
            }
            if (!k(this.R)) {
                b(this.R, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.R;
            if (appCompatTextView2 != null && k(appCompatTextView2)) {
                removeView(this.R);
                this.w0.remove(this.R);
            }
        }
        AppCompatTextView appCompatTextView3 = this.R;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.q0 = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.s0 = colorStateList;
        AppCompatTextView appCompatTextView = this.R;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.Q == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.Q = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.Q.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.d0;
                if (i != 0) {
                    this.Q.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.r0;
                if (colorStateList != null) {
                    this.Q.setTextColor(colorStateList);
                }
            }
            if (!k(this.Q)) {
                b(this.Q, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.Q;
            if (appCompatTextView2 != null && k(appCompatTextView2)) {
                removeView(this.Q);
                this.w0.remove(this.Q);
            }
        }
        AppCompatTextView appCompatTextView3 = this.Q;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.p0 = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.k0 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.h0 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        AppCompatTextView appCompatTextView = this.Q;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}