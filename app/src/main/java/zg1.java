package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import defpackage.jd;
import defpackage.k9;
import defpackage.kt;
import defpackage.l4;
import defpackage.l4.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: zg1  reason: default package */
public final class zg1<O extends l4.c> implements kt.a, kt.b {
    @NotOnlyInitialized
    public final l4.e Q;
    public final n4<O> R;
    public final kg1 S;
    public final int V;
    public final sh1 W;
    public boolean X;
    public final /* synthetic */ lt b0;
    public final LinkedList P = new LinkedList();
    public final HashSet T = new HashSet();
    public final HashMap U = new HashMap();
    public final ArrayList Y = new ArrayList();
    public gf Z = null;
    public int a0 = 0;

    public zg1(lt ltVar, gt<O> gtVar) {
        this.b0 = ltVar;
        Looper looper = ltVar.b0.getLooper();
        jd.a b = gtVar.b();
        jd jdVar = new jd(b.a, b.b, b.c, b.d);
        l4.a<?, O> aVar = gtVar.c.a;
        uf0.f(aVar);
        l4.e b2 = aVar.b(gtVar.a, looper, jdVar, gtVar.d, this, this);
        String str = gtVar.b;
        if (str != null && (b2 instanceof k9)) {
            ((k9) b2).s = str;
        }
        if (str != null && (b2 instanceof u90)) {
            ((u90) b2).getClass();
        }
        this.Q = b2;
        this.R = gtVar.e;
        this.S = new kg1();
        this.V = gtVar.f;
        if (b2.l()) {
            Context context = ltVar.T;
            aj1 aj1Var = ltVar.b0;
            jd.a b3 = gtVar.b();
            this.W = new sh1(context, aj1Var, new jd(b3.a, b3.b, b3.c, b3.d));
            return;
        }
        this.W = null;
    }

    @Override // defpackage.ff
    public final void A(int i) {
        if (Looper.myLooper() == this.b0.b0.getLooper()) {
            f(i);
        } else {
            this.b0.b0.post(new wg1(this, i));
        }
    }

    @Override // defpackage.zb0
    public final void Z(gf gfVar) {
        n(gfVar, null);
    }

    public final void a(gf gfVar) {
        Iterator it = this.T.iterator();
        if (it.hasNext()) {
            ri1 ri1Var = (ri1) it.next();
            if (wa0.a(gfVar, gf.T)) {
                this.Q.i();
            }
            ri1Var.getClass();
            throw null;
        }
        this.T.clear();
    }

