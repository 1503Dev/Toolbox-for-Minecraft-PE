package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.Mac;

/* renamed from: ij2  reason: default package */
public final class ij2 implements ex2, wg3, h23, d55, fc5, o74, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public ij2() {
        this.P = 8;
        this.Q = new LinkedHashSet();
    }

    @Override // defpackage.d55
    public final na3 a(byte[] bArr) {
        byte[] q = v32.q();
        byte[] m = v32.m(q, bArr);
        byte[] s = v32.s(q);
        byte[] C = mh.C(s, bArr);
        byte[] C2 = mh.C(j55.m, j55.b);
        bm1 bm1Var = (bm1) this.Q;
        int macLength = Mac.getInstance(bm1Var.a).getMacLength();
        return new na3(3, bm1Var.b(macLength, bm1Var.c(mh.C(j55.o, C2, "eae_prk".getBytes(y65.a), m), null), j55.c("shared_secret", C, C2, macLength)), s);
    }

    public final synchronized void b(lm0 lm0Var) {
        ((Set) this.Q).remove(lm0Var);
    }

    @Override // defpackage.d55
    public final byte[] c() {
        if (Arrays.equals(((bm1) this.Q).a(), j55.f)) {
            return j55.b;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    @Override // defpackage.h23
    public final void d(boolean z) {
        ax2 ax2Var = (ax2) this.Q;
        if (z) {
            ax2Var.d();
        } else {
            ax2Var.c(new l44(1, "Image Web View failed to load."));
        }
    }

    @Override // defpackage.ex2
    public final void e(Object obj) {
        switch (this.P) {
            case 0:
                sj2 sj2Var = (sj2) obj;
                vz3.k("Releasing engine reference.");
                ((jj2) this.Q).S.k();
                return;
            case 1:
                ((rd3) obj).p((tz3) this.Q);
                return;
            default:
                jo5 jo5Var = (jo5) obj;
                return;
        }
    }

    @Override // defpackage.o74
    public final void f(Object obj, hp1 hp1Var) {
        b53 b53Var = (b53) obj;
    }

    @Override // defpackage.fc5
    public final Object m(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        gc5 gc5Var = gc5.b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return ((hc5) this.Q).c(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public /* synthetic */ ij2(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    public /* synthetic */ ij2(hc5 hc5Var) {
        this.P = 4;
        this.Q = hc5Var;
    }

    public /* synthetic */ ij2(io5 io5Var) {
        this.P = 6;
        this.Q = io5Var;
    }
}