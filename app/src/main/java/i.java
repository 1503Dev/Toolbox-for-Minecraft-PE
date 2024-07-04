package defpackage;

import java.io.IOException;

/* renamed from: i  reason: default package */
public final class i extends IOException {
    public Throwable P;

    public i(String str) {
        super(str);
    }

    public i(String str, IllegalArgumentException illegalArgumentException) {
        super(str);
        this.P = illegalArgumentException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.P;
    }
}