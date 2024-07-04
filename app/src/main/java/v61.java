package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* renamed from: v61  reason: default package */
public final class v61 implements Runnable {
    public static final String V = y20.e("WorkForegroundRunnable");
    public final yq0<Void> P = new yq0<>();
    public final Context Q;
    public final l71 R;
    public final ListenableWorker S;
    public final er T;
    public final bw0 U;

    /* renamed from: v61$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ yq0 P;

        public a(yq0 yq0Var) {
            this.P = yq0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.P.l(v61.this.S.getForegroundInfoAsync());
        }
    }

    /* renamed from: v61$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements Runnable {
        public final /* synthetic */ yq0 P;

        public b(yq0 yq0Var) {
            this.P = yq0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                br brVar = (br) this.P.get();
                if (brVar != null) {
                    y20.c().a(v61.V, String.format("Updating notification for %s", v61.this.R.c), new Throwable[0]);
                    v61.this.S.setRunInForeground(true);
                    v61 v61Var = v61.this;
                    yq0<Void> yq0Var = v61Var.P;
                    er erVar = v61Var.T;
                    Context context = v61Var.Q;
                    UUID id = v61Var.S.getId();
                    x61 x61Var = (x61) erVar;
                    x61Var.getClass();
                    yq0 yq0Var2 = new yq0();
                    ((b71) x61Var.a).a(new w61(x61Var, yq0Var2, id, brVar, context));
                    yq0Var.l(yq0Var2);
                    return;
                }
                throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", v61.this.R.c));
            } catch (Throwable th) {
                v61.this.P.k(th);
            }
        }
    }

    @SuppressLint({"LambdaLast"})
    public v61(Context context, l71 l71Var, ListenableWorker listenableWorker, er erVar, bw0 bw0Var) {
        this.Q = context;
        this.R = l71Var;
        this.S = listenableWorker;
        this.T = erVar;
        this.U = bw0Var;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (this.R.q && !cb.a()) {
            yq0 yq0Var = new yq0();
            ((b71) this.U).c.execute(new a(yq0Var));
            yq0Var.c(new b(yq0Var), ((b71) this.U).c);
            return;
        }
        this.P.j(null);
    }
}