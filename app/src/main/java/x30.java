package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/* renamed from: x30  reason: default package */
public final class x30 implements m11 {
    public final vf P;
    public final boolean Q = false;

    /* renamed from: x30$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public final class a<K, V> extends l11<Map<K, V>> {
        public final n11 a;
        public final n11 b;
        public final ta0<? extends Map<K, V>> c;

        public a(xt xtVar, Type type, l11<K> l11Var, Type type2, l11<V> l11Var2, ta0<? extends Map<K, V>> ta0Var) {
            this.a = new n11(xtVar, l11Var, type);
            this.b = new n11(xtVar, l11Var2, type2);
            this.c = ta0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.l11
        public final Object a(c00 c00Var) {
            int U = c00Var.U();
            if (U == 9) {
                c00Var.Q();
                return null;
            }
            Map map = (Map) ((Map<K, V>) this.c.d());
            if (U == 1) {
                c00Var.a();
                while (c00Var.H()) {
                    c00Var.a();
                    Object a = this.a.a(c00Var);
                    if (map.put(a, this.b.a(c00Var)) == null) {
                        c00Var.y();
                    } else {
                        throw new e00(ij.b("duplicate key: ", a));
                    }
                }
                c00Var.y();
            } else {
                c00Var.d();
                while (c00Var.H()) {
                    z61.a.D1(c00Var);
                    Object a2 = this.a.a(c00Var);
                    if (map.put(a2, this.b.a(c00Var)) != null) {
                        throw new e00(ij.b("duplicate key: ", a2));
                    }
                }
                c00Var.E();
            }
            return map;
        }

        @Override // defpackage.l11
        public final void b(i00 i00Var, Object obj) {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                i00Var.H();
                return;
            }
            if (!x30.this.Q) {
                i00Var.g();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    i00Var.F(String.valueOf(entry.getKey()));
                    this.b.b(i00Var, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z2 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    n11 n11Var = this.a;
                    K key = entry2.getKey();
                    n11Var.getClass();
                    try {
                        h00 h00Var = new h00();
                        n11Var.b(h00Var, key);
                        if (h00Var.a0.isEmpty()) {
                            wz wzVar = h00Var.c0;
                            arrayList.add(wzVar);
                            arrayList2.add(entry2.getValue());
                            wzVar.getClass();
                            if (!(wzVar instanceof qz) && !(wzVar instanceof zz)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            z2 |= z;
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + h00Var.a0);
                        }
                    } catch (IOException e) {
                        throw new xz(e);
                    }
                }
                if (z2) {
                    i00Var.d();
                    int size = arrayList.size();
                    while (i < size) {
                        i00Var.d();
                        o11.A.b(i00Var, (wz) arrayList.get(i));
                        this.b.b(i00Var, arrayList2.get(i));
                        i00Var.y();
                        i++;
                    }
                    i00Var.y();
                    return;
                }
                i00Var.g();
                int size2 = arrayList.size();
                while (i < size2) {
                    wz wzVar2 = (wz) arrayList.get(i);
                    wzVar2.getClass();
                    if (wzVar2 instanceof b00) {
                        b00 p = wzVar2.p();
                        Serializable serializable = p.P;
                        if (serializable instanceof Number) {
                            str = String.valueOf(p.r());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(p.g());
                        } else if (serializable instanceof String) {
                            str = p.q();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (wzVar2 instanceof yz) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    i00Var.F(str);
                    this.b.b(i00Var, arrayList2.get(i));
                    i++;
                }
            }
            i00Var.E();
        }
    }

    public x30(vf vfVar) {
        this.P = vfVar;
    }

    @Override // defpackage.m11
    public final <T> l11<T> a(xt xtVar, u11<T> u11Var) {
        Type[] actualTypeArguments;
        l11<T> l11Var;
        Type type = u11Var.b;
        if (!Map.class.isAssignableFrom(u11Var.a)) {
            return null;
        }
        Class<?> e = defpackage.a.e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type f = defpackage.a.f(type, e, Map.class);
            actualTypeArguments = f instanceof ParameterizedType ? ((ParameterizedType) f).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            l11Var = xtVar.f(new u11<>(type2));
        } else {
            l11Var = o11.c;
        }
        return new a(xtVar, actualTypeArguments[0], l11Var, actualTypeArguments[1], xtVar.f(new u11<>(actualTypeArguments[1])), this.P.a(u11Var));
    }
}