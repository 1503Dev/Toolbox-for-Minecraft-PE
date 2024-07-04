package defpackage;

import java.io.IOException;

/* renamed from: qz5  reason: default package */
public final class qz5 extends IOException {
    public qz5(Throwable th) {
        super(ho.b("Unexpected ", th.getClass().getSimpleName(), ": ", th.getMessage()), th);
    }
}