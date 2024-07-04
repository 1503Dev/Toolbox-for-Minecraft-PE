package defpackage;

import android.content.Context;
import android.view.View;
import com.adcolony.sdk.AdColonyAdViewActivity;

/* renamed from: y1  reason: default package */
public final class y1 implements View.OnClickListener {
    public final /* synthetic */ Context P;

    public y1(Context context) {
        this.P = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = this.P;
        if (context instanceof AdColonyAdViewActivity) {
            ((AdColonyAdViewActivity) context).e();
        }
    }
}