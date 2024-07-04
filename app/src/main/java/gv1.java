package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: gv1  reason: default package */
public abstract class gv1 implements Comparable {
    public final qv1 P;
    public final int Q;
    public final String R;
    public final int S;
    public final Object T;
    public final kv1 U;
    public Integer V;
    public jv1 W;
    public boolean X;
    public nu1 Y;
    public sv1 Z;
    public final ru1 a0;

    public gv1(int i, String str, kv1 kv1Var) {
        Uri parse;
        String host;
        this.P = qv1.c ? new qv1() : null;
        this.T = new Object();
        int i2 = 0;
        this.X = false;
        this.Y = null;
        this.Q = i;
        this.R = str;
        this.U = kv1Var;
        this.a0 = new ru1();
        if (!TextUtils.isEmpty(str) && (parse = Uri.parse(str)) != null && (host = parse.getHost()) != null) {
            i2 = host.hashCode();
        }
        this.S = i2;
    }

    public abstract lv1 b(yu1 yu1Var);

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.V.intValue() - ((gv1) obj).V.intValue();
    }

    public final String e() {
        String str = this.R;
        if (this.Q != 0) {
            return ij.c(Integer.toString(1), "-", str);
        }
        return str;
    }

    public Map f() {
        return Collections.emptyMap();
    }

    public final void g(String str) {
        if (qv1.c) {
            this.P.a(str, Thread.currentThread().getId());
        }
    }

    public abstract void h(Object obj);

    public final void i(String str) {
        jv1 jv1Var = this.W;
        if (jv1Var != null) {
            synchronized (jv1Var.b) {
                jv1Var.b.remove(this);
            }
            synchronized (jv1Var.i) {
                Iterator it = jv1Var.i.iterator();
                while (it.hasNext()) {
                    ((iv1) it.next()).a();
                }
            }
            jv1Var.b();
        }
        if (qv1.c) {
            long id = Thread.currentThread().getId();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                new Handler(Looper.getMainLooper()).post(new fv1(this, str, id));
                return;
            }
            this.P.a(str, id);
            this.P.b(toString());
        }
    }

    public final void j(lv1 lv1Var) {
        sv1 sv1Var;
        boolean z;
        List<gv1> list;
        synchronized (this.T) {
            sv1Var = this.Z;
        }
        if (sv1Var != null) {
            nu1 nu1Var = lv1Var.b;
            if (nu1Var != null) {
                if (nu1Var.e < System.currentTimeMillis()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    String e = e();
                    synchronized (sv1Var) {
                        list = (List) ((Map) sv1Var.P).remove(e);
                    }
                    if (list != null) {
                        if (rv1.a) {
                            rv1.c("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), e);
                        }
                        for (gv1 gv1Var : list) {
                            ((d60) sv1Var.S).c(gv1Var, lv1Var, null);
                        }
                        return;
                    }
                    return;
                }
            }
            sv1Var.a(this);
        }
    }

    public final void k(int i) {
        jv1 jv1Var = this.W;
        if (jv1Var != null) {
            jv1Var.b();
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.T) {
            z = this.X;
        }
        return z;
    }

    public byte[] m() {
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(Integer.toHexString(this.S));
        synchronized (this.T) {
        }
        String str = this.R;
        Integer num = this.V;
        return "[ ] " + str + " " + "0x".concat(valueOf) + " NORMAL " + num;
    }
}