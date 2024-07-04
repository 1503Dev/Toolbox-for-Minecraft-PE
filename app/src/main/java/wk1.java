package defpackage;

import android.view.View;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;

/* renamed from: wk1  reason: default package */
public final class wk1 implements fu1, bz1, wg3, i23, ti4 {
    public Object P;

    public wk1(int i) {
        if (i != 7) {
            this.P = new kh4(10);
        }
    }

    public /* synthetic */ wk1(fz1 fz1Var) {
        this.P = fz1Var;
    }

    public /* synthetic */ wk1(ByteBuffer byteBuffer) {
        this.P = byteBuffer.slice();
    }

    @Override // defpackage.fu1
    public final long a() {
        return ((ByteBuffer) this.P).capacity();
    }

    @Override // defpackage.i23
    /* renamed from: a */
    public final void mo3a() {
        ((ax2) this.P).d();
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r10v48 ?? I:??[int, boolean, short, byte, char])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r101, byte[] r102) {
        /*
            Method dump skipped, instructions count: 2565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk1.b(byte[], byte[]):void");
    }

    @Override // defpackage.ti4
    public final synchronized void c() {
        ti4 ti4Var = (ti4) this.P;
        if (ti4Var != null) {
            ti4Var.c();
        }
    }

    @Override // defpackage.ti4
    public final synchronized void d() {
        ti4 ti4Var = (ti4) this.P;
        if (ti4Var != null) {
            ti4Var.d();
        }
    }

    @Override // defpackage.wg3
    /* renamed from: e */
    public final void mo0e(Object obj) {
        ((vh3) obj).H((String) this.P);
    }

    @Override // defpackage.fu1
    public final void f(MessageDigest[] messageDigestArr, long j, int i) {
        ByteBuffer slice;
        synchronized (((ByteBuffer) this.P)) {
            int i2 = (int) j;
            ((ByteBuffer) this.P).position(i2);
            ((ByteBuffer) this.P).limit(i2 + i);
            slice = ((ByteBuffer) this.P).slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }

    @Override // defpackage.ti4
    public final synchronized void g(View view) {
        ti4 ti4Var = (ti4) this.P;
        if (ti4Var != null) {
            ti4Var.g(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yt2 h(p16 p16Var, v32 v32Var) {
        String a;
        boolean z;
        jo1 jo1Var;
        int i;
        yt2 yt2Var = null;
        int i2 = 0;
        while (true) {
            try {
                p16Var.B(((kh4) this.P).a, 0, 10, false);
                ((kh4) this.P).e(0);
                if (((kh4) this.P).o() != 4801587) {
                    break;
                }
                ((kh4) this.P).f(3);
                int m = ((kh4) this.P).m();
                int i3 = m + 10;
                if (yt2Var == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(((kh4) this.P).a, 0, bArr, 0, 10);
                    p16Var.B(bArr, 10, m, false);
                    ArrayList arrayList = new ArrayList();
                    kh4 kh4Var = new kh4(bArr, i3);
                    boolean z2 = true;
                    if (kh4Var.c - kh4Var.b < 10) {
                        a = "Data too short to be an ID3 tag";
                    } else {
                        int o = kh4Var.o();
                        if (o != 4801587) {
                            a = "Unexpected first three bytes of ID3 tag header: 0x".concat(String.valueOf(String.format("%06X", Integer.valueOf(o))));
                        } else {
                            int n = kh4Var.n();
                            kh4Var.f(1);
                            int n2 = kh4Var.n();
                            int m2 = kh4Var.m();
                            if (n == 2) {
                                if ((n2 & 64) != 0) {
                                    a = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                                }
                                if (n >= 4 && (n2 & 128) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                jo1Var = new jo1(n, m2, z);
                            } else {
                                if (n == 3) {
                                    if ((n2 & 64) != 0) {
                                        int i4 = kh4Var.i();
                                        kh4Var.f(i4);
                                        m2 -= i4 + 4;
                                    }
                                } else if (n == 4) {
                                    if ((n2 & 64) != 0) {
                                        int m3 = kh4Var.m();
                                        kh4Var.f(m3 - 4);
                                        m2 -= m3;
                                    }
                                    if ((n2 & 16) != 0) {
                                        m2 -= 10;
                                    }
                                } else {
                                    a = k6.a("Skipped ID3 tag with unsupported majorVersion=", n);
                                }
                                if (n >= 4) {
                                }
                                z = false;
                                jo1Var = new jo1(n, m2, z);
                            }
                            if (jo1Var != null) {
                                int i5 = kh4Var.b;
                                if (jo1Var.a == 2) {
                                    i = 6;
                                } else {
                                    i = 10;
                                }
                                int i6 = jo1Var.c;
                                if (jo1Var.b) {
                                    i6 = ko1.d(i6, kh4Var);
                                }
                                kh4Var.d(i5 + i6);
                                if (!ko1.j(kh4Var, jo1Var.a, i, false)) {
                                    if (jo1Var.a != 4 || !ko1.j(kh4Var, 4, i, true)) {
                                        lb4.c("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + jo1Var.a);
                                    }
                                } else {
                                    z2 = false;
                                }
                                while (kh4Var.c - kh4Var.b >= i) {
                                    lo1 e = ko1.e(jo1Var.a, kh4Var, z2, i, v32Var);
                                    if (e != null) {
                                        arrayList.add(e);
                                    }
                                }
                                yt2Var = new yt2(arrayList);
                            }
                            yt2Var = null;
                        }
                    }
                    lb4.c("Id3Decoder", a);
                    jo1Var = null;
                    if (jo1Var != null) {
                    }
                    yt2Var = null;
                } else {
                    p16Var.h(m, false);
                }
                i2 += i3;
            } catch (EOFException unused) {
            }
        }
        p16Var.f = 0;
        p16Var.h(i2, false);
        return yt2Var;
    }

    public /* synthetic */ wk1(Object obj) {
        this.P = obj;
    }
}