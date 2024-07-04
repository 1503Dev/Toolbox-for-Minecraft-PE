package defpackage;

import defpackage.o;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: k  reason: default package */
public final class k extends FilterInputStream {
    public final int P;
    public final boolean Q;
    public final byte[][] R;

    public k() {
        throw null;
    }

    public k(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.P = i;
        this.Q = z;
        this.R = new byte[11];
    }

    public k(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, false);
    }

    public static int F(int i, InputStream inputStream) {
        int i2 = i & 31;
        if (i2 == 31) {
            int i3 = 0;
            int read = inputStream.read();
            if ((read & 127) != 0) {
                while (read >= 0 && (read & 128) != 0) {
                    i3 = (i3 | (read & 127)) << 7;
                    read = inputStream.read();
                }
                if (read >= 0) {
                    return i3 | (read & 127);
                }
                throw new EOFException("EOF found inside tag value.");
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        }
        return i2;
    }

    public static s82 a(lk lkVar) {
        k kVar = new k(lkVar, eu0.c(lkVar), false);
        s82 s82Var = new s82(12);
        while (true) {
            t E = kVar.E();
            if (E != null) {
                s82Var.g(E);
            } else {
                return s82Var;
            }
        }
    }

    public static t g(int i, lk lkVar, byte[][] bArr) {
        int read;
        if (i != 10) {
            if (i != 12) {
                if (i != 30) {
                    switch (i) {
                        case 1:
                            byte[] t = t(lkVar, bArr);
                            byte[] bArr2 = f.Q;
                            if (t.length == 1) {
                                byte b = t[0];
                                if (b == 0) {
                                    return f.S;
                                }
                                if ((b & 255) == 255) {
                                    return f.T;
                                }
                                return new f(t);
                            }
                            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
                        case 2:
                            return new l(lkVar.g());
                        case 3:
                            int i2 = lkVar.S;
                            if (i2 >= 1) {
                                int read2 = lkVar.read();
                                int i3 = i2 - 1;
                                byte[] bArr3 = new byte[i3];
                                if (i3 != 0) {
                                    if (g9.b(lkVar, bArr3) == i3) {
                                        if (read2 > 0 && read2 < 8) {
                                            byte b2 = bArr3[i3 - 1];
                                            if (b2 != ((byte) ((255 << read2) & b2))) {
                                                return new wi(bArr3, read2);
                                            }
                                        }
                                    } else {
                                        throw new EOFException("EOF encountered in middle of BIT STRING");
                                    }
                                }
                                return new zh(bArr3, read2);
                            }
                            throw new IllegalArgumentException("truncated BIT STRING detected");
                        case 4:
                            return new ii(lkVar.g());
                        case 5:
                            return gi.P;
                        case 6:
                            byte[] t2 = t(lkVar, bArr);
                            ConcurrentHashMap concurrentHashMap = o.R;
                            o oVar = (o) o.R.get(new o.a(t2));
                            if (oVar == null) {
                                return new o(t2);
                            }
                            return oVar;
                        default:
                            switch (i) {
                                case 18:
                                    return new hi(lkVar.g());
                                case 19:
                                    return new li(lkVar.g());
                                case 20:
                                    return new qi(lkVar.g());
                                case 21:
                                    return new ui(lkVar.g());
                                case 22:
                                    return new fi(lkVar.g());
                                case 23:
                                    return new y(lkVar.g());
                                case 24:
                                    return new j(lkVar.g());
                                case 25:
                                    return new ei(lkVar.g());
                                case 26:
                                    return new vi(lkVar.g());
                                case 27:
                                    return new di(lkVar.g());
                                case 28:
                                    return new ti(lkVar.g());
                                default:
                                    throw new IOException(bp.b("unknown tag ", i, " encountered"));
                            }
                    }
                }
                int i4 = lkVar.S / 2;
                char[] cArr = new char[i4];
                for (int i5 = 0; i5 < i4; i5++) {
                    int read3 = lkVar.read();
                    if (read3 < 0 || (read = lkVar.read()) < 0) {
                        break;
                    }
                    cArr[i5] = (char) ((read3 << 8) | (read & 255));
                }
                return new yh(cArr);
            }
            return new si(lkVar.g());
        }
        byte[] t3 = t(lkVar, bArr);
        if (t3.length > 1) {
            return new h(t3);
        }
        if (t3.length != 0) {
            int i6 = t3[0] & 255;
            h[] hVarArr = h.Q;
            if (i6 >= 12) {
                return new h(j7.c(t3));
            }
            h hVar = hVarArr[i6];
            if (hVar == null) {
                hVar = new h(j7.c(t3));
                hVarArr[i6] = hVar;
            }
            return hVar;
        }
        throw new IllegalArgumentException("ENUMERATED has zero length");
    }

    public static byte[] t(lk lkVar, byte[][] bArr) {
        int i = lkVar.S;
        if (i < bArr.length) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[i];
                bArr[i] = bArr2;
            }
            g9.b(lkVar, bArr2);
            return bArr2;
        }
        return lkVar.g();
    }

    public static int y(int i, InputStream inputStream) {
        int read = inputStream.read();
        if (read >= 0) {
            if (read == 128) {
                return -1;
            }
            if (read > 127) {
                int i2 = read & 127;
                if (i2 <= 4) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < i2; i4++) {
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i3 = (i3 << 8) + read2;
                        } else {
                            throw new EOFException("EOF found reading length");
                        }
                    }
                    if (i3 >= 0) {
                        if (i3 < i) {
                            return i3;
                        }
                        throw new IOException("corrupted stream - out of bounds length found");
                    }
                    throw new IOException("corrupted stream - negative length found");
                }
                throw new IOException(k6.a("DER length more than 4 bytes: ", i2));
            }
            return read;
        }
        throw new EOFException("EOF found when length expected");
    }

    public final t E() {
        boolean z;
        int read = read();
        if (read <= 0) {
            if (read != 0) {
                return null;
            }
            throw new IOException("unexpected end-of-contents marker");
        }
        int F = F(read, this);
        if ((read & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        int y = y(this.P, this);
        if (y < 0) {
            if (z) {
                kl5 kl5Var = new kl5(this.P, new fx(this.P, this));
                if ((read & 64) != 0) {
                    return new s8(F, kl5Var.c());
                }
                if ((read & 128) != 0) {
                    return kl5Var.b(F, true);
                }
                if (F != 4) {
                    if (F != 8) {
                        if (F != 16) {
                            if (F == 17) {
                                return new z8(kl5Var.c());
                            }
                            throw new IOException("unknown BER object encountered");
                        }
                        return new x8(kl5Var.c());
                    }
                    try {
                        return new ai(kl5Var.c());
                    } catch (IllegalArgumentException e) {
                        throw new i(e.getMessage(), e);
                    }
                }
                tf tfVar = new tf(kl5Var);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read2 = tfVar.read(bArr, 0, 4096);
                    if (read2 >= 0) {
                        byteArrayOutputStream.write(bArr, 0, read2);
                    } else {
                        return new v8(byteArrayOutputStream.toByteArray());
                    }
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else {
            try {
                return d(read, F, y);
            } catch (IllegalArgumentException e2) {
                throw new i("corrupted stream detected", e2);
            }
        }
    }

    public final t d(int i, int i2, int i3) {
        boolean z;
        if ((i & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        lk lkVar = new lk(i3, this);
        if ((i & 64) != 0) {
            return new xh(i2, z, lkVar.g());
        }
        if ((i & 128) != 0) {
            return new kl5(lkVar).b(i2, z);
        }
        if (z) {
            if (i2 != 4) {
                if (i2 != 8) {
                    if (i2 != 16) {
                        if (i2 == 17) {
                            s82 a = a(lkVar);
                            mi miVar = ci.a;
                            if (a.i() < 1) {
                                return ci.b;
                            }
                            return new zi(a);
                        }
                        throw new IOException(bp.b("unknown tag ", i2, " encountered"));
                    } else if (this.Q) {
                        return new x00(lkVar.g());
                    } else {
                        s82 a2 = a(lkVar);
                        mi miVar2 = ci.a;
                        if (a2.i() < 1) {
                            return ci.a;
                        }
                        return new yi(a2);
                    }
                }
                return new ai(a(lkVar));
            }
            s82 a3 = a(lkVar);
            int i4 = a3.i();
            p[] pVarArr = new p[i4];
            for (int i5 = 0; i5 != i4; i5++) {
                pVarArr[i5] = (p) a3.h(i5);
            }
            return new v8(pVarArr);
        }
        return g(i2, lkVar, this.R);
    }
}