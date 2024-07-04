package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* renamed from: dt0  reason: default package */
public interface dt0 extends Closeable, Flushable {
    cx0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void e(za zaVar, long j);

    void flush();
}