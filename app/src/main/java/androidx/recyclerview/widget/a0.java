package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

public final class a0 {
    public final os0<RecyclerView.d0, a> a = new os0<>();
    public final d30<RecyclerView.d0> b = new d30<>();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public static hf0 d = new hf0(20);
        public int a;
        public RecyclerView.l.c b;
        public RecyclerView.l.c c;

        public static a a() {
            a aVar = (a) d.a();
            return aVar == null ? new a() : aVar;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface b {
    }

    public final void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(d0Var, orDefault);
        }
        orDefault.c = cVar;
        orDefault.a |= 8;
    }

    public final void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.a.put(d0Var, orDefault);
        }
        orDefault.b = cVar;
        orDefault.a |= 4;
    }

    public final RecyclerView.l.c c(RecyclerView.d0 d0Var, int i) {
        a j;
        RecyclerView.l.c cVar;
        int e = this.a.e(d0Var);
        if (e >= 0 && (j = this.a.j(e)) != null) {
            int i2 = j.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (i ^ (-1));
                j.a = i3;
                if (i == 4) {
                    cVar = j.b;
                } else if (i == 8) {
                    cVar = j.c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.a.i(e);
                    j.a = 0;
                    j.b = null;
                    j.c = null;
                    a.d.b(j);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void d(RecyclerView.d0 d0Var) {
        a orDefault = this.a.getOrDefault(d0Var, null);
        if (orDefault == null) {
            return;
        }
        orDefault.a &= -2;
    }

    public final void e(RecyclerView.d0 d0Var) {
        d30<RecyclerView.d0> d30Var = this.b;
        if (d30Var.P) {
            d30Var.d();
        }
        int i = d30Var.S - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (d0Var == this.b.h(i)) {
                d30<RecyclerView.d0> d30Var2 = this.b;
                Object[] objArr = d30Var2.R;
                Object obj = objArr[i];
                Object obj2 = d30.T;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    d30Var2.P = true;
                }
            } else {
                i--;
            }
        }
        a remove = this.a.remove(d0Var);
        if (remove != null) {
            remove.a = 0;
            remove.b = null;
            remove.c = null;
            a.d.b(remove);
        }
    }
}