    public final void b(Status status) {
        uf0.a(this.b0.b0);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z) {
        boolean z2;
        uf0.a(this.b0.b0);
        boolean z3 = true;
        if (status != null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (runtimeException != null) {
            z3 = false;
        }
        if (z2 != z3) {
            Iterator it = this.P.iterator();
            while (it.hasNext()) {
                li1 li1Var = (li1) it.next();
                if (!z || li1Var.a == 2) {
                    if (status != null) {
                        li1Var.a(status);
                    } else {
                        li1Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    @Override // defpackage.ff
    public final void c0() {
        if (Looper.myLooper() == this.b0.b0.getLooper()) {
            e();
        } else {
            this.b0.b0.post(new vg1(this));
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(this.P);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            li1 li1Var = (li1) arrayList.get(i);
            if (!this.Q.a()) {
                return;
            }
            if (i(li1Var)) {
                this.P.remove(li1Var);
            }
        }
    }

    public final void e() {
        uf0.a(this.b0.b0);
        this.Z = null;
        a(gf.T);
        h();
        Iterator it = this.U.values().iterator();
        if (!it.hasNext()) {
            d();
            g();
            return;
        }
        ((ph1) it.next()).getClass();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i) {
        Iterator it;
        String str;
        uf0.a(this.b0.b0);
        this.Z = null;
        this.X = true;
        kg1 kg1Var = this.S;
        String k = this.Q.k();
        kg1Var.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            str = " due to service disconnection.";
        } else {
            str = i == 3 ? " due to dead object exception." : " due to dead object exception.";
            if (k != null) {
                sb.append(" Last reason for disconnect: ");
                sb.append(k);
            }
            kg1Var.a(true, new Status(20, sb.toString()));
            aj1 aj1Var = this.b0.b0;
            Message obtain = Message.obtain(aj1Var, 9, this.R);
            this.b0.getClass();
            aj1Var.sendMessageDelayed(obtain, 5000L);
            aj1 aj1Var2 = this.b0.b0;
            Message obtain2 = Message.obtain(aj1Var2, 11, this.R);
            this.b0.getClass();
            aj1Var2.sendMessageDelayed(obtain2, 120000L);
            this.b0.V.a.clear();
            it = this.U.values().iterator();
            if (it.hasNext()) {
                return;
            }
            ((ph1) it.next()).getClass();
            throw null;
        }
        sb.append(str);
        if (k != null) {
        }
        kg1Var.a(true, new Status(20, sb.toString()));
        aj1 aj1Var3 = this.b0.b0;
        Message obtain3 = Message.obtain(aj1Var3, 9, this.R);
        this.b0.getClass();
        aj1Var3.sendMessageDelayed(obtain3, 5000L);
        aj1 aj1Var22 = this.b0.b0;
        Message obtain22 = Message.obtain(aj1Var22, 11, this.R);
        this.b0.getClass();
        aj1Var22.sendMessageDelayed(obtain22, 120000L);
        this.b0.V.a.clear();
        it = this.U.values().iterator();
        if (it.hasNext()) {
        }
    }

    public final void g() {
        this.b0.b0.removeMessages(12, this.R);
        aj1 aj1Var = this.b0.b0;
        aj1Var.sendMessageDelayed(aj1Var.obtainMessage(12, this.R), this.b0.P);
    }

    public final void h() {
        if (this.X) {
            this.b0.b0.removeMessages(11, this.R);
            this.b0.b0.removeMessages(9, this.R);
            this.X = false;
        }
    }

    public final boolean i(li1 li1Var) {
        wp wpVar;
        if (!(li1Var instanceof fh1)) {
            li1Var.d(this.S, this.Q.l());
            try {
                li1Var.c(this);
            } catch (DeadObjectException unused) {
                A(1);
                this.Q.d("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        fh1 fh1Var = (fh1) li1Var;
        wp[] g = fh1Var.g(this);
        if (g != null && g.length != 0) {
            wp[] h = this.Q.h();
            if (h == null) {
                h = new wp[0];
            }
            e7 e7Var = new e7(h.length);
            for (wp wpVar2 : h) {
                e7Var.put(wpVar2.P, Long.valueOf(wpVar2.c()));
            }
            int length = g.length;
            for (int i = 0; i < length; i++) {
                wpVar = g[i];
                Long l = (Long) e7Var.getOrDefault(wpVar.P, null);
                if (l == null || l.longValue() < wpVar.c()) {
                    break;
                }
            }
        }
        wpVar = null;
        if (wpVar == null) {
            li1Var.d(this.S, this.Q.l());
            try {
                li1Var.c(this);
            } catch (DeadObjectException unused2) {
                A(1);
                this.Q.d("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        String name = this.Q.getClass().getName();
        String str = wpVar.P;
        long c = wpVar.c();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(c);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (this.b0.c0 && fh1Var.f(this)) {
            ah1 ah1Var = new ah1(this.R, wpVar);
            int indexOf = this.Y.indexOf(ah1Var);
            if (indexOf >= 0) {
                ah1 ah1Var2 = (ah1) this.Y.get(indexOf);
                this.b0.b0.removeMessages(15, ah1Var2);
                aj1 aj1Var = this.b0.b0;
                Message obtain = Message.obtain(aj1Var, 15, ah1Var2);
                this.b0.getClass();
                aj1Var.sendMessageDelayed(obtain, 5000L);
            } else {
                this.Y.add(ah1Var);
                aj1 aj1Var2 = this.b0.b0;
                Message obtain2 = Message.obtain(aj1Var2, 15, ah1Var);
                this.b0.getClass();
                aj1Var2.sendMessageDelayed(obtain2, 5000L);
                aj1 aj1Var3 = this.b0.b0;
                Message obtain3 = Message.obtain(aj1Var3, 16, ah1Var);
                this.b0.getClass();
                aj1Var3.sendMessageDelayed(obtain3, 120000L);
                gf gfVar = new gf(2, null);
                if (!j(gfVar)) {
                    this.b0.b(gfVar, this.V);
                }
            }
            return false;
        }
        fh1Var.b(new t21(wpVar));
        return true;
    }

    public final boolean j(gf gfVar) {
        synchronized (lt.f0) {
            this.b0.getClass();
        }
        return false;
    }

    public final boolean k(boolean z) {
        boolean z2;
        uf0.a(this.b0.b0);
        if (!this.Q.a() || this.U.size() != 0) {
            return false;
        }
        kg1 kg1Var = this.S;
        if (kg1Var.a.isEmpty() && kg1Var.b.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (z) {
                g();
            }
            return false;
        }
        this.Q.d("Timing out service connection.");
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [zh1, l4$e] */
    public final void l() {
        gf gfVar;
        uf0.a(this.b0.b0);
        if (!this.Q.a() && !this.Q.g()) {
            try {
                lt ltVar = this.b0;
                int a = ltVar.V.a(ltVar.T, this.Q);
                if (a != 0) {
                    gf gfVar2 = new gf(a, null);
                    String name = this.Q.getClass().getName();
                    String gfVar3 = gfVar2.toString();
                    StringBuilder sb = new StringBuilder(name.length() + 35 + gfVar3.length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(gfVar3);
                    Log.w("GoogleApiManager", sb.toString());
                    n(gfVar2, null);
                    return;
                }
                lt ltVar2 = this.b0;
                l4.e eVar = this.Q;
                ch1 ch1Var = new ch1(ltVar2, eVar, this.R);
                if (eVar.l()) {
                    sh1 sh1Var = this.W;
                    uf0.f(sh1Var);
                    zh1 zh1Var = sh1Var.U;
                    if (zh1Var != null) {
                        ((k9) zh1Var).p();
                    }
                    sh1Var.T.h = Integer.valueOf(System.identityHashCode(sh1Var));
                    fg1 fg1Var = sh1Var.R;
                    Context context = sh1Var.P;
                    Looper looper = sh1Var.Q.getLooper();
                    jd jdVar = sh1Var.T;
                    sh1Var.U = fg1Var.b(context, looper, jdVar, jdVar.g, sh1Var, sh1Var);
                    sh1Var.V = ch1Var;
                    Set<Scope> set = sh1Var.S;
                    if (set != null && !set.isEmpty()) {
                        cs0 cs0Var = (cs0) sh1Var.U;
                        cs0Var.getClass();
                        cs0Var.j(new k9.d());
                    } else {
                        sh1Var.Q.post(new d06(1, sh1Var));
                    }
                }
                try {
                    this.Q.j(ch1Var);
                } catch (SecurityException e) {
                    e = e;
                    gfVar = new gf(10);
                    n(gfVar, e);
                }
            } catch (IllegalStateException e2) {
                e = e2;
                gfVar = new gf(10);
            }
        }
    }

    public final void m(li1 li1Var) {
        boolean z;
        uf0.a(this.b0.b0);
        if (this.Q.a()) {
            if (i(li1Var)) {
                g();
                return;
            } else {
                this.P.add(li1Var);
                return;
            }
        }
        this.P.add(li1Var);
        gf gfVar = this.Z;
        if (gfVar != null) {
            if (gfVar.Q != 0 && gfVar.R != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                n(gfVar, null);
                return;
            }
        }
        l();
    }

    public final void n(gf gfVar, RuntimeException runtimeException) {
        zh1 zh1Var;
        uf0.a(this.b0.b0);
        sh1 sh1Var = this.W;
        if (sh1Var != null && (zh1Var = sh1Var.U) != null) {
            ((k9) zh1Var).p();
        }
        uf0.a(this.b0.b0);
        this.Z = null;
        this.b0.V.a.clear();
        a(gfVar);
        if ((this.Q instanceof yi1) && gfVar.Q != 24) {
            lt ltVar = this.b0;
            ltVar.Q = true;
            aj1 aj1Var = ltVar.b0;
            aj1Var.sendMessageDelayed(aj1Var.obtainMessage(19), 300000L);
        }
        if (gfVar.Q == 4) {
            b(lt.e0);
        } else if (this.P.isEmpty()) {
            this.Z = gfVar;
        } else if (runtimeException != null) {
            uf0.a(this.b0.b0);
            c(null, runtimeException, false);
        } else if (this.b0.c0) {
            c(lt.c(this.R, gfVar), null, true);
            if (!this.P.isEmpty() && !j(gfVar) && !this.b0.b(gfVar, this.V)) {
                if (gfVar.Q == 18) {
                    this.X = true;
                }
                if (this.X) {
                    aj1 aj1Var2 = this.b0.b0;
                    Message obtain = Message.obtain(aj1Var2, 9, this.R);
                    this.b0.getClass();
                    aj1Var2.sendMessageDelayed(obtain, 5000L);
                    return;
                }
                b(lt.c(this.R, gfVar));
            }
        } else {
            b(lt.c(this.R, gfVar));
        }
    }

    public final void o() {
        uf0.a(this.b0.b0);
        Status status = lt.d0;
        b(status);
        kg1 kg1Var = this.S;
        kg1Var.getClass();
        kg1Var.a(false, status);
        for (j20 j20Var : (j20[]) this.U.keySet().toArray(new j20[0])) {
            m(new hi1(j20Var, new aw0()));
        }
        a(new gf(4));
        if (this.Q.a()) {
            this.Q.c(new yg1(this));
        }
    }
}