package defpackage;

import defpackage.fu;
import defpackage.q00;

/* renamed from: w81  reason: default package */
public final class w81 {
    public static v81 a(u51 u51Var, fk fkVar, q00 q00Var) {
        double d;
        int i = u51Var.a.d;
        byte[][] k = vj.k((byte[][]) fkVar.Q);
        v81[] v81VarArr = new v81[k.length];
        for (int i2 = 0; i2 < k.length; i2++) {
            v81VarArr[i2] = new v81(k[i2], 0);
        }
        q00.a d2 = new q00.a().c(q00Var.a).d(q00Var.b);
        d2.e = q00Var.e;
        d2.f = 0;
        d2.g = q00Var.g;
        q00.a b = d2.b(q00Var.d);
        while (true) {
            q00.a aVar = b;
            aVar.getClass();
            q00 q00Var2 = new q00(aVar);
            if (i > 1) {
                int i3 = 0;
                while (true) {
                    d = i / 2;
                    if (i3 >= ((int) Math.floor(d))) {
                        break;
                    }
                    q00.a d3 = new q00.a().c(q00Var2.a).d(q00Var2.b);
                    d3.e = q00Var2.e;
                    d3.f = q00Var2.f;
                    d3.g = i3;
                    q00.a b2 = d3.b(q00Var2.d);
                    b2.getClass();
                    q00 q00Var3 = new q00(b2);
                    int i4 = i3 * 2;
                    v81VarArr[i3] = b(u51Var, v81VarArr[i4], v81VarArr[i4 + 1], q00Var3);
                    i3++;
                    q00Var2 = q00Var3;
                }
                if (i % 2 == 1) {
                    v81VarArr[(int) Math.floor(d)] = v81VarArr[i - 1];
                }
                double d4 = i;
                Double.isNaN(d4);
                Double.isNaN(d4);
                i = (int) Math.ceil(d4 / 2.0d);
                q00.a d5 = new q00.a().c(q00Var2.a).d(q00Var2.b);
                d5.e = q00Var2.e;
                d5.f = q00Var2.f + 1;
                d5.g = q00Var2.g;
                b = d5.b(q00Var2.d);
            } else {
                return v81VarArr[0];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0177 A[LOOP:0: B:28:0x0175->B:29:0x0177, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0188 A[LOOP:1: B:30:0x0186->B:31:0x0188, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static v81 b(u51 u51Var, v81 v81Var, v81 v81Var2, m81 m81Var) {
        m81 fuVar;
        m81 fuVar2;
        m81 fuVar3;
        int i;
        int i2;
        int length;
        int i3;
        if (v81Var != null) {
            if (v81Var2 != null) {
                if (v81Var.P == v81Var2.P) {
                    byte[] j = vj.j(u51Var.d);
                    if (m81Var instanceof q00) {
                        q00 q00Var = (q00) m81Var;
                        q00.a d = new q00.a().c(q00Var.a).d(q00Var.b);
                        d.e = q00Var.e;
                        d.f = q00Var.f;
                        d.g = q00Var.g;
                        q00.a b = d.b(0);
                        b.getClass();
                        fuVar = new q00(b);
                    } else {
                        if (m81Var instanceof fu) {
                            fu fuVar4 = (fu) m81Var;
                            fu.a d2 = new fu.a().c(fuVar4.a).d(fuVar4.b);
                            d2.e = fuVar4.e;
                            d2.f = fuVar4.f;
                            fu.a b2 = d2.b(0);
                            b2.getClass();
                            fuVar = new fu(b2);
                        }
                        byte[] a = u51Var.b.a(j, m81Var.a());
                        if (!(m81Var instanceof q00)) {
                            q00 q00Var2 = (q00) m81Var;
                            q00.a d3 = new q00.a().c(q00Var2.a).d(q00Var2.b);
                            d3.e = q00Var2.e;
                            d3.f = q00Var2.f;
                            d3.g = q00Var2.g;
                            q00.a b3 = d3.b(1);
                            b3.getClass();
                            fuVar2 = new q00(b3);
                        } else {
                            if (m81Var instanceof fu) {
                                fu fuVar5 = (fu) m81Var;
                                fu.a d4 = new fu.a().c(fuVar5.a).d(fuVar5.b);
                                d4.e = fuVar5.e;
                                d4.f = fuVar5.f;
                                fu.a b4 = d4.b(1);
                                b4.getClass();
                                fuVar2 = new fu(b4);
                            }
                            byte[] a2 = u51Var.b.a(j, m81Var.a());
                            if (m81Var instanceof q00) {
                                q00 q00Var3 = (q00) m81Var;
                                q00.a d5 = new q00.a().c(q00Var3.a).d(q00Var3.b);
                                d5.e = q00Var3.e;
                                d5.f = q00Var3.f;
                                d5.g = q00Var3.g;
                                q00.a b5 = d5.b(2);
                                b5.getClass();
                                fuVar3 = new q00(b5);
                            } else {
                                if (m81Var instanceof fu) {
                                    fu fuVar6 = (fu) m81Var;
                                    fu.a d6 = new fu.a().c(fuVar6.a).d(fuVar6.b);
                                    d6.e = fuVar6.e;
                                    d6.f = fuVar6.f;
                                    fu.a b6 = d6.b(2);
                                    b6.getClass();
                                    fuVar3 = new fu(b6);
                                }
                                byte[] a3 = u51Var.b.a(j, m81Var.a());
                                i = u51Var.a.b;
                                int i4 = i * 2;
                                byte[] bArr = new byte[i4];
                                for (i2 = 0; i2 < i; i2++) {
                                    bArr[i2] = (byte) (v81Var.b()[i2] ^ a2[i2]);
                                }
                                for (int i5 = 0; i5 < i; i5++) {
                                    bArr[i5 + i] = (byte) (v81Var2.b()[i5] ^ a3[i5]);
                                }
                                l00 l00Var = u51Var.b;
                                l00Var.getClass();
                                length = a.length;
                                i3 = l00Var.b;
                                if (length != i3) {
                                    if (i4 == i3 * 2) {
                                        return new v81(l00Var.b(1, a, bArr), v81Var.P);
                                    }
                                    throw new IllegalArgumentException("wrong in length");
                                }
                                throw new IllegalArgumentException("wrong key length");
                            }
                            m81Var = fuVar3;
                            byte[] a32 = u51Var.b.a(j, m81Var.a());
                            i = u51Var.a.b;
                            int i42 = i * 2;
                            byte[] bArr2 = new byte[i42];
                            while (i2 < i) {
                            }
                            while (i5 < i) {
                            }
                            l00 l00Var2 = u51Var.b;
                            l00Var2.getClass();
                            length = a.length;
                            i3 = l00Var2.b;
                            if (length != i3) {
                            }
                        }
                        m81Var = fuVar2;
                        byte[] a22 = u51Var.b.a(j, m81Var.a());
                        if (m81Var instanceof q00) {
                        }
                        m81Var = fuVar3;
                        byte[] a322 = u51Var.b.a(j, m81Var.a());
                        i = u51Var.a.b;
                        int i422 = i * 2;
                        byte[] bArr22 = new byte[i422];
                        while (i2 < i) {
                        }
                        while (i5 < i) {
                        }
                        l00 l00Var22 = u51Var.b;
                        l00Var22.getClass();
                        length = a.length;
                        i3 = l00Var22.b;
                        if (length != i3) {
                        }
                    }
                    m81Var = fuVar;
                    byte[] a4 = u51Var.b.a(j, m81Var.a());
                    if (!(m81Var instanceof q00)) {
                    }
                    m81Var = fuVar2;
                    byte[] a222 = u51Var.b.a(j, m81Var.a());
                    if (m81Var instanceof q00) {
                    }
                    m81Var = fuVar3;
                    byte[] a3222 = u51Var.b.a(j, m81Var.a());
                    i = u51Var.a.b;
                    int i4222 = i * 2;
                    byte[] bArr222 = new byte[i4222];
                    while (i2 < i) {
                    }
                    while (i5 < i) {
                    }
                    l00 l00Var222 = u51Var.b;
                    l00Var222.getClass();
                    length = a4.length;
                    i3 = l00Var222.b;
                    if (length != i3) {
                    }
                } else {
                    throw new IllegalStateException("height of both nodes must be equal");
                }
            } else {
                throw new NullPointerException("right == null");
            }
        } else {
            throw new NullPointerException("left == null");
        }
    }
}