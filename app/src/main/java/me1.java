package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: me1  reason: default package */
public final class me1 {
    public xb1 a;
    public ScheduledExecutorService b;
    public HashMap<String, Object> d;
    public ArrayList c = new ArrayList();
    public ja1 e = new ja1("adcolony_android", "4.8.0", "Production");

    /* renamed from: me1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public final /* synthetic */ hc1 P;

        public a(hc1 hc1Var) {
            this.P = hc1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            me1.this.c.add(this.P);
        }
    }

    public me1(xb1 xb1Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.a = xb1Var;
        this.b = scheduledExecutorService;
        this.d = hashMap;
    }

    public final String a(ja1 ja1Var, ArrayList arrayList) {
        JSONObject jSONObject;
        String optString;
        String optString2;
        String optString3;
        String optString4;
        ic1 ic1Var = new ic1();
        ic1Var.b("index", (String) ja1Var.P);
        ic1Var.b("environment", (String) ja1Var.R);
        ic1Var.b("version", (String) ja1Var.Q);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hc1 hc1Var = (hc1) it.next();
            synchronized (this) {
                jSONObject = new JSONObject(this.d);
                String str = (String) hc1Var.c.R;
                synchronized (jSONObject) {
                    jSONObject.put("environment", str);
                }
                String a2 = hc1Var.a();
                synchronized (jSONObject) {
                    jSONObject.put("level", a2);
                }
                String str2 = hc1Var.d;
                synchronized (jSONObject) {
                    jSONObject.put("message", str2);
                }
                String format = hc1.e.format(hc1Var.a);
                synchronized (jSONObject) {
                    jSONObject.put("clientTimestamp", format);
                }
                JSONObject b = ga1.h().p().b();
                b.getClass();
                JSONObject c = ga1.h().p().c();
                c.getClass();
                synchronized (b) {
                    optString = b.optString("name");
                }
                synchronized (jSONObject) {
                    jSONObject.put("mediation_network", optString);
                }
                synchronized (b) {
                    optString2 = b.optString("version");
                }
                synchronized (jSONObject) {
                    jSONObject.put("mediation_network_version", optString2);
                }
                synchronized (c) {
                    optString3 = c.optString("name");
                }
                synchronized (jSONObject) {
                    jSONObject.put("plugin", optString3);
                }
                synchronized (c) {
                    optString4 = c.optString("version");
                }
                synchronized (jSONObject) {
                    jSONObject.put("plugin_version", optString4);
                }
                nr nrVar = ga1.h().n().b;
                if (nrVar == null || nrVar.b("batteryInfo")) {
                    ga1.h().l().getClass();
                    double d = he1.d();
                    synchronized (jSONObject) {
                        jSONObject.put("batteryInfo", d);
                    }
                }
                if (nrVar != null) {
                    synchronized (jSONObject) {
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            if (!nrVar.b(keys.next())) {
                                keys.remove();
                            }
                        }
                    }
                }
            }
            synchronized (jSONArray) {
                jSONArray.put(jSONObject);
            }
        }
        synchronized (ic1Var.a) {
            ic1Var.a.put("logs", jSONArray);
        }
        return ic1Var.toString();
    }

    public final synchronized void b(TimeUnit timeUnit) {
        try {
            if (!this.b.isShutdown() && !this.b.isTerminated()) {
                this.b.scheduleAtFixedRate(new le1(this), 5L, 5L, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }

    public final synchronized void c(hc1 hc1Var) {
        try {
            if (!this.b.isShutdown() && !this.b.isTerminated()) {
                this.b.submit(new a(hc1Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
    }
}