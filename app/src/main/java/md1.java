package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* renamed from: md1  reason: default package */
public final class md1 implements View.OnClickListener {
    public final /* synthetic */ ld1 P;

    public md1(ld1 ld1Var) {
        this.P = ld1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        eg1.i(new Intent("android.intent.action.VIEW", Uri.parse(this.P.z0)), false);
        mf1 a = ga1.h().a();
        String adSessionId = this.P.getAdSessionId();
        a.getClass();
        mf1.d(adSessionId);
    }
}