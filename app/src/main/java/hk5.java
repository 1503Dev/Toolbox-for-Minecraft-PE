package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: hk5  reason: default package */
public final class hk5 extends BroadcastReceiver implements Runnable {
    public final Handler P;

    public hk5(Handler handler) {
        this.P = handler;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.P.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
    }
}