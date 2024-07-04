package defpackage;

import android.content.Context;
import android.provider.Settings;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.Future;

/* renamed from: vx  reason: default package */
public class vx implements y41 {
    public static Context a;
    public static Boolean b;
    public static final int[] c = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};
    public static final int[] d = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, 1073741823};
    public static final j93 e = new j93(3);
    public static final vx f = new vx();
    public static final int[] g = {2002, RecyclerView.MAX_SCROLL_DURATION, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static SimpleDateFormat e(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = "M/d/yy";
                    } else {
                        throw new IllegalArgumentException(k6.a("Unknown DateFormat style: ", i));
                    }
                } else {
                    str = "MMM d, yyyy";
                }
            } else {
                str = "MMMM d, yyyy";
            }
        } else {
            str = "EEEE, MMMM d, yyyy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 != 0 && i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str2 = "h:mm a";
                } else {
                    throw new IllegalArgumentException(k6.a("Unknown DateFormat style: ", i2));
                }
            } else {
                str2 = "h:mm:ss a";
            }
        } else {
            str2 = "h:mm:ss a z";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static void f(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        jArr2[0] = j & 562949953421311L;
        jArr2[1] = ((j >>> 49) ^ (j2 << 15)) & 562949953421311L;
        jArr2[2] = ((j2 >>> 34) ^ (j3 << 30)) & 562949953421311L;
        jArr2[3] = (j3 >>> 19) ^ (j4 << 45);
    }

    public static void g(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        f(jArr, jArr4);
        f(jArr2, jArr5);
        h(jArr4[0], jArr5[0], jArr3, 0);
        h(jArr4[1], jArr5[1], jArr3, 1);
        h(jArr4[2], jArr5[2], jArr3, 2);
        h(jArr4[3], jArr5[3], jArr3, 3);
        int i = 5;
        while (i > 0) {
            int i2 = i - 1;
            jArr3[i] = jArr3[i] ^ jArr3[i2];
            i = i2;
        }
        h(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        h(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i3 = 7; i3 > 1; i3--) {
            jArr3[i3] = jArr3[i3] ^ jArr3[i3 - 2];
        }
        long j = jArr4[0] ^ jArr4[2];
        long j2 = jArr4[1] ^ jArr4[3];
        long j3 = jArr5[0] ^ jArr5[2];
        long j4 = jArr5[1] ^ jArr5[3];
        h(j ^ j2, j3 ^ j4, jArr3, 3);
        long[] jArr6 = new long[3];
        h(j, j3, jArr6, 0);
        h(j2, j4, jArr6, 1);
        long j5 = jArr6[0];
        long j6 = jArr6[1];
        long j7 = jArr6[2];
        long j8 = jArr3[2] ^ j5;
        jArr3[2] = j8;
        long j9 = jArr3[3] ^ (j5 ^ j6);
        jArr3[3] = j9;
        long j10 = jArr3[4] ^ (j6 ^ j7);
        jArr3[4] = j10;
        long j11 = jArr3[5] ^ j7;
        jArr3[5] = j11;
        long j12 = jArr3[0];
        long j13 = jArr3[1];
        long j14 = jArr3[6];
        long j15 = jArr3[7];
        jArr3[0] = j12 ^ (j13 << 49);
        jArr3[1] = (j13 >>> 15) ^ (j8 << 34);
        jArr3[2] = (j8 >>> 30) ^ (j9 << 19);
        jArr3[3] = ((j9 >>> 45) ^ (j10 << 4)) ^ (j11 << 53);
        jArr3[4] = ((j10 >>> 60) ^ (j14 << 38)) ^ (j11 >>> 11);
        jArr3[5] = (j14 >>> 26) ^ (j15 << 23);
        jArr3[6] = j15 >>> 41;
        jArr3[7] = 0;
    }

    public static void h(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        int i2 = (int) j;
        long j7 = (jArr2[(i2 >>> 3) & 7] << 3) ^ jArr2[i2 & 7];
        long j8 = 0;
        int i3 = 36;
        do {
            int i4 = (int) (j >>> i3);
            long j9 = (jArr2[(i4 >>> 12) & 7] << 12) ^ (((jArr2[i4 & 7] ^ (jArr2[(i4 >>> 3) & 7] << 3)) ^ (jArr2[(i4 >>> 6) & 7] << 6)) ^ (jArr2[(i4 >>> 9) & 7] << 9));
            j7 ^= j9 << i3;
            j8 ^= j9 >>> (-i3);
            i3 -= 15;
        } while (i3 > 0);
        jArr[i] = jArr[i] ^ (562949953421311L & j7);
        int i5 = i + 1;
        jArr[i5] = jArr[i5] ^ ((j7 >>> 49) ^ (j8 << 15));
    }

    public static void i(long[] jArr, long[] jArr2) {
        ar.f(0, jArr[0], jArr2);
        ar.f(2, jArr[1], jArr2);
        ar.f(4, jArr[2], jArr2);
        jArr2[6] = jArr[3] & 1;
    }

    public static synchronized boolean j(Context context) {
        Boolean bool;
        Boolean bool2;
        synchronized (vx.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = a;
            if (context2 != null && (bool2 = b) != null && context2 == applicationContext) {
                return bool2.booleanValue();
            }
            b = null;
            if (!qe0.a()) {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    bool = Boolean.FALSE;
                }
                a = applicationContext;
                return b.booleanValue();
            }
            bool = Boolean.valueOf(q0.c(applicationContext.getPackageManager()));
            b = bool;
            a = applicationContext;
            return b.booleanValue();
        }
    }

    public static void k(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[16];
        z61.D0(iArr, iArr2, iArr4);
        m(iArr4, iArr3);
    }

    public static void l(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        g(jArr, jArr2, jArr4);
        n(jArr4, jArr3);
    }

    public static void m(int[] iArr, int[] iArr2) {
        int i = iArr[7];
        int i2 = i;
        int i3 = 0;
        while (i3 < 8) {
            int i4 = iArr[i3 + 8];
            iArr2[0 + i3] = (i2 >>> 31) | (i4 << 1);
            i3++;
            i2 = i4;
        }
        long j = 19 & 4294967295L;
        long j2 = ((iArr2[0] & 4294967295L) * j) + (iArr[0] & 4294967295L) + 0;
        iArr2[0] = (int) j2;
        long j3 = ((iArr2[1] & 4294967295L) * j) + (iArr[1] & 4294967295L) + (j2 >>> 32);
        iArr2[1] = (int) j3;
        long j4 = ((iArr2[2] & 4294967295L) * j) + (iArr[2] & 4294967295L) + (j3 >>> 32);
        iArr2[2] = (int) j4;
        long j5 = ((iArr2[3] & 4294967295L) * j) + (iArr[3] & 4294967295L) + (j4 >>> 32);
        iArr2[3] = (int) j5;
        long j6 = ((iArr2[4] & 4294967295L) * j) + (iArr[4] & 4294967295L) + (j5 >>> 32);
        iArr2[4] = (int) j6;
        long j7 = ((iArr2[5] & 4294967295L) * j) + (iArr[5] & 4294967295L) + (j6 >>> 32);
        iArr2[5] = (int) j7;
        long j8 = ((iArr2[6] & 4294967295L) * j) + (iArr[6] & 4294967295L) + (j7 >>> 32);
        iArr2[6] = (int) j8;
        long j9 = (j * (iArr2[7] & 4294967295L)) + (4294967295L & iArr[7]) + (j8 >>> 32);
        int i5 = (int) j9;
        iArr2[7] = i5;
        iArr2[7] = z61.u(7, (((i5 >>> 31) - (i >>> 31)) + (((int) (j9 >>> 32)) << 1)) * 19, iArr2) + (i5 & Integer.MAX_VALUE);
        if (z61.Y(iArr2, c)) {
            s(iArr2);
        }
    }

    public static void n(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = j5 ^ (j7 >>> 50);
        long j9 = (j4 ^ ((j7 >>> 1) ^ (j7 << 14))) ^ (j6 >>> 50);
        long j10 = j ^ (j8 << 63);
        long j11 = (j2 ^ (j6 << 63)) ^ ((j8 >>> 1) ^ (j8 << 14));
        long j12 = ((j3 ^ (j7 << 63)) ^ ((j6 >>> 1) ^ (j6 << 14))) ^ (j8 >>> 50);
        long j13 = j9 >>> 1;
        jArr2[0] = (j10 ^ j13) ^ (j13 << 15);
        jArr2[1] = (j13 >>> 49) ^ j11;
        jArr2[2] = j12;
        jArr2[3] = 1 & j9;
    }

    public static void o(int[] iArr, int i) {
        int i2 = iArr[7];
        iArr[7] = z61.u(7, ((i << 1) | (i2 >>> 31)) * 19, iArr) + (i2 & Integer.MAX_VALUE);
        if (z61.Y(iArr, c)) {
            s(iArr);
        }
    }

    public static void p(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        m(iArr3, iArr2);
    }

    public static void q(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        z61.f1(iArr, iArr3);
        while (true) {
            m(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.f1(iArr2, iArr3);
        }
    }

    public static void r(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        i(jArr, jArr3);
        while (true) {
            n(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            i(jArr2, jArr3);
        }
    }

    public static void s(int[] iArr) {
        long j = (iArr[0] & 4294967295L) + 19;
        iArr[0] = (int) j;
        long j2 = j >> 32;
        if (j2 != 0) {
            j2 = z61.b0(7, 1, iArr);
        }
        iArr[7] = (int) (((4294967295L & iArr[7]) - 2147483648L) + j2);
    }

    public static void t(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.o1(iArr, iArr2, iArr3) != 0) {
            long j = (iArr3[0] & 4294967295L) - 19;
            iArr3[0] = (int) j;
            long j2 = j >> 32;
            if (j2 != 0) {
                j2 = z61.z(7, 1, iArr3);
            }
            iArr3[7] = (int) ((4294967295L & iArr3[7]) + 2147483648L + j2);
        }
    }

    public static void u(int[] iArr, int[] iArr2) {
        z61.Y0(8, 0, iArr, iArr2);
        if (z61.Y(iArr2, c)) {
            s(iArr2);
        }
    }

    public static Object v(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static String w(y82 y82Var) {
        String str;
        StringBuilder sb = new StringBuilder(y82Var.m());
        for (int i = 0; i < y82Var.m(); i++) {
            int g2 = y82Var.g(i);
            if (g2 == 34) {
                str = "\\\"";
            } else if (g2 == 39) {
                str = "\\'";
            } else if (g2 != 92) {
                switch (g2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (g2 < 32 || g2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((g2 >>> 6) & 3) + 48));
                            sb.append((char) (((g2 >>> 3) & 7) + 48));
                            g2 = (g2 & 7) + 48;
                        }
                        sb.append((char) g2);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0087, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008c, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0091, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static g16 x(eh4 eh4Var) {
        int i;
        int i2;
        int i3;
        int b2 = eh4Var.b(16);
        int b3 = eh4Var.b(16);
        if (b3 == 65535) {
            b3 = eh4Var.b(24);
            i = 7;
        } else {
            i = 4;
        }
        int i4 = b3 + i;
        if (b2 == 44097) {
            i4 += 2;
        }
        if (eh4Var.b(2) != 3) {
            int b4 = eh4Var.b(10);
            if (eh4Var.i()) {
                eh4Var.g(2);
            }
            if (true == eh4Var.i()) {
            }
            int b5 = eh4Var.b(4);
            if (i2 != 44100) {
            }
            if (i2 == 48000) {
            }
            i3 = 0;
            return new g16(i2, i4, i3);
        }
        do {
            eh4Var.b(2);
        } while (eh4Var.i());
        int b42 = eh4Var.b(10);
        if (eh4Var.i() && eh4Var.b(3) > 0) {
            eh4Var.g(2);
        }
        i2 = true == eh4Var.i() ? 44100 : 48000;
        int b52 = eh4Var.b(4);
        if (i2 != 44100 && b52 == 13) {
            i3 = g[13];
        } else if (i2 == 48000 || b52 >= 14) {
            i3 = 0;
        } else {
            int i5 = g[b52];
            int i6 = b42 % 5;
            if (i6 != 1) {
                if (i6 == 2) {
                    if (b52 != 8) {
                    }
                    i5++;
                    i3 = i5;
                } else if (i6 != 3) {
                    if (i6 == 4) {
                        if (b52 != 3) {
                            if (b52 != 8) {
                            }
                        }
                        i5++;
                    }
                    i3 = i5;
                }
            }
            if (b52 != 3) {
            }
            i5++;
            i3 = i5;
        }
        return new g16(i2, i4, i3);
    }

    public static void y(Context context) {
        boolean z;
        Object obj = rv2.b;
        if (((Boolean) ib2.a.d()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) != 0) {
                    synchronized (rv2.b) {
                        z = rv2.c;
                    }
                    if (!z) {
                        dz4 b2 = new uw2(context).b();
                        sv2.f("Updating ad debug logging enablement.");
                        tv2.x(b2, "AdDebugLogUpdater.updateEnablement");
                    }
                }
            } catch (Exception e2) {
                sv2.h("Fail to determine debug setting.", e2);
            }
        }
    }

    public static void z(int i, kh4 kh4Var) {
        kh4Var.b(7);
        byte[] bArr = kh4Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    @Override // defpackage.y41
    public void b(View view) {
    }

    @Override // defpackage.y41
    public void c() {
    }
}