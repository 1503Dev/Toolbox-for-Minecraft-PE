package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: gn4  reason: default package */
public final class gn4 {
    public final Context a;
    public final Executor b;
    public final wv2 c;
    public final rm4 d;

    public gn4(Context context, yw2 yw2Var, wv2 wv2Var, rm4 rm4Var) {
        this.a = context;
        this.b = yw2Var;
        this.c = wv2Var;
        this.d = rm4Var;
    }

    public final void a(final String str, final qm4 qm4Var) {
        if (rm4.b() && ((Boolean) fb2.d.d()).booleanValue()) {
            this.b.execute(new Runnable() { // from class: dn4
                @Override // java.lang.Runnable
                public final void run() {
                    gn4 gn4Var = gn4.this;
                    String str2 = str;
                    qm4 qm4Var2 = qm4Var;
                    hm4 t = eb1.t(gn4Var.a, 14);
                    t.f();
                    t.k0(gn4Var.c.m(str2));
                    if (qm4Var2 == null) {
                        gn4Var.d.c(t.n());
                        return;
                    }
                    qm4Var2.b(t);
                    qm4Var2.h();
                }
            });
        } else {
            this.b.execute(new yr1(1, this, str));
        }
    }

    public final void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a((String) it.next(), null);
        }
    }
}