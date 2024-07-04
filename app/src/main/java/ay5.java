package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: ay5  reason: default package */
public final class ay5<TResult> extends yv0<TResult> {
    public final Object a = new Object();
    public final gt5<TResult> b = new gt5<>();
    @GuardedBy("mLock")
    public boolean c;
    public volatile boolean d;
    @GuardedBy("mLock")
    public TResult e;
    @GuardedBy("mLock")
    public Exception f;

    @Override // defpackage.yv0
    public final void a(iv5 iv5Var, ri4 ri4Var) {
        this.b.a(new ck5(iv5Var, ri4Var));
        p();
    }

    @Override // defpackage.yv0
    public final void b(yb0 yb0Var) {
        this.b.a(new sl5(cw0.a, yb0Var));
        p();
    }

    @Override // defpackage.yv0
    public final void c(Executor executor, yb0 yb0Var) {
        this.b.a(new sl5(executor, yb0Var));
        p();
    }

    @Override // defpackage.yv0
    public final ay5 d(Executor executor, bc0 bc0Var) {
        this.b.a(new xn5(executor, bc0Var));
        p();
        return this;
    }

    @Override // defpackage.yv0
    public final ay5 e(iv5 iv5Var, ri4 ri4Var) {
        this.b.a(new cp5(iv5Var, ri4Var));
        p();
        return this;
    }

    @Override // defpackage.yv0
    public final <TContinuationResult> yv0<TContinuationResult> f(Executor executor, mg<TResult, TContinuationResult> mgVar) {
        ay5 ay5Var = new ay5();
        this.b.a(new bg3(executor, mgVar, ay5Var));
        p();
        return ay5Var;
    }

    @Override // defpackage.yv0
    public final yv0 g(a53 a53Var) {
        mr5 mr5Var = cw0.a;
        ay5 ay5Var = new ay5();
        this.b.a(new ri4(mr5Var, a53Var, ay5Var));
        p();
        return ay5Var;
    }

    @Override // defpackage.yv0
    public final Exception h() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    @Override // defpackage.yv0
    public final TResult i() {
        TResult tresult;
        synchronized (this.a) {
            uf0.h("Task is not yet complete", this.c);
            if (!this.d) {
                Exception exc = this.f;
                if (exc == null) {
                    tresult = this.e;
                } else {
                    throw new qm0(exc);
                }
            } else {
                throw new CancellationException("Task is already canceled.");
            }
        }
        return tresult;
    }

    @Override // defpackage.yv0
    public final boolean j() {
        return this.d;
    }

    @Override // defpackage.yv0
    public final boolean k() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.yv0
    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    public final void m(Exception exc) {
        if (exc == null) {
            throw new NullPointerException("Exception must not be null");
        }
        synchronized (this.a) {
            o();
            this.c = true;
            this.f = exc;
        }
        this.b.b(this);
    }

    public final void n(TResult tresult) {
        synchronized (this.a) {
            o();
            this.c = true;
            this.e = tresult;
        }
        this.b.b(this);
    }

    @GuardedBy("mLock")
    public final void o() {
        String str;
        String str2;
        if (this.c) {
            int i = cn.P;
            if (k()) {
                Exception h = h();
                if (h != null) {
                    str = "failure";
                } else if (l()) {
                    str = "result ".concat(String.valueOf(i()));
                } else if (this.d) {
                    str = "cancellation";
                } else {
                    str = "unknown issue";
                }
                if (str.length() != 0) {
                    str2 = "Complete with: ".concat(str);
                } else {
                    str2 = new String("Complete with: ");
                }
                throw new cn(str2, h);
            }
            throw new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
    }

    public final void p() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }
}