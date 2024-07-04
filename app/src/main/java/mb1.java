package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import defpackage.ba1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: mb1  reason: default package */
public final class mb1 implements ba1 {
    public final ba1 a;

    public mb1(ac1 ac1Var) {
        this.a = ac1Var;
    }

    @Override // defpackage.ba1
    public final void a(View view, JSONObject jSONObject, ba1.a aVar, boolean z, boolean z2) {
        View rootView;
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        aa1 aa1Var = aa1.c;
        if (aa1Var != null) {
            Collection<z91> unmodifiableCollection = Collections.unmodifiableCollection(aa1Var.b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (z91 z91Var : unmodifiableCollection) {
                View view2 = z91Var.i.get();
                if (view2 != null) {
                    boolean z3 = false;
                    if (view2.isAttachedToWindow() && view2.isShown()) {
                        View view3 = view2;
                        while (true) {
                            if (view3 != null) {
                                if (view3.getAlpha() == 0.0f) {
                                    break;
                                }
                                ViewParent parent = view3.getParent();
                                if (parent instanceof View) {
                                    view3 = (View) parent;
                                } else {
                                    view3 = null;
                                }
                            } else {
                                z3 = true;
                                break;
                            }
                        }
                    }
                    if (z3 && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        if (Build.VERSION.SDK_INT >= 21) {
                            f = rootView.getZ();
                        } else {
                            f = 0.0f;
                        }
                        int size = arrayList.size();
                        while (size > 0) {
                            int i = size - 1;
                            View view4 = (View) arrayList.get(i);
                            if (Build.VERSION.SDK_INT >= 21) {
                                f2 = view4.getZ();
                            } else {
                                f2 = 0.0f;
                            }
                            if (f2 <= f) {
                                break;
                            }
                            size = i;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((g11) aVar).b((View) it.next(), this.a, jSONObject, z2);
        }
    }

    @Override // defpackage.ba1
    public final JSONObject b(View view) {
        return sa1.a(0, 0, 0, 0);
    }
}