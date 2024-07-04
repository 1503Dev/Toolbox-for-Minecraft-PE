package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.lc0;
import java.util.Collections;

public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String a = y20.e("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        y20.c().a(a, "Requesting diagnostics", new Throwable[0]);
        try {
            a71 E1 = a71.E1(context);
            lc0 a2 = new lc0.a(DiagnosticsWorker.class).a();
            E1.getClass();
            E1.D1(Collections.singletonList(a2));
        } catch (IllegalStateException e) {
            y20.c().b(a, "WorkManager is not initialized", e);
        }
    }
}