package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import defpackage.l4;

/* renamed from: lh1  reason: default package */
public final class lh1<T> implements yb0<T> {
    public final lt P;
    public final int Q;
    public final n4<?> R;
    public final long S;
    public final long T;

    public lh1(lt ltVar, int i, n4 n4Var, long j, long j2) {
        this.P = ltVar;
        this.Q = i;
        this.R = n4Var;
        this.S = j;
        this.T = j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0027, code lost:
        if (r2 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0037, code lost:
        if (r2 == false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static kf a(zg1<?> zg1Var, k9<?> k9Var, int i) {
        kf kfVar;
        ql5 ql5Var = k9Var.v;
        if (ql5Var == null) {
            kfVar = null;
        } else {
            kfVar = ql5Var.S;
        }
        if (kfVar != null && kfVar.Q) {
            int[] iArr = kfVar.S;
            boolean z = true;
            if (iArr == null) {
                int[] iArr2 = kfVar.U;
                if (iArr2 != null) {
                    int length = iArr2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (iArr2[i2] == i) {
                                break;
                            }
                            i2++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (zg1Var.a0 < kfVar.T) {
                    return kfVar;
                }
            } else {
                int length2 = iArr.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length2) {
                        if (iArr[i3] == i) {
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.yb0
    public final void c(yv0<T> yv0Var) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        boolean z2;
        if (!this.P.a()) {
            return;
        }
        gm0 gm0Var = fm0.a().a;
        if (gm0Var != null && !gm0Var.Q) {
            return;
        }
        zg1 zg1Var = (zg1) this.P.Y.get(this.R);
        if (zg1Var != null) {
            l4.e eVar = zg1Var.Q;
            if (eVar instanceof k9) {
                k9 k9Var = (k9) eVar;
                boolean z3 = true;
                int i7 = 0;
                if (this.S > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i8 = k9Var.q;
                if (gm0Var != null) {
                    z &= gm0Var.R;
                    int i9 = gm0Var.S;
                    int i10 = gm0Var.T;
                    i = gm0Var.P;
                    if (k9Var.v != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2 && !k9Var.g()) {
                        kf a = a(zg1Var, k9Var, this.Q);
                        if (a == null) {
                            return;
                        }
                        z3 = (!a.R || this.S <= 0) ? false : false;
                        i10 = a.T;
                        z = z3;
                    }
                    i2 = i9;
                    i3 = i10;
                } else {
                    i = 0;
                    i2 = 5000;
                    i3 = 100;
                }
                lt ltVar = this.P;
                if (yv0Var.l()) {
                    i5 = 0;
                } else {
                    if (yv0Var.j()) {
                        i7 = 100;
                    } else {
                        Exception h = yv0Var.h();
                        if (h instanceof m4) {
                            Status status = ((m4) h).P;
                            int i11 = status.Q;
                            gf gfVar = status.T;
                            if (gfVar == null) {
                                i4 = -1;
                            } else {
                                i4 = gfVar.Q;
                            }
                            i5 = i4;
                            i7 = i11;
                        } else {
                            i7 = 101;
                        }
                    }
                    i5 = -1;
                }
                if (z) {
                    long j3 = this.S;
                    long currentTimeMillis = System.currentTimeMillis();
                    i6 = (int) (SystemClock.elapsedRealtime() - this.T);
                    j = j3;
                    j2 = currentTimeMillis;
                } else {
                    j = 0;
                    j2 = 0;
                    i6 = -1;
                }
                e60 e60Var = new e60(this.Q, i7, i5, j, j2, null, null, i8, i6);
                long j4 = i2;
                aj1 aj1Var = ltVar.b0;
                aj1Var.sendMessage(aj1Var.obtainMessage(18, new mh1(e60Var, i, j4, i3)));
            }
        }
    }
}