package defpackage;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm$MediaDrmStateException;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;
import android.media.metrics.TrackChangeEvent$Builder;
import android.net.Uri;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import androidx.databinding.ViewDataBinding;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: tp5  reason: default package */
public final class tp5 implements jo5, up5 {
    public final Context P;
    public final rp5 Q;
    public final PlaybackSession R;
    public String X;
    public PlaybackMetrics$Builder Y;
    public int Z;
    public e03 c0;
    public sp5 d0;
    public sp5 e0;
    public sp5 f0;
    public cu1 g0;
    public cu1 h0;
    public cu1 i0;
    public boolean j0;
    public boolean k0;
    public int l0;
    public int m0;
    public int n0;
    public boolean o0;
    public final lc3 T = new lc3();
    public final ya3 U = new ya3();
    public final HashMap W = new HashMap();
    public final HashMap V = new HashMap();
    public final long S = SystemClock.elapsedRealtime();
    public int a0 = 0;
    public int b0 = 0;

    public tp5(Context context, PlaybackSession playbackSession) {
        this.P = context.getApplicationContext();
        this.R = playbackSession;
        rp5 rp5Var = new rp5();
        this.Q = rp5Var;
        rp5Var.d = this;
    }

    @SuppressLint({"SwitchIntDef"})
    public static int h(int i) {
        switch (zn4.k(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case 6004:
                return 25;
            case 6005:
                return 26;
            default:
                return 27;
        }
    }

    @Override // defpackage.jo5
    public final void a(io5 io5Var, lv5 lv5Var) {
        String str;
        ov5 ov5Var = io5Var.d;
        if (ov5Var == null) {
            return;
        }
        cu1 cu1Var = lv5Var.b;
        cu1Var.getClass();
        rp5 rp5Var = this.Q;
        kd3 kd3Var = io5Var.b;
        synchronized (rp5Var) {
            str = rp5Var.b(kd3Var.n(ov5Var.a, rp5Var.b).c, ov5Var).a;
        }
        sp5 sp5Var = new sp5(cu1Var, str);
        int i = lv5Var.a;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.f0 = sp5Var;
                    return;
                }
            } else {
                this.e0 = sp5Var;
                return;
            }
        }
        this.d0 = sp5Var;
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void b(cu1 cu1Var) {
    }

    @Override // defpackage.jo5
    public final void c(wo3 wo3Var) {
        sp5 sp5Var = this.d0;
        if (sp5Var != null) {
            cu1 cu1Var = sp5Var.a;
            if (cu1Var.q == -1) {
                bs1 bs1Var = new bs1(cu1Var);
                bs1Var.o = wo3Var.a;
                bs1Var.p = wo3Var.b;
                this.d0 = new sp5(new cu1(bs1Var), sp5Var.b);
            }
        }
    }

    public final void d(io5 io5Var, String str) {
        ov5 ov5Var = io5Var.d;
        if (ov5Var == null || !ov5Var.a()) {
            i();
            this.X = str;
            this.Y = new PlaybackMetrics$Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.0.0-rc02");
            p(io5Var.b, io5Var.d);
        }
    }

    @Override // defpackage.jo5
    public final void e(nk5 nk5Var) {
        this.l0 += nk5Var.g;
        this.m0 += nk5Var.e;
    }

    @Override // defpackage.jo5
    public final void f(IOException iOException) {
    }

    public final void g(io5 io5Var, String str) {
        ov5 ov5Var = io5Var.d;
        if ((ov5Var == null || !ov5Var.a()) && str.equals(this.X)) {
            i();
        }
        this.V.remove(str);
        this.W.remove(str);
    }

    public final void i() {
        PlaybackMetrics$Builder playbackMetrics$Builder = this.Y;
        if (playbackMetrics$Builder != null && this.o0) {
            playbackMetrics$Builder.setAudioUnderrunCount(this.n0);
            this.Y.setVideoFramesDropped(this.l0);
            this.Y.setVideoFramesPlayed(this.m0);
            Long l = (Long) this.V.get(this.X);
            this.Y.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.W.get(this.X);
            this.Y.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.Y.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.R.reportPlaybackMetrics(this.Y.build());
        }
        this.Y = null;
        this.X = null;
        this.n0 = 0;
        this.l0 = 0;
        this.m0 = 0;
        this.g0 = null;
        this.h0 = null;
        this.i0 = null;
        this.o0 = false;
    }

    @Override // defpackage.jo5
    public final void j(e03 e03Var) {
        this.c0 = e03Var;
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void k(cu1 cu1Var) {
    }

    @Override // defpackage.jo5
    public final void l(io5 io5Var, int i, long j) {
        String str;
        long longValue;
        ov5 ov5Var = io5Var.d;
        if (ov5Var != null) {
            rp5 rp5Var = this.Q;
            kd3 kd3Var = io5Var.b;
            synchronized (rp5Var) {
                str = rp5Var.b(kd3Var.n(ov5Var.a, rp5Var.b).c, ov5Var).a;
            }
            Long l = (Long) this.W.get(str);
            Long l2 = (Long) this.V.get(str);
            HashMap hashMap = this.W;
            long j2 = 0;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            hashMap.put(str, Long.valueOf(longValue + j));
            HashMap hashMap2 = this.V;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            hashMap2.put(str, Long.valueOf(j2 + i));
        }
    }

    @Override // defpackage.jo5
    public final void m(int i) {
        if (i == 1) {
            this.j0 = true;
            i = 1;
        }
        this.Z = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:252:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x042c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v68, types: [android.media.metrics.PlaybackStateEvent$Builder] */
    /* JADX WARN: Type inference failed for: r2v74, types: [android.media.metrics.NetworkEvent$Builder] */
    /* JADX WARN: Type inference failed for: r4v8, types: [android.media.metrics.PlaybackErrorEvent$Builder] */
    @Override // defpackage.jo5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(o73 o73Var, f2 f2Var) {
        boolean z;
        int errorCode;
        int i;
        int i2;
        boolean z2;
        gg4 a;
        int i3;
        int i4;
        int i5;
        up5 up5Var;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        int i10;
        int i11;
        al1 al1Var;
        int i12;
        int i13;
        if (((hp1) f2Var.P).a.size() != 0) {
            for (int i14 = 0; i14 < ((hp1) f2Var.P).a.size(); i14++) {
                int a2 = ((hp1) f2Var.P).a(i14);
                io5 io5Var = (io5) ((SparseArray) f2Var.Q).get(a2);
                io5Var.getClass();
                if (a2 == 0) {
                    rp5 rp5Var = this.Q;
                    synchronized (rp5Var) {
                        rp5Var.d.getClass();
                        kd3 kd3Var = rp5Var.e;
                        rp5Var.e = io5Var.b;
                        Iterator it = rp5Var.c.values().iterator();
                        while (it.hasNext()) {
                            qp5 qp5Var = (qp5) it.next();
                            if (!qp5Var.b(kd3Var, rp5Var.e) || qp5Var.a(io5Var)) {
                                it.remove();
                                if (qp5Var.e) {
                                    if (qp5Var.a.equals(rp5Var.f)) {
                                        rp5Var.f = null;
                                    }
                                    ((tp5) rp5Var.d).g(io5Var, qp5Var.a);
                                }
                            }
                        }
                        rp5Var.c(io5Var);
                    }
                } else if (a2 == 11) {
                    rp5 rp5Var2 = this.Q;
                    int i15 = this.Z;
                    synchronized (rp5Var2) {
                        rp5Var2.d.getClass();
                        Iterator it2 = rp5Var2.c.values().iterator();
                        while (it2.hasNext()) {
                            qp5 qp5Var2 = (qp5) it2.next();
                            if (qp5Var2.a(io5Var)) {
                                it2.remove();
                                if (qp5Var2.e) {
                                    boolean equals = qp5Var2.a.equals(rp5Var2.f);
                                    if (i15 == 0 && equals) {
                                        boolean z4 = qp5Var2.f;
                                    }
                                    if (equals) {
                                        rp5Var2.f = null;
                                    }
                                    ((tp5) rp5Var2.d).g(io5Var, qp5Var2.a);
                                }
                            }
                        }
                        rp5Var2.c(io5Var);
                    }
                } else {
                    this.Q.a(io5Var);
                }
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (f2Var.a(0)) {
                io5 io5Var2 = (io5) ((SparseArray) f2Var.Q).get(0);
                io5Var2.getClass();
                if (this.Y != null) {
                    p(io5Var2.b, io5Var2.d);
                }
            }
            if (f2Var.a(2) && this.Y != null) {
                nv4 nv4Var = o73Var.t().a;
                int size = nv4Var.size();
                int i16 = 0;
                loop3: while (true) {
                    if (i16 < size) {
                        dk3 dk3Var = (dk3) nv4Var.get(i16);
                        int i17 = 0;
                        while (true) {
                            dk3Var.getClass();
                            i13 = i16 + 1;
                            if (i17 <= 0) {
                                if (dk3Var.c[i17] && (al1Var = dk3Var.a.c[i17].n) != null) {
                                    break loop3;
                                }
                                i17++;
                            }
                        }
                    } else {
                        al1Var = null;
                        break;
                    }
                    i16 = i13;
                }
                if (al1Var != null) {
                    PlaybackMetrics$Builder playbackMetrics$Builder = this.Y;
                    int i18 = zn4.a;
                    int i19 = 0;
                    while (true) {
                        if (i19 < al1Var.S) {
                            UUID uuid = al1Var.P[i19].Q;
                            if (uuid.equals(cq5.d)) {
                                i12 = 3;
                                break;
                            } else if (uuid.equals(cq5.e)) {
                                i12 = 2;
                                break;
                            } else if (uuid.equals(cq5.c)) {
                                i12 = 6;
                                break;
                            } else {
                                i19++;
                            }
                        } else {
                            i12 = 1;
                            break;
                        }
                    }
                    playbackMetrics$Builder.setDrmType(i12);
                }
            }
            if (f2Var.a(1011)) {
                this.n0++;
            }
            e03 e03Var = this.c0;
            if (e03Var != null) {
                Context context = this.P;
                int i20 = 23;
                if (e03Var.P == 1001) {
                    i20 = 20;
                } else {
                    tk5 tk5Var = (tk5) e03Var;
                    if (tk5Var.R == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    int i21 = tk5Var.V;
                    Throwable cause = e03Var.getCause();
                    cause.getClass();
                    if (cause instanceof IOException) {
                        if (cause instanceof ja5) {
                            errorCode = ((ja5) cause).R;
                            i20 = 5;
                        } else if (cause instanceof jy2) {
                            errorCode = 0;
                            i20 = 11;
                        } else {
                            boolean z5 = cause instanceof g95;
                            if (!z5 && !(cause instanceof zf5)) {
                                if (e03Var.P == 1002) {
                                    errorCode = 0;
                                    i20 = 21;
                                } else if (cause instanceof hs5) {
                                    Throwable cause2 = cause.getCause();
                                    cause2.getClass();
                                    int i22 = zn4.a;
                                    if (i22 >= 21 && (cause2 instanceof MediaDrm$MediaDrmStateException)) {
                                        errorCode = zn4.l(((MediaDrm$MediaDrmStateException) cause2).getDiagnosticInfo());
                                        i20 = h(errorCode);
                                    } else if (i22 >= 23 && (cause2 instanceof MediaDrmResetException)) {
                                        i20 = 27;
                                    } else if (cause2 instanceof NotProvisionedException) {
                                        i20 = 24;
                                    } else if (cause2 instanceof DeniedByServerException) {
                                        i20 = 29;
                                    } else if (!(cause2 instanceof ps5)) {
                                        i20 = 30;
                                    }
                                } else if ((cause instanceof w65) && (cause.getCause() instanceof FileNotFoundException)) {
                                    Throwable cause3 = cause.getCause();
                                    cause3.getClass();
                                    Throwable cause4 = cause3.getCause();
                                    i20 = (zn4.a >= 21 && (cause4 instanceof ErrnoException) && ((ErrnoException) cause4).errno == OsConstants.EACCES) ? 32 : 31;
                                } else {
                                    errorCode = 0;
                                    i20 = 9;
                                }
                            } else {
                                gg4 a3 = gg4.a(context);
                                synchronized (a3.c) {
                                    i = a3.d;
                                }
                                if (i == 1) {
                                    errorCode = 0;
                                    i20 = 3;
                                } else {
                                    Throwable cause5 = cause.getCause();
                                    if (cause5 instanceof UnknownHostException) {
                                        errorCode = 0;
                                        i20 = 6;
                                    } else if (cause5 instanceof SocketTimeoutException) {
                                        errorCode = 0;
                                        i20 = 7;
                                    } else if (z5 && ((g95) cause).Q == 1) {
                                        errorCode = 0;
                                        i20 = 4;
                                    } else {
                                        errorCode = 0;
                                        i20 = 8;
                                    }
                                }
                            }
                        }
                        this.R.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                            static {
                                throw new NoClassDefFoundError();
                            }

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent build();

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i23);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i23);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j);
                        }.setTimeSinceCreatedMillis(elapsedRealtime - this.S).setErrorCode(i20).setSubErrorCode(errorCode).setException(e03Var).build());
                        this.o0 = true;
                        this.c0 = null;
                    } else if (z && (i21 == 0 || i21 == 1)) {
                        i20 = 35;
                    } else if (z && i21 == 3) {
                        i20 = 15;
                    } else if (!z || i21 != 2) {
                        if (cause instanceof rt5) {
                            errorCode = zn4.l(((rt5) cause).R);
                            i20 = 13;
                        } else {
                            if (cause instanceof nt5) {
                                errorCode = zn4.l(((nt5) cause).P);
                            } else if (cause instanceof OutOfMemoryError) {
                                errorCode = 0;
                            } else if (cause instanceof qq5) {
                                errorCode = ((qq5) cause).P;
                                i20 = 17;
                            } else if (cause instanceof sq5) {
                                errorCode = ((sq5) cause).P;
                                i20 = 18;
                            } else {
                                int i23 = zn4.a;
                                if (cause instanceof MediaCodec.CryptoException) {
                                    errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                    i20 = h(errorCode);
                                } else {
                                    i20 = 22;
                                }
                            }
                            i20 = 14;
                        }
                        this.R.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                            static {
                                throw new NoClassDefFoundError();
                            }

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent build();

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i232);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i232);

                            @NonNull
                            public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j);
                        }.setTimeSinceCreatedMillis(elapsedRealtime - this.S).setErrorCode(i20).setSubErrorCode(errorCode).setException(e03Var).build());
                        this.o0 = true;
                        this.c0 = null;
                    }
                }
                errorCode = 0;
                this.R.reportPlaybackErrorEvent(new Object() { // from class: android.media.metrics.PlaybackErrorEvent$Builder
                    static {
                        throw new NoClassDefFoundError();
                    }

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent build();

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setErrorCode(int i232);

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setException(@NonNull Exception exc);

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setSubErrorCode(int i232);

                    @NonNull
                    public native /* synthetic */ PlaybackErrorEvent$Builder setTimeSinceCreatedMillis(long j);
                }.setTimeSinceCreatedMillis(elapsedRealtime - this.S).setErrorCode(i20).setSubErrorCode(errorCode).setException(e03Var).build());
                this.o0 = true;
                this.c0 = null;
            }
            if (f2Var.a(2)) {
                vk3 t = o73Var.t();
                boolean a4 = t.a(2);
                boolean a5 = t.a(1);
                boolean a6 = t.a(3);
                if (!a4 && !a5) {
                    if (a6) {
                        z3 = true;
                    }
                } else {
                    z3 = a6;
                }
                if (!a4 && !zn4.b(this.g0, null)) {
                    if (this.g0 == null) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    this.g0 = null;
                    i2 = 4;
                    z2 = true;
                    q(1, elapsedRealtime, null, i11);
                } else {
                    i2 = 4;
                    z2 = true;
                }
                if (!a5 && !zn4.b(this.h0, null)) {
                    if (this.h0 == null) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    this.h0 = null;
                    q(0, elapsedRealtime, null, i10);
                }
                if (!z3 && !zn4.b(this.i0, null)) {
                    if (this.i0 == null) {
                        i9 = 1;
                    } else {
                        i9 = 0;
                    }
                    this.i0 = null;
                    q(2, elapsedRealtime, null, i9);
                }
                if (r(this.d0)) {
                    cu1 cu1Var = this.d0.a;
                    if (cu1Var.q != -1) {
                        if (!zn4.b(this.g0, cu1Var)) {
                            if (this.g0 == null) {
                                i8 = 1;
                            } else {
                                i8 = 0;
                            }
                            this.g0 = cu1Var;
                            q(1, elapsedRealtime, cu1Var, i8);
                        }
                        this.d0 = null;
                    }
                }
                if (r(this.e0)) {
                    cu1 cu1Var2 = this.e0.a;
                    if (!zn4.b(this.h0, cu1Var2)) {
                        if (this.h0 == null) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        this.h0 = cu1Var2;
                        q(0, elapsedRealtime, cu1Var2, i7);
                    }
                    this.e0 = null;
                }
                if (r(this.f0)) {
                    cu1 cu1Var3 = this.f0.a;
                    if (!zn4.b(this.i0, cu1Var3)) {
                        if (this.i0 == null) {
                            i6 = 1;
                        } else {
                            i6 = 0;
                        }
                        this.i0 = cu1Var3;
                        q(2, elapsedRealtime, cu1Var3, i6);
                    }
                    this.f0 = null;
                }
                a = gg4.a(this.P);
                synchronized (a.c) {
                    i3 = a.d;
                }
                switch (i3) {
                    case 0:
                        i4 = 0;
                        break;
                    case 1:
                        i4 = 9;
                        break;
                    case 2:
                        i4 = 2;
                        break;
                    case 3:
                        i4 = 4;
                        break;
                    case 4:
                        i4 = 5;
                        break;
                    case 5:
                        i4 = 6;
                        break;
                    case 6:
                    case 8:
                    default:
                        i4 = 1;
                        break;
                    case 7:
                        i4 = 3;
                        break;
                    case 9:
                        i4 = 8;
                        break;
                    case 10:
                        i4 = 7;
                        break;
                }
                if (i4 != this.b0) {
                    this.b0 = i4;
                    this.R.reportNetworkEvent(new Object() { // from class: android.media.metrics.NetworkEvent$Builder
                        static {
                            throw new NoClassDefFoundError();
                        }

                        @NonNull
                        public native /* synthetic */ NetworkEvent build();

                        @NonNull
                        public native /* synthetic */ NetworkEvent$Builder setNetworkType(int i24);

                        @NonNull
                        public native /* synthetic */ NetworkEvent$Builder setTimeSinceCreatedMillis(long j);
                    }.setNetworkType(i4).setTimeSinceCreatedMillis(elapsedRealtime - this.S).build());
                }
                if (o73Var.e() != 2) {
                    this.j0 = false;
                }
                co5 co5Var = (co5) o73Var;
                co5Var.c.a();
                bm5 bm5Var = co5Var.b;
                bm5Var.D();
                if (bm5Var.S.f == null) {
                    this.k0 = false;
                } else if (f2Var.a(10)) {
                    this.k0 = z2;
                }
                int e = o73Var.e();
                if (this.j0) {
                    i5 = 5;
                } else if (this.k0) {
                    i5 = 13;
                } else if (e == i2) {
                    i5 = 11;
                } else if (e == 2) {
                    int i24 = this.a0;
                    if (i24 != 0 && i24 != 2) {
                        if (!o73Var.r()) {
                            i5 = 7;
                        } else if (o73Var.h() != 0) {
                            i5 = 10;
                        } else {
                            i5 = 6;
                        }
                    } else {
                        i5 = 2;
                    }
                } else if (e == 3) {
                    if (!o73Var.r()) {
                        i5 = 4;
                    } else if (o73Var.h() != 0) {
                        i5 = 9;
                    } else {
                        i5 = 3;
                    }
                } else if (e == z2 && this.a0 != 0) {
                    i5 = 12;
                } else {
                    i5 = this.a0;
                }
                if (this.a0 != i5) {
                    this.a0 = i5;
                    this.o0 = z2;
                    this.R.reportPlaybackStateEvent(new Object() { // from class: android.media.metrics.PlaybackStateEvent$Builder
                        static {
                            throw new NoClassDefFoundError();
                        }

                        @NonNull
                        public native /* synthetic */ PlaybackStateEvent build();

                        @NonNull
                        public native /* synthetic */ PlaybackStateEvent$Builder setState(int i25);

                        @NonNull
                        public native /* synthetic */ PlaybackStateEvent$Builder setTimeSinceCreatedMillis(long j);
                    }.setState(this.a0).setTimeSinceCreatedMillis(elapsedRealtime - this.S).build());
                }
                if (f2Var.a(1028)) {
                    rp5 rp5Var3 = this.Q;
                    io5 io5Var3 = (io5) ((SparseArray) f2Var.Q).get(1028);
                    io5Var3.getClass();
                    synchronized (rp5Var3) {
                        rp5Var3.f = null;
                        Iterator it3 = rp5Var3.c.values().iterator();
                        while (it3.hasNext()) {
                            qp5 qp5Var3 = (qp5) it3.next();
                            it3.remove();
                            if (qp5Var3.e && (up5Var = rp5Var3.d) != null) {
                                ((tp5) up5Var).g(io5Var3, qp5Var3.a);
                            }
                        }
                    }
                    return;
                }
                return;
            }
            i2 = 4;
            z2 = true;
            if (r(this.d0)) {
            }
            if (r(this.e0)) {
            }
            if (r(this.f0)) {
            }
            a = gg4.a(this.P);
            synchronized (a.c) {
            }
        }
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void o() {
    }

    @RequiresNonNull({"metricsBuilder"})
    public final void p(kd3 kd3Var, ov5 ov5Var) {
        int i;
        PlaybackMetrics$Builder playbackMetrics$Builder = this.Y;
        if (ov5Var == null) {
            return;
        }
        int a = kd3Var.a(ov5Var.a);
        char c = 65535;
        if (a == -1) {
            return;
        }
        int i2 = 0;
        kd3Var.d(a, this.U, false);
        kd3Var.e(this.U.c, this.T, 0L);
        gg2 gg2Var = this.T.b.b;
        int i3 = 2;
        if (gg2Var != null) {
            Uri uri = gg2Var.a;
            int i4 = zn4.a;
            String scheme = uri.getScheme();
            if (scheme != null && q05.m("rtsp", scheme)) {
                i2 = 3;
            } else {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    int lastIndexOf = lastPathSegment.lastIndexOf(46);
                    if (lastIndexOf >= 0) {
                        String c2 = q05.c(lastPathSegment.substring(lastIndexOf + 1));
                        c2.getClass();
                        switch (c2.hashCode()) {
                            case 104579:
                                if (c2.equals("ism")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108321:
                                if (c2.equals("mpd")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3242057:
                                if (c2.equals("isml")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 3299913:
                                if (c2.equals("m3u8")) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c) {
                            case 0:
                            case 2:
                                i = 1;
                                break;
                            case 1:
                                i = 0;
                                break;
                            case 3:
                                i = 2;
                                break;
                            default:
                                i = 4;
                                break;
                        }
                        if (i != 4) {
                            i2 = i;
                        }
                    }
                    Pattern pattern = zn4.g;
                    String path = uri.getPath();
                    path.getClass();
                    Matcher matcher = pattern.matcher(path);
                    if (matcher.matches()) {
                        String group = matcher.group(2);
                        if (group != null) {
                            if (!group.contains("format=mpd-time-csf")) {
                                if (group.contains("format=m3u8-aapl")) {
                                    i2 = 2;
                                }
                            }
                        }
                        i2 = 1;
                    }
                }
                i2 = 4;
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        i2 = 1;
                    } else {
                        i2 = 4;
                    }
                } else {
                    i2 = 5;
                }
            } else {
                i2 = 3;
            }
        }
        playbackMetrics$Builder.setStreamType(i2);
        lc3 lc3Var = this.T;
        if (lc3Var.k != -9223372036854775807L && !lc3Var.j && !lc3Var.g && !lc3Var.b()) {
            playbackMetrics$Builder.setMediaDurationMillis(zn4.s(this.T.k));
        }
        if (true != this.T.b()) {
            i3 = 1;
        }
        playbackMetrics$Builder.setPlaybackType(i3);
        this.o0 = true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.metrics.TrackChangeEvent$Builder] */
    public final void q(final int i, long j, cu1 cu1Var, int i2) {
        TrackChangeEvent$Builder timeSinceCreatedMillis = new Object(i) { // from class: android.media.metrics.TrackChangeEvent$Builder
            static {
                throw new NoClassDefFoundError();
            }

            @NonNull
            public native /* synthetic */ TrackChangeEvent build();

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setAudioSampleRate(int i3);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setBitrate(int i3);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setChannelCount(int i3);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setCodecName(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setContainerMimeType(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setHeight(int i3);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setLanguage(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setLanguageRegion(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setSampleMimeType(@NonNull String str);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTimeSinceCreatedMillis(long j2);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTrackChangeReason(int i3);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setTrackState(int i3);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setVideoFrameRate(float f);

            @NonNull
            public native /* synthetic */ TrackChangeEvent$Builder setWidth(int i3);
        }.setTimeSinceCreatedMillis(j - this.S);
        if (cu1Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            String str = cu1Var.j;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = cu1Var.k;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = cu1Var.h;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = cu1Var.g;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = cu1Var.p;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = cu1Var.q;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = cu1Var.x;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = cu1Var.y;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            String str4 = cu1Var.c;
            if (str4 != null) {
                int i8 = zn4.a;
                String[] split = str4.split("-", -1);
                Pair create = Pair.create(split[0], split.length >= 2 ? split[1] : null);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = cu1Var.r;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.o0 = true;
        this.R.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @EnsuresNonNullIf(expression = {"#1"}, result = ViewDataBinding.a0)
    public final boolean r(sp5 sp5Var) {
        String str;
        if (sp5Var != null) {
            String str2 = sp5Var.b;
            rp5 rp5Var = this.Q;
            synchronized (rp5Var) {
                str = rp5Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void u0(int i) {
    }

    @Override // defpackage.jo5
    public final /* synthetic */ void w(int i) {
    }
}