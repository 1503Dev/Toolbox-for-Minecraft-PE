package androidx.appcompat.view.menu;

import android.view.MenuItem;
import androidx.appcompat.view.menu.b;

public final class c implements Runnable {
    public final /* synthetic */ b.d P;
    public final /* synthetic */ MenuItem Q;
    public final /* synthetic */ f R;
    public final /* synthetic */ b.c S;

    public c(b.c cVar, b.d dVar, h hVar, f fVar) {
        this.S = cVar;
        this.P = dVar;
        this.Q = hVar;
        this.R = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.d dVar = this.P;
        if (dVar != null) {
            b.this.p0 = true;
            dVar.b.c(false);
            b.this.p0 = false;
        }
        if (this.Q.isEnabled() && this.Q.hasSubMenu()) {
            this.R.q(this.Q, null, 4);
        }
    }
}