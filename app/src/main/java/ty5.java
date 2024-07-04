package defpackage;

import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: ty5  reason: default package */
public abstract class ty5 extends wy5 {
    /* JADX WARN: Type inference failed for: r8v22, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.wy5
    public final xy5 d(mk5[] mk5VarArr, hx5 hx5Var) {
        final dy5 dy5Var;
        final boolean z;
        String str;
        long j;
        boolean z2;
        nw4 nw4Var;
        zn5 zn5Var;
        int[] iArr;
        int length;
        qy5 lx5Var;
        nw4 s;
        long j2;
        double d;
        long j3;
        boolean z3;
        ey5 ey5Var;
        py5 py5Var;
        hx5 hx5Var2;
        hy5 hy5Var;
        int[] iArr2;
        boolean z4;
        int[] iArr3 = new int[3];
        qe3[][] qe3VarArr = new qe3[3];
        int[][][] iArr4 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = hx5Var.a;
            qe3VarArr[i] = new qe3[i2];
            iArr4[i] = new int[i2];
        }
        int[] iArr5 = new int[2];
        for (int i3 = 0; i3 < 2; i3++) {
            iArr5[i3] = mk5VarArr[i3].o();
        }
        for (int i4 = 0; i4 < hx5Var.a; i4++) {
            qe3 a = hx5Var.a(i4);
            int i5 = a.b;
            int i6 = 2;
            int i7 = 0;
            boolean z5 = true;
            for (int i8 = 0; i8 < 2; i8++) {
                mk5 mk5Var = mk5VarArr[i8];
                int i9 = 0;
                for (int i10 = 0; i10 <= 0; i10++) {
                    i9 = Math.max(i9, mk5Var.l(a.c[i10]) & 7);
                }
                if (iArr3[i8] == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i9 <= i7) {
                    if (i9 == i7 && i5 == 5 && !z5 && z4) {
                        i6 = i8;
                        i7 = i9;
                        z5 = true;
                    }
                } else {
                    z5 = z4;
                    i6 = i8;
                    i7 = i9;
                }
            }
            if (i6 == 2) {
                iArr2 = new int[1];
            } else {
                mk5 mk5Var2 = mk5VarArr[i6];
                int[] iArr6 = new int[1];
                for (int i11 = 0; i11 <= 0; i11++) {
                    iArr6[i11] = mk5Var2.l(a.c[i11]);
                }
                iArr2 = iArr6;
            }
            int i12 = iArr3[i6];
            qe3VarArr[i6][i12] = a;
            iArr4[i6][i12] = iArr2;
            iArr3[i6] = i12 + 1;
        }
        hx5[] hx5VarArr = new hx5[2];
        String[] strArr = new String[2];
        int[] iArr7 = new int[2];
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = iArr3[i13];
            hx5VarArr[i13] = new hx5((qe3[]) zn4.f(i14, qe3VarArr[i13]));
            iArr4[i13] = (int[][]) zn4.f(i14, iArr4[i13]);
            strArr[i13] = mk5VarArr[i13].h();
            iArr7[i13] = mk5VarArr[i13].P;
        }
        sy5 sy5Var = new sy5(iArr7, hx5VarArr, iArr5, iArr4, new hx5((qe3[]) zn4.f(iArr3[2], qe3VarArr[2])));
        final oy5 oy5Var = (oy5) this;
        synchronized (oy5Var.c) {
            dy5Var = oy5Var.f;
            if (dy5Var.n && zn4.a >= 32 && (hy5Var = oy5Var.g) != null) {
                Looper myLooper = Looper.myLooper();
                tv2.B(myLooper);
                hy5Var.b(oy5Var, myLooper);
            }
        }
        py5[] py5VarArr = new py5[2];
        Pair j4 = oy5.j(2, sy5Var, iArr4, new x93(dy5Var, iArr5), new Comparator() { // from class: rx5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                List list = (List) obj;
                List list2 = (List) obj2;
                ly5 ly5Var = ly5.P;
                cv4 b = av4.f(ly5Var.compare((ny5) Collections.max(list, ly5Var), (ny5) Collections.max(list2, ly5Var))).b(list.size(), list2.size());
                my5 my5Var = new Comparator() { // from class: my5
                    @Override // java.util.Comparator
                    public final int compare(Object obj3, Object obj4) {
                        mw4 a2;
                        ny5 ny5Var = (ny5) obj3;
                        ny5 ny5Var2 = (ny5) obj4;
                        if (ny5Var.T && ny5Var.W) {
                            a2 = oy5.j;
                        } else {
                            a2 = oy5.j.a();
                        }
                        av4 av4Var = cv4.a;
                        Integer valueOf = Integer.valueOf(ny5Var.X);
                        Integer valueOf2 = Integer.valueOf(ny5Var2.X);
                        ny5Var.U.getClass();
                        return av4Var.c(valueOf, valueOf2, oy5.k).c(Integer.valueOf(ny5Var.Y), Integer.valueOf(ny5Var2.Y), a2).c(Integer.valueOf(ny5Var.X), Integer.valueOf(ny5Var2.X), a2).a();
                    }
                };
                return b.c((ny5) Collections.max(list, my5Var), (ny5) Collections.max(list2, my5Var), my5Var).a();
            }
        });
        if (j4 != null) {
            py5VarArr[((Integer) j4.second).intValue()] = (py5) j4.first;
        }
        int i15 = 0;
        while (true) {
            if (i15 < 2) {
                if (sy5Var.a[i15] == 2 && sy5Var.b[i15].a > 0) {
                    z = true;
                    break;
                }
                i15++;
            } else {
                z = false;
                break;
            }
        }
        Pair j5 = oy5.j(1, sy5Var, iArr4, new jy5() { // from class: px5
            @Override // defpackage.jy5
            public final nw4 b(int i16, qe3 qe3Var, int[] iArr8) {
                oy5 oy5Var2 = oy5.this;
                dy5 dy5Var2 = dy5Var;
                boolean z6 = z;
                ox5 ox5Var = new ox5(oy5Var2);
                kv4 kv4Var = new kv4();
                int i17 = 0;
                while (true) {
                    qe3Var.getClass();
                    if (i17 <= 0) {
                        kv4Var.p(new vx5(i16, qe3Var, i17, dy5Var2, iArr8[i17], z6, ox5Var));
                        i17++;
                    } else {
                        return kv4Var.s();
                    }
                }
            }
        }, new Comparator() { // from class: qx5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((vx5) Collections.max((List) obj)).f((vx5) Collections.max((List) obj2));
            }
        });
        if (j5 != null) {
            py5VarArr[((Integer) j5.second).intValue()] = (py5) j5.first;
        }
        if (j5 == null) {
            str = null;
        } else {
            py5 py5Var2 = (py5) j5.first;
            str = py5Var2.a.c[py5Var2.b[0]].c;
        }
        Pair j6 = oy5.j(3, sy5Var, iArr4, new ak1(dy5Var, str), new Comparator() { // from class: sx5
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((iy5) ((List) obj).get(0)).compareTo((iy5) ((List) obj2).get(0));
            }
        });
        if (j6 != null) {
            py5VarArr[((Integer) j6.second).intValue()] = (py5) j6.first;
        }
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            int i18 = sy5Var.a[i16];
            if (i18 != i17 && i18 != 1 && i18 != 3) {
                hx5 hx5Var3 = sy5Var.b[i16];
                int[][] iArr8 = iArr4[i16];
                int i19 = 0;
                qe3 qe3Var = null;
                wx5 wx5Var = null;
                for (int i20 = 0; i20 < hx5Var3.a; i20++) {
                    qe3 a2 = hx5Var3.a(i20);
                    int[] iArr9 = iArr8[i20];
                    int i21 = 0;
                    while (i21 <= 0) {
                        if (oy5.h(iArr9[i21], dy5Var.o)) {
                            wx5 wx5Var2 = new wx5(a2.c[i21], iArr9[i21]);
                            if (wx5Var != null) {
                                hx5Var2 = hx5Var3;
                                if (cv4.a.d(wx5Var2.Q, wx5Var.Q).d(wx5Var2.P, wx5Var.P).a() <= 0) {
                                }
                            } else {
                                hx5Var2 = hx5Var3;
                            }
                            wx5Var = wx5Var2;
                            qe3Var = a2;
                            i19 = i21;
                        } else {
                            hx5Var2 = hx5Var3;
                        }
                        i21++;
                        hx5Var3 = hx5Var2;
                    }
                }
                if (qe3Var == null) {
                    py5Var = null;
                } else {
                    py5Var = new py5(qe3Var, new int[]{i19});
                }
                py5VarArr[i16] = py5Var;
            }
            i16++;
        }
        HashMap hashMap = new HashMap();
        for (int i22 = 0; i22 < 2; i22++) {
            hx5 hx5Var4 = sy5Var.b[i22];
            for (int i23 = 0; i23 < hx5Var4.a; i23++) {
                if (((jf3) dy5Var.i.get(hx5Var4.a(i23))) != null) {
                    throw null;
                }
            }
        }
        hx5 hx5Var5 = sy5Var.e;
        for (int i24 = 0; i24 < hx5Var5.a; i24++) {
            if (((jf3) dy5Var.i.get(hx5Var5.a(i24))) != null) {
                throw null;
            }
        }
        for (int i25 = 0; i25 < 2; i25++) {
            if (((jf3) hashMap.get(Integer.valueOf(sy5Var.a[i25]))) != null) {
                throw null;
            }
        }
        int i26 = 0;
        while (true) {
            if (i26 < 2) {
                hx5 hx5Var6 = sy5Var.b[i26];
                Map map = (Map) dy5Var.q.get(i26);
                if (map != null && map.containsKey(hx5Var6)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    Map map2 = (Map) dy5Var.q.get(i26);
                    if (map2 != null) {
                        ey5Var = (ey5) map2.get(hx5Var6);
                    } else {
                        ey5Var = null;
                    }
                    if (ey5Var == null) {
                        py5VarArr[i26] = null;
                    } else {
                        throw null;
                    }
                }
                i26++;
            } else {
                int i27 = 0;
                for (int i28 = 2; i27 < i28; i28 = 2) {
                    int i29 = sy5Var.a[i27];
                    if (dy5Var.r.get(i27) || dy5Var.j.contains(Integer.valueOf(i29))) {
                        py5VarArr[i27] = null;
                    }
                    i27++;
                }
                a53 a53Var = oy5Var.i;
                tv2.B(oy5Var.b);
                ArrayList arrayList = new ArrayList();
                for (int i30 = 0; i30 < 2; i30++) {
                    py5 py5Var3 = py5VarArr[i30];
                    if (py5Var3 != null && py5Var3.b.length > 1) {
                        kv4 kv4Var = new kv4();
                        kv4Var.p(new kx5(0L, 0L));
                        arrayList.add(kv4Var);
                    } else {
                        arrayList.add(null);
                    }
                }
                int i31 = 2;
                long[][] jArr = new long[2];
                int i32 = 0;
                while (true) {
                    j = -1;
                    if (i32 >= i31) {
                        break;
                    }
                    py5 py5Var4 = py5VarArr[i32];
                    if (py5Var4 == null) {
                        jArr[i32] = new long[0];
                    } else {
                        jArr[i32] = new long[py5Var4.b.length];
                        int i33 = 0;
                        while (true) {
                            int[] iArr10 = py5Var4.b;
                            if (i33 >= iArr10.length) {
                                break;
                            }
                            long j7 = py5Var4.a.c[iArr10[i33]].g;
                            long[] jArr2 = jArr[i32];
                            if (j7 == -1) {
                                j7 = 0;
                            }
                            jArr2[i33] = j7;
                            i33++;
                        }
                        Arrays.sort(jArr[i32]);
                    }
                    i32++;
                    i31 = 2;
                }
                int[] iArr11 = new int[i31];
                long[] jArr3 = new long[i31];
                int i34 = 0;
                while (i34 < i31) {
                    long[] jArr4 = jArr[i34];
                    if (jArr4.length == 0) {
                        j3 = 0;
                    } else {
                        j3 = jArr4[0];
                    }
                    jArr3[i34] = j3;
                    i34++;
                    i31 = 2;
                }
                lx5.c(arrayList, jArr3);
                iw4 iw4Var = new iw4(new TreeMap(kw4.P), new hw4());
                int i35 = 0;
                for (int i36 = 2; i35 < i36; i36 = 2) {
                    int length2 = jArr[i35].length;
                    if (length2 <= 1) {
                        j2 = j;
                    } else {
                        double[] dArr = new double[length2];
                        int i37 = 0;
                        while (true) {
                            long[] jArr5 = jArr[i35];
                            double d2 = 0.0d;
                            if (i37 >= jArr5.length) {
                                break;
                            }
                            long j8 = jArr5[i37];
                            if (j8 != -1) {
                                d2 = Math.log(j8);
                            }
                            dArr[i37] = d2;
                            i37++;
                        }
                        j2 = -1;
                        int i38 = length2 - 1;
                        double d3 = dArr[i38] - dArr[0];
                        int i39 = 0;
                        while (i39 < i38) {
                            double d4 = dArr[i39];
                            int i40 = i39 + 1;
                            double d5 = d4 + dArr[i40];
                            if (d3 == 0.0d) {
                                d = 1.0d;
                            } else {
                                d = ((d5 * 0.5d) - dArr[0]) / d3;
                            }
                            Double valueOf = Double.valueOf(d);
                            int i41 = i38;
                            Integer valueOf2 = Integer.valueOf(i35);
                            Collection collection = (Collection) iw4Var.S.get(valueOf);
                            if (collection == null) {
                                ?? a3 = iw4Var.U.a();
                                if (a3.add(valueOf2)) {
                                    iw4Var.T++;
                                    iw4Var.S.put(valueOf, a3);
                                } else {
                                    throw new AssertionError("New Collection violated the Collection spec");
                                }
                            } else if (collection.add(valueOf2)) {
                                iw4Var.T++;
                            }
                            i38 = i41;
                            i39 = i40;
                        }
                        continue;
                    }
                    i35++;
                    j = j2;
                }
                mu4 mu4Var = iw4Var.Q;
                if (mu4Var == null) {
                    mu4Var = new mu4(iw4Var);
                    iw4Var.Q = mu4Var;
                }
                nv4 t = nv4.t(mu4Var);
                for (int i42 = 0; i42 < t.size(); i42++) {
                    int intValue = ((Integer) t.get(i42)).intValue();
                    int i43 = iArr11[intValue] + 1;
                    iArr11[intValue] = i43;
                    jArr3[intValue] = jArr[intValue][i43];
                    lx5.c(arrayList, jArr3);
                }
                for (int i44 = 0; i44 < 2; i44++) {
                    if (arrayList.get(i44) != null) {
                        long j9 = jArr3[i44];
                        jArr3[i44] = j9 + j9;
                    }
                }
                lx5.c(arrayList, jArr3);
                kv4 kv4Var2 = new kv4();
                for (int i45 = 0; i45 < arrayList.size(); i45++) {
                    kv4 kv4Var3 = (kv4) arrayList.get(i45);
                    if (kv4Var3 == null) {
                        s = nw4.T;
                    } else {
                        s = kv4Var3.s();
                    }
                    kv4Var2.p(s);
                }
                nw4 s2 = kv4Var2.s();
                int i46 = 2;
                qy5[] qy5VarArr = new qy5[2];
                int i47 = 0;
                while (i47 < i46) {
                    py5 py5Var5 = py5VarArr[i47];
                    if (py5Var5 != null && (length = (iArr = py5Var5.b).length) != 0) {
                        if (length == 1) {
                            lx5Var = new ry5(py5Var5.a, iArr[0]);
                        } else {
                            lx5Var = new lx5(py5Var5.a, iArr, (nv4) s2.get(i47), (dx3) a53Var.P);
                        }
                        qy5VarArr[i47] = lx5Var;
                    }
                    i47++;
                    i46 = 2;
                }
                zn5[] zn5VarArr = new zn5[i46];
                int i48 = 0;
                while (i48 < i46) {
                    int i49 = sy5Var.a[i48];
                    if (!dy5Var.r.get(i48) && !dy5Var.j.contains(Integer.valueOf(i49)) && (sy5Var.a[i48] == -2 || qy5VarArr[i48] != null)) {
                        zn5Var = zn5.a;
                    } else {
                        zn5Var = null;
                    }
                    zn5VarArr[i48] = zn5Var;
                    i48++;
                    i46 = 2;
                }
                Pair create = Pair.create(zn5VarArr, qy5VarArr);
                uy5[] uy5VarArr = (uy5[]) create.second;
                List[] listArr = new List[uy5VarArr.length];
                for (int i50 = 0; i50 < uy5VarArr.length; i50++) {
                    uy5 uy5Var = uy5VarArr[i50];
                    if (uy5Var != null) {
                        nw4Var = nv4.v(uy5Var);
                    } else {
                        nw4Var = nw4.T;
                    }
                    listArr[i50] = nw4Var;
                }
                kv4 kv4Var4 = new kv4();
                int i51 = 0;
                for (int i52 = 2; i51 < i52; i52 = 2) {
                    hx5 hx5Var7 = sy5Var.b[i51];
                    List list = listArr[i51];
                    int i53 = 0;
                    while (i53 < hx5Var7.a) {
                        qe3 a4 = hx5Var7.a(i53);
                        sy5Var.b[i51].a(i53);
                        int[] iArr12 = new int[1];
                        int i54 = 0;
                        for (int i55 = 0; i55 <= 0; i55++) {
                            if ((sy5Var.d[i51][i53][i55] & 7) == 4) {
                                iArr12[i54] = i55;
                                i54++;
                            }
                        }
                        int[] copyOf = Arrays.copyOf(iArr12, i54);
                        int i56 = 0;
                        boolean z6 = false;
                        int i57 = 0;
                        String str2 = null;
                        int i58 = 16;
                        while (i56 < copyOf.length) {
                            List[] listArr2 = listArr;
                            String str3 = sy5Var.b[i51].a(i53).c[copyOf[i56]].k;
                            int i59 = i57 + 1;
                            if (i57 == 0) {
                                str2 = str3;
                            } else {
                                z6 = (!zn4.b(str2, str3)) | z6;
                            }
                            i58 = Math.min(i58, sy5Var.d[i51][i53][i56] & 24);
                            i56++;
                            i57 = i59;
                            listArr = listArr2;
                        }
                        List[] listArr3 = listArr;
                        if (z6) {
                            Math.min(i58, sy5Var.c[i51]);
                        }
                        int[] iArr13 = new int[1];
                        boolean[] zArr = new boolean[1];
                        for (int i60 = 0; i60 <= 0; i60++) {
                            iArr13[i60] = sy5Var.d[i51][i53][i60] & 7;
                            int i61 = 0;
                            while (true) {
                                if (i61 < list.size()) {
                                    uy5 uy5Var2 = (uy5) list.get(i61);
                                    if (uy5Var2.b().equals(a4) && uy5Var2.B(i60) != -1) {
                                        z2 = true;
                                        break;
                                    }
                                    i61++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            zArr[i60] = z2;
                        }
                        kv4Var4.p(new dk3(a4, iArr13, zArr));
                        i53++;
                        listArr = listArr3;
                    }
                    i51++;
                }
                hx5 hx5Var8 = sy5Var.e;
                for (int i62 = 0; i62 < hx5Var8.a; i62++) {
                    qe3 a5 = hx5Var8.a(i62);
                    int[] iArr14 = new int[1];
                    Arrays.fill(iArr14, 0);
                    kv4Var4.p(new dk3(a5, iArr14, new boolean[1]));
                }
                return new xy5((zn5[]) create.first, (qy5[]) create.second, new vk3(kv4Var4.s()), sy5Var);
            }
        }
    }

    @Override // defpackage.wy5
    public final void e(Object obj) {
        sy5 sy5Var = (sy5) obj;
    }
}