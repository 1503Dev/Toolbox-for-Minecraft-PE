package defpackage;

/* renamed from: t91  reason: default package */
public final class t91 implements zc1 {
    public final /* synthetic */ v91 a;

    public t91(v91 v91Var) {
        this.a = v91Var;
    }

    @Override // defpackage.zc1
    public final void a(rc1 rc1Var) {
        if (v91.a(this.a, rc1Var)) {
            v91 v91Var = this.a;
            if (v91Var.o0) {
                if (v91Var.k0) {
                    v91Var.k0 = false;
                }
                v91Var.F0 = rc1Var;
                int l = rc1Var.b.l("time");
                int duration = v91Var.C0.getDuration() / 1000;
                v91Var.C0.setOnSeekCompleteListener(v91Var);
                v91Var.C0.seekTo(l * 1000);
                if (duration == l) {
                    v91Var.k0 = true;
                }
            }
        }
    }
}