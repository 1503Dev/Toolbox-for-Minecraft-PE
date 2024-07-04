package defpackage;

/* renamed from: b93  reason: default package */
public final class b93 implements lj5 {
    public final /* synthetic */ int a;
    public final uj5 b;
    public final Object c;

    public /* synthetic */ b93(Object obj, uj5 uj5Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = uj5Var;
    }

    @Override // defpackage.uj5
    public final Object c() {
        switch (this.a) {
            case 0:
                final bf3 bf3Var = (bf3) ((y93) this.b).a.P;
                return new ii3(new qf3() { // from class: p83
                    @Override // defpackage.qf3
                    public final void a() {
                        bf3 bf3Var2 = bf3.this;
                        synchronized (bf3Var2) {
                            bf3Var2.U = false;
                            bf3Var2.T0(0L);
                        }
                    }
                }, zw2.f);
            default:
                return new ii3((xj3) this.b.c(), zw2.e);
        }
    }
}