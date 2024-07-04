package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.Button;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: yf1  reason: default package */
public final class yf1 extends Button {
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public String c0;
    public String d0;
    public String e0;
    public String f0;
    public ob1 g0;
    public rc1 h0;

    public yf1(Context context, rc1 rc1Var, int i, ob1 ob1Var) {
        super(context);
        this.P = i;
        this.h0 = rc1Var;
        this.g0 = ob1Var;
    }

    public yf1(Context context, rc1 rc1Var, int i, ob1 ob1Var, int i2) {
        super(context, null, 16974145);
        this.P = i;
        this.h0 = rc1Var;
        this.g0 = ob1Var;
    }

    public static int a(int i, boolean z) {
        if (i == 0) {
            return z ? 1 : 16;
        } else if (i == 1) {
            return z ? 8388611 : 48;
        } else if (i != 2) {
            return 17;
        } else {
            return z ? 8388613 : 80;
        }
    }

    public final boolean b(rc1 rc1Var) {
        ic1 ic1Var = rc1Var.b;
        if (ic1Var.l("id") == this.P && ic1Var.l("container_id") == this.g0.b0 && ic1Var.q("ad_session_id").equals(this.g0.d0)) {
            return true;
        }
        return false;
    }

    @Override // android.widget.TextView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rc1 rc1Var;
        ad1 h = ga1.h();
        pb1 k = h.k();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        ic1 ic1Var = new ic1();
        eb1.l(this.P, ic1Var, "view_id");
        eb1.j(ic1Var, "ad_session_id", this.f0);
        eb1.l(this.Q + x, ic1Var, "container_x");
        eb1.l(this.R + y, ic1Var, "container_y");
        eb1.l(x, ic1Var, "view_x");
        eb1.l(y, ic1Var, "view_y");
        eb1.l(this.g0.getId(), ic1Var, "id");
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                int action2 = (motionEvent.getAction() & 65280) >> 8;
                                int x2 = (int) motionEvent.getX(action2);
                                int y2 = (int) motionEvent.getY(action2);
                                eb1.l(((int) motionEvent.getX(action2)) + this.Q, ic1Var, "container_x");
                                eb1.l(((int) motionEvent.getY(action2)) + this.R, ic1Var, "container_y");
                                eb1.l((int) motionEvent.getX(action2), ic1Var, "view_x");
                                eb1.l((int) motionEvent.getY(action2), ic1Var, "view_y");
                                if (!this.g0.m0) {
                                    h.n = k.f.get(this.f0);
                                }
                                if (x2 > 0 && x2 < getWidth() && y2 > 0 && y2 < getHeight()) {
                                    rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_ended");
                                } else {
                                    rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_cancelled");
                                }
                            } else {
                                return true;
                            }
                        } else {
                            int action3 = (motionEvent.getAction() & 65280) >> 8;
                            eb1.l(((int) motionEvent.getX(action3)) + this.Q, ic1Var, "container_x");
                            eb1.l(((int) motionEvent.getY(action3)) + this.R, ic1Var, "container_y");
                            eb1.l((int) motionEvent.getX(action3), ic1Var, "view_x");
                            eb1.l((int) motionEvent.getY(action3), ic1Var, "view_y");
                            rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_began");
                        }
                    } else {
                        rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_moved");
                }
            } else {
                if (!this.g0.m0) {
                    h.n = k.f.get(this.f0);
                }
                if (x > 0 && x < getWidth() && y > 0 && y < getHeight()) {
                    rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_ended");
                } else {
                    rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_cancelled");
                }
            }
        } else {
            rc1Var = new rc1(this.g0.c0, ic1Var, "AdContainer.on_touch_began");
        }
        rc1Var.b();
        return true;
    }
}