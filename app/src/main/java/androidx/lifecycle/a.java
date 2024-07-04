package androidx.lifecycle;

import androidx.lifecycle.c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
public final class a {
    public static a c = new a();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class C0006a {
        public final HashMap a = new HashMap();
        public final Map<b, c.b> b;

        public C0006a(HashMap hashMap) {
            this.b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                c.b bVar = (c.b) entry.getValue();
                List list = (List) this.a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.a.put(bVar, list);
                }
                list.add((b) entry.getKey());
            }
        }

        public static void a(List<b> list, b10 b10Var, c.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar2 = list.get(size);
                    bVar2.getClass();
                    try {
                        int i = bVar2.a;
                        if (i == 0) {
                            bVar2.b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar2.b.invoke(obj, b10Var);
                        } else if (i == 2) {
                            bVar2.b.invoke(obj, b10Var, bVar);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public final int a;
        public final Method b;

        public b(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a == bVar.a && this.b.getName().equals(bVar.b.getName());
            }
            return false;
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    public static void c(HashMap hashMap, b bVar, c.b bVar2, Class cls) {
        c.b bVar3 = (c.b) hashMap.get(bVar);
        if (bVar3 != null && bVar2 != bVar3) {
            Method method = bVar.b;
            StringBuilder b2 = e5.b("Method ");
            b2.append(method.getName());
            b2.append(" in ");
            b2.append(cls.getName());
            b2.append(" already declared with different @OnLifecycleEvent value: previous value ");
            b2.append(bVar3);
            b2.append(", new value ");
            b2.append(bVar2);
            throw new IllegalArgumentException(b2.toString());
        } else if (bVar3 == null) {
            hashMap.put(bVar, bVar2);
        }
    }

    public final C0006a a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, c.b> entry : b(cls2).b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            f fVar = (f) method.getAnnotation(f.class);
            if (fVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (parameterTypes[0].isAssignableFrom(b10.class)) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                c.b value = fVar.value();
                if (parameterTypes.length > 1) {
                    if (parameterTypes[1].isAssignableFrom(c.b.class)) {
                        if (value == c.b.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    c(hashMap, new b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C0006a c0006a = new C0006a(hashMap);
        this.a.put(cls, c0006a);
        this.b.put(cls, Boolean.valueOf(z));
        return c0006a;
    }

    public final C0006a b(Class<?> cls) {
        C0006a c0006a = (C0006a) this.a.get(cls);
        return c0006a != null ? c0006a : a(cls, null);
    }
}