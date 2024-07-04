package com.adcolony.sdk;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import org.json.JSONArray;

public class AdColonyInterstitialActivity extends ia1 {
    public i2 Y;
    public xc1 Z;

    public AdColonyInterstitialActivity() {
        i2 i2Var;
        if (!ga1.j()) {
            i2Var = null;
        } else {
            i2Var = ga1.h().o;
        }
        this.Y = i2Var;
    }

    @Override // defpackage.ia1
    public final void b(rc1 rc1Var) {
        String str;
        super.b(rc1Var);
        pb1 k = ga1.h().k();
        ic1 n = rc1Var.b.n("v4iap");
        nr c = eb1.c(n, "product_ids");
        i2 i2Var = this.Y;
        if (i2Var != null && i2Var.a != null) {
            synchronized (((JSONArray) c.b)) {
                if (!((JSONArray) c.b).isNull(0)) {
                    Object opt = ((JSONArray) c.b).opt(0);
                    if (opt instanceof String) {
                        str = (String) opt;
                    } else if (opt != null) {
                        str = String.valueOf(opt);
                    }
                }
                str = null;
            }
            if (str != null) {
                z61 z61Var = this.Y.a;
                n.l("engagement_type");
                z61Var.getClass();
            }
        }
        k.c(this.P);
        i2 i2Var2 = this.Y;
        if (i2Var2 != null) {
            k.c.remove(i2Var2.f);
            z61 z61Var2 = this.Y.a;
            if (z61Var2 != null) {
                z61Var2.Q0();
                i2 i2Var3 = this.Y;
                i2Var3.c = null;
                i2Var3.a = null;
            }
            this.Y.a();
            this.Y = null;
        }
        xc1 xc1Var = this.Z;
        if (xc1Var != null) {
            Context context = ga1.P;
            if (context != null) {
                context.getApplicationContext().getContentResolver().unregisterContentObserver(xc1Var);
            }
            xc1Var.b = null;
            xc1Var.a = null;
            this.Z = null;
        }
    }

    @Override // defpackage.ia1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        i2 i2Var;
        i2 i2Var2 = this.Y;
        if (i2Var2 == null) {
            i = -1;
        } else {
            i = i2Var2.e;
        }
        this.Q = i;
        super.onCreate(bundle);
        if (ga1.j() && (i2Var = this.Y) != null) {
            zd1 zd1Var = i2Var.d;
            if (zd1Var != null) {
                zd1Var.b(this.P);
            }
            this.Z = new xc1(new Handler(Looper.getMainLooper()), this.Y);
            z61 z61Var = this.Y.a;
            if (z61Var != null) {
                z61Var.getClass();
            }
        }
    }
}