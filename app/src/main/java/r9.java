package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: r9  reason: default package */
public final class r9 extends z61 {
    public final h11 f;

    public r9(h11 h11Var) {
        this.f = h11Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof r9) && ((r9) obj).f.equals(this.f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084 A[SYNTHETIC] */
    @Override // defpackage.z61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List w(String str, List list) {
        boolean z;
        boolean z2;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Certificate) arrayDeque.removeFirst());
        boolean z3 = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a = this.f.a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                    arrayList.add(a);
                }
                if (a.getIssuerDN().equals(a.getSubjectDN())) {
                    try {
                        a.verify(a.getPublicKey());
                        z2 = true;
                    } catch (GeneralSecurityException unused) {
                    }
                    if (!z2) {
                        return arrayList;
                    }
                    z3 = true;
                }
                z2 = false;
                if (!z2) {
                }
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate2.getPublicKey());
                            z = true;
                            continue;
                        } catch (GeneralSecurityException unused2) {
                        }
                        if (z) {
                            it.remove();
                            arrayList.add(x509Certificate2);
                        }
                    }
                    z = false;
                    continue;
                    if (z) {
                    }
                }
                if (z3) {
                    return arrayList;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }
}