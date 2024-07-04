package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;

/* renamed from: bz  reason: default package */
public final class bz extends View {
    public final /* synthetic */ int P;
    public final /* synthetic */ dz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(dz dzVar, Activity activity, int i) {
        super(activity);
        this.Q = dzVar;
        this.P = i;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cw, android.view.View] */
    /* JADX WARN: Type inference failed for: r4v5, types: [cw, android.view.View] */
    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        StringBuilder b = e5.b("TEST: ");
        b.append(this.Q.d.getTotalHeight());
        Log.e("TEST", b.toString());
        setMeasuredDimension(View.MeasureSpec.getSize(i), (this.P * 2) + ((int) Math.ceil(this.Q.d.getTotalHeight())));
    }
}