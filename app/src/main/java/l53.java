package defpackage;

/* renamed from: l53  reason: default package */
public final class l53 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ l53(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new dl2(((t23) ((uj5) this.b)).a());
            case 1:
                if (((ed3) ((uj5) this.b)).a().o.P == 3) {
                    return s52.b0;
                }
                return s52.X;
            case 2:
                yw2 yw2Var = zw2.a;
                tv2.C(yw2Var);
                return new pa4(yw2Var);
            default:
                return ((zg3) this.b).m;
        }
    }
}