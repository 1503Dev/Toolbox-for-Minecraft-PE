package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: eh1  reason: default package */
public final class eh1 extends BroadcastReceiver {
    public Context a;
    public final vi1 b;

    public eh1(vi1 vi1Var) {
        this.b = vi1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        String str = null;
        if (data != null) {
            str = data.getSchemeSpecificPart();
        }
        if (!"com.google.android.gms".equals(str)) {
            return;
        }
        ((xi1) this.b.R).getClass();
        throw null;
    }
}