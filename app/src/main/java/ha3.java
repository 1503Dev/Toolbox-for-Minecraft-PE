package defpackage;

/* renamed from: ha3  reason: default package */
public final class ha3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ha3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new fa3(((oj5) ((uj5) this.b)).c());
            case 1:
                return new qi3(((sj5) ((uj5) this.b)).c());
            default:
                return jv5.A.g;
        }
    }
}