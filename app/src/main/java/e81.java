package defpackage;

/* renamed from: e81  reason: default package */
public final class e81 extends n {
    public t P;

    public e81(g81 g81Var) {
        this.P = null;
        this.P = g81Var.h();
    }

    public e81(gi giVar) {
        this.P = giVar;
    }

    public e81(o oVar) {
        this.P = oVar;
    }

    public e81(t tVar) {
        this.P = tVar;
    }

    public static e81 p(g gVar) {
        if (gVar != null && !(gVar instanceof e81)) {
            if (gVar instanceof t) {
                return new e81((t) gVar);
            }
            if (gVar instanceof byte[]) {
                try {
                    return new e81(t.s((byte[]) gVar));
                } catch (Exception e) {
                    StringBuilder b = e5.b("unable to parse encoded data: ");
                    b.append(e.getMessage());
                    throw new IllegalArgumentException(b.toString());
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance()");
        }
        return (e81) gVar;
    }

    @Override // defpackage.n, defpackage.g
    public final t h() {
        return this.P;
    }
}