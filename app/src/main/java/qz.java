package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: qz  reason: default package */
public final class qz extends wz implements Iterable<wz> {
    public final ArrayList P = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof qz) && ((qz) obj).P.equals(this.P));
    }

    @Override // defpackage.wz
    public final boolean g() {
        if (this.P.size() == 1) {
            return ((wz) this.P.get(0)).g();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.wz
    public final float h() {
        if (this.P.size() == 1) {
            return ((wz) this.P.get(0)).h();
        }
        throw new IllegalStateException();
    }

    public final int hashCode() {
        return this.P.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator<wz> iterator() {
        return this.P.iterator();
    }

    @Override // defpackage.wz
    public final int m() {
        if (this.P.size() == 1) {
            return ((wz) this.P.get(0)).m();
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.wz
    public final String q() {
        if (this.P.size() == 1) {
            return ((wz) this.P.get(0)).q();
        }
        throw new IllegalStateException();
    }

    public final wz r(int i) {
        return (wz) this.P.get(i);
    }
}