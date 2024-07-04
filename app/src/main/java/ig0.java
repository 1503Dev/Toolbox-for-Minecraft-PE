package defpackage;

import java.io.IOException;

/* renamed from: ig0  reason: default package */
public enum ig0 {
    HTTP_1_0(0),
    HTTP_1_1(1),
    SPDY_3(2),
    HTTP_2(3),
    H2_PRIOR_KNOWLEDGE(4),
    QUIC(5);
    
    public final String P;

    ig0(int i) {
        this.P = r2;
    }

    public static ig0 b(String str) {
        ig0 ig0Var = HTTP_1_0;
        if (str.equals("http/1.0")) {
            return ig0Var;
        }
        ig0 ig0Var2 = HTTP_1_1;
        if (str.equals("http/1.1")) {
            return ig0Var2;
        }
        ig0 ig0Var3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals("h2_prior_knowledge")) {
            return ig0Var3;
        }
        ig0 ig0Var4 = HTTP_2;
        if (str.equals("h2")) {
            return ig0Var4;
        }
        ig0 ig0Var5 = SPDY_3;
        if (str.equals("spdy/3.1")) {
            return ig0Var5;
        }
        ig0 ig0Var6 = QUIC;
        if (str.equals("quic")) {
            return ig0Var6;
        }
        throw new IOException(k6.b("Unexpected protocol: ", str));
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.P;
    }
}