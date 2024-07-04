package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: vx2  reason: default package */
public final class vx2 extends FrameLayout implements rx2 {
    public static final /* synthetic */ int k0 = 0;
    public final gy2 P;
    public final FrameLayout Q;
    public final View R;
    public final la2 S;
    public final iy2 T;
    public final long U;
    public final sx2 V;
    public boolean W;
    public boolean a0;
    public boolean b0;
    public boolean c0;
    public long d0;
    public long e0;
    public String f0;
    public String[] g0;
    public Bitmap h0;
    public final ImageView i0;
    public boolean j0;

    public vx2(Context context, y03 y03Var, int i, boolean z, la2 la2Var, fy2 fy2Var) {
        super(context);
        sx2 qx2Var;
        String str;
        this.P = y03Var;
        this.S = la2Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.Q = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        uf0.f(y03Var.j());
        Object obj = y03Var.j().Q;
        hy2 hy2Var = new hy2(context, y03Var.k(), y03Var.q0(), la2Var, y03Var.l());
        if (i == 2) {
            y03Var.L().getClass();
            qx2Var = new wy2(context, fy2Var, y03Var, hy2Var, z);
        } else {
            qx2Var = new qx2(context, y03Var, new hy2(context, y03Var.k(), y03Var.q0(), la2Var, y03Var.l()), z, y03Var.L().b());
        }
        this.V = qx2Var;
        View view = new View(context);
        this.R = view;
        view.setBackgroundColor(0);
        frameLayout.addView(qx2Var, new FrameLayout.LayoutParams(-1, -1, 17));
        l92 l92Var = x92.z;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) w82Var.c.a(x92.w)).booleanValue()) {
            i();
        }
        this.i0 = new ImageView(context);
        this.U = ((Long) w82Var.c.a(x92.B)).longValue();
        boolean booleanValue = ((Boolean) w82Var.c.a(x92.y)).booleanValue();
        this.c0 = booleanValue;
        if (la2Var != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            la2Var.b("spinner_used", str);
        }
        this.T = new iy2(this);
        qx2Var.w(this);
    }

    public final void a(int i, int i2, int i3, int i4) {
        if (vz3.m()) {
            vz3.k("Set video bounds to x:" + i + ";y:" + i2 + ";w:" + i3 + ";h:" + i4);
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.Q.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void b() {
        if (this.P.g() == null || !this.a0 || this.b0) {
            return;
        }
        this.P.g().getWindow().clearFlags(128);
        this.a0 = false;
    }

    public final void c(String str, String... strArr) {
        Integer num;
        HashMap hashMap = new HashMap();
        sx2 sx2Var = this.V;
        if (sx2Var != null) {
            num = sx2Var.A();
        } else {
            num = null;
        }
        if (num != null) {
            hashMap.put("playerId", num.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.P.a("onVideoEvent", hashMap);
    }

    public final void d() {
        if (((Boolean) w82.d.c.a(x92.z1)).booleanValue()) {
            this.T.b();
        }
        c("ended", new String[0]);
        b();
    }

    public final void e() {
        boolean z = false;
        if (((Boolean) w82.d.c.a(x92.z1)).booleanValue()) {
            iy2 iy2Var = this.T;
            iy2Var.Q = false;
            wi4 wi4Var = cu5.i;
            wi4Var.removeCallbacks(iy2Var);
            wi4Var.postDelayed(iy2Var, 250L);
        }
        if (this.P.g() != null && !this.a0) {
            if ((this.P.g().getWindow().getAttributes().flags & 128) != 0) {
                z = true;
            }
            this.b0 = z;
            if (!z) {
                this.P.g().getWindow().addFlags(128);
                this.a0 = true;
            }
        }
        this.W = true;
    }

    public final void f() {
        sx2 sx2Var = this.V;
        if (sx2Var != null && this.e0 == 0) {
            c("canplaythrough", "duration", String.valueOf(sx2Var.l() / 1000.0f), "videoWidth", String.valueOf(this.V.n()), "videoHeight", String.valueOf(this.V.m()));
        }
    }

    public final void finalize() {
        try {
            this.T.b();
            sx2 sx2Var = this.V;
            if (sx2Var != null) {
                zw2.e.execute(new fp1(1, sx2Var));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        boolean z;
        if (this.j0 && this.h0 != null) {
            if (this.i0.getParent() != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.i0.setImageBitmap(this.h0);
                this.i0.invalidate();
                this.Q.addView(this.i0, new FrameLayout.LayoutParams(-1, -1));
                this.Q.bringChildToFront(this.i0);
            }
        }
        this.T.b();
        this.e0 = this.d0;
        cu5.i.post(new rh2(1, this));
    }

    public final void h(int i, int i2) {
        if (this.c0) {
            m92 m92Var = x92.A;
            w82 w82Var = w82.d;
            int max = Math.max(i / ((Integer) w82Var.c.a(m92Var)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) w82Var.c.a(m92Var)).intValue(), 1);
            Bitmap bitmap = this.h0;
            if (bitmap != null && bitmap.getWidth() == max && this.h0.getHeight() == max2) {
                return;
            }
            this.h0 = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.j0 = false;
        }
    }

    public final void i() {
        String string;
        sx2 sx2Var = this.V;
        if (sx2Var == null) {
            return;
        }
        TextView textView = new TextView(sx2Var.getContext());
        Resources a = jv5.A.g.a();
        if (a == null) {
            string = "AdMob - ";
        } else {
            string = a.getString(ri0.watermark_label_prefix);
        }
        textView.setText(String.valueOf(string).concat(this.V.s()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.Q.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.Q.bringChildToFront(textView);
    }

    public final void j() {
        sx2 sx2Var = this.V;
        if (sx2Var == null) {
            return;
        }
        long h = sx2Var.h();
        if (this.d0 != h && h > 0) {
            float f = ((float) h) / 1000.0f;
            if (((Boolean) w82.d.c.a(x92.x1)).booleanValue()) {
                jv5.A.j.getClass();
                c("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.V.q()), "qoeCachedBytes", String.valueOf(this.V.o()), "qoeLoadedBytes", String.valueOf(this.V.p()), "droppedFrames", String.valueOf(this.V.i()), "reportTime", String.valueOf(System.currentTimeMillis()));
            } else {
                c("timeupdate", "time", String.valueOf(f));
            }
            this.d0 = h;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        iy2 iy2Var = this.T;
        if (z) {
            iy2Var.Q = false;
            wi4 wi4Var = cu5.i;
            wi4Var.removeCallbacks(iy2Var);
            wi4Var.postDelayed(iy2Var, 250L);
        } else {
            iy2Var.b();
            this.e0 = this.d0;
        }
        cu5.i.post(new Runnable() { // from class: tx2
            @Override // java.lang.Runnable
            public final void run() {
                vx2 vx2Var = vx2.this;
                boolean z2 = z;
                vx2Var.getClass();
                vx2Var.c("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
            }
        });
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        boolean z = false;
        if (i == 0) {
            iy2 iy2Var = this.T;
            iy2Var.Q = false;
            wi4 wi4Var = cu5.i;
            wi4Var.removeCallbacks(iy2Var);
            wi4Var.postDelayed(iy2Var, 250L);
            z = true;
        } else {
            this.T.b();
            this.e0 = this.d0;
        }
        cu5.i.post(new c25(this, z, 1));
    }
}