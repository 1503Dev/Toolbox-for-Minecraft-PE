package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import javax.annotation.CheckForNull;

/* renamed from: tv4  reason: default package */
public final class tv4 extends cx4 {
    @CheckForNull
    public Object Q;
    public int R;
    public final /* synthetic */ Iterator S;
    public final /* synthetic */ ht4 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv4(Iterator it, ht4 ht4Var) {
        super(0);
        this.S = it;
        this.T = ht4Var;
        this.R = 2;
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public final boolean hasNext() {
        boolean z;
        int i = this.R;
        if (i != 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            Object obj = null;
            if (i != 0) {
                if (i2 == 0) {
                    return true;
                }
                if (i2 != 2) {
                    this.R = 4;
                    while (true) {
                        if (this.S.hasNext()) {
                            Object next = this.S.next();
                            if (this.T.e(next)) {
                                obj = next;
                                break;
                            }
                        } else {
                            this.R = 3;
                            break;
                        }
                    }
                    this.Q = obj;
                    if (this.R != 3) {
                        this.R = 1;
                        return true;
                    }
                }
                return false;
            }
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.cx4, java.util.Iterator
    /* renamed from: c */
    public final Object next() {
        if (hasNext()) {
            this.R = 2;
            Object obj = this.Q;
            this.Q = null;
            return obj;
        }
        throw new NoSuchElementException();
    }
}