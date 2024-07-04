package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: em4  reason: default package */
public final class em4 {
    public final String a = (String) gb2.a.d();

    public final String a(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}