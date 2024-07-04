package defpackage;

/* renamed from: ts4  reason: default package */
public final class ts4 extends ss4 {
    public final char P;

    public ts4(char c) {
        this.P = c;
    }

    @Override // defpackage.ys4
    public final boolean a(char c) {
        return c == this.P;
    }

    public final String toString() {
        int i = this.P;
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i2 = 0; i2 < 4; i2++) {
            cArr[5 - i2] = "0123456789ABCDEF".charAt(i & 15);
            i >>= 4;
        }
        return ij.c("CharMatcher.is('", String.copyValueOf(cArr), "')");
    }
}