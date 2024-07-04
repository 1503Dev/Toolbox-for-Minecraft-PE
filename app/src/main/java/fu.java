package defpackage;

import defpackage.m81;

/* renamed from: fu  reason: default package */
public final class fu extends m81 {
    public final int e;
    public final int f;

    /* renamed from: fu$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends m81.a<a> {
        public int e;
        public int f;

        public a() {
            super(2);
            this.e = 0;
            this.f = 0;
        }

        @Override // defpackage.m81.a
        public final a a() {
            return this;
        }

        public final m81 e() {
            return new fu(this);
        }
    }

    public fu(a aVar) {
        super(aVar);
        this.e = aVar.e;
        this.f = aVar.f;
    }

    @Override // defpackage.m81
    public final byte[] a() {
        byte[] a2 = super.a();
        z61.d0(a2, 0, 16);
        z61.d0(a2, this.e, 20);
        z61.d0(a2, this.f, 24);
        return a2;
    }
}