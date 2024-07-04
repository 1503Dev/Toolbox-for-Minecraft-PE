package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.a;
import defpackage.f5;

public final class e implements yj {
    public Toolbar a;
    public int b;
    public d c;
    public View d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public CharSequence i;
    public CharSequence j;
    public CharSequence k;
    public Window.Callback l;
    public boolean m;
    public a n;
    public int o;
    public Drawable p;

    public e(Toolbar toolbar) {
        boolean z;
        Drawable drawable;
        Toolbar toolbar2;
        int i = wi0.abc_action_bar_up_description;
        this.o = 0;
        this.a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        if (this.i != null) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        this.g = toolbar.getNavigationIcon();
        hx0 m = hx0.m(toolbar.getContext(), null, lj0.ActionBar, ih0.actionBarStyle);
        this.p = m.e(lj0.ActionBar_homeAsUpIndicator);
        CharSequence k = m.k(lj0.ActionBar_title);
        if (!TextUtils.isEmpty(k)) {
            this.h = true;
            this.i = k;
            if ((this.b & 8) != 0) {
                this.a.setTitle(k);
            }
        }
        CharSequence k2 = m.k(lj0.ActionBar_subtitle);
        if (!TextUtils.isEmpty(k2)) {
            this.j = k2;
            if ((this.b & 8) != 0) {
                this.a.setSubtitle(k2);
            }
        }
        Drawable e = m.e(lj0.ActionBar_logo);
        if (e != null) {
            this.f = e;
            x();
        }
        Drawable e2 = m.e(lj0.ActionBar_icon);
        if (e2 != null) {
            setIcon(e2);
        }
        if (this.g == null && (drawable = this.p) != null) {
            this.g = drawable;
            if ((this.b & 4) != 0) {
                toolbar2 = this.a;
            } else {
                toolbar2 = this.a;
                drawable = null;
            }
            toolbar2.setNavigationIcon(drawable);
        }
        n(m.h(lj0.ActionBar_displayOptions, 0));
        int i2 = m.i(lj0.ActionBar_customNavigationLayout, 0);
        if (i2 != 0) {
            s(LayoutInflater.from(this.a.getContext()).inflate(i2, (ViewGroup) this.a, false));
            n(this.b | 16);
        }
        int layoutDimension = m.b.getLayoutDimension(lj0.ActionBar_height, 0);
        if (layoutDimension > 0) {
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            layoutParams.height = layoutDimension;
            this.a.setLayoutParams(layoutParams);
        }
        int c = m.c(lj0.ActionBar_contentInsetStart, -1);
        int c2 = m.c(lj0.ActionBar_contentInsetEnd, -1);
        if (c >= 0 || c2 >= 0) {
            Toolbar toolbar3 = this.a;
            int max = Math.max(c, 0);
            int max2 = Math.max(c2, 0);
            if (toolbar3.l0 == null) {
                toolbar3.l0 = new pm0();
            }
            toolbar3.l0.a(max, max2);
        }
        int i3 = m.i(lj0.ActionBar_titleTextStyle, 0);
        if (i3 != 0) {
            Toolbar toolbar4 = this.a;
            Context context = toolbar4.getContext();
            toolbar4.d0 = i3;
            AppCompatTextView appCompatTextView = toolbar4.Q;
            if (appCompatTextView != null) {
                appCompatTextView.setTextAppearance(context, i3);
            }
        }
        int i4 = m.i(lj0.ActionBar_subtitleTextStyle, 0);
        if (i4 != 0) {
            Toolbar toolbar5 = this.a;
            Context context2 = toolbar5.getContext();
            toolbar5.e0 = i4;
            AppCompatTextView appCompatTextView2 = toolbar5.R;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(context2, i4);
            }
        }
        int i5 = m.i(lj0.ActionBar_popupTheme, 0);
        if (i5 != 0) {
            this.a.setPopupTheme(i5);
        }
        m.n();
        if (i != this.o) {
            this.o = i;
            if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
                int i6 = this.o;
                this.k = i6 != 0 ? getContext().getString(i6) : null;
                w();
            }
        }
        this.k = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener(new zx0(this));
    }

    @Override // defpackage.yj
    public final boolean a() {
        boolean z;
        ActionMenuView actionMenuView = this.a.P;
        if (actionMenuView == null) {
            return false;
        }
        a aVar = actionMenuView.l0;
        if (aVar != null && aVar.g()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yj
    public final void b(f fVar, f5.c cVar) {
        if (this.n == null) {
            this.n = new a(this.a.getContext());
        }
        a aVar = this.n;
        aVar.T = cVar;
        Toolbar toolbar = this.a;
        if (fVar != null || toolbar.P != null) {
            toolbar.e();
            f fVar2 = toolbar.P.h0;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.r(toolbar.A0);
                    fVar2.r(toolbar.B0);
                }
                if (toolbar.B0 == null) {
                    toolbar.B0 = new Toolbar.d();
                }
                aVar.f0 = true;
                if (fVar != null) {
                    fVar.b(aVar, toolbar.b0);
                    fVar.b(toolbar.B0, toolbar.b0);
                } else {
                    aVar.e(toolbar.b0, null);
                    toolbar.B0.e(toolbar.b0, null);
                    aVar.f();
                    toolbar.B0.f();
                }
                toolbar.P.setPopupTheme(toolbar.c0);
                toolbar.P.setPresenter(aVar);
                toolbar.A0 = aVar;
            }
        }
    }

    @Override // defpackage.yj
    public final void c() {
        this.m = true;
    }

    @Override // defpackage.yj
    public final void collapseActionView() {
        h hVar;
        Toolbar.d dVar = this.a.B0;
        if (dVar == null) {
            hVar = null;
        } else {
            hVar = dVar.Q;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0021 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.yj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d() {
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView = this.a.P;
        if (actionMenuView == null) {
            return false;
        }
        a aVar = actionMenuView.l0;
        if (aVar != null) {
            if (aVar.j0 == null && !aVar.g()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                z = true;
                if (z) {
                    return false;
                }
                return true;
            }
        }
        z = false;
        if (z) {
        }
    }

    @Override // defpackage.yj
    public final boolean e() {
        boolean z;
        ActionMenuView actionMenuView = this.a.P;
        if (actionMenuView == null) {
            return false;
        }
        a aVar = actionMenuView.l0;
        if (aVar != null && aVar.c()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yj
    public final boolean f() {
        boolean z;
        ActionMenuView actionMenuView = this.a.P;
        if (actionMenuView == null) {
            return false;
        }
        a aVar = actionMenuView.l0;
        if (aVar != null && aVar.l()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yj
    public final boolean g() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.P) != null && actionMenuView.k0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yj
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.yj
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.yj
    public final void h() {
        a aVar;
        ActionMenuView actionMenuView = this.a.P;
        if (actionMenuView != null && (aVar = actionMenuView.l0) != null) {
            aVar.c();
            a.C0003a c0003a = aVar.i0;
            if (c0003a != null && c0003a.b()) {
                c0003a.j.dismiss();
            }
        }
    }

    @Override // defpackage.yj
    public final w41 i(long j, int i) {
        w41 a = a41.a(this.a);
        a.a(i == 0 ? 1.0f : 0.0f);
        a.c(j);
        a.d(new ay0(this, i));
        return a;
    }

    @Override // defpackage.yj
    public final void j(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.yj
    public final void k() {
    }

    @Override // defpackage.yj
    public final Toolbar l() {
        return this.a;
    }

    @Override // defpackage.yj
    public final boolean m() {
        Toolbar.d dVar = this.a.B0;
        if (dVar != null && dVar.Q != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.yj
    public final void n(int i) {
        View view;
        Toolbar toolbar;
        Toolbar toolbar2;
        Drawable drawable;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            CharSequence charSequence = null;
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    w();
                }
                if ((this.b & 4) != 0) {
                    toolbar2 = this.a;
                    drawable = this.g;
                    if (drawable == null) {
                        drawable = this.p;
                    }
                } else {
                    toolbar2 = this.a;
                    drawable = null;
                }
                toolbar2.setNavigationIcon(drawable);
            }
            if ((i2 & 3) != 0) {
                x();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.setTitle(this.i);
                    toolbar = this.a;
                    charSequence = this.j;
                } else {
                    this.a.setTitle((CharSequence) null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.d) != null) {
                if ((i & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    @Override // defpackage.yj
    public final void o() {
        d dVar = this.c;
        if (dVar != null) {
            ViewParent parent = dVar.getParent();
            Toolbar toolbar = this.a;
            if (parent == toolbar) {
                toolbar.removeView(this.c);
            }
        }
        this.c = null;
    }

    @Override // defpackage.yj
    public final int p() {
        return this.b;
    }

    @Override // defpackage.yj
    public final void q(int i) {
        this.f = i != 0 ? z5.b(getContext(), i) : null;
        x();
    }

    @Override // defpackage.yj
    public final void r() {
    }

    @Override // defpackage.yj
    public final void s(View view) {
        View view2 = this.d;
        if (view2 != null && (this.b & 16) != 0) {
            this.a.removeView(view2);
        }
        this.d = view;
        if (view == null || (this.b & 16) == 0) {
            return;
        }
        this.a.addView(view);
    }

    @Override // defpackage.yj
    public final void setIcon(int i) {
        setIcon(i != 0 ? z5.b(getContext(), i) : null);
    }

    @Override // defpackage.yj
    public final void setIcon(Drawable drawable) {
        this.e = drawable;
        x();
    }

    @Override // defpackage.yj
    public final void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // defpackage.yj
    public final void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        this.i = charSequence;
        if ((this.b & 8) != 0) {
            this.a.setTitle(charSequence);
        }
    }

    @Override // defpackage.yj
    public final void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.yj
    public final void u() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.yj
    public final void v(boolean z) {
        this.a.setCollapsible(z);
    }

    public final void w() {
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.a.setNavigationContentDescription(this.o);
            } else {
                this.a.setNavigationContentDescription(this.k);
            }
        }
    }

    public final void x() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f) == null) {
            drawable = this.e;
        }
        this.a.setLogo(drawable);
    }
}