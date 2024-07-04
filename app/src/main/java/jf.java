package defpackage;

import defpackage.Cif;
import defpackage.nb0;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: jf  reason: default package */
public final class jf {
    public final List<Cif> a;
    public int b = 0;
    public boolean c;
    public boolean d;

    public jf(List<Cif> list) {
        this.a = list;
    }

    public final Cif a(SSLSocket sSLSocket) {
        Cif cif;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i = this.b;
        int size = this.a.size();
        while (true) {
            if (i < size) {
                cif = this.a.get(i);
                if (cif.a(sSLSocket)) {
                    this.b = i + 1;
                    break;
                }
                i++;
            } else {
                cif = null;
                break;
            }
        }
        if (cif != null) {
            int i2 = this.b;
            while (true) {
                if (i2 < this.a.size()) {
                    if (this.a.get(i2).a(sSLSocket)) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            this.c = z;
            nb0.a aVar = dy.a;
            boolean z2 = this.d;
            aVar.getClass();
            if (cif.c != null) {
                enabledCipherSuites = c31.n(wc.b, sSLSocket.getEnabledCipherSuites(), cif.c);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            if (cif.d != null) {
                enabledProtocols = c31.n(c31.i, sSLSocket.getEnabledProtocols(), cif.d);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            vc vcVar = wc.b;
            byte[] bArr = c31.a;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (vcVar.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (z2 && i3 != -1) {
                String str = supportedCipherSuites[i3];
                int length2 = enabledCipherSuites.length + 1;
                String[] strArr = new String[length2];
                System.arraycopy(enabledCipherSuites, 0, strArr, 0, enabledCipherSuites.length);
                strArr[length2 - 1] = str;
                enabledCipherSuites = strArr;
            }
            Cif.a aVar2 = new Cif.a(cif);
            aVar2.b(enabledCipherSuites);
            aVar2.d(enabledProtocols);
            Cif cif2 = new Cif(aVar2);
            String[] strArr2 = cif2.d;
            if (strArr2 != null) {
                sSLSocket.setEnabledProtocols(strArr2);
            }
            String[] strArr3 = cif2.c;
            if (strArr3 != null) {
                sSLSocket.setEnabledCipherSuites(strArr3);
            }
            return cif;
        }
        StringBuilder b = e5.b("Unable to find acceptable protocols. isFallback=");
        b.append(this.d);
        b.append(", modes=");
        b.append(this.a);
        b.append(", supported protocols=");
        b.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(b.toString());
    }
}