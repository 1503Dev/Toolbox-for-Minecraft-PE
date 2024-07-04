package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: a13  reason: default package */
public final class a13 extends BroadcastReceiver {
    public final /* synthetic */ x13 a;

    public a13(x13 x13Var) {
        this.a = x13Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        x13 x13Var = this.a;
        synchronized (x13Var) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : x13Var.b.entrySet()) {
                if (((IntentFilter) entry.getValue()).hasAction(intent.getAction())) {
                    arrayList.add((BroadcastReceiver) entry.getKey());
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((BroadcastReceiver) arrayList.get(i)).onReceive(context, intent);
            }
        }
    }
}