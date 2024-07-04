package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: oc  reason: default package */
public final class oc {
    public static final oc c = new oc(new LinkedHashSet(new ArrayList()), null);
    public final Set<a> a;
    @Nullable
    public final z61 b;

    /* renamed from: oc$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                ((a) obj).getClass();
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            new StringBuilder().append((String) null);
            throw null;
        }
    }

    public oc(Set<a> set, @Nullable z61 z61Var) {
        this.a = set;
        this.b = z61Var;
    }

    public static String b(X509Certificate x509Certificate) {
        if (x509Certificate instanceof X509Certificate) {
            StringBuilder b = e5.b("sha256/");
            try {
                b.append(fb.k(MessageDigest.getInstance("SHA-256").digest(fb.k(x509Certificate.getPublicKey().getEncoded()).P)).e());
                return b.toString();
            } catch (NoSuchAlgorithmException e) {
                throw new AssertionError(e);
            }
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, List<Certificate> list) {
        List emptyList = Collections.emptyList();
        Iterator<a> it = this.a.iterator();
        if (!it.hasNext()) {
            if (emptyList.isEmpty()) {
                return;
            }
            z61 z61Var = this.b;
            if (z61Var != 0) {
                list = z61Var.w(str, list);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                if (emptyList.size() > 0) {
                    ((a) emptyList.get(0)).getClass();
                    throw null;
                }
            }
            StringBuilder c2 = yg.c("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i2);
                c2.append("\n    ");
                c2.append(b(x509Certificate2));
                c2.append(": ");
                c2.append(x509Certificate2.getSubjectDN().getName());
            }
            c2.append("\n  Pinned certificates for ");
            c2.append(str);
            c2.append(":");
            int size3 = emptyList.size();
            for (int i3 = 0; i3 < size3; i3++) {
                c2.append("\n    ");
                c2.append((a) emptyList.get(i3));
            }
            throw new SSLPeerUnverifiedException(c2.toString());
        }
        it.next().getClass();
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oc) {
            oc ocVar = (oc) obj;
            if (Objects.equals(this.b, ocVar.b) && this.a.equals(ocVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Objects.hashCode(this.b) * 31);
    }
}