package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* renamed from: io1  reason: default package */
public final class io1 extends q52 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ wk2 c;

    public io1(Context context, tk2 tk2Var) {
        this.b = context;
        this.c = tk2Var;
    }

    @Override // defpackage.q52
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // defpackage.q52
    public final Object b(h03 h03Var) {
        return h03Var.P1(new va0(this.b), this.c, 231004000);
    }

    @Override // defpackage.q52
    public final Object c() {
        ju2 hu2Var;
        va0 va0Var = new va0(this.b);
        try {
            try {
                IBinder b = vv2.a(this.b).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = iu2.P;
                if (b == null) {
                    hu2Var = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    if (queryLocalInterface instanceof ju2) {
                        hu2Var = (ju2) queryLocalInterface;
                    } else {
                        hu2Var = new hu2(b);
                    }
                }
                return hu2Var.V(va0Var, this.c);
            } catch (Exception e) {
                throw new uv2(e);
            }
        } catch (RemoteException | NullPointerException | uv2 unused) {
            return null;
        }
    }
}