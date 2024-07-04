package defpackage;

import defpackage.zp;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: kk0  reason: default package */
public final class kk0 implements m11 {
    public final vf P;
    public final aq Q;
    public final kp R;
    public final pz S;
    public final gk0 T = gk0.a;

    /* renamed from: kk0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a<T> extends l11<T> {
        public final ta0<T> a;
        public final Map<String, b> b;

        public a(ta0 ta0Var, LinkedHashMap linkedHashMap) {
            this.a = ta0Var;
            this.b = linkedHashMap;
        }

        @Override // defpackage.l11
        public final T a(c00 c00Var) {
            if (c00Var.U() == 9) {
                c00Var.Q();
                return null;
            }
            T d = this.a.d();
            try {
                c00Var.d();
                while (c00Var.H()) {
                    b bVar = this.b.get(c00Var.O());
                    if (bVar != null && bVar.c) {
                        bVar.a(c00Var, d);
                    }
                    c00Var.Z();
                }
                c00Var.E();
                return d;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (IllegalStateException e2) {
                throw new e00(e2);
            }
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, T t) {
            if (t == null) {
                i00Var.H();
                return;
            }
            i00Var.g();
            try {
                for (b bVar : this.b.values()) {
                    if (bVar.c(t)) {
                        i00Var.F(bVar.a);
                        bVar.b(i00Var, t);
                    }
                }
                i00Var.E();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: kk0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class b {
        public final String a;
        public final boolean b;
        public final boolean c;

        public b(String str, boolean z, boolean z2) {
            this.a = str;
            this.b = z;
            this.c = z2;
        }

        public abstract void a(c00 c00Var, Object obj);

        public abstract void b(i00 i00Var, Object obj);

        public abstract boolean c(Object obj);
    }

    public kk0(vf vfVar, zp.a aVar, kp kpVar, pz pzVar) {
        this.P = vfVar;
        this.Q = aVar;
        this.R = kpVar;
        this.S = pzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0185 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    @Override // defpackage.m11
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        a aVar;
        int i;
        int i2;
        ArrayList arrayList;
        int size;
        int i3;
        b bVar;
        Field[] fieldArr;
        Class<? super T> cls;
        u11<T> u11Var2;
        Class<? super T> cls2;
        ta0<T> ta0Var;
        a aVar2;
        Type type;
        LinkedHashMap linkedHashMap;
        boolean z;
        Field field;
        l11<T> l11Var;
        boolean z2;
        ArrayList arrayList2;
        kk0 kk0Var = this;
        xt xtVar2 = xtVar;
        Class<? super T> cls3 = Object.class;
        Class<? super T> cls4 = u11Var.a;
        if (!cls3.isAssignableFrom(cls4)) {
            return null;
        }
        ta0<T> a2 = kk0Var.P.a(u11Var);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (!cls4.isInterface()) {
            Type type2 = u11Var.b;
            u11<T> u11Var3 = u11Var;
            Class<? super T> cls5 = cls4;
            while (cls5 != cls3) {
                Field[] declaredFields = cls5.getDeclaredFields();
                int length = declaredFields.length;
                boolean z3 = false;
                int i4 = 0;
                while (i4 < length) {
                    Field field2 = declaredFields[i4];
                    boolean b2 = kk0Var.b(field2, true);
                    boolean b3 = kk0Var.b(field2, z3);
                    if (!b2 && !b3) {
                        i = i4;
                        i2 = length;
                        fieldArr = declaredFields;
                        cls = cls5;
                        u11Var2 = u11Var3;
                        cls2 = cls3;
                        ta0Var = a2;
                        aVar2 = aVar;
                        type = type2;
                        linkedHashMap = linkedHashMap2;
                    } else {
                        kk0Var.T.a(field2);
                        Type g = defpackage.a.g(u11Var3.b, cls5, field2.getGenericType(), new HashSet());
                        wq0 wq0Var = (wq0) field2.getAnnotation(wq0.class);
                        if (wq0Var == null) {
                            i = i4;
                            arrayList2 = Collections.singletonList(kk0Var.Q.b(field2));
                        } else {
                            String value = wq0Var.value();
                            String[] alternate = wq0Var.alternate();
                            i = i4;
                            if (alternate.length == 0) {
                                arrayList2 = Collections.singletonList(value);
                            } else {
                                i2 = length;
                                ArrayList arrayList3 = new ArrayList(alternate.length + 1);
                                arrayList3.add(value);
                                int i5 = 0;
                                for (int length2 = alternate.length; i5 < length2; length2 = length2) {
                                    arrayList3.add(alternate[i5]);
                                    i5++;
                                }
                                arrayList = arrayList3;
                                size = arrayList.size();
                                b bVar2 = null;
                                i3 = 0;
                                while (i3 < size) {
                                    Class<? super T> cls6 = cls3;
                                    String str = (String) arrayList.get(i3);
                                    Type type3 = type2;
                                    if (i3 != 0) {
                                        b2 = false;
                                    }
                                    u11<T> u11Var4 = new u11<>(g);
                                    b bVar3 = bVar2;
                                    Class<? super T> cls7 = u11Var4.a;
                                    int i6 = i3;
                                    if ((cls7 instanceof Class) && cls7.isPrimitive()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    oz ozVar = (oz) field2.getAnnotation(oz.class);
                                    if (ozVar != null) {
                                        pz pzVar = kk0Var.S;
                                        field = field2;
                                        vf vfVar = kk0Var.P;
                                        pzVar.getClass();
                                        l11Var = pz.b(vfVar, xtVar2, u11Var4, ozVar);
                                    } else {
                                        field = field2;
                                        l11Var = null;
                                    }
                                    if (l11Var != null) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (l11Var == null) {
                                        l11Var = xtVar2.f(u11Var4);
                                    }
                                    Field field3 = field;
                                    int i7 = size;
                                    ArrayList arrayList4 = arrayList;
                                    Field[] fieldArr2 = declaredFields;
                                    boolean z4 = z2;
                                    Class<? super T> cls8 = cls5;
                                    Type type4 = g;
                                    u11<T> u11Var5 = u11Var3;
                                    ta0<T> ta0Var2 = a2;
                                    a aVar3 = aVar;
                                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                                    bVar2 = (b) linkedHashMap3.put(str, new jk0(str, b2, b3, field3, z4, l11Var, xtVar, u11Var4, z));
                                    if (bVar3 != null) {
                                        bVar2 = bVar3;
                                    }
                                    i3 = i6 + 1;
                                    kk0Var = this;
                                    xtVar2 = xtVar;
                                    cls5 = cls8;
                                    u11Var3 = u11Var5;
                                    type2 = type3;
                                    linkedHashMap2 = linkedHashMap3;
                                    aVar = aVar3;
                                    cls3 = cls6;
                                    field2 = field3;
                                    size = i7;
                                    g = type4;
                                    a2 = ta0Var2;
                                    arrayList = arrayList4;
                                    declaredFields = fieldArr2;
                                }
                                bVar = bVar2;
                                fieldArr = declaredFields;
                                cls = cls5;
                                u11Var2 = u11Var3;
                                cls2 = cls3;
                                ta0Var = a2;
                                aVar2 = aVar;
                                type = type2;
                                linkedHashMap = linkedHashMap2;
                                if (bVar == null) {
                                    throw new IllegalArgumentException(type + " declares multiple JSON fields named " + bVar.a);
                                }
                            }
                        }
                        i2 = length;
                        arrayList = arrayList2;
                        size = arrayList.size();
                        b bVar22 = null;
                        i3 = 0;
                        while (i3 < size) {
                        }
                        bVar = bVar22;
                        fieldArr = declaredFields;
                        cls = cls5;
                        u11Var2 = u11Var3;
                        cls2 = cls3;
                        ta0Var = a2;
                        aVar2 = aVar;
                        type = type2;
                        linkedHashMap = linkedHashMap2;
                        if (bVar == null) {
                        }
                    }
                    i4 = i + 1;
                    kk0Var = this;
                    xtVar2 = xtVar;
                    cls5 = cls;
                    u11Var3 = u11Var2;
                    type2 = type;
                    linkedHashMap2 = linkedHashMap;
                    length = i2;
                    aVar = aVar2;
                    cls3 = cls2;
                    a2 = ta0Var;
                    declaredFields = fieldArr;
                    z3 = false;
                }
                Class<? super T> cls9 = cls5;
                u11Var3 = new u11<>(defpackage.a.g(u11Var3.b, cls9, cls9.getGenericSuperclass(), new HashSet()));
                cls5 = u11Var3.a;
                kk0Var = this;
                xtVar2 = xtVar;
                type2 = type2;
                linkedHashMap2 = linkedHashMap2;
                aVar = aVar;
                cls3 = cls3;
                a2 = a2;
            }
        }
        return new a(a2, linkedHashMap2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
        if (r1 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b3 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Field field, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        List<lp> list;
        boolean z5;
        boolean z6;
        kp kpVar = this.R;
        Class<?> type = field.getType();
        if (!kpVar.b(type) && !kpVar.c(type, z)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return false;
        }
        if ((kpVar.Q & field.getModifiers()) == 0 && ((kpVar.P == -1.0d || kpVar.d((bt0) field.getAnnotation(bt0.class), (u21) field.getAnnotation(u21.class))) && !field.isSynthetic())) {
            if (!kpVar.R) {
                Class<?> type2 = field.getType();
                if (type2.isMemberClass()) {
                    if ((type2.getModifiers() & 8) != 0) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    if (!z6) {
                        z5 = true;
                    }
                }
                z5 = false;
            }
            Class<?> type3 = field.getType();
            if (!Enum.class.isAssignableFrom(type3) && (type3.isAnonymousClass() || type3.isLocalClass())) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                if (z) {
                    list = kpVar.S;
                } else {
                    list = kpVar.T;
                }
                if (!list.isEmpty()) {
                    for (lp lpVar : list) {
                        if (lpVar.b()) {
                        }
                    }
                }
                z3 = false;
                if (!z3) {
                    return false;
                }
                return true;
            }
        }
        z3 = true;
        if (!z3) {
        }
    }
}