package defpackage;

import android.util.Base64;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

/* renamed from: w74  reason: default package */
public final class w74 implements nc4 {
    public final ez4 a;
    public final li4 b;

    public w74(yw2 yw2Var, li4 li4Var) {
        this.a = yw2Var;
        this.b = li4Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 5;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: v74
            /* JADX WARN: Removed duplicated region for block: B:36:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object call() {
                String str;
                w74 w74Var = w74.this;
                w74Var.getClass();
                if (((Boolean) w82.d.c.a(x92.f6)).booleanValue() && "requester_type_2".equals(xi4.b(w74Var.b.d))) {
                    ed5 ed5Var = gd5.Q;
                    fd5 fd5Var = new fd5();
                    try {
                        ab5 ab5Var = m05.b(i05.a("AES128_GCM")).a;
                        try {
                            ab5Var.getClass();
                            int d = ab5Var.d();
                            Logger logger = qd5.R;
                            if (d > 4096) {
                                d = 4096;
                            }
                            pd5 pd5Var = new pd5(fd5Var, d);
                            ab5Var.p(pd5Var);
                            if (pd5Var.V > 0) {
                                pd5Var.L();
                            }
                            fd5Var.close();
                        } catch (Throwable th) {
                            fd5Var.close();
                            throw th;
                        }
                    } catch (IOException e) {
                        e = e;
                        vz3.k("Failed to generate key".concat(e.toString()));
                        jv5.A.g.f("CryptoUtils.generateKey", e);
                        str = Base64.encodeToString(fd5Var.a().g(), 11);
                        synchronized (fd5Var) {
                        }
                    } catch (GeneralSecurityException e2) {
                        e = e2;
                        vz3.k("Failed to generate key".concat(e.toString()));
                        jv5.A.g.f("CryptoUtils.generateKey", e);
                        str = Base64.encodeToString(fd5Var.a().g(), 11);
                        synchronized (fd5Var) {
                        }
                    }
                    str = Base64.encodeToString(fd5Var.a().g(), 11);
                    synchronized (fd5Var) {
                        fd5Var.Q.clear();
                        fd5Var.R = 0;
                        fd5Var.T = 0;
                    }
                } else {
                    str = null;
                }
                return new x74(str);
            }
        });
    }
}