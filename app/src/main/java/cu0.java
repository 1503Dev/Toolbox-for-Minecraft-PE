package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: cu0  reason: default package */
public final class cu0 extends xa<Boolean> {
    public static final String i = y20.e("StorageNotLowTracker");

    public cu0(Context context, bw0 bw0Var) {
        super(context, bw0Var);
    }

    @Override // defpackage.qf
    public final Object a() {
        Intent registerReceiver = this.b.registerReceiver(null, e());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.xa
    public final IntentFilter e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // defpackage.xa
    public final void f(Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        y20.c().a(i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        b(bool);
    }
}