package defpackage;

import java.security.spec.KeySpec;

/* renamed from: qj0  reason: default package */
public final class qj0 implements KeySpec {
    public short[][] P;
    public short[][] Q;
    public short[] R;
    public int S;

    public qj0(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.S = i;
        this.P = sArr;
        this.Q = sArr2;
        this.R = sArr3;
    }
}