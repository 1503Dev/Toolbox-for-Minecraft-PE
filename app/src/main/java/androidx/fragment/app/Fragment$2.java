package androidx.fragment.app;

import android.view.View;
import androidx.lifecycle.c;

/* JADX INFO: Access modifiers changed from: package-private */
public class Fragment$2 implements androidx.lifecycle.d {
    public final /* synthetic */ c a;

    public Fragment$2(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.lifecycle.d
    public final void d(b10 b10Var, c.b bVar) {
        View view;
        if (bVar != c.b.ON_STOP || (view = this.a.s0) == null) {
            return;
        }
        view.cancelPendingInputEvents();
    }
}