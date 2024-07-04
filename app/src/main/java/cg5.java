package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: cg5  reason: default package */
public final class cg5 extends gd5 {
    public static final int[] W = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    public final int R;
    public final gd5 S;
    public final gd5 T;
    public final int U;
    public final int V;

    public /* synthetic */ cg5() {
        throw null;
    }

    public cg5(gd5 gd5Var, gd5 gd5Var2) {
        this.S = gd5Var;
        this.T = gd5Var2;
        int o = gd5Var.o();
        this.U = o;
        this.R = gd5Var2.o() + o;
        this.V = Math.max(gd5Var.q(), gd5Var2.q()) + 1;
    }

    public static int I(int i) {
        int[] iArr = W;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    @Override // defpackage.gd5
    public final boolean C() {
        int t = this.S.t(0, 0, this.U);
        gd5 gd5Var = this.T;
        return gd5Var.t(t, 0, gd5Var.o()) == 0;
    }

    @Override // defpackage.gd5
    public final cx4 E() {
        return new yf5(this);
    }

    @Override // defpackage.gd5
    public final boolean equals(Object obj) {
        boolean I;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gd5)) {
            return false;
        }
        gd5 gd5Var = (gd5) obj;
        if (this.R != gd5Var.o()) {
            return false;
        }
        if (this.R == 0) {
            return true;
        }
        int i = this.P;
        int i2 = gd5Var.P;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        bg5 bg5Var = new bg5(this);
        dd5 next = bg5Var.next();
        bg5 bg5Var2 = new bg5(gd5Var);
        dd5 next2 = bg5Var2.next();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int o = next.o() - i3;
            int o2 = next2.o() - i4;
            int min = Math.min(o, o2);
            if (i3 == 0) {
                I = next.I(next2, i4, min);
            } else {
                I = next2.I(next, i3, min);
            }
            if (!I) {
                return false;
            }
            i5 += min;
            int i6 = this.R;
            if (i5 >= i6) {
                if (i5 == i6) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == o) {
                next = bg5Var.next();
                i3 = 0;
            } else {
                i3 += min;
            }
            if (min == o2) {
                next2 = bg5Var2.next();
                i4 = 0;
            } else {
                i4 += min;
            }
        }
    }

    @Override // defpackage.gd5
    public final byte h(int i) {
        gd5.H(i, this.R);
        return m(i);
    }

    @Override // defpackage.gd5, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new yf5(this);
    }

    @Override // defpackage.gd5
    public final byte m(int i) {
        int i2 = this.U;
        return i < i2 ? this.S.m(i) : this.T.m(i - i2);
    }

    @Override // defpackage.gd5
    public final int o() {
        return this.R;
    }

    @Override // defpackage.gd5
    public final void p(int i, int i2, int i3, byte[] bArr) {
        int i4 = i + i3;
        int i5 = this.U;
        if (i4 <= i5) {
            this.S.p(i, i2, i3, bArr);
        } else if (i >= i5) {
            this.T.p(i - i5, i2, i3, bArr);
        } else {
            int i6 = i5 - i;
            this.S.p(i, i2, i6, bArr);
            this.T.p(0, i2 + i6, i3 - i6, bArr);
        }
    }

    @Override // defpackage.gd5
    public final int q() {
        return this.V;
    }

    @Override // defpackage.gd5
    public final boolean r() {
        return this.R >= I(this.V);
    }

    @Override // defpackage.gd5
    public final int s(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.U;
        if (i4 <= i5) {
            return this.S.s(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.T.s(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.T.s(this.S.s(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.gd5
    public final int t(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.U;
        if (i4 <= i5) {
            return this.S.t(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.T.t(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.T.t(this.S.t(i, i2, i6), 0, i3 - i6);
    }

    @Override // defpackage.gd5
    public final gd5 u(int i, int i2) {
        int D = gd5.D(i, i2, this.R);
        if (D == 0) {
            return gd5.Q;
        }
        if (D == this.R) {
            return this;
        }
        int i3 = this.U;
        if (i2 <= i3) {
            return this.S.u(i, i2);
        }
        if (i >= i3) {
            return this.T.u(i - i3, i2 - i3);
        }
        gd5 gd5Var = this.S;
        return new cg5(gd5Var.u(i, gd5Var.o()), this.T.u(0, i2 - this.U));
    }

    @Override // defpackage.gd5
    public final ld5 v() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = new ArrayDeque(this.V);
        arrayDeque.push(this);
        gd5 gd5Var = this.S;
        while (gd5Var instanceof cg5) {
            cg5 cg5Var = (cg5) gd5Var;
            arrayDeque.push(cg5Var);
            gd5Var = cg5Var.S;
        }
        dd5 dd5Var = (dd5) gd5Var;
        while (true) {
            boolean z3 = false;
            if (dd5Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (dd5Var != null) {
                    do {
                        dd5 dd5Var2 = null;
                        if (arrayDeque.isEmpty()) {
                            break;
                        }
                        gd5 gd5Var2 = ((cg5) arrayDeque.pop()).T;
                        while (gd5Var2 instanceof cg5) {
                            cg5 cg5Var2 = (cg5) gd5Var2;
                            arrayDeque.push(cg5Var2);
                            gd5Var2 = cg5Var2.S;
                        }
                        dd5Var2 = (dd5) gd5Var2;
                        if (dd5Var2.o() == 0) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        arrayList.add(dd5Var.y());
                        dd5Var = dd5Var2;
                    } while (z2);
                    arrayList.add(dd5Var.y());
                    dd5Var = dd5Var2;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    ByteBuffer byteBuffer = (ByteBuffer) it.next();
                    i += byteBuffer.remaining();
                    if (byteBuffer.hasArray()) {
                        z3 |= true;
                    } else if (byteBuffer.isDirect()) {
                        z3 |= true;
                    } else {
                        z3 |= true;
                    }
                }
                if (z3) {
                    return new id5(arrayList, i);
                }
                return new kd5(new ue5(arrayList));
            }
        }
    }

    @Override // defpackage.gd5
    public final String w(Charset charset) {
        return new String(g(), charset);
    }

    @Override // defpackage.gd5
    public final void z(qd5 qd5Var) {
        this.S.z(qd5Var);
        this.T.z(qd5Var);
    }
}