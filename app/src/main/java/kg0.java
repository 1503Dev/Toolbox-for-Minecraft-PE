package defpackage;

import java.security.BasicPermission;
import java.security.Permission;
import java.util.StringTokenizer;

/* renamed from: kg0  reason: default package */
public final class kg0 extends BasicPermission {
    public final String P;
    public final int Q;

    public kg0(String str) {
        super("SC", str);
        this.P = str;
        StringTokenizer stringTokenizer = new StringTokenizer(hu0.b(str), " ,");
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals("threadlocalecimplicitlyca")) {
                i |= 1;
            } else if (nextToken.equals("ecimplicitlyca")) {
                i |= 2;
            } else if (nextToken.equals("threadlocaldhdefaultparams")) {
                i |= 4;
            } else if (nextToken.equals("dhdefaultparams")) {
                i |= 8;
            } else if (nextToken.equals("acceptableeccurves")) {
                i |= 16;
            } else if (nextToken.equals("additionalecparameters")) {
                i |= 32;
            } else if (nextToken.equals("all")) {
                i |= 63;
            }
        }
        if (i != 0) {
            this.Q = i;
            return;
        }
        throw new IllegalArgumentException("unknown permissions passed to mask");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kg0) {
            kg0 kg0Var = (kg0) obj;
            return this.Q == kg0Var.Q && getName().equals(kg0Var.getName());
        }
        return false;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final String getActions() {
        return this.P;
    }

    public final int hashCode() {
        return getName().hashCode() + this.Q;
    }

    @Override // java.security.BasicPermission, java.security.Permission
    public final boolean implies(Permission permission) {
        if ((permission instanceof kg0) && getName().equals(permission.getName())) {
            int i = this.Q;
            int i2 = ((kg0) permission).Q;
            return (i & i2) == i2;
        }
        return false;
    }
}