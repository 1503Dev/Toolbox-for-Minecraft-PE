package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import javax.annotation.CheckForNull;

/* renamed from: nu4  reason: default package */
public abstract class nu4 implements gw4 {
    @CheckForNull
    public transient zt4 P;
    @CheckForNull
    public transient mu4 Q;
    @CheckForNull
    public transient wt4 R;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gw4) {
            return s().equals(((gw4) obj).s());
        }
        return false;
    }

    public final int hashCode() {
        return s().hashCode();
    }

    @Override // defpackage.gw4
    public final Map s() {
        wt4 wt4Var;
        wt4 wt4Var2 = this.R;
        if (wt4Var2 == null) {
            iw4 iw4Var = (iw4) this;
            Map map = iw4Var.S;
            if (map instanceof NavigableMap) {
                wt4Var = new au4(iw4Var, (NavigableMap) map);
            } else if (map instanceof SortedMap) {
                wt4Var = new du4(iw4Var, (SortedMap) map);
            } else {
                wt4Var = new wt4(iw4Var, map);
            }
            this.R = wt4Var;
            return wt4Var;
        }
        return wt4Var2;
    }

    public final String toString() {
        return s().toString();
    }
}