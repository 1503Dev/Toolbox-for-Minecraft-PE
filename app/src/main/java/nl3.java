package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: nl3  reason: default package */
public final class nl3 {
    public int a;
    public cs3 b;
    public uc2 c;
    public View d;
    public List e;
    public n84 g;
    public Bundle h;
    public y03 i;
    public y03 j;
    public y03 k;
    public hw l;
    public View m;
    public dz4 n;
    public View o;
    public hw p;
    public double q;
    public ad2 r;
    public ad2 s;
    public String t;
    public float w;
    public String x;
    public final os0 u = new os0();
    public final os0 v = new os0();
    public List f = Collections.emptyList();

    public static nl3 c(ml3 ml3Var, uc2 uc2Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, hw hwVar, String str4, String str5, double d, ad2 ad2Var, String str6, float f) {
        nl3 nl3Var = new nl3();
        nl3Var.a = 6;
        nl3Var.b = ml3Var;
        nl3Var.c = uc2Var;
        nl3Var.d = view;
        nl3Var.b("headline", str);
        nl3Var.e = list;
        nl3Var.b("body", str2);
        nl3Var.h = bundle;
        nl3Var.b("call_to_action", str3);
        nl3Var.m = view2;
        nl3Var.p = hwVar;
        nl3Var.b("store", str4);
        nl3Var.b("price", str5);
        nl3Var.q = d;
        nl3Var.r = ad2Var;
        nl3Var.b("advertiser", str6);
        synchronized (nl3Var) {
            nl3Var.w = f;
        }
        return nl3Var;
    }

    public static Object d(hw hwVar) {
        if (hwVar == null) {
            return null;
        }
        return va0.c0(hwVar);
    }

    public static nl3 k(pl2 pl2Var) {
        ml3 ml3Var;
        try {
            cs3 j = pl2Var.j();
            if (j == null) {
                ml3Var = null;
            } else {
                ml3Var = new ml3(j, pl2Var);
            }
            return c(ml3Var, pl2Var.l(), (View) d(pl2Var.o()), pl2Var.s(), pl2Var.r(), pl2Var.q(), pl2Var.g(), pl2Var.w(), (View) d(pl2Var.k()), pl2Var.t(), pl2Var.u(), pl2Var.G(), pl2Var.b(), pl2Var.n(), pl2Var.m(), pl2Var.e());
        } catch (RemoteException e) {
            sv2.h("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String a(String str) {
        return (String) this.v.getOrDefault(str, null);
    }

    public final synchronized void b(String str, String str2) {
        if (str2 == null) {
            this.v.remove(str);
        } else {
            this.v.put(str, str2);
        }
    }

    public final synchronized int e() {
        return this.a;
    }

    public final synchronized Bundle f() {
        if (this.h == null) {
            this.h = new Bundle();
        }
        return this.h;
    }

    public final synchronized cs3 g() {
        return this.b;
    }

    public final ad2 h() {
        List list = this.e;
        if (list != null && !list.isEmpty()) {
            Object obj = this.e.get(0);
            if (obj instanceof IBinder) {
                return lc2.t4((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized y03 i() {
        return this.k;
    }

    public final synchronized y03 j() {
        return this.i;
    }

    public final synchronized hw l() {
        return this.l;
    }

    public final synchronized String m() {
        return this.t;
    }
}