package defpackage;

import java.util.concurrent.CompletableFuture;

/* renamed from: pe  reason: default package */
public final class pe implements sb<Object> {
    public final /* synthetic */ CompletableFuture a;

    public pe(oe oeVar) {
        this.a = oeVar;
    }

    @Override // defpackage.sb
    public final void a(pb<Object> pbVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // defpackage.sb
    public final void b(pb<Object> pbVar, ol0<Object> ol0Var) {
        boolean z;
        int i = ol0Var.a.R;
        if (i >= 200 && i < 300) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.a.complete(ol0Var.b);
        } else {
            this.a.completeExceptionally(new lv(ol0Var));
        }
    }
}