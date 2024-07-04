package defpackage;

/* renamed from: xl1  reason: default package */
public final class xl1 implements ml1 {
    public final long a;
    public final /* synthetic */ hm1 b;

    public xl1(hm1 hm1Var, long j) {
        this.b = hm1Var;
        this.a = j;
    }

    @Override // defpackage.ml1
    public final long b() {
        return this.a;
    }

    @Override // defpackage.ml1
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ml1
    public final kl1 g(long j) {
        kl1 a = this.b.g[0].a(j);
        int i = 1;
        while (true) {
            km1[] km1VarArr = this.b.g;
            if (i < km1VarArr.length) {
                kl1 a2 = km1VarArr[i].a(j);
                if (a2.a.b < a.a.b) {
                    a = a2;
                }
                i++;
            } else {
                return a;
            }
        }
    }
}