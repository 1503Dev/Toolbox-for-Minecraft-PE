package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: sg  reason: default package */
public final class sg {
    public static final HashMap e = new HashMap();
    public final File a;
    public final Lock b;
    public final boolean c;
    public FileChannel d;

    public sg(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, k6.b(str, ".lck"));
        this.a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.b = lock;
        this.c = z;
    }

    public final void a() {
        FileChannel fileChannel = this.d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.b.unlock();
    }
}