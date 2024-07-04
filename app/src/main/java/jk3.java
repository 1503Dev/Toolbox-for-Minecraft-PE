package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: jk3  reason: default package */
public final class jk3 implements wy4, iu4, yb0, v64 {
    public final Object P;
    public final Object Q;

    public jk3() {
        this.P = new byte[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.Q = new byte[128];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = (byte[]) this.Q;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = (byte[]) this.P;
            if (i >= bArr2.length) {
                byte[] bArr3 = (byte[]) this.Q;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
            ((byte[]) this.Q)[bArr2[i]] = (byte) i;
            i++;
        }
    }

    public /* synthetic */ jk3(ex2 ex2Var, dx2 dx2Var) {
        this.P = ex2Var;
        this.Q = dx2Var;
    }

    public /* synthetic */ jk3(io5 io5Var, String str) {
        this.P = io5Var;
        this.Q = str;
    }

    public static boolean d(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // defpackage.iu4
    /* renamed from: a */
    public final fv4 mo4a() {
        byte[] bArr = (byte[]) this.Q;
        int i = l03.l0;
        return new c03(new mr4(bArr), bArr.length, ((iu4) this.P).mo4a());
    }

    public final void b(ByteArrayOutputStream byteArrayOutputStream, String str) {
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!d(str.charAt(i))) {
                break;
            }
            length = i;
        }
        int i2 = 0;
        while (i2 < length) {
            while (i2 < length && d(str.charAt(i2))) {
                i2++;
            }
            int i3 = i2 + 1;
            byte b = ((byte[]) this.Q)[str.charAt(i2)];
            while (i3 < length && d(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b2 = ((byte[]) this.Q)[str.charAt(i3)];
            if ((b | b2) < 0) {
                throw new IOException("invalid characters encountered in Hex string");
            }
            byteArrayOutputStream.write((b << 4) | b2);
            i2 = i4;
        }
    }

    @Override // defpackage.yb0
    public final void c(yv0 yv0Var) {
        ps4 ps4Var = (ps4) this.P;
        aw0 aw0Var = (aw0) this.Q;
        synchronized (ps4Var.f) {
            ps4Var.e.remove(aw0Var);
        }
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        jo5 jo5Var = (jo5) obj;
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        ((ex2) this.P).e(obj);
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        ((dx2) this.Q).mo1a();
    }

    public /* synthetic */ jk3(Object obj, Object obj2) {
        this.P = obj;
        this.Q = obj2;
    }
}