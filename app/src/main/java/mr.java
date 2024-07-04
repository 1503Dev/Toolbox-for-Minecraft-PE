package defpackage;

import android.view.View;
import androidx.fragment.app.c;

/* renamed from: mr  reason: default package */
public final class mr extends z9 {
    public final /* synthetic */ c P;

    public mr(c cVar) {
        this.P = cVar;
    }

    @Override // defpackage.z9
    public final View f(int i) {
        View view = this.P.s0;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // defpackage.z9
    public final boolean g() {
        return this.P.s0 != null;
    }
}