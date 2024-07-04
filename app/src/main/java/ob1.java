package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ob1  reason: default package */
public final class ob1 extends FrameLayout {
    public HashMap<Integer, v91> P;
    public HashMap<Integer, yf1> Q;
    public HashMap<Integer, ka1> R;
    public HashMap<Integer, gf1> S;
    public HashMap<Integer, o91> T;
    public HashMap<Integer, Boolean> U;
    public HashMap<Integer, View> V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public String d0;
    public boolean e0;
    public boolean f0;
    public float g0;
    public double h0;
    public int i0;
    public int j0;
    public ArrayList<zc1> k0;
    public ArrayList<String> l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public z61 p0;
    public Context q0;
    public VideoView r0;

    public ob1(Context context, String str) {
        super(context);
        this.g0 = 0.0f;
        this.h0 = 0.0d;
        this.i0 = 0;
        this.j0 = 0;
        this.q0 = context;
        this.d0 = str;
        setBackgroundColor(-16777216);
    }

    public final void a(View view, js jsVar) {
        z61 z61Var = this.p0;
        if (z61Var == null || view == null) {
            return;
        }
        try {
            z61Var.m(view, jsVar);
        } catch (RuntimeException unused) {
        }
    }

    public final boolean b(rc1 rc1Var) {
        ic1 ic1Var = rc1Var.b;
        if (ic1Var.l("container_id") == this.b0 && ic1Var.q("ad_session_id").equals(this.d0)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rc1 rc1Var;
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        ad1 h = ga1.h();
        pb1 k = h.k();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ic1 ic1Var = new ic1();
        eb1.l(-1, ic1Var, "view_id");
        eb1.j(ic1Var, "ad_session_id", this.d0);
        eb1.l(x, ic1Var, "container_x");
        eb1.l(y, ic1Var, "container_y");
        eb1.l(x, ic1Var, "view_x");
        eb1.l(y, ic1Var, "view_y");
        eb1.l(this.b0, ic1Var, "id");
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                eb1.l((int) motionEvent.getX(action2), ic1Var, "container_x");
                                eb1.l((int) motionEvent.getY(action2), ic1Var, "container_y");
                                eb1.l((int) motionEvent.getX(action2), ic1Var, "view_x");
                                eb1.l((int) motionEvent.getY(action2), ic1Var, "view_y");
                                eb1.l((int) motionEvent.getX(action2), ic1Var, "x");
                                eb1.l((int) motionEvent.getY(action2), ic1Var, "y");
                                if (!this.m0) {
                                    h.n = k.f.get(this.d0);
                                }
                                rc1Var = new rc1(this.c0, ic1Var, "AdContainer.on_touch_ended");
                            }
                            return true;
                        }
                        int action3 = (motionEvent.getAction() & 65280) >> 8;
                        eb1.l((int) motionEvent.getX(action3), ic1Var, "container_x");
                        eb1.l((int) motionEvent.getY(action3), ic1Var, "container_y");
                        eb1.l((int) motionEvent.getX(action3), ic1Var, "view_x");
                        eb1.l((int) motionEvent.getY(action3), ic1Var, "view_y");
                        rc1Var = new rc1(this.c0, ic1Var, "AdContainer.on_touch_began");
                    } else {
                        rc1Var = new rc1(this.c0, ic1Var, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    rc1Var = new rc1(this.c0, ic1Var, "AdContainer.on_touch_moved");
                }
            } else {
                if (!this.m0) {
                    h.n = k.f.get(this.d0);
                }
                rc1Var = new rc1(this.c0, ic1Var, "AdContainer.on_touch_ended");
            }
        } else {
            rc1Var = new rc1(this.c0, ic1Var, "AdContainer.on_touch_began");
        }
        rc1Var.b();
        return true;
    }
}