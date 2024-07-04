package defpackage;

import androidx.work.WorkerParameters;

/* renamed from: rt0  reason: default package */
public final class rt0 implements Runnable {
    public a71 P;
    public String Q;
    public WorkerParameters.a R;

    public rt0(a71 a71Var, String str, WorkerParameters.a aVar) {
        this.P = a71Var;
        this.Q = str;
        this.R = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.P.k.f(this.Q, this.R);
    }
}