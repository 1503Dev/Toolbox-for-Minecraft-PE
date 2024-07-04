package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* renamed from: q23  reason: default package */
public abstract class q23 implements t53 {
    @Nullable
    public static w33 a;

    public static w33 c(Context context, @Nullable wk2 wk2Var, int i) {
        w33 w33Var;
        Context context2;
        tv2 tv2Var = new tv2();
        synchronized (q23.class) {
            w33Var = a;
            if (w33Var == null) {
                x92.a(context);
                kj4 b = kj4.b(context);
                xv2 a2 = b.a(i);
                b.c(wk2Var);
                kn2 kn2Var = new kn2();
                kn2Var.P = a2;
                kn2Var.R = new WeakReference(context);
                if (context.getApplicationContext() != null) {
                    context2 = context.getApplicationContext();
                } else {
                    context2 = context;
                }
                kn2Var.Q = context2;
                w33Var = new w33(new r23(kn2Var), new a53(tv2Var), new xa2(), new q05(), new tv2());
                jv5 jv5Var = jv5.A;
                jv5Var.g.d(context, a2);
                jv5Var.i.c(context);
                jv5Var.c.u(context);
                jv5Var.c.t(context);
                vx.y(context);
                jv5Var.f.c(context);
                jv5Var.x.a(context);
                ht2.b(context);
                l92 l92Var = x92.f5;
                w82 w82Var = w82.d;
                if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
                    if (!((Boolean) w82Var.c.a(x92.n0)).booleanValue()) {
                        j52 j52Var = new j52(new m52(context));
                        ez3 ez3Var = new ez3(new az3(context), (ez4) w33Var.n.c());
                        final l04 l04Var = new l04(context, a2, j52Var, ez3Var, UUID.randomUUID().toString(), w33Var.p());
                        final boolean C = jv5Var.g.b().C();
                        try {
                            ez3Var.a(new bl4() { // from class: j04
                                @Override // defpackage.bl4
                                public final Object e(Object obj) {
                                    String str;
                                    String str2;
                                    String str3;
                                    l04 l04Var2 = l04.this;
                                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                                    if (C) {
                                        l04Var2.b.deleteDatabase("OfflineUpload.db");
                                    } else {
                                        l04Var2.getClass();
                                        int i2 = 2;
                                        if (((Boolean) w82.d.c.a(x92.k7)).booleanValue()) {
                                            vl4 b2 = vl4.b("oa_upload");
                                            b2.a("oa_failed_reqs", String.valueOf(p5.r(sQLiteDatabase, 0)));
                                            b2.a("oa_total_reqs", String.valueOf(p5.r(sQLiteDatabase, 1)));
                                            jv5.A.j.getClass();
                                            b2.a("oa_upload_time", String.valueOf(System.currentTimeMillis()));
                                            b2.a("oa_last_successful_time", String.valueOf(p5.u(sQLiteDatabase)));
                                            if (l04Var2.f.C()) {
                                                str = "";
                                            } else {
                                                str = l04Var2.d;
                                            }
                                            b2.a("oa_session_id", str);
                                            l04Var2.e.a(b2);
                                            ArrayList v = p5.v(sQLiteDatabase);
                                            l04.a(sQLiteDatabase, v);
                                            int size = v.size();
                                            for (int i3 = 0; i3 < size; i3++) {
                                                j72 j72Var = (j72) v.get(i3);
                                                vl4 b3 = vl4.b("oa_signals");
                                                if (l04Var2.f.C()) {
                                                    str2 = "";
                                                } else {
                                                    str2 = l04Var2.d;
                                                }
                                                b3.a("oa_session_id", str2);
                                                e72 E = j72Var.E();
                                                if (E.A()) {
                                                    str3 = String.valueOf(E.C() - 1);
                                                } else {
                                                    str3 = "-1";
                                                }
                                                String obj2 = new xv4(j72Var.J()).toString();
                                                b3.a("oa_sig_ts", String.valueOf(j72Var.C()));
                                                b3.a("oa_sig_status", String.valueOf(j72Var.V() - 1));
                                                b3.a("oa_sig_resp_lat", String.valueOf(j72Var.B()));
                                                b3.a("oa_sig_render_lat", String.valueOf(j72Var.A()));
                                                b3.a("oa_sig_formats", obj2);
                                                b3.a("oa_sig_nw_type", str3);
                                                b3.a("oa_sig_wifi", String.valueOf(j72Var.W() - 1));
                                                b3.a("oa_sig_airplane", String.valueOf(j72Var.S() - 1));
                                                b3.a("oa_sig_data", String.valueOf(j72Var.T() - 1));
                                                b3.a("oa_sig_nw_resp", String.valueOf(j72Var.z()));
                                                b3.a("oa_sig_offline", String.valueOf(j72Var.U() - 1));
                                                b3.a("oa_sig_nw_state", String.valueOf(j72Var.I().P));
                                                if (E.z() && E.A() && E.C() == 2) {
                                                    b3.a("oa_sig_cell_type", String.valueOf(E.B() - 1));
                                                }
                                                l04Var2.e.a(b3);
                                            }
                                        } else {
                                            ArrayList v2 = p5.v(sQLiteDatabase);
                                            k72 w = n72.w();
                                            String packageName = l04Var2.b.getPackageName();
                                            w.j();
                                            n72.C((n72) w.Q, packageName);
                                            String str4 = Build.MODEL;
                                            w.j();
                                            n72.E((n72) w.Q, str4);
                                            int r = p5.r(sQLiteDatabase, 0);
                                            w.j();
                                            n72.z((n72) w.Q, r);
                                            w.j();
                                            n72.y((n72) w.Q, v2);
                                            int r2 = p5.r(sQLiteDatabase, 1);
                                            w.j();
                                            n72.A((n72) w.Q, r2);
                                            int r3 = p5.r(sQLiteDatabase, 3);
                                            w.j();
                                            n72.G((n72) w.Q, r3);
                                            jv5.A.j.getClass();
                                            long currentTimeMillis = System.currentTimeMillis();
                                            w.j();
                                            n72.B((n72) w.Q, currentTimeMillis);
                                            long u = p5.u(sQLiteDatabase);
                                            w.j();
                                            n72.F((n72) w.Q, u);
                                            n72 n72Var = (n72) w.h();
                                            l04.a(sQLiteDatabase, v2);
                                            j52 j52Var2 = l04Var2.a;
                                            synchronized (j52Var2) {
                                                if (j52Var2.c) {
                                                    try {
                                                        t62 t62Var = j52Var2.b;
                                                        t62Var.j();
                                                        u62.H((u62) t62Var.Q, n72Var);
                                                    } catch (NullPointerException e) {
                                                        jv5.A.g.f("AdMobClearcutLogger.modify", e);
                                                    }
                                                }
                                            }
                                            y72 w2 = z72.w();
                                            int i4 = l04Var2.c.Q;
                                            w2.j();
                                            z72.y((z72) w2.Q, i4);
                                            int i5 = l04Var2.c.R;
                                            w2.j();
                                            z72.z((z72) w2.Q, i5);
                                            if (true == l04Var2.c.S) {
                                                i2 = 0;
                                            }
                                            w2.j();
                                            z72.A((z72) w2.Q, i2);
                                            z72 z72Var = (z72) w2.h();
                                            j52 j52Var3 = l04Var2.a;
                                            synchronized (j52Var3) {
                                                if (j52Var3.c) {
                                                    try {
                                                        t62 t62Var2 = j52Var3.b;
                                                        m62 m62Var = (m62) ((u62) t62Var2.Q).x().g();
                                                        m62Var.j();
                                                        p62.z((p62) m62Var.Q, z72Var);
                                                        t62Var2.l(m62Var);
                                                    } catch (NullPointerException e2) {
                                                        jv5.A.g.f("AdMobClearcutLogger.modify", e2);
                                                    }
                                                }
                                            }
                                            l04Var2.a.b(10004);
                                        }
                                        sQLiteDatabase.delete("offline_signal_contents", null, null);
                                        p5.C(sQLiteDatabase, "failed_requests");
                                        p5.C(sQLiteDatabase, "total_requests");
                                        p5.C(sQLiteDatabase, "completed_requests");
                                    }
                                    return null;
                                }
                            });
                        } catch (Exception e) {
                            sv2.d("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
                        }
                    }
                }
                a = w33Var;
            }
        }
        return w33Var;
    }

    public abstract Executor a();

    public abstract ScheduledExecutorService b();

    public abstract y33 d();

    public abstract f43 e();

    public abstract bf3 f();

    public abstract p43 g();

    public abstract m33 h();

    public abstract rh i();

    public abstract cu3 j();

    public abstract cw2 k();

    public abstract dp2 l();

    public abstract r33 m(le4 le4Var);

    public abstract ij4 n();

    public abstract nj4 o();

    public abstract wl4 p();

    public abstract rm4 q();
}