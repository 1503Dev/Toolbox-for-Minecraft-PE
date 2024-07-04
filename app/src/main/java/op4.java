package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: op4  reason: default package */
public final class op4 {
    public final Context a;
    public final Executor b;
    public final dp4 c;
    public final mp4 d;
    public final np4 e;
    public ay5 f;
    public ay5 g;

    public op4(Context context, ExecutorService executorService, dp4 dp4Var, fp4 fp4Var, mp4 mp4Var, np4 np4Var) {
        this.a = context;
        this.b = executorService;
        this.c = dp4Var;
        this.d = mp4Var;
        this.e = np4Var;
    }

    public static op4 a(Context context, ExecutorService executorService, dp4 dp4Var, fp4 fp4Var) {
        ay5 ay5Var;
        op4 op4Var = new op4(context, executorService, dp4Var, fp4Var, new mp4(), new np4());
        if (fp4Var.b) {
            ay5Var = op4Var.b(new n04(3, op4Var));
        } else {
            ey1 ey1Var = mp4.a;
            ay5 ay5Var2 = new ay5();
            ay5Var2.n(ey1Var);
            ay5Var = ay5Var2;
        }
        op4Var.f = ay5Var;
        op4Var.g = op4Var.b(new m74(2, op4Var));
        return op4Var;
    }

    public final ay5 b(Callable callable) {
        Executor executor = this.b;
        uf0.g(executor, "Executor must not be null");
        ay5 ay5Var = new ay5();
        executor.execute(new yk5(6, ay5Var, callable));
        ay5Var.d(this.b, new s82(9, this));
        return ay5Var;
    }
}