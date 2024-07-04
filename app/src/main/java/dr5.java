package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import defpackage.gt;
import defpackage.l4;
import defpackage.zv0;

/* renamed from: dr5  reason: default package */
public final class dr5 extends gt<l4.c.C0043c> implements y6 {
    public static final l4<l4.c.C0043c> k = new l4<>("AppSet.API", new kp5(), new l4.f());
    public final Context i;
    public final jt j;

    public dr5(Context context, jt jtVar) {
        super(context, k, l4.c.a, gt.a.b);
        this.i = context;
        this.j = jtVar;
    }

    @Override // defpackage.y6
    public final yv0<z6> a() {
        if (this.j.c(this.i, 212800000) == 0) {
            zv0.a aVar = new zv0.a();
            aVar.c = new wp[]{xz3.a};
            aVar.a = new dk5(6, this);
            aVar.b = false;
            aVar.d = 27601;
            return c(0, aVar.a());
        }
        return dw0.a(new m4(new Status(17, null)));
    }
}