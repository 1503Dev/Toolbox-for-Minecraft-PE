package defpackage;

import defpackage.jn;
import defpackage.wn;
import java.math.BigInteger;
import java.util.Hashtable;
import java.util.Random;

/* renamed from: hn  reason: default package */
public abstract class hn {
    public cq a;
    public jn b;
    public jn c;
    public BigInteger d;
    public BigInteger e;
    public int f = 0;
    public us g = null;
    public z61 h = null;

    /* renamed from: hn$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a extends hn {
        public BigInteger[] i;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i, int i2, int i3, int i4) {
            super(r6);
            ct a;
            if (i2 != 0) {
                if (i3 == 0) {
                    if (i4 == 0) {
                        a = dq.a(new int[]{0, i2, i});
                    } else {
                        throw new IllegalArgumentException("k3 must be 0 if k2 == 0");
                    }
                } else if (i3 > i2) {
                    if (i4 > i3) {
                        a = dq.a(new int[]{0, i2, i3, i4, i});
                    } else {
                        throw new IllegalArgumentException("k3 must be > k2");
                    }
                } else {
                    throw new IllegalArgumentException("k2 must be > k1");
                }
                this.i = null;
                return;
            }
            throw new IllegalArgumentException("k1 must be > 0");
        }

        @Override // defpackage.hn
        public final wn c(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
            jn i = i(bigInteger);
            jn i2 = i(bigInteger2);
            int i3 = this.f;
            if (i3 == 5 || i3 == 6) {
                if (i.i()) {
                    if (!i2.o().equals(this.c)) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i2 = i2.d(i).a(i);
                }
            }
            return d(i, i2, z);
        }

        @Override // defpackage.hn
        public final wn g(int i, BigInteger bigInteger) {
            boolean z;
            jn i2 = i(bigInteger);
            jn jnVar = null;
            if (i2.i()) {
                jnVar = this.c.n();
            } else {
                jn a = i2.o().g().j(this.c).a(this.b).a(i2);
                if (!a.i()) {
                    jn i3 = i(gn.a);
                    int j = j();
                    Random random = new Random();
                    while (true) {
                        jn i4 = i(new BigInteger(j, random));
                        jn jnVar2 = a;
                        jn jnVar3 = i3;
                        for (int i5 = 1; i5 < j; i5++) {
                            jn o = jnVar2.o();
                            jnVar3 = jnVar3.o().a(o.j(i4));
                            jnVar2 = o.a(a);
                        }
                        if (!jnVar2.i()) {
                            a = null;
                            break;
                        } else if (!jnVar3.o().a(jnVar3).i()) {
                            a = jnVar3;
                            break;
                        }
                    }
                }
                if (a != null) {
                    boolean s = a.s();
                    if (i == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (s != z) {
                        a = a.b();
                    }
                    int i6 = this.f;
                    if (i6 != 5 && i6 != 6) {
                        jnVar = a.j(i2);
                    } else {
                        jnVar = a.a(i2);
                    }
                }
            }
            if (jnVar != null) {
                return d(i2, jnVar, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // defpackage.hn
        public final boolean n(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= j();
        }

        public boolean r() {
            return this.d != null && this.e != null && this.c.h() && (this.b.i() || this.b.h());
        }
    }

    /* renamed from: hn$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b extends hn {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public b(BigInteger bigInteger) {
            super(r4);
            ag0 ag0Var;
            ag0 ag0Var2 = dq.a;
            int bitLength = bigInteger.bitLength();
            if (bigInteger.signum() > 0 && bitLength >= 2) {
                if (bitLength < 3) {
                    int intValue = bigInteger.intValue();
                    if (intValue != 2) {
                        if (intValue == 3) {
                            ag0Var = dq.b;
                        }
                    } else {
                        ag0Var = dq.a;
                    }
                    return;
                }
                ag0Var = new ag0(bigInteger);
                return;
            }
            throw new IllegalArgumentException("'characteristic' must be >= 2");
        }

        @Override // defpackage.hn
        public final wn g(int i, BigInteger bigInteger) {
            jn i2 = i(bigInteger);
            jn n = i2.o().a(this.b).j(i2).a(this.c).n();
            if (n != null) {
                if (n.s() != (i == 1)) {
                    n = n.m();
                }
                return d(i2, n, true);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        @Override // defpackage.hn
        public final boolean n(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(this.a.c()) < 0) {
                return true;
            }
            return false;
        }
    }

    public hn(cq cqVar) {
        this.a = cqVar;
    }

    public abstract hn a();

    public z61 b() {
        us usVar = this.g;
        return usVar instanceof us ? new vs(this, usVar) : new s51();
    }

    public wn c(BigInteger bigInteger, BigInteger bigInteger2, boolean z) {
        return d(i(bigInteger), i(bigInteger2), z);
    }

    public abstract wn d(jn jnVar, jn jnVar2, boolean z);

    public abstract wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z);

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof hn) && h((hn) obj));
    }

    public final wn f(byte[] bArr) {
        wn k;
        int j = (j() + 7) / 8;
        byte b2 = bArr[0];
        boolean z = true;
        if (b2 != 0) {
            if (b2 != 2 && b2 != 3) {
                if (b2 != 4) {
                    if (b2 != 6 && b2 != 7) {
                        StringBuilder b3 = e5.b("Invalid point encoding 0x");
                        b3.append(Integer.toString(b2, 16));
                        throw new IllegalArgumentException(b3.toString());
                    } else if (bArr.length == (j * 2) + 1) {
                        BigInteger b4 = y9.b(bArr, 1, j);
                        BigInteger b5 = y9.b(bArr, j + 1, j);
                        boolean testBit = b5.testBit(0);
                        if (b2 != 7) {
                            z = false;
                        }
                        if (testBit == z) {
                            k = c(b4, b5, false);
                            if (!k.k()) {
                                throw new IllegalArgumentException("Invalid point coordinates");
                            }
                        } else {
                            throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                        }
                    } else {
                        throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                    }
                } else if (bArr.length == (j * 2) + 1) {
                    k = c(y9.b(bArr, 1, j), y9.b(bArr, j + 1, j), false);
                    if (!k.k()) {
                        throw new IllegalArgumentException("Invalid point coordinates");
                    }
                } else {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
            } else if (bArr.length == j + 1) {
                k = g(b2 & 1, y9.b(bArr, 1, j));
                if (!k.p()) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else {
                throw new IllegalArgumentException("Incorrect length for compressed encoding");
            }
        } else if (bArr.length == 1) {
            k = k();
        } else {
            throw new IllegalArgumentException("Incorrect length for infinity encoding");
        }
        if (b2 != 0 && k.j()) {
            throw new IllegalArgumentException("Invalid infinity encoding");
        }
        return k;
    }

    public abstract wn g(int i, BigInteger bigInteger);

    public final boolean h(hn hnVar) {
        if (this != hnVar && (hnVar == null || !this.a.equals(hnVar.a) || !this.b.t().equals(hnVar.b.t()) || !this.c.t().equals(hnVar.c.t()))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ Integer.rotateLeft(this.b.t().hashCode(), 8)) ^ Integer.rotateLeft(this.c.t().hashCode(), 16);
    }

    public abstract jn i(BigInteger bigInteger);

    public abstract int j();

    public abstract wn k();

    public final qf0 l(wn wnVar, String str) {
        qf0 qf0Var;
        if (wnVar != null && this == wnVar.a) {
            synchronized (wnVar) {
                Hashtable hashtable = wnVar.f;
                if (hashtable == null) {
                    qf0Var = null;
                } else {
                    qf0Var = (qf0) hashtable.get(str);
                }
            }
            return qf0Var;
        }
        throw new IllegalArgumentException("'point' must be non-null and on this curve");
    }

    public wn m(wn wnVar) {
        if (this == wnVar.a) {
            return wnVar;
        }
        if (wnVar.j()) {
            return k();
        }
        wn n = wnVar.n();
        wn c2 = c(n.b.t(), n.h().t(), n.e);
        if (c2.k()) {
            return c2;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public abstract boolean n(BigInteger bigInteger);

    public final void o(wn[] wnVarArr, int i, int i2, jn jnVar) {
        if (i >= 0 && i2 >= 0 && i <= wnVarArr.length - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                wn wnVar = wnVarArr[i + i3];
                if (wnVar != null && this != wnVar.a) {
                    throw new IllegalArgumentException("'points' entries must be null or on this curve");
                }
            }
            int i4 = this.f;
            if (i4 != 0 && i4 != 5) {
                jn[] jnVarArr = new jn[i2];
                int[] iArr = new int[i2];
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    boolean z = true;
                    if (i5 >= i2) {
                        break;
                    }
                    int i7 = i + i5;
                    wn wnVar2 = wnVarArr[i7];
                    if (wnVar2 != null) {
                        if (jnVar == null) {
                            int f = wnVar2.f();
                            if (f != 0 && f != 5 && !wnVar2.j() && !wnVar2.d[0].h()) {
                                z = false;
                            }
                            if (z) {
                            }
                        }
                        jnVarArr[i6] = wnVar2.i();
                        iArr[i6] = i7;
                        i6++;
                    }
                    i5++;
                }
                if (i6 == 0) {
                    return;
                }
                jn[] jnVarArr2 = new jn[i6];
                jnVarArr2[0] = jnVarArr[0];
                int i8 = 0;
                while (true) {
                    i8++;
                    if (i8 >= i6) {
                        break;
                    }
                    jnVarArr2[i8] = jnVarArr2[i8 - 1].j(jnVarArr[0 + i8]);
                }
                int i9 = i8 - 1;
                if (jnVar != null) {
                    jnVarArr2[i9] = jnVarArr2[i9].j(jnVar);
                }
                jn g = jnVarArr2[i9].g();
                while (i9 > 0) {
                    int i10 = i9 - 1;
                    int i11 = i9 + 0;
                    jn jnVar2 = jnVarArr[i11];
                    jnVarArr[i11] = jnVarArr2[i10].j(g);
                    g = g.j(jnVar2);
                    i9 = i10;
                }
                jnVarArr[0] = g;
                for (int i12 = 0; i12 < i6; i12++) {
                    int i13 = iArr[i12];
                    wnVarArr[i13] = wnVarArr[i13].o(jnVarArr[i12]);
                }
                return;
            } else if (jnVar == null) {
                return;
            } else {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
        }
        throw new IllegalArgumentException("invalid range specified for 'points'");
    }

    public final void p(wn wnVar, String str, qf0 qf0Var) {
        if (wnVar != null && this == wnVar.a) {
            synchronized (wnVar) {
                Hashtable hashtable = wnVar.f;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    wnVar.f = hashtable;
                }
                hashtable.put(str, qf0Var);
            }
            return;
        }
        throw new IllegalArgumentException("'point' must be non-null and on this curve");
    }

    public boolean q(int i) {
        return i == 0;
    }

    /* renamed from: hn$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends a {
        public int j;
        public int k;
        public int l;
        public int m;
        public wn.c n;

        public c(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i, i2, i3, i4, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public c(int i, int i2, int i3, int i4, jn jnVar, jn jnVar2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i, i2, i3, i4);
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger;
            this.e = bigInteger2;
            this.n = new wn.c(this, null, null, false);
            this.b = jnVar;
            this.c = jnVar2;
            this.f = 6;
        }

        public c(int i, int i2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i, i2, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }

        @Override // defpackage.hn
        public final hn a() {
            return new c(this.j, this.k, this.l, this.m, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.hn
        public final z61 b() {
            return r() ? new x51() : super.b();
        }

        @Override // defpackage.hn
        public final wn d(jn jnVar, jn jnVar2, boolean z) {
            return new wn.c(this, jnVar, jnVar2, z);
        }

        @Override // defpackage.hn
        public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
            return new wn.c(this, jnVar, jnVar2, jnVarArr, z);
        }

        @Override // defpackage.hn
        public final jn i(BigInteger bigInteger) {
            return new jn.a(this.j, this.k, this.l, this.m, bigInteger);
        }

        @Override // defpackage.hn
        public final int j() {
            return this.j;
        }

        @Override // defpackage.hn
        public final wn k() {
            return this.n;
        }

        @Override // defpackage.hn
        public final boolean q(int i) {
            return i == 0 || i == 1 || i == 6;
        }

        public c(int i, int i2, int i3, int i4, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i, i2, i3, i4);
            this.j = i;
            this.k = i2;
            this.l = i3;
            this.m = i4;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.n = new wn.c(this, null, null, false);
            this.b = i(bigInteger);
            this.c = i(bigInteger2);
            this.f = 6;
        }
    }

    /* renamed from: hn$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends b {
        public BigInteger i;
        public BigInteger j;
        public wn.d k;

        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        public d(BigInteger bigInteger, BigInteger bigInteger2, jn jnVar, jn jnVar2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = bigInteger2;
            this.k = new wn.d(this, null, null, false);
            this.b = jnVar;
            this.c = jnVar2;
            this.d = bigInteger3;
            this.e = bigInteger4;
            this.f = 4;
        }

        @Override // defpackage.hn
        public final hn a() {
            return new d(this.i, this.j, this.b, this.c, this.d, this.e);
        }

        @Override // defpackage.hn
        public final wn d(jn jnVar, jn jnVar2, boolean z) {
            return new wn.d(this, jnVar, jnVar2, z);
        }

        @Override // defpackage.hn
        public final wn e(jn jnVar, jn jnVar2, jn[] jnVarArr, boolean z) {
            return new wn.d(this, jnVar, jnVar2, jnVarArr, z);
        }

        @Override // defpackage.hn
        public final jn i(BigInteger bigInteger) {
            return new jn.b(this.i, this.j, bigInteger);
        }

        @Override // defpackage.hn
        public final int j() {
            return this.i.bitLength();
        }

        @Override // defpackage.hn
        public final wn k() {
            return this.k;
        }

        @Override // defpackage.hn
        public final wn m(wn wnVar) {
            int i;
            if (this != wnVar.a && this.f == 2 && !wnVar.j() && ((i = wnVar.a.f) == 2 || i == 3 || i == 4)) {
                return new wn.d(this, i(wnVar.b.t()), i(wnVar.c.t()), new jn[]{i(wnVar.d[0].t())}, wnVar.e);
            }
            return super.m(wnVar);
        }

        @Override // defpackage.hn
        public final boolean q(int i) {
            return i == 0 || i == 1 || i == 2 || i == 4;
        }

        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            super(bigInteger);
            this.i = bigInteger;
            this.j = jn.b.u(bigInteger);
            this.k = new wn.d(this, null, null, false);
            this.b = i(bigInteger2);
            this.c = i(bigInteger3);
            this.d = bigInteger4;
            this.e = bigInteger5;
            this.f = 4;
        }
    }
}