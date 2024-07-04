package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import defpackage.u01;
import defpackage.y01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

@SuppressLint({"RestrictedApi"})
/* renamed from: cs  reason: default package */
public class cs extends as {

    /* renamed from: cs$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements u01.d {
        public final /* synthetic */ View a;
        public final /* synthetic */ ArrayList b;

        public a(View view, ArrayList arrayList) {
            this.a = view;
            this.b = arrayList;
        }

        @Override // defpackage.u01.d
        public final void a() {
        }

        @Override // defpackage.u01.d
        public final void b() {
        }

        @Override // defpackage.u01.d
        public final void c() {
        }

        @Override // defpackage.u01.d
        public final void d(u01 u01Var) {
            u01Var.x(this);
            this.a.setVisibility(8);
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.b.get(i)).setVisibility(0);
            }
        }

        @Override // defpackage.u01.d
        public final void e() {
        }
    }

    /* renamed from: cs$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends x01 {
        public final /* synthetic */ Object a;
        public final /* synthetic */ ArrayList b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ ArrayList d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ ArrayList f;

        public b(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.a = obj;
            this.b = arrayList;
            this.c = obj2;
            this.d = arrayList2;
            this.e = obj3;
            this.f = arrayList3;
        }

        @Override // defpackage.x01, defpackage.u01.d
        public final void a() {
            Object obj = this.a;
            if (obj != null) {
                cs.this.m(obj, this.b, null);
            }
            Object obj2 = this.c;
            if (obj2 != null) {
                cs.this.m(obj2, this.d, null);
            }
            Object obj3 = this.e;
            if (obj3 != null) {
                cs.this.m(obj3, this.f, null);
            }
        }

        @Override // defpackage.u01.d
        public final void d(u01 u01Var) {
            u01Var.x(this);
        }
    }

    /* renamed from: cs$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends u01.c {
    }

    @Override // defpackage.as
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((u01) obj).b(view);
        }
    }

    @Override // defpackage.as
    public final void b(Object obj, ArrayList<View> arrayList) {
        boolean z;
        u01 u01Var;
        u01 u01Var2 = (u01) obj;
        if (u01Var2 == null) {
            return;
        }
        int i = 0;
        if (u01Var2 instanceof z01) {
            z01 z01Var = (z01) u01Var2;
            int size = z01Var.m0.size();
            while (i < size) {
                if (i >= 0 && i < z01Var.m0.size()) {
                    u01Var = z01Var.m0.get(i);
                } else {
                    u01Var = null;
                }
                b(u01Var, arrayList);
                i++;
            }
            return;
        }
        if (as.j(u01Var2.T) && as.j(null) && as.j(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z && as.j(u01Var2.U)) {
            int size2 = arrayList.size();
            while (i < size2) {
                u01Var2.b(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // defpackage.as
    public final void c(ViewGroup viewGroup, Object obj) {
        u01 u01Var = (u01) obj;
        if (!y01.b.contains(viewGroup)) {
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (viewGroup.isLaidOut()) {
                y01.b.add(viewGroup);
                u01 clone = u01Var.clone();
                ArrayList<u01> orDefault = y01.a().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator<u01> it = orDefault.iterator();
                    while (it.hasNext()) {
                        it.next().w(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.i(viewGroup, true);
                }
                int i = di0.transition_current_scene;
                if (((ln0) viewGroup.getTag(i)) == null) {
                    viewGroup.setTag(i, null);
                    if (clone != null) {
                        y01.a aVar = new y01.a(viewGroup, clone);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    @Override // defpackage.as
    public final boolean e(Object obj) {
        return obj instanceof u01;
    }

    @Override // defpackage.as
    public final Object g(Object obj) {
        if (obj != null) {
            return ((u01) obj).clone();
        }
        return null;
    }

    @Override // defpackage.as
    public final Object k(Object obj, Object obj2, Object obj3) {
        z01 z01Var = new z01();
        if (obj != null) {
            z01Var.K((u01) obj);
        }
        if (obj2 != null) {
            z01Var.K((u01) obj2);
        }
        if (obj3 != null) {
            z01Var.K((u01) obj3);
        }
        return z01Var;
    }

    @Override // defpackage.as
    public final void l(View view, Object obj) {
        if (obj != null) {
            ((u01) obj).z(view);
        }
    }

    @Override // defpackage.as
    public final void m(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        boolean z;
        int size;
        u01 u01Var;
        u01 u01Var2 = (u01) obj;
        int i = 0;
        if (u01Var2 instanceof z01) {
            z01 z01Var = (z01) u01Var2;
            int size2 = z01Var.m0.size();
            while (i < size2) {
                if (i >= 0 && i < z01Var.m0.size()) {
                    u01Var = z01Var.m0.get(i);
                } else {
                    u01Var = null;
                }
                m(u01Var, arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (as.j(u01Var2.T) && as.j(null) && as.j(null)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            ArrayList<View> arrayList3 = u01Var2.U;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    u01Var2.b(arrayList2.get(i));
                    i++;
                }
                int size3 = arrayList.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        u01Var2.z(arrayList.get(size3));
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @Override // defpackage.as
    public final void n(Object obj, View view, ArrayList<View> arrayList) {
        ((u01) obj).a(new a(view, arrayList));
    }

    @Override // defpackage.as
    public final void o(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((u01) obj).a(new b(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // defpackage.as
    public final void p(View view, Object obj) {
        if (view != null) {
            as.i(view, new Rect());
            ((u01) obj).D(new bs());
        }
    }

    @Override // defpackage.as
    public final void q(Object obj, Rect rect) {
        if (obj != null) {
            ((u01) obj).D(new c());
        }
    }

    @Override // defpackage.as
    public final void r(Object obj, View view, ArrayList<View> arrayList) {
        z01 z01Var = (z01) obj;
        ArrayList<View> arrayList2 = z01Var.U;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            as.d(arrayList2, arrayList.get(i));
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(z01Var, arrayList);
    }

    @Override // defpackage.as
    public final void s(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        z01 z01Var = (z01) obj;
        if (z01Var != null) {
            z01Var.U.clear();
            z01Var.U.addAll(arrayList2);
            m(z01Var, arrayList, arrayList2);
        }
    }

    @Override // defpackage.as
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        z01 z01Var = new z01();
        z01Var.K((u01) obj);
        return z01Var;
    }
}