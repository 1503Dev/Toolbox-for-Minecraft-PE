package defpackage;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"HandlerLeak"})
/* renamed from: kh1  reason: default package */
public final class kh1 extends aj1 {
    public final Context a;
    public final /* synthetic */ ht b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh1(ht htVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.b = htVar;
        this.a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        boolean z = true;
        if (i != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(i);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int d = this.b.d(this.a);
        this.b.getClass();
        AtomicBoolean atomicBoolean = ot.a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            z = false;
        }
        if (z) {
            ht htVar = this.b;
            Context context = this.a;
            Intent b = htVar.b(d, context, "n");
            if (b == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, b, zf3.a | 134217728);
            }
            htVar.h(context, d, activity);
        }
    }
}