package defpackage;

import java.util.Arrays;

/* renamed from: z35  reason: default package */
public final class z35 extends w35 {
    public z35(byte[] bArr, int i) {
        super(bArr, i);
    }

    @Override // defpackage.w35
    public final int a() {
        return 24;
    }

    @Override // defpackage.w35
    public final int[] b(int[] iArr, int i) {
        int length = iArr.length;
        if (length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = this.a;
            int[] iArr4 = r35.a;
            System.arraycopy(iArr4, 0, r1, 0, iArr4.length);
            System.arraycopy(iArr3, 0, r1, iArr4.length, 8);
            int[] iArr5 = {0, 0, 0, 0, iArr5[12], iArr5[13], iArr5[14], iArr5[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            r35.b(iArr5);
            int[] copyOf = Arrays.copyOf(iArr5, 8);
            System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
            System.arraycopy(copyOf, 0, iArr2, iArr4.length, 8);
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
    }
}