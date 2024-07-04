package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import defpackage.k9;

/* renamed from: x42  reason: default package */
public final class x42 extends rw2 {
    public x42(Context context, Looper looper, k9.a aVar, k9.b bVar) {
        super(br2.a(context), looper, 123, aVar, bVar);
    }

    public final boolean B() {
        int i;
        boolean z;
        wp[] h = h();
        if (((Boolean) w82.d.c.a(x92.x1)).booleanValue()) {
            wp wpVar = k25.a;
            if (h != null) {
                i = h.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (wa0.a(h[i2], wpVar)) {
                    if (i2 >= 0) {
                        z = true;
                    }
                } else {
                    i2++;
                }
            }
            z = false;
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k9
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof a52 ? (a52) queryLocalInterface : new a52(iBinder);
    }

    @Override // defpackage.k9
    public final wp[] r() {
        return k25.b;
    }

    @Override // defpackage.k9
    public final String w() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // defpackage.k9
    public final String x() {
        return "com.google.android.gms.ads.service.CACHE";
    }
}