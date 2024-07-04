package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* renamed from: zl3  reason: default package */
public final class zl3 extends id2 implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, ym3 {
    public final WeakReference P;
    public final HashMap Q = new HashMap();
    public final HashMap R = new HashMap();
    public final HashMap S = new HashMap();
    public jl3 T;
    public t22 U;

    public zl3(View view, HashMap hashMap, HashMap hashMap2) {
        view.setOnTouchListener(this);
        view.setOnClickListener(this);
        gx2 gx2Var = jv5.A.z;
        hx2 hx2Var = new hx2(view, this);
        ViewTreeObserver f = hx2Var.f();
        if (f != null) {
            hx2Var.n(f);
        }
        ix2 ix2Var = new ix2(view, this);
        ViewTreeObserver f2 = ix2Var.f();
        if (f2 != null) {
            ix2Var.n(f2);
        }
        this.P = new WeakReference(view);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            View view2 = (View) entry.getValue();
            if (view2 != null) {
                this.Q.put(str, new WeakReference(view2));
                if (!"1098".equals(str) && !"3011".equals(str)) {
                    view2.setOnTouchListener(this);
                    view2.setClickable(true);
                    view2.setOnClickListener(this);
                }
            }
        }
        this.S.putAll(this.Q);
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            View view3 = (View) entry2.getValue();
            if (view3 != null) {
                this.R.put((String) entry2.getKey(), new WeakReference(view3));
                view3.setOnTouchListener(this);
                view3.setClickable(false);
            }
        }
        this.S.putAll(this.R);
        this.U = new t22(view.getContext(), view);
    }

    @Override // defpackage.ym3
    public final synchronized View b2(String str) {
        WeakReference weakReference = (WeakReference) this.S.get(str);
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }

    @Override // defpackage.ym3
    public final synchronized void c0(String str, View view) {
        this.S.put(str, new WeakReference(view));
        if (!"1098".equals(str) && !"3011".equals(str)) {
            this.Q.put(str, new WeakReference(view));
            view.setClickable(true);
            view.setOnClickListener(this);
            view.setOnTouchListener(this);
        }
    }

    @Override // defpackage.ym3
    public final View e() {
        return (View) this.P.get();
    }

    @Override // defpackage.ym3
    public final FrameLayout f() {
        return null;
    }

    @Override // defpackage.ym3
    public final t22 g() {
        return this.U;
    }

    @Override // defpackage.ym3
    public final synchronized hw j() {
        return null;
    }

    @Override // defpackage.ym3
    public final synchronized Map k() {
        return this.R;
    }

    @Override // defpackage.ym3
    public final synchronized String l() {
        return "1007";
    }

    @Override // defpackage.ym3
    public final synchronized JSONObject m() {
        JSONObject s;
        jl3 jl3Var = this.T;
        if (jl3Var != null) {
            View e = e();
            Map n = n();
            Map o = o();
            synchronized (jl3Var) {
                s = jl3Var.k.s(e, n, o, jl3Var.k());
            }
            return s;
        }
        return null;
    }

    @Override // defpackage.ym3
    public final synchronized Map n() {
        return this.S;
    }

    @Override // defpackage.ym3
    public final synchronized Map o() {
        return this.Q;
    }

    @Override // android.view.View.OnClickListener
    public final synchronized void onClick(View view) {
        jl3 jl3Var = this.T;
        if (jl3Var != null) {
            jl3Var.c(view, e(), n(), o(), true);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final synchronized void onGlobalLayout() {
        jl3 jl3Var = this.T;
        if (jl3Var != null) {
            jl3Var.b(e(), n(), o(), jl3.h(e()));
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final synchronized void onScrollChanged() {
        jl3 jl3Var = this.T;
        if (jl3Var != null) {
            jl3Var.b(e(), n(), o(), jl3.h(e()));
        }
    }

    @Override // android.view.View.OnTouchListener
    public final synchronized boolean onTouch(View view, MotionEvent motionEvent) {
        jl3 jl3Var = this.T;
        if (jl3Var != null) {
            View e = e();
            synchronized (jl3Var) {
                jl3Var.k.o(motionEvent, e);
            }
        }
        return false;
    }

    @Override // defpackage.ym3
    public final synchronized JSONObject t() {
        return null;
    }
}