package defpackage;

import java.io.IOException;

/* renamed from: mm0  reason: default package */
public final class mm0 extends RuntimeException {
    public IOException P;
    public IOException Q;

    public mm0(IOException iOException) {
        super(iOException);
        this.P = iOException;
        this.Q = iOException;
    }
}