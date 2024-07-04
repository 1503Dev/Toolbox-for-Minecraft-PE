package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: nz4  reason: default package */
public final class nz4 extends TimeoutException {
    public /* synthetic */ nz4(String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}