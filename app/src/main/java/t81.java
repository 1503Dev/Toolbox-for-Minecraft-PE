package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* renamed from: t81  reason: default package */
public final class t81 extends o7 {
    public final r81 U;
    public final long V;
    public final byte[] W;
    public final byte[] X;
    public final byte[] Y;
    public final byte[] Z;
    public final q8 a0;

    /* renamed from: t81$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final r81 a;
        public long b = 0;
        public byte[] c = null;
        public byte[] d = null;
        public byte[] e = null;
        public byte[] f = null;
        public q8 g = null;

        public a(r81 r81Var) {
            this.a = r81Var;
        }
    }

    public t81(a aVar) {
        r81 r81Var = aVar.a;
        this.U = r81Var;
        if (r81Var != null) {
            int a2 = r81Var.a();
            long j = aVar.b;
            this.V = j;
            byte[] bArr = aVar.c;
            if (bArr != null) {
                if (bArr.length == a2) {
                    this.W = bArr;
                } else {
                    throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
                }
            } else {
                this.W = new byte[a2];
            }
            byte[] bArr2 = aVar.d;
            if (bArr2 != null) {
                if (bArr2.length == a2) {
                    this.X = bArr2;
                } else {
                    throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
                }
            } else {
                this.X = new byte[a2];
            }
            byte[] bArr3 = aVar.e;
            if (bArr3 != null) {
                if (bArr3.length == a2) {
                    this.Y = bArr3;
                } else {
                    throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
                }
            } else {
                this.Y = new byte[a2];
            }
            byte[] bArr4 = aVar.f;
            if (bArr4 != null) {
                if (bArr4.length == a2) {
                    this.Z = bArr4;
                } else {
                    throw new IllegalArgumentException("size of root needs to be equal size of digest");
                }
            } else {
                this.Z = new byte[a2];
            }
            q8 q8Var = aVar.g;
            if (q8Var == null) {
                if (vj.u(j, r81Var.b) && bArr3 != null && bArr != null) {
                    q8Var = new q8(r81Var, aVar.b, bArr3, bArr);
                } else {
                    this.a0 = new q8();
                    return;
                }
            }
            this.a0 = q8Var;
            return;
        }
        throw new NullPointerException("params == null");
    }

    public final byte[] o() {
        int a2 = this.U.a();
        int i = (this.U.b + 7) / 8;
        byte[] bArr = new byte[i + a2 + a2 + a2 + a2];
        vj.m(0, bArr, vj.G(this.V, i));
        int i2 = i + 0;
        vj.m(i2, bArr, this.W);
        int i3 = i2 + a2;
        vj.m(i3, bArr, this.X);
        int i4 = i3 + a2;
        vj.m(i4, bArr, this.Y);
        vj.m(i4 + a2, bArr, this.Z);
        try {
            q8 q8Var = this.a0;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(q8Var);
            objectOutputStream.flush();
            return j7.e(bArr, byteArrayOutputStream.toByteArray());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("error serializing bds state");
        }
    }
}