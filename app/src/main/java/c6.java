package defpackage;

import android.annotation.SuppressLint;
import android.view.View;
import defpackage.d6;

/* renamed from: c6  reason: default package */
public final class c6 extends ir {
    public final /* synthetic */ d6.d Y;
    public final /* synthetic */ d6 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(d6 d6Var, View view, d6.d dVar) {
        super(view);
        this.Z = d6Var;
        this.Y = dVar;
    }

    @Override // defpackage.ir
    public final bs0 b() {
        return this.Y;
    }

    @Override // defpackage.ir
    @SuppressLint({"SyntheticAccessor"})
    public final boolean c() {
        if (!this.Z.getInternalPopup().c()) {
            d6 d6Var = this.Z;
            d6Var.U.m(d6Var.getTextDirection(), d6Var.getTextAlignment());
            return true;
        }
        return true;
    }
}