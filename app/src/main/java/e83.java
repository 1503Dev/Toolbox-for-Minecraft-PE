package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: e83  reason: default package */
public final class e83 implements bz1, pt2, wy4, kg4, eo4, v64 {
    public final /* synthetic */ int P;
    public final Object Q;

    public /* synthetic */ e83(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // defpackage.eo4
    public final void a(View view, JSONObject jSONObject, do4 do4Var, boolean z, boolean z2) {
        float f;
        float f2;
        ArrayList arrayList = new ArrayList();
        un4 un4Var = un4.c;
        if (un4Var != null) {
            Collection<nn4> unmodifiableCollection = Collections.unmodifiableCollection(un4Var.b);
            int size = unmodifiableCollection.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (nn4 nn4Var : unmodifiableCollection) {
                View view2 = (View) nn4Var.c.get();
                if (view2 != null && view2.isAttachedToWindow() && view2.isShown()) {
                    View view3 = view2;
                    while (true) {
                        if (view3 != null) {
                            if (view3.getAlpha() != 0.0f) {
                                ViewParent parent = view3.getParent();
                                if (parent instanceof View) {
                                    view3 = (View) parent;
                                } else {
                                    view3 = null;
                                }
                            }
                        } else {
                            View rootView = view2.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                if (Build.VERSION.SDK_INT >= 21) {
                                    f = em.b(rootView);
                                } else {
                                    f = 0.0f;
                                }
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    View view4 = (View) arrayList.get(i);
                                    if (Build.VERSION.SDK_INT >= 21) {
                                        f2 = em.b(view4);
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    if (f2 <= f) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            ((so4) do4Var).a((View) arrayList.get(i2), (eo4) this.Q, jSONObject, z2);
        }
    }

    /*  JADX ERROR: Type inference failed with exception
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r6v28 ?? I:??[int, boolean])
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:114)
        */
    @Override // defpackage.bz1
    public final void b(byte[] r72, byte[] r73) {
        /*
            Method dump skipped, instructions count: 2622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e83.b(byte[], byte[]):void");
    }

    @Override // defpackage.pt2
    public final void c(m23 m23Var) {
        m23Var.q0((String) this.Q);
    }

    @Override // defpackage.kg4, defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        switch (this.P) {
            case 4:
                ((gr2) obj).E1((cr2) this.Q);
                return;
            default:
                int i = bm5.X;
                ((b53) obj).r(((jn5) this.Q).n);
                return;
        }
    }

    @Override // defpackage.wy4
    public final void f(Object obj) {
        ((AtomicInteger) ((fx2) this.Q).Q).set(1);
    }

    @Override // defpackage.eo4
    public final JSONObject g(View view) {
        throw null;
    }

    @Override // defpackage.wy4
    public final void h(Throwable th) {
        ((AtomicInteger) ((fx2) this.Q).Q).set(-1);
    }

    public /* synthetic */ e83(fz1 fz1Var) {
        this.P = 1;
        this.Q = fz1Var;
    }
}