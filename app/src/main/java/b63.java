package defpackage;

/* renamed from: b63  reason: default package */
public final class b63 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new a63(((s23) ((uj5) this.b)).c());
            case 1:
                return new jk2(((zj2) ((uj5) this.b).c()).a);
            case 2:
                return new zd3(((sj5) ((uj5) this.b)).c());
            case 3:
                return new pf3(((sj5) ((uj5) this.b)).c());
            default:
                return ((zg3) this.b).k;
        }
    }
}