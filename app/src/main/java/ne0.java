package defpackage;

import android.os.Build;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.AccessControlException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: ne0  reason: default package */
public class ne0 {
    public static final ne0 a;
    public static final Logger b;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        int i;
        ne0 ne0Var;
        int i2;
        Class<?> cls;
        ne0 b4Var;
        String str;
        boolean equals;
        mz mzVar = null;
        try {
            try {
                i = Build.VERSION.SDK_INT;
            } catch (NoClassDefFoundError unused) {
                i = 0;
            }
        } catch (ReflectiveOperationException unused2) {
        }
        if (i >= 29) {
            Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            ne0Var = new a4();
            if (ne0Var == null) {
                try {
                    i2 = Build.VERSION.SDK_INT;
                } catch (NoClassDefFoundError unused3) {
                    i2 = 0;
                }
                if (i2 != 0) {
                    try {
                        Class.forName("com.android.org.conscrypt.SSLParametersImpl");
                        cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
                    } catch (ClassNotFoundException unused4) {
                    }
                    if (Build.VERSION.SDK_INT >= 21) {
                        try {
                            b4Var = new b4(cls, cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls.getMethod("setHostname", String.class), cls.getMethod("getAlpnSelectedProtocol", new Class[0]), cls.getMethod("setAlpnProtocols", byte[].class));
                            if (b4Var == null) {
                                byte[] bArr = c31.a;
                                try {
                                    str = System.getProperty("okhttp.platform");
                                } catch (AccessControlException unused5) {
                                }
                            }
                            ne0Var = b4Var;
                        } catch (NoSuchMethodException unused6) {
                        }
                    }
                    StringBuilder b2 = e5.b("Expected Android API level 21+ but was ");
                    b2.append(Build.VERSION.SDK_INT);
                    throw new IllegalStateException(b2.toString());
                }
                b4Var = null;
                if (b4Var == null) {
                }
                ne0Var = b4Var;
            }
            a = ne0Var;
            b = Logger.getLogger(nb0.class.getName());
        }
        ne0Var = null;
        if (ne0Var == null) {
        }
        a = ne0Var;
        b = Logger.getLogger(nb0.class.getName());
        if (ne0Var == null) {
            try {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                mzVar = new mz(cls2.getMethod("put", SSLSocket.class, Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null)), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
            } catch (ClassNotFoundException | NoSuchMethodException unused7) {
            }
            if (mzVar == null) {
                ne0Var = mzVar;
            } else {
                ne0Var = new ne0();
            }
        }
        a = ne0Var;
        b = Logger.getLogger(nb0.class.getName());
        str = null;
        if ("conscrypt".equals(str)) {
            equals = true;
        } else {
            equals = "Conscrypt".equals(Security.getProviders()[0].getName());
        }
        if (!equals || (b4Var = nf.o()) == null) {
            try {
                ne0Var = new nz(SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
            } catch (NoSuchMethodException unused8) {
                ne0Var = null;
            }
            if (ne0Var == null) {
            }
            a = ne0Var;
            b = Logger.getLogger(nb0.class.getName());
        }
        ne0Var = b4Var;
        a = ne0Var;
        b = Logger.getLogger(nb0.class.getName());
        if (mzVar == null) {
        }
        a = ne0Var;
        b = Logger.getLogger(nb0.class.getName());
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ig0 ig0Var = (ig0) list.get(i);
            if (ig0Var != ig0.HTTP_1_0) {
                arrayList.add(ig0Var.P);
            }
        }
        return arrayList;
    }

    public static byte[] e(List<ig0> list) {
        za zaVar = new za();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ig0 ig0Var = list.get(i);
            if (ig0Var != ig0.HTTP_1_0) {
                zaVar.S(ig0Var.P.length());
                String str = ig0Var.P;
                zaVar.X(0, str.length(), str);
            }
        }
        return zaVar.m();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public z61 c(X509TrustManager x509TrustManager) {
        return new r9(d(x509TrustManager));
    }

    public h11 d(X509TrustManager x509TrustManager) {
        return new s9(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, @Nullable String str, List<ig0> list) {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public SSLContext i() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    @Nullable
    public String j(SSLSocket sSLSocket) {
        return null;
    }

    @Nullable
    public Object k() {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean l(String str) {
        return true;
    }

    public void m(int i, String str, @Nullable Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void n(String str, Object obj) {
        if (obj == null) {
            str = k6.b(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        m(5, str, (Throwable) obj);
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}