package defpackage;

import com.mojang.minecraftpe.MainActivity;
import defpackage.iy0;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: s30  reason: default package */
public final /* synthetic */ class s30 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ s30(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int l0;
        byte[] N0;
        switch (this.P) {
            case 0:
                ((MainActivity) this.Q).lambda$setTextBoxBackend$2((String) this.R);
                return;
            default:
                d dVar = (d) this.Q;
                tv0 tv0Var = (tv0) this.R;
                iy0.a M = ((iy0) dVar.o).M();
                if (M != null) {
                    l0 = iy0.l0(M.a);
                    iy0.d P = ((iy0) dVar.o).P(0, 0, 0);
                    P.getClass();
                    N0 = iy0.N0((ze) tv0Var);
                    if (N0 != null) {
                        iy0.u0(P.a, N0);
                    }
                    iy0.C0(M.a, l0, P.a);
                    return;
                }
                return;
        }
    }
}