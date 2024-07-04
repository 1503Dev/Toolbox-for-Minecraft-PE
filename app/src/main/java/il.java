package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.f;
import androidx.fragment.app.i;

/* renamed from: il  reason: default package */
public class il extends c implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public int H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public int L0;
    public Dialog M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;

    /* renamed from: il$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            il ilVar = il.this;
            Dialog dialog = ilVar.M0;
            if (dialog != null) {
                ilVar.onDismiss(dialog);
            }
        }
    }

    public il() {
        new a();
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = true;
        this.K0 = true;
        this.L0 = -1;
    }

    @Override // androidx.fragment.app.c
    public final void n(Bundle bundle) {
        FragmentActivity fragmentActivity;
        Bundle bundle2;
        this.q0 = true;
        if (!this.K0) {
            return;
        }
        View view = this.s0;
        if (view != null) {
            if (view.getParent() == null) {
                this.M0.setContentView(view);
            } else {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
        or orVar = this.g0;
        if (orVar == null) {
            fragmentActivity = null;
        } else {
            fragmentActivity = (FragmentActivity) orVar.P;
        }
        if (fragmentActivity != null) {
            this.M0.setOwnerActivity(fragmentActivity);
        }
        this.M0.setCancelable(this.J0);
        this.M0.setOnCancelListener(this);
        this.M0.setOnDismissListener(this);
        if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.M0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (!this.N0 && !this.O0) {
            this.O0 = true;
            this.P0 = false;
            Dialog dialog = this.M0;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.M0.dismiss();
            }
            this.N0 = true;
            if (this.L0 >= 0) {
                f F = F();
                int i = this.L0;
                if (i >= 0) {
                    F.F(new f.i(i), false);
                    this.L0 = -1;
                    return;
                }
                throw new IllegalArgumentException(k6.a("Bad id: ", i));
            }
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(F());
            f fVar = this.f0;
            if (fVar != null && fVar != aVar.q) {
                StringBuilder b = e5.b("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
                b.append(toString());
                b.append(" is already attached to a FragmentManager.");
                throw new IllegalStateException(b.toString());
            }
            aVar.b(new i.a(3, this));
            aVar.d(true);
        }
    }

    @Override // androidx.fragment.app.c
    public final void p(Context context) {
        super.p(context);
        if (this.P0) {
            return;
        }
        this.O0 = false;
    }

    @Override // androidx.fragment.app.c
    public final void q(Bundle bundle) {
        super.q(bundle);
        new Handler();
        this.K0 = this.k0 == 0;
        if (bundle != null) {
            this.H0 = bundle.getInt("android:style", 0);
            this.I0 = bundle.getInt("android:theme", 0);
            this.J0 = bundle.getBoolean("android:cancelable", true);
            this.K0 = bundle.getBoolean("android:showsDialog", this.K0);
            this.L0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.c
    public final void t() {
        this.q0 = true;
        Dialog dialog = this.M0;
        if (dialog != null) {
            this.N0 = true;
            dialog.setOnDismissListener(null);
            this.M0.dismiss();
            if (!this.O0) {
                onDismiss(this.M0);
            }
            this.M0 = null;
        }
    }

    @Override // androidx.fragment.app.c
    public final void u() {
        this.q0 = true;
        if (!this.P0 && !this.O0) {
            this.O0 = true;
        }
    }

    @Override // androidx.fragment.app.c
    public final LayoutInflater v(Bundle bundle) {
        Context context;
        Context context2;
        if (!this.K0) {
            return super.v(bundle);
        }
        ru0 ru0Var = (ru0) this;
        Dialog dialog = ru0Var.Q0;
        if (dialog == null) {
            ru0Var.K0 = false;
            if (ru0Var.S0 == null) {
                or orVar = ru0Var.g0;
                if (orVar == null) {
                    context2 = null;
                } else {
                    context2 = orVar.Q;
                }
                uf0.f(context2);
                ru0Var.S0 = new AlertDialog.Builder(context2).create();
            }
            dialog = ru0Var.S0;
        }
        this.M0 = dialog;
        if (dialog != null) {
            int i = this.H0;
            if (i != 1 && i != 2) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                }
                context = this.M0.getContext();
            }
            dialog.requestWindowFeature(1);
            context = this.M0.getContext();
        } else {
            context = this.g0.Q;
        }
        return (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.fragment.app.c
    public final void x(Bundle bundle) {
        Bundle onSaveInstanceState;
        Dialog dialog = this.M0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.H0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.I0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.J0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.K0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.L0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.c
    public final void y() {
        this.q0 = true;
        Dialog dialog = this.M0;
        if (dialog != null) {
            this.N0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.c
    public final void z() {
        this.q0 = true;
        Dialog dialog = this.M0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}