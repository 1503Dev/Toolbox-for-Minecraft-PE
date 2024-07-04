package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.c;
import androidx.lifecycle.e;
import androidx.lifecycle.h;

/* renamed from: d10  reason: default package */
public class d10 extends Service implements b10 {
    public final h P = new h(this);

    @Override // defpackage.b10
    public final e k() {
        return this.P.a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.P.a(c.b.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.P.a(c.b.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        h hVar = this.P;
        hVar.a(c.b.ON_STOP);
        hVar.a(c.b.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.P.a(c.b.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}