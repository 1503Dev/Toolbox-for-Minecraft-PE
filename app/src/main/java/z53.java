package defpackage;

/* renamed from: z53  reason: default package */
public final class z53 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ z53(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new y53(((s23) ((uj5) this.b)).c());
            case 1:
                return new st3(((t23) ((uj5) this.b)).a());
            default:
                return ((zg3) this.b).l;
        }
    }
}