package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;

public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t42 t42Var = n62.f.b;
        tk2 tk2Var = new tk2();
        t42Var.getClass();
        gn3 gn3Var = (gn3) new yl1(this, tk2Var).d(this, false);
        if (gn3Var == null) {
            finish();
            return;
        }
        setContentView(ji0.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(ei0.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            gn3Var.h3(stringExtra, new va0(this), new va0(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}