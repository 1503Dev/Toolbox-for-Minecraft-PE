package defpackage;

import android.os.AsyncTask;
import defpackage.yz0;
import io.mrarm.mctoolbox.ErrorActivity;
import java.io.IOException;
import java.util.List;

/* renamed from: zo  reason: default package */
public final /* synthetic */ class zo implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ zo(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                int i = ErrorActivity.d0;
                ((ErrorActivity) this.Q).r("com.mojang.minecraftpe");
                return;
            case 1:
                yz0 yz0Var = (yz0) this.Q;
                yz0Var.getClass();
                yz0.a aVar = new yz0.a();
                xz0 xz0Var = yz0Var.c;
                aVar.a = xz0Var.g.b;
                aVar.b = xz0Var.k;
                aVar.c = xz0Var.i;
                AsyncTask.SERIAL_EXECUTOR.execute(new lx(2, yz0Var, yz0Var.b.i(aVar)));
                yz0Var.f = true;
                return;
            default:
                ek0 ek0Var = (ek0) this.Q;
                List<ig0> list = ek0.v;
                ek0Var.getClass();
                do {
                    try {
                    } catch (IOException e) {
                        ek0Var.c(e, null);
                        return;
                    }
                } while (ek0Var.g());
                return;
        }
    }
}