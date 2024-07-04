package defpackage;

import android.net.Uri;

/* renamed from: nk2  reason: default package */
public final class nk2 extends wv2 {
    public nk2(String str) {
        super(str);
    }

    @Override // defpackage.wv2, defpackage.lv2
    public final boolean m(String str) {
        sv2.b("LeibnizHttpUrlPinger pinging URL: ".concat(String.valueOf(str)));
        if ("oda".equals(Uri.parse(str).getScheme())) {
            return true;
        }
        sv2.b("URL does not match oda:// scheme, falling back on HttpUrlPinger");
        return super.m(str);
    }
}