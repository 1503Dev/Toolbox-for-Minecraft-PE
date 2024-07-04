package defpackage;

import android.graphics.Bitmap;
import defpackage.zv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: iy0  reason: default package */
public class iy0 implements zv {
    public static final iy0 c = new iy0();
    public final e a = new e();
    public boolean b;

    /* renamed from: iy0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements zv.a {
        public final long a;

        public a(long j) {
            this.a = j;
        }
    }

    /* renamed from: iy0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public long a;

        public b(long j) {
            this.a = j;
        }
    }

    /* renamed from: iy0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c implements zv.b {
        public final long a;

        public c(long j) {
            this.a = j;
        }

        @Override // defpackage.zv.b
        public final int a() {
            return iy0.b0(this.a);
        }

        @Override // defpackage.zv.b
        public final void b(int[] iArr) {
            iy0.F0(this.a, iArr);
        }

        @Override // defpackage.zv.b
        public final int[] c() {
            return iy0.a0(this.a);
        }

        @Override // defpackage.zv.b
        public final void d(String str) {
            iy0.E0(this.a, str);
        }

        @Override // defpackage.zv.b
        public final void e(int i) {
            iy0.D0(this.a, i);
        }

        @Override // defpackage.zv.b
        public final int[] f() {
            return iy0.e0(this.a);
        }

        @Override // defpackage.zv.b
        public final String g() {
            return iy0.d0(this.a);
        }

        @Override // defpackage.zv.b
        public final String h() {
            return iy0.c0(this.a);
        }

        @Override // defpackage.zv.b
        public final int i() {
            return iy0.f0(this.a);
        }

        @Override // defpackage.zv.b
        public final d j() {
            return new d(iy0.R(this.a));
        }
    }

    /* renamed from: iy0$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d extends c {
        public d(long j) {
            super(j);
        }

        public final void finalize() {
            iy0.T(this.a);
            super.finalize();
        }
    }

    /* renamed from: iy0$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native byte[] A0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native byte[] B0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void C0(long j, int i, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void D0(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void E0(long j, String str);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void F0(long j, int[] iArr);

    private static native void G0(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void H0(long j, float f, float f2, float f3);

    public static iy0 K() {
        return c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ze K0(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            ze zeVar = new ze();
            zeVar.o(new o00(byteArrayInputStream), 100);
            byteArrayInputStream.close();
            return zeVar;
        } catch (IOException unused) {
            return null;
        }
    }

    public static long[] L(zv.b[] bVarArr) {
        long[] jArr = new long[bVarArr.length];
        for (int length = bVarArr.length - 1; length >= 0; length--) {
            jArr[length] = ((c) bVarArr[length]).a;
        }
        return jArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] N0(ze zeVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            zeVar.q(new p00(byteArrayOutputStream), 100);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void Q(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long R(long j);

    private static native long S(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void T(long j);

    private static native void U(String str);

    private static native long V(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long W(long j);

    private static native long[] X();

    private static native String[] Y();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long Z(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int[] a0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int b0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String c0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native String d0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int[] e0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int f0(long j);

    private static native String g0(long j);

    private static native long h0();

    /* JADX INFO: Access modifiers changed from: private */
    public static native String i0(long j);

    private static native long[] j0();

    /* JADX INFO: Access modifiers changed from: private */
    public static native float[] k0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native int l0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long m0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long n0(int i, int i2, int i3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long o0();

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean p0(long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean q0(long j);

    private static native boolean r0();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void s0(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void t0(long j, byte[] bArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void u0(long j, byte[] bArr);

    private static native void v0(Runnable runnable);

    private static native void w0(Runnable runnable);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void x0(Runnable runnable);

    private static native void y0(Bitmap bitmap, int i, int i2, int i3, int i4, long j, Runnable runnable);

    /* JADX INFO: Access modifiers changed from: private */
    public static native byte[] z0(long j);

    public final void H(String str) {
        U(str);
    }

    public final zv.b[] I() {
        long[] X = X();
        zv.b[] bVarArr = new zv.b[X.length];
        for (int i = 0; i < X.length; i++) {
            bVarArr[i] = new c(X[i]);
        }
        return bVarArr;
    }

    public final void I0(Runnable runnable) {
        w0(runnable);
    }

    public final String[] J() {
        return Y();
    }

    public final void J0(s30 s30Var) {
        if (this.b) {
            w0(s30Var);
            return;
        }
        try {
            v0(s30Var);
        } catch (UnsatisfiedLinkError unused) {
            this.b = true;
            w0(s30Var);
        }
    }

    public final void L0(Bitmap bitmap, int i, int i2, zv.b bVar, Runnable runnable) {
        y0(bitmap, 0, 0, i, i2, ((c) bVar).a, runnable);
    }

    public final a M() {
        long h0 = h0();
        if (h0 != 0) {
            return new a(h0);
        }
        return null;
    }

    public final void M0() {
        long h0 = h0();
        if (h0 != 0) {
            G0(h0, 5000);
        }
    }

    public final zv.a[] N() {
        long[] j0 = j0();
        zv.a[] aVarArr = new zv.a[j0.length];
        for (int i = 0; i < j0.length; i++) {
            aVarArr[i] = new a(j0[i]);
        }
        return aVarArr;
    }

    public final boolean O() {
        return r0();
    }

    public final d P(int i, int i2, int i3) {
        long S = S(i, i2, i3);
        if (S != 0) {
            return new d(S);
        }
        return null;
    }
}