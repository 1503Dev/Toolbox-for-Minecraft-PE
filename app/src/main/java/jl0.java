package defpackage;

import android.graphics.Typeface;
import defpackage.il0;

/* renamed from: jl0  reason: default package */
public final class jl0 implements Runnable {
    public final /* synthetic */ Typeface P;
    public final /* synthetic */ il0.c Q;

    public jl0(il0.c cVar, Typeface typeface) {
        this.Q = cVar;
        this.P = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Q.d(this.P);
    }
}