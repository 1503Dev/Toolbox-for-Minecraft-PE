package defpackage;

/* renamed from: zz2  reason: default package */
public final class zz2 implements sm5 {
    public final jz5 a = new jz5();
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // defpackage.sm5
    public final long a() {
        return 0L;
    }

    @Override // defpackage.sm5
    public final void b(mk5[] mk5VarArr, qy5[] qy5VarArr) {
        int i;
        int i2 = 0;
        this.f = 0;
        while (true) {
            int length = mk5VarArr.length;
            if (i2 < 2) {
                if (qy5VarArr[i2] != null) {
                    int i3 = this.f;
                    if (mk5VarArr[i2].P != 1) {
                        i = 131072000;
                    } else {
                        i = 13107200;
                    }
                    this.f = i3 + i;
                }
                i2++;
            } else {
                this.a.a(this.f);
                return;
            }
        }
    }

    @Override // defpackage.sm5
    public final void c() {
        this.f = 0;
        this.g = false;
    }

    @Override // defpackage.sm5
    public final void d() {
        this.f = 0;
        this.g = false;
        jz5 jz5Var = this.a;
        synchronized (jz5Var) {
            jz5Var.a(0);
        }
    }

    @Override // defpackage.sm5
    public final void e() {
    }

    @Override // defpackage.sm5
    public final boolean f(long j, float f, boolean z, long j2) {
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || j >= j3;
    }

    @Override // defpackage.sm5
    public final jz5 g() {
        return this.a;
    }

    @Override // defpackage.sm5
    public final boolean h(long j, float f) {
        char c;
        int i;
        boolean z = false;
        if (j > this.c) {
            c = 0;
        } else if (j < this.b) {
            c = 2;
        } else {
            c = 1;
        }
        jz5 jz5Var = this.a;
        synchronized (jz5Var) {
            i = jz5Var.b * 65536;
        }
        int i2 = this.f;
        if (c == 2 || (c == 1 && this.g && i < i2)) {
            z = true;
        }
        this.g = z;
        return z;
    }

    @Override // defpackage.sm5
    public final void i() {
        this.f = 0;
        this.g = false;
        jz5 jz5Var = this.a;
        synchronized (jz5Var) {
            jz5Var.a(0);
        }
    }
}