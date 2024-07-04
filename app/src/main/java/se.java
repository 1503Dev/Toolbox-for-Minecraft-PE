package defpackage;

import java.util.concurrent.CompletableFuture;

/* renamed from: se  reason: default package */
public final class se implements sb<Object> {
    public final /* synthetic */ CompletableFuture a;

    public se(re reVar) {
        this.a = reVar;
    }

    @Override // defpackage.sb
    public final void a(pb<Object> pbVar, Throwable th) {
        this.a.completeExceptionally(th);
    }

    @Override // defpackage.sb
    public final void b(pb<Object> pbVar, ol0<Object> ol0Var) {
        this.a.complete(ol0Var);
    }
}