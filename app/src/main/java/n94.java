package defpackage;

import android.os.Bundle;

/* renamed from: n94  reason: default package */
public final class n94 implements nc4 {
    public final bg4 a;

    public n94(bg4 bg4Var) {
        this.a = bg4Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 15;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        mc4 mc4Var;
        String str;
        bg4 bg4Var = this.a;
        if (bg4Var != null && (str = bg4Var.a) != null && !str.isEmpty()) {
            mc4Var = new mc4() { // from class: m94
                @Override // defpackage.mc4
                public final void b(Object obj) {
                    ((Bundle) obj).putString("key_schema", n94.this.a.a);
                }
            };
        } else {
            mc4Var = null;
        }
        return zw4.C(mc4Var);
    }
}