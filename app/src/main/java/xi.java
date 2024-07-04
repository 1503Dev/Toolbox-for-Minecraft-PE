package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: xi  reason: default package */
public final class xi extends r {
    public xi(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // defpackage.r
    public final void g(g gVar) {
        if (gVar == null) {
            throw new IOException("null object detected");
        }
        gVar.h().v().q(this);
    }
}