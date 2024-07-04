package defpackage;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.util.Collections;

/* renamed from: so3  reason: default package */
public final class so3 extends ii2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, kc2 {
    public View P;
    public cs3 Q;
    public jl3 R;
    public boolean S;
    public boolean T;

    public so3(jl3 jl3Var, nl3 nl3Var) {
        View view;
        synchronized (nl3Var) {
            view = nl3Var.m;
        }
        this.P = view;
        this.Q = nl3Var.g();
        this.R = jl3Var;
        this.S = false;
        this.T = false;
        if (nl3Var.j() != null) {
            nl3Var.j().Q(this);
        }
    }

    public final void h() {
        View view;
        jl3 jl3Var = this.R;
        if (jl3Var == null || (view = this.P) == null) {
            return;
        }
        jl3Var.b(view, Collections.emptyMap(), Collections.emptyMap(), jl3.h(this.P));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        h();
    }

    public final void t4(hw hwVar, li2 li2Var) {
        String str;
        uf0.b("#008 Must be called on the main UI thread.");
        if (this.S) {
            sv2.d("Instream ad can not be shown after destroy().");
            try {
                li2Var.y(2);
                return;
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
                return;
            }
        }
        View view = this.P;
        if (view != null && this.Q != null) {
            if (this.T) {
                sv2.d("Instream ad should not be used again.");
                try {
                    li2Var.y(1);
                    return;
                } catch (RemoteException e2) {
                    sv2.i("#007 Could not call remote method.", e2);
                    return;
                }
            }
            this.T = true;
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.P);
                }
            }
            ((ViewGroup) va0.c0(hwVar)).addView(this.P, new ViewGroup.LayoutParams(-1, -1));
            gx2 gx2Var = jv5.A.z;
            hx2 hx2Var = new hx2(this.P, this);
            ViewTreeObserver f = hx2Var.f();
            if (f != null) {
                hx2Var.n(f);
            }
            ix2 ix2Var = new ix2(this.P, this);
            ViewTreeObserver f2 = ix2Var.f();
            if (f2 != null) {
                ix2Var.n(f2);
            }
            h();
            try {
                li2Var.e();
                return;
            } catch (RemoteException e3) {
                sv2.i("#007 Could not call remote method.", e3);
                return;
            }
        }
        if (view == null) {
            str = "can not get video view.";
        } else {
            str = "can not get video controller.";
        }
        sv2.d("Instream internal error: ".concat(str));
        try {
            li2Var.y(0);
        } catch (RemoteException e4) {
            sv2.i("#007 Could not call remote method.", e4);
        }
    }
}