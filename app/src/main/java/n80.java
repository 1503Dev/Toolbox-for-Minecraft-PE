package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: n80  reason: default package */
public final /* synthetic */ class n80 implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ n80(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                ((d) this.Q).i();
                return;
            default:
                Context context = (Context) this.Q;
                int i = az0.g;
                try {
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://mrarm.io/r/tbdiscord")));
                    return;
                } catch (ActivityNotFoundException unused) {
                    return;
                }
        }
    }
}