package defpackage;

import java.io.Serializable;

/* renamed from: er3  reason: default package */
public final /* synthetic */ class er3 implements i52 {
    public Object P;
    public Object Q;
    public Serializable R;
    public Object S;

    public /* synthetic */ er3(s52 s52Var, String str, z72 z72Var, String str2) {
        this.P = s52Var;
        this.Q = str;
        this.S = z72Var;
        this.R = str2;
    }

    /* JADX WARN: Type inference failed for: r14v3, types: [gf0[], java.io.Serializable] */
    public er3(ts tsVar, gf0 gf0Var) {
        int i;
        int d;
        int[] iArr;
        this.P = tsVar;
        this.Q = gf0Var;
        int[] iArr2 = gf0Var.c;
        int length = iArr2.length - 1;
        length = iArr2[length] == 0 ? -1 : length;
        this.R = new gf0[length];
        int i2 = 0;
        while (true) {
            i = length >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr3 = new int[i3 + 1];
            iArr3[i3] = 1;
            ((gf0[]) this.R)[i2] = new gf0((ts) this.P, iArr3);
            i2++;
        }
        while (i < length) {
            int i4 = i << 1;
            int[] iArr4 = new int[i4 + 1];
            iArr4[i4] = 1;
            gf0 gf0Var2 = new gf0((ts) this.P, iArr4);
            gf0[] gf0VarArr = (gf0[]) this.R;
            int[] iArr5 = gf0Var2.c;
            int[] iArr6 = ((gf0) this.Q).c;
            int b = gf0.b(iArr6);
            if (b != -1) {
                int length2 = iArr5.length;
                int[] iArr7 = new int[length2];
                int b2 = gf0.b(iArr6);
                int a = gf0Var2.a.a(b2 == -1 ? 0 : iArr6[b2]);
                System.arraycopy(iArr5, 0, iArr7, 0, length2);
                while (b <= gf0.b(iArr7)) {
                    ts tsVar2 = gf0Var2.a;
                    int b3 = gf0.b(iArr7);
                    int c = tsVar2.c(b3 == -1 ? 0 : iArr7[b3], a);
                    int b4 = gf0.b(iArr7) - b;
                    int b5 = gf0.b(iArr6);
                    if (b5 == -1) {
                        iArr = new int[1];
                    } else {
                        int[] iArr8 = new int[b5 + b4 + 1];
                        System.arraycopy(iArr6, 0, iArr8, b4, b5 + 1);
                        iArr = iArr8;
                    }
                    iArr7 = gf0Var2.a(gf0Var2.g(iArr, c), iArr7);
                }
                gf0VarArr[i] = new gf0(gf0Var2.a, iArr7);
                i++;
            } else {
                throw new ArithmeticException("Division by zero");
            }
        }
        int[] iArr9 = ((gf0) this.Q).c;
        int length3 = iArr9.length - 1;
        int i5 = iArr9[length3] != 0 ? length3 : -1;
        gf0[] gf0VarArr2 = new gf0[i5];
        int i6 = i5 - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            gf0VarArr2[i7] = new gf0(((gf0[]) this.R)[i7]);
        }
        this.S = new gf0[i5];
        while (i6 >= 0) {
            ((gf0[]) this.S)[i6] = new gf0((ts) this.P, i6);
            i6--;
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (gf0VarArr2[i8].d(i8) == 0) {
                int i9 = i8 + 1;
                boolean z = false;
                while (i9 < i5) {
                    if (gf0VarArr2[i9].d(i8) != 0) {
                        gf0 gf0Var3 = gf0VarArr2[i8];
                        gf0VarArr2[i8] = gf0VarArr2[i9];
                        gf0VarArr2[i9] = gf0Var3;
                        gf0[] gf0VarArr3 = (gf0[]) this.S;
                        gf0 gf0Var4 = gf0VarArr3[i8];
                        gf0VarArr3[i8] = gf0VarArr3[i9];
                        gf0VarArr3[i9] = gf0Var4;
                        i9 = i5;
                        z = true;
                    }
                    i9++;
                }
                if (!z) {
                    throw new ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int a2 = ((ts) this.P).a(gf0VarArr2[i8].d(i8));
            gf0 gf0Var5 = gf0VarArr2[i8];
            if (!gf0Var5.a.b(a2)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            gf0Var5.c = gf0Var5.g(gf0Var5.c, a2);
            gf0Var5.c();
            gf0 gf0Var6 = ((gf0[]) this.S)[i8];
            if (!gf0Var6.a.b(a2)) {
                throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
            }
            gf0Var6.c = gf0Var6.g(gf0Var6.c, a2);
            gf0Var6.c();
            for (int i10 = 0; i10 < i5; i10++) {
                if (i10 != i8 && (d = gf0VarArr2[i10].d(i8)) != 0) {
                    gf0 f = gf0VarArr2[i8].f(d);
                    gf0 f2 = ((gf0[]) this.S)[i8].f(d);
                    gf0 gf0Var7 = gf0VarArr2[i10];
                    gf0Var7.c = gf0Var7.a(gf0Var7.c, f.c);
                    gf0Var7.c();
                    gf0 gf0Var8 = ((gf0[]) this.S)[i10];
                    gf0Var8.c = gf0Var8.a(gf0Var8.c, f2.c);
                    gf0Var8.c();
                }
            }
        }
    }

    @Override // defpackage.i52
    public final void j(t62 t62Var) {
        t52 t52Var = (t52) ((u62) t62Var.Q).w().g();
        t52Var.j();
        u52.z((u52) t52Var.Q, (s52) this.P);
        t62Var.j();
        u62.G((u62) t62Var.Q, (u52) t52Var.h());
        m62 m62Var = (m62) ((u62) t62Var.Q).x().g();
        m62Var.j();
        p62.y((p62) m62Var.Q, (String) this.Q);
        m62Var.j();
        p62.z((p62) m62Var.Q, (z72) this.S);
        t62Var.l(m62Var);
        t62Var.j();
        u62.B((u62) t62Var.Q, (String) this.R);
    }
}