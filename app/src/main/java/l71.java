package defpackage;

import androidx.work.b;

/* renamed from: l71  reason: default package */
public final class l71 {
    public String a;
    public y61 b;
    public String c;
    public String d;
    public b e;
    public b f;
    public long g;
    public long h;
    public long i;
    public sf j;
    public int k;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public int r;

    /* renamed from: l71$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public String a;
        public y61 b;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.b != aVar.b) {
                    return false;
                }
                return this.a.equals(aVar.a);
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    static {
        y20.e("WorkSpec");
    }

    public l71(String str, String str2) {
        this.b = y61.ENQUEUED;
        b bVar = b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = sf.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = str;
        this.c = str2;
    }

    public l71(l71 l71Var) {
        this.b = y61.ENQUEUED;
        b bVar = b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = sf.i;
        this.l = 1;
        this.m = 30000L;
        this.p = -1L;
        this.r = 1;
        this.a = l71Var.a;
        this.c = l71Var.c;
        this.b = l71Var.b;
        this.d = l71Var.d;
        this.e = new b(l71Var.e);
        this.f = new b(l71Var.f);
        this.g = l71Var.g;
        this.h = l71Var.h;
        this.i = l71Var.i;
        this.j = new sf(l71Var.j);
        this.k = l71Var.k;
        this.l = l71Var.l;
        this.m = l71Var.m;
        this.n = l71Var.n;
        this.o = l71Var.o;
        this.p = l71Var.p;
        this.q = l71Var.q;
        this.r = l71Var.r;
    }

    public final long a() {
        boolean z;
        long j;
        long j2;
        long j3;
        long scalb;
        boolean z2 = false;
        if (this.b == y61.ENQUEUED && this.k > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.l == 2) {
                z2 = true;
            }
            long j4 = this.m;
            if (z2) {
                scalb = j4 * this.k;
            } else {
                scalb = Math.scalb((float) j4, this.k - 1);
            }
            j2 = this.n;
            j = Math.min(18000000L, scalb);
        } else {
            long j5 = 0;
            if (c()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = this.n;
                if (j6 == 0) {
                    j3 = currentTimeMillis + this.g;
                } else {
                    j3 = j6;
                }
                long j7 = this.i;
                long j8 = this.h;
                if (j7 != j8) {
                    z2 = true;
                }
                int i = (j6 > 0L ? 1 : (j6 == 0L ? 0 : -1));
                if (z2) {
                    if (i == 0) {
                        j5 = j7 * (-1);
                    }
                    return j3 + j8 + j5;
                }
                if (i != 0) {
                    j5 = j8;
                }
                return j3 + j5;
            }
            j = this.n;
            if (j == 0) {
                j = System.currentTimeMillis();
            }
            j2 = this.g;
        }
        return j + j2;
    }

    public final boolean b() {
        return !sf.i.equals(this.j);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l71.class != obj.getClass()) {
            return false;
        }
        l71 l71Var = (l71) obj;
        if (this.g == l71Var.g && this.h == l71Var.h && this.i == l71Var.i && this.k == l71Var.k && this.m == l71Var.m && this.n == l71Var.n && this.o == l71Var.o && this.p == l71Var.p && this.q == l71Var.q && this.a.equals(l71Var.a) && this.b == l71Var.b && this.c.equals(l71Var.c)) {
            String str = this.d;
            if (str == null ? l71Var.d == null : str.equals(l71Var.d)) {
                return this.e.equals(l71Var.e) && this.f.equals(l71Var.f) && this.j.equals(l71Var.j) && this.l == l71Var.l && this.r == l71Var.r;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f.hashCode();
        long j = this.g;
        long j2 = this.h;
        long j3 = this.i;
        int hashCode5 = this.j.hashCode();
        int b = cm0.b(this.l);
        long j4 = this.m;
        long j5 = this.n;
        long j6 = this.o;
        long j7 = this.p;
        return cm0.b(this.r) + ((((((((((((b + ((((hashCode5 + ((((((((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31);
    }

    public final String toString() {
        return qq.d(e5.b("{WorkSpec: "), this.a, "}");
    }
}