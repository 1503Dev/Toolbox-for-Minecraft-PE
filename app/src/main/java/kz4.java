package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: kz4  reason: default package */
public final class kz4 {
    public static final /* synthetic */ int g = 0;
    public final Uri a;
    public final Map b;
    @Deprecated
    public final long c;
    public final long d;
    public final long e;
    public final int f;

    static {
        gm2.a("media3.datasource");
    }

    @Deprecated
    public kz4(Uri uri, long j, long j2, long j3, int i) {
        this(uri, j - j2, Collections.emptyMap(), j2, j3, i);
    }

    public kz4(Uri uri, long j, Map map, long j2, long j3, int i) {
        long j4 = j + j2;
        boolean z = true;
        tv2.G(j4 >= 0);
        tv2.G(j2 >= 0);
        long j5 = -1;
        if (j3 > 0) {
            j5 = j3;
        } else if (j3 != -1) {
            j5 = j3;
            z = false;
        }
        tv2.G(z);
        this.a = uri;
        this.b = Collections.unmodifiableMap(new HashMap(map));
        this.d = j2;
        this.c = j4;
        this.e = j5;
        this.f = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.d;
        long j2 = this.e;
        int i = this.f;
        StringBuilder b = sd1.b("DataSpec[", "GET", " ", valueOf, ", ");
        b.append(j);
        b.append(", ");
        b.append(j2);
        b.append(", null, ");
        b.append(i);
        b.append("]");
        return b.toString();
    }
}