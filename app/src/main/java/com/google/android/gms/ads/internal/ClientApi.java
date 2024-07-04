package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

public class ClientApi extends fz2 {
    @Override // defpackage.h03
    public final ed2 B1(hw hwVar, hw hwVar2) {
        return new am3((FrameLayout) va0.c0(hwVar), (FrameLayout) va0.c0(hwVar2));
    }

    @Override // defpackage.h03
    public final wr2 J3(hw hwVar, String str, wk2 wk2Var, int i) {
        Context context = (Context) va0.c0(hwVar);
        k94 V = q23.c(context, wk2Var, i).V();
        context.getClass();
        V.R = context;
        V.P = str;
        return (th4) V.a().e.c();
    }

    @Override // defpackage.h03
    public final gu2 P1(hw hwVar, wk2 wk2Var, int i) {
        return (dk1) q23.c((Context) va0.c0(hwVar), wk2Var, i).U.c();
    }

    @Override // defpackage.h03
    public final po2 S(hw hwVar) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        Activity activity = (Activity) va0.c0(hwVar);
        try {
            Bundle bundleExtra = activity.getIntent().getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            adOverlayInfoParcel = (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            adOverlayInfoParcel = null;
        }
        if (adOverlayInfoParcel == null) {
            return new cv5(activity);
        }
        int i = adOverlayInfoParcel.Z;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return new cv5(activity);
                        }
                        return new zl1(activity);
                    }
                    return new xz5(activity, adOverlayInfoParcel);
                }
                return new ep1(activity);
            }
            return new eo1(activity);
        }
        return new bu5(activity);
    }

    @Override // defpackage.h03
    public final jn2 T3(hw hwVar, String str, wk2 wk2Var, int i) {
        Context context = (Context) va0.c0(hwVar);
        return new l64(q23.c(context, wk2Var, i), context, str);
    }

    @Override // defpackage.h03
    public final pq2 V2(hw hwVar, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        Context context = (Context) va0.c0(hwVar);
        w33 w33Var = q23.c(context, wk2Var, i).c;
        a43 a43Var = new a43(w33Var);
        str.getClass();
        a43Var.i = str;
        context.getClass();
        a43Var.h = context;
        tv2.E(String.class, (String) a43Var.i);
        b43 b43Var = new b43(w33Var, (Context) a43Var.h, (String) a43Var.i);
        if (i >= ((Integer) w82.d.c.a(x92.o4)).intValue()) {
            return (qf4) b43Var.c.c();
        }
        return new ig4();
    }

    @Override // defpackage.h03
    public final pq2 Z0(hw hwVar, zr5 zr5Var, String str, int i) {
        return new gu5((Context) va0.c0(hwVar), zr5Var, str, new xv2(i, false));
    }

    @Override // defpackage.h03
    public final q73 b0(hw hwVar, int i) {
        return (h53) q23.c((Context) va0.c0(hwVar), null, i).L.c();
    }

    @Override // defpackage.h03
    public final io2 d2(hw hwVar, wk2 wk2Var, int i) {
        return (a14) q23.c((Context) va0.c0(hwVar), wk2Var, i).W.c();
    }

    @Override // defpackage.h03
    public final pq2 g2(hw hwVar, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        Context context = (Context) va0.c0(hwVar);
        w33 w33Var = q23.c(context, wk2Var, i).c;
        h43 h43Var = new h43(w33Var);
        context.getClass();
        h43Var.b = context;
        zr5Var.getClass();
        h43Var.d = zr5Var;
        str.getClass();
        h43Var.c = str;
        tv2.E(Context.class, (Context) h43Var.b);
        tv2.E(String.class, (String) h43Var.c);
        tv2.E(zr5.class, (zr5) h43Var.d);
        Context context2 = (Context) h43Var.b;
        String str2 = (String) h43Var.c;
        zr5 zr5Var2 = (zr5) h43Var.d;
        i43 i43Var = new i43(w33Var, context2, str2, zr5Var2);
        t64 t64Var = (t64) i43Var.a.c();
        xv2 xv2Var = w33Var.b.a;
        tv2.C(xv2Var);
        return new q64(context2, zr5Var2, str2, (tf4) i43Var.d.c(), t64Var, xv2Var);
    }

    @Override // defpackage.h03
    public final pq2 o1(hw hwVar, zr5 zr5Var, String str, wk2 wk2Var, int i) {
        Context context = (Context) va0.c0(hwVar);
        t43 U = q23.c(context, wk2Var, i).U();
        context.getClass();
        U.b = context;
        zr5Var.getClass();
        U.d = zr5Var;
        str.getClass();
        U.c = str;
        return (z64) U.a().d.c();
    }

    @Override // defpackage.h03
    public final gn3 o2(hw hwVar, wk2 wk2Var, int i) {
        return (qu3) q23.c((Context) va0.c0(hwVar), wk2Var, i).I.c();
    }
}