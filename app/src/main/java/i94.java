package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: i94  reason: default package */
public final class i94 {
    public final dx3 a;
    public final a54 b;
    public final o74 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public boolean i;

    public i94(Looper looper, dx3 dx3Var, o74 o74Var) {
        this(new CopyOnWriteArraySet(), looper, dx3Var, o74Var);
    }

    public i94(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, dx3 dx3Var, o74 o74Var) {
        this.a = dx3Var;
        this.d = copyOnWriteArraySet;
        this.c = o74Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.b = dx3Var.b(looper, new Handler.Callback() { // from class: v54
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                i94 i94Var = i94.this;
                Iterator it = i94Var.d.iterator();
                while (it.hasNext()) {
                    l84 l84Var = (l84) it.next();
                    o74 o74Var2 = i94Var.c;
                    if (!l84Var.d && l84Var.c) {
                        hp1 b = l84Var.b.b();
                        l84Var.b = new dn1();
                        l84Var.c = false;
                        o74Var2.f(l84Var.a, b);
                    }
                    if (((dl4) i94Var.b).a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.i = true;
    }

    public final void a() {
        d();
        if (this.f.isEmpty()) {
            return;
        }
        if (!((dl4) this.b).a.hasMessages(0)) {
            dl4 dl4Var = (dl4) this.b;
            dl4Var.getClass();
            mk4 d = dl4.d();
            Message obtainMessage = dl4Var.a.obtainMessage(0);
            d.a = obtainMessage;
            Handler handler = dl4Var.a;
            obtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(obtainMessage);
            d.a = null;
            ArrayList arrayList = dl4.b;
            synchronized (arrayList) {
                if (arrayList.size() < 50) {
                    arrayList.add(d);
                }
            }
        }
        boolean z = !this.e.isEmpty();
        this.e.addAll(this.f);
        this.f.clear();
        if (!z) {
            while (!this.e.isEmpty()) {
                ((Runnable) this.e.peekFirst()).run();
                this.e.removeFirst();
            }
        }
    }

    public final void b(final int i, final v64 v64Var) {
        d();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.d);
        this.f.add(new Runnable() { // from class: m64
            @Override // java.lang.Runnable
            public final void run() {
                CopyOnWriteArraySet copyOnWriteArraySet2 = copyOnWriteArraySet;
                int i2 = i;
                v64 v64Var2 = v64Var;
                Iterator it = copyOnWriteArraySet2.iterator();
                while (it.hasNext()) {
                    l84 l84Var = (l84) it.next();
                    if (!l84Var.d) {
                        if (i2 != -1) {
                            l84Var.b.a(i2);
                        }
                        l84Var.c = true;
                        v64Var2.mo5e(l84Var.a);
                    }
                }
            }
        });
    }

    public final void c() {
        d();
        synchronized (this.g) {
            this.h = true;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            l84 l84Var = (l84) it.next();
            o74 o74Var = this.c;
            l84Var.d = true;
            if (l84Var.c) {
                l84Var.c = false;
                o74Var.f(l84Var.a, l84Var.b.b());
            }
        }
        this.d.clear();
    }

    public final void d() {
        boolean z;
        if (!this.i) {
            return;
        }
        if (Thread.currentThread() == ((dl4) this.b).a.getLooper().getThread()) {
            z = true;
        } else {
            z = false;
        }
        tv2.I(z);
    }
}