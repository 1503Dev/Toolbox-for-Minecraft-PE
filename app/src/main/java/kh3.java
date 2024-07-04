package defpackage;

/* renamed from: kh3  reason: default package */
public final class kh3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return ((zg3) this.b).j;
            case 1:
                return new kc4((zg4) ((uj5) this.b).c());
            default:
                return dk.a;
        }
    }
}