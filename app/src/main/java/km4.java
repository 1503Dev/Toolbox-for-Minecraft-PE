package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: km4  reason: default package */
public final class km4 {
    public long a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public km4() {
        d(0L);
    }

    public final synchronized long a(long j) {
        if (this.b == -9223372036854775807L) {
            long j2 = this.a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.b = j2 - j;
            notifyAll();
        }
        this.c = j;
        return j + this.b;
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.c;
        if (j2 != -9223372036854775807L) {
            long j3 = (j2 * 90000) / 1000000;
            long j4 = (4294967296L + j3) / 8589934592L;
            long j5 = (((-1) + j4) * 8589934592L) + j;
            j += j4 * 8589934592L;
            if (Math.abs(j5 - j3) < Math.abs(j - j3)) {
                j = j5;
            }
        }
        return a((j * 1000000) / 90000);
    }

    public final synchronized long c() {
        long j = this.a;
        if (j == RecyclerView.FOREVER_NS || j == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void d(long j) {
        this.a = j;
        this.b = j == RecyclerView.FOREVER_NS ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}