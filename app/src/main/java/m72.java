package defpackage;

/* renamed from: m72  reason: default package */
public enum m72 implements ke5 {
    Q("UNSPECIFIED"),
    R("CONNECTING"),
    S("CONNECTED"),
    T("DISCONNECTING"),
    U("DISCONNECTED"),
    V("SUSPENDED");
    
    public final int P;

    m72(String str) {
        this.P = r2;
    }

    public static m72 b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return null;
                            }
                            return V;
                        }
                        return U;
                    }
                    return T;
                }
                return S;
            }
            return R;
        }
        return Q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.P);
    }
}