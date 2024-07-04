package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oo4  reason: default package */
public final class oo4 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Boolean bool;
        so4 so4Var = so4.g;
        so4Var.getClass();
        so4Var.b.clear();
        for (nn4 nn4Var : Collections.unmodifiableCollection(un4.c.b)) {
        }
        so4Var.f = System.nanoTime();
        mo4 mo4Var = so4Var.d;
        mo4Var.getClass();
        un4 un4Var = un4.c;
        if (un4Var != null) {
            for (nn4 nn4Var2 : Collections.unmodifiableCollection(un4Var.b)) {
                View view = (View) nn4Var2.c.get();
                if (nn4Var2.e && !nn4Var2.f) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    String str = nn4Var2.g;
                    if (view != null) {
                        String str2 = null;
                        if (!view.isAttachedToWindow()) {
                            str2 = "notAttached";
                        } else {
                            if (view.hasWindowFocus()) {
                                mo4Var.h.remove(view);
                                bool = Boolean.FALSE;
                            } else if (mo4Var.h.containsKey(view)) {
                                bool = (Boolean) mo4Var.h.get(view);
                            } else {
                                WeakHashMap weakHashMap = mo4Var.h;
                                Boolean bool2 = Boolean.FALSE;
                                weakHashMap.put(view, bool2);
                                bool = bool2;
                            }
                            if (bool.booleanValue()) {
                                str2 = "noWindowFocus";
                            } else {
                                HashSet hashSet = new HashSet();
                                View view2 = view;
                                while (true) {
                                    if (view2 != null) {
                                        String a = ko4.a(view2);
                                        if (a != null) {
                                            str2 = a;
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
                                        mo4Var.d.addAll(hashSet);
                                        break;
                                    }
                                }
                            }
                        }
                        if (str2 == null) {
                            mo4Var.e.add(str);
                            mo4Var.a.put(view, str);
                            Iterator it = nn4Var2.b.iterator();
                            while (it.hasNext()) {
                                wn4 wn4Var = (wn4) it.next();
                                View view3 = (View) wn4Var.a.get();
                                if (view3 != null) {
                                    lo4 lo4Var = (lo4) mo4Var.b.get(view3);
                                    if (lo4Var != null) {
                                        lo4Var.b.add(nn4Var2.g);
                                    } else {
                                        mo4Var.b.put(view3, new lo4(wn4Var, nn4Var2.g));
                                    }
                                }
                            }
                        } else if (str2 != "noWindowFocus") {
                            mo4Var.f.add(str);
                            mo4Var.c.put(str, view);
                            mo4Var.g.put(str, str2);
                        }
                    } else {
                        mo4Var.f.add(str);
                        mo4Var.g.put(str, "noAdView");
                    }
                }
            }
        }
        long nanoTime = System.nanoTime();
        e83 e83Var = (e83) so4Var.c.Q;
        if (so4Var.d.f.size() > 0) {
            Iterator it2 = so4Var.d.f.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                JSONObject a2 = jo4.a(0, 0, 0, 0);
                View view4 = (View) so4Var.d.c.get(str3);
                fo4 fo4Var = (fo4) so4Var.c.P;
                String str4 = (String) so4Var.d.g.get(str3);
                if (str4 != null) {
                    JSONObject g = fo4Var.g(view4);
                    try {
                        g.put("adSessionId", str3);
                    } catch (JSONException e) {
                        ar.o("Error with setting ad session id", e);
                    }
                    try {
                        g.put("notVisibleReason", str4);
                    } catch (JSONException e2) {
                        ar.o("Error with setting not visible reason", e2);
                    }
                    try {
                        JSONArray optJSONArray = a2.optJSONArray("childViews");
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                            a2.put("childViews", optJSONArray);
                        }
                        optJSONArray.put(g);
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                    }
                }
                jo4.c(a2);
                HashSet hashSet2 = new HashSet();
                hashSet2.add(str3);
                no4 no4Var = so4Var.e;
                ((h43) no4Var.Q).a(new yo4(no4Var, hashSet2, a2, nanoTime));
            }
        }
        if (so4Var.d.e.size() > 0) {
            JSONObject a3 = jo4.a(0, 0, 0, 0);
            e83Var.a(null, a3, so4Var, true, false);
            jo4.c(a3);
            no4 no4Var2 = so4Var.e;
            ((h43) no4Var2.Q).a(new zo4(no4Var2, so4Var.d.e, a3, nanoTime));
        } else {
            no4 no4Var3 = so4Var.e;
            ((h43) no4Var3.Q).a(new xo4(no4Var3));
        }
        mo4 mo4Var2 = so4Var.d;
        mo4Var2.a.clear();
        mo4Var2.b.clear();
        mo4Var2.c.clear();
        mo4Var2.d.clear();
        mo4Var2.e.clear();
        mo4Var2.f.clear();
        mo4Var2.g.clear();
        mo4Var2.i = false;
        long nanoTime2 = System.nanoTime() - so4Var.f;
        if (so4Var.a.size() > 0) {
            Iterator it3 = so4Var.a.iterator();
            while (it3.hasNext()) {
                ro4 ro4Var = (ro4) it3.next();
                TimeUnit.NANOSECONDS.toMillis(nanoTime2);
                ro4Var.c();
                if (ro4Var instanceof qo4) {
                    ((qo4) ro4Var).a();
                }
            }
        }
    }
}