package defpackage;

import defpackage.qa0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* renamed from: z81  reason: default package */
public final class z81 extends o7 {
    public final x81 U;
    public final byte[] V;
    public final byte[] W;
    public final byte[] X;
    public final byte[] Y;
    public final p8 Z;

    /* renamed from: z81$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final x81 a;
        public int b = 0;
        public byte[] c = null;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public p8 g = null;

        public a(x81 x81Var) {
            this.a = x81Var;
        }
    }

    public z81(a aVar) {
        x81 x81Var = aVar.a;
        this.U = x81Var;
        if (x81Var != null) {
            int a2 = x81Var.a();
            byte[] bArr = aVar.c;
            if (bArr != null) {
                if (bArr.length == a2) {
                    this.V = bArr;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
            } else {
                this.V = new byte[a2];
            }
            byte[] bArr2 = aVar.d;
            if (bArr2 != null) {
                if (bArr2.length == a2) {
                    this.W = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
            } else {
                this.W = new byte[a2];
            }
            byte[] bArr3 = aVar.e;
            if (bArr3 != null) {
                if (bArr3.length == a2) {
                    this.X = bArr3;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
            } else {
                this.X = new byte[a2];
            }
            byte[] bArr4 = aVar.f;
            if (bArr4 != null) {
                if (bArr4.length == a2) {
                    this.Y = bArr4;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
            } else {
                this.Y = new byte[a2];
            }
            p8 p8Var = aVar.g;
            if (p8Var == null) {
                int i = aVar.b;
                int i2 = x81Var.b;
                if (i < (1 << i2) - 2 && bArr3 != null && bArr != null) {
                    qa0 qa0Var = new qa0(new qa0.a());
                    int i3 = aVar.b;
                    p8Var = new p8(x81Var.a, x81Var.b, x81Var.c);
                    p8Var.a(bArr3, bArr, qa0Var);
                    while (p8Var.X < i3) {
                        p8Var.b(bArr3, bArr, qa0Var);
                        p8Var.Y = false;
                    }
                } else {
                    p8 p8Var2 = new p8(x81Var.a, i2, x81Var.c);
                    p8Var2.X = i;
                    p8Var2.Y = true;
                    this.Z = p8Var2;
                    return;
                }
            }
            this.Z = p8Var;
            return;
        }
        throw new NullPointerException("params == null");
    }

    public final byte[] o() {
        int a2 = this.U.a();
        int i = a2 + 4;
        int i2 = i + a2;
        int i3 = i2 + a2;
        byte[] bArr = new byte[a2 + i3];
        z61.d0(bArr, this.Z.X, 0);
        vj.m(4, bArr, this.V);
        vj.m(i, bArr, this.W);
        vj.m(i2, bArr, this.X);
        vj.m(i3, bArr, this.Y);
        try {
            p8 p8Var = this.Z;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(p8Var);
            objectOutputStream.flush();
            return j7.e(bArr, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            StringBuilder b = e5.b("error serializing bds state: ");
            b.append(e.getMessage());
            throw new RuntimeException(b.toString());
        }
    }
}