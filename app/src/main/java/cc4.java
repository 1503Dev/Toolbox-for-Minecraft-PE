package defpackage;

import android.os.Bundle;

/* renamed from: cc4  reason: default package */
public final class cc4 implements mc4 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public cc4(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // defpackage.mc4
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = (Bundle) obj;
        hj4.b(bundle, "gmp_app_id", this.a);
        hj4.b(bundle, "fbs_aiid", this.b);
        hj4.b(bundle, "fbs_aeid", this.c);
        hj4.b(bundle, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}