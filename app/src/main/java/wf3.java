package defpackage;

/* renamed from: wf3  reason: default package */
public final class wf3 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;

    public /* synthetic */ wf3(uj5 uj5Var, int i) {
        this.a = i;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final /* bridge */ /* synthetic */ Object c() {
        switch (this.a) {
            case 0:
                return new vf3(((sj5) this.b).c());
            default:
                return new if4((tj4) this.b.c());
        }
    }
}