package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: eu  reason: default package */
public final class eu {
    public final mx0 a;
    public final wc b;
    public final List<Certificate> c;
    public final List<Certificate> d;

    public eu(mx0 mx0Var, wc wcVar, List<Certificate> list, List<Certificate> list2) {
        this.a = mx0Var;
        this.b = wcVar;
        this.c = list;
        this.d = list2;
    }

    public static eu a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
                throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
            }
            wc a = wc.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                if ("NONE".equals(protocol)) {
                    throw new IOException("tlsVersion == NONE");
                }
                mx0 b = mx0.b(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                List m = certificateArr != null ? c31.m(certificateArr) : Collections.emptyList();
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                return new eu(b, a, m, localCertificates != null ? c31.m(localCertificates) : Collections.emptyList());
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    public static ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Certificate certificate = (Certificate) it.next();
            arrayList.add(certificate instanceof X509Certificate ? String.valueOf(((X509Certificate) certificate).getSubjectDN()) : certificate.getType());
        }
        return arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof eu) {
            eu euVar = (eu) obj;
            return this.a.equals(euVar.a) && this.b.equals(euVar.b) && this.c.equals(euVar.c) && this.d.equals(euVar.d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder b = e5.b("Handshake{tlsVersion=");
        b.append(this.a);
        b.append(" cipherSuite=");
        b.append(this.b);
        b.append(" peerCertificates=");
        b.append(b(this.c));
        b.append(" localCertificates=");
        b.append(b(this.d));
        b.append('}');
        return b.toString();
    }
}