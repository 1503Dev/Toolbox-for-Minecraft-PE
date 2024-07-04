package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import defpackage.ia;
import io.mrarm.mctoolbox.bridge.b;
import io.mrarm.simpleads.SimpleInterstitialAdActivity;
import java.util.HashSet;

/* renamed from: iz0  reason: default package */
public final /* synthetic */ class iz0 implements View.OnClickListener {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ iz0(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.P) {
            case 0:
                ((Runnable) this.Q).run();
                return;
            case 1:
                ia iaVar = ((ia.a) this.Q).k0;
                String[] strArr = (String[]) view.getTag();
                boolean z = !view.isSelected();
                iaVar.getClass();
                for (String str : strArr) {
                    HashSet hashSet = iaVar.m;
                    if (z) {
                        hashSet.add(str);
                    } else {
                        hashSet.remove(str);
                    }
                }
                ((b) iaVar.a).V(iaVar.f, (String[]) iaVar.m.toArray(new String[0]));
                return;
            default:
                SimpleInterstitialAdActivity simpleInterstitialAdActivity = (SimpleInterstitialAdActivity) this.Q;
                vs0 vs0Var = simpleInterstitialAdActivity.c0;
                vs0Var.getClass();
                try {
                    simpleInterstitialAdActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(vs0Var.b.e)));
                } catch (Throwable unused) {
                }
                vs0Var.e.d(vs0Var.f).g(new qs0());
                return;
        }
    }
}