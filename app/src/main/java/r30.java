package defpackage;

import com.mojang.minecraftpe.MainActivity;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: r30  reason: default package */
public final /* synthetic */ class r30 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ r30(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((MainActivity) this.Q).lambda$updateTextboxText$4((String) this.R);
                return;
            default:
                d dVar = (d) this.Q;
                tv0 tv0Var = (tv0) this.R;
                if (dVar.r.Q == 0) {
                    dVar.j(tv0Var);
                    return;
                }
                return;
        }
    }
}