package defpackage;

import java.util.Arrays;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: rv4  reason: default package */
public final class rv4 extends hv4 {
    @CheckForNull
    public Object[] T;
    public int U;

    public rv4(int i) {
        super(i);
        this.T = new Object[sv4.r(i)];
    }

    @Override // defpackage.fy4
    public final /* bridge */ /* synthetic */ fy4 l(Object obj) {
        s(obj);
        return this;
    }

    public final void s(Object obj) {
        obj.getClass();
        if (this.T != null) {
            int r = sv4.r(this.R);
            int length = this.T.length;
            if (r <= length) {
                int hashCode = obj.hashCode();
                int c = gv4.c(hashCode);
                while (true) {
                    Object[] objArr = this.T;
                    int i = c & (length - 1);
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        objArr[i] = obj;
                        this.U += hashCode;
                        p(obj);
                        return;
                    } else if (obj2.equals(obj)) {
                        return;
                    } else {
                        c = i + 1;
                    }
                }
            }
        }
        this.T = null;
        p(obj);
    }

    public final void t(Set set) {
        if (this.T == null) {
            q(set);
            return;
        }
        for (Object obj : set) {
            s(obj);
        }
    }

    public final sv4 u() {
        sv4 u;
        int i = this.R;
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (this.T != null && sv4.r(i) == this.T.length) {
                    int i2 = this.R;
                    Object[] objArr = this.Q;
                    int length = objArr.length;
                    if (i2 < (length >> 1) + (length >> 2)) {
                        z = true;
                    }
                    if (z) {
                        objArr = Arrays.copyOf(objArr, i2);
                    }
                    int i3 = this.U;
                    Object[] objArr2 = this.T;
                    u = new tw4(objArr, i3, objArr2, objArr2.length - 1, this.R);
                } else {
                    u = sv4.u(this.R, this.Q);
                    this.R = u.size();
                }
                this.S = true;
                this.T = null;
                return u;
            }
            Object obj = this.Q[0];
            obj.getClass();
            return new ax4(obj);
        }
        return tw4.Y;
    }
}