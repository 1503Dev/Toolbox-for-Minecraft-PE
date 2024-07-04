package defpackage;

/* renamed from: oq1  reason: default package */
public final /* synthetic */ class oq1 implements at4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oq1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.at4
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return (xq1) obj;
            case 1:
                ((ue4) this.b).a.f("TrustlessTokenSignal", (Exception) obj);
                return null;
            default:
                dk4 dk4Var = (dk4) this.b;
                dk4Var.c = (ea3) obj;
                return dk4Var;
        }
    }
}