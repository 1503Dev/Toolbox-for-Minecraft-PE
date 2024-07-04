package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.WindowManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* renamed from: zw4  reason: default package */
public final class zw4 implements kg4, o55 {
    public static qa1 P = new qa1();
    public static final long[] Q = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};
    public static final ok3 R = new ok3();
    public static final ir3 S = new ir3(0);
    public static final /* synthetic */ zw4 T = new zw4();
    public static final /* synthetic */ zw4 U = new zw4();

    public static boolean A(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                gw.j(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                gw.j(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                gw.j(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static hx4 B(dz4 dz4Var, Class cls, ky4 ky4Var, Executor executor) {
        hx4 hx4Var = new hx4(dz4Var, cls, ky4Var);
        dz4Var.b(hx4Var, s45.k(executor, hx4Var));
        return hx4Var;
    }

    public static zy4 C(Object obj) {
        return obj == null ? zy4.Q : new zy4(obj);
    }

    public static rz4 D(jy4 jy4Var, Executor executor) {
        rz4 rz4Var = new rz4(jy4Var);
        executor.execute(rz4Var);
        return rz4Var;
    }

    public static by4 E(dz4 dz4Var, at4 at4Var, Executor executor) {
        int i = cy4.Y;
        at4Var.getClass();
        by4 by4Var = new by4(dz4Var, at4Var);
        dz4Var.b(by4Var, s45.k(executor, by4Var));
        return by4Var;
    }

    public static ay4 F(dz4 dz4Var, ky4 ky4Var, Executor executor) {
        int i = cy4.Y;
        executor.getClass();
        ay4 ay4Var = new ay4(dz4Var, ky4Var);
        dz4Var.b(ay4Var, s45.k(executor, ay4Var));
        return ay4Var;
    }

    public static dz4 G(dz4 dz4Var, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (dz4Var.isDone()) {
            return dz4Var;
        }
        oz4 oz4Var = new oz4(dz4Var);
        mz4 mz4Var = new mz4(oz4Var);
        oz4Var.X = scheduledExecutorService.schedule(mz4Var, j, timeUnit);
        dz4Var.b(mz4Var, py4.P);
        return oz4Var;
    }

    public static Object H(Future future) {
        if (future.isDone()) {
            return vx.v(future);
        }
        throw new IllegalStateException(pt4.a("Future was expected to be done: %s", future));
    }

    public static Object I(dz4 dz4Var) {
        try {
            return vx.v(dz4Var);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof Error) {
                throw new qy4((Error) cause);
            }
            throw new sz4(cause);
        }
    }

    public static void J(dz4 dz4Var, wy4 wy4Var, Executor executor) {
        wy4Var.getClass();
        dz4Var.b(new ow2(3, dz4Var, wy4Var), executor);
    }

    public static void a(Context context) {
        qa1 qa1Var = P;
        Context applicationContext = context.getApplicationContext();
        vj.a("Application Context cannot be null", applicationContext);
        if (!qa1Var.a) {
            qa1Var.a = true;
            jc1 a = jc1.a();
            a.c.getClass();
            da2 da2Var = new da2();
            dt4 dt4Var = a.b;
            Handler handler = new Handler();
            dt4Var.getClass();
            a.d = new yb1(handler, applicationContext, da2Var, a);
            ra1 ra1Var = ra1.S;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(ra1Var);
            }
            WindowManager windowManager = sa1.a;
            sa1.c = applicationContext.getResources().getDisplayMetrics().density;
            sa1.a = (WindowManager) applicationContext.getSystemService("window");
            zb1.b.a = applicationContext.getApplicationContext();
        }
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void d(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        jArr2[0] = j & 144115188075855871L;
        jArr2[1] = ((j >>> 57) ^ (j2 << 7)) & 144115188075855871L;
        jArr2[2] = ((j2 >>> 50) ^ (j3 << 14)) & 144115188075855871L;
        jArr2[3] = ((j3 >>> 43) ^ (j4 << 21)) & 144115188075855871L;
        jArr2[4] = (j4 >>> 36) ^ (j5 << 28);
    }

    public static void f(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        d(jArr, jArr4);
        d(jArr2, jArr5);
        long[] jArr6 = new long[26];
        g(jArr4[0], jArr5[0], jArr6, 0);
        g(jArr4[1], jArr5[1], jArr6, 2);
        g(jArr4[2], jArr5[2], jArr6, 4);
        g(jArr4[3], jArr5[3], jArr6, 6);
        g(jArr4[4], jArr5[4], jArr6, 8);
        long j = jArr4[0];
        long j2 = j ^ jArr4[1];
        long j3 = jArr5[0];
        long j4 = j3 ^ jArr5[1];
        long j5 = jArr4[2];
        long j6 = j ^ j5;
        long j7 = jArr5[2];
        long j8 = j3 ^ j7;
        long j9 = jArr4[4];
        long j10 = j5 ^ j9;
        long j11 = jArr5[4];
        long j12 = j7 ^ j11;
        long j13 = jArr4[3];
        long j14 = j13 ^ j9;
        long j15 = jArr5[3];
        long j16 = j15 ^ j11;
        g(j6 ^ j13, j8 ^ j15, jArr6, 18);
        g(j10 ^ jArr4[1], j12 ^ jArr5[1], jArr6, 20);
        long j17 = j2 ^ j14;
        long j18 = j4 ^ j16;
        g(j17, j18, jArr6, 22);
        g(j17 ^ jArr4[2], jArr5[2] ^ j18, jArr6, 24);
        g(j2, j4, jArr6, 10);
        g(j6, j8, jArr6, 12);
        g(j10, j12, jArr6, 14);
        g(j14, j16, jArr6, 16);
        long j19 = jArr6[0];
        jArr3[0] = j19;
        long j20 = jArr6[9];
        jArr3[9] = j20;
        long j21 = jArr6[0];
        long j22 = jArr6[1] ^ j21;
        long j23 = j22 ^ jArr6[2];
        long j24 = j23 ^ jArr6[10];
        jArr3[1] = j24;
        long j25 = jArr6[3] ^ jArr6[4];
        long j26 = j23 ^ (j25 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j26;
        long j27 = j22 ^ j25;
        long j28 = jArr6[5] ^ jArr6[6];
        long j29 = jArr6[8];
        long j30 = (j27 ^ j28) ^ j29;
        long j31 = jArr6[13] ^ jArr6[14];
        long j32 = jArr6[18];
        long j33 = jArr6[22];
        long j34 = jArr6[24];
        long j35 = (j30 ^ j31) ^ ((j32 ^ j33) ^ j34);
        jArr3[3] = j35;
        long j36 = jArr6[7] ^ j29;
        long j37 = jArr6[9];
        long j38 = j36 ^ j37;
        long j39 = j38 ^ jArr6[17];
        jArr3[8] = j39;
        long j40 = (j38 ^ j28) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j40;
        long j41 = jArr6[19] ^ jArr6[20];
        long j42 = jArr6[25];
        long j43 = jArr6[23];
        long j44 = j41 ^ (j42 ^ j34);
        long j45 = (j44 ^ (j32 ^ j43)) ^ (j40 ^ j24);
        jArr3[4] = j45;
        long j46 = jArr6[21];
        long j47 = (j44 ^ (j26 ^ j39)) ^ (j46 ^ j33);
        jArr3[5] = j47;
        long j48 = (((((j21 ^ j30) ^ j37) ^ j31) ^ j46) ^ j43) ^ j42;
        jArr3[6] = j48;
        jArr3[0] = j19 ^ (j24 << 57);
        jArr3[1] = (j24 >>> 7) ^ (j26 << 50);
        jArr3[2] = (j26 >>> 14) ^ (j35 << 43);
        jArr3[3] = (j35 >>> 21) ^ (j45 << 36);
        jArr3[4] = (j45 >>> 28) ^ (j47 << 29);
        jArr3[5] = (j47 >>> 35) ^ (j48 << 22);
        jArr3[6] = (j48 >>> 42) ^ (j40 << 15);
        jArr3[7] = (j40 >>> 49) ^ (j39 << 8);
        jArr3[8] = (j39 >>> 56) ^ (j20 << 1);
        jArr3[9] = j20 >>> 63;
    }

    public static void g(long j, long j2, long[] jArr, int i) {
        long j3 = j2 << 1;
        long j4 = j3 ^ j2;
        long j5 = j3 << 1;
        long j6 = j4 << 1;
        long[] jArr2 = {0, j2, j3, j4, j5, j5 ^ j2, j6, j6 ^ j2};
        long j7 = jArr2[((int) j) & 7];
        long j8 = 0;
        int i2 = 48;
        do {
            int i3 = (int) (j >>> i2);
            long j9 = (jArr2[(i3 >>> 6) & 7] << 6) ^ (jArr2[i3 & 7] ^ (jArr2[(i3 >>> 3) & 7] << 3));
            j7 ^= j9 << i2;
            j8 ^= j9 >>> (-i2);
            i2 -= 9;
        } while (i2 > 0);
        jArr[i] = 144115188075855871L & j7;
        jArr[i + 1] = (((((j & 72198606942111744L) & ((j2 << 7) >> 63)) >>> 8) ^ j8) << 7) ^ (j7 >>> 57);
    }

    public static void h(long[] jArr, long[] jArr2) {
        for (int i = 0; i < 4; i++) {
            ar.f(i << 1, jArr[i], jArr2);
        }
        jArr2[8] = ar.d((int) jArr[4]);
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[10];
        f(jArr, jArr2, jArr4);
        j(jArr4, jArr3);
    }

    public static void j(long[] jArr, long[] jArr2) {
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = jArr[2];
        long j4 = jArr[3];
        long j5 = jArr[4];
        long j6 = jArr[5];
        long j7 = jArr[6];
        long j8 = jArr[7];
        long j9 = jArr[8];
        long j10 = j5 ^ ((((j9 >>> 27) ^ (j9 >>> 22)) ^ (j9 >>> 20)) ^ (j9 >>> 15));
        long j11 = j ^ ((((j6 << 37) ^ (j6 << 42)) ^ (j6 << 44)) ^ (j6 << 49));
        long j12 = (j2 ^ ((((j7 << 37) ^ (j7 << 42)) ^ (j7 << 44)) ^ (j7 << 49))) ^ ((((j6 >>> 27) ^ (j6 >>> 22)) ^ (j6 >>> 20)) ^ (j6 >>> 15));
        long j13 = j10 >>> 27;
        jArr2[0] = (((j11 ^ j13) ^ (j13 << 5)) ^ (j13 << 7)) ^ (j13 << 12);
        jArr2[1] = j12;
        jArr2[2] = (j3 ^ ((((j8 << 37) ^ (j8 << 42)) ^ (j8 << 44)) ^ (j8 << 49))) ^ ((((j7 >>> 27) ^ (j7 >>> 22)) ^ (j7 >>> 20)) ^ (j7 >>> 15));
        jArr2[3] = (j4 ^ ((((j9 << 37) ^ (j9 << 42)) ^ (j9 << 44)) ^ (j9 << 49))) ^ ((((j8 >>> 27) ^ (j8 >>> 22)) ^ (j8 >>> 20)) ^ (j8 >>> 15));
        jArr2[4] = 134217727 & j10;
    }

    public static void k(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        h(jArr, jArr3);
        j(jArr3, jArr2);
    }

    public static void l(int i, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[9];
        h(jArr, jArr3);
        while (true) {
            j(jArr3, jArr2);
            i--;
            if (i <= 0) {
                return;
            }
            h(jArr2, jArr3);
        }
    }

    public static int m(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    public static /* synthetic */ String n(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "UNRECOGNIZED" : "DHKEM_P521_HKDF_SHA512" : "DHKEM_P384_HKDF_SHA384" : "DHKEM_P256_HKDF_SHA256" : "DHKEM_X25519_HKDF_SHA256" : "KEM_UNKNOWN";
    }

    public static z45 o(na5 na5Var) {
        if (na5Var.z() == 3) {
            return new x45(16);
        }
        if (na5Var.z() == 4) {
            return new x45(32);
        }
        if (na5Var.z() == 5) {
            return new y45();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static void p(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public static File q(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(u(file, str), str2);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Collection, java.util.Set] */
    public static ww4 r(Set set, ht4 ht4Var) {
        if (set instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) set;
            if (sortedSet instanceof ww4) {
                ww4 ww4Var = (ww4) sortedSet;
                ht4 ht4Var2 = ww4Var.Q;
                ht4Var2.getClass();
                return new xw4((SortedSet) ww4Var.P, new it4(Arrays.asList(ht4Var2, ht4Var)));
            }
            sortedSet.getClass();
            return new xw4(sortedSet, ht4Var);
        } else if (set instanceof ww4) {
            ww4 ww4Var2 = (ww4) set;
            ht4 ht4Var3 = ww4Var2.Q;
            ht4Var3.getClass();
            return new ww4(ww4Var2.P, new it4(Arrays.asList(ht4Var3, ht4Var)));
        } else {
            set.getClass();
            return new ww4(set, ht4Var);
        }
    }

    public static xy4 s(List list) {
        lv4 lv4Var = nv4.Q;
        list.getClass();
        return new xy4(true, nv4.t(list));
    }

    public static d55 t(na5 na5Var) {
        if (na5Var.B() == 3) {
            return new ij2(3, new bm1("HmacSha256"));
        }
        if (na5Var.B() == 4) {
            return k55.b(1);
        }
        if (na5Var.B() == 5) {
            return k55.b(2);
        }
        if (na5Var.B() == 6) {
            return k55.b(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static File u(File file, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        p(file2, false);
        return file2;
    }

    public static bm1 v(na5 na5Var) {
        if (na5Var.A() == 3) {
            return new bm1("HmacSha256");
        }
        if (na5Var.A() == 4) {
            return new bm1("HmacSha384");
        }
        if (na5Var.A() == 5) {
            return new bm1("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static boolean w(Set set, @CheckForNull Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean x(File file) {
        boolean z;
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                z = true;
                for (int i = 0; i < listFiles.length; i++) {
                    File file2 = listFiles[i];
                    z = file2 != null && x(file2) && z;
                }
            } else {
                z = true;
            }
            return file.delete() && z;
        }
        return true;
    }

    public static boolean y(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof jw4) {
            collection = ((jw4) collection).a();
        }
        boolean z = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            for (Object obj : collection) {
                z |= set.remove(obj);
            }
            return z;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static ix4 z(dz4 dz4Var, Class cls, at4 at4Var, Executor executor) {
        ix4 ix4Var = new ix4(dz4Var, cls, at4Var);
        dz4Var.b(ix4Var, s45.k(executor, ix4Var));
        return ix4Var;
    }

    @Override // defpackage.o55
    public ja c(r65 r65Var) {
        s25 s25Var;
        f65 f65Var = u25.a;
        if (((p65) r65Var).a.equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                h95 z = h95.z(((p65) r65Var).c, ud5.c);
                if (z.w() == 0) {
                    int o = z.A().o();
                    if (o != 16 && o != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(o)));
                    }
                    Integer valueOf = Integer.valueOf(o);
                    int i = ((p65) r65Var).e;
                    int b = cm0.b(i);
                    if (b != 1) {
                        if (b != 2) {
                            if (b != 3) {
                                if (b != 4) {
                                    int a = e1.a(i);
                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + a);
                                }
                            } else {
                                s25Var = s25.d;
                            }
                        }
                        s25Var = s25.c;
                    } else {
                        s25Var = s25.b;
                    }
                    if (valueOf != null) {
                        t25 t25Var = new t25(valueOf.intValue(), s25Var);
                        n25 n25Var = new n25();
                        n25Var.a = t25Var;
                        n25Var.b = ee4.d(z.A().g());
                        n25Var.c = ((p65) r65Var).f;
                        return n25Var.a();
                    }
                    throw new GeneralSecurityException("Key size is not set");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (te5 unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public void mo5e(Object obj) {
        ((zr2) obj).b();
    }
}