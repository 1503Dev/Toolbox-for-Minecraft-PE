package defpackage;

/* renamed from: ws1 */
public final class ws1 extends n16 {
    public ws1(km4 km4Var, long j, long j2) {
        super(new v32(), new vs1(km4Var), j, j + 1, 0L, j2, 188L, 1000);
    }

    public static /* bridge */ /* synthetic */ int d(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}