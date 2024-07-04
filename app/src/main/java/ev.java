package defpackage;

import defpackage.cv;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ev  reason: default package */
public final class ev extends a70 {
    public final /* synthetic */ boolean Q = false;
    public final /* synthetic */ bp5 R;
    public final /* synthetic */ cv.e S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(cv.e eVar, Object[] objArr, bp5 bp5Var) {
        super("OkHttp %s ACK Settings", objArr);
        this.S = eVar;
        this.R = bp5Var;
    }

    @Override // defpackage.a70
    public final void b() {
        iv[] ivVarArr;
        long j;
        cv.e eVar = this.S;
        boolean z = this.Q;
        bp5 bp5Var = this.R;
        synchronized (cv.this.j0) {
            synchronized (cv.this) {
                int a = cv.this.h0.a();
                if (z) {
                    bp5 bp5Var2 = cv.this.h0;
                    bp5Var2.P = 0;
                    Arrays.fill((int[]) bp5Var2.Q, 0);
                }
                bp5 bp5Var3 = cv.this.h0;
                bp5Var3.getClass();
                int i = 0;
                while (true) {
                    boolean z2 = true;
                    if (i >= 10) {
                        break;
                    }
                    if (((1 << i) & bp5Var.P) == 0) {
                        z2 = false;
                    }
                    if (z2) {
                        bp5Var3.b(i, ((int[]) bp5Var.Q)[i]);
                    }
                    i++;
                }
                int a2 = cv.this.h0.a();
                ivVarArr = null;
                if (a2 != -1 && a2 != a) {
                    j = a2 - a;
                    if (!cv.this.R.isEmpty()) {
                        ivVarArr = (iv[]) cv.this.R.values().toArray(new iv[cv.this.R.size()]);
                    }
                } else {
                    j = 0;
                }
            }
            try {
                cv cvVar = cv.this;
                cvVar.j0.a(cvVar.h0);
            } catch (IOException e) {
                cv.this.a(2, 2, e);
            }
        }
        if (ivVarArr != null) {
            for (iv ivVar : ivVarArr) {
                synchronized (ivVar) {
                    ivVar.b += j;
                    if (j > 0) {
                        ivVar.notifyAll();
                    }
                }
            }
        }
        cv.m0.execute(new fv(eVar, cv.this.S));
    }
}