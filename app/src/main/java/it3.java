package defpackage;

import android.os.Parcel;
import android.os.SystemClock;

/* renamed from: it3  reason: default package */
public final class it3 extends j22 implements ai2 {
    public final /* synthetic */ Object P;
    public final /* synthetic */ String Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ hm4 S;
    public final /* synthetic */ bx2 T;
    public final /* synthetic */ jt3 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it3(long j, bx2 bx2Var, jt3 jt3Var, hm4 hm4Var, Object obj, String str) {
        super("com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
        this.U = jt3Var;
        this.P = obj;
        this.Q = str;
        this.R = j;
        this.S = hm4Var;
        this.T = bx2Var;
    }

    @Override // defpackage.ai2
    public final void D(String str) {
        synchronized (this.P) {
            jt3 jt3Var = this.U;
            String str2 = this.Q;
            jv5.A.j.getClass();
            jt3Var.d(str2, (int) (SystemClock.elapsedRealtime() - this.R), str, false);
            this.U.l.a(this.Q, "error");
            this.U.o.B(this.Q, "error");
            rm4 rm4Var = this.U.p;
            hm4 hm4Var = this.S;
            hm4Var.H(str);
            hm4Var.k0(false);
            rm4Var.c(hm4Var.n());
            this.T.a(Boolean.FALSE);
        }
    }

    @Override // defpackage.j22
    public final boolean s4(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            String readString = parcel.readString();
            k22.b(parcel);
            D(readString);
        } else {
            synchronized (this.P) {
                jt3 jt3Var = this.U;
                String str = this.Q;
                jv5.A.j.getClass();
                jt3Var.d(str, (int) (SystemClock.elapsedRealtime() - this.R), "", true);
                this.U.l.c(this.Q);
                this.U.o.P(this.Q);
                rm4 rm4Var = this.U.p;
                hm4 hm4Var = this.S;
                hm4Var.k0(true);
                rm4Var.c(hm4Var.n());
                this.T.a(Boolean.TRUE);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}