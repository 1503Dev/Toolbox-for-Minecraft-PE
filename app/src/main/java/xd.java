package defpackage;

import android.animation.ValueAnimator;
import android.text.Editable;
import android.view.animation.DecelerateInterpolator;
import defpackage.xs0;
import defpackage.zs0;

/* renamed from: xd  reason: default package */
public final /* synthetic */ class xd implements zs0.a, xs0.a {
    public final /* synthetic */ Object a;

    public /* synthetic */ xd(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.xs0.a
    public final void a() {
        ValueAnimator valueAnimator;
        long j;
        px0 px0Var = (px0) this.a;
        if (px0Var.l.Q) {
            px0Var.n.setFloatValues(0.0f, 1.0f);
            px0Var.n.setInterpolator(new DecelerateInterpolator());
            valueAnimator = px0Var.n;
            j = 200;
        } else {
            px0Var.n.setFloatValues(1.0f, 0.0f);
            px0Var.n.setInterpolator(new up());
            valueAnimator = px0Var.n;
            j = 100;
        }
        valueAnimator.setDuration(j);
        px0Var.n.start();
    }

    @Override // defpackage.zs0.a
    public final void afterTextChanged(Editable editable) {
        zd zdVar = (zd) this.a;
        zdVar.e(zdVar.V.k0, editable, 0);
    }
}