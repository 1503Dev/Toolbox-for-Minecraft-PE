package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: vv1  reason: default package */
public final class vv1 {
    public static final uv1 d = new uv1();
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList(64);
    public int c = 0;

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                this.a.add(bArr);
                int binarySearch = Collections.binarySearch(this.b, bArr, d);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                this.b.add(binarySearch, bArr);
                this.c += length;
                c();
            }
        }
    }

    public final synchronized byte[] b(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            byte[] bArr = (byte[]) this.b.get(i2);
            int length = bArr.length;
            if (length >= i) {
                this.c -= length;
                this.b.remove(i2);
                this.a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public final synchronized void c() {
        while (this.c > 4096) {
            byte[] bArr = (byte[]) this.a.remove(0);
            this.b.remove(bArr);
            this.c -= bArr.length;
        }
    }
}