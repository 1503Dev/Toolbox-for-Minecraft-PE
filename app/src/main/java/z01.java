package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import defpackage.u01;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: z01  reason: default package */
public class z01 extends u01 {
    public int o0;
    public ArrayList<u01> m0 = new ArrayList<>();
    public boolean n0 = true;
    public boolean p0 = false;
    public int q0 = 0;

    /* renamed from: z01$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends x01 {
        public final /* synthetic */ u01 a;

        public a(u01 u01Var) {
            this.a = u01Var;
        }

        @Override // defpackage.u01.d
        public final void d(u01 u01Var) {
            this.a.B();
            u01Var.x(this);
        }
    }

    /* renamed from: z01$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends x01 {
        public z01 a;

        public b(z01 z01Var) {
            this.a = z01Var;
        }

        @Override // defpackage.x01, defpackage.u01.d
        public final void a() {
            z01 z01Var = this.a;
            if (z01Var.p0) {
                return;
            }
            z01Var.I();
            this.a.p0 = true;
        }

        @Override // defpackage.u01.d
        public final void d(u01 u01Var) {
            z01 z01Var = this.a;
            int i = z01Var.o0 - 1;
            z01Var.o0 = i;
            if (i == 0) {
                z01Var.p0 = false;
                z01Var.n();
            }
            u01Var.x(this);
        }
    }

    @Override // defpackage.u01
    public final void A(ViewGroup viewGroup) {
        super.A(viewGroup);
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).A(viewGroup);
        }
    }

    @Override // defpackage.u01
    public final void B() {
        if (this.m0.isEmpty()) {
            I();
            n();
            return;
        }
        b bVar = new b(this);
        Iterator<u01> it = this.m0.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.o0 = this.m0.size();
        if (!this.n0) {
            for (int i = 1; i < this.m0.size(); i++) {
                this.m0.get(i - 1).a(new a(this.m0.get(i)));
            }
            u01 u01Var = this.m0.get(0);
            if (u01Var != null) {
                u01Var.B();
                return;
            }
            return;
        }
        Iterator<u01> it2 = this.m0.iterator();
        while (it2.hasNext()) {
            it2.next().B();
        }
    }

    @Override // defpackage.u01
    public final void C(long j) {
        ArrayList<u01> arrayList;
        this.R = j;
        if (j >= 0 && (arrayList = this.m0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.m0.get(i).C(j);
            }
        }
    }

    @Override // defpackage.u01
    public final void D(u01.c cVar) {
        this.h0 = cVar;
        this.q0 |= 8;
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).D(cVar);
        }
    }

    @Override // defpackage.u01
    public final void E(TimeInterpolator timeInterpolator) {
        this.q0 |= 1;
        ArrayList<u01> arrayList = this.m0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.m0.get(i).E(timeInterpolator);
            }
        }
        this.S = timeInterpolator;
    }

    @Override // defpackage.u01
    public final void F(z61 z61Var) {
        super.F(z61Var);
        this.q0 |= 4;
        if (this.m0 != null) {
            for (int i = 0; i < this.m0.size(); i++) {
                this.m0.get(i).F(z61Var);
            }
        }
    }

    @Override // defpackage.u01
    public final void G() {
        this.q0 |= 2;
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).G();
        }
    }

    @Override // defpackage.u01
    public final void H(long j) {
        this.Q = j;
    }

    @Override // defpackage.u01
    public final String J(String str) {
        String J = super.J(str);
        for (int i = 0; i < this.m0.size(); i++) {
            StringBuilder c = yg.c(J, "\n");
            c.append(this.m0.get(i).J(str + "  "));
            J = c.toString();
        }
        return J;
    }

    public final void K(u01 u01Var) {
        this.m0.add(u01Var);
        u01Var.X = this;
        long j = this.R;
        if (j >= 0) {
            u01Var.C(j);
        }
        if ((this.q0 & 1) != 0) {
            u01Var.E(this.S);
        }
        if ((this.q0 & 2) != 0) {
            u01Var.G();
        }
        if ((this.q0 & 4) != 0) {
            u01Var.F(this.i0);
        }
        if ((this.q0 & 8) != 0) {
            u01Var.D(this.h0);
        }
    }

    @Override // defpackage.u01
    public final void a(u01.d dVar) {
        super.a(dVar);
    }

    @Override // defpackage.u01
    public final void b(View view) {
        for (int i = 0; i < this.m0.size(); i++) {
            this.m0.get(i).b(view);
        }
        this.U.add(view);
    }

    @Override // defpackage.u01
    public final void d(c11 c11Var) {
        if (u(c11Var.b)) {
            Iterator<u01> it = this.m0.iterator();
            while (it.hasNext()) {
                u01 next = it.next();
                if (next.u(c11Var.b)) {
                    next.d(c11Var);
                    c11Var.c.add(next);
                }
            }
        }
    }

    @Override // defpackage.u01
    public final void f(c11 c11Var) {
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).f(c11Var);
        }
    }

    @Override // defpackage.u01
    public final void h(c11 c11Var) {
        if (u(c11Var.b)) {
            Iterator<u01> it = this.m0.iterator();
            while (it.hasNext()) {
                u01 next = it.next();
                if (next.u(c11Var.b)) {
                    next.h(c11Var);
                    c11Var.c.add(next);
                }
            }
        }
    }

    @Override // defpackage.u01
    /* renamed from: k */
    public final u01 clone() {
        z01 z01Var = (z01) super.clone();
        z01Var.m0 = new ArrayList<>();
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            u01 clone = this.m0.get(i).clone();
            z01Var.m0.add(clone);
            clone.X = z01Var;
        }
        return z01Var;
    }

    @Override // defpackage.u01
    public final void m(ViewGroup viewGroup, wl wlVar, wl wlVar2, ArrayList<c11> arrayList, ArrayList<c11> arrayList2) {
        long j = this.Q;
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            u01 u01Var = this.m0.get(i);
            if (j > 0 && (this.n0 || i == 0)) {
                long j2 = u01Var.Q;
                if (j2 > 0) {
                    u01Var.H(j2 + j);
                } else {
                    u01Var.H(j);
                }
            }
            u01Var.m(viewGroup, wlVar, wlVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.u01
    public final void w(View view) {
        super.w(view);
        int size = this.m0.size();
        for (int i = 0; i < size; i++) {
            this.m0.get(i).w(view);
        }
    }

    @Override // defpackage.u01
    public final void x(u01.d dVar) {
        super.x(dVar);
    }

    @Override // defpackage.u01
    public final void z(View view) {
        for (int i = 0; i < this.m0.size(); i++) {
            this.m0.get(i).z(view);
        }
        this.U.remove(view);
    }
}