package com.adcolony.sdk;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;

public class AdColonyAdViewActivity extends ia1 {
    public z1 Y;

    public AdColonyAdViewActivity() {
        z1 z1Var;
        if (!ga1.j()) {
            z1Var = null;
        } else {
            z1Var = ga1.h().n;
        }
        this.Y = z1Var;
    }

    public final void e() {
        ViewParent parent = this.P.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(this.P);
        }
        z1 z1Var = this.Y;
        if (!z1Var.b0 && !z1Var.d0) {
            ga1.h().n = null;
            finish();
            return;
        }
        ga1.h().l().getClass();
        he1.f();
        throw null;
    }

    @Override // defpackage.ia1, android.app.Activity
    public final void onBackPressed() {
        e();
    }

    @Override // defpackage.ia1, android.app.Activity
    public final void onCreate(Bundle bundle) {
        z1 z1Var;
        if (ga1.j() && (z1Var = this.Y) != null) {
            this.Q = z1Var.getOrientation();
            super.onCreate(bundle);
            this.Y.a();
            this.Y.getListener();
            return;
        }
        ga1.h().n = null;
        finish();
    }
}