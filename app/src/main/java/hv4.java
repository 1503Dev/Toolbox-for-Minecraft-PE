package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* renamed from: hv4  reason: default package */
public class hv4 extends fy4 {
    public Object[] Q;
    public int R;
    public boolean S;

    public hv4(int i) {
        super(8);
        this.Q = new Object[i];
        this.R = 0;
    }

    public final void p(Object obj) {
        obj.getClass();
        r(this.R + 1);
        Object[] objArr = this.Q;
        int i = this.R;
        this.R = i + 1;
        objArr[i] = obj;
    }

    public final void q(Collection collection) {
        if (collection instanceof Collection) {
            r(collection.size() + this.R);
            if (collection instanceof iv4) {
                this.R = ((iv4) collection).g(this.R, this.Q);
                return;
            }
        }
        for (Object obj : collection) {
            l(obj);
        }
    }

    public final void r(int i) {
        Object[] objArr = this.Q;
        int length = objArr.length;
        if (length < i) {
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                int highestOneBit = Integer.highestOneBit(i - 1);
                i2 = highestOneBit + highestOneBit;
            }
            if (i2 < 0) {
                i2 = Integer.MAX_VALUE;
            }
            this.Q = Arrays.copyOf(objArr, i2);
        } else if (this.S) {
            this.Q = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.S = false;
    }
}