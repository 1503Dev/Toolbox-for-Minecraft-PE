package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* renamed from: nf  reason: default package */
public final class nf extends ne0 {
    public static nf o() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (Conscrypt.isAvailable()) {
                return new nf();
            }
            return null;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static Provider p() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Override // defpackage.ne0
    public final void f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    @Override // defpackage.ne0
    public final void g(SSLSocket sSLSocket, String str, List<ig0> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ne0.b(list).toArray(new String[0]));
        }
    }

    @Override // defpackage.ne0
    public final SSLContext i() {
        try {
            return SSLContext.getInstance("TLSv1.3", p());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", p());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    @Override // defpackage.ne0
    @Nullable
    public final String j(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }
}