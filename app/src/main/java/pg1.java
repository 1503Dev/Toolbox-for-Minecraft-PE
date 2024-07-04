package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: pg1  reason: default package */
public class pg1 extends Binder implements IInterface {
    public pg1() {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i > 16777215) {
            if (super.onTransact(i, parcel, parcel2, i2)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        xh1 xh1Var = (xh1) this;
        switch (i) {
            case 3:
                gf gfVar = (gf) hh1.a(parcel, gf.CREATOR);
                gg1 gg1Var = (gg1) hh1.a(parcel, gg1.CREATOR);
                break;
            case 4:
            case 6:
                Status status = (Status) hh1.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 7:
                Status status2 = (Status) hh1.a(parcel, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) hh1.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                sh1 sh1Var = (sh1) xh1Var;
                sh1Var.Q.post(new qh1(0, sh1Var, (ni1) hh1.a(parcel, ni1.CREATOR)));
                break;
            case 9:
                di1 di1Var = (di1) hh1.a(parcel, di1.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}