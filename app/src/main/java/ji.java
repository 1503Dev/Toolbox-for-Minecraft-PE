package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: ji  reason: default package */
public final class ji implements q {
    public lk P;

    public ji(lk lkVar) {
        this.P = lkVar;
    }

    @Override // defpackage.q
    public final InputStream g() {
        return this.P;
    }

    @Override // defpackage.g
    public final t h() {
        try {
            return m();
        } catch (IOException e) {
            StringBuilder b = e5.b("IOException converting stream to byte array: ");
            b.append(e.getMessage());
            throw new s(0, b.toString(), e);
        }
    }

    @Override // defpackage.ex
    public final t m() {
        return new ii(this.P.g());
    }
}