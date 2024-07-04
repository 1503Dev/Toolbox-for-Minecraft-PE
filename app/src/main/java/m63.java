package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: m63  reason: default package */
public final class m63 implements w53 {
    public final CookieManager a;

    public m63(Context context) {
        this.a = jv5.A.e.b(context);
    }

    @Override // defpackage.w53
    public final void a(HashMap hashMap) {
        if (this.a == null) {
            return;
        }
        if (((String) hashMap.get("clear")) != null) {
            String str = (String) w82.d.c.a(x92.A0);
            String cookie = this.a.getCookie(str);
            if (cookie != null) {
                Iterator b = vw2.a(new ts4(';')).b(cookie);
                ArrayList arrayList = new ArrayList();
                while (b.hasNext()) {
                    arrayList.add((String) b.next());
                }
                List unmodifiableList = Collections.unmodifiableList(arrayList);
                for (int i = 0; i < unmodifiableList.size(); i++) {
                    CookieManager cookieManager = this.a;
                    String str2 = (String) unmodifiableList.get(i);
                    vw2 a = vw2.a(new ts4('='));
                    str2.getClass();
                    Iterator b2 = a.b(str2);
                    b2.getClass();
                    if (b2.hasNext()) {
                        cookieManager.setCookie(str, String.valueOf((String) b2.next()).concat(String.valueOf((String) w82.d.c.a(x92.p0))));
                    } else {
                        throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (0)");
                    }
                }
                return;
            }
            return;
        }
        String str3 = (String) hashMap.get("cookie");
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        this.a.setCookie((String) w82.d.c.a(x92.A0), str3);
    }
}