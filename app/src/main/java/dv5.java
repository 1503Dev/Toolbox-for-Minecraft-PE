package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Process;
import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import java.io.InputStream;
import java.util.HashMap;

@TargetApi(21)
/* renamed from: dv5  reason: default package */
public class dv5 extends ck1 {
    public dv5() {
        super(0);
    }

    @Override // defpackage.ck1
    public final int a() {
        return 16974374;
    }

    @Override // defpackage.ck1
    public final CookieManager b(Context context) {
        boolean z;
        cu5 cu5Var = jv5.A.c;
        int myUid = Process.myUid();
        if (myUid != 0 && myUid != 1000) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        try {
            return CookieManager.getInstance();
        } catch (Throwable th) {
            sv2.e("Failed to obtain CookieManager.", th);
            jv5.A.g.f("ApiLevelUtil.getCookieManager", th);
            return null;
        }
    }

    @Override // defpackage.ck1
    public final WebResourceResponse c(String str, String str2, int i, String str3, HashMap hashMap, InputStream inputStream) {
        return new WebResourceResponse(str, str2, i, str3, hashMap, inputStream);
    }

    @Override // defpackage.ck1
    public final g13 d(l13 l13Var, j52 j52Var, boolean z) {
        return new b23(l13Var, j52Var, z);
    }
}