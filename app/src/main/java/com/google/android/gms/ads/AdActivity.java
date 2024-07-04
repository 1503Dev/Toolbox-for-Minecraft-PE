package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;

public final class AdActivity extends Activity {
    public po2 P;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.D3(i, i2, intent);
            }
        } catch (Exception e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                if (!po2Var.x()) {
                    return;
                }
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        super.onBackPressed();
        try {
            po2 po2Var2 = this.P;
            if (po2Var2 != null) {
                po2Var2.f();
            }
        } catch (RemoteException e2) {
            sv2.i("#007 Could not call remote method.", e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.a0(new va0(configuration));
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t42 t42Var = n62.f.b;
        t42Var.getClass();
        gk1 gk1Var = new gk1(t42Var, this);
        Intent intent = getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            sv2.d("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        po2 po2Var = (po2) gk1Var.d(this, z);
        this.P = po2Var;
        if (po2Var != null) {
            try {
                po2Var.a2(bundle);
                return;
            } catch (RemoteException e) {
                e = e;
            }
        } else {
            e = null;
        }
        sv2.i("#007 Could not call remote method.", e);
        finish();
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.n();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.k();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.z0(i, strArr, iArr);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.m();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.q();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.i0(bundle);
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.s();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onStop() {
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.G();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            po2 po2Var = this.P;
            if (po2Var != null) {
                po2Var.u();
            }
        } catch (RemoteException e) {
            sv2.i("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        po2 po2Var = this.P;
        if (po2Var != null) {
            try {
                po2Var.E();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        po2 po2Var = this.P;
        if (po2Var != null) {
            try {
                po2Var.E();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        po2 po2Var = this.P;
        if (po2Var != null) {
            try {
                po2Var.E();
            } catch (RemoteException e) {
                sv2.i("#007 Could not call remote method.", e);
            }
        }
    }
}