package defpackage;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@SuppressLint({"NewApi"})
/* renamed from: a4  reason: default package */
public final class a4 extends b4 {
    public a4() {
        super(null, null, null, null, null);
    }

    @Override // defpackage.b4, defpackage.ne0
    @SuppressLint({"NewApi"})
    @IgnoreJRERequirement
    public final void g(SSLSocket sSLSocket, String str, List<ig0> list) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) ne0.b(list).toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.b4, defpackage.ne0
    @Nullable
    @IgnoreJRERequirement
    public final String j(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}