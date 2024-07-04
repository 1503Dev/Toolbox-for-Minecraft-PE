package defpackage;

import android.app.Activity;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;
import java.util.HashMap;

/* renamed from: ny0  reason: default package */
public final class ny0 implements sv {
    public final Activity a;
    public final a b;
    public final zv c;
    public final uv d;
    public final tv e;
    public final sv f;
    public final HashMap g = new HashMap();
    public az0 h;

    public ny0(Activity activity, ve0 ve0Var, tv tvVar, by0 by0Var, iy0 iy0Var, b bVar) {
        this.a = activity;
        this.c = iy0Var;
        this.f = by0Var;
        this.b = bVar;
        this.e = tvVar;
        this.d = ve0Var;
    }

    @Override // defpackage.sv
    public final void a(String str) {
        Runnable runnable = (Runnable) this.g.get(str);
        if (runnable != null) {
            runnable.run();
        } else {
            this.f.a(str);
        }
    }

    public final void b(String str, Runnable runnable) {
        if (this.g.containsKey(str)) {
            throw new IllegalArgumentException("Action already registered");
        }
        this.g.put(str, runnable);
    }
}