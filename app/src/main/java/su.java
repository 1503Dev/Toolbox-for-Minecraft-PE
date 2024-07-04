package defpackage;

import defpackage.hv;
import defpackage.qv;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

/* renamed from: su  reason: default package */
public final class su {
    public static final hu[] a;
    public static final Map<fb, Integer> b;

    /* renamed from: su$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a {
        public final wj0 b;
        public final ArrayList a = new ArrayList();
        public hu[] e = new hu[8];
        public int f = 7;
        public int g = 0;
        public int h = 0;
        public final int c = 4096;
        public int d = 4096;

        public a(hv.a aVar) {
            Logger logger = rb0.a;
            this.b = new wj0(aVar);
        }

        public final int a(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.e[length].c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                hu[] huVarArr = this.e;
                System.arraycopy(huVarArr, i2 + 1, huVarArr, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        public final fb b(int i) {
            boolean z;
            hu huVar;
            if (i >= 0 && i <= su.a.length - 1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                huVar = su.a[i];
            } else {
                int length = this.f + 1 + (i - su.a.length);
                if (length >= 0) {
                    hu[] huVarArr = this.e;
                    if (length < huVarArr.length) {
                        huVar = huVarArr[length];
                    }
                }
                StringBuilder b = e5.b("Header index too large ");
                b.append(i + 1);
                throw new IOException(b.toString());
            }
            return huVar.a;
        }

        public final void c(hu huVar) {
            this.a.add(huVar);
            int i = huVar.c;
            int i2 = this.d;
            if (i > i2) {
                Arrays.fill(this.e, (Object) null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            hu[] huVarArr = this.e;
            if (i3 > huVarArr.length) {
                hu[] huVarArr2 = new hu[huVarArr.length * 2];
                System.arraycopy(huVarArr, 0, huVarArr2, huVarArr.length, huVarArr.length);
                this.f = this.e.length - 1;
                this.e = huVarArr2;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = huVar;
            this.g++;
            this.h += i;
        }

        public final fb d() {
            boolean z;
            int readByte = this.b.readByte() & 255;
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            int e = e(readByte, 127);
            if (z) {
                qv qvVar = qv.d;
                wj0 wj0Var = this.b;
                long j = e;
                wj0Var.u(j);
                byte[] J = wj0Var.P.J(j);
                qvVar.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                qv.a aVar = qvVar.a;
                int i = 0;
                int i2 = 0;
                for (byte b : J) {
                    i = (i << 8) | (b & 255);
                    i2 += 8;
                    while (i2 >= 8) {
                        int i3 = i2 - 8;
                        aVar = aVar.a[(i >>> i3) & 255];
                        if (aVar.a == null) {
                            byteArrayOutputStream.write(aVar.b);
                            i2 -= aVar.c;
                            aVar = qvVar.a;
                        } else {
                            i2 = i3;
                        }
                    }
                }
                while (i2 > 0) {
                    qv.a aVar2 = aVar.a[(i << (8 - i2)) & 255];
                    if (aVar2.a != null || aVar2.c > i2) {
                        break;
                    }
                    byteArrayOutputStream.write(aVar2.b);
                    i2 -= aVar2.c;
                    aVar = qvVar.a;
                }
                return fb.k(byteArrayOutputStream.toByteArray());
            }
            return this.b.h(e);
        }

        public final int e(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = this.b.readByte() & 255;
                if ((readByte & 128) == 0) {
                    return i2 + (readByte << i4);
                }
                i2 += (readByte & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: su$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class b {
        public final za a;
        public boolean c;
        public int b = Integer.MAX_VALUE;
        public hu[] e = new hu[8];
        public int f = 7;
        public int g = 0;
        public int h = 0;
        public int d = 4096;

        public b(za zaVar) {
            this.a = zaVar;
        }

        public final void a(int i) {
            int i2;
            if (i > 0) {
                int length = this.e.length - 1;
                int i3 = 0;
                while (true) {
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.e[length].c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                    length--;
                }
                hu[] huVarArr = this.e;
                int i5 = i2 + 1;
                System.arraycopy(huVarArr, i5, huVarArr, i5 + i3, this.g);
                hu[] huVarArr2 = this.e;
                int i6 = this.f + 1;
                Arrays.fill(huVarArr2, i6, i6 + i3, (Object) null);
                this.f += i3;
            }
        }

        public final void b(hu huVar) {
            int i = huVar.c;
            int i2 = this.d;
            if (i > i2) {
                Arrays.fill(this.e, (Object) null);
                this.f = this.e.length - 1;
                this.g = 0;
                this.h = 0;
                return;
            }
            a((this.h + i) - i2);
            int i3 = this.g + 1;
            hu[] huVarArr = this.e;
            if (i3 > huVarArr.length) {
                hu[] huVarArr2 = new hu[huVarArr.length * 2];
                System.arraycopy(huVarArr, 0, huVarArr2, huVarArr.length, huVarArr.length);
                this.f = this.e.length - 1;
                this.e = huVarArr2;
            }
            int i4 = this.f;
            this.f = i4 - 1;
            this.e[i4] = huVar;
            this.g++;
            this.h += i;
        }

        public final void c(fb fbVar) {
            qv.d.getClass();
            int i = 0;
            long j = 0;
            for (int i2 = 0; i2 < fbVar.n(); i2++) {
                j += qv.c[fbVar.i(i2) & 255];
            }
            if (((int) ((j + 7) >> 3)) < fbVar.n()) {
                za zaVar = new za();
                qv.d.getClass();
                long j2 = 0;
                byte b = 0;
                while (i < fbVar.n()) {
                    int i3 = fbVar.i(i) & 255;
                    int i4 = qv.b[i3];
                    byte b2 = qv.c[i3];
                    j2 = (j2 << b2) | i4;
                    int i5 = b + b2;
                    while (i5 >= 8) {
                        i5 = (i5 == 1 ? 1 : 0) - 8;
                        zaVar.S((int) (j2 >> i5));
                    }
                    i++;
                    b = i5;
                }
                if (b > 0) {
                    zaVar.S((int) ((255 >>> b) | (j2 << (8 - b))));
                }
                fbVar = zaVar.K();
                e(fbVar.P.length, 127, 128);
            } else {
                e(fbVar.n(), 127, 0);
            }
            this.a.R(fbVar);
        }

        public final void d(ArrayList arrayList) {
            int i;
            int i2;
            if (this.c) {
                int i3 = this.b;
                if (i3 < this.d) {
                    e(i3, 31, 32);
                }
                this.c = false;
                this.b = Integer.MAX_VALUE;
                e(this.d, 31, 32);
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                hu huVar = (hu) arrayList.get(i4);
                fb p = huVar.a.p();
                fb fbVar = huVar.b;
                Integer num = su.b.get(p);
                if (num != null) {
                    i = num.intValue() + 1;
                    if (i > 1 && i < 8) {
                        hu[] huVarArr = su.a;
                        if (Objects.equals(huVarArr[i - 1].b, fbVar)) {
                            i2 = i;
                        } else if (Objects.equals(huVarArr[i].b, fbVar)) {
                            i2 = i;
                            i++;
                        }
                    }
                    i2 = i;
                    i = -1;
                } else {
                    i = -1;
                    i2 = -1;
                }
                if (i == -1) {
                    int i5 = this.f + 1;
                    int length = this.e.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (Objects.equals(this.e[i5].a, p)) {
                            if (Objects.equals(this.e[i5].b, fbVar)) {
                                i = su.a.length + (i5 - this.f);
                                break;
                            } else if (i2 == -1) {
                                i2 = (i5 - this.f) + su.a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i != -1) {
                    e(i, 127, 128);
                } else {
                    if (i2 == -1) {
                        this.a.S(64);
                        c(p);
                    } else {
                        fb fbVar2 = hu.d;
                        p.getClass();
                        if (p.m(fbVar2, fbVar2.n()) && !hu.i.equals(p)) {
                            e(i2, 15, 0);
                            c(fbVar);
                        } else {
                            e(i2, 63, 64);
                        }
                    }
                    c(fbVar);
                    b(huVar);
                }
            }
        }

        public final void e(int i, int i2, int i3) {
            int i4;
            za zaVar;
            if (i < i2) {
                zaVar = this.a;
                i4 = i | i3;
            } else {
                this.a.S(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.a.S(128 | (i4 & 127));
                    i4 >>>= 7;
                }
                zaVar = this.a;
            }
            zaVar.S(i4);
        }
    }

    static {
        hu huVar = new hu(hu.i, "");
        int i = 0;
        fb fbVar = hu.f;
        fb fbVar2 = hu.g;
        fb fbVar3 = hu.h;
        fb fbVar4 = hu.e;
        hu[] huVarArr = {huVar, new hu(fbVar, "GET"), new hu(fbVar, "POST"), new hu(fbVar2, "/"), new hu(fbVar2, "/index.html"), new hu(fbVar3, "http"), new hu(fbVar3, "https"), new hu(fbVar4, "200"), new hu(fbVar4, "204"), new hu(fbVar4, "206"), new hu(fbVar4, "304"), new hu(fbVar4, "400"), new hu(fbVar4, "404"), new hu(fbVar4, "500"), new hu("accept-charset", ""), new hu("accept-encoding", "gzip, deflate"), new hu("accept-language", ""), new hu("accept-ranges", ""), new hu("accept", ""), new hu("access-control-allow-origin", ""), new hu("age", ""), new hu("allow", ""), new hu("authorization", ""), new hu("cache-control", ""), new hu("content-disposition", ""), new hu("content-encoding", ""), new hu("content-language", ""), new hu("content-length", ""), new hu("content-location", ""), new hu("content-range", ""), new hu("content-type", ""), new hu("cookie", ""), new hu("date", ""), new hu("etag", ""), new hu("expect", ""), new hu("expires", ""), new hu("from", ""), new hu("host", ""), new hu("if-match", ""), new hu("if-modified-since", ""), new hu("if-none-match", ""), new hu("if-range", ""), new hu("if-unmodified-since", ""), new hu("last-modified", ""), new hu("link", ""), new hu("location", ""), new hu("max-forwards", ""), new hu("proxy-authenticate", ""), new hu("proxy-authorization", ""), new hu("range", ""), new hu("referer", ""), new hu("refresh", ""), new hu("retry-after", ""), new hu("server", ""), new hu("set-cookie", ""), new hu("strict-transport-security", ""), new hu("transfer-encoding", ""), new hu("user-agent", ""), new hu("vary", ""), new hu("via", ""), new hu("www-authenticate", "")};
        a = huVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(huVarArr.length);
        while (true) {
            hu[] huVarArr2 = a;
            if (i < huVarArr2.length) {
                if (!linkedHashMap.containsKey(huVarArr2[i].a)) {
                    linkedHashMap.put(huVarArr2[i].a, Integer.valueOf(i));
                }
                i++;
            } else {
                b = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    public static void a(fb fbVar) {
        int n = fbVar.n();
        for (int i = 0; i < n; i++) {
            byte i2 = fbVar.i(i);
            if (i2 >= 65 && i2 <= 90) {
                StringBuilder b2 = e5.b("PROTOCOL_ERROR response malformed: mixed case name: ");
                b2.append(fbVar.q());
                throw new IOException(b2.toString());
            }
        }
    }
}