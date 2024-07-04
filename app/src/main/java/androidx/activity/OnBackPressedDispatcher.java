package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.f;
import androidx.lifecycle.c;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque<ub0> b = new ArrayDeque<>();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class LifecycleOnBackPressedCancellable implements d, cc {
        public final c a;
        public final ub0 b;
        public a c;

        public LifecycleOnBackPressedCancellable(c cVar, f.a aVar) {
            this.a = cVar;
            this.b = aVar;
            cVar.a(this);
        }

        @Override // defpackage.cc
        public final void cancel() {
            e eVar = (e) this.a;
            eVar.c("removeObserver");
            eVar.a.h(this);
            this.b.b.remove(this);
            a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }

        @Override // androidx.lifecycle.d
        public final void d(b10 b10Var, c.b bVar) {
            if (bVar == c.b.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                ub0 ub0Var = this.b;
                onBackPressedDispatcher.b.add(ub0Var);
                a aVar = new a(ub0Var);
                ub0Var.b.add(aVar);
                this.c = aVar;
            } else if (bVar == c.b.ON_STOP) {
                a aVar2 = this.c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (bVar == c.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements cc {
        public final ub0 a;

        public a(ub0 ub0Var) {
            this.a = ub0Var;
        }

        @Override // defpackage.cc
        public final void cancel() {
            OnBackPressedDispatcher.this.b.remove(this.a);
            this.a.b.remove(this);
        }
    }

    public OnBackPressedDispatcher(ComponentActivity.a aVar) {
        this.a = aVar;
    }

    public final void a(b10 b10Var, f.a aVar) {
        e k = b10Var.k();
        if (k.b == c.EnumC0007c.DESTROYED) {
            return;
        }
        aVar.b.add(new LifecycleOnBackPressedCancellable(k, aVar));
    }

    public final void b() {
        Iterator<ub0> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext()) {
            ub0 next = descendingIterator.next();
            if (next.a) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}