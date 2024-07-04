package defpackage;

import android.media.Spatializer;

/* renamed from: gy5  reason: default package */
public final class gy5 implements Spatializer.OnSpatializerStateChangedListener {
    public final /* synthetic */ oy5 a;

    public gy5(oy5 oy5Var) {
        this.a = oy5Var;
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
        oy5 oy5Var = this.a;
        mw4 mw4Var = oy5.j;
        oy5Var.i();
    }

    @Override // android.media.Spatializer.OnSpatializerStateChangedListener
    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
        oy5 oy5Var = this.a;
        mw4 mw4Var = oy5.j;
        oy5Var.i();
    }
}