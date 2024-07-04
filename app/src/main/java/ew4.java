package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
import javax.annotation.CheckForNull;

/* renamed from: ew4  reason: default package */
public abstract class ew4 extends AbstractMap {
    @CheckForNull
    public transient ut4 P;
    @CheckForNull
    public transient dw4 Q;

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ut4 ut4Var = this.P;
        if (ut4Var == null) {
            ut4 ut4Var2 = new ut4((wt4) this);
            this.P = ut4Var2;
            return ut4Var2;
        }
        return ut4Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        dw4 dw4Var = this.Q;
        if (dw4Var == null) {
            dw4 dw4Var2 = new dw4(this);
            this.Q = dw4Var2;
            return dw4Var2;
        }
        return dw4Var;
    }
}