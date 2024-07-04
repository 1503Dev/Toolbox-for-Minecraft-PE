package defpackage;

import android.net.Uri;
import java.security.Provider;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import javax.crypto.Cipher;

/* renamed from: lp5  reason: default package */
public final class lp5 implements ta0, hc5, pk1 {
    public static final /* synthetic */ lp5 P = new lp5();
    public static final z92 Q = new z92(1);
    public static final zk4 R = new zk4();

    public static String b(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e) {
                    String str3 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str3), (Throwable) e);
                    str2 = "<" + str3 + " threw " + e.getClass().getName() + ">";
                }
            }
            objArr[i2] = str2;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i3 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    @Override // defpackage.pk1
    public /* synthetic */ lk1[] a(Uri uri, Map map) {
        int i = ok1.a;
        int i2 = l03.l0;
        return new lk1[]{new vq1(), new op1(), new rq1()};
    }

    @Override // defpackage.hc5
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
    }

    @Override // defpackage.ta0
    public Object d() {
        return new LinkedHashSet();
    }
}