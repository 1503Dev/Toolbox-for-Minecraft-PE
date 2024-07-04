package defpackage;

/* renamed from: h55  reason: default package */
public final class h55 extends k65 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h55(Class cls, int i) {
        super(cls);
        this.b = i;
    }

    @Override // defpackage.k65
    public final Object a(nf5 nf5Var) {
        boolean z;
        switch (this.b) {
            case 0:
                ra5 ra5Var = (ra5) nf5Var;
                if (ra5Var.C().o() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    na5 x = ra5Var.x();
                    return new c55(ra5Var, zw4.t(x), zw4.v(x), zw4.o(x));
                }
                throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
            default:
                f85 f85Var = (f85) nf5Var;
                return new mc5(new jc5(f85Var.B().g()), f85Var.A().w());
        }
    }
}