package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

/* renamed from: vf  reason: default package */
public final class vf {
    public final Map<Type, ux<?>> a;
    public final gk0 b = gk0.a;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: vf$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a<T> implements ta0<T> {
        public final /* synthetic */ ux P;

        public a(ux uxVar, Type type) {
            this.P = uxVar;
        }

        @Override // defpackage.ta0
        public final T d() {
            return (T) this.P.a();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: vf$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b<T> implements ta0<T> {
        public final /* synthetic */ ux P;

        public b(ux uxVar, Type type) {
            this.P = uxVar;
        }

        @Override // defpackage.ta0
        public final T d() {
            return (T) this.P.a();
        }
    }

    public vf(Map<Type, ux<?>> map) {
        this.a = map;
    }

    public final <T> ta0<T> a(u11<T> u11Var) {
        wf wfVar;
        Type type = u11Var.b;
        Class<? super T> cls = u11Var.a;
        ux<?> uxVar = this.a.get(type);
        if (uxVar != null) {
            return new a(uxVar, type);
        }
        ux<?> uxVar2 = this.a.get(cls);
        if (uxVar2 != null) {
            return new b(uxVar2, type);
        }
        ta0<T> ta0Var = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.b.a(declaredConstructor);
            }
            wfVar = new wf(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            wfVar = null;
        }
        if (wfVar != null) {
            return wfVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                ta0Var = new s45();
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                ta0Var = new xf(type);
            } else if (Set.class.isAssignableFrom(cls)) {
                ta0Var = new lp5();
            } else if (Queue.class.isAssignableFrom(cls)) {
                ta0Var = new yf();
            } else {
                ta0Var = new zf();
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                ta0Var = new gv4();
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                ta0Var = new mu2();
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                ta0Var = new nu2();
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    type2.getClass();
                    Type a2 = defpackage.a.a(type2);
                    Class<?> e = defpackage.a.e(a2);
                    a2.hashCode();
                    if (!String.class.isAssignableFrom(e)) {
                        ta0Var = new tv2();
                    }
                }
                ta0Var = new uf0();
            }
        }
        if (ta0Var != null) {
            return ta0Var;
        }
        return new uf(cls, type);
    }

    public final String toString() {
        return this.a.toString();
    }
}