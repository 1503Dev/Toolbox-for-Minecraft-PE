package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import defpackage.ph;
import java.util.concurrent.Executor;

/* renamed from: q24  reason: default package */
public final class q24 implements e14 {
    public final Context a;
    public final sj3 b;
    public final Executor c;
    public final xh4 d;

    public q24(Context context, Executor executor, sj3 sj3Var, xh4 xh4Var) {
        this.a = context;
        this.b = sj3Var;
        this.c = executor;
        this.d = xh4Var;
    }

    @Override // defpackage.e14
    public final boolean a(hi4 hi4Var, yh4 yh4Var) {
        String str;
        Context context = this.a;
        if ((context instanceof Activity) && ua2.a(context)) {
            try {
                str = yh4Var.v.getString("tab_url");
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.e14
    public final dz4 b(final hi4 hi4Var, final yh4 yh4Var) {
        String str;
        final Uri uri;
        try {
            str = yh4Var.v.getString("tab_url");
        } catch (Exception unused) {
            str = null;
        }
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        return zw4.F(zw4.C(null), new ky4() { // from class: p24
            @Override // defpackage.ky4
            public final dz4 e(Object obj) {
                q24 q24Var = q24.this;
                Uri uri2 = uri;
                hi4 hi4Var2 = hi4Var;
                yh4 yh4Var2 = yh4Var;
                q24Var.getClass();
                try {
                    ph a = new ph.a().a();
                    a.a.setData(uri2);
                    tw2 tw2Var = new tw2(a.a, null);
                    bx2 bx2Var = new bx2();
                    o43 c = q24Var.b.c(new ts1(hi4Var2, yh4Var2, null), new hj3(new zw5(5, bx2Var), null));
                    bx2Var.a(new AdOverlayInfoParcel(tw2Var, null, c.r(), null, new xv2(0, 0, false, false), null, null));
                    q24Var.d.b(2, 3);
                    return zw4.C(c.p());
                } catch (Throwable th) {
                    sv2.e("Error in CustomTabsAdRenderer", th);
                    throw th;
                }
            }
        }, this.c);
    }
}