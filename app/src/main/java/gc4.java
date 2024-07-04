package defpackage;

/* renamed from: gc4  reason: default package */
public final class gc4 {
    public int a;
    public long[] b = new long[32];

    public final long a(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException(dp.b("Invalid index ", i, ", size is ", this.a));
    }
}