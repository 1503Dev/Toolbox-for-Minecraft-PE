package defpackage;

import androidx.databinding.f;
import androidx.databinding.g;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: cb0  reason: default package */
public final class cb0<T> extends uj0<T> implements t01<T> {
    public final g<T> Q;
    public final f<T> R;
    public final ArrayList S;
    public final bq<T> T;
    public final cb0<T>.a U;
    public int V;

    /* renamed from: cb0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends g.a<g<T>> {
        public a() {
        }

        @Override // androidx.databinding.g.a
        public final void a(g<T> gVar) {
            cb0.this.D();
        }

        @Override // androidx.databinding.g.a
        public final void b(g<T> gVar, int i, int i2) {
            int z = cb0.this.z(i);
            if (i2 == 1) {
                cb0 cb0Var = cb0.this;
                boolean a = cb0Var.T.a(cb0Var.Q.get(i));
                boolean B = cb0.this.B(i);
                if (a && B) {
                    cb0 cb0Var2 = cb0.this;
                    cb0Var2.R.set(z, cb0Var2.Q.get(i));
                    return;
                } else if (a) {
                    cb0 cb0Var3 = cb0.this;
                    cb0Var3.R.add(z, cb0Var3.Q.get(i));
                    cb0.this.S.set(i, Integer.valueOf(cb0.C(z, true)));
                    cb0 cb0Var4 = cb0.this;
                    cb0.y(cb0Var4, i + 1, cb0Var4.S.size(), 1);
                    return;
                } else if (B) {
                    cb0.this.R.remove(z);
                    cb0.this.S.set(i, Integer.valueOf(cb0.C(z, false)));
                    cb0 cb0Var5 = cb0.this;
                    cb0.y(cb0Var5, i + 1, cb0Var5.S.size(), -1);
                    return;
                } else {
                    return;
                }
            }
            boolean[] zArr = new boolean[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                cb0 cb0Var6 = cb0.this;
                zArr[i3] = cb0Var6.T.a(cb0Var6.Q.get(i + i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                if (cb0.this.B(i + i5)) {
                    i4++;
                }
            }
            int i6 = -1;
            int i7 = -1;
            for (int i8 = i2 - 1; i8 >= 0; i8--) {
                int i9 = i + i8;
                if (cb0.this.B(i9)) {
                    if (!zArr[i8]) {
                        int z2 = cb0.this.z(i9);
                        if (i6 == -1) {
                            i7 = z2;
                        }
                        i6 = z2;
                    } else if (i6 != -1) {
                        if (i6 == i7) {
                            cb0.this.R.remove(i6);
                        } else {
                            cb0.this.R.subList(i6, i7 + 1).clear();
                        }
                        i6 = -1;
                        i7 = -1;
                    }
                }
            }
            if (i6 != -1) {
                if (i6 == i7) {
                    cb0.this.R.remove(i6);
                } else {
                    cb0.this.R.subList(i6, i7 + 1).clear();
                }
            }
            ArrayList arrayList = new ArrayList();
            int i10 = z;
            int i11 = -1;
            for (int i12 = 0; i12 < i2; i12++) {
                int i13 = i + i12;
                boolean B2 = cb0.this.B(i13);
                cb0.this.S.set(i13, Integer.valueOf(cb0.C(i10, zArr[i12])));
                if (zArr[i12]) {
                    if (!B2) {
                        if (i11 == -1) {
                            i11 = i10;
                        }
                        arrayList.add(cb0.this.Q.get(i13));
                    } else if (i11 != -1) {
                        cb0.this.R.addAll(i11, arrayList);
                        arrayList.clear();
                        i11 = -1;
                    }
                    i10++;
                }
            }
            if (i11 != -1) {
                cb0.this.R.addAll(i11, arrayList);
                arrayList.clear();
            }
            cb0 cb0Var7 = cb0.this;
            cb0.y(cb0Var7, i + i2, cb0Var7.S.size(), i10 - (z + i4));
        }

        @Override // androidx.databinding.g.a
        public final void c(g<T> gVar, int i, int i2) {
            int z = cb0.this.z(i);
            if (i2 == 1) {
                cb0 cb0Var = cb0.this;
                boolean a = cb0Var.T.a(cb0Var.Q.get(i));
                cb0.this.S.add(i, Integer.valueOf(cb0.C(z, a)));
                if (a) {
                    cb0 cb0Var2 = cb0.this;
                    cb0Var2.R.add(z, cb0Var2.Q.get(i));
                    cb0 cb0Var3 = cb0.this;
                    cb0.y(cb0Var3, i + 1, cb0Var3.S.size(), 1);
                    return;
                }
                return;
            }
            Object[] objArr = new Object[i2];
            Integer[] numArr = new Integer[i2];
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                cb0 cb0Var4 = cb0.this;
                int i5 = i + i4;
                boolean a2 = cb0Var4.T.a(cb0Var4.Q.get(i5));
                numArr[i4] = Integer.valueOf(cb0.C(z + i3, a2));
                if (a2) {
                    objArr[i3] = cb0.this.Q.get(i5);
                    i3++;
                }
            }
            cb0.this.S.addAll(i, Arrays.asList(numArr));
            cb0 cb0Var5 = cb0.this;
            cb0.y(cb0Var5, i + i2, cb0Var5.S.size(), i3);
            cb0.this.R.addAll(z, Arrays.asList(objArr).subList(0, i3));
        }

        @Override // androidx.databinding.g.a
        public final void d(g<T> gVar, int i, int i2, int i3) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.databinding.g.a
        public final void e(g<T> gVar, int i, int i2) {
            if (i2 == 1) {
                if (cb0.this.B(i)) {
                    cb0 cb0Var = cb0.this;
                    cb0Var.R.remove(cb0Var.z(i));
                    cb0 cb0Var2 = cb0.this;
                    cb0.y(cb0Var2, i + 1, cb0Var2.S.size(), -1);
                }
                cb0.this.S.remove(i);
                return;
            }
            int z = cb0.this.z(i);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                if (cb0.this.B(i + i4)) {
                    i3++;
                }
            }
            cb0.this.R.subList(z, i3 + z).clear();
            cb0.this.S.subList(i, i2 + i).clear();
        }
    }

    public cb0(f fVar, bq bqVar) {
        super(new f());
        this.S = new ArrayList();
        this.U = new a();
        this.V = 0;
        this.Q = fVar;
        this.T = bqVar;
        this.R = (f) this.P;
    }

    public static int C(int i, boolean z) {
        return (i & Integer.MAX_VALUE) | (z ? RecyclerView.UNDEFINED_DURATION : 0);
    }

    public static void y(cb0 cb0Var, int i, int i2, int i3) {
        while (i < i2) {
            cb0Var.S.set(i, Integer.valueOf(C(cb0Var.z(i) + i3, cb0Var.B(i))));
            i++;
        }
        cb0Var.getClass();
    }

    public final boolean B(int i) {
        return (((Integer) this.S.get(i)).intValue() & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final void D() {
        this.R.clear();
        this.S.clear();
        int i = 0;
        for (int i2 = 0; i2 < this.Q.size(); i2++) {
            boolean a2 = this.T.a(this.Q.get(i2));
            this.S.add(Integer.valueOf(C(i, a2)));
            if (a2) {
                this.R.add(this.Q.get(i2));
                i++;
            }
        }
        this.S.add(Integer.valueOf(C(i, false)));
    }

    @Override // defpackage.ea
    public final void g() {
        int i = this.V - 1;
        this.V = i;
        if (i == 0) {
            g<T> gVar = this.Q;
            if (gVar instanceof ea) {
                ((ea) gVar).g();
            }
            this.Q.j(this.U);
            this.R.clear();
            this.S.clear();
        }
    }

    @Override // defpackage.ea
    public final void h() {
        int i = this.V;
        this.V = i + 1;
        if (i == 0) {
            this.Q.l(this.U);
            g<T> gVar = this.Q;
            if (gVar instanceof ea) {
                ((ea) gVar).h();
            }
            D();
        }
    }

    @Override // defpackage.t01
    public final void i(int i) {
        this.U.b(this.Q, 0, i);
    }

    @Override // androidx.databinding.g
    public final void j(g.a<? extends g<T>> aVar) {
        this.R.j(aVar);
    }

    @Override // androidx.databinding.g
    public final void l(g.a<? extends g<T>> aVar) {
        this.R.l(aVar);
    }

    public final int z(int i) {
        return ((Integer) this.S.get(i)).intValue() & Integer.MAX_VALUE;
    }
}