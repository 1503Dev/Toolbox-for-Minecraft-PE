package defpackage;

import java.io.Serializable;

/* renamed from: v81  reason: default package */
public final class v81 implements Serializable {
    public final int P;
    public final byte[] Q;

    public v81(byte[] bArr, int i) {
        this.P = i;
        this.Q = bArr;
    }

    /* renamed from: a */
    public final v81 clone() {
        return new v81(b(), this.P);
    }

    public final byte[] b() {
        return vj.j(this.Q);
    }
}