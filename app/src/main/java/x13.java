package defpackage;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import java.util.WeakHashMap;

/* renamed from: x13  reason: default package */
public final class x13 {
    public boolean d;
    public Context e;
    public boolean c = false;
    public final WeakHashMap b = new WeakHashMap();
    public final a13 a = new a13(this);

    @SuppressLint({"UnprotectedReceiver"})
    public final synchronized void a(Context context) {
        if (this.c) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.e = applicationContext;
        if (applicationContext == null) {
            this.e = context;
        }
        x92.a(this.e);
        l92 l92Var = x92.e3;
        w82 w82Var = w82.d;
        this.d = ((Boolean) w82Var.c.a(l92Var)).booleanValue();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (((Boolean) w82Var.c.a(x92.B8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
            t31.b(this.e, this.a, intentFilter);
        } else {
            this.e.registerReceiver(this.a, intentFilter);
        }
        this.c = true;
    }

    public final synchronized void b(Context context, BroadcastReceiver broadcastReceiver) {
        if (this.d) {
            this.b.remove(broadcastReceiver);
        } else {
            context.unregisterReceiver(broadcastReceiver);
        }
    }
}