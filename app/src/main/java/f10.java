package defpackage;

import java.io.InputStream;

/* renamed from: f10  reason: default package */
public abstract class f10 extends InputStream {
    public final InputStream P;
    public int Q;

    public f10(int i, InputStream inputStream) {
        this.P = inputStream;
        this.Q = i;
    }

    public int a() {
        return this.Q;
    }

    public final void d() {
        InputStream inputStream = this.P;
        if (inputStream instanceof fx) {
            ((fx) inputStream).t(true);
        }
    }
}