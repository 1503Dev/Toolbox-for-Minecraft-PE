package defpackage;

import com.mojang.minecraftpe.MainActivity;
import java.util.regex.Pattern;

/* renamed from: m30  reason: default package */
public final /* synthetic */ class m30 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ m30(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((MainActivity) this.Q).lambda$hideKeyboard$3();
                return;
            case 1:
                Pattern pattern = dz.f;
                ((jl) this.Q).R(null);
                return;
            case 2:
                int i = t90.b;
                ((t90) this.Q).getContentView().setSystemUiVisibility(5894);
                return;
            default:
                vs0.l.remove(((vs0) this.Q).a);
                return;
        }
    }
}