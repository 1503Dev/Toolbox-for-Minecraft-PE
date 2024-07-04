package defpackage;

/* renamed from: ih3  reason: default package */
public final class ih3 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ih3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return ((zg3) this.b).c;
            default:
                return new qm4((rm4) ((uj5) this.b).c());
        }
    }
}