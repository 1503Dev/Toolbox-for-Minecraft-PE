package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

/* renamed from: lq  reason: default package */
public final class lq implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ d P;

    public lq(d dVar) {
        this.P = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        d dVar = this.P;
        float rotation = dVar.s.getRotation();
        if (dVar.m != rotation) {
            dVar.m = rotation;
            dVar.k();
            return true;
        }
        return true;
    }
}