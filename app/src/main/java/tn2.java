package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: tn2  reason: default package */
public final class tn2 extends yn2 {
    public String R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public final Object Z;
    public final y03 a0;
    public final Activity b0;
    public k23 c0;
    public ImageView d0;
    public LinearLayout e0;
    public final nj2 f0;
    public PopupWindow g0;
    public RelativeLayout h0;
    public ViewGroup i0;

    static {
        g7 g7Var = new g7(7);
        Collections.addAll(g7Var, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(g7Var);
    }

    public tn2(y03 y03Var, nj2 nj2Var) {
        super(y03Var, "resize");
        this.R = "top-right";
        this.S = true;
        this.T = 0;
        this.U = 0;
        this.V = -1;
        this.W = 0;
        this.X = 0;
        this.Y = -1;
        this.Z = new Object();
        this.a0 = y03Var;
        this.b0 = y03Var.g();
        this.f0 = nj2Var;
    }

    public final void g(boolean z) {
        synchronized (this.Z) {
            PopupWindow popupWindow = this.g0;
            if (popupWindow != null) {
                popupWindow.dismiss();
                this.h0.removeView((View) this.a0);
                ViewGroup viewGroup = this.i0;
                if (viewGroup != null) {
                    viewGroup.removeView(this.d0);
                    this.i0.addView((View) this.a0);
                    this.a0.A0(this.c0);
                }
                if (z) {
                    try {
                        ((y03) this.P).p("onStateChanged", new JSONObject().put("state", "default"));
                    } catch (JSONException e) {
                        sv2.e("Error occurred while dispatching state change.", e);
                    }
                    nj2 nj2Var = this.f0;
                    if (nj2Var != null) {
                        ((pq3) nj2Var.Q).c.R0(da2.R);
                    }
                }
                this.g0 = null;
                this.h0 = null;
                this.i0 = null;
                this.e0 = null;
            }
        }
    }
}