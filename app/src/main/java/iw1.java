package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: iw1  reason: default package */
public final class iw1 extends FilterInputStream {
    public final HttpURLConnection P;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public iw1(HttpURLConnection httpURLConnection) {
        super(r0);
        InputStream errorStream;
        try {
            errorStream = httpURLConnection.getInputStream();
        } catch (IOException unused) {
            errorStream = httpURLConnection.getErrorStream();
        }
        this.P = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.P.disconnect();
    }
}