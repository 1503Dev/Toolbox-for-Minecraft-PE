package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ki  reason: default package */
public final class ki extends r {
    public ki(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.r
    public final ki a() {
        return this;
    }

    @Override // defpackage.r
    public final r b() {
        return this;
    }

    @Override // defpackage.r
    public final void g(g gVar) {
        if (gVar == null) {
            throw new IOException("null object detected");
        }
        gVar.h().u().q(this);
    }
}