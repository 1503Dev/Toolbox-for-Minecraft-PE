package defpackage;

/* renamed from: co  reason: default package */
public final class co extends on {
    public final wn V;

    public co(wn wnVar, in inVar) {
        super(false, inVar);
        if (wnVar != null) {
            if (!wnVar.j()) {
                wn n = wnVar.n();
                if (n.k()) {
                    this.V = n;
                    return;
                }
                throw new IllegalArgumentException("point not on curve");
            }
            throw new IllegalArgumentException("point at infinity");
        }
        throw new IllegalArgumentException("point has null value");
    }
}