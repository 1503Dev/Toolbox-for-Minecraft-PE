package defpackage;

import android.os.Bundle;

/* renamed from: b94  reason: default package */
public final class b94 implements nc4 {
    public static final Object h = new Object();
    public final String a;
    public final String b;
    public final pb3 c;
    public final qj4 d;
    public final li4 e;
    public final nl5 f = jv5.A.g.b();
    public final xr3 g;

    public b94(String str, String str2, pb3 pb3Var, qj4 qj4Var, li4 li4Var, xr3 xr3Var) {
        this.a = str;
        this.b = str2;
        this.c = pb3Var;
        this.d = qj4Var;
        this.e = li4Var;
        this.g = xr3Var;
    }

    @Override // defpackage.nc4
    public final int a() {
        return 12;
    }

    @Override // defpackage.nc4
    public final dz4 c() {
        final Bundle bundle = new Bundle();
        l92 l92Var = x92.t6;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            this.g.a.put("seq_num", this.a);
        }
        if (((Boolean) w82Var.c.a(x92.B4)).booleanValue()) {
            this.c.a(this.e.d);
            bundle.putAll(this.d.a());
        }
        return zw4.C(new mc4() { // from class: a94
            /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
            /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
            @Override // defpackage.mc4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void b(Object obj) {
                b94 b94Var = b94.this;
                Bundle bundle2 = bundle;
                Bundle bundle3 = (Bundle) obj;
                b94Var.getClass();
                l92 l92Var2 = x92.B4;
                w82 w82Var2 = w82.d;
                if (!((Boolean) w82Var2.c.a(l92Var2)).booleanValue()) {
                    if (((Boolean) w82Var2.c.a(x92.A4)).booleanValue()) {
                        synchronized (b94.h) {
                            b94Var.c.a(b94Var.e.d);
                            bundle3.putBundle("quality_signals", b94Var.d.a());
                        }
                        bundle3.putString("seq_num", b94Var.a);
                        if (b94Var.f.C()) {
                            bundle3.putString("session_id", b94Var.b);
                            return;
                        }
                        return;
                    }
                    b94Var.c.a(b94Var.e.d);
                    bundle2 = b94Var.d.a();
                }
                bundle3.putBundle("quality_signals", bundle2);
                bundle3.putString("seq_num", b94Var.a);
                if (b94Var.f.C()) {
                }
            }
        });
    }
}