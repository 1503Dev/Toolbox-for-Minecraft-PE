package defpackage;

import java.util.concurrent.CompletableFuture;

/* renamed from: re  reason: default package */
public final class re extends CompletableFuture<ol0<Object>> {
    public final /* synthetic */ pb P;

    public re(mb0 mb0Var) {
        this.P = mb0Var;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.P.cancel();
        }
        return super.cancel(z);
    }
}