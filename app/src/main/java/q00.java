package defpackage;

import defpackage.m81;

/* renamed from: q00  reason: default package */
public final class q00 extends m81 {
    public final int e;
    public final int f;
    public final int g;

    /* renamed from: q00$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends m81.a<a> {
        public int e;
        public int f;
        public int g;

        public a() {
            super(1);
            this.e = 0;
            this.f = 0;
            this.g = 0;
        }

        @Override // defpackage.m81.a
        public final a a() {
            return this;
        }
    }

    public q00(a aVar) {
        super(aVar);
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
    }

    @Override // defpackage.m81
    public final byte[] a() {
        byte[] a2 = super.a();
        z61.d0(a2, this.e, 16);
        z61.d0(a2, this.f, 20);
        z61.d0(a2, this.g, 24);
        return a2;
    }
}