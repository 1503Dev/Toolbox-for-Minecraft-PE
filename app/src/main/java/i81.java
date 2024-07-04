package defpackage;

/* renamed from: i81  reason: default package */
public final class i81 extends n {
    public final ii P;
    public hn Q;
    public wn R;

    public i81(hn hnVar, p pVar) {
        this(hnVar, pVar.x());
    }

    public i81(hn hnVar, byte[] bArr) {
        this.Q = hnVar;
        this.P = new ii(j7.c(bArr));
    }

    public i81(wn wnVar) {
        this.R = wnVar.n();
        this.P = new ii(wnVar.g());
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        return this.P;
    }
}