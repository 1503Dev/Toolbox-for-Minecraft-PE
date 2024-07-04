package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import defpackage.kt;
import defpackage.l4;

/* renamed from: fg1  reason: default package */
public final class fg1 extends l4.a<cs0, ds0> {
    @Override // defpackage.l4.a
    public final l4.e b(Context context, Looper looper, jd jdVar, l4.c cVar, kt.a aVar, kt.b bVar) {
        ds0 ds0Var = (ds0) cVar;
        Integer num = jdVar.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", jdVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new cs0(context, looper, jdVar, bundle, aVar, bVar);
    }
}