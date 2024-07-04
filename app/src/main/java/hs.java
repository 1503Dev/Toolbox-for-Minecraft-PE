package defpackage;

import android.database.sqlite.SQLiteProgram;
import java.io.Closeable;

/* renamed from: hs  reason: default package */
public class hs implements Closeable {
    public final SQLiteProgram P;

    public hs(SQLiteProgram sQLiteProgram) {
        this.P = sQLiteProgram;
    }

    public final void a(byte[] bArr, int i) {
        this.P.bindBlob(i, bArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.P.close();
    }

    public final void d(double d, int i) {
        this.P.bindDouble(i, d);
    }

    public final void g(long j, int i) {
        this.P.bindLong(i, j);
    }

    public final void t(int i) {
        this.P.bindNull(i);
    }

    public final void y(int i, String str) {
        this.P.bindString(i, str);
    }
}