package defpackage;

/* renamed from: kt5  reason: default package */
public final class kt5 {
    public int a = 0;
    public int b = -1;
    public int c = 0;
    public int[] d;
    public int e;

    public kt5() {
        int[] iArr = new int[16];
        this.d = iArr;
        this.e = iArr.length - 1;
    }

    public final void a(int i) {
        int i2 = this.c;
        int[] iArr = this.d;
        int length = iArr.length;
        if (i2 == length) {
            int i3 = length + length;
            if (i3 < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[i3];
            int i4 = this.a;
            int i5 = length - i4;
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy(this.d, 0, iArr2, i5, i4);
            this.a = 0;
            this.b = this.c - 1;
            this.d = iArr2;
            this.e = iArr2.length - 1;
            iArr = iArr2;
        }
        int i6 = (this.b + 1) & this.e;
        this.b = i6;
        iArr[i6] = i;
        this.c++;
    }
}