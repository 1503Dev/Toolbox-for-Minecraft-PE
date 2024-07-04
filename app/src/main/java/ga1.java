package defpackage;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: ga1  reason: default package */
public class ga1 implements hc5, ns5, wg3, i65 {
    @SuppressLint({"StaticFieldLeak"})
    public static Context P = null;
    public static ad1 Q = null;
    public static boolean R = false;
    public static boolean S = false;
    public static boolean T = false;
    public static final int[] U = {-6803, -2, -1, -1, -1, -1, -1};
    public static final int[] V = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};
    public static final int[] W = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};
    public static final String[] X = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] Y = {44100, 48000, 32000};
    public static final int[] Z = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] a0 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] b0 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] c0 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] d0 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final /* synthetic */ ga1 e0 = new ga1();
    public static final /* synthetic */ ga1 f0 = new ga1();

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0044, code lost:
        if (r5.j("COPPA".toLowerCase(r2) + "_required") != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(e2 e2Var) {
        boolean z;
        if (e2Var.b.j("is_child_directed")) {
            ic1 ic1Var = e2Var.b;
            StringBuilder sb = new StringBuilder();
            Locale locale = Locale.ENGLISH;
            sb.append("COPPA".toLowerCase(locale));
            sb.append("_required");
            if (ic1Var.c(sb.toString())) {
                ic1 ic1Var2 = e2Var.b;
            }
            z = true;
            T = z;
        }
        z = false;
        T = z;
    }

    public static void d(Context context, e2 e2Var, boolean z) {
        Application application;
        if (z && (context instanceof Activity)) {
            application = ((Activity) context).getApplication();
        } else {
            application = context;
        }
        P = application;
        S = true;
        if (Q == null) {
            Q = new ad1();
            e2Var.a(context);
            Q.f(e2Var, z);
        } else {
            e2Var.a(context);
            ad1 ad1Var = Q;
            ad1Var.D.b(false);
            ad1Var.d.e();
            ad1Var.c();
            w1.c(P, e2Var);
            ad1Var.e();
            ad1Var.u.clear();
            ad1Var.r = e2Var;
            ad1Var.a.a();
            ad1Var.g(true, true);
        }
        b(e2Var);
        he1 l = Q.l();
        l.a(context, null);
        if (l.e.isEmpty()) {
            l.b.b(false);
            try {
                new et5(context.getApplicationContext()).a().b(new fe1(l));
            } catch (Exception e) {
                StringBuilder b = e5.b("Query App Set ID failed with: ");
                b.append(Log.getStackTraceString(e));
                t1.b(0, 1, b.toString(), true);
                t1.b(0, 1, "App Set ID is not available.", false);
                l.b.b(true);
                t1.b(0, 2, "Configuring AdColony", false);
                ad1 ad1Var2 = Q;
                ad1Var2.B = false;
                ad1Var2.q().i = false;
                ad1 ad1Var3 = Q;
                ad1Var3.E = true;
                ad1Var3.q().c(false);
                Q.q().d(true);
            } catch (NoClassDefFoundError | NoSuchMethodError unused) {
                t1.b(0, 1, "Google Play Services App Set dependency is missing.", false);
                t1.b(0, 1, "App Set ID is not available.", false);
                l.b.b(true);
                t1.b(0, 2, "Configuring AdColony", false);
                ad1 ad1Var22 = Q;
                ad1Var22.B = false;
                ad1Var22.q().i = false;
                ad1 ad1Var32 = Q;
                ad1Var32.E = true;
                ad1Var32.q().c(false);
                Q.q().d(true);
            }
            t1.b(0, 2, "Configuring AdColony", false);
            ad1 ad1Var222 = Q;
            ad1Var222.B = false;
            ad1Var222.q().i = false;
            ad1 ad1Var322 = Q;
            ad1Var322.E = true;
            ad1Var322.q().c(false);
            Q.q().d(true);
        }
        l.b.b(true);
        t1.b(0, 2, "Configuring AdColony", false);
        ad1 ad1Var2222 = Q;
        ad1Var2222.B = false;
        ad1Var2222.q().i = false;
        ad1 ad1Var3222 = Q;
        ad1Var3222.E = true;
        ad1Var3222.q().c(false);
        Q.q().d(true);
    }

    public static void f(String str, zc1 zc1Var) {
        tc1 o = h().o();
        ArrayList<zc1> arrayList = o.c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            o.c.put(str, arrayList);
        }
        arrayList.add(zc1Var);
    }

    public static void g(String str, zc1 zc1Var) {
        tc1 o = h().o();
        ArrayList<zc1> arrayList = o.c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            o.c.put(str, arrayList);
        }
        arrayList.add(zc1Var);
    }

    public static ad1 h() {
        if (!j()) {
            Context context = P;
            if (context != null) {
                Q = new ad1();
                String q = eb1.n(context.getFilesDir().getAbsolutePath() + "/adc3/AppInfo").q("appId");
                e2 e2Var = new e2();
                if (q != null) {
                    e2Var.a = q;
                    eb1.j(e2Var.b, "app_id", q);
                }
                Q.f(e2Var, false);
            } else {
                return new ad1();
            }
        }
        return Q;
    }

    public static boolean i() {
        return P != null;
    }

    public static boolean j() {
        return Q != null;
    }

    public static void k() {
        tc1 o = h().o();
        synchronized (o.a) {
            ArrayList arrayList = new ArrayList(o.a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jd1) it.next()).c();
            }
        }
    }

    public static void m(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = new int[14];
        z61.C0(iArr, iArr2, iArr4);
        n(iArr4, iArr3);
    }

    public static void n(int[] iArr, int[] iArr2) {
        int c02;
        long j = 6803 & 4294967295L;
        long j2 = iArr[7] & 4294967295L;
        long j3 = (j * j2) + (iArr[0] & 4294967295L) + 0;
        int i = (int) j3;
        iArr2[0] = i;
        long j4 = iArr[8] & 4294967295L;
        long j5 = (j * j4) + j2 + (iArr[1] & 4294967295L) + (j3 >>> 32);
        int i2 = (int) j5;
        iArr2[1] = i2;
        long j6 = iArr[9] & 4294967295L;
        long j7 = (j * j6) + j4 + (iArr[2] & 4294967295L) + (j5 >>> 32);
        int i3 = (int) j7;
        iArr2[2] = i3;
        long j8 = iArr[10] & 4294967295L;
        long j9 = (j * j8) + j6 + (iArr[3] & 4294967295L) + (j7 >>> 32);
        int i4 = (int) j9;
        iArr2[3] = i4;
        long j10 = iArr[11] & 4294967295L;
        long j11 = (j * j10) + j8 + (iArr[4] & 4294967295L) + (j9 >>> 32);
        iArr2[4] = (int) j11;
        long j12 = iArr[12] & 4294967295L;
        long j13 = (j * j12) + j10 + (iArr[5] & 4294967295L) + (j11 >>> 32);
        iArr2[5] = (int) j13;
        long j14 = iArr[13] & 4294967295L;
        long j15 = (j * j14) + j12 + (iArr[6] & 4294967295L) + (j13 >>> 32);
        iArr2[6] = (int) j15;
        long j16 = (j15 >>> 32) + j14;
        long j17 = j16 & 4294967295L;
        long j18 = (j * j17) + (i & 4294967295L) + 0;
        iArr2[0] = (int) j18;
        long j19 = j16 >>> 32;
        long j20 = (j * j19) + j17 + (i2 & 4294967295L) + (j18 >>> 32);
        iArr2[1] = (int) j20;
        long j21 = j19 + (i3 & 4294967295L) + (j20 >>> 32);
        iArr2[2] = (int) j21;
        long j22 = (j21 >>> 32) + (4294967295L & i4);
        iArr2[3] = (int) j22;
        if ((j22 >>> 32) == 0) {
            c02 = 0;
        } else {
            c02 = z61.c0(7, 4, iArr2);
        }
        if (c02 != 0 || (iArr2[6] == -1 && z61.X(iArr2, U))) {
            z61.f(7, 6803, iArr2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
        if (r15 == 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void o(int[] iArr, int i) {
        if (i != 0) {
            long j = i & 4294967295L;
            int i2 = 0;
            long j2 = ((6803 & 4294967295L) * j) + (iArr[0] & 4294967295L) + 0;
            iArr[0] = (int) j2;
            long j3 = j + (iArr[1] & 4294967295L) + (j2 >>> 32);
            iArr[1] = (int) j3;
            long j4 = (j3 >>> 32) + (4294967295L & iArr[2]);
            iArr[2] = (int) j4;
            if ((j4 >>> 32) != 0) {
                i2 = z61.c0(7, 3, iArr);
            }
        }
        if (iArr[6] != -1 || !z61.X(iArr, U)) {
            return;
        }
        z61.f(7, 6803, iArr);
    }

    public static void p(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        z61.e1(iArr, iArr3);
        n(iArr3, iArr2);
    }

    public static void q(int i, int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[14];
        z61.e1(iArr, iArr3);
        while (true) {
            n(iArr3, iArr2);
            i--;
            if (i <= 0) {
                return;
            }
            z61.e1(iArr2, iArr3);
        }
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3) {
        if (z61.n1(iArr, iArr2, iArr3) != 0) {
            z61.p1(7, 6803, iArr3);
        }
    }

    public static int s(int i) {
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i & (-2097152)) == -2097152) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = Y[i5];
        if (i2 == 2) {
            i8 /= 2;
        } else if (i2 == 0) {
            i8 /= 4;
        }
        int i9 = (i >>> 9) & 1;
        int i10 = i4 - 1;
        if (i3 == 3) {
            if (i2 == 3) {
                i7 = Z[i10];
            } else {
                i7 = a0[i10];
            }
            return (((i7 * 12) / i8) + i9) * 4;
        }
        if (i2 == 3) {
            if (i3 == 2) {
                i6 = b0[i10];
            } else {
                i6 = c0[i10];
            }
        } else {
            i6 = d0[i10];
        }
        int i11 = 144;
        if (i2 == 3) {
            return qq.c(i6, 144, i8, i9);
        }
        if (i3 == 1) {
            i11 = 72;
        }
        return qq.c(i11, i6, i8, i9);
    }

    public static int t(int i) {
        int i2;
        int i3;
        if (!((i & (-2097152)) == -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = i >>> 12;
        int i5 = (i >>> 10) & 3;
        int i6 = i4 & 15;
        if (i6 == 0 || i6 == 15 || i5 == 3) {
            return -1;
        }
        return i3 != 1 ? i3 != 2 ? 384 : 1152 : i2 == 3 ? 1152 : 576;
    }

    public static void u(ArrayList arrayList, ya2 ya2Var) {
        String str = (String) ya2Var.d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    @Override // defpackage.i65
    public Object a(ja jaVar) {
        return new eg3((l75) jaVar);
    }

    @Override // defpackage.hc5
    public /* bridge */ /* synthetic */ Object c(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public void mo0e(Object obj) {
        ((yd3) obj).g0(oj4.d(11, null, null));
    }

    public void l(float f, float f2, nr0 nr0Var) {
        throw null;
    }
}