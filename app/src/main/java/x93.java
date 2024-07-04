package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.RemoteException;

/* renamed from: x93  reason: default package */
public final class x93 implements lv2, dx2, i50, wy4, jy5 {
    public final Object P;
    public Object Q;

    public /* synthetic */ x93(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }

    public /* synthetic */ x93(pk4 pk4Var, lk4 lk4Var) {
        this.Q = pk4Var;
        this.P = lk4Var;
    }

    public /* synthetic */ x93(w33 w33Var) {
        this.P = w33Var;
    }

    @Override // defpackage.dx2, defpackage.e74
    /* renamed from: a */
    public final void mo1a() {
        ((bx2) this.P).c(new uj2("Unable to obtain a JavascriptEngine."));
        ((jj2) this.Q).g();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    @Override // defpackage.jy5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nw4 b(int i, qe3 qe3Var, int[] iArr) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Point point;
        int i9;
        int i10;
        boolean z2;
        boolean z3;
        dy5 dy5Var = (dy5) this.P;
        mw4 mw4Var = oy5.j;
        int i11 = ((int[]) this.Q)[i];
        int i12 = dy5Var.a;
        int i13 = dy5Var.b;
        boolean z4 = dy5Var.c;
        int i14 = Integer.MAX_VALUE;
        if (i12 != Integer.MAX_VALUE) {
            if (i13 != Integer.MAX_VALUE) {
                int i15 = 0;
                int i16 = Integer.MAX_VALUE;
                while (true) {
                    qe3Var.getClass();
                    if (i15 > 0) {
                        break;
                    }
                    cu1 cu1Var = qe3Var.c[i15];
                    int i17 = cu1Var.p;
                    if (i17 > 0 && (i4 = cu1Var.q) > 0) {
                        if (z4) {
                            if (i17 <= i4) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (i12 <= i13) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z2 != z3) {
                                i6 = i12;
                                i5 = i13;
                                i7 = i17 * i6;
                                i8 = i4 * i5;
                                if (i7 < i8) {
                                    int i18 = zn4.a;
                                    point = new Point(i5, ((i8 + i17) - 1) / i17);
                                } else {
                                    int i19 = zn4.a;
                                    point = new Point(((i7 + i4) - 1) / i4, i6);
                                }
                                i9 = cu1Var.p;
                                int i20 = cu1Var.q;
                                i10 = i9 * i20;
                                if (i9 >= ((int) (point.x * 0.98f)) && i20 >= ((int) (point.y * 0.98f)) && i10 < i16) {
                                    i16 = i10;
                                }
                            }
                        }
                        i5 = i12;
                        i6 = i13;
                        i7 = i17 * i6;
                        i8 = i4 * i5;
                        if (i7 < i8) {
                        }
                        i9 = cu1Var.p;
                        int i202 = cu1Var.q;
                        i10 = i9 * i202;
                        if (i9 >= ((int) (point.x * 0.98f))) {
                            i16 = i10;
                        }
                    }
                    i15++;
                }
                i14 = i16;
            }
        } else {
            i14 = Integer.MAX_VALUE;
        }
        kv4 kv4Var = new kv4();
        int i21 = 0;
        while (true) {
            qe3Var.getClass();
            if (i21 <= 0) {
                cu1 cu1Var2 = qe3Var.c[i21];
                int i22 = cu1Var2.p;
                if (i22 != -1 && (i3 = cu1Var2.q) != -1) {
                    i2 = i22 * i3;
                } else {
                    i2 = -1;
                }
                if (i14 != Integer.MAX_VALUE && (i2 == -1 || i2 > i14)) {
                    z = false;
                } else {
                    z = true;
                }
                kv4Var.p(new ny5(i, qe3Var, i21, dy5Var, iArr[i21], z));
                i21++;
            } else {
                return kv4Var.s();
            }
        }
    }

    @Override // defpackage.i50
    public final void c(n2 n2Var) {
        try {
            ((tm2) this.P).p(n2Var.a());
        } catch (RemoteException e) {
            sv2.e("", e);
        }
    }

    @Override // defpackage.wy4
    public final /* bridge */ /* synthetic */ void f(Object obj) {
        Void r4 = (Void) obj;
        synchronized (((pk4) this.Q)) {
            try {
                Object obj2 = this.Q;
                ((pk4) obj2).d = null;
                ((pk4) obj2).c.addFirst((lk4) this.P);
                pk4 pk4Var = (pk4) this.Q;
                if (pk4Var.e == 1) {
                    pk4Var.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        synchronized (((pk4) this.Q)) {
            ((pk4) this.Q).d = null;
        }
    }

    @Override // defpackage.lv2
    public final boolean m(String str) {
        wi4 wi4Var = cu5.i;
        cu5 cu5Var = jv5.A.c;
        cu5.f((Context) this.P, (String) this.Q, str);
        return true;
    }

    public /* synthetic */ x93(Object obj, Object obj2, int i) {
        this.P = obj;
        this.Q = obj2;
    }
}