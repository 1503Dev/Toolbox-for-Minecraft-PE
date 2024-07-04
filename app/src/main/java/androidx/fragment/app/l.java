package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.i;
import java.util.ArrayList;
import java.util.Collection;

public final class l {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};
    public static final wr b;
    public static final as c;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public c a;
        public boolean b;
        public androidx.fragment.app.a c;
        public c d;
        public boolean e;
        public androidx.fragment.app.a f;
    }

    static {
        wr wrVar;
        as asVar = null;
        if (Build.VERSION.SDK_INT >= 21) {
            wrVar = new wr();
        } else {
            wrVar = null;
        }
        b = wrVar;
        try {
            asVar = (as) cs.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
        }
        c = asVar;
    }

    public static void a(ArrayList<View> arrayList, e7<String, View> e7Var, Collection<String> collection) {
        int i = e7Var.R;
        while (true) {
            i--;
            if (i >= 0) {
                View j = e7Var.j(i);
                if (collection.contains(a41.g(j))) {
                    arrayList.add(j);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0038, code lost:
        if (r6.Y != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0074, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0086, code lost:
        if (r6.m0 == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0088, code lost:
        r12 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00eb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(androidx.fragment.app.a aVar, i.a aVar2, SparseArray<a> sparseArray, boolean z, boolean z2) {
        int i;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        a aVar3;
        f fVar;
        c cVar = aVar2.b;
        if (cVar == null || (i = cVar.k0) == 0) {
            return;
        }
        if (z) {
            i2 = a[aVar2.a];
        } else {
            i2 = aVar2.a;
        }
        boolean z7 = false;
        if (i2 != 1) {
            if (i2 != 3) {
                if (i2 != 4) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                z3 = false;
                                z4 = false;
                                z7 = z3;
                                z5 = false;
                                z6 = false;
                                a aVar4 = sparseArray.get(i);
                                if (z7) {
                                    if (aVar4 == null) {
                                        a aVar5 = new a();
                                        sparseArray.put(i, aVar5);
                                        aVar4 = aVar5;
                                    }
                                    aVar4.a = cVar;
                                    aVar4.b = z;
                                    aVar4.c = aVar;
                                }
                                aVar3 = aVar4;
                                if (!z2 && z4) {
                                    if (aVar3 != null && aVar3.d == cVar) {
                                        aVar3.d = null;
                                    }
                                    fVar = aVar.q;
                                    if (cVar.P < 1 && fVar.d0 >= 1 && !aVar.p) {
                                        fVar.R(cVar);
                                        fVar.V(cVar, 1, 0, 0, false);
                                    }
                                }
                                if (z6 && (aVar3 == null || aVar3.d == null)) {
                                    if (aVar3 == null) {
                                        a aVar6 = new a();
                                        sparseArray.put(i, aVar6);
                                        aVar3 = aVar6;
                                    }
                                    aVar3.d = cVar;
                                    aVar3.e = z;
                                    aVar3.f = aVar;
                                }
                                if (!z2 && z5 && aVar3 != null && aVar3.a == cVar) {
                                    aVar3.a = null;
                                    return;
                                }
                                return;
                            }
                        }
                    } else if (z2) {
                        if (cVar.y0) {
                            if (!cVar.m0) {
                            }
                        }
                        z3 = false;
                        z4 = true;
                        z7 = z3;
                        z5 = false;
                        z6 = false;
                        a aVar42 = sparseArray.get(i);
                        if (z7) {
                        }
                        aVar3 = aVar42;
                        if (!z2) {
                            if (aVar3 != null) {
                                aVar3.d = null;
                            }
                            fVar = aVar.q;
                            if (cVar.P < 1) {
                                fVar.R(cVar);
                                fVar.V(cVar, 1, 0, 0, false);
                            }
                        }
                        if (z6) {
                            if (aVar3 == null) {
                            }
                            aVar3.d = cVar;
                            aVar3.e = z;
                            aVar3.f = aVar;
                        }
                        if (!z2) {
                            return;
                        }
                        return;
                    } else {
                        z3 = cVar.m0;
                        z4 = true;
                        z7 = z3;
                        z5 = false;
                        z6 = false;
                        a aVar422 = sparseArray.get(i);
                        if (z7) {
                        }
                        aVar3 = aVar422;
                        if (!z2) {
                        }
                        if (z6) {
                        }
                        if (!z2) {
                        }
                    }
                } else {
                    boolean z8 = !z2 ? false : false;
                    z6 = z8;
                    z5 = true;
                    z4 = false;
                    a aVar4222 = sparseArray.get(i);
                    if (z7) {
                    }
                    aVar3 = aVar4222;
                    if (!z2) {
                    }
                    if (z6) {
                    }
                    if (!z2) {
                    }
                }
            }
            boolean z9 = cVar.Y;
            if (!z2) {
            }
            z6 = z8;
            z5 = true;
            z4 = false;
            a aVar42222 = sparseArray.get(i);
            if (z7) {
            }
            aVar3 = aVar42222;
            if (!z2) {
            }
            if (z6) {
            }
            if (!z2) {
            }
        }
        if (z2) {
            z3 = cVar.x0;
            z4 = true;
            z7 = z3;
            z5 = false;
            z6 = false;
            a aVar422222 = sparseArray.get(i);
            if (z7) {
            }
            aVar3 = aVar422222;
            if (!z2) {
            }
            if (z6) {
            }
            if (!z2) {
            }
        } else {
            if (!cVar.Y) {
            }
            z3 = false;
            z4 = true;
            z7 = z3;
            z5 = false;
            z6 = false;
            a aVar4222222 = sparseArray.get(i);
            if (z7) {
            }
            aVar3 = aVar4222222;
            if (!z2) {
            }
            if (z6) {
            }
            if (!z2) {
            }
        }
    }

    public static e7<String, View> c(as asVar, e7<String, String> e7Var, Object obj, a aVar) {
        ArrayList<String> arrayList;
        View view = aVar.a.s0;
        if (!e7Var.isEmpty() && obj != null && view != null) {
            e7<String, View> e7Var2 = new e7<>();
            asVar.getClass();
            as.h(view, e7Var2);
            androidx.fragment.app.a aVar2 = aVar.c;
            if (aVar.b) {
                arrayList = aVar2.n;
            } else {
                arrayList = aVar2.o;
            }
            if (arrayList != null) {
                w30.k(e7Var2, arrayList);
                w30.k(e7Var2, e7Var.values());
            }
            int i = e7Var.R;
            while (true) {
                i--;
                if (i >= 0) {
                    if (!e7Var2.containsKey(e7Var.j(i))) {
                        e7Var.i(i);
                    }
                } else {
                    return e7Var2;
                }
            }
        } else {
            e7Var.clear();
            return null;
        }
    }

    public static e7 d(e7 e7Var, Object obj, a aVar) {
        ArrayList<String> arrayList;
        if (!e7Var.isEmpty() && obj != null) {
            c cVar = aVar.d;
            e7 e7Var2 = new e7();
            as.h(cVar.G(), e7Var2);
            androidx.fragment.app.a aVar2 = aVar.f;
            if (aVar.e) {
                arrayList = aVar2.o;
            } else {
                arrayList = aVar2.n;
            }
            w30.k(e7Var2, arrayList);
            w30.k(e7Var, e7Var2.keySet());
            return e7Var2;
        }
        e7Var.clear();
        return null;
    }

    public static as e(c cVar, c cVar2) {
        boolean z;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (cVar != null) {
            c.a aVar = cVar.w0;
            if (aVar == null || (obj2 = aVar.g) == c.G0) {
                obj2 = null;
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            c.a aVar2 = cVar.w0;
            if (aVar2 == null || (obj3 = aVar2.i) == c.G0) {
                obj3 = null;
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (cVar2 != null) {
            c.a aVar3 = cVar2.w0;
            if (aVar3 == null || (obj = aVar3.h) == c.G0) {
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        wr wrVar = b;
        boolean z2 = true;
        if (wrVar != null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (!wrVar.e(arrayList.get(i))) {
                        z = false;
                        break;
                    }
                    i++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                return wrVar;
            }
        }
        as asVar = c;
        if (asVar != null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                } else if (!asVar.e(arrayList.get(i2))) {
                    z2 = false;
                    break;
                } else {
                    i2++;
                }
            }
            if (z2) {
                return asVar;
            }
        }
        if (wrVar == null && asVar == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList<View> f(as asVar, Object obj, c cVar, ArrayList<View> arrayList, View view) {
        if (obj != null) {
            ArrayList<View> arrayList2 = new ArrayList<>();
            View view2 = cVar.s0;
            if (view2 != null) {
                asVar.getClass();
                as.f(arrayList2, view2);
            }
            if (arrayList != null) {
                arrayList2.removeAll(arrayList);
            }
            if (!arrayList2.isEmpty()) {
                arrayList2.add(view);
                asVar.b(obj, arrayList2);
                return arrayList2;
            }
            return arrayList2;
        }
        return null;
    }

    public static View g(e7<String, View> e7Var, a aVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        androidx.fragment.app.a aVar2 = aVar.c;
        if (obj == null || e7Var == null || (arrayList = aVar2.n) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            arrayList2 = aVar2.n;
        } else {
            arrayList2 = aVar2.o;
        }
        return e7Var.getOrDefault(arrayList2.get(0), null);
    }

    public static void h(as asVar, Object obj, Object obj2, e7<String, View> e7Var, boolean z, androidx.fragment.app.a aVar) {
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2 = aVar.n;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            if (z) {
                arrayList = aVar.o;
            } else {
                arrayList = aVar.n;
            }
            View orDefault = e7Var.getOrDefault(arrayList.get(0), null);
            asVar.p(orDefault, obj);
            if (obj2 != null) {
                asVar.p(orDefault, obj2);
            }
        }
    }

    public static void i(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0143, code lost:
        if (r10 == androidx.fragment.app.c.G0) goto L156;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0493 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void j(f fVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z) {
        SparseArray sparseArray;
        int i3;
        int i4;
        ViewGroup viewGroup;
        c cVar;
        c cVar2;
        as e;
        Object g;
        c.a aVar;
        Object g2;
        c.a aVar2;
        c cVar3;
        ArrayList<View> arrayList3;
        ArrayList<View> arrayList4;
        Object obj;
        e7 e7Var;
        int i5;
        Object obj2;
        Object obj3;
        ArrayList<View> f;
        Object k;
        Object t;
        c.a aVar3;
        c cVar4;
        ArrayList<View> arrayList5;
        boolean z2;
        c cVar5;
        Rect rect;
        ViewGroup viewGroup2;
        c cVar6;
        c cVar7;
        as e2;
        Object obj4;
        Object g3;
        c.a aVar4;
        Object g4;
        c.a aVar5;
        ArrayList<View> arrayList6;
        c cVar8;
        e7 e7Var2;
        Object obj5;
        Object k2;
        e7 e7Var3;
        Object t2;
        c.a aVar6;
        View view;
        Rect rect2;
        f fVar2 = fVar;
        ArrayList<androidx.fragment.app.a> arrayList7 = arrayList;
        ArrayList<Boolean> arrayList8 = arrayList2;
        int i6 = i2;
        boolean z3 = z;
        if (fVar2.d0 < 1) {
            return;
        }
        SparseArray sparseArray2 = new SparseArray();
        for (int i7 = i; i7 < i6; i7++) {
            androidx.fragment.app.a aVar7 = arrayList7.get(i7);
            if (arrayList8.get(i7).booleanValue()) {
                if (aVar7.q.f0.g()) {
                    for (int size = aVar7.a.size() - 1; size >= 0; size--) {
                        b(aVar7, aVar7.a.get(size), sparseArray2, true, z3);
                    }
                }
            } else {
                int size2 = aVar7.a.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    b(aVar7, aVar7.a.get(i8), sparseArray2, false, z3);
                }
            }
        }
        if (sparseArray2.size() != 0) {
            View view2 = new View(fVar2.e0.Q);
            int size3 = sparseArray2.size();
            int i9 = 0;
            while (i9 < size3) {
                int keyAt = sparseArray2.keyAt(i9);
                e7 e7Var4 = new e7();
                int i10 = i6 - 1;
                while (i10 >= i) {
                    androidx.fragment.app.a aVar8 = arrayList7.get(i10);
                    if (aVar8.h(keyAt)) {
                        boolean booleanValue = arrayList8.get(i10).booleanValue();
                        ArrayList<String> arrayList9 = aVar8.n;
                        if (arrayList9 != null) {
                            int size4 = arrayList9.size();
                            ArrayList<String> arrayList10 = aVar8.n;
                            ArrayList<String> arrayList11 = aVar8.o;
                            if (!booleanValue) {
                                arrayList11 = arrayList10;
                                arrayList10 = arrayList11;
                            }
                            int i11 = 0;
                            while (i11 < size4) {
                                String str = arrayList11.get(i11);
                                String str2 = arrayList10.get(i11);
                                int i12 = size4;
                                String str3 = (String) e7Var4.remove(str2);
                                if (str3 != null) {
                                    e7Var4.put(str, str3);
                                } else {
                                    e7Var4.put(str, str2);
                                }
                                i11++;
                                size4 = i12;
                            }
                        }
                    }
                    i10--;
                    arrayList7 = arrayList;
                    arrayList8 = arrayList2;
                }
                a aVar9 = (a) sparseArray2.valueAt(i9);
                if (z3) {
                    if (fVar2.f0.g()) {
                        viewGroup2 = (ViewGroup) fVar2.f0.f(keyAt);
                    } else {
                        viewGroup2 = null;
                    }
                    if (viewGroup2 == null || (e2 = e((cVar7 = aVar9.d), (cVar6 = aVar9.a))) == null) {
                        sparseArray = sparseArray2;
                        i3 = i9;
                        i4 = size3;
                    } else {
                        boolean z4 = aVar9.b;
                        boolean z5 = aVar9.e;
                        ArrayList<View> arrayList12 = new ArrayList<>();
                        ArrayList<View> arrayList13 = new ArrayList<>();
                        if (cVar6 == null) {
                            sparseArray = sparseArray2;
                            g3 = null;
                        } else {
                            if (z4 && (aVar4 = cVar6.w0) != null) {
                                obj4 = aVar4.h;
                                sparseArray = sparseArray2;
                            } else {
                                sparseArray = sparseArray2;
                            }
                            obj4 = null;
                            g3 = e2.g(obj4);
                        }
                        if (cVar7 == null) {
                            g4 = null;
                        } else {
                            g4 = e2.g((!z5 || (aVar5 = cVar7.w0) == null || (r10 = aVar5.g) == c.G0) ? null : null);
                        }
                        c cVar9 = aVar9.a;
                        c cVar10 = aVar9.d;
                        i3 = i9;
                        if (cVar9 != null) {
                            i4 = size3;
                            cVar9.G().setVisibility(0);
                        } else {
                            i4 = size3;
                        }
                        if (cVar9 != null && cVar10 != null) {
                            boolean z6 = aVar9.b;
                            if (e7Var4.isEmpty()) {
                                t2 = null;
                            } else {
                                t2 = e2.t(e2.g((!z6 || (aVar6 = cVar10.w0) == null || (r15 = aVar6.i) == c.G0) ? null : null));
                            }
                            e7 d = d(e7Var4, t2, aVar9);
                            cVar8 = cVar6;
                            e7<String, View> c2 = c(e2, e7Var4, t2, aVar9);
                            if (e7Var4.isEmpty()) {
                                if (d != null) {
                                    d.clear();
                                }
                                if (c2 != null) {
                                    c2.clear();
                                }
                                obj5 = null;
                            } else {
                                a(arrayList13, d, e7Var4.keySet());
                                a(arrayList12, c2, e7Var4.values());
                                obj5 = t2;
                            }
                            if (g3 == null && g4 == null && obj5 == null) {
                                arrayList6 = arrayList12;
                            } else {
                                if (obj5 != null) {
                                    arrayList12.add(view2);
                                    e2.r(obj5, view2, arrayList13);
                                    e7Var2 = e7Var4;
                                    arrayList6 = arrayList12;
                                    h(e2, obj5, g4, d, aVar9.e, aVar9.f);
                                    Rect rect3 = new Rect();
                                    View g5 = g(c2, aVar9, g3, z6);
                                    if (g5 != null) {
                                        e2.q(g3, rect3);
                                    }
                                    view = g5;
                                    rect2 = rect3;
                                } else {
                                    arrayList6 = arrayList12;
                                    e7Var2 = e7Var4;
                                    view = null;
                                    rect2 = null;
                                }
                                kc0.a(viewGroup2, new j(cVar9, cVar10, z6, c2, view, e2, rect2));
                                if (g3 == null || obj5 != null || g4 != null) {
                                    ArrayList<View> f2 = f(e2, g4, cVar7, arrayList13, view2);
                                    ArrayList<View> arrayList14 = arrayList6;
                                    ArrayList<View> f3 = f(e2, g3, cVar8, arrayList14, view2);
                                    i(f3, 4);
                                    k2 = e2.k(g4, g3, obj5);
                                    if (k2 != null) {
                                        if (cVar7 != null && g4 != null && cVar7.Y && cVar7.m0 && cVar7.y0) {
                                            cVar7.e().j = true;
                                            e2.n(g4, cVar7.s0, f2);
                                            kc0.a(cVar7.r0, new tr(f2));
                                        }
                                        ArrayList arrayList15 = new ArrayList();
                                        int size5 = arrayList14.size();
                                        for (int i13 = 0; i13 < size5; i13++) {
                                            View view3 = arrayList14.get(i13);
                                            arrayList15.add(a41.g(view3));
                                            a41.o(view3, null);
                                        }
                                        e2.o(k2, g3, f3, g4, f2, obj5, arrayList14);
                                        e2.c(viewGroup2, k2);
                                        int size6 = arrayList14.size();
                                        ArrayList arrayList16 = new ArrayList();
                                        int i14 = 0;
                                        while (i14 < size6) {
                                            View view4 = arrayList13.get(i14);
                                            String g6 = a41.g(view4);
                                            arrayList16.add(g6);
                                            if (g6 == null) {
                                                e7Var3 = e7Var2;
                                            } else {
                                                a41.o(view4, null);
                                                e7Var3 = e7Var2;
                                                String str4 = (String) e7Var3.getOrDefault(g6, null);
                                                int i15 = 0;
                                                while (true) {
                                                    if (i15 >= size6) {
                                                        break;
                                                    } else if (str4.equals(arrayList15.get(i15))) {
                                                        a41.o(arrayList14.get(i15), g6);
                                                        break;
                                                    } else {
                                                        i15++;
                                                    }
                                                }
                                            }
                                            i14++;
                                            e7Var2 = e7Var3;
                                        }
                                        kc0.a(viewGroup2, new xr(size6, arrayList14, arrayList15, arrayList13, arrayList16));
                                        i(f3, 0);
                                        e2.s(obj5, arrayList13, arrayList14);
                                    }
                                }
                            }
                        } else {
                            arrayList6 = arrayList12;
                            cVar8 = cVar6;
                        }
                        e7Var2 = e7Var4;
                        obj5 = null;
                        if (g3 == null) {
                        }
                        ArrayList<View> f22 = f(e2, g4, cVar7, arrayList13, view2);
                        ArrayList<View> arrayList142 = arrayList6;
                        ArrayList<View> f32 = f(e2, g3, cVar8, arrayList142, view2);
                        i(f32, 4);
                        k2 = e2.k(g4, g3, obj5);
                        if (k2 != null) {
                        }
                    }
                } else {
                    sparseArray = sparseArray2;
                    i3 = i9;
                    i4 = size3;
                    if (fVar2.f0.g()) {
                        viewGroup = (ViewGroup) fVar2.f0.f(keyAt);
                    } else {
                        viewGroup = null;
                    }
                    if (viewGroup != null && (e = e((cVar2 = aVar9.d), (cVar = aVar9.a))) != null) {
                        boolean z7 = aVar9.b;
                        boolean z8 = aVar9.e;
                        if (cVar == null) {
                            g = null;
                        } else {
                            g = e.g((!z7 || (aVar = cVar.w0) == null || (r15 = aVar.h) == c.G0) ? null : null);
                        }
                        if (cVar2 == null) {
                            g2 = null;
                        } else {
                            g2 = e.g((!z8 || (aVar2 = cVar2.w0) == null || (r15 = aVar2.g) == c.G0) ? null : null);
                        }
                        ArrayList<View> arrayList17 = new ArrayList<>();
                        ArrayList<View> arrayList18 = new ArrayList<>();
                        c cVar11 = aVar9.a;
                        c cVar12 = aVar9.d;
                        if (cVar11 != null && cVar12 != null) {
                            boolean z9 = aVar9.b;
                            if (e7Var4.isEmpty()) {
                                t = null;
                            } else {
                                t = e.t(e.g((!z9 || (aVar3 = cVar12.w0) == null || (r3 = aVar3.i) == c.G0) ? null : null));
                            }
                            e7 d2 = d(e7Var4, t, aVar9);
                            if (e7Var4.isEmpty()) {
                                t = null;
                            } else {
                                arrayList17.addAll(d2.values());
                            }
                            if (g != null || g2 != null || t != null) {
                                if (t != null) {
                                    rect = new Rect();
                                    e.r(t, view2, arrayList17);
                                    cVar4 = cVar11;
                                    arrayList5 = arrayList18;
                                    z2 = z9;
                                    cVar5 = cVar12;
                                    h(e, t, g2, d2, aVar9.e, aVar9.f);
                                    if (g != null) {
                                        e.q(g, rect);
                                    }
                                } else {
                                    cVar4 = cVar11;
                                    arrayList5 = arrayList18;
                                    z2 = z9;
                                    cVar5 = cVar12;
                                    rect = null;
                                }
                                arrayList3 = arrayList5;
                                cVar3 = cVar;
                                obj = g2;
                                Object obj6 = t;
                                Object obj7 = t;
                                e7Var = e7Var4;
                                arrayList4 = arrayList17;
                                obj2 = null;
                                i5 = i4;
                                kc0.a(viewGroup, new k(e, e7Var4, obj6, aVar9, arrayList3, view2, cVar4, cVar5, z2, arrayList4, g, rect));
                                obj3 = obj7;
                                if (g == null || obj3 != null || obj != null) {
                                    f = f(e, obj, cVar2, arrayList4, view2);
                                    if (f != null || f.isEmpty()) {
                                        obj = obj2;
                                    }
                                    e.a(view2, g);
                                    k = e.k(obj, g, obj3);
                                    if (k == null) {
                                        ArrayList<View> arrayList19 = new ArrayList<>();
                                        e.o(k, g, arrayList19, obj, f, obj3, arrayList3);
                                        kc0.a(viewGroup, new ur(g, e, view2, cVar3, arrayList3, arrayList19, f, obj));
                                        ArrayList<View> arrayList20 = arrayList3;
                                        kc0.a(viewGroup, new yr(arrayList20, e7Var));
                                        e.c(viewGroup, k);
                                        kc0.a(viewGroup, new zr(arrayList20, e7Var));
                                    }
                                }
                                i9 = i3 + 1;
                                arrayList7 = arrayList;
                                arrayList8 = arrayList2;
                                i6 = i2;
                                z3 = z;
                                size3 = i5;
                                sparseArray2 = sparseArray;
                                fVar2 = fVar;
                            }
                        }
                        cVar3 = cVar;
                        arrayList3 = arrayList18;
                        arrayList4 = arrayList17;
                        obj = g2;
                        e7Var = e7Var4;
                        i5 = i4;
                        obj2 = null;
                        obj3 = null;
                        if (g == null) {
                        }
                        f = f(e, obj, cVar2, arrayList4, view2);
                        if (f != null) {
                        }
                        obj = obj2;
                        e.a(view2, g);
                        k = e.k(obj, g, obj3);
                        if (k == null) {
                        }
                        i9 = i3 + 1;
                        arrayList7 = arrayList;
                        arrayList8 = arrayList2;
                        i6 = i2;
                        z3 = z;
                        size3 = i5;
                        sparseArray2 = sparseArray;
                        fVar2 = fVar;
                    }
                }
                i5 = i4;
                i9 = i3 + 1;
                arrayList7 = arrayList;
                arrayList8 = arrayList2;
                i6 = i2;
                z3 = z;
                size3 = i5;
                sparseArray2 = sparseArray;
                fVar2 = fVar;
            }
        }
    }
}