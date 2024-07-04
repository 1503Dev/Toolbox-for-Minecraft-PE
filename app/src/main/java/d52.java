package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.PushbackInputStream;

/* renamed from: d52  reason: default package */
public final class d52 extends PushbackInputStream {
    public final /* synthetic */ e52 P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d52(e52 e52Var, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        super(autoCloseInputStream, 1);
        this.P = e52Var;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        g52.a(this.P.c);
        super.close();
    }
}