package defpackage;

import java.util.NoSuchElementException;

/* renamed from: uv4  reason: default package */
public final class uv4 extends cx4 {
    public boolean Q;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv4(Object obj) {
        super(0);
        this.R = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.Q;
    }

    @Override // defpackage.cx4, java.util.Iterator
    public final Object next() {
        if (this.Q) {
            throw new NoSuchElementException();
        }
        this.Q = true;
        return this.R;
    }
}