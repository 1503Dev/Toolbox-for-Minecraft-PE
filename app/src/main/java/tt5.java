package defpackage;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec$CodecException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.UUID;

/* renamed from: tt5  reason: default package */
public abstract class tt5 extends mk5 {
    public static final byte[] k1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public jt5 I0;
    public long J0;
    public int K0;
    public int L0;
    public ByteBuffer M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public int U0;
    public int V0;
    public boolean W0;
    public boolean X0;
    public boolean Y0;
    public long Z0;
    public long a1;
    public final ut5 b0;
    public boolean b1;
    public final float c0;
    public boolean c1;
    public final gk5 d0;
    public boolean d1;
    public final gk5 e0;
    public nk5 e1;
    public final gk5 f0;
    public st5 f1;
    public final it5 g0;
    public long g1;
    public final ArrayList h0;
    public boolean h1;
    public final MediaCodec.BufferInfo i0;
    public fb3 i1;
    public final ArrayDeque j0;
    public fb3 j1;
    public final vr5 k0;
    public cu1 l0;
    public cu1 m0;
    public long n0;
    public float o0;
    public float p0;
    public mt5 q0;
    public cu1 r0;
    public MediaFormat s0;
    public boolean t0;
    public float u0;
    public ArrayDeque v0;
    public rt5 w0;
    public pt5 x0;
    public int y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(int i, float f) {
        super(i);
        u92 u92Var = u92.U;
        this.b0 = u92Var;
        this.c0 = f;
        this.d0 = new gk5(0);
        this.e0 = new gk5(0);
        this.f0 = new gk5(2);
        it5 it5Var = new it5();
        this.g0 = it5Var;
        this.h0 = new ArrayList();
        this.i0 = new MediaCodec.BufferInfo();
        this.o0 = 1.0f;
        this.p0 = 1.0f;
        this.n0 = -9223372036854775807L;
        this.j0 = new ArrayDeque();
        K(st5.d);
        it5Var.c(0);
        it5Var.c.order(ByteOrder.nativeOrder());
        this.k0 = new vr5();
        this.u0 = -1.0f;
        this.y0 = 0;
        this.T0 = 0;
        this.K0 = -1;
        this.L0 = -1;
        this.J0 = -9223372036854775807L;
        this.Z0 = -9223372036854775807L;
        this.a1 = -9223372036854775807L;
        this.g1 = -9223372036854775807L;
        this.U0 = 0;
        this.V0 = 0;
    }

    private final void Q() {
        try {
            this.q0.g();
        } finally {
            c0();
        }
    }

    public abstract int A(ut5 ut5Var, cu1 cu1Var);

