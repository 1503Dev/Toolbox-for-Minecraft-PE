package defpackage;

import android.os.Parcel;
import java.io.InputStream;
import java.io.InputStreamReader;

/* renamed from: qh2  reason: default package */
public final class qh2 implements ky4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public qh2(jh2 jh2Var) {
        this.b = jh2Var;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        switch (this.a) {
            case 0:
                oh2 oh2Var = (oh2) obj;
                bx2 bx2Var = new bx2();
                ph2 ph2Var = new ph2(bx2Var);
                Parcel A = oh2Var.A();
                k22.c(A, (jh2) this.b);
                k22.e(A, ph2Var);
                oh2Var.b2(A, 2);
                return bx2Var;
            default:
                return zw4.C(new hi4(new s41(((mv3) this.b).c), fn2.a(new InputStreamReader((InputStream) obj))));
        }
    }

    public /* synthetic */ qh2(mv3 mv3Var) {
        this.b = mv3Var;
    }
}