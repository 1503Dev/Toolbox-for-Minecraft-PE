package defpackage;

/* renamed from: a33  reason: default package */
public final class a33 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ a33(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                r23 r23Var = (r23) this.b;
                return new rz1(new el5(r23Var.b, r23Var.a));
            default:
                return new ll3(new dl3(((yl3) ((el3) ((uj5) this.b)).a).a()));
        }
    }
}