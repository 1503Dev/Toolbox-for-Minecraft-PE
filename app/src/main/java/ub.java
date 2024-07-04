package defpackage;

import android.graphics.Typeface;
import defpackage.il0;
import defpackage.w11;

/* renamed from: ub  reason: default package */
public final class ub implements Runnable {
    public final /* synthetic */ ar P;
    public final /* synthetic */ Typeface Q;

    public ub(ar arVar, Typeface typeface) {
        this.P = arVar;
        this.Q = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ar arVar = this.P;
        Typeface typeface = this.Q;
        il0.c cVar = ((w11.a) arVar).W;
        if (cVar != null) {
            cVar.d(typeface);
        }
    }
}