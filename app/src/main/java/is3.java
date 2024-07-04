package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: is3  reason: default package */
public final class is3 {
    public final String e;
    public final fs3 f;
    public final ArrayList b = new ArrayList();
    public boolean c = false;
    public boolean d = false;
    public final nl5 a = jv5.A.g.b();

    public is3(String str, fs3 fs3Var) {
        this.e = str;
        this.f = fs3Var;
    }

    public final synchronized void a(String str, String str2) {
        l92 l92Var = x92.G1;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (!((Boolean) w82Var.c.a(x92.k7)).booleanValue()) {
                HashMap e = e();
                e.put("action", "adapter_init_finished");
                e.put("ancn", str);
                e.put("rqe", str2);
                this.b.add(e);
            }
        }
    }

    public final synchronized void b(String str) {
        l92 l92Var = x92.G1;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (!((Boolean) w82Var.c.a(x92.k7)).booleanValue()) {
                HashMap e = e();
                e.put("action", "adapter_init_started");
                e.put("ancn", str);
                this.b.add(e);
            }
        }
    }

    public final synchronized void c(String str) {
        l92 l92Var = x92.G1;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (!((Boolean) w82Var.c.a(x92.k7)).booleanValue()) {
                HashMap e = e();
                e.put("action", "adapter_init_finished");
                e.put("ancn", str);
                this.b.add(e);
            }
        }
    }

    public final synchronized void d() {
        l92 l92Var = x92.G1;
        w82 w82Var = w82.d;
        if (((Boolean) w82Var.c.a(l92Var)).booleanValue()) {
            if (!((Boolean) w82Var.c.a(x92.k7)).booleanValue()) {
                if (!this.c) {
                    HashMap e = e();
                    e.put("action", "init_started");
                    this.b.add(e);
                    this.c = true;
                }
            }
        }
    }

    public final HashMap e() {
        String str;
        fs3 fs3Var = this.f;
        fs3Var.getClass();
        HashMap hashMap = new HashMap(fs3Var.a);
        jv5.A.j.getClass();
        hashMap.put("tms", Long.toString(SystemClock.elapsedRealtime(), 10));
        if (this.a.C()) {
            str = "";
        } else {
            str = this.e;
        }
        hashMap.put("tid", str);
        return hashMap;
    }
}