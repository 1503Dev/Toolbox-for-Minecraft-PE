package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* renamed from: lb0  reason: default package */
public final class lb0 implements HostnameVerifier {
    public static final lb0 a = new lb0();

    public static ArrayList a(X509Certificate x509Certificate) {
        List<String> b = b(x509Certificate, 7);
        List<String> b2 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b2.size() + b.size());
        arrayList.addAll(b);
        arrayList.addAll(b2);
        return arrayList;
    }

    public static List<String> b(X509Certificate x509Certificate, int i) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean c(String str, X509Certificate x509Certificate) {
        boolean z;
        String str2;
        int length;
        if (c31.k.matcher(str).matches()) {
            List<String> b = b(x509Certificate, 7);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                if (!str.equalsIgnoreCase(b.get(i))) {
                }
            }
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        for (String str3 : b(x509Certificate, 2)) {
            if (lowerCase != null && lowerCase.length() != 0 && !lowerCase.startsWith(".") && !lowerCase.endsWith("..") && str3 != null && str3.length() != 0 && !str3.startsWith(".") && !str3.endsWith("..")) {
                if (!lowerCase.endsWith(".")) {
                    str2 = lowerCase + '.';
                } else {
                    str2 = lowerCase;
                }
                if (!str3.endsWith(".")) {
                    str3 = str3 + '.';
                }
                String lowerCase2 = str3.toLowerCase(Locale.US);
                if (!lowerCase2.contains("*")) {
                    z = str2.equals(lowerCase2);
                    continue;
                } else if (lowerCase2.startsWith("*.") && lowerCase2.indexOf(42, 1) == -1 && str2.length() >= lowerCase2.length() && !"*.".equals(lowerCase2)) {
                    String substring = lowerCase2.substring(1);
                    if (str2.endsWith(substring) && ((length = str2.length() - substring.length()) <= 0 || str2.lastIndexOf(46, length - 1) == -1)) {
                        z = true;
                        continue;
                    }
                }
                if (z) {
                }
            }
            z = false;
            continue;
            if (z) {
            }
        }
        return false;
        return true;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}