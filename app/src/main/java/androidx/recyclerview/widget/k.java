package androidx.recyclerview.widget;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public final class k extends w {
    public static TimeInterpolator s;
    public ArrayList<RecyclerView.d0> h = new ArrayList<>();
    public ArrayList<RecyclerView.d0> i = new ArrayList<>();
    public ArrayList<b> j = new ArrayList<>();
    public ArrayList<a> k = new ArrayList<>();
    public ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<>();
    public ArrayList<ArrayList<b>> m = new ArrayList<>();
    public ArrayList<ArrayList<a>> n = new ArrayList<>();
    public ArrayList<RecyclerView.d0> o = new ArrayList<>();
    public ArrayList<RecyclerView.d0> p = new ArrayList<>();
    public ArrayList<RecyclerView.d0> q = new ArrayList<>();
    public ArrayList<RecyclerView.d0> r = new ArrayList<>();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public RecyclerView.d0 a;
        public RecyclerView.d0 b;
        public int c;
        public int d;
        public int e;
        public int f;

        public a(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this.a = d0Var;
            this.b = d0Var2;
            this.c = i;
            this.d = i2;
            this.e = i3;
            this.f = i4;
        }

        public final String toString() {
            StringBuilder b = e5.b("ChangeInfo{oldHolder=");
            b.append(this.a);
            b.append(", newHolder=");
            b.append(this.b);
            b.append(", fromX=");
            b.append(this.c);
            b.append(", fromY=");
            b.append(this.d);
            b.append(", toX=");
            b.append(this.e);
            b.append(", toY=");
            b.append(this.f);
            b.append('}');
            return b.toString();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public RecyclerView.d0 a;
        public int b;
        public int c;
        public int d;
        public int e;

        public b(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.a = d0Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static void i(ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            ((RecyclerView.d0) arrayList.get(size)).P.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void e(RecyclerView.d0 d0Var) {
        View view = d0Var.P;
        view.animate().cancel();
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.j.get(size).a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(d0Var);
                this.j.remove(size);
            }
        }
        k(d0Var, this.k);
        if (this.h.remove(d0Var)) {
            view.setAlpha(1.0f);
            c(d0Var);
        }
        if (this.i.remove(d0Var)) {
            view.setAlpha(1.0f);
            c(d0Var);
        }
        int size2 = this.n.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList<a> arrayList = this.n.get(size2);
            k(d0Var, arrayList);
            if (arrayList.isEmpty()) {
                this.n.remove(size2);
            }
        }
        int size3 = this.m.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            ArrayList<b> arrayList2 = this.m.get(size3);
            int size4 = arrayList2.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(size3);
                    }
                }
            }
        }
        int size5 = this.l.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                ArrayList<RecyclerView.d0> arrayList3 = this.l.get(size5);
                if (arrayList3.remove(d0Var)) {
                    view.setAlpha(1.0f);
                    c(d0Var);
                    if (arrayList3.isEmpty()) {
                        this.l.remove(size5);
                    }
                }
            } else {
                this.q.remove(d0Var);
                this.o.remove(d0Var);
                this.r.remove(d0Var);
                this.p.remove(d0Var);
                j();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void f() {
        int size = this.j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            b bVar = this.j.get(size);
            View view = bVar.a.P;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(bVar.a);
            this.j.remove(size);
        }
        int size2 = this.h.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            c(this.h.get(size2));
            this.h.remove(size2);
        }
        int size3 = this.i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.i.get(size3);
            d0Var.P.setAlpha(1.0f);
            c(d0Var);
            this.i.remove(size3);
        }
        int size4 = this.k.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            a aVar = this.k.get(size4);
            RecyclerView.d0 d0Var2 = aVar.a;
            if (d0Var2 != null) {
                l(aVar, d0Var2);
            }
            RecyclerView.d0 d0Var3 = aVar.b;
            if (d0Var3 != null) {
                l(aVar, d0Var3);
            }
        }
        this.k.clear();
        if (!g()) {
            return;
        }
        int size5 = this.m.size();
        while (true) {
            size5--;
            if (size5 < 0) {
                break;
            }
            ArrayList<b> arrayList = this.m.get(size5);
            int size6 = arrayList.size();
            while (true) {
                size6--;
                if (size6 >= 0) {
                    b bVar2 = arrayList.get(size6);
                    View view2 = bVar2.a.P;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(bVar2.a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.m.remove(arrayList);
                    }
                }
            }
        }
        int size7 = this.l.size();
        while (true) {
            size7--;
            if (size7 < 0) {
                break;
            }
            ArrayList<RecyclerView.d0> arrayList2 = this.l.get(size7);
            int size8 = arrayList2.size();
            while (true) {
                size8--;
                if (size8 >= 0) {
                    RecyclerView.d0 d0Var4 = arrayList2.get(size8);
                    d0Var4.P.setAlpha(1.0f);
                    c(d0Var4);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.l.remove(arrayList2);
                    }
                }
            }
        }
        int size9 = this.n.size();
        while (true) {
            size9--;
            if (size9 >= 0) {
                ArrayList<a> arrayList3 = this.n.get(size9);
                int size10 = arrayList3.size();
                while (true) {
                    size10--;
                    if (size10 >= 0) {
                        a aVar2 = arrayList3.get(size10);
                        RecyclerView.d0 d0Var5 = aVar2.a;
                        if (d0Var5 != null) {
                            l(aVar2, d0Var5);
                        }
                        RecyclerView.d0 d0Var6 = aVar2.b;
                        if (d0Var6 != null) {
                            l(aVar2, d0Var6);
                        }
                        if (arrayList3.isEmpty()) {
                            this.n.remove(arrayList3);
                        }
                    }
                }
            } else {
                i(this.q);
                i(this.p);
                i(this.o);
                i(this.r);
                d();
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final boolean g() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.w
    public final boolean h(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.P;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.P.getTranslationY());
        m(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            c(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.j.add(new b(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    public final void j() {
        if (g()) {
            return;
        }
        d();
    }

    public final void k(RecyclerView.d0 d0Var, ArrayList arrayList) {
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            a aVar = (a) arrayList.get(size);
            if (l(aVar, d0Var) && aVar.a == null && aVar.b == null) {
                arrayList.remove(aVar);
            }
        }
    }

    public final boolean l(a aVar, RecyclerView.d0 d0Var) {
        if (aVar.b == d0Var) {
            aVar.b = null;
        } else if (aVar.a != d0Var) {
            return false;
        } else {
            aVar.a = null;
        }
        d0Var.P.setAlpha(1.0f);
        d0Var.P.setTranslationX(0.0f);
        d0Var.P.setTranslationY(0.0f);
        c(d0Var);
        return true;
    }

    public final void m(RecyclerView.d0 d0Var) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        d0Var.P.animate().setInterpolator(s);
        e(d0Var);
    }
}