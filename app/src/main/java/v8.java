package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: v8  reason: default package */
public final class v8 extends p {
    public p[] Q;

    /* renamed from: v8$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Enumeration {
        public int a = 0;

        public a() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            if (this.a < v8.this.Q.length) {
                return true;
            }
            return false;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            p[] pVarArr = v8.this.Q;
            int i = this.a;
            this.a = i + 1;
            return pVarArr[i];
        }
    }

    public v8(byte[] bArr) {
        super(bArr);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v8(p[] pVarArr) {
        super(r0.toByteArray());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i != pVarArr.length; i++) {
            try {
                byteArrayOutputStream.write(((ii) pVarArr[i]).P);
            } catch (IOException e) {
                StringBuilder b = e5.b("exception converting octets ");
                b.append(e.toString());
                throw new IllegalArgumentException(b.toString());
            } catch (ClassCastException unused) {
                throw new IllegalArgumentException(pVarArr[i].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
        this.Q = pVarArr;
    }

    @Override // defpackage.t
    public final void q(r rVar) {
        rVar.c(36);
        rVar.c(128);
        Enumeration y = y();
        while (y.hasMoreElements()) {
            rVar.g((g) y.nextElement());
        }
        rVar.c(0);
        rVar.c(0);
    }

    @Override // defpackage.t
    public final int r() {
        Enumeration y = y();
        int i = 0;
        while (y.hasMoreElements()) {
            i += ((g) y.nextElement()).h().r();
        }
        return i + 2 + 2;
    }

    @Override // defpackage.t
    public final boolean t() {
        return true;
    }

    @Override // defpackage.p
    public final byte[] x() {
        return this.P;
    }

    public final Enumeration y() {
        int i;
        if (this.Q == null) {
            Vector vector = new Vector();
            int i2 = 0;
            while (true) {
                byte[] bArr = this.P;
                if (i2 < bArr.length) {
                    int i3 = i2 + 1000;
                    if (i3 > bArr.length) {
                        i = bArr.length;
                    } else {
                        i = i3;
                    }
                    int i4 = i - i2;
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, i2, bArr2, 0, i4);
                    vector.addElement(new ii(bArr2));
                    i2 = i3;
                } else {
                    return vector.elements();
                }
            }
        } else {
            return new a();
        }
    }
}