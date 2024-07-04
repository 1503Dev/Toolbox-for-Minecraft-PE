package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qr0  reason: default package */
public abstract class qr0 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final bm0 b;
    public volatile is c;

    public qr0(bm0 bm0Var) {
        this.b = bm0Var;
    }

    public final is a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                String b = b();
                bm0 bm0Var = this.b;
                bm0Var.a();
                bm0Var.b();
                this.c = new is(((es) bm0Var.c.x()).P.compileStatement(b));
            }
            return this.c;
        }
        String b2 = b();
        bm0 bm0Var2 = this.b;
        bm0Var2.a();
        bm0Var2.b();
        return new is(((es) bm0Var2.c.x()).P.compileStatement(b2));
    }

    public abstract String b();

    public final void c(is isVar) {
        if (isVar == this.c) {
            this.a.set(false);
        }
    }
}