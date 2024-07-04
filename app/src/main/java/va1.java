package defpackage;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: va1  reason: default package */
public final class va1 implements zc1 {
    public final /* synthetic */ ob1 a;

    public va1(ob1 ob1Var) {
        this.a = ob1Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        Context context;
        if (this.a.b(rc1Var)) {
            ob1 ob1Var = this.a;
            ob1Var.getClass();
            int l = rc1Var.b.l("id");
            v91 v91Var = new v91(ob1Var.q0, rc1Var, l, ob1Var);
            ic1 ic1Var = v91Var.w0.b;
            v91Var.v0 = ic1Var.q("ad_session_id");
            v91Var.a0 = ic1Var.l("x");
            v91Var.b0 = ic1Var.l("y");
            v91Var.c0 = ic1Var.l("width");
            v91Var.d0 = ic1Var.l("height");
            v91Var.r0 = ic1Var.j("enable_timer");
            v91Var.t0 = ic1Var.j("enable_progress");
            v91Var.u0 = ic1Var.q("filepath");
            v91Var.f0 = ic1Var.l("video_width");
            v91Var.g0 = ic1Var.l("video_height");
            ga1.h().l().getClass();
            v91Var.S = he1.f();
            StringBuilder b = e5.b("Original video dimensions = ");
            b.append(v91Var.f0);
            b.append("x");
            b.append(v91Var.g0);
            t1.b(0, 3, b.toString(), true);
            v91Var.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(v91Var.c0, v91Var.d0);
            layoutParams.setMargins(v91Var.a0, v91Var.b0, 0, 0);
            layoutParams.gravity = 0;
            v91Var.x0.addView(v91Var, layoutParams);
            if (v91Var.t0 && (context = ga1.P) != null) {
                ProgressBar progressBar = new ProgressBar(context);
                v91Var.B0 = progressBar;
                ob1 ob1Var2 = v91Var.x0;
                int i = (int) (v91Var.S * 100.0f);
                ob1Var2.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
            }
            v91Var.C0 = new MediaPlayer();
            v91Var.o0 = false;
            try {
                if (!v91Var.u0.startsWith("http")) {
                    v91Var.C0.setDataSource(new FileInputStream(v91Var.u0).getFD());
                } else {
                    v91Var.q0 = true;
                    v91Var.C0.setDataSource(v91Var.u0);
                }
                v91Var.C0.setOnErrorListener(v91Var);
                v91Var.C0.setOnPreparedListener(v91Var);
                v91Var.C0.setOnCompletionListener(v91Var);
                v91Var.C0.prepareAsync();
            } catch (IOException e) {
                StringBuilder b2 = e5.b("Failed to create/prepare MediaPlayer: ");
                b2.append(e.toString());
                ga1.h().n().d(0, 0, b2.toString(), false);
                v91Var.b();
            }
            ArrayList<zc1> arrayList = v91Var.x0.k0;
            p91 p91Var = new p91(v91Var);
            ga1.g("VideoView.play", p91Var);
            arrayList.add(p91Var);
            ArrayList<zc1> arrayList2 = v91Var.x0.k0;
            q91 q91Var = new q91(v91Var);
            ga1.g("VideoView.set_bounds", q91Var);
            arrayList2.add(q91Var);
            ArrayList<zc1> arrayList3 = v91Var.x0.k0;
            r91 r91Var = new r91(v91Var);
            ga1.g("VideoView.set_visible", r91Var);
            arrayList3.add(r91Var);
            ArrayList<zc1> arrayList4 = v91Var.x0.k0;
            s91 s91Var = new s91(v91Var);
            ga1.g("VideoView.pause", s91Var);
            arrayList4.add(s91Var);
            ArrayList<zc1> arrayList5 = v91Var.x0.k0;
            t91 t91Var = new t91(v91Var);
            ga1.g("VideoView.seek_to_time", t91Var);
            arrayList5.add(t91Var);
            ArrayList<zc1> arrayList6 = v91Var.x0.k0;
            u91 u91Var = new u91(v91Var);
            ga1.g("VideoView.set_volume", u91Var);
            arrayList6.add(u91Var);
            v91Var.x0.l0.add("VideoView.play");
            v91Var.x0.l0.add("VideoView.set_bounds");
            v91Var.x0.l0.add("VideoView.set_visible");
            v91Var.x0.l0.add("VideoView.pause");
            v91Var.x0.l0.add("VideoView.seek_to_time");
            v91Var.x0.l0.add("VideoView.set_volume");
            ob1Var.P.put(Integer.valueOf(l), v91Var);
            ob1Var.V.put(Integer.valueOf(l), v91Var);
            ob1Var.a(v91Var, js.OTHER);
        }
    }
}