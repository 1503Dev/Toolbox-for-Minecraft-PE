package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* renamed from: g94  reason: default package */
public final class g94 implements nc4 {
    public final ez4 a;
    public final Context b;

    public g94(Context context, yw2 yw2Var) {
        this.a = yw2Var;
        this.b = context;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 14;
    }

    @Override // defpackage.nc4
    @SuppressLint({"UnprotectedReceiver"})
    public final dz4 c() {
        return this.a.b(new Callable() { // from class: f94
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Intent registerReceiver;
                double d;
                g94 g94Var = g94.this;
                g94Var.getClass();
                IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                if (((Boolean) w82.d.c.a(x92.B8)).booleanValue() && Build.VERSION.SDK_INT >= 33) {
                    registerReceiver = g94Var.b.registerReceiver(null, intentFilter, 4);
                } else {
                    registerReceiver = g94Var.b.registerReceiver(null, intentFilter);
                }
                boolean z = false;
                if (registerReceiver != null) {
                    int intExtra = registerReceiver.getIntExtra("status", -1);
                    double intExtra2 = registerReceiver.getIntExtra("level", -1);
                    double intExtra3 = registerReceiver.getIntExtra("scale", -1);
                    z = (intExtra == 2 || intExtra == 5) ? true : true;
                    Double.isNaN(intExtra2);
                    Double.isNaN(intExtra3);
                    Double.isNaN(intExtra2);
                    Double.isNaN(intExtra3);
                    Double.isNaN(intExtra2);
                    Double.isNaN(intExtra3);
                    d = intExtra2 / intExtra3;
                } else {
                    d = -1.0d;
                }
                return new h94(d, z);
            }
        });
    }
}