package defpackage;

import android.webkit.CookieManager;
import java.util.concurrent.Callable;

/* renamed from: dv3  reason: default package */
public final /* synthetic */ class dv3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dv3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                CookieManager cookieManager = (CookieManager) this.b;
                if (cookieManager == null) {
                    return "";
                }
                return cookieManager.getCookie((String) w82.d.c.a(x92.A0));
            default:
                return new sa4(0, ((ra4) this.b).b);
        }
    }
}