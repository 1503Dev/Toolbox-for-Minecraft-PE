package defpackage;

import defpackage.k60;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: i9  reason: default package */
public abstract class i9 implements lg<Object>, Serializable {
    public final lg<Object> P;

    public i9(lg<Object> lgVar) {
        this.P = lgVar;
    }

    @Override // defpackage.lg
    public final void a(Object obj) {
        i9 i9Var = this;
        while (true) {
            lg<Object> lgVar = i9Var.P;
            hy.c(lgVar);
            try {
                obj = i9Var.b(obj);
                if (obj == vg.COROUTINE_SUSPENDED) {
                    return;
                }
            } catch (Throwable th) {
                obj = eg4.a(th);
            }
            i9Var.c();
            if (!(lgVar instanceof i9)) {
                lgVar.a(obj);
                return;
            }
            i9Var = (i9) lgVar;
        }
    }

    public abstract Object b(Object obj);

    public void c() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.StackTraceElement] */
    public final String toString() {
        int i;
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        Object obj;
        int i2;
        StringBuilder b = e5.b("Continuation at ");
        uj ujVar = (uj) getClass().getAnnotation(uj.class);
        String str2 = null;
        if (ujVar != null) {
            int v = ujVar.v();
            if (v <= 1) {
                int i3 = -1;
                try {
                    Field declaredField = getClass().getDeclaredField("label");
                    hy.d("field", declaredField);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(this);
                    if (!(obj2 instanceof Integer)) {
                        obj2 = null;
                    }
                    Integer num = (Integer) obj2;
                    if (num != null) {
                        i2 = num.intValue();
                    } else {
                        i2 = 0;
                    }
                    i = i2 - 1;
                } catch (Exception unused) {
                    i = -1;
                }
                if (i >= 0) {
                    i3 = ujVar.l()[i];
                }
                k60.a aVar = k60.b;
                if (aVar == null) {
                    try {
                        k60.a aVar2 = new k60.a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                        k60.b = aVar2;
                        aVar = aVar2;
                    } catch (Exception unused2) {
                        aVar = k60.a;
                        k60.b = aVar;
                    }
                }
                if (aVar != k60.a && (method = aVar.a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aVar.b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
                    Method method3 = aVar.c;
                    if (method3 != null) {
                        obj = method3.invoke(invoke2, new Object[0]);
                    } else {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        str2 = obj;
                    }
                    str2 = str2;
                }
                if (str2 == null) {
                    str = ujVar.c();
                } else {
                    str = str2 + '/' + ujVar.c();
                }
                str2 = new StackTraceElement(str, ujVar.m(), ujVar.f(), i3);
            } else {
                throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + v + ". Please update the Kotlin standard library.").toString());
            }
        }
        if (str2 == null) {
            str2 = getClass().getName();
        }
        b.append((Object) str2);
        return b.toString();
    }
}