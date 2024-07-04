package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

@SuppressLint({"UseSparseArrays"})
/* renamed from: tc1  reason: default package */
public final class tc1 {
    public final LinkedHashMap<Integer, jd1> a = new LinkedHashMap<>();
    public int b = 2;
    public final HashMap<String, ArrayList<zc1>> c = new HashMap<>();
    public int d = 1;
    public final LinkedBlockingQueue<ic1> e = new LinkedBlockingQueue<>();
    public boolean f = false;
    public final ScheduledExecutorService g = Executors.newSingleThreadScheduledExecutor();
    public final ExecutorService h = Executors.newSingleThreadExecutor();
    public ScheduledFuture<?> i;

    /* renamed from: tc1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ Context P;

        public a(Context context) {
            this.P = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ic1 ic1Var = ga1.h().p().b;
            ic1 ic1Var2 = new ic1();
            eb1.j(ic1Var, "os_name", "android");
            eb1.j(ic1Var2, "filepath", ga1.h().r().a + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            eb1.i(ic1Var2, "info", ic1Var);
            eb1.l(0, ic1Var2, "m_origin");
            tc1 tc1Var = tc1.this;
            int i = tc1Var.d;
            tc1Var.d = i + 1;
            eb1.l(i, ic1Var2, "m_id");
            eb1.j(ic1Var2, "m_type", "Controller.create");
            try {
                new kd1(this.P, new rc1(ic1Var2)).o();
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder();
                sb.append(e.toString() + ": during WebView initialization.");
                sb.append(" Disabling AdColony.");
                ga1.h().n().d(0, 0, sb.toString(), false);
                w1.d();
            }
        }
    }

    public static void b(tc1 tc1Var, ic1 ic1Var) {
        StringBuilder sb;
        String str;
        tc1Var.getClass();
        try {
            String h = ic1Var.h("m_type");
            int d = ic1Var.d("m_origin");
            wc1 wc1Var = new wc1(tc1Var, h, ic1Var);
            if (d >= 2) {
                eg1.n(wc1Var);
            } else {
                tc1Var.h.execute(wc1Var);
            }
        } catch (RejectedExecutionException e) {
            e = e;
            sb = new StringBuilder();
            str = "RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ";
            sb.append(str);
            sb.append(e.toString());
            t1.b(0, 0, sb.toString(), true);
        } catch (JSONException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "JSON error from message dispatcher's dispatchNativeMessage(): ";
            sb.append(str);
            sb.append(e.toString());
            t1.b(0, 0, sb.toString(), true);
        }
    }

    public final void a() {
        Context context;
        ad1 h = ga1.h();
        if (!h.B && !h.C && (context = ga1.P) != null) {
            d();
            eg1.n(new a(context));
        }
    }

    public final boolean c(int i) {
        synchronized (this.a) {
            jd1 remove = this.a.remove(Integer.valueOf(i));
            if (remove != null) {
                remove.b();
                return true;
            }
            return false;
        }
    }

    public final void d() {
        if (this.f) {
            return;
        }
        synchronized (this.e) {
            if (this.f) {
                return;
            }
            this.f = true;
            new Thread(new uc1(this)).start();
        }
    }

    public final void e(ic1 ic1Var) {
        boolean z;
        try {
            int i = this.d;
            synchronized (ic1Var.a) {
                if (!ic1Var.a.has("m_id")) {
                    ic1Var.a.put("m_id", i);
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                this.d++;
            }
            synchronized (ic1Var.a) {
                if (!ic1Var.a.has("m_origin")) {
                    ic1Var.a.put("m_origin", 0);
                }
            }
            int d = ic1Var.d("m_target");
            if (d == 0) {
                d();
                this.e.add(ic1Var);
                return;
            }
            jd1 jd1Var = this.a.get(Integer.valueOf(d));
            if (jd1Var != null) {
                jd1Var.d(ic1Var);
            }
        } catch (JSONException e) {
            StringBuilder b = e5.b("JSON error in ADCMessageDispatcher's sendMessage(): ");
            b.append(e.toString());
            t1.b(0, 0, b.toString(), true);
        }
    }

    public final boolean f() {
        for (jd1 jd1Var : this.a.values()) {
            if (jd1Var.a()) {
                return true;
            }
        }
        return false;
    }

    public final void g() {
        if (f() && this.i == null) {
            try {
                this.i = this.g.scheduleAtFixedRate(new vc1(this), 0L, 17L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                StringBuilder b = e5.b("Error when scheduling message pumping");
                b.append(e.toString());
                t1.b(0, 0, b.toString(), true);
            }
        }
    }
}