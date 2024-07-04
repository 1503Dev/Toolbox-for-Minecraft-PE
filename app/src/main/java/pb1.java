package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.adcolony.sdk.AdColonyInterstitialActivity;
import defpackage.ud1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: pb1  reason: default package */
public final class pb1 {
    public ConcurrentHashMap<String, Runnable> a;
    public HashMap<String, ob1> b;
    public ConcurrentHashMap<String, i2> c;
    public ConcurrentHashMap<String, a2> d;
    public ConcurrentHashMap<String, a2> e;
    public Map<String, z1> f;
    public final Object g = new Object();

    /* renamed from: pb1$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements zc1 {
        public a() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            String q = ic1Var.q("id");
            if (ic1Var.l("type") == 0) {
                i2 remove = pb1Var.c.remove(q);
                if (ga1.i() && remove != null && remove.b()) {
                    eg1.n(new qb1());
                } else {
                    pb1.d(rc1Var.a, q);
                }
            }
        }
    }

    /* renamed from: pb1$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements zc1 {

        /* renamed from: pb1$b$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                z61 z61Var;
                i2 i2Var = pb1.this.c.get(this.P.b.q("id"));
                if (i2Var != null && (z61Var = i2Var.a) != null) {
                    z61Var.getClass();
                }
            }
        }

        public b() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            eg1.n(new a(rc1Var));
        }
    }

    /* renamed from: pb1$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements zc1 {

        /* renamed from: pb1$c$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                z61 z61Var;
                i2 i2Var = pb1.this.c.get(this.P.b.q("id"));
                if (i2Var != null && (z61Var = i2Var.a) != null) {
                    z61Var.getClass();
                }
            }
        }

        public c() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            eg1.n(new a(rc1Var));
        }
    }

    /* renamed from: pb1$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements zc1 {
        public d() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            boolean z;
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            String q = ic1Var.q("id");
            i2 i2Var = pb1Var.c.get(q);
            if (i2Var != null) {
                if (i2Var.k == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    z61 z61Var = i2Var.a;
                    if (z61Var == null) {
                        pb1.d(rc1Var.a, q);
                        return;
                    }
                    eg1.q(pb1Var.a.remove(q));
                    if (!ga1.i()) {
                        pb1.a(i2Var);
                        return;
                    }
                    i2Var.k = 2;
                    i2Var.g = ic1Var.q("ad_id");
                    ic1Var.q("creative_id");
                    i2Var.j = ic1Var.q("ad_request_id");
                    eg1.n(new sb1(rc1Var, i2Var, z61Var));
                }
            }
        }
    }

    /* renamed from: pb1$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements zc1 {
        public e() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            z61 z61Var;
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            String q = rc1Var.b.q("id");
            i2 remove = pb1Var.c.remove(q);
            if (remove == null) {
                z61Var = null;
            } else {
                z61Var = remove.a;
            }
            if (z61Var == null) {
                pb1.d(rc1Var.a, q);
                return;
            }
            eg1.q(pb1Var.a.remove(q));
            pb1.a(remove);
        }
    }

    /* renamed from: pb1$f */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements zc1 {
        public f() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            String sb;
            pb1.this.getClass();
            String q = rc1Var.b.q("id");
            ic1 ic1Var = new ic1();
            eb1.j(ic1Var, "id", q);
            Context context = ga1.P;
            boolean z = false;
            if (context == null) {
                eb1.m(ic1Var, "has_audio", false);
            } else {
                AudioManager c = eg1.c(context);
                if (c == null) {
                    sb = "isAudioEnabled() called with a null AudioManager";
                } else {
                    try {
                        if (c.getStreamVolume(3) > 0) {
                            z = true;
                        }
                    } catch (Exception e) {
                        StringBuilder b = e5.b("Exception occurred when accessing AudioManager.getStreamVolume: ");
                        b.append(e.toString());
                        sb = b.toString();
                    }
                    double a = eg1.a(eg1.c(context));
                    eb1.m(ic1Var, "has_audio", z);
                    eb1.g(ic1Var, "volume", a);
                }
                t1.b(0, 0, sb, true);
                double a2 = eg1.a(eg1.c(context));
                eb1.m(ic1Var, "has_audio", z);
                eb1.g(ic1Var, "volume", a2);
            }
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: pb1$g */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class g implements zc1 {
        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            ic1 ic1Var = new ic1();
            eb1.m(ic1Var, "success", true);
            rc1Var.a(ic1Var).b();
        }
    }

