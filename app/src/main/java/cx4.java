package defpackage;

import java.util.Iterator;

/* renamed from: cx4  reason: default package */
public abstract class cx4 implements Iterator {
    public final /* synthetic */ int P;

    public /* synthetic */ cx4(int i) {
        this.P = i;
    }

    public abstract byte a();

    @Override // java.util.Iterator
    public /* synthetic */ Object next() {
        return Byte.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.P) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}