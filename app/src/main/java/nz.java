package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: nz  reason: default package */
public final class nz extends ne0 {
    public final Method c;
    public final Method d;

    public nz(Method method, Method method2) {
        this.c = method;
        this.d = method2;
    }

    @Override // defpackage.ne0
    public final void g(SSLSocket sSLSocket, String str, List<ig0> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList b = ne0.b(list);
            this.c.invoke(sSLParameters, b.toArray(new String[b.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to set SSL parameters", e);
        }
    }

    @Override // defpackage.ne0
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        try {
            String str = (String) this.d.invoke(sSLSocket, new Object[0]);
            if (str != null) {
                if (str.equals("")) {
                    return null;
                }
                return str;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        }
    }
}