package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.savedstate.a;
import defpackage.hn0;
import java.util.Map;

public final class b {
    public final kn0 a;
    public final a b = new a();

    public b(kn0 kn0Var) {
        this.a = kn0Var;
    }

    public final void a(Bundle bundle) {
        e k = this.a.k();
        if (k.b == c.EnumC0007c.INITIALIZED) {
            k.a(new Recreator(this.a));
            final a aVar = this.b;
            if (!aVar.c) {
                if (bundle != null) {
                    aVar.b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                k.a(new d() { // from class: androidx.savedstate.SavedStateRegistry$1
                    @Override // androidx.lifecycle.d
                    public final void d(b10 b10Var, c.b bVar) {
                        if (bVar == c.b.ON_START || bVar == c.b.ON_STOP) {
                            a.this.getClass();
                        }
                    }
                });
                aVar.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public final void b(Bundle bundle) {
        a aVar = this.b;
        aVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        hn0<String, a.b> hn0Var = aVar.a;
        hn0Var.getClass();
        hn0.d dVar = new hn0.d();
        hn0Var.R.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}