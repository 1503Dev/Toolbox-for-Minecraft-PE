package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* renamed from: mz  reason: default package */
public final class mz extends ne0 {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class<?> f;
    public final Class<?> g;

    /* renamed from: mz$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements InvocationHandler {
        public final List<String> a;
        public boolean b;
        public String c;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = c31.b;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                    Object obj2 = objArr[0];
                    if (obj2 instanceof List) {
                        List list = (List) obj2;
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            String str = (String) list.get(i);
                            if (this.a.contains(str)) {
                                this.c = str;
                                return str;
                            }
                        }
                        String str2 = this.a.get(0);
                        this.c = str2;
                        return str2;
                    }
                }
                if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.c = (String) objArr[0];
                    return null;
                }
                return method.invoke(this, objArr);
            }
        }
    }

    public mz(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // defpackage.ne0
    public final void a(SSLSocket sSLSocket) {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to remove ALPN", e);
        }
    }

    @Override // defpackage.ne0
    public final void g(SSLSocket sSLSocket, String str, List<ig0> list) {
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(ne0.class.getClassLoader(), new Class[]{this.f, this.g}, new a(ne0.b(list))));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set ALPN", e);
        }
    }

    @Override // defpackage.ne0
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            boolean z = aVar.b;
            if (!z && aVar.c == null) {
                ne0.a.m(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            } else if (z) {
                return null;
            } else {
                return aVar.c;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}