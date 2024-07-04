package defpackage;

import android.util.Base64;
import java.util.List;

/* renamed from: rq  reason: default package */
public final class rq {
    public final String a;
    public final String b;
    public final String c;
    public final List<List<byte[]>> d;
    public final String e;

    public rq(String str, String str2, String str3, List<List<byte[]>> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        list.getClass();
        this.d = list;
        this.e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder b = e5.b("FontRequest {mProviderAuthority: ");
        b.append(this.a);
        b.append(", mProviderPackage: ");
        b.append(this.b);
        b.append(", mQuery: ");
        b.append(this.c);
        b.append(", mCertificates:");
        sb.append(b.toString());
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        return qq.d(sb, "}", "mCertificatesArray: 0");
    }
}