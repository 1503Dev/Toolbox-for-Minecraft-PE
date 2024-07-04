package defpackage;

import android.content.Context;
import android.os.Handler;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: qz0  reason: default package */
public final class qz0 {
    public final Context a;
    public final a b;
    public final nz0 c = new nz0(0, this);
    public final Handler d = new Handler();
    public boolean e = true;
    private final a.InterfaceC0035a f = new a.InterfaceC0035a() { // from class: oz0
        @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
        public final void a() {
            qz0 qz0Var = qz0.this;
            synchronized (qz0Var) {
                if (qz0Var.e) {
                    qz0Var.e = false;
                    qz0Var.d.postDelayed(qz0Var.c, 200L);
                }
            }
        }
    };

    public qz0(Context context, b bVar) {
        this.a = context;
        this.b = bVar;
    }

    public final void a() {
        ((b) this.b).Q(this.f);
    }

    public final void b() {
        ((b) this.b).X(this.f);
    }
}