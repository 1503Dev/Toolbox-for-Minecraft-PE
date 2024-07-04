package defpackage;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import defpackage.u01;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: y01  reason: default package */
public final class y01 {
    public static ThreadLocal<WeakReference<e7<ViewGroup, ArrayList<u01>>>> a;
    public static ArrayList<ViewGroup> b;

    /* renamed from: y01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public u01 P;
        public ViewGroup Q;

        /* renamed from: y01$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class C0048a extends x01 {
            public final /* synthetic */ e7 a;

            public C0048a(e7 e7Var) {
                this.a = e7Var;
            }

            @Override // defpackage.u01.d
            public final void d(u01 u01Var) {
                ((ArrayList) this.a.getOrDefault(a.this.Q, null)).remove(u01Var);
                u01Var.x(this);
            }
        }

        public a(ViewGroup viewGroup, u01 u01Var) {
            this.P = u01Var;
            this.Q = viewGroup;
        }

        /* JADX WARN: Removed duplicated region for block: B:106:0x022f  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x0209 A[EDGE_INSN: B:149:0x0209->B:96:0x0209 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x020e  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            ArrayList arrayList;
            u01 u01Var;
            wl wlVar;
            e7 e7Var;
            e7 e7Var2;
            int i;
            int[] iArr;
            int i2;
            int i3;
            int i4;
            u01.b orDefault;
            boolean z;
            boolean z2;
            wl wlVar2;
            c11 c11Var;
            View view;
            View view2;
            wl wlVar3;
            this.Q.getViewTreeObserver().removeOnPreDrawListener(this);
            this.Q.removeOnAttachStateChangeListener(this);
            int i5 = 1;
            if (!y01.b.remove(this.Q)) {
                return true;
            }
            e7<ViewGroup, ArrayList<u01>> a = y01.a();
            Long l = null;
            ArrayList<u01> orDefault2 = a.getOrDefault(this.Q, null);
            if (orDefault2 == null) {
                orDefault2 = new ArrayList<>();
                a.put(this.Q, orDefault2);
            } else if (orDefault2.size() > 0) {
                arrayList = new ArrayList(orDefault2);
                orDefault2.add(this.P);
                this.P.a(new C0048a(a));
                this.P.i(this.Q, false);
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((u01) it.next()).A(this.Q);
                    }
                }
                u01Var = this.P;
                ViewGroup viewGroup = this.Q;
                u01Var.getClass();
                u01Var.Z = new ArrayList<>();
                u01Var.a0 = new ArrayList<>();
                wlVar = u01Var.V;
                wl wlVar4 = u01Var.W;
                e7Var = new e7((e7) wlVar.a);
                e7Var2 = new e7((e7) wlVar4.a);
                i = 0;
                while (true) {
                    iArr = u01Var.Y;
                    if (i < iArr.length) {
                        break;
                    }
                    int i6 = iArr[i];
                    if (i6 != i5) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 4) {
                                    d30 d30Var = (d30) wlVar.c;
                                    d30 d30Var2 = (d30) wlVar4.c;
                                    if (d30Var.P) {
                                        d30Var.d();
                                    }
                                    int i7 = d30Var.S;
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        View view3 = (View) d30Var.h(i8);
                                        if (view3 != null && u01Var.u(view3)) {
                                            if (d30Var.P) {
                                                d30Var.d();
                                            }
                                            wlVar3 = wlVar;
                                            View view4 = (View) d30Var2.e(d30Var.Q[i8], l);
                                            if (view4 != null && u01Var.u(view4)) {
                                                c11 c11Var2 = (c11) e7Var.getOrDefault(view3, l);
                                                c11 c11Var3 = (c11) e7Var2.getOrDefault(view4, l);
                                                if (c11Var2 != null && c11Var3 != null) {
                                                    u01Var.Z.add(c11Var2);
                                                    u01Var.a0.add(c11Var3);
                                                    e7Var.remove(view3);
                                                    e7Var2.remove(view4);
                                                }
                                            }
                                        } else {
                                            wlVar3 = wlVar;
                                        }
                                        i8++;
                                        wlVar = wlVar3;
                                        l = null;
                                    }
                                }
                                wlVar2 = wlVar;
                            } else {
                                wlVar2 = wlVar;
                                SparseArray sparseArray = (SparseArray) wlVar2.b;
                                SparseArray sparseArray2 = (SparseArray) wlVar4.b;
                                int size = sparseArray.size();
                                for (int i9 = 0; i9 < size; i9++) {
                                    View view5 = (View) sparseArray.valueAt(i9);
                                    if (view5 != null && u01Var.u(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i9))) != null && u01Var.u(view2)) {
                                        c11 c11Var4 = (c11) e7Var.getOrDefault(view5, null);
                                        c11 c11Var5 = (c11) e7Var2.getOrDefault(view2, null);
                                        if (c11Var4 != null && c11Var5 != null) {
                                            u01Var.Z.add(c11Var4);
                                            u01Var.a0.add(c11Var5);
                                            e7Var.remove(view5);
                                            e7Var2.remove(view2);
                                        }
                                    }
                                }
                            }
                        } else {
                            wlVar2 = wlVar;
                            e7 e7Var3 = (e7) wlVar2.d;
                            e7 e7Var4 = (e7) wlVar4.d;
                            int i10 = e7Var3.R;
                            for (int i11 = 0; i11 < i10; i11++) {
                                View view6 = (View) e7Var3.j(i11);
                                if (view6 != null && u01Var.u(view6) && (view = (View) e7Var4.getOrDefault(e7Var3.h(i11), null)) != null && u01Var.u(view)) {
                                    c11 c11Var6 = (c11) e7Var.getOrDefault(view6, null);
                                    c11 c11Var7 = (c11) e7Var2.getOrDefault(view, null);
                                    if (c11Var6 != null && c11Var7 != null) {
                                        u01Var.Z.add(c11Var6);
                                        u01Var.a0.add(c11Var7);
                                        e7Var.remove(view6);
                                        e7Var2.remove(view);
                                    }
                                }
                            }
                        }
                    } else {
                        wlVar2 = wlVar;
                        int i12 = e7Var.R;
                        while (true) {
                            i12--;
                            if (i12 >= 0) {
                                View view7 = (View) e7Var.h(i12);
                                if (view7 != null && u01Var.u(view7) && (c11Var = (c11) e7Var2.remove(view7)) != null && u01Var.u(c11Var.b)) {
                                    u01Var.Z.add((c11) e7Var.i(i12));
                                    u01Var.a0.add(c11Var);
                                }
                            }
                        }
                    }
                    i++;
                    wlVar = wlVar2;
                    i5 = 1;
                    l = null;
                }
                for (i2 = 0; i2 < e7Var.R; i2++) {
                    c11 c11Var8 = (c11) e7Var.j(i2);
                    if (u01Var.u(c11Var8.b)) {
                        u01Var.Z.add(c11Var8);
                        u01Var.a0.add(null);
                    }
                }
                for (i3 = 0; i3 < e7Var2.R; i3++) {
                    c11 c11Var9 = (c11) e7Var2.j(i3);
                    if (u01Var.u(c11Var9.b)) {
                        u01Var.a0.add(c11Var9);
                        u01Var.Z.add(null);
                    }
                }
                e7<Animator, u01.b> p = u01.p();
                int i13 = p.R;
                f51 f51Var = a51.a;
                WindowId windowId = viewGroup.getWindowId();
                for (i4 = i13 - 1; i4 >= 0; i4--) {
                    Animator h = p.h(i4);
                    if (h != null && (orDefault = p.getOrDefault(h, null)) != null && orDefault.a != null) {
                        m61 m61Var = orDefault.d;
                        if ((m61Var instanceof l61) && ((l61) m61Var).a.equals(windowId)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            c11 c11Var10 = orDefault.c;
                            View view8 = orDefault.a;
                            c11 r = u01Var.r(view8, true);
                            c11 o = u01Var.o(view8, true);
                            if (r == null && o == null) {
                                o = (c11) ((e7) u01Var.W.a).getOrDefault(view8, null);
                            }
                            if ((r != null || o != null) && orDefault.e.s(c11Var10, o)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                if (!h.isRunning() && !h.isStarted()) {
                                    p.remove(h);
                                } else {
                                    h.cancel();
                                }
                            }
                        }
                    }
                }
                u01Var.m(viewGroup, u01Var.V, u01Var.W, u01Var.Z, u01Var.a0);
                u01Var.B();
                return true;
            }
            arrayList = null;
            orDefault2.add(this.P);
            this.P.a(new C0048a(a));
            this.P.i(this.Q, false);
            if (arrayList != null) {
            }
            u01Var = this.P;
            ViewGroup viewGroup2 = this.Q;
            u01Var.getClass();
            u01Var.Z = new ArrayList<>();
            u01Var.a0 = new ArrayList<>();
            wlVar = u01Var.V;
            wl wlVar42 = u01Var.W;
            e7Var = new e7((e7) wlVar.a);
            e7Var2 = new e7((e7) wlVar42.a);
            i = 0;
            while (true) {
                iArr = u01Var.Y;
                if (i < iArr.length) {
                }
                i++;
                wlVar = wlVar2;
                i5 = 1;
                l = null;
            }
            while (i2 < e7Var.R) {
            }
            while (i3 < e7Var2.R) {
            }
            e7<Animator, u01.b> p2 = u01.p();
            int i132 = p2.R;
            f51 f51Var2 = a51.a;
            WindowId windowId2 = viewGroup2.getWindowId();
            while (i4 >= 0) {
            }
            u01Var.m(viewGroup2, u01Var.V, u01Var.W, u01Var.Z, u01Var.a0);
            u01Var.B();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            this.Q.getViewTreeObserver().removeOnPreDrawListener(this);
            this.Q.removeOnAttachStateChangeListener(this);
            y01.b.remove(this.Q);
            ArrayList<u01> orDefault = y01.a().getOrDefault(this.Q, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<u01> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().A(this.Q);
                }
            }
            this.P.j(true);
        }
    }

    static {
        new x7();
        a = new ThreadLocal<>();
        b = new ArrayList<>();
    }

    public static e7<ViewGroup, ArrayList<u01>> a() {
        e7<ViewGroup, ArrayList<u01>> e7Var;
        WeakReference<e7<ViewGroup, ArrayList<u01>>> weakReference = a.get();
        if (weakReference == null || (e7Var = weakReference.get()) == null) {
            e7<ViewGroup, ArrayList<u01>> e7Var2 = new e7<>();
            a.set(new WeakReference<>(e7Var2));
            return e7Var2;
        }
        return e7Var;
    }
}