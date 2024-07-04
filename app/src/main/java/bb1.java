package defpackage;

import android.net.Uri;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;

/* renamed from: bb1  reason: default package */
public final class bb1 implements zc1 {
    public final /* synthetic */ ob1 a;

    public bb1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        FrameLayout.LayoutParams layoutParams;
        int i;
        if (this.a.b(rc1Var)) {
            ob1 ob1Var = this.a;
            ob1Var.getClass();
            int l = rc1Var.b.l("id");
            o91 o91Var = new o91(ob1Var.q0, rc1Var, l, ob1Var);
            ic1 ic1Var = o91Var.c0.b;
            o91Var.b0 = ic1Var.q("ad_session_id");
            o91Var.Q = ic1Var.l("x");
            o91Var.R = ic1Var.l("y");
            o91Var.S = ic1Var.l("width");
            o91Var.T = ic1Var.l("height");
            o91Var.a0 = ic1Var.q("filepath");
            o91Var.U = ic1Var.j("dpi");
            o91Var.V = ic1Var.j("invert_y");
            o91Var.W = ic1Var.j("wrap_content");
            o91Var.setImageURI(Uri.fromFile(new File(o91Var.a0)));
            if (o91Var.U) {
                ga1.h().l().getClass();
                float f = (o91Var.T * he1.f()) / o91Var.getDrawable().getIntrinsicHeight();
                o91Var.T = (int) (o91Var.getDrawable().getIntrinsicHeight() * f);
                int intrinsicWidth = (int) (o91Var.getDrawable().getIntrinsicWidth() * f);
                o91Var.S = intrinsicWidth;
                o91Var.Q -= intrinsicWidth;
                if (o91Var.V) {
                    i = o91Var.R + o91Var.T;
                } else {
                    i = o91Var.R - o91Var.T;
                }
                o91Var.R = i;
            }
            o91Var.setVisibility(4);
            if (o91Var.W) {
                layoutParams = new FrameLayout.LayoutParams(-2, -2);
            } else {
                layoutParams = new FrameLayout.LayoutParams(o91Var.S, o91Var.T);
            }
            layoutParams.setMargins(o91Var.Q, o91Var.R, 0, 0);
            layoutParams.gravity = 0;
            o91Var.d0.addView(o91Var, layoutParams);
            ArrayList<zc1> arrayList = o91Var.d0.k0;
            l91 l91Var = new l91(o91Var);
            ga1.g("ImageView.set_visible", l91Var);
            arrayList.add(l91Var);
            ArrayList<zc1> arrayList2 = o91Var.d0.k0;
            m91 m91Var = new m91(o91Var);
            ga1.g("ImageView.set_bounds", m91Var);
            arrayList2.add(m91Var);
            ArrayList<zc1> arrayList3 = o91Var.d0.k0;
            n91 n91Var = new n91(o91Var);
            ga1.g("ImageView.set_image", n91Var);
            arrayList3.add(n91Var);
            o91Var.d0.l0.add("ImageView.set_visible");
            o91Var.d0.l0.add("ImageView.set_bounds");
            o91Var.d0.l0.add("ImageView.set_image");
            ob1Var.T.put(Integer.valueOf(l), o91Var);
            ob1Var.V.put(Integer.valueOf(l), o91Var);
            ob1Var.a(o91Var, js.OTHER);
        }
    }
}