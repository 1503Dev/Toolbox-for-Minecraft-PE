package defpackage;

import java.security.interfaces.ECPrivateKey;

/* renamed from: y33  reason: default package */
public final class y33 implements vc3, xz4 {
    public final Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public /* synthetic */ y33(ECPrivateKey eCPrivateKey, byte[] bArr, String str, w45 w45Var) {
        this.a = eCPrivateKey;
        this.b = new nt2(2, eCPrivateKey);
        this.d = bArr;
        this.c = str;
        this.e = w45Var;
    }

    public /* synthetic */ y33(w33 w33Var) {
        this.a = w33Var;
    }

    @Override // defpackage.vc3
    public final /* synthetic */ vc3 a(bg4 bg4Var) {
        this.c = bg4Var;
        return this;
    }

    @Override // defpackage.vc3
    public final /* synthetic */ vc3 b(zg4 zg4Var) {
        this.b = zg4Var;
        return this;
    }

    @Override // defpackage.vc3
    /* renamed from: c */
    public final z33 f() {
        tv2.E(zg3.class, (zg3) this.d);
        tv2.E(yc3.class, (yc3) this.e);
        return new z33((w33) this.a, new xa2(), new zf(), new zf(), new ea2(), (zg3) this.d, (yc3) this.e, (zg4) this.b, (bg4) this.c);
    }
}