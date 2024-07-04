package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;

/* renamed from: ou5  reason: default package */
public final class ou5 implements aw5 {
    public final pk1 a;
    public lk1 b;
    public p16 c;

    public ou5(pk1 pk1Var) {
        this.a = pk1Var;
    }

    public final long a() {
        p16 p16Var = this.c;
        if (p16Var != null) {
            return p16Var.d;
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r6.d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
        if (r6.d != r11) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005a, code lost:
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(fv4 fv4Var, Uri uri, Map map, long j, long j2, nk1 nk1Var) {
        p16 p16Var = new p16(fv4Var, j, j2);
        this.c = p16Var;
        if (this.b != null) {
            return;
        }
        lk1[] a = this.a.a(uri, map);
        int length = a.length;
        int i = 0;
        boolean z = true;
        if (length == 1) {
            this.b = a[0];
        } else {
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                lk1 lk1Var = a[i2];
                try {
                } catch (EOFException unused) {
                    if (this.b == null) {
                    }
                } catch (Throwable th) {
                    if (this.b == null && p16Var.d != j) {
                        z = false;
                    }
                    tv2.I(z);
                    p16Var.f = 0;
                    throw th;
                }
                if (lk1Var.a(p16Var)) {
                    this.b = lk1Var;
                    p16Var.f = 0;
                    break;
                }
                if (this.b == null) {
                }
                boolean z2 = true;
                tv2.I(z2);
                p16Var.f = 0;
                i2++;
            }
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int length2 = a.length;
                    if (i >= length2) {
                        break;
                    }
                    sb.append(a[i].getClass().getSimpleName());
                    if (i < length2 - 1) {
                        sb.append(", ");
                    }
                    i++;
                }
                throw new ix5(ij.c("None of the available extractors (", sb.toString(), ") could read the stream."));
            }
        }
        this.b.d(nk1Var);
    }
}