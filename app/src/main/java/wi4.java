package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;

/* renamed from: wi4  reason: default package */
public final class wi4 extends br4 {
    public wi4(Looper looper) {
        super(looper);
    }

    @Override // defpackage.br4
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            cu5 cu5Var = jv5.A.c;
            Context context = jv5.A.g.e;
            if (context != null) {
                try {
                    if (((Boolean) wb2.b.d()).booleanValue()) {
                        wg.a(context, th);
                    }
                } catch (IllegalStateException unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            jv5.A.g.f("AdMobHandler.handleMessage", e);
        }
    }
}