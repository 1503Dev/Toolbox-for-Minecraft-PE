package defpackage;

import defpackage.za;

/* renamed from: e61  reason: default package */
public final class e61 {
    public static String a(int i) {
        StringBuilder sb;
        if (i < 1000 || i >= 5000) {
            sb = new StringBuilder();
            sb.append("Code must be in range [1000,5000): ");
            sb.append(i);
        } else if ((i < 1004 || i > 1006) && (i < 1012 || i > 2999)) {
            return null;
        } else {
            sb = new StringBuilder();
            sb.append("Code ");
            sb.append(i);
            sb.append(" is reserved and may not be used.");
        }
        return sb.toString();
    }

    public static void b(za.b bVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = bVar.T;
            int i2 = bVar.U;
            int i3 = bVar.V;
            while (i2 < i3) {
                int i4 = i % length;
                bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                i2++;
                i = i4 + 1;
            }
            j = bVar.S;
            if (j == bVar.P.Q) {
                throw new IllegalStateException();
            }
        } while (bVar.a(j == -1 ? 0L : j + (bVar.V - bVar.U)) != -1);
    }
}