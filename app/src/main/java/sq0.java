package defpackage;

import javax.annotation.Nullable;

/* renamed from: sq0  reason: default package */
public final class sq0 {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public sq0 f;
    public sq0 g;

    public sq0() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public sq0(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Nullable
    public final sq0 a() {
        sq0 sq0Var = this.f;
        sq0 sq0Var2 = sq0Var != this ? sq0Var : null;
        sq0 sq0Var3 = this.g;
        sq0Var3.f = sq0Var;
        this.f.g = sq0Var3;
        this.f = null;
        this.g = null;
        return sq0Var2;
    }

    public final void b(sq0 sq0Var) {
        sq0Var.g = this;
        sq0Var.f = this.f;
        this.f.g = sq0Var;
        this.f = sq0Var;
    }

    public final sq0 c() {
        this.d = true;
        return new sq0(this.a, this.b, this.c, true, false);
    }

    public final void d(sq0 sq0Var, int i) {
        if (!sq0Var.e) {
            throw new IllegalArgumentException();
        }
        int i2 = sq0Var.c;
        if (i2 + i > 8192) {
            if (sq0Var.d) {
                throw new IllegalArgumentException();
            }
            int i3 = sq0Var.b;
            if ((i2 + i) - i3 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sq0Var.a;
            System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
            sq0Var.c -= sq0Var.b;
            sq0Var.b = 0;
        }
        System.arraycopy(this.a, this.b, sq0Var.a, sq0Var.c, i);
        sq0Var.c += i;
        this.b += i;
    }
}