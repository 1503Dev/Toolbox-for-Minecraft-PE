package defpackage;

import java.io.IOException;

/* renamed from: du0  reason: default package */
public final class du0 extends IOException {
    public final int P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public du0(int i) {
        super(r0.toString());
        StringBuilder b = e5.b("stream was reset: ");
        b.append(bp.c(i));
        this.P = i;
    }
}