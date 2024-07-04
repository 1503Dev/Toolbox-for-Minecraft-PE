package defpackage;

import defpackage.fu;
import defpackage.q00;
import defpackage.qa0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* renamed from: p8  reason: default package */
public final class p8 implements Serializable {
    public transient u51 P;
    public final int Q;
    public final List<r8> R;
    public int S;
    public ArrayList T;
    public Map<Integer, LinkedList<v81>> U;
    public Stack<v81> V;
    public TreeMap W;
    public int X;
    public boolean Y;

    public p8(p8 p8Var, byte[] bArr, byte[] bArr2, qa0 qa0Var) {
        this.P = p8Var.P;
        this.Q = p8Var.Q;
        this.S = p8Var.S;
        this.T = new ArrayList(p8Var.T);
        this.U = p8Var.U;
        this.V = (Stack) p8Var.V.clone();
        this.R = p8Var.R;
        this.W = new TreeMap((Map) p8Var.W);
        this.X = p8Var.X;
        b(bArr, bArr2, qa0Var);
        p8Var.Y = true;
    }

    public p8(u51 u51Var, int i, int i2) {
        this.P = u51Var;
        this.Q = i;
        this.S = i2;
        if (i2 <= i && i2 >= 2) {
            int i3 = i - i2;
            if (i3 % 2 == 0) {
                this.T = new ArrayList();
                this.U = new TreeMap();
                this.V = new Stack<>();
                this.R = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    this.R.add(new r8(i4));
                }
                this.W = new TreeMap();
                this.X = 0;
                this.Y = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public p8(x81 x81Var, byte[] bArr, byte[] bArr2, qa0 qa0Var) {
        this(x81Var.a, x81Var.b, x81Var.c);
        a(bArr, bArr2, qa0Var);
    }

    public final void a(byte[] bArr, byte[] bArr2, qa0 qa0Var) {
        int i;
        q00.a d = new q00.a().c(qa0Var.a).d(qa0Var.b);
        d.getClass();
        q00 q00Var = new q00(d);
        fu.a d2 = new fu.a().c(qa0Var.a).d(qa0Var.b);
        d2.getClass();
        fu fuVar = new fu(d2);
        int i2 = 0;
        while (i2 < (1 << this.Q)) {
            qa0.a d3 = new qa0.a().c(qa0Var.a).d(qa0Var.b);
            d3.e = i2;
            d3.f = qa0Var.f;
            d3.g = qa0Var.g;
            qa0.a b = d3.b(qa0Var.d);
            b.getClass();
            qa0 qa0Var2 = new qa0(b);
            u51 u51Var = this.P;
            u51Var.d(u51Var.c(bArr2, qa0Var2), bArr);
            fk b2 = this.P.b(qa0Var2);
            q00.a d4 = new q00.a().c(q00Var.a).d(q00Var.b);
            d4.e = i2;
            d4.f = q00Var.f;
            d4.g = q00Var.g;
            q00.a b3 = d4.b(q00Var.d);
            b3.getClass();
            q00 q00Var2 = new q00(b3);
            v81 a = w81.a(this.P, b2, q00Var2);
            fu.a d5 = new fu.a().c(fuVar.a).d(fuVar.b);
            d5.f = i2;
            fu.a b4 = d5.b(fuVar.d);
            b4.getClass();
            fuVar = new fu(b4);
            while (!this.V.isEmpty()) {
                int i3 = this.V.peek().P;
                int i4 = a.P;
                if (i3 == i4) {
                    int floor = (int) Math.floor(i2 / (1 << i4));
                    if (floor == 1) {
                        this.T.add(a.clone());
                    }
                    if (floor == 3 && (i = a.P) < this.Q - this.S) {
                        r8 r8Var = this.R.get(i);
                        v81 clone = a.clone();
                        r8Var.P = clone;
                        int i5 = clone.P;
                        r8Var.R = i5;
                        if (i5 == r8Var.Q) {
                            r8Var.U = true;
                        }
                    }
                    if (floor >= 3 && (floor & 1) == 1) {
                        int i6 = a.P;
                        int i7 = this.Q;
                        if (i6 >= i7 - this.S && i6 <= i7 - 2) {
                            if (this.U.get(Integer.valueOf(i6)) == null) {
                                LinkedList<v81> linkedList = new LinkedList<>();
                                linkedList.add(a.clone());
                                this.U.put(Integer.valueOf(a.P), linkedList);
                            } else {
                                this.U.get(Integer.valueOf(a.P)).add(a.clone());
                            }
                        }
                    }
                    fu.a d6 = new fu.a().c(fuVar.a).d(fuVar.b);
                    d6.e = fuVar.e;
                    d6.f = (fuVar.f - 1) / 2;
                    fu.a b5 = d6.b(fuVar.d);
                    b5.getClass();
                    fu fuVar2 = new fu(b5);
                    v81 b6 = w81.b(this.P, this.V.pop(), a, fuVar2);
                    v81 v81Var = new v81(b6.b(), b6.P + 1);
                    fu.a d7 = new fu.a().c(fuVar2.a).d(fuVar2.b);
                    d7.e = fuVar2.e + 1;
                    d7.f = fuVar2.f;
                    fu.a b7 = d7.b(fuVar2.d);
                    b7.getClass();
                    fuVar = new fu(b7);
                    a = v81Var;
                }
            }
            this.V.push(a);
            i2++;
            qa0Var = qa0Var2;
            q00Var = q00Var2;
        }
        this.V.pop();
    }

    public final void b(byte[] bArr, byte[] bArr2, qa0 qa0Var) {
        long j;
        int i;
        int i2;
        ArrayList arrayList;
        v81 removeFirst;
        qa0 qa0Var2 = qa0Var;
        if (!this.Y) {
            if (this.X <= (1 << this.Q) - 2) {
                q00.a d = new q00.a().c(qa0Var2.a).d(qa0Var2.b);
                d.getClass();
                int i3 = d.b;
                long j2 = d.c;
                int i4 = d.d;
                int i5 = d.f;
                int i6 = d.g;
                fu.a d2 = new fu.a().c(qa0Var2.a).d(qa0Var2.b);
                d2.getClass();
                int i7 = d2.b;
                long j3 = d2.c;
                int i8 = d2.d;
                int i9 = this.X;
                int i10 = this.Q;
                int i11 = 0;
                while (true) {
                    if (i11 < i10) {
                        if (((i9 >> i11) & 1) == 0) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = 0;
                        break;
                    }
                }
                if (((this.X >> (i11 + 1)) & 1) == 0 && i11 < this.Q - 1) {
                    j = j3;
                    this.W.put(Integer.valueOf(i11), ((v81) this.T.get(i11)).clone());
                } else {
                    j = j3;
                }
                if (i11 == 0) {
                    qa0.a d3 = new qa0.a().c(qa0Var2.a).d(qa0Var2.b);
                    d3.e = this.X;
                    d3.f = qa0Var2.f;
                    d3.g = qa0Var2.g;
                    qa0.a b = d3.b(qa0Var2.d);
                    b.getClass();
                    qa0 qa0Var3 = new qa0(b);
                    u51 u51Var = this.P;
                    u51Var.d(u51Var.c(bArr2, qa0Var3), bArr);
                    fk b2 = this.P.b(qa0Var3);
                    q00.a d4 = new q00.a().c(i3).d(j2);
                    d4.e = this.X;
                    d4.f = i5;
                    d4.g = i6;
                    q00.a b3 = d4.b(i4);
                    b3.getClass();
                    this.T.set(0, w81.a(this.P, b2, new q00(b3)));
                    qa0Var2 = qa0Var3;
                    i2 = 1;
                } else {
                    fu.a d5 = new fu.a().c(i7).d(j);
                    int i12 = i11 - 1;
                    d5.e = i12;
                    d5.f = this.X >> i11;
                    fu.a b4 = d5.b(i8);
                    b4.getClass();
                    v81 b5 = w81.b(this.P, (v81) this.T.get(i12), (v81) this.W.get(Integer.valueOf(i12)), new fu(b4));
                    this.T.set(i11, new v81(b5.b(), b5.P + 1));
                    this.W.remove(Integer.valueOf(i12));
                    int i13 = 0;
                    while (true) {
                        i = this.Q;
                        if (i13 >= i11) {
                            break;
                        }
                        if (i13 < i - this.S) {
                            arrayList = this.T;
                            removeFirst = this.R.get(i13).P.clone();
                        } else {
                            arrayList = this.T;
                            removeFirst = this.U.get(Integer.valueOf(i13)).removeFirst();
                        }
                        arrayList.set(i13, removeFirst);
                        i13++;
                    }
                    int min = Math.min(i11, i - this.S);
                    for (int i14 = 0; i14 < min; i14++) {
                        int i15 = ((1 << i14) * 3) + this.X + 1;
                        if (i15 < (1 << this.Q)) {
                            r8 r8Var = this.R.get(i14);
                            r8Var.P = null;
                            r8Var.R = r8Var.Q;
                            r8Var.S = i15;
                            r8Var.T = true;
                            r8Var.U = false;
                        }
                    }
                    i2 = 1;
                }
                int i16 = 0;
                while (i16 < ((this.Q - this.S) >> i2)) {
                    r8 r8Var2 = null;
                    for (r8 r8Var3 : this.R) {
                        if (!r8Var3.U && r8Var3.T && (r8Var2 == null || r8Var3.a() < r8Var2.a() || (r8Var3.a() == r8Var2.a() && r8Var3.S < r8Var2.S))) {
                            r8Var2 = r8Var3;
                        }
                    }
                    if (r8Var2 != null) {
                        Stack<v81> stack = this.V;
                        u51 u51Var2 = this.P;
                        if (!r8Var2.U && r8Var2.T) {
                            qa0.a d6 = new qa0.a().c(qa0Var2.a).d(qa0Var2.b);
                            d6.e = r8Var2.S;
                            d6.f = qa0Var2.f;
                            d6.g = qa0Var2.g;
                            qa0.a b6 = d6.b(qa0Var2.d);
                            b6.getClass();
                            qa0 qa0Var4 = new qa0(b6);
                            q00.a d7 = new q00.a().c(qa0Var4.a).d(qa0Var4.b);
                            d7.e = r8Var2.S;
                            q00 q00Var = new q00(d7);
                            fu.a d8 = new fu.a().c(qa0Var4.a).d(qa0Var4.b);
                            d8.f = r8Var2.S;
                            fu fuVar = new fu(d8);
                            u51Var2.d(u51Var2.c(bArr2, qa0Var4), bArr);
                            v81 a = w81.a(u51Var2, u51Var2.b(qa0Var4), q00Var);
                            while (!stack.isEmpty() && stack.peek().P == a.P && stack.peek().P != r8Var2.Q) {
                                fu.a d9 = new fu.a().c(fuVar.a).d(fuVar.b);
                                d9.e = fuVar.e;
                                d9.f = (fuVar.f - 1) / 2;
                                fu.a b7 = d9.b(fuVar.d);
                                b7.getClass();
                                fu fuVar2 = new fu(b7);
                                v81 b8 = w81.b(u51Var2, stack.pop(), a, fuVar2);
                                v81 v81Var = new v81(b8.b(), b8.P + 1);
                                fu.a d10 = new fu.a().c(fuVar2.a).d(fuVar2.b);
                                d10.e = fuVar2.e + 1;
                                d10.f = fuVar2.f;
                                fu.a b9 = d10.b(fuVar2.d);
                                b9.getClass();
                                fuVar = new fu(b9);
                                a = v81Var;
                            }
                            v81 v81Var2 = r8Var2.P;
                            if (v81Var2 == null) {
                                r8Var2.P = a;
                            } else if (v81Var2.P == a.P) {
                                fu.a d11 = new fu.a().c(fuVar.a).d(fuVar.b);
                                d11.e = fuVar.e;
                                d11.f = (fuVar.f - 1) / 2;
                                fu.a b10 = d11.b(fuVar.d);
                                b10.getClass();
                                fu fuVar3 = new fu(b10);
                                a = new v81(w81.b(u51Var2, r8Var2.P, a, fuVar3).b(), r8Var2.P.P + 1);
                                r8Var2.P = a;
                                fu.a d12 = new fu.a().c(fuVar3.a).d(fuVar3.b);
                                d12.e = fuVar3.e + 1;
                                d12.f = fuVar3.f;
                                d12.b(fuVar3.d).e();
                            } else {
                                stack.push(a);
                            }
                            if (r8Var2.P.P == r8Var2.Q) {
                                r8Var2.U = true;
                            } else {
                                r8Var2.R = a.P;
                                r8Var2.S++;
                            }
                        } else {
                            throw new IllegalStateException("finished or not initialized");
                        }
                    }
                    i16++;
                    i2 = 1;
                }
                this.X++;
                return;
            }
            throw new IllegalStateException("index out of bounds");
        }
        throw new IllegalStateException("index already used");
    }
}