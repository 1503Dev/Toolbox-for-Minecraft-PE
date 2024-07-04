package defpackage;

import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: z91  reason: default package */
public final class z91 extends z61 {
    public final nb f;
    public final e3 g;
    public g3 j;
    public boolean n;
    public boolean o;
    public final ArrayList h = new ArrayList();
    public boolean k = false;
    public boolean l = false;
    public final String m = UUID.randomUUID().toString();
    public ca1 i = new ca1(null);

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public z91(e3 e3Var, nb nbVar) {
        g3 da1Var;
        this.g = e3Var;
        this.f = nbVar;
        f3 f3Var = (f3) nbVar.h;
        if (f3Var != f3.HTML && f3Var != f3.JAVASCRIPT) {
            da1Var = new ha1((String) nbVar.e, Collections.unmodifiableMap((Map) nbVar.d));
        } else {
            da1Var = new da1((WebView) nbVar.b);
        }
        this.j = da1Var;
        da1Var.a();
        aa1.c.a.add(this);
        WebView f = this.j.f();
        JSONObject jSONObject = new JSONObject();
        sa1.c(jSONObject, "impressionOwner", e3Var.a);
        sa1.c(jSONObject, "mediaEventsOwner", e3Var.b);
        sa1.c(jSONObject, "creativeType", e3Var.d);
        sa1.c(jSONObject, "impressionType", e3Var.e);
        sa1.c(jSONObject, "isolateVerificationScripts", Boolean.valueOf(e3Var.c));
        gw.d(f, "init", jSONObject);
    }

    public final lb1 D1(View view) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            lb1 lb1Var = (lb1) it.next();
            if (lb1Var.a.get() == view) {
                return lb1Var;
            }
        }
        return null;
    }

    public final void E1(String str) {
        if (!this.l) {
            bx.b("Error type is null", 1);
            vj.b(str, "Message is null");
            gw.d(this.j.f(), "error", dp.a(1), str);
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public final void F1() {
        boolean z;
        if (this.l) {
            return;
        }
        this.i.clear();
        if (!this.l) {
            this.h.clear();
        }
        boolean z2 = true;
        this.l = true;
        gw.d(this.j.f(), "finishSession", new Object[0]);
        aa1 aa1Var = aa1.c;
        if (aa1Var.b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        aa1Var.a.remove(this);
        aa1Var.b.remove(this);
        if (z) {
            if (aa1Var.b.size() <= 0) {
                z2 = false;
            }
            if (!z2) {
                jc1 a = jc1.a();
                a.getClass();
                g11 g11Var = g11.h;
                g11Var.getClass();
                Handler handler = g11.j;
                if (handler != null) {
                    handler.removeCallbacks(g11.l);
                    g11.j = null;
                }
                g11Var.a.clear();
                g11.i.post(new f11(g11Var));
                ra1 ra1Var = ra1.S;
                ra1Var.P = false;
                ra1Var.Q = false;
                ra1Var.R = null;
                yb1 yb1Var = a.d;
                yb1Var.a.getContentResolver().unregisterContentObserver(yb1Var);
            }
        }
        this.j.e();
        this.j = null;
    }

    public final void G1(View view) {
        if (this.l) {
            return;
        }
        vj.a("AdView is null", view);
        if (this.i.get() == view) {
            return;
        }
        this.i = new ca1(view);
        g3 g3Var = this.j;
        g3Var.getClass();
        g3Var.e = System.nanoTime();
        g3Var.d = 1;
        Collection<z91> unmodifiableCollection = Collections.unmodifiableCollection(aa1.c.a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (z91 z91Var : unmodifiableCollection) {
                if (z91Var != this && z91Var.i.get() == view) {
                    z91Var.i.clear();
                }
            }
        }
    }

    public final void H1() {
        boolean z;
        if (this.k) {
            return;
        }
        this.k = true;
        aa1 aa1Var = aa1.c;
        if (aa1Var.b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        aa1Var.b.add(this);
        if (!z) {
            jc1 a = jc1.a();
            a.getClass();
            ra1 ra1Var = ra1.S;
            ra1Var.R = a;
            ra1Var.P = true;
            ra1Var.Q = false;
            ra1Var.b();
            g11.h.getClass();
            g11.a();
            yb1 yb1Var = a.d;
            yb1Var.e = yb1Var.a();
            yb1Var.b();
            yb1Var.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, yb1Var);
        }
        gw.d(this.j.f(), "setDeviceVolume", Float.valueOf(jc1.a().a));
        this.j.b(this, this.f);
    }

    @Override // defpackage.z61
    public final void m(View view, js jsVar) {
        if (this.l) {
            return;
        }
        if (view != null) {
            if (D1(view) == null) {
                this.h.add(new lb1(view, jsVar));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }
}