    public abstract ok5 B(pt5 pt5Var, cu1 cu1Var, cu1 cu1Var2);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0063, code lost:
        if (L() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008f, code lost:
        if (L() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a5, code lost:
        if (L() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ok5 C(vi1 vi1Var) {
        int i;
        boolean z = true;
        this.d1 = true;
        cu1 cu1Var = (cu1) vi1Var.Q;
        cu1Var.getClass();
        if (cu1Var.k == null) {
            throw n(4005, cu1Var, new IllegalArgumentException(), false);
        }
        fb3 fb3Var = (fb3) vi1Var.R;
        this.j1 = fb3Var;
        this.l0 = cu1Var;
        if (this.P0) {
            this.R0 = true;
            return null;
        }
        mt5 mt5Var = this.q0;
        if (mt5Var == null) {
            this.v0 = null;
            Y();
            return null;
        }
        pt5 pt5Var = this.x0;
        cu1 cu1Var2 = this.r0;
        fb3 fb3Var2 = this.i1;
        if (fb3Var2 != fb3Var) {
            if (fb3Var != null && fb3Var2 != null) {
                UUID uuid = cq5.a;
                if (uuid.equals(uuid) && zn4.a >= 23) {
                    UUID uuid2 = cq5.e;
                    if (!uuid2.equals(uuid)) {
                        uuid2.equals(uuid);
                    }
                }
            }
            E();
            return new ok5(pt5Var.a, cu1Var2, cu1Var, 0, 128);
        }
        boolean z2 = fb3Var != fb3Var2;
        tv2.I(!z2 || zn4.a >= 23);
        ok5 B = B(pt5Var, cu1Var2, cu1Var);
        int i2 = B.d;
        if (i2 != 0) {
            if (i2 == 1) {
                if (O(cu1Var)) {
                    this.r0 = cu1Var;
                    if (!z2) {
                        if (this.W0) {
                            this.U0 = 1;
                            if (this.A0 || this.C0) {
                                this.V0 = 3;
                                i = 2;
                            } else {
                                this.V0 = 1;
                            }
                        }
                    }
                }
                i = 16;
            } else if (i2 != 2) {
                if (O(cu1Var)) {
                    this.r0 = cu1Var;
                    if (z2) {
                    }
                }
                i = 16;
            } else {
                if (O(cu1Var)) {
                    this.S0 = true;
                    this.T0 = 1;
                    int i3 = this.y0;
                    if (i3 != 2 && (i3 != 1 || cu1Var.p != cu1Var2.p || cu1Var.q != cu1Var2.q)) {
                        z = false;
                    }
                    this.F0 = z;
                    this.r0 = cu1Var;
                    if (z2) {
                    }
                }
                i = 16;
            }
            return (B.d != 0 || (this.q0 == mt5Var && this.V0 != 3)) ? B : new ok5(pt5Var.a, cu1Var2, cu1Var, 0, i);
        }
        E();
        i = 0;
        if (B.d != 0) {
        }
    }

    public final void D() {
        this.R0 = false;
        this.g0.b();
        this.f0.b();
        this.Q0 = false;
        this.P0 = false;
        vr5 vr5Var = this.k0;
        vr5Var.getClass();
        vr5Var.a = kr3.a;
        vr5Var.c = 0;
        vr5Var.b = 2;
    }

    public final void E() {
        if (this.W0) {
            this.U0 = 1;
            this.V0 = 3;
            return;
        }
        b0();
        Y();
    }

    public abstract lt5 F(pt5 pt5Var, cu1 cu1Var, float f);

    public abstract ArrayList G(ut5 ut5Var, cu1 cu1Var);

    public abstract void H(Exception exc);

    public abstract void I(String str, long j, long j2);

    public abstract void J(String str);

    public final void K(st5 st5Var) {
        this.f1 = st5Var;
        if (st5Var.b != -9223372036854775807L) {
            this.h1 = true;
        }
    }

    @TargetApi(23)
    public final boolean L() {
        if (!this.W0) {
            try {
                throw null;
            } catch (MediaCryptoException e) {
                throw n(6006, this.l0, e, false);
            }
        }
        this.U0 = 1;
        if (this.A0 || this.C0) {
            this.V0 = 3;
            return false;
        }
        this.V0 = 2;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public final boolean M() {
        boolean z;
        long j;
        st5 st5Var;
        mt5 mt5Var = this.q0;
        boolean z2 = 0;
        if (mt5Var == null || this.U0 == 2 || this.b1) {
            return false;
        }
        if (this.K0 < 0) {
            int a = mt5Var.a();
            this.K0 = a;
            if (a < 0) {
                return false;
            }
            this.e0.c = this.q0.A(a);
            this.e0.b();
        }
        if (this.U0 == 1) {
            if (!this.H0) {
                this.X0 = true;
                this.q0.f(this.K0, 0, 0L, 4);
                this.K0 = -1;
                this.e0.c = null;
            }
            this.U0 = 2;
            return false;
        } else if (this.F0) {
            this.F0 = false;
            this.e0.c.put(k1);
            this.q0.f(this.K0, 38, 0L, 0);
            this.K0 = -1;
            this.e0.c = null;
            this.W0 = true;
            return true;
        } else {
            if (this.T0 == 1) {
                for (int i = 0; i < this.r0.m.size(); i++) {
                    this.e0.c.put((byte[]) this.r0.m.get(i));
                }
                this.T0 = 2;
            }
            int position = this.e0.c.position();
            vi1 vi1Var = this.Q;
            vi1Var.R = null;
            vi1Var.Q = null;
            try {
                int m = m(vi1Var, this.e0, 0);
                if (g()) {
                    this.a1 = this.Z0;
                }
                if (m == -3) {
                    return false;
                }
                if (m == -5) {
                    if (this.T0 == 2) {
                        this.e0.b();
                        this.T0 = 1;
                    }
                    C(vi1Var);
                    return true;
                }
                gk5 gk5Var = this.e0;
                if (gk5Var.a(4)) {
                    if (this.T0 == 2) {
                        gk5Var.b();
                        this.T0 = 1;
                    }
                    this.b1 = true;
                    if (!this.W0) {
                        h0();
                        return false;
                    }
                    try {
                        if (!this.H0) {
                            this.X0 = true;
                            this.q0.f(this.K0, 0, 0L, 4);
                            this.K0 = -1;
                            this.e0.c = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e) {
                        throw n(zn4.k(e.getErrorCode()), this.l0, e, false);
                    }
                } else if (!this.W0 && !gk5Var.a(1)) {
                    gk5Var.b();
                    if (this.T0 == 2) {
                        this.T0 = 1;
                    }
                    return true;
                } else {
                    boolean a2 = gk5Var.a(1073741824);
                    if (a2) {
                        rj5 rj5Var = gk5Var.b;
                        if (position == 0) {
                            rj5Var.getClass();
                        } else {
                            if (rj5Var.d == null) {
                                int[] iArr = new int[1];
                                rj5Var.d = iArr;
                                rj5Var.i.numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = rj5Var.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.z0 && !a2) {
                        ByteBuffer byteBuffer = this.e0.c;
                        byte[] bArr = hl1.a;
                        int position2 = byteBuffer.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 < position2) {
                                int i5 = byteBuffer.get(i2) & 255;
                                if (i3 == 3) {
                                    if (i5 == 1) {
                                        if ((byteBuffer.get(i4) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer.duplicate();
                                            duplicate.position(i2 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer.position(0);
                                            byteBuffer.put(duplicate);
                                            break;
                                        }
                                        i5 = 1;
                                    }
                                } else if (i5 == 0) {
                                    i3++;
                                }
                                if (i5 != 0) {
                                    i3 = 0;
                                }
                                i2 = i4;
                            } else {
                                byteBuffer.clear();
                                break;
                            }
                        }
                        if (this.e0.c.position() == 0) {
                            return true;
                        }
                        this.z0 = false;
                    }
                    gk5 gk5Var2 = this.e0;
                    long j2 = gk5Var2.e;
                    jt5 jt5Var = this.I0;
                    if (jt5Var != null) {
                        cu1 cu1Var = this.l0;
                        if (jt5Var.b == 0) {
                            jt5Var.a = j2;
                        }
                        if (!jt5Var.c) {
                            ByteBuffer byteBuffer2 = gk5Var2.c;
                            byteBuffer2.getClass();
                            int i6 = 0;
                            for (int i7 = 0; i7 < 4; i7++) {
                                i6 = (i6 << 8) | (byteBuffer2.get(i7) & 255);
                            }
                            int t = ga1.t(i6);
                            if (t == -1) {
                                jt5Var.c = true;
                                jt5Var.b = 0L;
                                jt5Var.a = gk5Var2.e;
                                lb4.c("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                j2 = gk5Var2.e;
                            } else {
                                long max = Math.max(0L, ((jt5Var.b - 529) * 1000000) / cu1Var.y) + jt5Var.a;
                                jt5Var.b += t;
                                j2 = max;
                            }
                        }
                        long j3 = this.Z0;
                        jt5 jt5Var2 = this.I0;
                        cu1 cu1Var2 = this.l0;
                        jt5Var2.getClass();
                        z = a2;
                        this.Z0 = Math.max(j3, Math.max(0L, ((jt5Var2.b - 529) * 1000000) / cu1Var2.y) + jt5Var2.a);
                        j = j2;
                    } else {
                        z = a2;
                        j = j2;
                    }
                    if (this.e0.a(RecyclerView.UNDEFINED_DURATION)) {
                        this.h0.add(Long.valueOf(j));
                    }
                    if (this.d1) {
                        if (!this.j0.isEmpty()) {
                            st5Var = (st5) this.j0.peekLast();
                        } else {
                            st5Var = this.f1;
                        }
                        st5Var.c.a(j, this.l0);
                        this.d1 = false;
                    }
                    this.Z0 = Math.max(this.Z0, j);
                    this.e0.d();
                    gk5 gk5Var3 = this.e0;
                    if (gk5Var3.a(268435456)) {
                        X(gk5Var3);
                    }
                    S(this.e0);
                    try {
                        if (z) {
                            this.q0.e(this.K0, this.e0.b, j);
                        } else {
                            this.q0.f(this.K0, this.e0.c.limit(), j, 0);
                        }
                        this.K0 = -1;
                        this.e0.c = null;
                        this.W0 = true;
                        this.T0 = 0;
                        nk5 nk5Var = this.e1;
                        z2 = nk5Var.c + 1;
                        nk5Var.c = z2;
                        return true;
                    } catch (MediaCodec.CryptoException e2) {
                        throw n(zn4.k(e2.getErrorCode()), this.l0, e2, z2);
                    }
                }
            } catch (fk5 e3) {
                H(e3);
                N(0);
                Q();
                return true;
            }
        }
    }

    public final boolean N(int i) {
        vi1 vi1Var = this.Q;
        vi1Var.R = null;
        vi1Var.Q = null;
        this.d0.b();
        int m = m(vi1Var, this.d0, i | 4);
        if (m == -5) {
            C(vi1Var);
            return true;
        } else if (m == -4 && this.d0.a(4)) {
            this.b1 = true;
            h0();
            return false;
        } else {
            return false;
        }
    }

    public final boolean O(cu1 cu1Var) {
        if (zn4.a >= 23 && this.q0 != null && this.V0 != 3 && this.U != 0) {
            float f = this.p0;
            cu1[] cu1VarArr = this.W;
            cu1VarArr.getClass();
            float z = z(f, cu1VarArr);
            float f2 = this.u0;
            if (f2 == z) {
                return true;
            }
            if (z == -1.0f) {
                E();
                return false;
            } else if (f2 == -1.0f && z <= this.c0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", z);
                this.q0.h(bundle);
                this.u0 = z;
            }
        }
        return true;
    }

    public abstract void P(cu1 cu1Var, MediaFormat mediaFormat);

    public abstract void R();

    public abstract void S(gk5 gk5Var);

    public void T() {
    }

    public abstract boolean U(long j, long j2, mt5 mt5Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, cu1 cu1Var);

    public boolean V(cu1 cu1Var) {
        return false;
    }

    public nt5 W(IllegalStateException illegalStateException, pt5 pt5Var) {
        return new nt5(illegalStateException, pt5Var);
    }

    public void X(gk5 gk5Var) {
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00f2 A[Catch: rt5 -> 0x0125, TryCatch #0 {rt5 -> 0x0125, blocks: (B:30:0x0061, B:33:0x0066, B:35:0x007c, B:36:0x0087, B:41:0x0096, B:43:0x009e, B:44:0x00a6, B:46:0x00aa, B:57:0x00d2, B:59:0x00f2, B:61:0x010b, B:64:0x0114, B:65:0x0116, B:60:0x00f5, B:66:0x0117, B:68:0x011a, B:69:0x0124, B:39:0x008b, B:40:0x0095, B:49:0x00b9, B:54:0x00c2, B:55:0x00d0), top: B:74:0x0061, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f5 A[Catch: rt5 -> 0x0125, TryCatch #0 {rt5 -> 0x0125, blocks: (B:30:0x0061, B:33:0x0066, B:35:0x007c, B:36:0x0087, B:41:0x0096, B:43:0x009e, B:44:0x00a6, B:46:0x00aa, B:57:0x00d2, B:59:0x00f2, B:61:0x010b, B:64:0x0114, B:65:0x0116, B:60:0x00f5, B:66:0x0117, B:68:0x011a, B:69:0x0124, B:39:0x008b, B:40:0x0095, B:49:0x00b9, B:54:0x00c2, B:55:0x00d0), top: B:74:0x0061, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y() {
        cu1 cu1Var;
        rt5 rt5Var;
        if (this.q0 == null && !this.P0 && (cu1Var = this.l0) != null) {
            if (this.j1 == null && V(cu1Var)) {
                cu1 cu1Var2 = this.l0;
                D();
                String str = cu1Var2.k;
                if (!"audio/mp4a-latm".equals(str) && !"audio/mpeg".equals(str) && !"audio/opus".equals(str)) {
                    this.g0.j = 1;
                } else {
                    this.g0.j = 32;
                }
                this.P0 = true;
                return;
            }
            fb3 fb3Var = this.j1;
            this.i1 = fb3Var;
            cu1 cu1Var3 = this.l0;
            String str2 = cu1Var3.k;
            if (fb3Var != null && os5.a) {
                hs5 hs5Var = (hs5) fb3Var.Q;
                throw n(hs5Var.P, cu1Var3, hs5Var, false);
            }
            try {
                if (this.v0 == null) {
                    try {
                        ArrayList G = G(this.b0, cu1Var3);
                        G.isEmpty();
                        this.v0 = new ArrayDeque();
                        if (!G.isEmpty()) {
                            this.v0.add((pt5) G.get(0));
                        }
                        this.w0 = null;
                    } catch (xt5 e) {
                        throw new rt5(-49998, this.l0, e);
                    }
                }
                if (!this.v0.isEmpty()) {
                    pt5 pt5Var = (pt5) this.v0.peekFirst();
                    while (this.q0 == null) {
                        pt5 pt5Var2 = (pt5) this.v0.peekFirst();
                        if (!f0(pt5Var2)) {
                            return;
                        }
                        try {
                            g0(pt5Var2);
                        } catch (Exception e2) {
                            if (pt5Var2 == pt5Var) {
                                try {
                                    lb4.c("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                                    Thread.sleep(50L);
                                    g0(pt5Var2);
                                } catch (Exception e3) {
                                    lb4.d("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(pt5Var2)), e3);
                                    this.v0.removeFirst();
                                    rt5 rt5Var2 = new rt5(this.l0, e3, pt5Var2);
                                    H(rt5Var2);
                                    rt5Var = this.w0;
                                    if (rt5Var != null) {
                                    }
                                    if (!this.v0.isEmpty()) {
                                    }
                                }
                            } else {
                                throw e2;
                                break;
                            }
                            lb4.d("MediaCodecRenderer", "Failed to initialize decoder: ".concat(String.valueOf(pt5Var2)), e3);
                            this.v0.removeFirst();
                            rt5 rt5Var22 = new rt5(this.l0, e3, pt5Var2);
                            H(rt5Var22);
                            rt5Var = this.w0;
                            if (rt5Var != null) {
                                this.w0 = rt5Var22;
                            } else {
                                this.w0 = new rt5(rt5Var.getMessage(), rt5Var.getCause(), rt5Var.P, rt5Var.Q, rt5Var.R);
                            }
                            if (!this.v0.isEmpty()) {
                                throw this.w0;
                            }
                        }
                    }
                    this.v0 = null;
                    return;
                }
                throw new rt5(-49999, this.l0, (xt5) null);
            } catch (rt5 e4) {
                throw n(4001, this.l0, e4, false);
            }
        }
    }

    public void Z(long j) {
        this.g1 = j;
        if (this.j0.isEmpty() || j < ((st5) this.j0.peek()).a) {
            return;
        }
        K((st5) this.j0.poll());
        R();
    }

    public void a0(cu1 cu1Var) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [fb3, mt5] */
    public final void b0() {
        try {
            mt5 mt5Var = this.q0;
            if (mt5Var != null) {
                mt5Var.n();
                this.e1.b++;
                J(this.x0.a);
            }
        } finally {
            this.q0 = null;
            this.i1 = null;
            d0();
        }
    }

    public void c0() {
        this.K0 = -1;
        this.e0.c = null;
        this.L0 = -1;
        this.M0 = null;
        this.J0 = -9223372036854775807L;
        this.X0 = false;
        this.W0 = false;
        this.F0 = false;
        this.G0 = false;
        this.N0 = false;
        this.O0 = false;
        this.h0.clear();
        this.Z0 = -9223372036854775807L;
        this.a1 = -9223372036854775807L;
        this.g1 = -9223372036854775807L;
        jt5 jt5Var = this.I0;
        if (jt5Var != null) {
            jt5Var.a = 0L;
            jt5Var.b = 0L;
            jt5Var.c = false;
        }
        this.U0 = 0;
        this.V0 = 0;
        this.T0 = this.S0 ? 1 : 0;
    }

    public final void d0() {
        c0();
        this.I0 = null;
        this.v0 = null;
        this.x0 = null;
        this.r0 = null;
        this.s0 = null;
        this.t0 = false;
        this.Y0 = false;
        this.u0 = -1.0f;
        this.y0 = 0;
        this.z0 = false;
        this.A0 = false;
        this.B0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        this.H0 = false;
        this.S0 = false;
        this.T0 = 0;
    }

    public final boolean e0() {
        boolean z;
        if (this.q0 == null) {
            return false;
        }
        int i = this.V0;
        if (i != 3 && !this.A0 && ((!this.B0 || this.Y0) && (!this.C0 || !this.X0))) {
            if (i == 2) {
                int i2 = zn4.a;
                if (i2 >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                tv2.I(z);
                if (i2 >= 23) {
                    try {
                        try {
                            throw null;
                        } catch (MediaCryptoException e) {
                            throw n(6006, this.l0, e, false);
                        }
                    } catch (tk5 e2) {
                        lb4.d("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e2);
                        b0();
                        return true;
                    }
                }
            }
            Q();
            return false;
        }
        b0();
        return true;
    }

    @Override // defpackage.mk5
    public void f(float f, float f2) {
        this.o0 = f;
        this.p0 = f2;
        O(this.r0);
    }

    public boolean f0(pt5 pt5Var) {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x031e, code lost:
        if ("stvm8".equals(r5) == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x032e, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r2) == false) goto L134;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0405  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(pt5 pt5Var) {
        float z;
        MediaCodec createByCodecName;
        ts5 mu5Var;
        long j;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String str;
        String sb;
        long j2;
        String str2;
        String str3 = pt5Var.a;
        int i2 = zn4.a;
        if (i2 < 23) {
            z = -1.0f;
        } else {
            float f = this.p0;
            cu1[] cu1VarArr = this.W;
            cu1VarArr.getClass();
            z = z(f, cu1VarArr);
        }
        if (z <= this.c0) {
            z = -1.0f;
        }
        a0(this.l0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        MediaCodec mediaCodec = null;
        lt5 F = F(pt5Var, this.l0, z);
        if (i2 >= 31) {
            wp5 wp5Var = this.T;
            wp5Var.getClass();
            qt5.a(F, wp5Var);
        }
        try {
            Trace.beginSection("createCodec:" + str3);
            if (i2 >= 23 && i2 >= 31) {
                int a = mx2.a(F.c.k);
                String concat = "Creating an asynchronous MediaCodec adapter for track type ".concat(zn4.v(a));
                synchronized (lb4.a) {
                    Log.i("DMCodecAdapterFactory", concat);
                }
                mu5Var = new ss5(a).a(F);
            } else {
                try {
                    pt5 pt5Var2 = F.a;
                    pt5Var2.getClass();
                    String str4 = pt5Var2.a;
                    Trace.beginSection("createCodec:".concat(str4));
                    createByCodecName = MediaCodec.createByCodecName(str4);
                    Trace.endSection();
                } catch (IOException e) {
                    e = e;
                } catch (RuntimeException e2) {
                    e = e2;
                }
                try {
                    Trace.beginSection("configureCodec");
                    createByCodecName.configure(F.b, F.d, (MediaCrypto) null, 0);
                    Trace.endSection();
                    Trace.beginSection("startCodec");
                    createByCodecName.start();
                    Trace.endSection();
                    mu5Var = new mu5(createByCodecName);
                } catch (IOException | RuntimeException e3) {
                    e = e3;
                    mediaCodec = createByCodecName;
                    if (mediaCodec != null) {
                        mediaCodec.release();
                    }
                    throw e;
                }
            }
            this.q0 = mu5Var;
            Trace.endSection();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!pt5Var.c(this.l0)) {
                Object[] objArr = new Object[2];
                cu1 cu1Var = this.l0;
                int i3 = cu1.F;
                if (cu1Var == null) {
                    sb = "null";
                    j = elapsedRealtime2;
                } else {
                    StringBuilder b = e5.b("id=");
                    b.append(cu1Var.a);
                    b.append(", mimeType=");
                    b.append(cu1Var.k);
                    if (cu1Var.g != -1) {
                        b.append(", bitrate=");
                        b.append(cu1Var.g);
                    }
                    if (cu1Var.h != null) {
                        b.append(", codecs=");
                        b.append(cu1Var.h);
                    }
                    if (cu1Var.n != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        int i4 = 0;
                        while (true) {
                            al1 al1Var = cu1Var.n;
                            if (i4 >= al1Var.S) {
                                break;
                            }
                            UUID uuid = al1Var.P[i4].Q;
                            if (uuid.equals(cq5.b)) {
                                str2 = "cenc";
                            } else if (uuid.equals(cq5.c)) {
                                str2 = "clearkey";
                            } else if (uuid.equals(cq5.e)) {
                                str2 = "playready";
                            } else if (uuid.equals(cq5.d)) {
                                str2 = "widevine";
                            } else if (uuid.equals(cq5.a)) {
                                str2 = "universal";
                            } else {
                                String obj = uuid.toString();
                                StringBuilder sb2 = new StringBuilder();
                                j2 = elapsedRealtime2;
                                sb2.append("unknown (");
                                sb2.append(obj);
                                sb2.append(")");
                                linkedHashSet.add(sb2.toString());
                                i4++;
                                elapsedRealtime2 = j2;
                            }
                            linkedHashSet.add(str2);
                            j2 = elapsedRealtime2;
                            i4++;
                            elapsedRealtime2 = j2;
                        }
                        j = elapsedRealtime2;
                        b.append(", drm=[");
                        s45.j(b, linkedHashSet, ",");
                        b.append(']');
                    } else {
                        j = elapsedRealtime2;
                    }
                    if (cu1Var.p != -1 && cu1Var.q != -1) {
                        b.append(", res=");
                        b.append(cu1Var.p);
                        b.append("x");
                        b.append(cu1Var.q);
                    }
                    if (cu1Var.r != -1.0f) {
                        b.append(", fps=");
                        b.append(cu1Var.r);
                    }
                    if (cu1Var.x != -1) {
                        b.append(", channels=");
                        b.append(cu1Var.x);
                    }
                    if (cu1Var.y != -1) {
                        b.append(", sample_rate=");
                        b.append(cu1Var.y);
                    }
                    if (cu1Var.c != null) {
                        b.append(", language=");
                        b.append(cu1Var.c);
                    }
                    if (cu1Var.b != null) {
                        b.append(", label=");
                        b.append(cu1Var.b);
                    }
                    if (cu1Var.d != 0) {
                        ArrayList arrayList = new ArrayList();
                        if ((cu1Var.d & 1) != 0) {
                            arrayList.add("default");
                        }
                        if ((cu1Var.d & 2) != 0) {
                            arrayList.add("forced");
                        }
                        b.append(", selectionFlags=[");
                        s45.j(b, arrayList, ",");
                        b.append("]");
                    }
                    sb = b.toString();
                }
                objArr[0] = sb;
                objArr[1] = str3;
                lb4.c("MediaCodecRenderer", String.format(Locale.US, "Format exceeds selected codec's capabilities [%s, %s]", objArr));
            } else {
                j = elapsedRealtime2;
            }
            this.x0 = pt5Var;
            this.u0 = z;
            this.r0 = this.l0;
            int i5 = zn4.a;
            if (i5 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str3)) {
                String str5 = zn4.d;
                if (str5.startsWith("SM-T585") || str5.startsWith("SM-A510") || str5.startsWith("SM-A520") || str5.startsWith("SM-J700")) {
                    i = 2;
                    this.y0 = i;
                    cu1 cu1Var2 = this.r0;
                    if (i5 >= 21 && cu1Var2.m.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str3)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.z0 = z2;
                    if (i5 != 19 && zn4.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str3) || "OMX.Exynos.avc.dec.secure".equals(str3))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    this.A0 = z3;
                    if (i5 != 29 && "c2.android.aac.decoder".equals(str3)) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    this.B0 = z4;
                    if (i5 <= 23 || !"OMX.google.vorbis.decoder".equals(str3)) {
                        if (i5 <= 19) {
                            String str6 = zn4.b;
                            if (!"hb2000".equals(str6)) {
                            }
                            if (!"OMX.amlogic.avc.decoder.awesome".equals(str3)) {
                            }
                        }
                        z5 = false;
                        this.C0 = z5;
                        if (i5 != 21 && "OMX.google.aac.decoder".equals(str3)) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        this.D0 = z6;
                        if (i5 < 21 && "OMX.SEC.mp3.dec".equals(str3) && "samsung".equals(zn4.c)) {
                            str = zn4.b;
                            if (!str.startsWith("baffin") || str.startsWith("grand") || str.startsWith("fortuna") || str.startsWith("gprimelte") || str.startsWith("j2y18lte") || str.startsWith("ms01")) {
                                z7 = true;
                                this.E0 = z7;
                                String str7 = pt5Var.a;
                                if ((i5 > 25 && "OMX.rk.video_decoder.avc".equals(str7)) || ((i5 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str7) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str7) || "OMX.bcm.vdec.avc.tunnel".equals(str7) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str7) || "OMX.bcm.vdec.hevc.tunnel".equals(str7) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str7))) || ("Amazon".equals(zn4.c) && "AFTS".equals(zn4.d) && pt5Var.f))) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                this.H0 = z8;
                                this.q0.w();
                                if ("c2.android.mp3.decoder".equals(pt5Var.a)) {
                                    this.I0 = new jt5();
                                }
                                if (this.U == 2) {
                                    this.J0 = SystemClock.elapsedRealtime() + 1000;
                                }
                                this.e1.a++;
                                I(str3, j, j - elapsedRealtime);
                            }
                        }
                        z7 = false;
                        this.E0 = z7;
                        String str72 = pt5Var.a;
                        if (i5 > 25) {
                        }
                        z8 = false;
                        this.H0 = z8;
                        this.q0.w();
                        if ("c2.android.mp3.decoder".equals(pt5Var.a)) {
                        }
                        if (this.U == 2) {
                        }
                        this.e1.a++;
                        I(str3, j, j - elapsedRealtime);
                    }
                    z5 = true;
                    this.C0 = z5;
                    if (i5 != 21) {
                    }
                    z6 = false;
                    this.D0 = z6;
                    if (i5 < 21) {
                        str = zn4.b;
                        if (!str.startsWith("baffin")) {
                        }
                        z7 = true;
                        this.E0 = z7;
                        String str722 = pt5Var.a;
                        if (i5 > 25) {
                        }
                        z8 = false;
                        this.H0 = z8;
                        this.q0.w();
                        if ("c2.android.mp3.decoder".equals(pt5Var.a)) {
                        }
                        if (this.U == 2) {
                        }
                        this.e1.a++;
                        I(str3, j, j - elapsedRealtime);
                    }
                    z7 = false;
                    this.E0 = z7;
                    String str7222 = pt5Var.a;
                    if (i5 > 25) {
                    }
                    z8 = false;
                    this.H0 = z8;
                    this.q0.w();
                    if ("c2.android.mp3.decoder".equals(pt5Var.a)) {
                    }
                    if (this.U == 2) {
                    }
                    this.e1.a++;
                    I(str3, j, j - elapsedRealtime);
                }
            }
            if (i5 < 24 && ("OMX.Nvidia.h264.decode".equals(str3) || "OMX.Nvidia.h264.decode.secure".equals(str3))) {
                String str8 = zn4.b;
                if ("flounder".equals(str8) || "flounder_lte".equals(str8) || "grouper".equals(str8) || "tilapia".equals(str8)) {
                    i = 1;
                    this.y0 = i;
                    cu1 cu1Var22 = this.r0;
                    if (i5 >= 21) {
                    }
                    z2 = false;
                    this.z0 = z2;
                    if (i5 != 19) {
                    }
                    z3 = false;
                    this.A0 = z3;
                    if (i5 != 29) {
                    }
                    z4 = false;
                    this.B0 = z4;
                    if (i5 <= 23) {
                    }
                    if (i5 <= 19) {
                    }
                    z5 = false;
                    this.C0 = z5;
                    if (i5 != 21) {
                    }
                    z6 = false;
                    this.D0 = z6;
                    if (i5 < 21) {
                    }
                    z7 = false;
                    this.E0 = z7;
                    String str72222 = pt5Var.a;
                    if (i5 > 25) {
                    }
                    z8 = false;
                    this.H0 = z8;
                    this.q0.w();
                    if ("c2.android.mp3.decoder".equals(pt5Var.a)) {
                    }
                    if (this.U == 2) {
                    }
                    this.e1.a++;
                    I(str3, j, j - elapsedRealtime);
                }
            }
            i = 0;
            this.y0 = i;
            cu1 cu1Var222 = this.r0;
            if (i5 >= 21) {
            }
            z2 = false;
            this.z0 = z2;
            if (i5 != 19) {
            }
            z3 = false;
            this.A0 = z3;
            if (i5 != 29) {
            }
            z4 = false;
            this.B0 = z4;
            if (i5 <= 23) {
            }
            if (i5 <= 19) {
            }
            z5 = false;
            this.C0 = z5;
            if (i5 != 21) {
            }
            z6 = false;
            this.D0 = z6;
            if (i5 < 21) {
            }
            z7 = false;
            this.E0 = z7;
            String str722222 = pt5Var.a;
            if (i5 > 25) {
            }
            z8 = false;
            this.H0 = z8;
            this.q0.w();
            if ("c2.android.mp3.decoder".equals(pt5Var.a)) {
            }
            if (this.U == 2) {
            }
            this.e1.a++;
            I(str3, j, j - elapsedRealtime);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @TargetApi(23)
    public final void h0() {
        int i = this.V0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.c1 = true;
                    T();
                    return;
                }
                b0();
                Y();
                return;
            }
            Q();
            try {
                throw null;
            } catch (MediaCryptoException e) {
                throw n(6006, this.l0, e, false);
            }
        }
        Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x02c5, code lost:
        if (r1.m0 != null) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x036f, code lost:
        h0();
     */
    /* JADX WARN: Removed duplicated region for block: B:252:0x038e A[LOOP:2: B:350:0x0173->B:252:0x038e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03a4 A[Catch: IllegalStateException -> 0x03c1, TryCatch #13 {IllegalStateException -> 0x03c1, blocks: (B:258:0x039e, B:260:0x03a4, B:262:0x03aa, B:268:0x03bc), top: B:340:0x039e }] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03f6 A[Catch: IllegalStateException -> 0x03f8, DONT_GENERATE, TRY_LEAVE, TryCatch #5 {IllegalStateException -> 0x03f8, blocks: (B:285:0x03f3, B:286:0x03f5, B:287:0x03f6), top: B:328:0x03f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:299:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x035a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x039d A[EDGE_INSN: B:376:0x039d->B:257:0x039d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x038c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x03bc A[EDGE_INSN: B:381:0x03bc->B:268:0x03bc ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    @Override // defpackage.mk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(long j, long j2) {
        char c;
        int i;
        StackTraceElement[] stackTrace;
        boolean z;
        tt5 tt5Var;
        boolean z2;
        tt5 tt5Var2;
        boolean U;
        Object obj;
        tt5 tt5Var3;
        mt5 mt5Var;
        ByteBuffer byteBuffer;
        int i2;
        MediaCodec.BufferInfo bufferInfo;
        boolean z3;
        boolean z4;
        int j3;
        boolean z5;
        boolean z6;
        Object obj2;
        Object b;
        boolean z7;
        ?? r13;
        boolean z8;
        boolean z9;
        String str;
        boolean z10;
        tt5 tt5Var4 = this;
        boolean z11 = true;
        boolean z12 = false;
        try {
            if (tt5Var4.c1) {
                T();
                return;
            }
            int i3 = 2;
            if (tt5Var4.l0 == null && !tt5Var4.N(2)) {
                return;
            }
            Y();
            Object obj3 = null;
            int i4 = 4;
            try {
                try {
                    if (tt5Var4.P0) {
                        int i5 = zn4.a;
                        Trace.beginSection("bypassRender");
                        tt5 tt5Var5 = tt5Var4;
                        while (true) {
                            tv2.I(tt5Var5.c1 ^ z11);
                            it5 it5Var = tt5Var5.g0;
                            int i6 = it5Var.i;
                            if (i6 > 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                try {
                                    tt5Var4 = this;
                                    if (U(j, j2, null, it5Var.c, tt5Var5.L0, 0, i6, it5Var.e, it5Var.a(RecyclerView.UNDEFINED_DURATION), it5Var.a(i4), tt5Var5.m0)) {
                                        tt5Var4.Z(tt5Var4.g0.h);
                                        tt5Var4.g0.b();
                                        tt5Var5 = tt5Var4;
                                    } else {
                                        tt5Var5 = tt5Var4;
                                        break;
                                    }
                                } catch (IllegalStateException e) {
                                    e = e;
                                    tt5Var4 = this;
                                    c = 0;
                                    i = zn4.a;
                                    if (i >= 21) {
                                    }
                                    stackTrace = e.getStackTrace();
                                    if (stackTrace.length > 0) {
                                    }
                                    throw e;
                                }
                            }
                            z11 = true;
                            if (tt5Var5.b1) {
                                tt5Var5.c1 = true;
                                break;
                            }
                            if (tt5Var5.Q0) {
                                tv2.I(tt5Var5.g0.f(tt5Var5.f0));
                                r13 = 0;
                                tt5Var5.Q0 = false;
                            } else {
                                r13 = 0;
                            }
                            if (tt5Var5.R0) {
                                if (tt5Var5.g0.i > 0) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10) {
                                    D();
                                    tt5Var5.R0 = r13;
                                    Y();
                                    if (!tt5Var5.P0) {
                                        break;
                                    }
                                } else {
                                    i4 = 4;
                                }
                            }
                            tv2.I(!tt5Var5.b1);
                            vi1 vi1Var = tt5Var4.Q;
                            vi1Var.R = null;
                            vi1Var.Q = null;
                            tt5Var5.f0.b();
                            while (true) {
                                tt5Var5.f0.b();
                                int m = tt5Var5.m(vi1Var, tt5Var5.f0, r13);
                                if (m != -5) {
                                    if (m != -4) {
                                        i4 = 4;
                                        break;
                                    }
                                    i4 = 4;
                                    if (tt5Var5.f0.a(4)) {
                                        tt5Var5.b1 = true;
                                        break;
                                    }
                                    if (tt5Var5.d1) {
                                        cu1 cu1Var = tt5Var5.l0;
                                        cu1Var.getClass();
                                        tt5Var5.m0 = cu1Var;
                                        tt5Var5.P(cu1Var, null);
                                        tt5Var5.d1 = r13;
                                    }
                                    tt5Var5.f0.d();
                                    cu1 cu1Var2 = tt5Var5.l0;
                                    if (cu1Var2 != null && (str = cu1Var2.k) != null && str.equals("audio/opus")) {
                                        tt5Var5.k0.a(tt5Var5.f0);
                                    }
                                    if (!tt5Var5.g0.f(tt5Var5.f0)) {
                                        tt5Var5.Q0 = true;
                                        break;
                                    }
                                } else {
                                    i4 = 4;
                                    tt5Var5.C(vi1Var);
                                    break;
                                }
                            }
                            it5 it5Var2 = tt5Var5.g0;
                            if (it5Var2.i > 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                it5Var2.d();
                            }
                            if (tt5Var5.g0.i > 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (!z9 && !tt5Var5.b1 && !tt5Var5.R0) {
                                break;
                            }
                        }
                        Trace.endSection();
                        c = 0;
                        tt5Var4 = tt5Var5;
                    } else if (tt5Var4.q0 != null) {
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            int i7 = zn4.a;
                            Trace.beginSection("drainAndFeed");
                            tt5Var = tt5Var4;
                            while (true) {
                                try {
                                    if (tt5Var4.L0 >= 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    try {
                                        try {
                                            if (!z2) {
                                                if (tt5Var.D0 && tt5Var.X0) {
                                                    try {
                                                        j3 = tt5Var.q0.j(tt5Var.i0);
                                                    } catch (IllegalStateException unused) {
                                                        h0();
                                                        if (tt5Var.c1) {
                                                            b0();
                                                        }
                                                    }
                                                } else {
                                                    j3 = tt5Var.q0.j(tt5Var.i0);
                                                }
                                                if (j3 < 0) {
                                                    if (j3 == -2) {
                                                        tt5Var.Y0 = z11;
                                                        MediaFormat d = tt5Var.q0.d();
                                                        if (tt5Var.y0 != 0 && d.getInteger("width") == 32 && d.getInteger("height") == 32) {
                                                            tt5Var.G0 = z11;
                                                        } else {
                                                            tt5Var.s0 = d;
                                                            tt5Var.t0 = z11;
                                                        }
                                                        tt5Var3 = tt5Var;
                                                        obj = obj3;
                                                        tt5Var2 = tt5Var4;
                                                        c = 0;
                                                    } else if (tt5Var.H0) {
                                                        if (!tt5Var.b1) {
                                                            if (tt5Var.U0 == i3) {
                                                            }
                                                        }
                                                    }
                                                } else if (tt5Var.G0) {
                                                    tt5Var.G0 = z12;
                                                    tt5Var.q0.c(j3, z12);
                                                    tt5Var3 = tt5Var;
                                                    obj = obj3;
                                                    tt5Var2 = tt5Var4;
                                                    c = 0;
                                                } else {
                                                    MediaCodec.BufferInfo bufferInfo2 = tt5Var.i0;
                                                    if (bufferInfo2.size == 0 && (bufferInfo2.flags & i4) != 0) {
                                                        break;
                                                    }
                                                    tt5Var.L0 = j3;
                                                    ByteBuffer v = tt5Var.q0.v(j3);
                                                    tt5Var.M0 = v;
                                                    if (v != null) {
                                                        v.position(tt5Var.i0.offset);
                                                        ByteBuffer byteBuffer2 = tt5Var.M0;
                                                        MediaCodec.BufferInfo bufferInfo3 = tt5Var.i0;
                                                        byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
                                                    }
                                                    if (tt5Var.E0) {
                                                        MediaCodec.BufferInfo bufferInfo4 = tt5Var.i0;
                                                        if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & i4) != 0) {
                                                            long j4 = tt5Var.Z0;
                                                            if (j4 != -9223372036854775807L) {
                                                                bufferInfo4.presentationTimeUs = j4;
                                                            }
                                                        }
                                                    }
                                                    long j5 = tt5Var.i0.presentationTimeUs;
                                                    int size = tt5Var.h0.size();
                                                    int i8 = 0;
                                                    while (true) {
                                                        if (i8 < size) {
                                                            if (((Long) tt5Var.h0.get(i8)).longValue() == j5) {
                                                                tt5Var.h0.remove(i8);
                                                                z5 = true;
                                                                break;
                                                            }
                                                            i8++;
                                                        } else {
                                                            z5 = false;
                                                            break;
                                                        }
                                                    }
                                                    tt5Var.N0 = z5;
                                                    long j6 = tt5Var.a1;
                                                    long j7 = tt5Var.i0.presentationTimeUs;
                                                    if (j6 == j7) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    tt5Var.O0 = z6;
                                                    rl4 rl4Var = tt5Var.f1.c;
                                                    synchronized (rl4Var) {
                                                        obj2 = obj3;
                                                        while (rl4Var.d > 0 && j7 - rl4Var.a[rl4Var.c] >= 0) {
                                                            obj2 = rl4Var.b();
                                                        }
                                                    }
                                                    cu1 cu1Var3 = (cu1) obj2;
                                                    if (cu1Var3 == null && tt5Var.h1 && tt5Var.s0 != null) {
                                                        rl4 rl4Var2 = tt5Var.f1.c;
                                                        synchronized (rl4Var2) {
                                                            if (rl4Var2.d == 0) {
                                                                b = obj3;
                                                            } else {
                                                                b = rl4Var2.b();
                                                            }
                                                        }
                                                        cu1Var3 = (cu1) b;
                                                    }
                                                    if (cu1Var3 != null) {
                                                        tt5Var.m0 = cu1Var3;
                                                    } else if (tt5Var.t0) {
                                                    }
                                                    tt5Var.P(tt5Var.m0, tt5Var.s0);
                                                    tt5Var.t0 = z12;
                                                    tt5Var.h1 = z12;
                                                }
                                                try {
                                                    if (tt5Var3.n0 == -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= tt5Var3.n0) {
                                                        z4 = false;
                                                    } else {
                                                        z4 = true;
                                                    }
                                                    if (z4) {
                                                        tt5Var4 = tt5Var3;
                                                        break;
                                                    }
                                                    obj3 = obj;
                                                    tt5Var4 = tt5Var2;
                                                    tt5Var = tt5Var3;
                                                    i4 = 4;
                                                    i3 = 2;
                                                    z12 = false;
                                                    z11 = true;
                                                } catch (IllegalStateException e2) {
                                                    e = e2;
                                                    tt5Var4 = tt5Var3;
                                                    i = zn4.a;
                                                    if (i >= 21 || !(e instanceof MediaCodec$CodecException)) {
                                                        stackTrace = e.getStackTrace();
                                                        if (stackTrace.length > 0 || !stackTrace[c].getClassName().equals("android.media.MediaCodec")) {
                                                            throw e;
                                                        }
                                                    }
                                                    tt5Var4.H(e);
                                                    if (i >= 21 && (e instanceof MediaCodec$CodecException) && ((MediaCodec$CodecException) e).isRecoverable()) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                    if (z) {
                                                        b0();
                                                    }
                                                    throw tt5Var4.n(4003, tt5Var4.l0, tt5Var4.W(e, tt5Var4.x0), z);
                                                }
                                            }
                                            if (tt5Var.D0) {
                                                try {
                                                    if (tt5Var.X0) {
                                                        try {
                                                            mt5 mt5Var2 = tt5Var.q0;
                                                            ByteBuffer byteBuffer3 = tt5Var.M0;
                                                            int i9 = tt5Var.L0;
                                                            MediaCodec.BufferInfo bufferInfo5 = tt5Var.i0;
                                                            c = 0;
                                                            try {
                                                                U = U(j, j2, mt5Var2, byteBuffer3, i9, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, tt5Var.N0, tt5Var.O0, tt5Var.m0);
                                                                tt5Var2 = this;
                                                                if (U) {
                                                                    break;
                                                                }
                                                                try {
                                                                    tt5Var2.Z(tt5Var2.i0.presentationTimeUs);
                                                                    int i10 = tt5Var2.i0.flags & 4;
                                                                    tt5Var2.L0 = -1;
                                                                    obj = null;
                                                                    tt5Var2.M0 = null;
                                                                    if (i10 != 0) {
                                                                        break;
                                                                    }
                                                                    tt5Var3 = tt5Var2;
                                                                    if (tt5Var3.n0 == -9223372036854775807L) {
                                                                    }
                                                                    z4 = true;
                                                                    if (z4) {
                                                                    }
                                                                } catch (IllegalStateException e3) {
                                                                    e = e3;
                                                                    tt5Var4 = tt5Var2;
                                                                    i = zn4.a;
                                                                    if (i >= 21) {
                                                                    }
                                                                    stackTrace = e.getStackTrace();
                                                                    if (stackTrace.length > 0) {
                                                                    }
                                                                    throw e;
                                                                }
                                                            } catch (IllegalStateException unused2) {
                                                                try {
                                                                    h0();
                                                                    tt5Var4 = this;
                                                                    try {
                                                                        if (tt5Var4.c1) {
                                                                            b0();
                                                                        }
                                                                        tt5Var2 = tt5Var4;
                                                                        tt5Var4 = tt5Var2;
                                                                        do {
                                                                            try {
                                                                                if (!M()) {
                                                                                }
                                                                            } catch (IllegalStateException e4) {
                                                                                e = e4;
                                                                                i = zn4.a;
                                                                                if (i >= 21) {
                                                                                }
                                                                                stackTrace = e.getStackTrace();
                                                                                if (stackTrace.length > 0) {
                                                                                }
                                                                                throw e;
                                                                            }
                                                                        } while (z3);
                                                                        Trace.endSection();
                                                                        synchronized (tt5Var4.e1) {
                                                                        }
                                                                    } catch (IllegalStateException e5) {
                                                                        e = e5;
                                                                        i = zn4.a;
                                                                        if (i >= 21) {
                                                                        }
                                                                        stackTrace = e.getStackTrace();
                                                                        if (stackTrace.length > 0) {
                                                                        }
                                                                        throw e;
                                                                    }
                                                                } catch (IllegalStateException e6) {
                                                                    e = e6;
                                                                    tt5Var4 = this;
                                                                }
                                                            }
                                                        } catch (IllegalStateException unused3) {
                                                            c = 0;
                                                        }
                                                    }
                                                } catch (IllegalStateException e7) {
                                                    e = e7;
                                                    c = 0;
                                                    tt5Var4 = tt5Var;
                                                    i = zn4.a;
                                                    if (i >= 21) {
                                                    }
                                                    stackTrace = e.getStackTrace();
                                                    if (stackTrace.length > 0) {
                                                    }
                                                    throw e;
                                                }
                                            }
                                            U = U(j, j2, mt5Var, byteBuffer, i2, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, tt5Var.N0, tt5Var.O0, tt5Var.m0);
                                            tt5Var2 = this;
                                            if (U) {
                                            }
                                        } catch (IllegalStateException e8) {
                                            e = e8;
                                            tt5Var2 = this;
                                            tt5Var4 = tt5Var2;
                                            i = zn4.a;
                                            if (i >= 21) {
                                            }
                                            stackTrace = e.getStackTrace();
                                            if (stackTrace.length > 0) {
                                            }
                                            throw e;
                                        }
                                        mt5Var = tt5Var.q0;
                                        byteBuffer = tt5Var.M0;
                                        i2 = tt5Var.L0;
                                        bufferInfo = tt5Var.i0;
                                    } catch (IllegalStateException e9) {
                                        e = e9;
                                        tt5Var4 = tt5Var;
                                        i = zn4.a;
                                        if (i >= 21) {
                                        }
                                        stackTrace = e.getStackTrace();
                                        if (stackTrace.length > 0) {
                                        }
                                        throw e;
                                    }
                                    c = 0;
                                } catch (IllegalStateException e10) {
                                    e = e10;
                                    c = 0;
                                }
                            }
                            h0();
                            c = 0;
                            tt5Var4 = tt5Var;
                            do {
                                if (!M()) {
                                    break;
                                }
                                if (tt5Var4.n0 != -9223372036854775807L && SystemClock.elapsedRealtime() - elapsedRealtime >= tt5Var4.n0) {
                                    z3 = false;
                                    continue;
                                }
                                z3 = true;
                            } while (z3);
                            Trace.endSection();
                        } catch (IllegalStateException e11) {
                            e = e11;
                            c = 0;
                        }
                    } else {
                        c = 0;
                        try {
                            nk5 nk5Var = tt5Var4.e1;
                            int i11 = nk5Var.d;
                            ww5 ww5Var = tt5Var4.V;
                            ww5Var.getClass();
                            nk5Var.d = i11 + ww5Var.c(j - tt5Var4.X);
                            try {
                                tt5Var4.N(1);
                                tt5Var4 = tt5Var4;
                                synchronized (tt5Var4.e1) {
                                }
                                return;
                            } catch (IllegalStateException e12) {
                                e = e12;
                                tt5Var4 = tt5Var4;
                                i = zn4.a;
                                if (i >= 21) {
                                }
                                stackTrace = e.getStackTrace();
                                if (stackTrace.length > 0) {
                                }
                                throw e;
                            }
                        } catch (IllegalStateException e13) {
                            e = e13;
                        }
                    }
                    synchronized (tt5Var4.e1) {
                    }
                } catch (IllegalStateException e14) {
                    e = e14;
                    i = zn4.a;
                    if (i >= 21) {
                    }
                    stackTrace = e.getStackTrace();
                    if (stackTrace.length > 0) {
                    }
                    throw e;
                }
            } catch (IllegalStateException e15) {
                e = e15;
                c = 0;
                tt5Var4 = tt5Var;
                i = zn4.a;
                if (i >= 21) {
                }
                stackTrace = e.getStackTrace();
                if (stackTrace.length > 0) {
                }
                throw e;
            }
        } catch (IllegalStateException e16) {
            e = e16;
            c = 0;
        }
    }

    @Override // defpackage.mk5
    public boolean k() {
        boolean b;
        boolean z;
        if (this.l0 == null) {
            return false;
        }
        if (g()) {
            b = this.Z;
        } else {
            ww5 ww5Var = this.V;
            ww5Var.getClass();
            b = ww5Var.b();
        }
        if (!b) {
            if (this.L0 >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.J0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.J0) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.mk5
    public final int l(cu1 cu1Var) {
        try {
            return A(this.b0, cu1Var);
        } catch (xt5 e) {
            throw n(4002, cu1Var, e, false);
        }
    }

    @Override // defpackage.mk5
    public final int o() {
        return 8;
    }

    @Override // defpackage.mk5
    public void r() {
        this.l0 = null;
        K(st5.d);
        this.j0.clear();
        e0();
    }

    @Override // defpackage.mk5
    public void t(long j, boolean z) {
        int i;
        this.b1 = false;
        this.c1 = false;
        if (this.P0) {
            this.g0.b();
            this.f0.b();
            this.Q0 = false;
        } else if (e0()) {
            Y();
        }
        rl4 rl4Var = this.f1.c;
        synchronized (rl4Var) {
            i = rl4Var.d;
        }
        if (i > 0) {
            this.d1 = true;
        }
        synchronized (rl4Var) {
            rl4Var.c = 0;
            rl4Var.d = 0;
            Arrays.fill(rl4Var.b, (Object) null);
        }
        this.j0.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r6 >= r5.Z0) goto L12;
     */
    @Override // defpackage.mk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(long j, long j2) {
        if (this.f1.b != -9223372036854775807L) {
            if (this.j0.isEmpty()) {
                long j3 = this.g1;
                if (j3 != -9223372036854775807L) {
                }
            }
            this.j0.add(new st5(this.Z0, j2));
            return;
        }
        K(new st5(-9223372036854775807L, j2));
    }

    public abstract float z(float f, cu1[] cu1VarArr);
}