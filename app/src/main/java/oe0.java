package defpackage;

import java.lang.reflect.Method;

/* renamed from: oe0  reason: default package */
public final class oe0 {

    /* renamed from: oe0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public static final Method a;

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
            if (defpackage.hy.a(r6, java.lang.Throwable.class) != false) goto L11;
         */
        static {
            Method method;
            Method[] methods = Throwable.class.getMethods();
            hy.d("throwableMethods", methods);
            int length = methods.length;
            int i = 0;
            while (true) {
                method = null;
                if (i >= length) {
                    break;
                }
                Method method2 = methods[i];
                hy.d("it", method2);
                boolean z = true;
                if (hy.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    hy.d("it.parameterTypes", parameterTypes);
                    if (parameterTypes.length == 1) {
                        method = parameterTypes[0];
                    }
                }
                z = false;
                if (z) {
                    method = method2;
                    break;
                }
                i++;
            }
            a = method;
            for (Method method3 : methods) {
                hy.d("it", method3);
                if (hy.a(method3.getName(), "getSuppressed")) {
                    return;
                }
            }
        }
    }
}