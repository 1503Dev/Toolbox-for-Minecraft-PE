package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import defpackage.ba1;
import defpackage.ea1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g11  reason: default package */
public final class g11 implements ba1.a {
    public static g11 h = new g11();
    public static Handler i = new Handler(Looper.getMainLooper());
    public static Handler j = null;
    public static final a k = new a();
    public static final b l = new b();
    public int b;
    public long g;
    public ArrayList a = new ArrayList();
    public final ArrayList c = new ArrayList();
    public ea1 e = new ea1();
    public av2 d = new av2(4);
    public ta1 f = new ta1(new nb1());

    /* renamed from: g11$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            Boolean bool;
            String str;
            g11 g11Var = g11.h;
            g11Var.b = 0;
            g11Var.c.clear();
            for (z91 z91Var : Collections.unmodifiableCollection(aa1.c.b)) {
                z91Var.getClass();
            }
            g11Var.g = System.nanoTime();
            ea1 ea1Var = g11Var.e;
            ea1Var.getClass();
            aa1 aa1Var = aa1.c;
            if (aa1Var != null) {
                for (z91 z91Var2 : Collections.unmodifiableCollection(aa1Var.b)) {
                    View view = z91Var2.i.get();
                    if (z91Var2.k && !z91Var2.l) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        String str2 = z91Var2.m;
                        if (view != null) {
                            if (!view.isAttachedToWindow()) {
                                str = "notAttached";
                            } else {
                                if (view.hasWindowFocus()) {
                                    ea1Var.h.remove(view);
                                    bool = Boolean.FALSE;
                                } else if (ea1Var.h.containsKey(view)) {
                                    bool = (Boolean) ea1Var.h.get(view);
                                } else {
                                    WeakHashMap weakHashMap = ea1Var.h;
                                    Boolean bool2 = Boolean.FALSE;
                                    weakHashMap.put(view, bool2);
                                    bool = bool2;
                                }
                                if (bool.booleanValue()) {
                                    str = "noWindowFocus";
                                } else {
                                    HashSet hashSet = new HashSet();
                                    View view2 = view;
                                    while (true) {
                                        if (view2 != null) {
                                            String a = kc1.a(view2);
                                            if (a != null) {
                                                str = a;
                                                break;
                                            }
                                            hashSet.add(view2);
                                            ViewParent parent = view2.getParent();
                                            if (parent instanceof View) {
                                                view2 = (View) parent;
                                            } else {
                                                view2 = null;
                                            }
                                        } else {
                                            ea1Var.d.addAll(hashSet);
                                            str = null;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (str == null) {
                                ea1Var.e.add(str2);
                                ea1Var.a.put(view, str2);
                                Iterator it = z91Var2.h.iterator();
                                while (it.hasNext()) {
                                    lb1 lb1Var = (lb1) it.next();
                                    View view3 = lb1Var.a.get();
                                    if (view3 != null) {
                                        ea1.a aVar = ea1Var.b.get(view3);
                                        if (aVar != null) {
                                            aVar.b.add(z91Var2.m);
                                        } else {
                                            ea1Var.b.put(view3, new ea1.a(lb1Var, z91Var2.m));
                                        }
                                    }
                                }
                            } else if (str != "noWindowFocus") {
                                ea1Var.f.add(str2);
                                ea1Var.c.put(str2, view);
                                ea1Var.g.put(str2, str);
                            }
                        } else {
                            ea1Var.f.add(str2);
                            ea1Var.g.put(str2, "noAdView");
                        }
                    }
                }
            }
            long nanoTime = System.nanoTime();
            mb1 mb1Var = (mb1) g11Var.d.R;
            if (g11Var.e.f.size() > 0) {
                Iterator<String> it2 = g11Var.e.f.iterator();
                while (it2.hasNext()) {
                    String next = it2.next();
                    mb1Var.getClass();
                    JSONObject a2 = sa1.a(0, 0, 0, 0);
                    View view4 = g11Var.e.c.get(next);
                    ac1 ac1Var = (ac1) g11Var.d.Q;
                    String str3 = g11Var.e.g.get(next);
                    if (str3 != null) {
                        JSONObject b = ac1Var.b(view4);
                        try {
                            b.put("adSessionId", next);
                        } catch (JSONException e) {
                            s45.b("Error with setting ad session id", e);
                        }
                        try {
                            b.put("notVisibleReason", str3);
                        } catch (JSONException e2) {
                            s45.b("Error with setting not visible reason", e2);
                        }
                        try {
                            JSONArray optJSONArray = a2.optJSONArray("childViews");
                            if (optJSONArray == null) {
                                optJSONArray = new JSONArray();
                                a2.put("childViews", optJSONArray);
                            }
                            optJSONArray.put(b);
                        } catch (JSONException e3) {
                            e3.printStackTrace();
                        }
                    }
                    sa1.b(a2);
                    HashSet hashSet2 = new HashSet();
                    hashSet2.add(next);
                    ta1 ta1Var = g11Var.f;
                    nb1 nb1Var = ta1Var.b;
                    fc1 fc1Var = new fc1(ta1Var, hashSet2, a2, nanoTime);
                    nb1Var.getClass();
                    fc1Var.a = nb1Var;
                    nb1Var.b.add(fc1Var);
                    if (nb1Var.c == null) {
                        nb1Var.a();
                    }
                }
            }
            if (g11Var.e.e.size() > 0) {
                mb1Var.getClass();
                JSONObject a3 = sa1.a(0, 0, 0, 0);
                mb1Var.a(null, a3, g11Var, true, false);
                sa1.b(a3);
                ta1 ta1Var2 = g11Var.f;
                HashSet<String> hashSet3 = g11Var.e.e;
                nb1 nb1Var2 = ta1Var2.b;
                lc1 lc1Var = new lc1(ta1Var2, hashSet3, a3, nanoTime);
                nb1Var2.getClass();
                lc1Var.a = nb1Var2;
                nb1Var2.b.add(lc1Var);
                if (nb1Var2.c == null) {
                    nb1Var2.a();
                }
            } else {
                ta1 ta1Var3 = g11Var.f;
                nb1 nb1Var3 = ta1Var3.b;
                bc1 bc1Var = new bc1(ta1Var3);
                nb1Var3.getClass();
                bc1Var.a = nb1Var3;
                nb1Var3.b.add(bc1Var);
                if (nb1Var3.c == null) {
                    nb1Var3.a();
                }
            }
            ea1 ea1Var2 = g11Var.e;
            ea1Var2.a.clear();
            ea1Var2.b.clear();
            ea1Var2.c.clear();
            ea1Var2.d.clear();
            ea1Var2.e.clear();
            ea1Var2.f.clear();
            ea1Var2.g.clear();
            ea1Var2.i = false;
            long nanoTime2 = System.nanoTime() - g11Var.g;
            if (g11Var.a.size() > 0) {
                Iterator it3 = g11Var.a.iterator();
                while (it3.hasNext()) {
                    d dVar = (d) it3.next();
                    TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                    dVar.b();
                    if (dVar instanceof c) {
                        ((c) dVar).a();
                    }
                }
            }
        }
    }

    /* renamed from: g11$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            Handler handler = g11.j;
            if (handler != null) {
                handler.post(g11.k);
                g11.j.postDelayed(g11.l, 200L);
            }
        }
    }

    /* renamed from: g11$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface c extends d {
        void a();
    }

    /* renamed from: g11$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface d {
        void b();
    }

    public static void a() {
        if (j == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            j = handler;
            handler.post(k);
            j.postDelayed(l, 200L);
        }
    }

    public final void b(View view, ba1 ba1Var, JSONObject jSONObject, boolean z) {
        boolean z2;
        char c2;
        Object obj;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        if (kc1.a(view) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        ea1 ea1Var = this.e;
        if (ea1Var.d.contains(view)) {
            c2 = 1;
        } else if (ea1Var.i) {
            c2 = 2;
        } else {
            c2 = 3;
        }
        if (c2 == 3) {
            return;
        }
        JSONObject b2 = ba1Var.b(view);
        WindowManager windowManager = sa1.a;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(b2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        ea1 ea1Var2 = this.e;
        if (ea1Var2.a.size() == 0) {
            obj = null;
        } else {
            Object obj2 = (String) ea1Var2.a.get(view);
            if (obj2 != null) {
                ea1Var2.a.remove(view);
            }
            obj = obj2;
        }
        if (obj != null) {
            try {
                b2.put("adSessionId", obj);
            } catch (JSONException e2) {
                s45.b("Error with setting ad session id", e2);
            }
            ea1 ea1Var3 = this.e;
            if (ea1Var3.h.containsKey(view)) {
                ea1Var3.h.put(view, Boolean.TRUE);
                z3 = false;
            } else {
                z3 = true;
            }
            try {
                b2.put("hasWindowFocus", Boolean.valueOf(z3));
            } catch (JSONException e3) {
                s45.b("Error with setting not visible reason", e3);
            }
            this.e.i = true;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            ea1 ea1Var4 = this.e;
            ea1.a aVar = ea1Var4.b.get(view);
            if (aVar != null) {
                ea1Var4.b.remove(view);
            }
            if (aVar != null) {
                WindowManager windowManager2 = sa1.a;
                lb1 lb1Var = aVar.a;
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = aVar.b.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                try {
                    b2.put("isFriendlyObstructionFor", jSONArray);
                    b2.put("friendlyObstructionClass", lb1Var.b);
                    b2.put("friendlyObstructionPurpose", lb1Var.c);
                    b2.put("friendlyObstructionReason", lb1Var.d);
                } catch (JSONException e4) {
                    s45.b("Error with setting friendly obstruction", e4);
                }
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z && !z5) {
                z6 = false;
            } else {
                z6 = true;
            }
            if (c2 == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            ba1Var.a(view, b2, this, z7, z6);
        }
        this.b++;
    }
}