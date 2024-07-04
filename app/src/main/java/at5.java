package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* renamed from: at5  reason: default package */
public final class at5 extends BroadcastReceiver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public at5(q02 q02Var) {
        this.b = q02Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cu5 cu5Var;
        boolean z;
        switch (this.a) {
            case 0:
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    cu5Var = (cu5) this.b;
                    z = true;
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    cu5Var = (cu5) this.b;
                    z = false;
                } else {
                    return;
                }
                cu5Var.c = z;
                return;
            default:
                Handler handler = q02.b0;
                ((q02) this.b).d();
                return;
        }
    }

    public /* synthetic */ at5(cu5 cu5Var) {
        this.b = cu5Var;
    }
}