package defpackage;

import defpackage.ob;
import defpackage.pg;
import defpackage.pv;
import defpackage.qb;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: vl0  reason: default package */
public final class vl0 {
    public final ob.a b;
    public final pv c;
    public final List<pg.a> d;
    public final List<qb.a> e;
    @Nullable
    public final Executor f;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final boolean g = false;

    /* renamed from: vl0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements InvocationHandler {
        public final me0 a = me0.b;
        public final Object[] b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            boolean z;
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.a && le0.a(method)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                me0 me0Var = this.a;
                Class cls = this.c;
                me0Var.getClass();
                return me0.b(method, cls, obj, objArr);
            }
            xq0<?> c = vl0.this.c(method);
            if (objArr == null) {
                objArr = this.b;
            }
            return c.a(objArr);
        }
    }

    /* renamed from: vl0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public final me0 a;
        @Nullable
        public pv b;
        public final ArrayList c;
        public final ArrayList d;

        public b() {
            me0 me0Var = me0.b;
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.a = me0Var;
        }

        public final void a(String str) {
            pv.a aVar = new pv.a();
            aVar.b(null, str);
            pv a = aVar.a();
            List<String> list = a.f;
            if ("".equals(list.get(list.size() - 1))) {
                this.b = a;
                return;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + a);
        }

        public final vl0 b() {
            List singletonList;
            List emptyList;
            if (this.b != null) {
                nb0 nb0Var = new nb0();
                Executor a = this.a.a();
                ArrayList arrayList = new ArrayList(this.d);
                me0 me0Var = this.a;
                me0Var.getClass();
                ck ckVar = new ck(a);
                if (me0Var.a) {
                    singletonList = Arrays.asList(qe.a, ckVar);
                } else {
                    singletonList = Collections.singletonList(ckVar);
                }
                arrayList.addAll(singletonList);
                ArrayList arrayList2 = new ArrayList(this.c.size() + 1 + (this.a.a ? 1 : 0));
                arrayList2.add(new db());
                arrayList2.addAll(this.c);
                if (this.a.a) {
                    emptyList = Collections.singletonList(bd0.a);
                } else {
                    emptyList = Collections.emptyList();
                }
                arrayList2.addAll(emptyList);
                return new vl0(nb0Var, this.b, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), a);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    public vl0(nb0 nb0Var, pv pvVar, List list, List list2, @Nullable Executor executor) {
        this.b = nb0Var;
        this.c = pvVar;
        this.d = list;
        this.e = list2;
        this.f = executor;
    }

    public final qb<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf(null) + 1;
        int size = this.e.size();
        for (int i = indexOf; i < size; i++) {
            qb<?, ?> a2 = this.e.get(i).a(type, annotationArr);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> T b(Class<T> cls) {
        Method[] declaredMethods;
        boolean z;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.g) {
                me0 me0Var = me0.b;
                for (Method method : cls.getDeclaredMethods()) {
                    if (me0Var.a && le0.a(method)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z && !Modifier.isStatic(method.getModifiers())) {
                        c(method);
                    }
                }
            }
            return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public final xq0<?> c(Method method) {
        xq0<?> xq0Var;
        xq0<?> xq0Var2 = (xq0) this.a.get(method);
        if (xq0Var2 != null) {
            return xq0Var2;
        }
        synchronized (this.a) {
            xq0Var = (xq0) this.a.get(method);
            if (xq0Var == null) {
                xq0Var = xq0.b(this, method);
                this.a.put(method, xq0Var);
            }
        }
        return xq0Var;
    }

    public final <T> pg<T, vk0> d(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            pg<T, vk0> a2 = this.d.get(i).a(type);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final <T> pg<ql0, T> e(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf(null) + 1;
        int size = this.d.size();
        for (int i = indexOf; i < size; i++) {
            pg<ql0, T> pgVar = (pg<ql0, T>) this.d.get(i).b(type, annotationArr, this);
            if (pgVar != null) {
                return pgVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public final void f(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            this.d.get(i).getClass();
        }
    }
}