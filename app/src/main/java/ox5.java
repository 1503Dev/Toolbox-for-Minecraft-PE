package defpackage;

/* renamed from: ox5  reason: default package */
public final /* synthetic */ class ox5 implements ht4 {
    public final /* synthetic */ oy5 P;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
        if (r2 != 3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0089, code lost:
        if (r0.g.d(r0.h, r10) != false) goto L56;
     */
    @Override // defpackage.ht4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(Object obj) {
        boolean z;
        char c;
        oy5 oy5Var = this.P;
        cu1 cu1Var = (cu1) obj;
        synchronized (oy5Var.c) {
            z = false;
            if (oy5Var.f.n && !oy5Var.e && cu1Var.x > 2) {
                String str = cu1Var.k;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -2123537834:
                            if (str.equals("audio/eac3-joc")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078296:
                            if (str.equals("audio/ac3")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 187078297:
                            if (str.equals("audio/ac4")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1504578661:
                            if (str.equals("audio/eac3")) {
                                c = 1;
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
                            }
                        }
                    }
                    if (zn4.a >= 32) {
                        hy5 hy5Var = oy5Var.g;
                        if (hy5Var != null) {
                            if (!hy5Var.b) {
                            }
                        }
                    }
                }
                if (zn4.a >= 32) {
                    hy5 hy5Var2 = oy5Var.g;
                    if (hy5Var2 != null) {
                        if (hy5Var2.b) {
                            if (hy5Var2.e()) {
                                if (oy5Var.g.f()) {
                                }
                            }
                        }
                    }
                }
            }
            z = true;
        }
        return z;
    }
}