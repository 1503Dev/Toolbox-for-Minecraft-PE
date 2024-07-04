package defpackage;

/* renamed from: z40  reason: default package */
public final class z40 extends n {
    public int P;
    public int Q;
    public byte[] R;
    public byte[] S;
    public byte[] T;
    public byte[] U;
    public byte[] V;

    public z40(int i, int i2, ts tsVar, gf0 gf0Var, ge0 ge0Var, ge0 ge0Var2, rs rsVar) {
        this.P = i;
        this.Q = i2;
        int i3 = tsVar.b;
        this.R = new byte[]{(byte) i3, (byte) (i3 >>> 8), (byte) (i3 >>> 16), (byte) (i3 >>> 24)};
        this.S = gf0Var.e();
        this.T = rsVar.a();
        this.U = ge0Var.a();
        this.V = ge0Var2.a();
    }

    public z40(u uVar) {
        this.P = ((l) uVar.x(0)).x().intValue();
        this.Q = ((l) uVar.x(1)).x().intValue();
        this.R = ((p) uVar.x(2)).x();
        this.S = ((p) uVar.x(3)).x();
        this.U = ((p) uVar.x(4)).x();
        this.V = ((p) uVar.x(5)).x();
        this.T = ((p) uVar.x(6)).x();
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        s82 s82Var = new s82(12);
        s82Var.g(new l(this.P));
        s82Var.g(new l(this.Q));
        s82Var.g(new ii(this.R));
        s82Var.g(new ii(this.S));
        s82Var.g(new ii(this.U));
        s82Var.g(new ii(this.V));
        s82Var.g(new ii(this.T));
        return new mi(s82Var);
    }
}