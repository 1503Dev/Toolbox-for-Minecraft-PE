package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import defpackage.b1;
import defpackage.f1;
import defpackage.f5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: k61  reason: default package */
public final class k61 extends b1 implements ActionBarOverlayLayout.d {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public yj e;
    public ActionBarContextView f;
    public View g;
    public boolean h;
    public d i;
    public d j;
    public f1.a k;
    public boolean l;
    public ArrayList<b1.b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public x41 t;
    public boolean u;
    public boolean v;
    public final a w;
    public final b x;
    public final c y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    /* renamed from: k61$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends vx {
        public a() {
        }

        @Override // defpackage.y41
        public final void a() {
            View view;
            k61 k61Var = k61.this;
            if (k61Var.p && (view = k61Var.g) != null) {
                view.setTranslationY(0.0f);
                k61.this.d.setTranslationY(0.0f);
            }
            k61.this.d.setVisibility(8);
            k61.this.d.setTransitioning(false);
            k61 k61Var2 = k61.this;
            k61Var2.t = null;
            f1.a aVar = k61Var2.k;
            if (aVar != null) {
                aVar.b(k61Var2.j);
                k61Var2.j = null;
                k61Var2.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = k61.this.c;
            if (actionBarOverlayLayout != null) {
                a41.m(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: k61$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends vx {
        public b() {
        }

        @Override // defpackage.y41
        public final void a() {
            k61 k61Var = k61.this;
            k61Var.t = null;
            k61Var.d.requestLayout();
        }
    }

    /* renamed from: k61$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements z41 {
        public c() {
        }
    }

    /* renamed from: k61$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends f1 implements f.a {
        public final Context R;
        public final f S;
        public f1.a T;
        public WeakReference<View> U;

        public d(Context context, f5.d dVar) {
            this.R = context;
            this.T = dVar;
            f fVar = new f(context);
            fVar.l = 1;
            this.S = fVar;
            fVar.e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            f1.a aVar = this.T;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            if (this.T == null) {
                return;
            }
            i();
            androidx.appcompat.widget.a aVar = k61.this.f.S;
            if (aVar != null) {
                aVar.l();
            }
        }

        @Override // defpackage.f1
        public final void c() {
            k61 k61Var = k61.this;
            if (k61Var.i != this) {
                return;
            }
            if (!(!k61Var.q)) {
                k61Var.j = this;
                k61Var.k = this.T;
            } else {
                this.T.b(this);
            }
            this.T = null;
            k61.this.a(false);
            ActionBarContextView actionBarContextView = k61.this.f;
            if (actionBarContextView.c0 == null) {
                actionBarContextView.removeAllViews();
                actionBarContextView.d0 = null;
                actionBarContextView.R = null;
            }
            k61.this.e.l().sendAccessibilityEvent(32);
            k61 k61Var2 = k61.this;
            k61Var2.c.setHideOnContentScrollEnabled(k61Var2.v);
            k61.this.i = null;
        }

        @Override // defpackage.f1
        public final View d() {
            WeakReference<View> weakReference = this.U;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.f1
        public final f e() {
            return this.S;
        }

        @Override // defpackage.f1
        public final MenuInflater f() {
            return new tu0(this.R);
        }

        @Override // defpackage.f1
        public final CharSequence g() {
            return k61.this.f.getSubtitle();
        }

        @Override // defpackage.f1
        public final CharSequence h() {
            return k61.this.f.getTitle();
        }

        @Override // defpackage.f1
        public final void i() {
            if (k61.this.i != this) {
                return;
            }
            this.S.w();
            try {
                this.T.c(this, this.S);
            } finally {
                this.S.v();
            }
        }

        @Override // defpackage.f1
        public final boolean j() {
            return k61.this.f.j0;
        }

        @Override // defpackage.f1
        public final void k(View view) {
            k61.this.f.setCustomView(view);
            this.U = new WeakReference<>(view);
        }

        @Override // defpackage.f1
        public final void l(int i) {
            m(k61.this.a.getResources().getString(i));
        }

        @Override // defpackage.f1
        public final void m(CharSequence charSequence) {
            k61.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.f1
        public final void n(int i) {
            o(k61.this.a.getResources().getString(i));
        }

        @Override // defpackage.f1
        public final void o(CharSequence charSequence) {
            k61.this.f.setTitle(charSequence);
        }

        @Override // defpackage.f1
        public final void p(boolean z) {
            this.Q = z;
            k61.this.f.setTitleOptional(z);
        }
    }

    public k61(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(16908290);
    }

    public k61(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        d(dialog.getWindow().getDecorView());
    }

    public final void a(boolean z2) {
        w41 i;
        w41 e;
        long j;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap<View, String> weakHashMap = a41.a;
        if (actionBarContainer.isLaidOut()) {
            if (z2) {
                e = this.e.i(100L, 4);
                i = this.f.e(200L, 0);
            } else {
                i = this.e.i(200L, 0);
                e = this.f.e(100L, 8);
            }
            x41 x41Var = new x41();
            x41Var.a.add(e);
            View view = e.a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = i.a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            x41Var.a.add(i);
            x41Var.b();
        } else if (z2) {
            this.e.j(4);
            this.f.setVisibility(0);
        } else {
            this.e.j(0);
            this.f.setVisibility(8);
        }
    }

    public final void b(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.m.get(i).a();
        }
    }

    public final Context c() {
        if (this.b == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(ih0.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.b = new ContextThemeWrapper(this.a, i);
            } else {
                this.b = this.a;
            }
        }
        return this.b;
    }

    public final void d(View view) {
        String str;
        yj wrapper;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(hi0.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(hi0.action_bar);
        if (findViewById instanceof yj) {
            wrapper = (yj) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder b2 = e5.b("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            b2.append(str);
            throw new IllegalStateException(b2.toString());
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(hi0.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(hi0.action_bar_container);
        this.d = actionBarContainer;
        yj yjVar = this.e;
        if (yjVar != null && this.f != null && actionBarContainer != null) {
            this.a = yjVar.getContext();
            if ((this.e.p() & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.h = true;
            }
            Context context = this.a;
            int i = context.getApplicationInfo().targetSdkVersion;
            this.e.k();
            f(context.getResources().getBoolean(kh0.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, lj0.ActionBar, ih0.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(lj0.ActionBar_hideOnContentScroll, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.W) {
                    this.v = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(lj0.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                float f = dimensionPixelSize;
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (Build.VERSION.SDK_INT >= 21) {
                    actionBarContainer2.setElevation(f);
                }
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(k61.class.getSimpleName() + " can only be used with a compatible window decor layout");
    }

    public final void e(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        int p = this.e.p();
        this.h = true;
        this.e.n((i & 4) | (p & (-5)));
    }

    public final void f(boolean z2) {
        this.n = z2;
        if (!z2) {
            this.e.o();
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            this.e.o();
        }
        this.e.r();
        yj yjVar = this.e;
        boolean z3 = this.n;
        yjVar.v(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        boolean z4 = this.n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void g(boolean z2) {
        boolean z3;
        View view;
        int[] iArr;
        View view2;
        View view3;
        int[] iArr2;
        boolean z4 = this.q;
        if (this.r || !z4) {
            z3 = true;
        } else {
            z3 = false;
        }
        v41 v41Var = null;
        if (z3) {
            if (!this.s) {
                this.s = true;
                x41 x41Var = this.t;
                if (x41Var != null) {
                    x41Var.a();
                }
                this.d.setVisibility(0);
                if (this.o == 0 && (this.u || z2)) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z2) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.d.setTranslationY(f);
                    x41 x41Var2 = new x41();
                    w41 a2 = a41.a(this.d);
                    a2.e(0.0f);
                    c cVar = this.y;
                    View view4 = a2.a.get();
                    if (view4 != null) {
                        if (cVar != null) {
                            v41Var = new v41(cVar, view4);
                        }
                        view4.animate().setUpdateListener(v41Var);
                    }
                    if (!x41Var2.e) {
                        x41Var2.a.add(a2);
                    }
                    if (this.p && (view3 = this.g) != null) {
                        view3.setTranslationY(f);
                        w41 a3 = a41.a(this.g);
                        a3.e(0.0f);
                        if (!x41Var2.e) {
                            x41Var2.a.add(a3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z5 = x41Var2.e;
                    if (!z5) {
                        x41Var2.c = decelerateInterpolator;
                    }
                    if (!z5) {
                        x41Var2.b = 250L;
                    }
                    b bVar = this.x;
                    if (!z5) {
                        x41Var2.d = bVar;
                    }
                    this.t = x41Var2;
                    x41Var2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.p && (view2 = this.g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.x.a();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    a41.m(actionBarOverlayLayout);
                }
            }
        } else if (this.s) {
            this.s = false;
            x41 x41Var3 = this.t;
            if (x41Var3 != null) {
                x41Var3.a();
            }
            if (this.o == 0 && (this.u || z2)) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                x41 x41Var4 = new x41();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                w41 a4 = a41.a(this.d);
                a4.e(f2);
                c cVar2 = this.y;
                View view5 = a4.a.get();
                if (view5 != null) {
                    if (cVar2 != null) {
                        v41Var = new v41(cVar2, view5);
                    }
                    view5.animate().setUpdateListener(v41Var);
                }
                if (!x41Var4.e) {
                    x41Var4.a.add(a4);
                }
                if (this.p && (view = this.g) != null) {
                    w41 a5 = a41.a(view);
                    a5.e(f2);
                    if (!x41Var4.e) {
                        x41Var4.a.add(a5);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = z;
                boolean z6 = x41Var4.e;
                if (!z6) {
                    x41Var4.c = accelerateInterpolator;
                }
                if (!z6) {
                    x41Var4.b = 250L;
                }
                a aVar = this.w;
                if (!z6) {
                    x41Var4.d = aVar;
                }
                this.t = x41Var4;
                x41Var4.b();
                return;
            }
            this.w.a();
        }
    }
}