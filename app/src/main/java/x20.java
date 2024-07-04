package defpackage;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* renamed from: x20  reason: default package */
public final class x20 extends Writer {
    public StringBuilder Q = new StringBuilder(128);
    public final String P = "FragmentManager";

    public final void a() {
        if (this.Q.length() > 0) {
            Log.d(this.P, this.Q.toString());
            StringBuilder sb = this.Q;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.Q.append(c);
            }
        }
    }
}