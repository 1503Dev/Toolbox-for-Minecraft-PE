package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* renamed from: mu2  reason: default package */
public final class mu2 implements ta0, nk1, wg3, qt4, o55 {
    public static final /* synthetic */ mu2 P = new mu2();
    public static final in4 Q = new in4();
    public static final /* synthetic */ mu2 R = new mu2();
    public static final /* synthetic */ mu2 S = new mu2();
    public static final gg5 T = new gg5();
    public static final hg5 U = new hg5();

    @Override // defpackage.qt4
    public Object a() {
        return -1;
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        z25 z25Var;
        f65 f65Var = c35.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                p95 z = p95.z(((p65) r65Var).c, ud5.c);
                if (z.w() == 0) {
                    int i = ((p65) r65Var).e;
                    int b = cm0.b(i);
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    int a = e1.a(i);
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a);
                                }
                            } else {
                                z25Var = z25.d;
                            }
                        }
                        z25Var = z25.c;
                    } else {
                        z25Var = z25.b;
                    }
                    return v25.q(z25Var, ee4.d(z.A().g()), ((p65) r65Var).f);
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (te5 unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
    }

    @Override // defpackage.ta0
    public Object d() {
        return new ConcurrentHashMap();
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((zg2) obj).c();
    }

    @Override // defpackage.nk1
    public void j() {
    }

    @Override // defpackage.nk1
    public void n(ml1 ml1Var) {
    }

    @Override // defpackage.nk1
    public pl1 q(int i, int i2) {
        return new kk1();
    }
}