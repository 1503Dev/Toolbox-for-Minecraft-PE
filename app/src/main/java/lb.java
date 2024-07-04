package defpackage;

import javax.annotation.Nullable;

/* renamed from: lb  reason: default package */
public final class lb {
    @Nullable
    public final uk0 a;
    @Nullable
    public final nl0 b;

    public lb(uk0 uk0Var, nl0 nl0Var) {
        this.a = uk0Var;
        this.b = nl0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004e, code lost:
        if (r4.a().e == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(uk0 uk0Var, nl0 nl0Var) {
        int i = nl0Var.R;
        if (i != 200 && i != 410 && i != 414 && i != 501 && i != 203 && i != 204) {
            if (i != 307) {
                if (i != 308 && i != 404 && i != 405) {
                    switch (i) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (nl0Var.d("Expires") == null) {
                if (nl0Var.a().c == -1) {
                    if (!nl0Var.a().f) {
                    }
                }
            }
        }
        if (nl0Var.a().b) {
            return false;
        }
        hb hbVar = uk0Var.f;
        if (hbVar == null) {
            hbVar = hb.a(uk0Var.c);
            uk0Var.f = hbVar;
        }
        if (hbVar.b) {
            return false;
        }
        return true;
    }
}