package defpackage;

import defpackage.cv;
import defpackage.iv;
import defpackage.su;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: hv  reason: default package */
public final class hv implements Closeable {
    public static final Logger T = Logger.getLogger(uu.class.getName());
    public final bb P;
    public final a Q;
    public final boolean R;
    public final su.a S;

    /* renamed from: hv$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a implements mt0 {
        public final bb P;
        public int Q;
        public byte R;
        public int S;
        public int T;
        public short U;

        public a(bb bbVar) {
            this.P = bbVar;
        }

        @Override // defpackage.mt0
        public final cx0 c() {
            return this.P.c();
        }

        @Override // defpackage.mt0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // defpackage.mt0
        public final long q(za zaVar, long j) {
            int i;
            int readInt;
            do {
                int i2 = this.T;
                if (i2 == 0) {
                    this.P.skip(this.U);
                    this.U = (short) 0;
                    if ((this.R & 4) != 0) {
                        return -1L;
                    }
                    i = this.S;
                    bb bbVar = this.P;
                    int readByte = (bbVar.readByte() & 255) | ((bbVar.readByte() & 255) << 16) | ((bbVar.readByte() & 255) << 8);
                    this.T = readByte;
                    this.Q = readByte;
                    byte readByte2 = (byte) (this.P.readByte() & 255);
                    this.R = (byte) (this.P.readByte() & 255);
                    Logger logger = hv.T;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(uu.a(true, this.S, this.Q, readByte2, this.R));
                    }
                    readInt = this.P.readInt() & Integer.MAX_VALUE;
                    this.S = readInt;
                    if (readByte2 != 9) {
                        uu.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte2));
                        throw null;
                    }
                } else {
                    long q = this.P.q(zaVar, Math.min(8192L, i2));
                    if (q == -1) {
                        return -1L;
                    }
                    this.T = (int) (this.T - q);
                    return q;
                }
            } while (readInt == i);
            uu.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }
    }

    /* renamed from: hv$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
    }

    public hv(bb bbVar, boolean z) {
        this.P = bbVar;
        this.R = z;
        a aVar = new a(bbVar);
        this.Q = aVar;
        this.S = new su.a(aVar);
    }

    public static int a(int i, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        uu.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    public final void E(b bVar, int i, byte b2, int i2) {
        boolean z = false;
        if (i == 8) {
            if (i2 == 0) {
                int readInt = this.P.readInt();
                int readInt2 = this.P.readInt();
                if ((b2 & 1) != 0) {
                    z = true;
                }
                cv.e eVar = (cv.e) bVar;
                eVar.getClass();
                if (z) {
                    synchronized (cv.this) {
                        try {
                            if (readInt == 1) {
                                cv.this.a0++;
                            } else if (readInt == 2) {
                                cv.this.c0++;
                            } else if (readInt == 3) {
                                cv cvVar = cv.this;
                                cvVar.getClass();
                                cvVar.notifyAll();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                try {
                    cv cvVar2 = cv.this;
                    cvVar2.W.execute(new cv.d(readInt, readInt2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            uu.b("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
        uu.b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        throw null;
    }

    public final void F(b bVar, int i, int i2) {
        if (i == 4) {
            long readInt = this.P.readInt() & 2147483647L;
            if (readInt != 0) {
                cv.e eVar = (cv.e) bVar;
                cv cvVar = cv.this;
                if (i2 == 0) {
                    synchronized (cvVar) {
                        cv cvVar2 = cv.this;
                        cvVar2.f0 += readInt;
                        cvVar2.notifyAll();
                    }
                    return;
                }
                iv g = cvVar.g(i2);
                if (g != null) {
                    synchronized (g) {
                        g.b += readInt;
                        if (readInt > 0) {
                            g.notifyAll();
                        }
                    }
                    return;
                }
                return;
            }
            uu.b("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        uu.b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.P.close();
    }

    public final boolean d(boolean z, b bVar) {
        boolean z2;
        boolean z3;
        short s;
        boolean z4;
        short s2;
        boolean z5;
        boolean z6;
        boolean z7;
        long j;
        boolean z8;
        short s3;
        boolean z9;
        int i;
        boolean z10;
        short s4;
        try {
            this.P.u(9L);
            bb bbVar = this.P;
            int readByte = (bbVar.readByte() & 255) | ((bbVar.readByte() & 255) << 16) | ((bbVar.readByte() & 255) << 8);
            if (readByte >= 0 && readByte <= 16384) {
                byte readByte2 = (byte) (this.P.readByte() & 255);
                if (z && readByte2 != 4) {
                    uu.b("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte2));
                    throw null;
                }
                byte readByte3 = (byte) (this.P.readByte() & 255);
                int readInt = this.P.readInt() & Integer.MAX_VALUE;
                Logger logger = T;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(uu.a(true, readInt, readByte, readByte2, readByte3));
                }
                try {
                    switch (readByte2) {
                        case 0:
                            if (readInt != 0) {
                                if ((readByte3 & 1) != 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((readByte3 & 32) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (!z3) {
                                    if ((readByte3 & 8) != 0) {
                                        s = (short) (this.P.readByte() & 255);
                                    } else {
                                        s = 0;
                                    }
                                    int a2 = a(readByte, readByte3, s);
                                    bb bbVar2 = this.P;
                                    cv.e eVar = (cv.e) bVar;
                                    cv.this.getClass();
                                    if (readInt != 0 && (readInt & 1) == 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        cv cvVar = cv.this;
                                        cvVar.getClass();
                                        za zaVar = new za();
                                        long j2 = a2;
                                        bbVar2.u(j2);
                                        bbVar2.q(zaVar, j2);
                                        if (zaVar.Q == j2) {
                                            cvVar.t(new av(cvVar, new Object[]{cvVar.S, Integer.valueOf(readInt)}, readInt, zaVar, a2, z2));
                                        } else {
                                            throw new IOException(zaVar.Q + " != " + a2);
                                        }
                                    } else {
                                        iv g = cv.this.g(readInt);
                                        if (g == null) {
                                            cv.this.H(readInt, 2);
                                            long j3 = a2;
                                            cv.this.F(j3);
                                            bbVar2.skip(j3);
                                        } else {
                                            iv.b bVar2 = g.g;
                                            long j4 = a2;
                                            while (true) {
                                                if (j4 > 0) {
                                                    synchronized (iv.this) {
                                                        z5 = bVar2.T;
                                                        s2 = s;
                                                        if (bVar2.Q.Q + j4 > bVar2.R) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                    }
                                                    if (z6) {
                                                        bbVar2.skip(j4);
                                                        iv.this.e(4);
                                                    } else if (z5) {
                                                        bbVar2.skip(j4);
                                                    } else {
                                                        long q = bbVar2.q(bVar2.P, j4);
                                                        if (q != -1) {
                                                            j4 -= q;
                                                            synchronized (iv.this) {
                                                                if (bVar2.S) {
                                                                    za zaVar2 = bVar2.P;
                                                                    j = zaVar2.Q;
                                                                    zaVar2.a();
                                                                } else {
                                                                    za zaVar3 = bVar2.Q;
                                                                    if (zaVar3.Q == 0) {
                                                                        z7 = true;
                                                                    } else {
                                                                        z7 = false;
                                                                    }
                                                                    zaVar3.o(bVar2.P);
                                                                    if (z7) {
                                                                        iv.this.notifyAll();
                                                                    }
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j > 0) {
                                                                iv.this.d.F(j);
                                                            }
                                                            s = s2;
                                                        } else {
                                                            throw new EOFException();
                                                        }
                                                    }
                                                } else {
                                                    s2 = s;
                                                    bVar2.getClass();
                                                }
                                            }
                                            if (z2) {
                                                g.h(c31.c, true);
                                            }
                                            this.P.skip(s2);
                                            return true;
                                        }
                                    }
                                    s2 = s;
                                    this.P.skip(s2);
                                    return true;
                                }
                                uu.b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
                                throw null;
                            }
                            uu.b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
                            throw null;
                        case 1:
                            if (readInt != 0) {
                                if ((readByte3 & 1) != 0) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                if ((readByte3 & 8) != 0) {
                                    s3 = (short) (this.P.readByte() & 255);
                                } else {
                                    s3 = 0;
                                }
                                if ((readByte3 & 32) != 0) {
                                    this.P.readInt();
                                    this.P.readByte();
                                    bVar.getClass();
                                    readByte -= 5;
                                }
                                ArrayList y = y(a(readByte, readByte3, s3), s3, readByte3, readInt);
                                cv.e eVar2 = (cv.e) bVar;
                                cv.this.getClass();
                                if (readInt != 0 && (readInt & 1) == 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    cv cvVar2 = cv.this;
                                    cvVar2.getClass();
                                    cvVar2.t(new zu(cvVar2, new Object[]{cvVar2.S, Integer.valueOf(readInt)}, readInt, y, z8));
                                    break;
                                } else {
                                    synchronized (cv.this) {
                                        try {
                                            iv g2 = cv.this.g(readInt);
                                            if (g2 == null) {
                                                cv cvVar3 = cv.this;
                                                if (!cvVar3.V && readInt > cvVar3.T && readInt % 2 != cvVar3.U % 2) {
                                                    iv ivVar = new iv(readInt, cv.this, false, z8, c31.u(y));
                                                    cv cvVar4 = cv.this;
                                                    cvVar4.T = readInt;
                                                    cvVar4.R.put(Integer.valueOf(readInt), ivVar);
                                                    cv.m0.execute(new dv(eVar2, new Object[]{cv.this.S, Integer.valueOf(readInt)}, ivVar));
                                                }
                                                return true;
                                            }
                                            g2.h(c31.u(y), z8);
                                            return true;
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                uu.b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
                                throw null;
                            }
                        case 2:
                            if (readByte == 5) {
                                if (readInt != 0) {
                                    this.P.readInt();
                                    this.P.readByte();
                                    bVar.getClass();
                                    return true;
                                }
                                uu.b("TYPE_PRIORITY streamId == 0", new Object[0]);
                                throw null;
                            }
                            uu.b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(readByte));
                            throw null;
                        case 3:
                            if (readByte == 4) {
                                if (readInt != 0) {
                                    int readInt2 = this.P.readInt();
                                    int[] _values = bp._values();
                                    int length = _values.length;
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            i = _values[i2];
                                            if (bp.a(i) != readInt2) {
                                                i2++;
                                            }
                                        } else {
                                            i = 0;
                                        }
                                    }
                                    if (i != 0) {
                                        cv.e eVar3 = (cv.e) bVar;
                                        cv.this.getClass();
                                        if (readInt != 0 && (readInt & 1) == 0) {
                                            z10 = true;
                                        } else {
                                            z10 = false;
                                        }
                                        cv cvVar5 = cv.this;
                                        if (z10) {
                                            cvVar5.t(new bv(cvVar5, new Object[]{cvVar5.S, Integer.valueOf(readInt)}, readInt, i));
                                            return true;
                                        }
                                        iv y2 = cvVar5.y(readInt);
                                        if (y2 == null) {
                                            return true;
                                        }
                                        synchronized (y2) {
                                            if (y2.k == 0) {
                                                y2.k = i;
                                                y2.notifyAll();
                                            }
                                        }
                                        return true;
                                    }
                                    uu.b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                                    throw null;
                                }
                                uu.b("TYPE_RST_STREAM streamId == 0", new Object[0]);
                                throw null;
                            }
                            uu.b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(readByte));
                            throw null;
                        case 4:
                            if (readInt == 0) {
                                if ((readByte3 & 1) != 0) {
                                    if (readByte == 0) {
                                        bVar.getClass();
                                        return true;
                                    }
                                    uu.b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                                    throw null;
                                } else if (readByte % 6 == 0) {
                                    bp5 bp5Var = new bp5();
                                    for (int i3 = 0; i3 < readByte; i3 += 6) {
                                        int readShort = this.P.readShort() & 65535;
                                        int readInt3 = this.P.readInt();
                                        if (readShort != 2) {
                                            if (readShort != 3) {
                                                if (readShort != 4) {
                                                    if (readShort == 5 && (readInt3 < 16384 || readInt3 > 16777215)) {
                                                        uu.b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt3));
                                                        throw null;
                                                    }
                                                } else {
                                                    readShort = 7;
                                                    if (readInt3 < 0) {
                                                        uu.b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                                        throw null;
                                                    }
                                                }
                                            } else {
                                                readShort = 4;
                                            }
                                        } else if (readInt3 != 0 && readInt3 != 1) {
                                            uu.b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                            throw null;
                                        }
                                        bp5Var.b(readShort, readInt3);
                                    }
                                    cv.e eVar4 = (cv.e) bVar;
                                    eVar4.getClass();
                                    cv cvVar6 = cv.this;
                                    cvVar6.W.execute(new ev(eVar4, new Object[]{cvVar6.S}, bp5Var));
                                    break;
                                } else {
                                    uu.b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(readByte));
                                    throw null;
                                }
                            } else {
                                uu.b("TYPE_SETTINGS streamId != 0", new Object[0]);
                                throw null;
                            }
                            break;
                        case 5:
                            if (readInt != 0) {
                                if ((readByte3 & 8) != 0) {
                                    s4 = (short) (this.P.readByte() & 255);
                                } else {
                                    s4 = 0;
                                }
                                int readInt4 = this.P.readInt() & Integer.MAX_VALUE;
                                ArrayList y3 = y(a(readByte - 4, readByte3, s4), s4, readByte3, readInt);
                                cv cvVar7 = cv.this;
                                synchronized (cvVar7) {
                                    if (cvVar7.l0.contains(Integer.valueOf(readInt4))) {
                                        cvVar7.H(readInt4, 2);
                                    } else {
                                        cvVar7.l0.add(Integer.valueOf(readInt4));
                                        cvVar7.t(new yu(cvVar7, new Object[]{cvVar7.S, Integer.valueOf(readInt4)}, readInt4, y3));
                                    }
                                }
                                break;
                            } else {
                                uu.b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
                                throw null;
                            }
                        case 6:
                            E(bVar, readByte, readByte3, readInt);
                            return true;
                        case 7:
                            t(bVar, readByte, readInt);
                            return true;
                        case 8:
                            F(bVar, readByte, readInt);
                            return true;
                        default:
                            this.P.skip(readByte);
                            return true;
                    }
                    return true;
                } catch (RejectedExecutionException unused) {
                    return true;
                }
            }
            uu.b("FRAME_SIZE_ERROR: %s", Integer.valueOf(readByte));
            throw null;
        } catch (EOFException unused2) {
            return false;
        }
    }

    public final void g(b bVar) {
        if (this.R) {
            if (!d(true, bVar)) {
                uu.b("Required SETTINGS preface not received", new Object[0]);
                throw null;
            }
            return;
        }
        bb bbVar = this.P;
        fb fbVar = uu.a;
        fb h = bbVar.h(fbVar.P.length);
        Logger logger = T;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(c31.j("<< CONNECTION %s", h.j()));
        }
        if (fbVar.equals(h)) {
            return;
        }
        uu.b("Expected a connection header but was %s", h.q());
        throw null;
    }

    public final void t(b bVar, int i, int i2) {
        int i3;
        iv[] ivVarArr;
        if (i >= 8) {
            if (i2 == 0) {
                int readInt = this.P.readInt();
                int readInt2 = this.P.readInt();
                int i4 = i - 8;
                int[] _values = bp._values();
                int length = _values.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length) {
                        i3 = _values[i5];
                        if (bp.a(i3) == readInt2) {
                            break;
                        }
                        i5++;
                    } else {
                        i3 = 0;
                        break;
                    }
                }
                if (i3 != 0) {
                    fb fbVar = fb.T;
                    if (i4 > 0) {
                        fbVar = this.P.h(i4);
                    }
                    cv.e eVar = (cv.e) bVar;
                    eVar.getClass();
                    fbVar.n();
                    synchronized (cv.this) {
                        ivVarArr = (iv[]) cv.this.R.values().toArray(new iv[cv.this.R.size()]);
                        cv.this.V = true;
                    }
                    for (iv ivVar : ivVarArr) {
                        if (ivVar.c > readInt && ivVar.f()) {
                            synchronized (ivVar) {
                                if (ivVar.k == 0) {
                                    ivVar.k = 5;
                                    ivVar.notifyAll();
                                }
                            }
                            cv.this.y(ivVar.c);
                        }
                    }
                    return;
                }
                uu.b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            uu.b("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
        uu.b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        throw null;
    }

    public final ArrayList y(int i, short s, byte b2, int i2) {
        a aVar = this.Q;
        aVar.T = i;
        aVar.Q = i;
        aVar.U = s;
        aVar.R = b2;
        aVar.S = i2;
        su.a aVar2 = this.S;
        while (!aVar2.b.n()) {
            int readByte = aVar2.b.readByte() & 255;
            if (readByte != 128) {
                boolean z = false;
                if ((readByte & 128) == 128) {
                    int e = aVar2.e(readByte, 127) - 1;
                    if (e >= 0 && e <= su.a.length - 1) {
                        z = true;
                    }
                    if (z) {
                        aVar2.a.add(su.a[e]);
                    } else {
                        int length = aVar2.f + 1 + (e - su.a.length);
                        if (length >= 0) {
                            hu[] huVarArr = aVar2.e;
                            if (length < huVarArr.length) {
                                aVar2.a.add(huVarArr[length]);
                            }
                        }
                        StringBuilder b3 = e5.b("Header index too large ");
                        b3.append(e + 1);
                        throw new IOException(b3.toString());
                    }
                } else if (readByte == 64) {
                    fb d = aVar2.d();
                    su.a(d);
                    aVar2.c(new hu(d, aVar2.d()));
                } else if ((readByte & 64) == 64) {
                    aVar2.c(new hu(aVar2.b(aVar2.e(readByte, 63) - 1), aVar2.d()));
                } else if ((readByte & 32) == 32) {
                    int e2 = aVar2.e(readByte, 31);
                    aVar2.d = e2;
                    if (e2 >= 0 && e2 <= aVar2.c) {
                        int i3 = aVar2.h;
                        if (e2 < i3) {
                            if (e2 == 0) {
                                Arrays.fill(aVar2.e, (Object) null);
                                aVar2.f = aVar2.e.length - 1;
                                aVar2.g = 0;
                                aVar2.h = 0;
                            } else {
                                aVar2.a(i3 - e2);
                            }
                        }
                    } else {
                        StringBuilder b4 = e5.b("Invalid dynamic table size update ");
                        b4.append(aVar2.d);
                        throw new IOException(b4.toString());
                    }
                } else if (readByte != 16 && readByte != 0) {
                    aVar2.a.add(new hu(aVar2.b(aVar2.e(readByte, 15) - 1), aVar2.d()));
                } else {
                    fb d2 = aVar2.d();
                    su.a(d2);
                    aVar2.a.add(new hu(d2, aVar2.d()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        su.a aVar3 = this.S;
        aVar3.getClass();
        ArrayList arrayList = new ArrayList(aVar3.a);
        aVar3.a.clear();
        return arrayList;
    }
}