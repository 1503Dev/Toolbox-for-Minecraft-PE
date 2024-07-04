package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: h16  reason: default package */
public final class h16 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    public h16(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static h16 a(kh4 kh4Var) {
        String str;
        int i;
        int i2;
        float f;
        try {
            kh4Var.f(4);
            int n = (kh4Var.n() & 3) + 1;
            if (n != 3) {
                ArrayList arrayList = new ArrayList();
                int n2 = kh4Var.n() & 31;
                for (int i3 = 0; i3 < n2; i3++) {
                    int q = kh4Var.q();
                    int i4 = kh4Var.b;
                    kh4Var.f(q);
                    byte[] bArr = kh4Var.a;
                    byte[] bArr2 = new byte[q + 4];
                    System.arraycopy(g9.R, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i4, bArr2, 4, q);
                    arrayList.add(bArr2);
                }
                int n3 = kh4Var.n();
                for (int i5 = 0; i5 < n3; i5++) {
                    int q2 = kh4Var.q();
                    int i6 = kh4Var.b;
                    kh4Var.f(q2);
                    byte[] bArr3 = kh4Var.a;
                    byte[] bArr4 = new byte[q2 + 4];
                    System.arraycopy(g9.R, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i6, bArr4, 4, q2);
                    arrayList.add(bArr4);
                }
                if (n2 > 0) {
                    gl1 c = hl1.c((byte[]) arrayList.get(0), n + 1, ((byte[]) arrayList.get(0)).length);
                    int i7 = c.e;
                    int i8 = c.f;
                    float f2 = c.g;
                    str = g9.c(c.a, c.b, c.c);
                    i = i7;
                    i2 = i8;
                    f = f2;
                } else {
                    str = null;
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new h16(arrayList, n, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw jy2.a("Error parsing AVC config", e);
        }
    }
}