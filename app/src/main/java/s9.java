package defpackage;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: s9  reason: default package */
public final class s9 implements h11 {
    public final LinkedHashMap a = new LinkedHashMap();

    public s9(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // defpackage.h11
    public final X509Certificate a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof s9) && ((s9) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}