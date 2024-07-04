package defpackage;

import java.util.concurrent.CompletableFuture;

/* renamed from: oe  reason: default package */
public final class oe extends CompletableFuture<Object> {
    public final /* synthetic */ pb P;

    public oe(mb0 mb0Var) {
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