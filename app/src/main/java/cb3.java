package defpackage;

/* renamed from: cb3  reason: default package */
public final /* synthetic */ class cb3 implements ky4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cb3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ky4
    public final dz4 e(Object obj) {
        switch (this.a) {
            case 0:
                return ((dw3) this.b).a((rq2) obj);
            default:
                dz4 dz4Var = (dz4) this.b;
                if (obj == null) {
                    return new yy4(new l44(1, "Retrieve required value in native ad response failed."));
                }
                return dz4Var;
        }
    }
}