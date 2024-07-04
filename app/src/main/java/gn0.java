package defpackage;

import java.io.File;

/* renamed from: gn0  reason: default package */
public final class gn0 implements wu0 {
    public pj P;
    public boolean Q;

    public final void a(File file) {
        throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
    }

    @Override // defpackage.wu0, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        throw null;
    }

    public final void d() {
        getDatabaseName();
        throw null;
    }

    @Override // defpackage.wu0
    public final String getDatabaseName() {
        throw null;
    }

    @Override // defpackage.wu0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        throw null;
    }

    @Override // defpackage.wu0
    public final synchronized vu0 x() {
        if (!this.Q) {
            d();
            this.Q = true;
        }
        throw null;
    }
}