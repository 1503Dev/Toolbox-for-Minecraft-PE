package defpackage;

import android.content.Context;
import android.preference.PreferenceManager;
import defpackage.el0;
import defpackage.hs0;
import defpackage.ns0;
import defpackage.qs0;
import java.io.IOException;
import java.util.UUID;

/* renamed from: ms0  reason: default package */
public final class ms0 implements el0.a {
    public final /* synthetic */ hs0.a a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ns0.c d;
    public final /* synthetic */ ns0 e;

    public ms0(ns0 ns0Var, hs0.a aVar, String str, int i, ns0.c cVar) {
        this.e = ns0Var;
        this.a = aVar;
        this.b = str;
        this.c = i;
        this.d = cVar;
    }

    @Override // defpackage.el0.a
    public final void a() {
        final ns0 ns0Var = this.e;
        final hs0.a aVar = this.a;
        String str = this.b;
        final int i = this.c;
        final ns0.c cVar = this.d;
        Context context = ns0Var.a;
        String str2 = null;
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("ad_anon_sid", null);
        long j = PreferenceManager.getDefaultSharedPreferences(context).getLong("ad_anon_sid_expire_time", 0L);
        long currentTimeMillis = System.currentTimeMillis() + 86400000;
        if (j > currentTimeMillis) {
            PreferenceManager.getDefaultSharedPreferences(context).edit().putLong("ad_anon_sid_expire_time", currentTimeMillis).apply();
            j = currentTimeMillis;
        }
        if (System.currentTimeMillis() <= j) {
            str2 = string;
        }
        if (str2 == null) {
            str2 = UUID.randomUUID().toString();
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString("ad_anon_sid", str2).putLong("ad_anon_sid_expire_time", currentTimeMillis).apply();
        }
        pb<p2> b = ns0Var.b.b(aVar.a, str, cm0.b(i), str2);
        qs0 qs0Var = new qs0();
        qs0Var.d(new qs0.b() { // from class: ls0
            @Override // defpackage.qs0.b
            public final void b(ol0 ol0Var) {
                ns0 ns0Var2 = ns0.this;
                hs0.a aVar2 = aVar;
                int i2 = i;
                ns0.c cVar2 = cVar;
                ns0Var2.getClass();
                if (ol0Var.b != 0) {
                    cVar2.a(new rs0(ns0Var2.a, new vs0(aVar2, i2, ((p2) ol0Var.b).a, ns0Var2.c, ns0Var2.b)));
                    return;
                }
                throw new IOException("body is null");
            }
        });
        qs0Var.c(new ia0(3, cVar));
        b.g(qs0Var);
    }

    @Override // defpackage.el0.a
    public final void b() {
        this.d.b();
    }
}