    /* renamed from: pb1$h */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class h implements zc1 {

        /* renamed from: pb1$h$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rc1 rc1Var = this.P;
                rc1Var.a(rc1Var.b).b();
            }
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            eg1.n(new a(rc1Var));
        }
    }

    /* renamed from: pb1$i */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class i implements zc1 {
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
            r6 = r3.e;
            r7 = r6.length;
            r8 = 0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
            if (r8 >= r7) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
            if (r1.equals(r6[r8]) == false) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0062, code lost:
            r8 = r8 + 1;
         */
        @Override // defpackage.zc1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void a(rc1 rc1Var) {
            ic1 ic1Var;
            ic1 o;
            yd1 c = yd1.c();
            if (c.a != null && (ic1Var = rc1Var.b) != null && (o = ic1Var.o("payload")) != null) {
                String q = o.q("request_type");
                ud1 ud1Var = c.a;
                ud1Var.getClass();
                ud1.a aVar = null;
                if (!q.isEmpty()) {
                    Iterator it = ud1Var.b.iterator();
                    loop0: while (it.hasNext()) {
                        ud1.a aVar2 = (ud1.a) it.next();
                        String[] strArr = aVar2.d;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                break;
                            } else if (q.equals(strArr[i])) {
                                break loop0;
                            } else {
                                i++;
                            }
                        }
                        aVar = aVar2;
                    }
                }
                if (aVar != null) {
                    try {
                        ContentValues a = yd1.a(o, aVar);
                        if1.a().b(aVar.b, a);
                        if1.a().c(aVar, a);
                        c.d = false;
                    } catch (NullPointerException | NumberFormatException e) {
                        e.printStackTrace();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error parsing event:" + q + " ");
                        sb.append(o.toString());
                        sb.append("Schema version: " + c.a.a + " ");
                        sb.append(" e: ");
                        sb.append(e.toString());
                        t1.b(0, 1, sb.toString(), true);
                    }
                }
            }
        }
    }

    /* renamed from: pb1$j */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class j implements zc1 {

        /* renamed from: pb1$j$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                Rect g;
                pb1 pb1Var = pb1.this;
                rc1 rc1Var = this.P;
                pb1Var.getClass();
                Context context = ga1.P;
                if (context != null) {
                    ic1 ic1Var = rc1Var.b;
                    String q = ic1Var.q("ad_session_id");
                    ob1 ob1Var = new ob1(context.getApplicationContext(), q);
                    ob1Var.P = new HashMap<>();
                    ob1Var.Q = new HashMap<>();
                    ob1Var.R = new HashMap<>();
                    ob1Var.S = new HashMap<>();
                    ob1Var.T = new HashMap<>();
                    ob1Var.U = new HashMap<>();
                    ob1Var.V = new HashMap<>();
                    ob1Var.k0 = new ArrayList<>();
                    ob1Var.l0 = new ArrayList<>();
                    ic1 ic1Var2 = rc1Var.b;
                    if (ic1Var2.j("transparent")) {
                        ob1Var.setBackgroundColor(0);
                    }
                    ob1Var.b0 = ic1Var2.l("id");
                    ob1Var.W = ic1Var2.l("width");
                    ob1Var.a0 = ic1Var2.l("height");
                    ob1Var.c0 = ic1Var2.l("module_id");
                    ob1Var.f0 = ic1Var2.j("viewability_enabled");
                    if (ob1Var.b0 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ob1Var.m0 = z;
                    ad1 h = ga1.h();
                    if (ob1Var.W == 0 && ob1Var.a0 == 0) {
                        boolean z2 = ob1Var.o0;
                        h.l().getClass();
                        if (z2) {
                            g = he1.h();
                        } else {
                            g = he1.g();
                        }
                        ob1Var.W = g.width();
                        ob1Var.a0 = g.height();
                    } else {
                        ob1Var.setLayoutParams(new FrameLayout.LayoutParams(ob1Var.W, ob1Var.a0));
                    }
                    ArrayList<zc1> arrayList = ob1Var.k0;
                    va1 va1Var = new va1(ob1Var);
                    ga1.g("VideoView.create", va1Var);
                    arrayList.add(va1Var);
                    ArrayList<zc1> arrayList2 = ob1Var.k0;
                    wa1 wa1Var = new wa1(ob1Var);
                    ga1.g("VideoView.destroy", wa1Var);
                    arrayList2.add(wa1Var);
                    ArrayList<zc1> arrayList3 = ob1Var.k0;
                    xa1 xa1Var = new xa1(ob1Var);
                    ga1.g("WebView.create", xa1Var);
                    arrayList3.add(xa1Var);
                    ArrayList<zc1> arrayList4 = ob1Var.k0;
                    ya1 ya1Var = new ya1(ob1Var);
                    ga1.g("WebView.destroy", ya1Var);
                    arrayList4.add(ya1Var);
                    ArrayList<zc1> arrayList5 = ob1Var.k0;
                    za1 za1Var = new za1(ob1Var);
                    ga1.g("TextView.create", za1Var);
                    arrayList5.add(za1Var);
                    ArrayList<zc1> arrayList6 = ob1Var.k0;
                    ab1 ab1Var = new ab1(ob1Var);
                    ga1.g("TextView.destroy", ab1Var);
                    arrayList6.add(ab1Var);
                    ArrayList<zc1> arrayList7 = ob1Var.k0;
                    bb1 bb1Var = new bb1(ob1Var);
                    ga1.g("ImageView.create", bb1Var);
                    arrayList7.add(bb1Var);
                    ArrayList<zc1> arrayList8 = ob1Var.k0;
                    cb1 cb1Var = new cb1(ob1Var);
                    ga1.g("ImageView.destroy", cb1Var);
                    arrayList8.add(cb1Var);
                    ob1Var.l0.add("VideoView.create");
                    ob1Var.l0.add("VideoView.destroy");
                    ob1Var.l0.add("WebView.create");
                    ob1Var.l0.add("WebView.destroy");
                    ob1Var.l0.add("TextView.create");
                    ob1Var.l0.add("TextView.destroy");
                    ob1Var.l0.add("ImageView.create");
                    ob1Var.l0.add("ImageView.destroy");
                    VideoView videoView = new VideoView(ob1Var.q0);
                    ob1Var.r0 = videoView;
                    videoView.setVisibility(8);
                    ob1Var.addView(ob1Var.r0);
                    ob1Var.setClipToPadding(false);
                    if (ob1Var.f0) {
                        eg1.e(200L, new db1(ob1Var, rc1Var.b.j("advanced_viewability")));
                    }
                    pb1Var.b.put(q, ob1Var);
                    if (ic1Var.l("width") == 0) {
                        i2 i2Var = pb1Var.c.get(q);
                        if (i2Var == null) {
                            pb1.d(rc1Var.a, q);
                            return;
                        }
                        i2Var.c = ob1Var;
                    } else {
                        ob1Var.m0 = false;
                    }
                    ic1 ic1Var3 = new ic1();
                    eb1.m(ic1Var3, "success", true);
                    rc1Var.a(ic1Var3).b();
                }
            }
        }

        public j() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            eg1.n(new a(rc1Var));
        }
    }

    /* renamed from: pb1$k */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class k implements Runnable {
        public final /* synthetic */ ob1 P;

        public k(ob1 ob1Var) {
            this.P = ob1Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (int i = 0; i < this.P.k0.size(); i++) {
                String str = this.P.l0.get(i);
                zc1 zc1Var = this.P.k0.get(i);
                tc1 o = ga1.h().o();
                synchronized (o.c) {
                    ArrayList<zc1> arrayList = o.c.get(str);
                    if (arrayList != null) {
                        arrayList.remove(zc1Var);
                    }
                }
            }
            this.P.l0.clear();
            this.P.k0.clear();
            this.P.removeAllViews();
            ob1 ob1Var = this.P;
            ob1Var.r0 = null;
            ob1Var.q0 = null;
            for (ka1 ka1Var : ob1Var.R.values()) {
                if (!(ka1Var instanceof gc1)) {
                    if (ka1Var instanceof fb1) {
                        ad1 h = ga1.h();
                        fb1 fb1Var = (fb1) ka1Var;
                        h.v.remove(Integer.valueOf(fb1Var.getAdc3ModuleId()));
                        tc1 tc1Var = h.a;
                        tc1Var.getClass();
                        tc1Var.c(fb1Var.getAdcModuleId());
                    } else if (!ka1Var.c0) {
                        ka1Var.c0 = true;
                        eg1.n(new pa1(ka1Var));
                    }
                }
            }
            for (v91 v91Var : this.P.P.values()) {
                v91Var.e();
                v91Var.l0 = true;
            }
            this.P.P.clear();
            this.P.Q.clear();
            this.P.R.clear();
            this.P.T.clear();
            this.P.V.clear();
            this.P.S.clear();
            this.P.U.clear();
            this.P.e0 = true;
        }
    }

    /* renamed from: pb1$l */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class l implements zc1 {

        /* renamed from: pb1$l$a */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class a implements Runnable {
            public final /* synthetic */ rc1 P;

            public a(rc1 rc1Var) {
                this.P = rc1Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                pb1 pb1Var = pb1.this;
                rc1 rc1Var = this.P;
                pb1Var.getClass();
                String q = rc1Var.b.q("ad_session_id");
                ob1 ob1Var = pb1Var.b.get(q);
                if (ob1Var == null) {
                    pb1.d(rc1Var.a, q);
                } else {
                    pb1Var.c(ob1Var);
                }
            }
        }

        public l() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            eg1.n(new a(rc1Var));
        }
    }

    /* renamed from: pb1$m */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class m implements zc1 {
        public m() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            String str = rc1Var.a;
            String q = ic1Var.q("ad_session_id");
            int l = ic1Var.l("view_id");
            ob1 ob1Var = pb1Var.b.get(q);
            if (ob1Var == null) {
                pb1.d(str, q);
                return;
            }
            View view = ob1Var.V.get(Integer.valueOf(l));
            if (view == null) {
                pb1.d(str, "" + l);
                return;
            }
            view.bringToFront();
        }
    }

    /* renamed from: pb1$n */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class n implements zc1 {
        public n() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            String str = rc1Var.a;
            String q = ic1Var.q("ad_session_id");
            int l = ic1Var.l("view_id");
            ob1 ob1Var = pb1Var.b.get(q);
            if (ob1Var == null) {
                pb1.d(str, q);
                return;
            }
            View view = ob1Var.V.get(Integer.valueOf(l));
            if (view == null) {
                pb1.d(str, "" + l);
                return;
            }
            ob1Var.removeView(view);
            ob1Var.addView(view, view.getLayoutParams());
        }
    }

    /* renamed from: pb1$o */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class o implements zc1 {
        public o() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            z61 z61Var;
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            int l = ic1Var.l("status");
            if (l != 5 && l != 1 && l != 0 && l != 6) {
                String q = ic1Var.q("id");
                i2 remove = pb1Var.c.remove(q);
                if (remove == null) {
                    z61Var = null;
                } else {
                    z61Var = remove.a;
                }
                if (z61Var == null) {
                    pb1.d(rc1Var.a, q);
                    return;
                }
                eg1.n(new vb1(z61Var, remove));
                remove.a();
                remove.c = null;
            }
        }
    }

    /* renamed from: pb1$p */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class p implements zc1 {
        public p() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            boolean z;
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            ic1 ic1Var = rc1Var.b;
            String q = ic1Var.q("id");
            i2 i2Var = pb1Var.c.get(q);
            z1 z1Var = pb1Var.f.get(q);
            int a = ic1Var.a(-1, "orientation");
            if (z1Var != null) {
                z = true;
            } else {
                z = false;
            }
            if (i2Var == null && !z) {
                pb1.d(rc1Var.a, q);
                return;
            }
            eb1.j(new ic1(), "id", q);
            if (i2Var != null) {
                i2Var.e = a;
                eg1.q(i2Var.n);
                Context context = ga1.P;
                if (context != null && ga1.j() && !i2Var.n.P) {
                    ga1.h().l = i2Var.c;
                    ga1.h().o = i2Var;
                    eg1.i(new Intent(context, AdColonyInterstitialActivity.class), false);
                }
            }
        }
    }

    /* renamed from: pb1$q */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class q implements zc1 {
        public q() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            String q = rc1Var.b.q("id");
            a2 remove = pb1Var.d.remove(q);
            if (remove == null) {
                pb1.d(rc1Var.a, q);
                return;
            }
            pb1Var.e.put(q, remove);
            eg1.q(pb1Var.a.remove(q));
            Context context = ga1.P;
            if (context == null) {
                eg1.n(new tb1(remove));
            } else {
                eg1.n(new rb1(pb1Var, context, rc1Var, remove, q));
            }
        }
    }

    /* renamed from: pb1$r */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class r implements zc1 {
        public r() {
        }

        @Override // defpackage.zc1
        public final void a(rc1 rc1Var) {
            pb1 pb1Var = pb1.this;
            pb1Var.getClass();
            String q = rc1Var.b.q("id");
            a2 remove = pb1Var.d.remove(q);
            if (remove == null) {
                pb1.d(rc1Var.a, q);
                return;
            }
            eg1.q(pb1Var.a.remove(q));
            eg1.n(new tb1(remove));
        }
    }

    public static void a(i2 i2Var) {
        i2Var.k = 3;
        z61 z61Var = i2Var.a;
        if (z61Var != null) {
            eg1.n(new l2(i2Var, z61Var));
        }
        if (!ga1.i()) {
            StringBuilder b2 = e5.b("RequestNotFilled called due to a missing context. ");
            StringBuilder b3 = e5.b("Interstitial with adSessionId(");
            b3.append(i2Var.f);
            b3.append(").");
            b2.append(b3.toString());
            t1.b(0, 0, b2.toString(), true);
        }
    }

    public static void b(Context context, ic1 ic1Var, String str) {
        rc1 rc1Var = new rc1("AdSession.finish_fullscreen_ad", 0);
        eb1.l(1, ic1Var, "status");
        rc1Var.b = ic1Var;
        t1.b(0, 0, str, false);
        ((ia1) context).b(rc1Var);
    }

    public static void d(String str, String str2) {
        t1.b(0, 0, ho.b("Message '", str, "' sent with invalid id: ", str2), false);
    }

    public final void c(ob1 ob1Var) {
        eg1.n(new k(ob1Var));
        if (this.f.get(ob1Var.d0) == null) {
            this.b.remove(ob1Var.d0);
            ob1Var.q0 = null;
        }
    }

    public final void e() {
        HashSet hashSet = new HashSet();
        synchronized (this.g) {
            for (String str : this.e.keySet()) {
                a2 remove = this.e.remove(str);
                if (remove != null) {
                    hashSet.add(remove);
                }
            }
            for (String str2 : this.d.keySet()) {
                a2 remove2 = this.d.remove(str2);
                if (remove2 != null) {
                    hashSet.add(remove2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            eg1.n(new tb1((a2) it.next()));
        }
        for (String str3 : this.c.keySet()) {
            i2 i2Var = this.c.get(str3);
            if (i2Var != null) {
                boolean z = true;
                if (i2Var.k != 1) {
                    z = false;
                }
                if (z) {
                    this.c.remove(str3);
                    a(i2Var);
                }
            }
        }
    }

    public final void f() {
        this.a = new ConcurrentHashMap<>();
        this.b = new HashMap<>();
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = new ConcurrentHashMap<>();
        this.f = Collections.synchronizedMap(new HashMap());
        ga1.f("AdContainer.create", new j());
        ga1.f("AdContainer.destroy", new l());
        ga1.f("AdContainer.move_view_to_index", new m());
        ga1.f("AdContainer.move_view_to_front", new n());
        ga1.f("AdSession.finish_fullscreen_ad", new o());
        ga1.f("AdSession.start_fullscreen_ad", new p());
        ga1.f("AdSession.ad_view_available", new q());
        ga1.f("AdSession.ad_view_unavailable", new r());
        ga1.f("AdSession.expiring", new a());
        ga1.f("AdSession.audio_stopped", new b());
        ga1.f("AdSession.audio_started", new c());
        ga1.f("AdSession.interstitial_available", new d());
        ga1.f("AdSession.interstitial_unavailable", new e());
        ga1.f("AdSession.has_audio", new f());
        ga1.f("WebView.prepare", new g());
        ga1.f("AdSession.expanded", new h());
        ga1.f("AdColony.odt_event", new i());
    }
}