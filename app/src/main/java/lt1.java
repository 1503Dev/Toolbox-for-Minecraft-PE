package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: lt1  reason: default package */
public final class lt1 implements et1 {
    public final eh4 a = new eh4(new byte[5], 5);
    public final SparseArray b = new SparseArray();
    public final SparseIntArray c = new SparseIntArray();
    public final int d;
    public final /* synthetic */ mt1 e;

    public lt1(mt1 mt1Var, int i) {
        this.e = mt1Var;
        this.d = i;
    }

    @Override // defpackage.et1
    public final void a(km4 km4Var, nk1 nk1Var, pt1 pt1Var) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ff, code lost:
        if (r28.n() == 21) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181  */
    @Override // defpackage.et1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(kh4 kh4Var) {
        us1 us1Var;
        Object obj;
        if (kh4Var.n() != 2) {
            return;
        }
        int i = 0;
        km4 km4Var = (km4) this.e.a.get(0);
        if ((kh4Var.n() & 128) == 0) {
            return;
        }
        kh4Var.f(1);
        int q = kh4Var.q();
        int i2 = 3;
        kh4Var.f(3);
        eh4 eh4Var = this.a;
        kh4Var.a(eh4Var.a, 0, 2);
        eh4Var.e(0);
        this.a.g(3);
        int i3 = 13;
        this.e.n = this.a.b(13);
        eh4 eh4Var2 = this.a;
        kh4Var.a(eh4Var2.a, 0, 2);
        eh4Var2.e(0);
        int i4 = 4;
        this.a.g(4);
        int i5 = 12;
        kh4Var.f(this.a.b(12));
        this.b.clear();
        this.c.clear();
        int i6 = kh4Var.c - kh4Var.b;
        while (i6 > 0) {
            eh4 eh4Var3 = this.a;
            int i7 = 5;
            kh4Var.a(eh4Var3.a, i, 5);
            eh4Var3.e(i);
            int b = this.a.b(8);
            this.a.g(i2);
            int b2 = this.a.b(i3);
            this.a.g(i4);
            int b3 = this.a.b(i5);
            int i8 = kh4Var.b;
            int i9 = i8 + b3;
            us1 us1Var2 = null;
            ArrayList arrayList = null;
            String str = null;
            int i10 = -1;
            while (kh4Var.b < i9) {
                int n = kh4Var.n();
                int n2 = kh4Var.b + kh4Var.n();
                if (n2 <= i9) {
                    if (n == i7) {
                        long u = kh4Var.u();
                        if (u != 1094921523) {
                            if (u != 1161904947) {
                                if (u != 1094921524) {
                                    if (u == 1212503619) {
                                        i10 = 36;
                                    }
                                }
                                i10 = 172;
                            }
                            i10 = 135;
                        }
                        i10 = 129;
                    } else {
                        if (n != 106) {
                            if (n != 122) {
                                if (n != 127) {
                                    if (n == 123) {
                                        i10 = 138;
                                    } else if (n == 10) {
                                        str = kh4Var.z(3, zs4.c).trim();
                                    } else {
                                        int i11 = 3;
                                        if (n == 89) {
                                            arrayList = new ArrayList();
                                            while (kh4Var.b < n2) {
                                                String trim = kh4Var.z(i11, zs4.c).trim();
                                                kh4Var.n();
                                                byte[] bArr = new byte[4];
                                                kh4Var.a(bArr, 0, 4);
                                                arrayList.add(new nt1(trim, bArr));
                                                i11 = 3;
                                            }
                                            i10 = 89;
                                        } else if (n == 111) {
                                            i10 = 257;
                                        }
                                    }
                                }
                            }
                            i10 = 135;
                        }
                        i10 = 129;
                    }
                    kh4Var.f(n2 - kh4Var.b);
                    i7 = 5;
                } else {
                    kh4Var.e(i9);
                    String str2 = str;
                    ot1 ot1Var = new ot1(i10, str2, arrayList, Arrays.copyOfRange(kh4Var.a, i8, i9));
                    if (b != 6 || b == 5) {
                        b = i10;
                    }
                    i6 -= b3 + 5;
                    if (this.e.f.get(b2)) {
                        wr1 wr1Var = this.e.d;
                        wr1Var.getClass();
                        if (b != 2) {
                            if (b != 3 && b != 4) {
                                if (b != 21) {
                                    if (b != 27) {
                                        if (b != 36) {
                                            if (b != 89) {
                                                if (b != 138) {
                                                    if (b != 172) {
                                                        if (b != 257) {
                                                            if (b != 128) {
                                                                if (b != 129) {
                                                                    if (b != 134) {
                                                                        if (b != 135) {
                                                                            switch (b) {
                                                                                case 15:
                                                                                    obj = new us1(new vr1(str2, false));
                                                                                    break;
                                                                                case 16:
                                                                                    us1Var2 = new us1(new ks1(new rt1(wr1Var.h(ot1Var))));
                                                                                    break;
                                                                                case 17:
                                                                                    obj = new us1(new qs1(str2));
                                                                                    break;
                                                                            }
                                                                        }
                                                                    } else {
                                                                        obj = new ft1(new ts1("application/x-scte35"));
                                                                    }
                                                                }
                                                                obj = new us1(new rr1(str2));
                                                            }
                                                        } else {
                                                            obj = new ft1(new ts1("application/vnd.dvb.ait"));
                                                        }
                                                    } else {
                                                        obj = new us1(new tr1(str2));
                                                    }
                                                } else {
                                                    obj = new us1(new xr1(str2));
                                                }
                                            } else {
                                                us1Var2 = new us1(new es1(ot1Var.a));
                                            }
                                            obj = us1Var2;
                                        } else {
                                            us1Var = new us1(new os1(new gt1(wr1Var.h(ot1Var))));
                                        }
                                    } else {
                                        us1Var = new us1(new ms1(new gt1(wr1Var.h(ot1Var))));
                                    }
                                    us1Var2 = us1Var;
                                    obj = us1Var2;
                                } else {
                                    obj = new us1(new ps1());
                                }
                                this.c.put(b2, b2);
                                this.b.put(b2, obj);
                            }
                            obj = new us1(new rs1(str2));
                            this.c.put(b2, b2);
                            this.b.put(b2, obj);
                        }
                        us1Var = new us1(new hs1(new rt1(wr1Var.h(ot1Var))));
                        us1Var2 = us1Var;
                        obj = us1Var2;
                        this.c.put(b2, b2);
                        this.b.put(b2, obj);
                    }
                    i = 0;
                    i2 = 3;
                    i4 = 4;
                    i3 = 13;
                    i5 = 12;
                }
            }
            kh4Var.e(i9);
            String str22 = str;
            ot1 ot1Var2 = new ot1(i10, str22, arrayList, Arrays.copyOfRange(kh4Var.a, i8, i9));
            if (b != 6) {
            }
            b = i10;
            i6 -= b3 + 5;
            if (this.e.f.get(b2)) {
            }
            i = 0;
            i2 = 3;
            i4 = 4;
            i3 = 13;
            i5 = 12;
        }
        int size = this.c.size();
        for (int i12 = 0; i12 < size; i12++) {
            int keyAt = this.c.keyAt(i12);
            int valueAt = this.c.valueAt(i12);
            this.e.f.put(keyAt, true);
            this.e.g.put(valueAt, true);
            qt1 qt1Var = (qt1) this.b.valueAt(i12);
            if (qt1Var != null) {
                qt1Var.a(km4Var, this.e.j, new pt1(q, keyAt, 8192));
                this.e.e.put(valueAt, qt1Var);
            }
        }
        this.e.e.remove(this.d);
        mt1 mt1Var = this.e;
        mt1Var.getClass();
        mt1Var.j.j();
        this.e.k = true;
    }
}