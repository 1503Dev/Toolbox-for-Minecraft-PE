package defpackage;

import android.os.Handler;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: nn4  reason: default package */
public final class nn4 extends jn4 {
    public static final Pattern h = Pattern.compile("^[a-zA-Z0-9 ]+$");
    public final ln4 a;
    public go4 d;
    public final ArrayList b = new ArrayList();
    public boolean e = false;
    public boolean f = false;
    public final String g = UUID.randomUUID().toString();
    public ap4 c = new ap4(null);

    public nn4(kn4 kn4Var, ln4 ln4Var) {
        go4 ho4Var;
        this.a = ln4Var;
        mn4 mn4Var = ln4Var.g;
        if (mn4Var != mn4.HTML && mn4Var != mn4.JAVASCRIPT) {
            ho4Var = new io4(Collections.unmodifiableMap(ln4Var.d));
        } else {
            ho4Var = new ho4(ln4Var.b);
        }
        this.d = ho4Var;
        this.d.e();
        un4.c.a.add(this);
        WebView a = this.d.a();
        JSONObject jSONObject = new JSONObject();
        jo4.b(jSONObject, "impressionOwner", kn4Var.a);
        jo4.b(jSONObject, "mediaEventsOwner", kn4Var.b);
        jo4.b(jSONObject, "creativeType", kn4Var.c);
        jo4.b(jSONObject, "impressionType", kn4Var.d);
        jo4.b(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        yn4.a(a, "init", jSONObject);
    }

    @Override // defpackage.jn4
    public final void a(FrameLayout frameLayout) {
        wn4 wn4Var;
        if (!this.f) {
            if (h.matcher("Ad overlay").matches()) {
                Iterator it = this.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        wn4Var = (wn4) it.next();
                        if (wn4Var.a.get() == frameLayout) {
                            break;
                        }
                    } else {
                        wn4Var = null;
                        break;
                    }
                }
                if (wn4Var == null) {
                    this.b.add(new wn4(frameLayout));
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
    }

    @Override // defpackage.jn4
    public final void b() {
        boolean z;
        if (this.f) {
            return;
        }
        this.c.clear();
        if (!this.f) {
            this.b.clear();
        }
        boolean z2 = true;
        this.f = true;
        yn4.a(this.d.a(), "finishSession", new Object[0]);
        un4 un4Var = un4.c;
        if (un4Var.b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        un4Var.a.remove(this);
        un4Var.b.remove(this);
        if (z) {
            if (un4Var.b.size() <= 0) {
                z2 = false;
            }
            if (!z2) {
                co4 a = co4.a();
                a.getClass();
                so4 so4Var = so4.g;
                so4Var.getClass();
                Handler handler = so4.i;
                if (handler != null) {
                    handler.removeCallbacks(so4.k);
                    so4.i = null;
                }
                so4Var.a.clear();
                so4.h.post(new lz1(3, so4Var));
                vn4 vn4Var = vn4.S;
                vn4Var.P = false;
                vn4Var.Q = false;
                vn4Var.R = null;
                tn4 tn4Var = a.b;
                tn4Var.a.getContentResolver().unregisterContentObserver(tn4Var);
            }
        }
        this.d.b();
        this.d = null;
    }

    @Override // defpackage.jn4
    public final void c(View view) {
        if (this.f || ((View) this.c.get()) == view) {
            return;
        }
        this.c = new ap4(view);
        go4 go4Var = this.d;
        go4Var.getClass();
        go4Var.b = System.nanoTime();
        go4Var.c = 1;
        Collection<nn4> unmodifiableCollection = Collections.unmodifiableCollection(un4.c.a);
        if (unmodifiableCollection != null && !unmodifiableCollection.isEmpty()) {
            for (nn4 nn4Var : unmodifiableCollection) {
                if (nn4Var != this && ((View) nn4Var.c.get()) == view) {
                    nn4Var.c.clear();
                }
            }
        }
    }

    @Override // defpackage.jn4
    public final void d() {
        boolean z;
        if (this.e) {
            return;
        }
        this.e = true;
        un4 un4Var = un4.c;
        if (un4Var.b.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        un4Var.b.add(this);
        if (!z) {
            co4 a = co4.a();
            a.getClass();
            vn4 vn4Var = vn4.S;
            vn4Var.R = a;
            vn4Var.P = true;
            vn4Var.Q = false;
            vn4Var.a();
            so4.g.getClass();
            so4.b();
            tn4 tn4Var = a.b;
            tn4Var.c = tn4Var.a();
            tn4Var.b();
            tn4Var.a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, tn4Var);
        }
        yn4.a(this.d.a(), "setDeviceVolume", Float.valueOf(co4.a().a));
        this.d.c(this, this.a);
    }
}