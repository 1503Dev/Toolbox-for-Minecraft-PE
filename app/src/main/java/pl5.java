package defpackage;

import java.util.Arrays;

/* renamed from: pl5  reason: default package */
public final class pl5 extends al5 {
    public final byte[] Q;

    public pl5(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.Q = bArr;
    }

    @Override // defpackage.al5
    public final byte[] c0() {
        return this.Q;
    }
}