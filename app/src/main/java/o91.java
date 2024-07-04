package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.widget.ImageView;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: o91  reason: default package */
public final class o91 extends ImageView {
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public String a0;
    public String b0;
    public rc1 c0;
    public ob1 d0;

    public o91(Context context, rc1 rc1Var, int i, ob1 ob1Var) {
        super(context);
        this.P = i;
        this.c0 = rc1Var;
        this.d0 = ob1Var;
    }

    public static boolean a(o91 o91Var, rc1 rc1Var) {
        o91Var.getClass();
        ic1 ic1Var = rc1Var.b;
        if (ic1Var.l("id") == o91Var.P && ic1Var.l("container_id") == o91Var.d0.b0 && ic1Var.q("ad_session_id").equals(o91Var.d0.d0)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
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
        eb1.j(ic1Var, "ad_session_id", this.b0);
        eb1.l(this.Q + x, ic1Var, "container_x");
        eb1.l(this.R + y, ic1Var, "container_y");
        eb1.l(x, ic1Var, "view_x");
        eb1.l(y, ic1Var, "view_y");
        eb1.l(this.d0.getId(), ic1Var, "id");
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
                                if (!this.d0.m0) {
                                    h.n = k.f.get(this.b0);
                                }
                                if (x2 > 0 && x2 < this.S && y2 > 0 && y2 < this.T) {
                                    rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_ended");
                                } else {
                                    rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_cancelled");
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
                            rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_began");
                        }
                    } else {
                        rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_cancelled");
                    }
                } else {
                    rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_moved");
                }
            } else {
                if (!this.d0.m0) {
                    h.n = k.f.get(this.b0);
                }
                if (x > 0 && x < this.S && y > 0 && y < this.T) {
                    rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_ended");
                } else {
                    rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_cancelled");
                }
            }
        } else {
            rc1Var = new rc1(this.d0.c0, ic1Var, "AdContainer.on_touch_began");
        }
        rc1Var.b();
        return true;
    }
}