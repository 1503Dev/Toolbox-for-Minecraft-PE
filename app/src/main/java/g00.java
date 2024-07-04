package defpackage;

import defpackage.h10;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: g00  reason: default package */
public final class g00 extends c00 {
    public static final a j0 = new a();
    public static final Object k0 = new Object();
    public Object[] f0;
    public int g0;
    public String[] h0;
    public int[] i0;

    /* renamed from: g00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public g00(wz wzVar) {
        super(j0);
        this.f0 = new Object[32];
        this.g0 = 0;
        this.h0 = new String[32];
        this.i0 = new int[32];
        e0(wzVar);
    }

    private String J() {
        StringBuilder b = e5.b(" at path ");
        b.append(G());
        return b.toString();
    }

    @Override // defpackage.c00
    public final void E() {
        b0(4);
        d0();
        d0();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.c00
    public final String G() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.g0) {
            Object[] objArr = this.f0;
            Object obj = objArr[i];
            if (obj instanceof qz) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.i0[i]);
                    sb.append(']');
                }
            } else if (obj instanceof zz) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.h0[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // defpackage.c00
    public final boolean H() {
        int U = U();
        return (U == 4 || U == 2) ? false : true;
    }

    @Override // defpackage.c00
    public final boolean K() {
        b0(8);
        boolean g = ((b00) d0()).g();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return g;
    }

    @Override // defpackage.c00
    public final double L() {
        double parseDouble;
        int U = U();
        if (U != 7 && U != 6) {
            StringBuilder b = e5.b("Expected ");
            b.append(ik.b(7));
            b.append(" but was ");
            b.append(ik.b(U));
            b.append(J());
            throw new IllegalStateException(b.toString());
        }
        b00 b00Var = (b00) c0();
        if (b00Var.P instanceof Number) {
            parseDouble = b00Var.r().doubleValue();
        } else {
            parseDouble = Double.parseDouble(b00Var.q());
        }
        if (!this.Q && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + parseDouble);
        }
        d0();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseDouble;
    }

    @Override // defpackage.c00
    public final int M() {
        int U = U();
        if (U != 7 && U != 6) {
            StringBuilder b = e5.b("Expected ");
            b.append(ik.b(7));
            b.append(" but was ");
            b.append(ik.b(U));
            b.append(J());
            throw new IllegalStateException(b.toString());
        }
        int m = ((b00) c0()).m();
        d0();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return m;
    }

    @Override // defpackage.c00
    public final long N() {
        long parseLong;
        int U = U();
        if (U != 7 && U != 6) {
            StringBuilder b = e5.b("Expected ");
            b.append(ik.b(7));
            b.append(" but was ");
            b.append(ik.b(U));
            b.append(J());
            throw new IllegalStateException(b.toString());
        }
        b00 b00Var = (b00) c0();
        if (b00Var.P instanceof Number) {
            parseLong = b00Var.r().longValue();
        } else {
            parseLong = Long.parseLong(b00Var.q());
        }
        d0();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseLong;
    }

    @Override // defpackage.c00
    public final String O() {
        b0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) c0()).next();
        String str = (String) entry.getKey();
        this.h0[this.g0 - 1] = str;
        e0(entry.getValue());
        return str;
    }

    @Override // defpackage.c00
    public final void Q() {
        b0(9);
        d0();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.c00
    public final String S() {
        int U = U();
        if (U != 6 && U != 7) {
            StringBuilder b = e5.b("Expected ");
            b.append(ik.b(6));
            b.append(" but was ");
            b.append(ik.b(U));
            b.append(J());
            throw new IllegalStateException(b.toString());
        }
        String q = ((b00) d0()).q();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return q;
    }

    @Override // defpackage.c00
    public final int U() {
        if (this.g0 == 0) {
            return 10;
        }
        Object c0 = c0();
        if (c0 instanceof Iterator) {
            boolean z = this.f0[this.g0 - 2] instanceof zz;
            Iterator it = (Iterator) c0;
            if (it.hasNext()) {
                if (z) {
                    return 5;
                }
                e0(it.next());
                return U();
            } else if (z) {
                return 4;
            } else {
                return 2;
            }
        } else if (c0 instanceof zz) {
            return 3;
        } else {
            if (c0 instanceof qz) {
                return 1;
            }
            if (c0 instanceof b00) {
                Serializable serializable = ((b00) c0).P;
                if (serializable instanceof String) {
                    return 6;
                }
                if (serializable instanceof Boolean) {
                    return 8;
                }
                if (serializable instanceof Number) {
                    return 7;
                }
                throw new AssertionError();
            } else if (c0 instanceof yz) {
                return 9;
            } else {
                if (c0 == k0) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // defpackage.c00
    public final void Z() {
        if (U() == 5) {
            O();
            this.h0[this.g0 - 2] = "null";
        } else {
            d0();
            int i = this.g0;
            if (i > 0) {
                this.h0[i - 1] = "null";
            }
        }
        int i2 = this.g0;
        if (i2 > 0) {
            int[] iArr = this.i0;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // defpackage.c00
    public final void a() {
        b0(1);
        e0(((qz) c0()).iterator());
        this.i0[this.g0 - 1] = 0;
    }

    public final void b0(int i) {
        if (U() == i) {
            return;
        }
        StringBuilder b = e5.b("Expected ");
        b.append(ik.b(i));
        b.append(" but was ");
        b.append(ik.b(U()));
        b.append(J());
        throw new IllegalStateException(b.toString());
    }

    public final Object c0() {
        return this.f0[this.g0 - 1];
    }

    @Override // defpackage.c00, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f0 = new Object[]{k0};
        this.g0 = 1;
    }

    @Override // defpackage.c00
    public final void d() {
        b0(3);
        e0(new h10.b.a((h10.b) ((zz) c0()).P.entrySet()));
    }

    public final Object d0() {
        Object[] objArr = this.f0;
        int i = this.g0 - 1;
        this.g0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void e0(Object obj) {
        int i = this.g0;
        Object[] objArr = this.f0;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f0 = Arrays.copyOf(objArr, i2);
            this.i0 = Arrays.copyOf(this.i0, i2);
            this.h0 = (String[]) Arrays.copyOf(this.h0, i2);
        }
        Object[] objArr2 = this.f0;
        int i3 = this.g0;
        this.g0 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.c00
    public final String toString() {
        return g00.class.getSimpleName();
    }

    @Override // defpackage.c00
    public final void y() {
        b0(2);
        d0();
        d0();
        int i = this.g0;
        if (i > 0) {
            int[] iArr = this.i0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }
}