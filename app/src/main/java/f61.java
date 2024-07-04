package defpackage;

import defpackage.ek0;
import defpackage.za;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: f61  reason: default package */
public final class f61 {
    public final boolean a;
    public final bb b;
    public final a c;
    public boolean d;
    public int e;
    public long f;
    public boolean g;
    public boolean h;
    public final za i = new za();
    public final za j = new za();
    public final byte[] k;
    public final za.b l;

    /* renamed from: f61$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface a {
    }

    public f61(boolean z, bb bbVar, ek0 ek0Var) {
        if (bbVar == null) {
            throw new NullPointerException("source == null");
        }
        if (ek0Var == null) {
            throw new NullPointerException("frameCallback == null");
        }
        this.a = z;
        this.b = bbVar;
        this.c = ek0Var;
        this.k = z ? null : new byte[4];
        this.l = z ? null : new za.b();
    }

    public final void a() {
        ek0.e eVar;
        long j = this.f;
        if (j > 0) {
            this.b.z(this.i, j);
            if (!this.a) {
                this.i.I(this.l);
                this.l.a(0L);
                e61.b(this.l, this.k);
                this.l.close();
            }
        }
        switch (this.e) {
            case 8:
                short s = 1005;
                String str = "";
                za zaVar = this.i;
                long j2 = zaVar.Q;
                if (j2 != 1) {
                    if (j2 != 0) {
                        s = zaVar.readShort();
                        str = this.i.M();
                        String a2 = e61.a(s);
                        if (a2 != null) {
                            throw new ProtocolException(a2);
                        }
                    }
                    ek0 ek0Var = (ek0) this.c;
                    if (s != -1) {
                        synchronized (ek0Var) {
                            if (ek0Var.q == -1) {
                                ek0Var.q = s;
                                ek0Var.r = str;
                                eVar = null;
                                if (ek0Var.o && ek0Var.m.isEmpty()) {
                                    ek0.e eVar2 = ek0Var.k;
                                    ek0Var.k = null;
                                    ScheduledFuture<?> scheduledFuture = ek0Var.p;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(false);
                                    }
                                    ek0Var.j.shutdown();
                                    eVar = eVar2;
                                }
                            } else {
                                throw new IllegalStateException("already closed");
                            }
                        }
                        try {
                            ek0Var.b.onClosing(ek0Var, s, str);
                            if (eVar != null) {
                                ek0Var.b.onClosed(ek0Var, s, str);
                            }
                            c31.c(eVar);
                            this.d = true;
                            return;
                        } catch (Throwable th) {
                            c31.c(eVar);
                            throw th;
                        }
                    }
                    ek0Var.getClass();
                    throw new IllegalArgumentException();
                }
                throw new ProtocolException("Malformed close payload length of 1.");
            case 9:
                a aVar = this.c;
                fb K = this.i.K();
                ek0 ek0Var2 = (ek0) aVar;
                synchronized (ek0Var2) {
                    if (!ek0Var2.s && (!ek0Var2.o || !ek0Var2.m.isEmpty())) {
                        ek0Var2.l.add(K);
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = ek0Var2.j;
                        if (scheduledThreadPoolExecutor != null) {
                            scheduledThreadPoolExecutor.execute(ek0Var2.g);
                        }
                    }
                }
                return;
            case 10:
                a aVar2 = this.c;
                this.i.K();
                ek0 ek0Var3 = (ek0) aVar2;
                synchronized (ek0Var3) {
                    ek0Var3.u = false;
                }
                return;
            default:
                StringBuilder b = e5.b("Unknown control opcode: ");
                b.append(Integer.toHexString(this.e));
                throw new ProtocolException(b.toString());
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        if (!this.d) {
            long h = this.b.c().h();
            this.b.c().b();
            try {
                int readByte = this.b.readByte() & 255;
                this.b.c().g(h, TimeUnit.NANOSECONDS);
                this.e = readByte & 15;
                boolean z6 = true;
                if ((readByte & 128) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = z;
                if ((readByte & 8) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.h = z2;
                if (z2 && !z) {
                    throw new ProtocolException("Control frames must be final.");
                }
                if ((readByte & 64) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if ((readByte & 32) != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((readByte & 16) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z3 && !z4 && !z5) {
                    int readByte2 = this.b.readByte() & 255;
                    if ((readByte2 & 128) == 0) {
                        z6 = false;
                    }
                    if (z6 == this.a) {
                        if (this.a) {
                            str = "Server-sent frames must not be masked.";
                        } else {
                            str = "Client-sent frames must be masked.";
                        }
                        throw new ProtocolException(str);
                    }
                    long j = readByte2 & 127;
                    this.f = j;
                    if (j == 126) {
                        this.f = this.b.readShort() & 65535;
                    } else if (j == 127) {
                        long readLong = this.b.readLong();
                        this.f = readLong;
                        if (readLong < 0) {
                            StringBuilder b = e5.b("Frame length 0x");
                            b.append(Long.toHexString(this.f));
                            b.append(" > 0x7FFFFFFFFFFFFFFF");
                            throw new ProtocolException(b.toString());
                        }
                    }
                    if (this.h && this.f > 125) {
                        throw new ProtocolException("Control frame must be less than 125B.");
                    }
                    if (z6) {
                        this.b.readFully(this.k);
                        return;
                    }
                    return;
                }
                throw new ProtocolException("Reserved flags are unsupported.");
            } catch (Throwable th) {
                this.b.c().g(h, TimeUnit.NANOSECONDS);
                throw th;
            }
        }
        throw new IOException("closed");
    }
}