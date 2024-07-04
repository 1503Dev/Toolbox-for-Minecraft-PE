package defpackage;

/* renamed from: gp1  reason: default package */
public final class gp1 implements lj5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gp1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.uj5
    public final Object c() {
        char c;
        switch (this.a) {
            case 0:
                String str = ((go1) this.b).a;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            if (c != 3) {
                                return s52.Q;
                            }
                            return s52.X;
                        }
                        return s52.W;
                    }
                    return s52.T;
                }
                return s52.R;
            case 1:
                String str2 = n62.f.c;
                tv2.C(str2);
                return str2;
            case 2:
                return ((zg3) this.b).a;
            case 3:
                String str3 = ((sp2) ((id4) this.b).Q).U;
                tv2.C(str3);
                return str3;
            default:
                return new qm4((rm4) ((uj5) this.b).c());
        }
    }
}