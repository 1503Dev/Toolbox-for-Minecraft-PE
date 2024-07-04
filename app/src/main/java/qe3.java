package defpackage;

import java.util.Arrays;

/* renamed from: qe3  reason: default package */
public final class qe3 {
    public final String a;
    public final int b;
    public final cu1[] c;
    public int d;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public qe3(String str, cu1... cu1VarArr) {
        this.a = str;
        this.c = cu1VarArr;
        int a = mx2.a(cu1VarArr[0].k);
        this.b = a == -1 ? mx2.a(cu1VarArr[0].j) : a;
        String str2 = cu1VarArr[0].c;
        if (str2 != null) {
            str2.equals("und");
        }
        cu1VarArr[0].getClass();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qe3.class == obj.getClass()) {
            qe3 qe3Var = (qe3) obj;
            if (this.a.equals(qe3Var.a) && Arrays.equals(this.c, qe3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.d;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.c) + ((this.a.hashCode() + 527) * 31);
            this.d = hashCode;
            return hashCode;
        }
        return i;
    }
}