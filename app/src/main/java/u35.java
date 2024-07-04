package defpackage;

/* renamed from: u35  reason: default package */
public final class u35 extends w35 {
    public u35(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.w35
    public final int a() {
        return 12;
    }

    @Override // defpackage.w35
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.a;
            int[] iArr4 = r35.a;
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, 3);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}