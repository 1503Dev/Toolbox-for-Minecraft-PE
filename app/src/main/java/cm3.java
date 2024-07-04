package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* renamed from: cm3  reason: default package */
public final class cm3 {
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final f25 a;
    public final li4 b;
    public final tl3 c;
    public final nl3 d;
    public final qm3 e;
    public final xm3 f;
    public final Executor g;
    public final Executor h;
    public final nc2 i;
    public final ll3 j;

    public cm3(nl5 nl5Var, li4 li4Var, tl3 tl3Var, nl3 nl3Var, qm3 qm3Var, xm3 xm3Var, Executor executor, yw2 yw2Var, ll3 ll3Var) {
        this.a = nl5Var;
        this.b = li4Var;
        this.i = li4Var.i;
        this.c = tl3Var;
        this.d = nl3Var;
        this.e = qm3Var;
        this.f = xm3Var;
        this.g = executor;
        this.h = yw2Var;
        this.j = ll3Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(ym3 ym3Var) {
        if (ym3Var == null) {
            return;
        }
        Context context = ym3Var.e().getContext();
        if (gt2.g(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                sv2.b("Activity context is needed for policy validator.");
            } else if (this.f == null || ym3Var.f() == null) {
            } else {
                try {
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    windowManager.addView(this.f.a(ym3Var.f(), windowManager), gt2.a());
                } catch (j13 e) {
                    vz3.l("web view can not be obtained", e);
                }
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z) {
        View view;
        FrameLayout.LayoutParams layoutParams;
        if (z) {
            nl3 nl3Var = this.d;
            synchronized (nl3Var) {
                view = nl3Var.m;
            }
        } else {
            nl3 nl3Var2 = this.d;
            synchronized (nl3Var2) {
                view = nl3Var2.o;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        if (((Boolean) w82.d.c.a(x92.f3)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(view, layoutParams);
        return true;
    }
}