package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* renamed from: us2  reason: default package */
public final /* synthetic */ class us2 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ us2(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ViewGroup viewGroup;
        nl3 nl3Var;
        View view;
        uc2 uc2Var;
        uc2 uc2Var2;
        View view2;
        ViewGroup viewGroup2;
        yc2 yc2Var;
        Drawable drawable;
        ImageView.ScaleType scaleType;
        y03 y03Var;
        y03 y03Var2;
        av2 av2Var;
        y03 y03Var3;
        switch (this.P) {
            case 0:
                vs2 vs2Var = (vs2) this.Q;
                vs2Var.getClass();
                ed5 ed5Var = gd5.Q;
                fd5 fd5Var = new fd5();
                ((Bitmap) this.R).compress(Bitmap.CompressFormat.PNG, 0, fd5Var);
                synchronized (vs2Var.h) {
                    ph5 ph5Var = vs2Var.a;
                    gi5 w = ii5.w();
                    gd5 a = fd5Var.a();
                    w.j();
                    ii5.z((ii5) w.Q, a);
                    w.j();
                    ii5.y((ii5) w.Q);
                    w.j();
                    ii5.A((ii5) w.Q);
                    ph5Var.j();
                    ri5.I((ri5) ph5Var.Q, (ii5) w.h());
                }
                return;
            case 1:
                ((y03) this.Q).M0("AFMA_updateActiveView", (JSONObject) this.R);
                return;
            case 2:
                cm3 cm3Var = (cm3) this.Q;
                ym3 ym3Var = (ym3) this.R;
                Context context = null;
                if (cm3Var.c.e() || cm3Var.c.d()) {
                    String[] strArr = {"1098", "3011"};
                    for (int i = 0; i < 2; i++) {
                        View b2 = ym3Var.b2(strArr[i]);
                        if (b2 != null && (b2 instanceof ViewGroup)) {
                            viewGroup = (ViewGroup) b2;
                            Context context2 = ym3Var.e().getContext();
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                            nl3Var = cm3Var.d;
                            synchronized (nl3Var) {
                                view = nl3Var.d;
                            }
                            if (view != null) {
                                synchronized (nl3Var) {
                                    view2 = nl3Var.d;
                                }
                                nc2 nc2Var = cm3Var.i;
                                if (nc2Var != null && viewGroup == null) {
                                    cm3.b(layoutParams, nc2Var.T);
                                    view2.setLayoutParams(layoutParams);
                                }
                            } else {
                                synchronized (nl3Var) {
                                    uc2Var = nl3Var.c;
                                }
                                if (!(uc2Var instanceof ic2)) {
                                    view2 = null;
                                } else {
                                    synchronized (nl3Var) {
                                        uc2Var2 = nl3Var.c;
                                    }
                                    ic2 ic2Var = (ic2) uc2Var2;
                                    if (viewGroup == null) {
                                        cm3.b(layoutParams, ic2Var.W);
                                    }
                                    jc2 jc2Var = new jc2(context2, ic2Var, layoutParams);
                                    jc2Var.setContentDescription((CharSequence) w82.d.c.a(x92.d3));
                                    view2 = jc2Var;
                                }
                            }
                            if (view2 != null) {
                                if (view2.getParent() instanceof ViewGroup) {
                                    ((ViewGroup) view2.getParent()).removeView(view2);
                                }
                                if (viewGroup != null) {
                                    viewGroup.removeAllViews();
                                    viewGroup.addView(view2);
                                } else {
                                    qj1 qj1Var = new qj1(ym3Var.e().getContext());
                                    qj1Var.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                    qj1Var.addView(view2);
                                    FrameLayout f = ym3Var.f();
                                    if (f != null) {
                                        f.addView(qj1Var);
                                    }
                                }
                                ym3Var.c0(ym3Var.l(), view2);
                            }
                            nw4 nw4Var = am3.e0;
                            int i2 = nw4Var.S;
                            int i3 = 0;
                            while (true) {
                                if (i3 < i2) {
                                    View b22 = ym3Var.b2((String) nw4Var.get(i3));
                                    i3++;
                                    if (b22 instanceof ViewGroup) {
                                        viewGroup2 = (ViewGroup) b22;
                                    }
                                } else {
                                    viewGroup2 = null;
                                }
                            }
                            cm3Var.h.execute(new bm3(0, cm3Var, viewGroup2));
                            if (viewGroup2 != null) {
                                if (cm3Var.c(viewGroup2, true)) {
                                    nl3 nl3Var2 = cm3Var.d;
                                    if (nl3Var2.j() != null) {
                                        y03Var3 = nl3Var2.j();
                                        av2Var = new av2(2, ym3Var, viewGroup2);
                                    } else {
                                        return;
                                    }
                                } else {
                                    l92 l92Var = x92.i8;
                                    w82 w82Var = w82.d;
                                    if (((Boolean) w82Var.c.a(l92Var)).booleanValue() && cm3Var.c(viewGroup2, false)) {
                                        nl3 nl3Var3 = cm3Var.d;
                                        synchronized (nl3Var3) {
                                            y03Var = nl3Var3.j;
                                        }
                                        if (y03Var != null) {
                                            synchronized (nl3Var3) {
                                                y03Var2 = nl3Var3.j;
                                            }
                                            av2Var = new av2(2, ym3Var, viewGroup2);
                                            y03Var3 = y03Var2;
                                        } else {
                                            return;
                                        }
                                    } else {
                                        viewGroup2.removeAllViews();
                                        View e = ym3Var.e();
                                        if (e != null) {
                                            context = e.getContext();
                                        }
                                        if (context != null) {
                                            ll3 ll3Var = cm3Var.j;
                                            synchronized (ll3Var) {
                                                yc2Var = ll3Var.a;
                                            }
                                            if (yc2Var != null) {
                                                try {
                                                    hw g = yc2Var.g();
                                                    if (g != null && (drawable = (Drawable) va0.c0(g)) != null) {
                                                        ImageView imageView = new ImageView(context);
                                                        imageView.setImageDrawable(drawable);
                                                        hw j = ym3Var.j();
                                                        if (j != null) {
                                                            if (((Boolean) w82Var.c.a(x92.e5)).booleanValue()) {
                                                                scaleType = (ImageView.ScaleType) va0.c0(j);
                                                                imageView.setScaleType(scaleType);
                                                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                                viewGroup2.addView(imageView);
                                                                return;
                                                            }
                                                        }
                                                        scaleType = cm3.k;
                                                        imageView.setScaleType(scaleType);
                                                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                                        viewGroup2.addView(imageView);
                                                        return;
                                                    }
                                                    return;
                                                } catch (RemoteException unused) {
                                                    sv2.g("Could not get main image drawable");
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                }
                                y03Var3.F(av2Var);
                                return;
                            }
                            return;
                        }
                    }
                }
                viewGroup = null;
                Context context22 = ym3Var.e().getContext();
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                nl3Var = cm3Var.d;
                synchronized (nl3Var) {
                }
                break;
            case 3:
                ((bf4) this.Q).T.d.p((tz3) this.R);
                return;
            default:
                oq5 oq5Var = ((nq5) this.Q).b;
                int i4 = zn4.a;
                pp5 pp5Var = ((xl5) oq5Var).P.p;
                io5 G = pp5Var.G();
                pp5Var.D(G, 1012, new yn2(G, (String) this.R));
                return;
        }
    }
}