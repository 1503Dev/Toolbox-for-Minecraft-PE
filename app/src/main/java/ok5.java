package defpackage;

import android.text.TextUtils;

/* renamed from: ok5  reason: default package */
public final class ok5 {
    public final String a;
    public final cu1 b;
    public final cu1 c;
    public final int d;
    public final int e;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ok5(String str, cu1 cu1Var, cu1 cu1Var2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            tv2.G(z);
            if (TextUtils.isEmpty(str)) {
                this.a = str;
                cu1Var.getClass();
                this.b = cu1Var;
                cu1Var2.getClass();
                this.c = cu1Var2;
                this.d = i;
                this.e = i2;
                return;
            }
            throw new IllegalArgumentException();
        }
        z = true;
        tv2.G(z);
        if (TextUtils.isEmpty(str)) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ok5.class == obj.getClass()) {
            ok5 ok5Var = (ok5) obj;
            if (this.d == ok5Var.d && this.e == ok5Var.e && this.a.equals(ok5Var.a) && this.b.equals(ok5Var.b) && this.c.equals(ok5Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.d + 527) * 31) + this.e) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }
}