package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.concurrent.Callable;

/* renamed from: a03  reason: default package */
public final /* synthetic */ class a03 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a03(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        switch (this.a) {
            case 0:
                b03 b03Var = (b03) this.b;
                b03Var.getClass();
                u42 u42Var = jv5.A.i;
                y42 y42Var = b03Var.m;
                synchronized (u42Var.c) {
                    j = -2;
                    if (u42Var.f != null && u42Var.d.B()) {
                        try {
                            a52 a52Var = u42Var.f;
                            Parcel A = a52Var.A();
                            k22.c(A, y42Var);
                            Parcel Z = a52Var.Z(A, 3);
                            long readLong = Z.readLong();
                            Z.recycle();
                            j = readLong;
                        } catch (RemoteException e) {
                            sv2.e("Unable to call into cache service.", e);
                        }
                    }
                }
                return Long.valueOf(j);
            default:
                return new l74(1, "requester_type_2".equals(xi4.b(((ha4) this.b).b.d)));
        }
    }
}