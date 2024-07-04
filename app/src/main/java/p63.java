package defpackage;

/* renamed from: p63  reason: default package */
public final class p63 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ p63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                return new o63((cu3) ((uj5) this.b).c());
            case 1:
                return ((g83) ((uj5) this.b)).c();
            case 2:
                return new xe3(((sj5) ((uj5) this.b)).c());
            case 3:
                return new ni3(((sj5) ((uj5) this.b)).c());
            default:
                String str = ((wp2) ((ee4) this.b).Q).V;
                tv2.C(str);
                return str;
        }
    }
}