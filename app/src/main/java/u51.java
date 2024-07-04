package defpackage;

import defpackage.qa0;

/* renamed from: u51  reason: default package */
public final class u51 {
    public final w51 a;
    public final l00 b;
    public byte[] c;
    public byte[] d;

    public u51(w51 w51Var) {
        this.a = w51Var;
        int i = w51Var.b;
        this.b = new l00(i, w51Var.a);
        this.c = new byte[i];
        this.d = new byte[i];
    }

    public final byte[] a(byte[] bArr, int i, qa0 qa0Var) {
        int i2 = this.a.b;
        if (bArr.length == i2) {
            qa0Var.a();
            int i3 = i + 0;
            if (i3 <= this.a.c - 1) {
                if (i == 0) {
                    return bArr;
                }
                byte[] a = a(bArr, i - 1, qa0Var);
                qa0.a d = new qa0.a().c(qa0Var.a).d(qa0Var.b);
                d.e = qa0Var.e;
                d.f = qa0Var.f;
                d.g = i3 - 1;
                qa0.a b = d.b(0);
                b.getClass();
                qa0 qa0Var2 = new qa0(b);
                byte[] a2 = this.b.a(this.d, qa0Var2.a());
                qa0.a d2 = new qa0.a().c(qa0Var2.a).d(qa0Var2.b);
                d2.e = qa0Var2.e;
                d2.f = qa0Var2.f;
                d2.g = qa0Var2.g;
                qa0.a b2 = d2.b(1);
                b2.getClass();
                byte[] a3 = this.b.a(this.d, new qa0(b2).a());
                byte[] bArr2 = new byte[i2];
                for (int i4 = 0; i4 < i2; i4++) {
                    bArr2[i4] = (byte) (a[i4] ^ a3[i4]);
                }
                l00 l00Var = this.b;
                l00Var.getClass();
                int length = a2.length;
                int i5 = l00Var.b;
                if (length == i5) {
                    if (i2 == i5) {
                        return l00Var.b(0, a2, bArr2);
                    }
                    throw new IllegalArgumentException("wrong in length");
                }
                throw new IllegalArgumentException("wrong key length");
            }
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        throw new IllegalArgumentException(bp.b("startHash needs to be ", i2, "bytes"));
    }

    public final fk b(qa0 qa0Var) {
        byte[][] bArr = new byte[this.a.d];
        int i = 0;
        while (true) {
            w51 w51Var = this.a;
            if (i < w51Var.d) {
                qa0.a d = new qa0.a().c(qa0Var.a).d(qa0Var.b);
                d.e = qa0Var.e;
                d.f = i;
                d.g = qa0Var.g;
                qa0.a b = d.b(qa0Var.d);
                b.getClass();
                qa0 qa0Var2 = new qa0(b);
                if (i < 0 || i >= this.a.d) {
                    break;
                }
                bArr[i] = a(this.b.a(this.c, vj.G(i, 32)), this.a.c - 1, qa0Var2);
                i++;
                qa0Var = qa0Var2;
            } else {
                return new fk(w51Var, bArr);
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    public final byte[] c(byte[] bArr, qa0 qa0Var) {
        qa0.a d = new qa0.a().c(qa0Var.a).d(qa0Var.b);
        d.e = qa0Var.e;
        return this.b.a(bArr, new qa0(d).a());
    }

    public final void d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.a.b;
        if (length == i) {
            if (bArr2.length == i) {
                this.c = bArr;
                this.d = bArr2;
                return;
            }
            throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
        }
        throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
    }
}