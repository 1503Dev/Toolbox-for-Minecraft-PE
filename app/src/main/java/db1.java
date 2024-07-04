package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: db1  reason: default package */
public final class db1 implements Runnable {
    public final /* synthetic */ boolean P;
    public final /* synthetic */ ob1 Q;

    public db1(ob1 ob1Var, boolean z) {
        this.Q = ob1Var;
        this.P = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ka1 webView;
        boolean z;
        float f;
        double a;
        int b;
        int i;
        float a2;
        float f2;
        float f3;
        int i2;
        ob1 ob1Var = this.Q;
        if (!ob1Var.e0) {
            boolean z2 = this.P;
            View view = (View) ob1Var.getParent();
            z1 z1Var = ga1.h().k().f.get(ob1Var.d0);
            if (z1Var == null) {
                webView = null;
            } else {
                webView = z1Var.getWebView();
            }
            Context context = ga1.P;
            boolean z3 = true;
            if (z1Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (view != null && context != null && view.getVisibility() == 0 && view.getAlpha() != 0.0f && (!(context instanceof Activity) || ((Activity) context).hasWindowFocus() || z)) {
                if (view.getHeight() > 0 && view.getWidth() > 0) {
                    float width = view.getWidth() * view.getHeight();
                    Rect rect = new Rect();
                    boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
                    int[] iArr = {-1, -1};
                    view.getLocationInWindow(iArr);
                    int[] iArr2 = {-1, -1};
                    iArr2[0] = view.getWidth() + iArr[0];
                    iArr2[1] = view.getHeight() + iArr[1];
                    int b2 = pc1.b(context);
                    int c = pc1.c(context);
                    if (iArr2[0] >= 0 && iArr2[1] >= 0 && iArr[0] <= c && (i2 = iArr[1]) <= b2 && ((rect.top != 0 || i2 <= b2 / 2) && globalVisibleRect)) {
                        float width2 = rect.width() * rect.height();
                        if (width2 > 0.0f) {
                            if (z2) {
                                try {
                                    float a3 = pc1.a(view, rect, width2, false);
                                    if (a3 > 0.0f && a3 <= width2) {
                                        width2 -= a3;
                                    }
                                } catch (Exception unused) {
                                }
                            }
                            f = (width2 / width) * 100.0f;
                            if (f >= 0.0f) {
                                if (f > 100.0f) {
                                    f = 100.0f;
                                }
                                if (context == null) {
                                }
                                b = eg1.b(webView);
                                int j = eg1.j(webView);
                                if (b == ob1Var.i0) {
                                }
                                if (z3) {
                                }
                                if (ob1Var.g0 == f) {
                                }
                                ic1 ic1Var = new ic1();
                                eb1.l(ob1Var.b0, ic1Var, "id");
                                eb1.j(ic1Var, "ad_session_id", ob1Var.d0);
                                eb1.g(ic1Var, "exposure", f);
                                eb1.g(ic1Var, "volume", a);
                                new rc1(ob1Var.c0, ic1Var, "AdContainer.on_exposure_change").b();
                                ob1Var.g0 = f;
                                ob1Var.h0 = a;
                                ob1 ob1Var2 = this.Q;
                                boolean z4 = this.P;
                                ob1Var2.getClass();
                                eg1.e(200L, new db1(ob1Var2, z4));
                            }
                        }
                    }
                } else if (view.getWidth() > 0 && view.getLayoutParams().height == -2) {
                    int[] iArr3 = {-1, -1};
                    view.getLocationInWindow(iArr3);
                    int[] iArr4 = {-1, -1};
                    iArr4[0] = view.getWidth() + iArr3[0];
                    iArr4[1] = iArr3[1] + 1;
                    Rect rect2 = new Rect(iArr3[0], iArr3[1], iArr4[0], iArr4[1]);
                    int b3 = pc1.b(context);
                    int c2 = pc1.c(context);
                    if (iArr4[0] >= 0 && iArr4[1] >= 0 && iArr3[0] <= c2 && (i = iArr3[1]) <= b3 && (rect2.top != 0 || i <= b3 / 2)) {
                        float width3 = rect2.width() * rect2.height();
                        if (z2) {
                            try {
                                a2 = pc1.a(view, rect2, width3, true);
                            } catch (Exception unused2) {
                            }
                            if (a2 > 0.0f && a2 <= width3) {
                                f2 = width3 - a2;
                                f3 = (f2 / width3) * 100.0f;
                                if (f3 >= 0.0f) {
                                    if (f3 <= 100.0f) {
                                        f = f3;
                                        if (context == null) {
                                            a = 0.0d;
                                        } else {
                                            a = eg1.a(eg1.c(context));
                                        }
                                        b = eg1.b(webView);
                                        int j2 = eg1.j(webView);
                                        if (b == ob1Var.i0 && j2 == ob1Var.j0) {
                                            z3 = false;
                                        }
                                        if (z3) {
                                            ob1Var.i0 = b;
                                            ob1Var.j0 = j2;
                                            ga1.h().l().getClass();
                                            float f4 = he1.f();
                                            if (webView != null) {
                                                ic1 ic1Var2 = new ic1();
                                                eb1.l(eg1.s(eg1.w()), ic1Var2, "app_orientation");
                                                eb1.l((int) (webView.getCurrentWidth() / f4), ic1Var2, "width");
                                                eb1.l((int) (webView.getCurrentHeight() / f4), ic1Var2, "height");
                                                eb1.l(b, ic1Var2, "x");
                                                eb1.l(j2, ic1Var2, "y");
                                                eb1.j(ic1Var2, "ad_session_id", ob1Var.d0);
                                                new rc1(ob1Var.c0, ic1Var2, "MRAID.on_size_change").b();
                                            }
                                        }
                                        if (ob1Var.g0 == f || ob1Var.h0 != a || z3) {
                                            ic1 ic1Var3 = new ic1();
                                            eb1.l(ob1Var.b0, ic1Var3, "id");
                                            eb1.j(ic1Var3, "ad_session_id", ob1Var.d0);
                                            eb1.g(ic1Var3, "exposure", f);
                                            eb1.g(ic1Var3, "volume", a);
                                            new rc1(ob1Var.c0, ic1Var3, "AdContainer.on_exposure_change").b();
                                        }
                                        ob1Var.g0 = f;
                                        ob1Var.h0 = a;
                                        ob1 ob1Var22 = this.Q;
                                        boolean z42 = this.P;
                                        ob1Var22.getClass();
                                        eg1.e(200L, new db1(ob1Var22, z42));
                                    }
                                    f = 100.0f;
                                    if (context == null) {
                                    }
                                    b = eg1.b(webView);
                                    int j22 = eg1.j(webView);
                                    if (b == ob1Var.i0) {
                                        z3 = false;
                                    }
                                    if (z3) {
                                    }
                                    if (ob1Var.g0 == f) {
                                    }
                                    ic1 ic1Var32 = new ic1();
                                    eb1.l(ob1Var.b0, ic1Var32, "id");
                                    eb1.j(ic1Var32, "ad_session_id", ob1Var.d0);
                                    eb1.g(ic1Var32, "exposure", f);
                                    eb1.g(ic1Var32, "volume", a);
                                    new rc1(ob1Var.c0, ic1Var32, "AdContainer.on_exposure_change").b();
                                    ob1Var.g0 = f;
                                    ob1Var.h0 = a;
                                    ob1 ob1Var222 = this.Q;
                                    boolean z422 = this.P;
                                    ob1Var222.getClass();
                                    eg1.e(200L, new db1(ob1Var222, z422));
                                }
                            }
                        }
                        f2 = width3;
                        f3 = (f2 / width3) * 100.0f;
                        if (f3 >= 0.0f) {
                        }
                    }
                }
                f = 0.0f;
                if (context == null) {
                }
                b = eg1.b(webView);
                int j222 = eg1.j(webView);
                if (b == ob1Var.i0) {
                }
                if (z3) {
                }
                if (ob1Var.g0 == f) {
                }
                ic1 ic1Var322 = new ic1();
                eb1.l(ob1Var.b0, ic1Var322, "id");
                eb1.j(ic1Var322, "ad_session_id", ob1Var.d0);
                eb1.g(ic1Var322, "exposure", f);
                eb1.g(ic1Var322, "volume", a);
                new rc1(ob1Var.c0, ic1Var322, "AdContainer.on_exposure_change").b();
                ob1Var.g0 = f;
                ob1Var.h0 = a;
                ob1 ob1Var2222 = this.Q;
                boolean z4222 = this.P;
                ob1Var2222.getClass();
                eg1.e(200L, new db1(ob1Var2222, z4222));
            }
            f = 0.0f;
            if (context == null) {
            }
            b = eg1.b(webView);
            int j2222 = eg1.j(webView);
            if (b == ob1Var.i0) {
            }
            if (z3) {
            }
            if (ob1Var.g0 == f) {
            }
            ic1 ic1Var3222 = new ic1();
            eb1.l(ob1Var.b0, ic1Var3222, "id");
            eb1.j(ic1Var3222, "ad_session_id", ob1Var.d0);
            eb1.g(ic1Var3222, "exposure", f);
            eb1.g(ic1Var3222, "volume", a);
            new rc1(ob1Var.c0, ic1Var3222, "AdContainer.on_exposure_change").b();
            ob1Var.g0 = f;
            ob1Var.h0 = a;
            ob1 ob1Var22222 = this.Q;
            boolean z42222 = this.P;
            ob1Var22222.getClass();
            eg1.e(200L, new db1(ob1Var22222, z42222));
        }
    }
}