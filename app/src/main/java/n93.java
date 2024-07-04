package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: n93  reason: default package */
public final class n93 extends h83 {
    public final pe2 i;
    public final Runnable j;
    public final Executor k;

    public n93(ba3 ba3Var, pe2 pe2Var, Runnable runnable, Executor executor) {
        super(ba3Var);
        this.i = pe2Var;
        this.j = runnable;
        this.k = executor;
    }

    @Override // defpackage.ea3
    public final void a() {
        this.k.execute(new sn5(2, this, new m93(new AtomicReference(this.j))));
    }

    @Override // defpackage.h83
    public final int b() {
        return 0;
    }

    @Override // defpackage.h83
    public final View c() {
        return null;
    }

    @Override // defpackage.h83
    public final cs3 d() {
        return null;
    }

    @Override // defpackage.h83
    public final zh4 e() {
        return null;
    }

    @Override // defpackage.h83
    public final zh4 f() {
        return null;
    }

    @Override // defpackage.h83
    public final void g() {
    }

    @Override // defpackage.h83
    public final void h(FrameLayout frameLayout, zr5 zr5Var) {
    }
}