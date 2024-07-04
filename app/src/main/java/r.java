package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: r  reason: default package */
public class r {
    public OutputStream a;

    /* renamed from: r$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends r {
        public boolean b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.b = true;
        }

        @Override // defpackage.r
        public final void c(int i) {
            if (this.b) {
                this.b = false;
            } else {
                super.c(i);
            }
        }
    }

    public r(OutputStream outputStream) {
        this.a = outputStream;
    }

    public ki a() {
        return new ki(this.a);
    }

    public r b() {
        return new xi(this.a);
    }

    public void c(int i) {
        this.a.write(i);
    }

    public final void d(byte[] bArr, int i) {
        c(i);
        f(bArr.length);
        this.a.write(bArr);
    }

    public final void e(t tVar) {
        tVar.q(new a(this.a));
    }

    public final void f(int i) {
        if (i <= 127) {
            c((byte) i);
            return;
        }
        int i2 = i;
        int i3 = 1;
        while (true) {
            i2 >>>= 8;
            if (i2 == 0) {
                break;
            }
            i3++;
        }
        c((byte) (i3 | 128));
        for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
            c((byte) (i >> i4));
        }
    }

    public void g(g gVar) {
        if (gVar == null) {
            throw new IOException("null object detected");
        }
        gVar.h().q(this);
    }

    public final void h(int i, int i2) {
        if (i2 < 31) {
            c(i | i2);
            return;
        }
        c(i | 31);
        if (i2 < 128) {
            c(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.a.write(bArr, i3, 5 - i3);
    }
}