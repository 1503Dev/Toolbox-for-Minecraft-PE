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

public final class n extends x50 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public final Context Q;
    public final f R;
    public final e S;
    public final int T;
    public final int U;
    public final int V;
    public final b60 W;
    public PopupWindow.OnDismissListener Z;
    public View a0;
    public View b0;
    public k.a c0;
    public ViewTreeObserver d0;
    public boolean e0;
    public boolean f0;
    public int g0;
    public boolean i0;
    public final a X = new a();
    public final b Y = new b();
    public int h0 = 0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (n.this.c()) {
                n nVar = n.this;
                if (!nVar.W.m0) {
                    View view = nVar.b0;
                    if (view != null && view.isShown()) {
                        n.this.W.a();
                    } else {
                        n.this.dismiss();
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
            ViewTreeObserver viewTreeObserver = n.this.d0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    n.this.d0 = view.getViewTreeObserver();
                }
                n nVar = n.this;
                nVar.d0.removeGlobalOnLayoutListener(nVar.X);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public n(int i, int i2, Context context, View view, f fVar) {
        this.Q = context;
        this.R = fVar;
        this.S = new e(fVar, LayoutInflater.from(context), false, 2131492883);
        this.U = i;
        this.V = i2;
        Resources resources = context.getResources();
        this.T = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(2131165207));
        this.a0 = view;
        this.W = new b60(context, i, i2);
        fVar.b(this, context);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
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
            if (!this.e0 && (view = this.a0) != null) {
                this.b0 = view;
                this.W.n0.setOnDismissListener(this);
                b60 b60Var = this.W;
                b60Var.e0 = this;
                b60Var.s(true);
                View view2 = this.b0;
                if (this.d0 == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                this.d0 = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.X);
                }
                view2.addOnAttachStateChangeListener(this.Y);
                b60 b60Var2 = this.W;
                b60Var2.d0 = view2;
                b60Var2.a0 = this.h0;
                if (!this.f0) {
                    this.g0 = x50.m(this.S, this.Q, this.T);
                    this.f0 = true;
                }
                this.W.r(this.g0);
                this.W.n0.setInputMethodMode(2);
                b60 b60Var3 = this.W;
                Rect rect2 = this.P;
                if (rect2 != null) {
                    b60Var3.getClass();
                    rect = new Rect(rect2);
                } else {
                    rect = null;
                }
                b60Var3.l0 = rect;
                this.W.s(false);
                this.W.a();
                View view3 = this.W.R;
                while (view3.getParent() instanceof View) {
                    view3 = (View) view3.getParent();
                }
                view3.setSystemUiVisibility(5894);
                this.W.s(true);
                this.W.n0.update();
                wm wmVar = this.W.R;
                wmVar.setOnKeyListener(this);
                if (this.i0 && this.R.m != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.Q).inflate(2131492882, (ViewGroup) wmVar, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.R.m);
                    }
                    frameLayout.setEnabled(false);
                    wmVar.addHeaderView(frameLayout, null, false);
                }
                this.W.p(this.S);
                this.W.a();
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
        k.a aVar = this.c0;
        if (aVar != null) {
            aVar.b(fVar, z);
        }
    }

    @Override // defpackage.bs0
    public final boolean c() {
        return !this.e0 && this.W.c();
    }

    @Override // defpackage.bs0
    public final void dismiss() {
        if (c()) {
            this.W.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f() {
        this.f0 = false;
        e eVar = this.S;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.bs0
    public final wm g() {
        return this.W.R;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    @Override // androidx.appcompat.view.menu.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(o oVar) {
        boolean z;
        if (oVar.hasVisibleItems()) {
            i iVar = new i(this.U, this.V, this.Q, this.b0, oVar, false);
            k.a aVar = this.c0;
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
            iVar.k = this.Z;
            this.Z = null;
            this.R.c(false);
            b60 b60Var = this.W;
            int i = b60Var.U;
            int n = b60Var.n();
            int i2 = this.h0;
            View view = this.a0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if ((Gravity.getAbsoluteGravity(i2, view.getLayoutDirection()) & 7) == 5) {
                i += this.a0.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.f == null) {
                    z = false;
                    if (z) {
                        k.a aVar2 = this.c0;
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
        this.c0 = aVar;
    }

    @Override // defpackage.x50
    public final void l(f fVar) {
    }

    @Override // defpackage.x50
    public final void n(View view) {
        this.a0 = view;
    }

    @Override // defpackage.x50
    public final void o(boolean z) {
        this.S.R = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.e0 = true;
        this.R.c(true);
        ViewTreeObserver viewTreeObserver = this.d0;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d0 = this.b0.getViewTreeObserver();
            }
            this.d0.removeGlobalOnLayoutListener(this.X);
            this.d0 = null;
        }
        this.b0.removeOnAttachStateChangeListener(this.Y);
        PopupWindow.OnDismissListener onDismissListener = this.Z;
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
        this.h0 = i;
    }

    @Override // defpackage.x50
    public final void q(int i) {
        this.W.U = i;
    }

    @Override // defpackage.x50
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.Z = onDismissListener;
    }

    @Override // defpackage.x50
    public final void s(boolean z) {
        this.i0 = z;
    }

    @Override // defpackage.x50
    public final void t(int i) {
        this.W.j(i);
    }
}