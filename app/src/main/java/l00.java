package defpackage;

/* renamed from: l00  reason: default package */
public final class l00 {
    public final tl a;
    public final int b;

    public l00(int i, tl tlVar) {
        if (tlVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.a = tlVar;
        this.b = i;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.b) {
            if (bArr2.length == 32) {
                return b(3, bArr, bArr2);
            }
            throw new IllegalArgumentException("wrong address length");
        }
        throw new IllegalArgumentException("wrong key length");
    }

    public final byte[] b(int i, byte[] bArr, byte[] bArr2) {
        byte[] G = vj.G(i, this.b);
        this.a.update(G, 0, G.length);
        this.a.update(bArr, 0, bArr.length);
        this.a.update(bArr2, 0, bArr2.length);
        int i2 = this.b;
        byte[] bArr3 = new byte[i2];
        tl tlVar = this.a;
        if (tlVar instanceof g91) {
            ((g91) tlVar).a(bArr3, i2);
        } else {
            tlVar.d(bArr3);
        }
        return bArr3;
    }
}