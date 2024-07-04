package defpackage;

import android.app.Activity;
import defpackage.ns0;
import defpackage.r2;

/* renamed from: ae0  reason: default package */
public final class ae0 implements r2.e {
    public ns0 a;

    /* renamed from: ae0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements r2.c {
        public rs0 a;

        public a(rs0 rs0Var) {
            this.a = rs0Var;
        }

        @Override // defpackage.r2.c
        public final void a() {
            this.a.a();
        }
    }

    public ae0(Activity activity) {
        ns0 ns0Var = new ns0(activity);
        this.a = ns0Var;
        ns0Var.a(new ns0.a() { // from class: is0
            @Override // defpackage.ns0.a
            public final void c() {
            }
        }, new Runnable() { // from class: js0
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // defpackage.r2.e
    public final boolean a() {
        return true;
    }

    @Override // defpackage.r2.e
    public final void b(boolean z) {
    }

    @Override // defpackage.r2.e
    public final void c(String str, r2.b bVar) {
        ns0.b c = this.a.c(str);
        if (c == null) {
            bVar.b();
        } else {
            this.a.b(c, str, 2, new zd0(bVar));
        }
    }

    @Override // defpackage.r2.e
    public final void d(final String str, r2.a aVar) {
        final ns0 ns0Var = this.a;
        final xd0 xd0Var = new xd0(aVar);
        ns0Var.getClass();
        ns0Var.a(new ns0.a() { // from class: ks0
            public final /* synthetic */ int c = 1;

            @Override // defpackage.ns0.a
            public final void c() {
                ns0 ns0Var2 = ns0.this;
                String str2 = str;
                int i = this.c;
                ns0.c cVar = xd0Var;
                ns0.b c = ns0Var2.c(str2);
                if (c != null) {
                    ns0Var2.b(c, str2, i, cVar);
                } else {
                    cVar.b();
                }
            }
        }, new nx(2, xd0Var));
    }
}