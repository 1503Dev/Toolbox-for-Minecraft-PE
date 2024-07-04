package defpackage;

/* renamed from: ux2  reason: default package */
public final /* synthetic */ class ux2 implements Runnable {
    public final /* synthetic */ vx2 P;

    public /* synthetic */ ux2(vx2 vx2Var) {
        this.P = vx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.P.c("firstFrameRendered", new String[0]);
    }
}