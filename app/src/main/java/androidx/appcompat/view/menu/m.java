package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import java.util.WeakHashMap;

public final class m extends x50 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public static final int k0 = ni0.abc_popup_menu_item_layout;
    public final Context Q;
    public final f R;
    public final e S;
    public final boolean T;
    public final int U;
    public final int V;
    public final int W;
    public final b60 X;
    public PopupWindow.OnDismissListener a0;
    public View b0;
    public View c0;
    public k.a d0;
    public ViewTreeObserver e0;
    public boolean f0;
    public boolean g0;
    public int h0;
    public boolean j0;
    public final a Y = new a();
    public final b Z = new b();
    public int i0 = 0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (m.this.c()) {
                m mVar = m.this;
                if (!mVar.X.m0) {
                    View view = mVar.c0;
                    if (view != null && view.isShown()) {
                        m.this.X.a();
                    } else {
                        m.this.dismiss();
                    }
                }
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = m.this.e0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    m.this.e0 = view.getViewTreeObserver();
                }
                m mVar = m.this;
                mVar.e0.removeGlobalOnLayoutListener(mVar.Y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public m(int i, int i2, Context context, View view, f fVar, boolean z) {
        this.Q = context;
        this.R = fVar;
        this.T = z;
        this.S = new e(fVar, LayoutInflater.from(context), z, k0);
        this.V = i;
        this.W = i2;
        Resources resources = context.getResources();
        this.U = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(sh0.abc_config_prefDialogWidth));
        this.b0 = view;
        this.X = new b60(context, i, i2);
        fVar.b(this, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    @Override // defpackage.bs0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        View view;
        boolean z;
        Rect rect;
        boolean z2 = false;
        if (!c()) {
            if (!this.f0 && (view = this.b0) != null) {
                this.c0 = view;
                this.X.n0.setOnDismissListener(this);
                b60 b60Var = this.X;
                b60Var.e0 = this;
                b60Var.s(true);
                View view2 = this.c0;
                if (this.e0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.e0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.Y);
                }
                view2.addOnAttachStateChangeListener(this.Z);
                b60 b60Var2 = this.X;
                b60Var2.d0 = view2;
                b60Var2.a0 = this.i0;
                if (!this.g0) {
                    this.h0 = x50.m(this.S, this.Q, this.U);
                    this.g0 = true;
                }
                this.X.r(this.h0);
                this.X.n0.setInputMethodMode(2);
                b60 b60Var3 = this.X;
                Rect rect2 = this.P;
                if (rect2 != null) {
                    b60Var3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                b60Var3.l0 = rect;
                this.X.a();
                wm wmVar = this.X.R;
                wmVar.setOnKeyListener(this);
                if (this.j0 && this.R.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.Q).inflate(ni0.abc_popup_menu_header_item_layout, (ViewGroup) wmVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.R.m);
                    }
                    frameLayout.setEnabled(false);
                    wmVar.addHeaderView(frameLayout, null, false);
                }
                this.X.p(this.S);
                this.X.a();
            }
            if (!z2) {
                return;
            }
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar, boolean z) {
        if (fVar != this.R) {
            return;
        }
        dismiss();
        k.a aVar = this.d0;
        if (aVar != null) {
            aVar.b(fVar, z);
        }
    }

    @Override // defpackage.bs0
    public final boolean c() {
        return !this.f0 && this.X.c();
    }

    @Override // defpackage.bs0
    public final void dismiss() {
        if (c()) {
            this.X.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f() {
        this.g0 = false;
        e eVar = this.S;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.bs0
    public final wm g() {
        return this.X.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    @Override // androidx.appcompat.view.menu.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(o oVar) {
        boolean z;
        if (oVar.hasVisibleItems()) {
            i iVar = new i(this.V, this.W, this.Q, this.c0, oVar, this.T);
            k.a aVar = this.d0;
            iVar.i = aVar;
            x50 x50Var = iVar.j;
            if (x50Var != null) {
                x50Var.j(aVar);
            }
            boolean u = x50.u(oVar);
            iVar.h = u;
            x50 x50Var2 = iVar.j;
            if (x50Var2 != null) {
                x50Var2.o(u);
            }
            iVar.k = this.a0;
            this.a0 = null;
            this.R.c(false);
            b60 b60Var = this.X;
            int i = b60Var.U;
            int n = b60Var.n();
            int i2 = this.i0;
            View view = this.b0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                i += this.b0.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f == null) {
                    z = false;
                    if (z) {
                        k.a aVar2 = this.d0;
                        if (aVar2 != null) {
                            aVar2.c(oVar);
                        }
                        return true;
                    }
                } else {
                    iVar.d(i, n, true, true);
                }
            }
            z = true;
            if (z) {
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void j(k.a aVar) {
        this.d0 = aVar;
    }

    @Override // defpackage.x50
    public final void l(f fVar) {
    }

    @Override // defpackage.x50
    public final void n(View view) {
        this.b0 = view;
    }

    @Override // defpackage.x50
    public final void o(boolean z) {
        this.S.R = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f0 = true;
        this.R.c(true);
        ViewTreeObserver viewTreeObserver = this.e0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.e0 = this.c0.getViewTreeObserver();
            }
            this.e0.removeGlobalOnLayoutListener(this.Y);
            this.e0 = null;
        }
        this.c0.removeOnAttachStateChangeListener(this.Z);
        PopupWindow.OnDismissListener onDismissListener = this.a0;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.x50
    public final void p(int i) {
        this.i0 = i;
    }

    @Override // defpackage.x50
    public final void q(int i) {
        this.X.U = i;
    }

    @Override // defpackage.x50
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.a0 = onDismissListener;
    }

    @Override // defpackage.x50
    public final void s(boolean z) {
        this.j0 = z;
    }

    @Override // defpackage.x50
    public final void t(int i) {
        this.X.j(i);
    }
}