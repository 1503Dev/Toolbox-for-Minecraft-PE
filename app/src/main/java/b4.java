package defpackage;

import android.os.Build;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* renamed from: b4  reason: default package */
public class b4 extends ne0 {
    public final Class<?> c;
    public final Method d;
    public final Method e;
    public final Method f;
    public final Method g;
    public final b h;

    /* renamed from: b4$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends z61 {
        public final Object f;
        public final Method g;

        public a(Object obj, Method method) {
            this.f = obj;
            this.g = method;
        }

        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        @Override // defpackage.z61
        public final List w(String str, List list) {
            try {
                return (List) this.g.invoke(this.f, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e2.getMessage());
                sSLPeerUnverifiedException.initCause(e2);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    /* renamed from: b4$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public final Method a;
        public final Method b;
        public final Method c;

        public b(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

    /* renamed from: b4$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class c implements h11 {
        public final X509TrustManager a;
        public final Method b;

        public c(X509TrustManager x509TrustManager, Method method) {
            this.b = method;
            this.a = x509TrustManager;
        }

        @Override // defpackage.h11
        public final X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.b.invoke(this.a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw new AssertionError("unable to get issues and signature", e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.a.equals(cVar.a) && this.b.equals(cVar.b);
            }
            return false;
        }

        public final int hashCode() {
            return (this.b.hashCode() * 31) + this.a.hashCode();
        }
    }

    public b4(Class cls, Method method, Method method2, Method method3, Method method4) {
        Method method5;
        Method method6;
        Method method7 = null;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method8 = cls2.getMethod("get", new Class[0]);
            method6 = cls2.getMethod("open", String.class);
            method5 = cls2.getMethod("warnIfOpen", new Class[0]);
            method7 = method8;
        } catch (Exception unused) {
            method5 = null;
            method6 = null;
        }
        this.h = new b(method7, method6, method5);
        this.c = cls;
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = method4;
    }

    public static boolean o(String str, Class cls, Object obj) {
        try {
            try {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
            } catch (NoSuchMethodException unused) {
                return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
            }
        } catch (NoSuchMethodException unused2) {
            return true;
        }
    }

    @Override // defpackage.ne0
    public final z61 c(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.ne0
    public final h11 d(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new c(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return new s9(x509TrustManager.getAcceptedIssuers());
        }
    }

    @Override // defpackage.ne0
    public void g(SSLSocket sSLSocket, String str, List<ig0> list) {
        if (this.c.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.d.invoke(sSLSocket, Boolean.TRUE);
                    this.e.invoke(sSLSocket, str);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new AssertionError(e);
                }
            }
            this.g.invoke(sSLSocket, ne0.e(list));
        }
    }

    @Override // defpackage.ne0
    public final void h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (!c31.o(e)) {
                throw e;
            }
            throw new IOException(e);
        } catch (ClassCastException e2) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e2;
            }
            throw new IOException("Exception in connect", e2);
        }
    }

    @Override // defpackage.ne0
    public final SSLContext i() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Override // defpackage.ne0
    @Nullable
    public String j(SSLSocket sSLSocket) {
        if (this.c.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f.invoke(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, StandardCharsets.UTF_8);
                }
                return null;
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new AssertionError(e);
            }
        }
        return null;
    }

    @Override // defpackage.ne0
    @Nullable
    public final Object k() {
        b bVar = this.h;
        Method method = bVar.a;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            bVar.b.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.ne0
    public final boolean l(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(str, cls, cls.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return true;
        } catch (IllegalAccessException e) {
            e = e;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // defpackage.ne0
    public final void m(int i, String str, @Nullable Throwable th) {
        int min;
        int i2 = i != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    @Override // defpackage.ne0
    public final void n(String str, Object obj) {
        b bVar = this.h;
        bVar.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                bVar.c.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            m(5, str, null);
        }
    }
}