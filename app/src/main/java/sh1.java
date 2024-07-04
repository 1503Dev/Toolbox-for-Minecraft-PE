package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import defpackage.kt;
import java.util.Set;

/* renamed from: sh1  reason: default package */
public final class sh1 extends jh1 implements kt.a, kt.b {
    public static final fg1 W = wh1.a;
    public final Context P;
    public final Handler Q;
    public final fg1 R;
    public final Set<Scope> S;
    public final jd T;
    public zh1 U;
    public rh1 V;

    public sh1(Context context, aj1 aj1Var, jd jdVar) {
        fg1 fg1Var = W;
        this.P = context;
        this.Q = aj1Var;
        this.T = jdVar;
        this.S = jdVar.b;
        this.R = fg1Var;
    }

    @Override // defpackage.ff
    public final void A(int i) {
        ((k9) this.U).p();
    }

    @Override // defpackage.zb0
    public final void Z(gf gfVar) {
        ((ch1) this.V).b(gfVar);
    }

    @Override // defpackage.ff
    public final void c0() {
        GoogleSignInAccount googleSignInAccount;
        cs0 cs0Var = (cs0) this.U;
        cs0Var.getClass();
        try {
            Account account = cs0Var.B.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = au0.a(cs0Var.c).b();
            } else {
                googleSignInAccount = null;
            }
            Integer num = cs0Var.D;
            uf0.f(num);
            dj1 dj1Var = new dj1(2, account, num.intValue(), googleSignInAccount);
            ai1 ai1Var = (ai1) cs0Var.v();
            ki1 ki1Var = new ki1(1, dj1Var);
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken(ai1Var.Q);
            int i = hh1.a;
            obtain.writeInt(1);
            ki1Var.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(this);
            Parcel obtain2 = Parcel.obtain();
            ai1Var.P.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.Q.post(new qh1(0, this, new ni1(1, new gf(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}