package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: vx5  reason: default package */
public final class vx5 extends ky5 implements Comparable {
    public final int T;
    public final boolean U;
    public final String V;
    public final dy5 W;
    public final boolean X;
    public final int Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public final int c0;
    public final boolean d0;
    public final int e0;
    public final int f0;
    public final int g0;
    public final int h0;
    public final boolean i0;
    public final boolean j0;

    public vx5(int i, qe3 qe3Var, int i2, dy5 dy5Var, int i3, boolean z, ox5 ox5Var) {
        super(i, qe3Var, i2);
        int i4;
        int i5;
        boolean z2;
        String locale;
        String[] strArr;
        int i6;
        boolean z3;
        boolean z4;
        boolean z5;
        this.W = dy5Var;
        this.V = oy5.g(this.S.c);
        int i7 = 0;
        this.X = oy5.h(i3, false);
        int i8 = 0;
        while (true) {
            i4 = Integer.MAX_VALUE;
            if (i8 < dy5Var.e.size()) {
                i5 = oy5.f(this.S, (String) dy5Var.e.get(i8), false);
                if (i5 > 0) {
                    break;
                }
                i8++;
            } else {
                i8 = Integer.MAX_VALUE;
                i5 = 0;
                break;
            }
        }
        this.Z = i8;
        this.Y = i5;
        this.S.getClass();
        this.a0 = Integer.bitCount(0);
        cu1 cu1Var = this.S;
        cu1Var.getClass();
        if (1 != (cu1Var.d & 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.d0 = z2;
        this.e0 = cu1Var.x;
        this.f0 = cu1Var.y;
        this.g0 = cu1Var.g;
        this.U = ox5Var.e(cu1Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i9 = zn4.a;
        if (i9 >= 24) {
            strArr = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            String[] strArr2 = new String[1];
            Locale locale2 = configuration.locale;
            if (i9 >= 21) {
                locale = locale2.toLanguageTag();
            } else {
                locale = locale2.toString();
            }
            strArr2[0] = locale;
            strArr = strArr2;
        }
        for (int i10 = 0; i10 < strArr.length; i10++) {
            strArr[i10] = zn4.w(strArr[i10]);
        }
        int i11 = 0;
        while (true) {
            if (i11 < strArr.length) {
                i6 = oy5.f(this.S, strArr[i11], false);
                if (i6 > 0) {
                    break;
                }
                i11++;
            } else {
                i11 = Integer.MAX_VALUE;
                i6 = 0;
                break;
            }
        }
        this.b0 = i11;
        this.c0 = i6;
        int i12 = 0;
        while (true) {
            if (i12 >= dy5Var.f.size()) {
                break;
            }
            String str = this.S.k;
            if (str != null && str.equals(dy5Var.f.get(i12))) {
                i4 = i12;
                break;
            }
            i12++;
        }
        this.h0 = i4;
        if ((i3 & 384) == 128) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.i0 = z3;
        if ((i3 & 64) == 64) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.j0 = z4;
        dy5 dy5Var2 = this.W;
        if (oy5.h(i3, dy5Var2.o) && ((z5 = this.U) || dy5Var2.m)) {
            i7 = (!oy5.h(i3, false) || !z5 || this.S.g == -1 || (!dy5Var2.p && z)) ? 1 : 2;
        }
        this.T = i7;
    }

    @Override // defpackage.ky5
    public final int b() {
        return this.T;
    }

    @Override // defpackage.ky5
    public final /* bridge */ /* synthetic */ boolean e(ky5 ky5Var) {
        String str;
        vx5 vx5Var = (vx5) ky5Var;
        this.W.getClass();
        cu1 cu1Var = this.S;
        int i = cu1Var.x;
        if (i != -1) {
            cu1 cu1Var2 = vx5Var.S;
            if (i == cu1Var2.x && (str = cu1Var.k) != null && TextUtils.equals(str, cu1Var2.k)) {
                this.W.getClass();
                int i2 = this.S.y;
                return i2 != -1 && i2 == vx5Var.S.y && this.i0 == vx5Var.i0 && this.j0 == vx5Var.j0;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: f */
    public final int compareTo(vx5 vx5Var) {
        mw4 a;
        if (this.U && this.X) {
            a = oy5.j;
        } else {
            a = oy5.j.a();
        }
        cv4 d = cv4.a.d(this.X, vx5Var.X);
        Integer valueOf = Integer.valueOf(this.Z);
        Integer valueOf2 = Integer.valueOf(vx5Var.Z);
        kw4.P.getClass();
        uw4 uw4Var = uw4.P;
        cv4 c = d.c(valueOf, valueOf2, uw4Var).b(this.Y, vx5Var.Y).b(this.a0, vx5Var.a0).d(this.d0, vx5Var.d0).d(true, true).c(Integer.valueOf(this.b0), Integer.valueOf(vx5Var.b0), uw4Var).b(this.c0, vx5Var.c0).d(this.U, vx5Var.U).c(Integer.valueOf(this.h0), Integer.valueOf(vx5Var.h0), uw4Var);
        Integer valueOf3 = Integer.valueOf(this.g0);
        Integer valueOf4 = Integer.valueOf(vx5Var.g0);
        this.W.getClass();
        mw4 mw4Var = oy5.k;
        cv4 c2 = c.c(valueOf3, valueOf4, mw4Var).d(this.i0, vx5Var.i0).d(this.j0, vx5Var.j0).c(Integer.valueOf(this.e0), Integer.valueOf(vx5Var.e0), a).c(Integer.valueOf(this.f0), Integer.valueOf(vx5Var.f0), a);
        Integer valueOf5 = Integer.valueOf(this.g0);
        Integer valueOf6 = Integer.valueOf(vx5Var.g0);
        if (!zn4.b(this.V, vx5Var.V)) {
            a = mw4Var;
        }
        return c2.c(valueOf5, valueOf6, a).a();
    }
}