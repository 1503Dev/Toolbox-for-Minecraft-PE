package defpackage;

import android.os.Handler;
import android.os.Looper;
import defpackage.hs0;
import defpackage.rs0;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: vs0  reason: default package */
public final class vs0 {
    public static final Handler k = new Handler(Looper.getMainLooper());
    public static HashMap l = new HashMap();
    public final UUID a = UUID.randomUUID();
    public final hs0.a b;
    public final int c;
    public final el0 d;
    public final nw e;
    public final String f;
    public rs0.a g;
    public rs0.b h;
    public long i;
    public boolean j;

    public vs0(hs0.a aVar, int i, String str, el0 el0Var, nw nwVar) {
        this.b = aVar;
        this.c = i;
        this.f = str;
        this.d = el0Var;
        this.e = nwVar;
    }

    public final boolean a() {
        if (this.c == 1) {
            return this.i != 0 && System.currentTimeMillis() >= this.i + ((long) (this.b.f * 1000.0f));
        }
        return true;
    }

    public final boolean b() {
        return this.c == 2 && this.i != 0 && System.currentTimeMillis() >= this.i + ((long) (this.b.g * 1000.0f));
    }
}