package defpackage;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: u01  reason: default package */
public abstract class u01 implements Cloneable {
    public static final int[] j0 = {2, 1, 3, 4};
    public static final a k0 = new a();
    public static ThreadLocal<e7<Animator, b>> l0 = new ThreadLocal<>();
    public ArrayList<c11> Z;
    public ArrayList<c11> a0;
    public c h0;
    public String P = getClass().getName();
    public long Q = -1;
    public long R = -1;
    public TimeInterpolator S = null;
    public ArrayList<Integer> T = new ArrayList<>();
    public ArrayList<View> U = new ArrayList<>();
    public wl V = new wl(1);
    public wl W = new wl(1);
    public z01 X = null;
    public int[] Y = j0;
    public ArrayList<Animator> b0 = new ArrayList<>();
    public int c0 = 0;
    public boolean d0 = false;
    public boolean e0 = false;
    public ArrayList<d> f0 = null;
    public ArrayList<Animator> g0 = new ArrayList<>();
    public z61 i0 = k0;

    /* renamed from: u01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends z61 {
        @Override // defpackage.z61
        public final Path Q(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: u01$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public View a;
        public String b;
        public c11 c;
        public m61 d;
        public u01 e;

        public b(View view, String str, u01 u01Var, l61 l61Var, c11 c11Var) {
            this.a = view;
            this.b = str;
            this.c = c11Var;
            this.d = l61Var;
            this.e = u01Var;
        }
    }

    /* renamed from: u01$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
    }

    /* renamed from: u01$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface d {
        void a();

        void b();

        void c();

        void d(u01 u01Var);

        void e();
    }

    public static void c(wl wlVar, View view, c11 c11Var) {
        ((e7) wlVar.a).put(view, c11Var);
        int id = view.getId();
        if (id >= 0) {
            if (((SparseArray) wlVar.b).indexOfKey(id) >= 0) {
                ((SparseArray) wlVar.b).put(id, null);
            } else {
                ((SparseArray) wlVar.b).put(id, view);
            }
        }
        String g = a41.g(view);
        if (g != null) {
            if (((e7) wlVar.d).containsKey(g)) {
                ((e7) wlVar.d).put(g, null);
            } else {
                ((e7) wlVar.d).put(g, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                d30 d30Var = (d30) wlVar.c;
                if (d30Var.P) {
                    d30Var.d();
                }
                if (gw.i(d30Var.S, itemIdAtPosition, d30Var.Q) >= 0) {
                    View view2 = (View) ((d30) wlVar.c).e(itemIdAtPosition, null);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        ((d30) wlVar.c).f(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                ((d30) wlVar.c).f(itemIdAtPosition, view);
            }
        }
    }

    public static e7<Animator, b> p() {
        e7<Animator, b> e7Var = l0.get();
        if (e7Var == null) {
            e7<Animator, b> e7Var2 = new e7<>();
            l0.set(e7Var2);
            return e7Var2;
        }
        return e7Var;
    }

    public static boolean v(c11 c11Var, c11 c11Var2, String str) {
        Object obj = c11Var.a.get(str);
        Object obj2 = c11Var2.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    public void A(ViewGroup viewGroup) {
        boolean z;
        if (this.d0) {
            if (!this.e0) {
                e7<Animator, b> p = p();
                int i = p.R;
                f51 f51Var = a51.a;
                WindowId windowId = viewGroup.getWindowId();
                for (int i2 = i - 1; i2 >= 0; i2--) {
                    b j = p.j(i2);
                    if (j.a != null) {
                        m61 m61Var = j.d;
                        if ((m61Var instanceof l61) && ((l61) m61Var).a.equals(windowId)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            p.h(i2).resume();
                        }
                    }
                }
                ArrayList<d> arrayList = this.f0;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f0.clone();
                    int size = arrayList2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        ((d) arrayList2.get(i3)).c();
                    }
                }
            }
            this.d0 = false;
        }
    }

    public void B() {
        I();
        e7<Animator, b> p = p();
        Iterator<Animator> it = this.g0.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (p.containsKey(next)) {
                I();
                if (next != null) {
                    next.addListener(new v01(this, p));
                    long j = this.R;
                    if (j >= 0) {
                        next.setDuration(j);
                    }
                    long j2 = this.Q;
                    if (j2 >= 0) {
                        next.setStartDelay(next.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.S;
                    if (timeInterpolator != null) {
                        next.setInterpolator(timeInterpolator);
                    }
                    next.addListener(new w01(this));
                    next.start();
                }
            }
        }
        this.g0.clear();
        n();
    }

    public void C(long j) {
        this.R = j;
    }

    public void D(c cVar) {
        this.h0 = cVar;
    }

    public void E(TimeInterpolator timeInterpolator) {
        this.S = timeInterpolator;
    }

    public void F(z61 z61Var) {
        if (z61Var == null) {
            z61Var = k0;
        }
        this.i0 = z61Var;
    }

    public void G() {
    }

    public void H(long j) {
        this.Q = j;
    }

    public final void I() {
        if (this.c0 == 0) {
            ArrayList<d> arrayList = this.f0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f0.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((d) arrayList2.get(i)).a();
                }
            }
            this.e0 = false;
        }
        this.c0++;
    }

    public String J(String str) {
        StringBuilder b2 = e5.b(str);
        b2.append(getClass().getSimpleName());
        b2.append("@");
        b2.append(Integer.toHexString(hashCode()));
        b2.append(": ");
        String sb = b2.toString();
        if (this.R != -1) {
            StringBuilder c2 = yg.c(sb, "dur(");
            c2.append(this.R);
            c2.append(") ");
            sb = c2.toString();
        }
        if (this.Q != -1) {
            StringBuilder c3 = yg.c(sb, "dly(");
            c3.append(this.Q);
            c3.append(") ");
            sb = c3.toString();
        }
        if (this.S != null) {
            StringBuilder c4 = yg.c(sb, "interp(");
            c4.append(this.S);
            c4.append(") ");
            sb = c4.toString();
        }
        if (this.T.size() > 0 || this.U.size() > 0) {
            String b3 = k6.b(sb, "tgts(");
            if (this.T.size() > 0) {
                for (int i = 0; i < this.T.size(); i++) {
                    if (i > 0) {
                        b3 = k6.b(b3, ", ");
                    }
                    StringBuilder b4 = e5.b(b3);
                    b4.append(this.T.get(i));
                    b3 = b4.toString();
                }
            }
            if (this.U.size() > 0) {
                for (int i2 = 0; i2 < this.U.size(); i2++) {
                    if (i2 > 0) {
                        b3 = k6.b(b3, ", ");
                    }
                    StringBuilder b5 = e5.b(b3);
                    b5.append(this.U.get(i2));
                    b3 = b5.toString();
                }
            }
            return k6.b(b3, ")");
        }
        return sb;
    }

    public void a(d dVar) {
        if (this.f0 == null) {
            this.f0 = new ArrayList<>();
        }
        this.f0.add(dVar);
    }

    public void b(View view) {
        this.U.add(view);
    }

    public abstract void d(c11 c11Var);

    public final void e(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            c11 c11Var = new c11(view);
            if (z) {
                h(c11Var);
            } else {
                d(c11Var);
            }
            c11Var.c.add(this);
            f(c11Var);
            c(z ? this.V : this.W, view, c11Var);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i), z);
            }
        }
    }

    public void f(c11 c11Var) {
    }

    public abstract void h(c11 c11Var);

    public final void i(ViewGroup viewGroup, boolean z) {
        j(z);
        if (this.T.size() <= 0 && this.U.size() <= 0) {
            e(viewGroup, z);
            return;
        }
        for (int i = 0; i < this.T.size(); i++) {
            View findViewById = viewGroup.findViewById(this.T.get(i).intValue());
            if (findViewById != null) {
                c11 c11Var = new c11(findViewById);
                if (z) {
                    h(c11Var);
                } else {
                    d(c11Var);
                }
                c11Var.c.add(this);
                f(c11Var);
                c(z ? this.V : this.W, findViewById, c11Var);
            }
        }
        for (int i2 = 0; i2 < this.U.size(); i2++) {
            View view = this.U.get(i2);
            c11 c11Var2 = new c11(view);
            if (z) {
                h(c11Var2);
            } else {
                d(c11Var2);
            }
            c11Var2.c.add(this);
            f(c11Var2);
            c(z ? this.V : this.W, view, c11Var2);
        }
    }

    public final void j(boolean z) {
        wl wlVar;
        if (z) {
            ((e7) this.V.a).clear();
            ((SparseArray) this.V.b).clear();
            wlVar = this.V;
        } else {
            ((e7) this.W.a).clear();
            ((SparseArray) this.W.b).clear();
            wlVar = this.W;
        }
        ((d30) wlVar.c).b();
    }

    @Override // 
    /* renamed from: k */
    public u01 clone() {
        try {
            u01 u01Var = (u01) super.clone();
            u01Var.g0 = new ArrayList<>();
            u01Var.V = new wl(1);
            u01Var.W = new wl(1);
            u01Var.Z = null;
            u01Var.a0 = null;
            return u01Var;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator l(ViewGroup viewGroup, c11 c11Var, c11 c11Var2) {
        return null;
    }

    public void m(ViewGroup viewGroup, wl wlVar, wl wlVar2, ArrayList<c11> arrayList, ArrayList<c11> arrayList2) {
        boolean z;
        Animator l;
        View view;
        Animator animator;
        c11 c11Var;
        Animator animator2;
        c11 c11Var2;
        ViewGroup viewGroup2 = viewGroup;
        e7<Animator, b> p = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            c11 c11Var3 = arrayList.get(i);
            c11 c11Var4 = arrayList2.get(i);
            if (c11Var3 != null && !c11Var3.c.contains(this)) {
                c11Var3 = null;
            }
            if (c11Var4 != null && !c11Var4.c.contains(this)) {
                c11Var4 = null;
            }
            if (c11Var3 != null || c11Var4 != null) {
                if (c11Var3 != null && c11Var4 != null && !s(c11Var3, c11Var4)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (l = l(viewGroup2, c11Var3, c11Var4)) != null) {
                    if (c11Var4 != null) {
                        View view2 = c11Var4.b;
                        String[] q = q();
                        if (q != null && q.length > 0) {
                            c11Var2 = new c11(view2);
                            c11 c11Var5 = (c11) ((e7) wlVar2.a).getOrDefault(view2, null);
                            if (c11Var5 != null) {
                                int i2 = 0;
                                while (i2 < q.length) {
                                    HashMap hashMap = c11Var2.a;
                                    Animator animator3 = l;
                                    String str = q[i2];
                                    hashMap.put(str, c11Var5.a.get(str));
                                    i2++;
                                    l = animator3;
                                    q = q;
                                }
                            }
                            Animator animator4 = l;
                            int i3 = p.R;
                            int i4 = 0;
                            while (true) {
                                if (i4 < i3) {
                                    b orDefault = p.getOrDefault(p.h(i4), null);
                                    if (orDefault.c != null && orDefault.a == view2 && orDefault.b.equals(this.P) && orDefault.c.equals(c11Var2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = animator4;
                                    break;
                                }
                            }
                        } else {
                            animator2 = l;
                            c11Var2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        c11Var = c11Var2;
                    } else {
                        view = c11Var3.b;
                        animator = l;
                        c11Var = null;
                    }
                    if (animator != null) {
                        String str2 = this.P;
                        f51 f51Var = a51.a;
                        p.put(animator, new b(view, str2, this, new l61(viewGroup2), c11Var));
                        this.g0.add(animator);
                    }
                    i++;
                    viewGroup2 = viewGroup;
                }
            }
            i++;
            viewGroup2 = viewGroup;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator5 = this.g0.get(sparseIntArray.keyAt(i5));
                animator5.setStartDelay(animator5.getStartDelay() + (sparseIntArray.valueAt(i5) - RecyclerView.FOREVER_NS));
            }
        }
    }

    public final void n() {
        int i = this.c0 - 1;
        this.c0 = i;
        if (i == 0) {
            ArrayList<d> arrayList = this.f0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f0.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((d) arrayList2.get(i2)).d(this);
                }
            }
            int i3 = 0;
            while (true) {
                d30 d30Var = (d30) this.V.c;
                if (d30Var.P) {
                    d30Var.d();
                }
                if (i3 >= d30Var.S) {
                    break;
                }
                View view = (View) ((d30) this.V.c).h(i3);
                if (view != null) {
                    WeakHashMap<View, String> weakHashMap = a41.a;
                    view.setHasTransientState(false);
                }
                i3++;
            }
            int i4 = 0;
            while (true) {
                d30 d30Var2 = (d30) this.W.c;
                if (d30Var2.P) {
                    d30Var2.d();
                }
                if (i4 < d30Var2.S) {
                    View view2 = (View) ((d30) this.W.c).h(i4);
                    if (view2 != null) {
                        WeakHashMap<View, String> weakHashMap2 = a41.a;
                        view2.setHasTransientState(false);
                    }
                    i4++;
                } else {
                    this.e0 = true;
                    return;
                }
            }
        }
    }

    public final c11 o(View view, boolean z) {
        z01 z01Var = this.X;
        if (z01Var != null) {
            return z01Var.o(view, z);
        }
        ArrayList<c11> arrayList = z ? this.Z : this.a0;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            c11 c11Var = arrayList.get(i2);
            if (c11Var == null) {
                return null;
            }
            if (c11Var.b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            return (z ? this.a0 : this.Z).get(i);
        }
        return null;
    }

    public String[] q() {
        return null;
    }

    public final c11 r(View view, boolean z) {
        wl wlVar;
        z01 z01Var = this.X;
        if (z01Var != null) {
            return z01Var.r(view, z);
        }
        if (z) {
            wlVar = this.V;
        } else {
            wlVar = this.W;
        }
        return (c11) ((e7) wlVar.a).getOrDefault(view, null);
    }

    public boolean s(c11 c11Var, c11 c11Var2) {
        if (c11Var == null || c11Var2 == null) {
            return false;
        }
        String[] q = q();
        if (q == null) {
            for (String str : c11Var.a.keySet()) {
                if (v(c11Var, c11Var2, str)) {
                }
            }
            return false;
        }
        for (String str2 : q) {
            if (!v(c11Var, c11Var2, str2)) {
            }
        }
        return false;
        return true;
    }

    public final String toString() {
        return J("");
    }

    public final boolean u(View view) {
        return (this.T.size() == 0 && this.U.size() == 0) || this.T.contains(Integer.valueOf(view.getId())) || this.U.contains(view);
    }

    public void w(View view) {
        int i;
        if (!this.e0) {
            e7<Animator, b> p = p();
            int i2 = p.R;
            f51 f51Var = a51.a;
            WindowId windowId = view.getWindowId();
            int i3 = i2 - 1;
            while (true) {
                i = 0;
                if (i3 < 0) {
                    break;
                }
                b j = p.j(i3);
                if (j.a != null) {
                    m61 m61Var = j.d;
                    if ((m61Var instanceof l61) && ((l61) m61Var).a.equals(windowId)) {
                        i = 1;
                    }
                    if (i != 0) {
                        p.h(i3).pause();
                    }
                }
                i3--;
            }
            ArrayList<d> arrayList = this.f0;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f0.clone();
                int size = arrayList2.size();
                while (i < size) {
                    ((d) arrayList2.get(i)).b();
                    i++;
                }
            }
            this.d0 = true;
        }
    }

    public void x(d dVar) {
        ArrayList<d> arrayList = this.f0;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(dVar);
        if (this.f0.size() == 0) {
            this.f0 = null;
        }
    }

    public void z(View view) {
        this.U.remove(view);
    }
}