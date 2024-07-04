package defpackage;

/* renamed from: m81  reason: default package */
public abstract class m81 {
    public final int a;
    public final long b;
    public final int c;
    public final int d;

    /* renamed from: m81$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class a<T extends a> {
        public final int a;
        public int b = 0;
        public long c = 0;
        public int d = 0;

        public a(int i) {
            this.a = i;
        }

        public abstract T a();

        public final T b(int i) {
            this.d = i;
            return a();
        }

        public final T c(int i) {
            this.b = i;
            return a();
        }

        public final T d(long j) {
            this.c = j;
            return a();
        }
    }

    public m81(a aVar) {
        this.a = aVar.b;
        this.b = aVar.c;
        this.c = aVar.a;
        this.d = aVar.d;
    }

    public byte[] a() {
        byte[] bArr = new byte[32];
        z61.d0(bArr, this.a, 0);
        z61.x0(4, this.b, bArr);
        z61.d0(bArr, this.c, 12);
        z61.d0(bArr, this.d, 28);
        return bArr;
    }
}