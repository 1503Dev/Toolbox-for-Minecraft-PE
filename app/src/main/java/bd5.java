package defpackage;

import java.util.NoSuchElementException;

/* renamed from: bd5  reason: default package */
public final class bd5 extends cx4 {
    public int Q;
    public final int R;
    public final /* synthetic */ gd5 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd5(gd5 gd5Var) {
        super(1);
        this.S = gd5Var;
        this.Q = 0;
        this.R = gd5Var.o();
    }

    @Override // defpackage.cx4
    public final byte a() {
        int i = this.Q;
        if (i < this.R) {
            this.Q = i + 1;
            return this.S.m(i);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.Q < this.R;
    }
}