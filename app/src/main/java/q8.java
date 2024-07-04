package defpackage;

import defpackage.qa0;
import java.io.Serializable;
import java.util.TreeMap;

/* renamed from: q8  reason: default package */
public final class q8 implements Serializable {
    public final TreeMap P = new TreeMap();

    public q8() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q8(r81 r81Var, long j, byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        int i3;
        long j2;
        boolean z;
        for (long j3 = 0; j3 < j; j3++) {
            x81 x81Var = r81Var.a;
            int i4 = x81Var.b;
            long j4 = j3 >> i4;
            long j5 = (1 << i4) - 1;
            int i5 = (int) (j3 & j5);
            qa0.a d = new qa0.a().d(j4);
            d.e = i5;
            qa0 qa0Var = new qa0(d);
            int i6 = 1 << i4;
            int i7 = i6 - 1;
            long j6 = j4;
            if (i5 < i7) {
                i = i6;
                if (((p8) this.P.get(0)) == null || i5 == 0) {
                    this.P.put(0, new p8(x81Var, bArr, bArr2, qa0Var));
                }
                a(0, bArr, bArr2, qa0Var);
            } else {
                i = i6;
            }
            int i8 = 1;
            while (i8 < r81Var.c) {
                int i9 = (int) (j6 & j5);
                long j7 = j6 >> i4;
                qa0.a d2 = new qa0.a().c(i8).d(j7);
                d2.e = i9;
                qa0 qa0Var2 = new qa0(d2);
                if (i9 < i7) {
                    if (j3 == 0) {
                        i2 = i4;
                        i3 = i;
                        j2 = j7;
                    } else {
                        int i10 = i;
                        j2 = j7;
                        i3 = i10;
                        i2 = i4;
                        if ((j3 + 1) % ((long) Math.pow(i10, i8)) == 0) {
                            z = true;
                            if (z) {
                                if (((p8) this.P.get(Integer.valueOf(i8))) == null) {
                                    this.P.put(Integer.valueOf(i8), new p8(r81Var.a, bArr, bArr2, qa0Var2));
                                }
                                a(i8, bArr, bArr2, qa0Var2);
                            }
                        }
                    }
                    z = false;
                    if (z) {
                    }
                } else {
                    i2 = i4;
                    i3 = i;
                    j2 = j7;
                }
                i8++;
                i4 = i2;
                j6 = j2;
                i = i3;
            }
        }
    }

    public final void a(int i, byte[] bArr, byte[] bArr2, qa0 qa0Var) {
        TreeMap treeMap = this.P;
        Integer valueOf = Integer.valueOf(i);
        p8 p8Var = (p8) this.P.get(Integer.valueOf(i));
        p8Var.getClass();
        p8 p8Var2 = (p8) treeMap.put(valueOf, new p8(p8Var, bArr, bArr2, qa0Var));
    }
}