package defpackage;

/* renamed from: u81  reason: default package */
public final class u81 extends o7 {
    public final r81 U;
    public final byte[] V;
    public final byte[] W;

    /* renamed from: u81$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public final r81 a;
        public byte[] b = null;
        public byte[] c = null;

        public a(r81 r81Var) {
            this.a = r81Var;
        }
    }

    public u81(a aVar) {
        r81 r81Var = aVar.a;
        this.U = r81Var;
        if (r81Var != null) {
            int a2 = r81Var.a();
            byte[] bArr = aVar.b;
            if (bArr != null) {
                if (bArr.length == a2) {
                    this.V = bArr;
                } else {
                    throw new IllegalArgumentException("length of root must be equal to length of digest");
                }
            } else {
                this.V = new byte[a2];
            }
            byte[] bArr2 = aVar.c;
            if (bArr2 != null) {
                if (bArr2.length == a2) {
                    this.W = bArr2;
                    return;
                }
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.W = new byte[a2];
            return;
        }
        throw new NullPointerException("params == null");
    }

    public final byte[] o() {
        int a2 = this.U.a();
        byte[] bArr = new byte[a2 + a2];
        vj.m(0, bArr, this.V);
        vj.m(a2 + 0, bArr, this.W);
        return bArr;
    }
}