package defpackage;

import android.os.Looper;
import android.util.SparseArray;
import java.io.IOException;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* renamed from: pp5  reason: default package */
public final class pp5 implements ho5 {
    public final dx3 P;
    public final ya3 Q;
    public final lc3 R;
    public final p43 S;
    public final SparseArray T;
    public i94 U;
    public o73 V;
    public a54 W;
    public boolean X;

    public pp5(dx3 dx3Var) {
        dx3Var.getClass();
        this.P = dx3Var;
        int i = zn4.a;
        Looper myLooper = Looper.myLooper();
        this.U = new i94(myLooper == null ? Looper.getMainLooper() : myLooper, dx3Var, dt4.Y);
        ya3 ya3Var = new ya3();
        this.Q = ya3Var;
        this.R = new lc3();
        this.S = new p43(ya3Var);
        this.T = new SparseArray();
    }

    public final void A(o73 o73Var, Looper looper) {
        boolean z;
        if (this.V != null && !((nv4) this.S.b).isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        tv2.I(z);
        o73Var.getClass();
        this.V = o73Var;
        this.W = this.P.b(looper, null);
        i94 i94Var = this.U;
        yn2 yn2Var = new yn2(this, o73Var);
        this.U = new i94(i94Var.d, looper, i94Var.a, yn2Var);
    }

    public final io5 B() {
        return E((ov5) this.S.d);
    }

    @RequiresNonNull({"player"})
    public final io5 C(kd3 kd3Var, int i, ov5 ov5Var) {
        ov5 ov5Var2;
        boolean z = true;
        if (true == kd3Var.o()) {
            ov5Var2 = null;
        } else {
            ov5Var2 = ov5Var;
        }
        long a = this.P.a();
        z = (kd3Var.equals(this.V.k()) && i == this.V.i()) ? false : false;
        long j = 0;
        if (ov5Var2 != null && ov5Var2.a()) {
            if (z && this.V.c() == ov5Var2.b && this.V.d() == ov5Var2.c) {
                j = this.V.l();
            }
        } else if (z) {
            j = this.V.j();
        } else if (!kd3Var.o()) {
            kd3Var.e(i, this.R, 0L).getClass();
            j = zn4.s(0L);
        }
        return new io5(a, kd3Var, i, ov5Var2, j, this.V.k(), this.V.i(), (ov5) this.S.d, this.V.l(), this.V.o());
    }

    public final void D(io5 io5Var, int i, v64 v64Var) {
        this.T.put(i, io5Var);
        i94 i94Var = this.U;
        i94Var.b(i, v64Var);
        i94Var.a();
    }

    public final io5 E(ov5 ov5Var) {
        kd3 kd3Var;
        this.V.getClass();
        if (ov5Var == null) {
            kd3Var = null;
        } else {
            kd3Var = (kd3) ((qv4) this.S.c).get(ov5Var);
        }
        if (ov5Var != null && kd3Var != null) {
            return C(kd3Var, kd3Var.n(ov5Var.a, this.Q).c, ov5Var);
        }
        int i = this.V.i();
        kd3 k = this.V.k();
        if (i >= k.c()) {
            k = kd3.a;
        }
        return C(k, i, null);
    }

    public final io5 F(int i, ov5 ov5Var) {
        o73 o73Var = this.V;
        o73Var.getClass();
        if (ov5Var != null) {
            if (((kd3) ((qv4) this.S.c).get(ov5Var)) != null) {
                return E(ov5Var);
            }
            return C(kd3.a, i, ov5Var);
        }
        kd3 k = o73Var.k();
        if (i >= k.c()) {
            k = kd3.a;
        }
        return C(k, i, null);
    }

    public final io5 G() {
        return E((ov5) this.S.f);
    }

    @Override // defpackage.tv5
    public final void a(int i, ov5 ov5Var, final xu5 xu5Var, final lv5 lv5Var, final IOException iOException, final boolean z) {
        final io5 F = F(i, ov5Var);
        D(F, 1003, new v64(F, xu5Var, lv5Var, iOException, z) { // from class: xo5
            public final /* synthetic */ IOException P;

            {
                this.P = iOException;
            }

            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                ((jo5) obj).f(this.P);
            }
        });
    }

    @Override // defpackage.b53
    public final void b(int i, boolean z) {
        D(B(), -1, new ko5());
    }

    @Override // defpackage.b53
    public final void c(boolean z) {
        io5 G = G();
        D(G, 23, new db3(G));
    }

    @Override // defpackage.b53
    public final void d(boolean z) {
        D(B(), 3, new wo5(0));
    }

    @Override // defpackage.b53
    public final void e(float f) {
        io5 G = G();
        D(G, 22, new gb3(G));
    }

    @Override // defpackage.b53
    public final void e0(int i) {
        io5 B = B();
        D(B, 4, new bp5(B, i));
    }

    @Override // defpackage.b53
    public final void f(boolean z) {
        D(B(), 7, new ko5(0));
    }

    @Override // defpackage.b53
    public final void g(cz5 cz5Var) {
        io5 B = B();
        D(B, 29, new vw2(B, cz5Var));
    }

    @Override // defpackage.b53
    public final void h(wo3 wo3Var) {
        io5 G = G();
        D(G, 25, new ak1(G, wo3Var));
    }

    @Override // defpackage.b53
    public final void i(el2 el2Var, int i) {
        io5 B = B();
        D(B, 1, new mr1(B, el2Var));
    }

    @Override // defpackage.tv5
    public final void j(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        io5 F = F(i, ov5Var);
        D(F, 1001, new b74(F, xu5Var, lv5Var));
    }

    @Override // defpackage.tv5
    public final void k(int i, ov5 ov5Var, lv5 lv5Var) {
        io5 F = F(i, ov5Var);
        D(F, 1004, new s33(F, lv5Var));
    }

    @Override // defpackage.b53
    public final void l(int i) {
        p43 p43Var = this.S;
        o73 o73Var = this.V;
        o73Var.getClass();
        p43Var.d = p43.d(o73Var, (nv4) p43Var.b, (ov5) p43Var.e, (ya3) p43Var.a);
        p43Var.g(o73Var.k());
        io5 B = B();
        D(B, 0, new ez1(B));
    }

    @Override // defpackage.b53
    public final void m() {
        io5 B = B();
        D(B, -1, new cz1(4, B));
    }

    @Override // defpackage.b53
    public final void n(int i, boolean z) {
        D(B(), 30, new wo5());
    }

    @Override // defpackage.b53
    public final void o(final int i, final q63 q63Var, final q63 q63Var2) {
        if (i == 1) {
            this.X = false;
            i = 1;
        }
        p43 p43Var = this.S;
        o73 o73Var = this.V;
        o73Var.getClass();
        p43Var.d = p43.d(o73Var, (nv4) p43Var.b, (ov5) p43Var.e, (ya3) p43Var.a);
        final io5 B = B();
        D(B, 11, new v64(i, q63Var, q63Var2, B) { // from class: uo5
            public final /* synthetic */ int P;

            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                ((jo5) obj).m(this.P);
            }
        });
    }

    @Override // defpackage.tv5
    public final void p(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        D(F(i, ov5Var), 1002, new v64() { // from class: zo5
            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                jo5 jo5Var = (jo5) obj;
            }
        });
    }

    @Override // defpackage.b53
    public final void q(tk5 tk5Var) {
        io5 B;
        lr2 lr2Var;
        if ((tk5Var instanceof tk5) && (lr2Var = tk5Var.W) != null) {
            B = E(new ov5(lr2Var));
        } else {
            B = B();
        }
        D(B, 10, new vs1(B, tk5Var));
    }

    @Override // defpackage.b53
    public final void r(y13 y13Var) {
        io5 B = B();
        D(B, 12, new sk1(4, B, y13Var));
    }

    @Override // defpackage.b53
    public final void s(int i, boolean z) {
        io5 B = B();
        D(B, 5, new ij2(B));
    }

    @Override // defpackage.b53
    public final void t(q43 q43Var) {
        io5 B = B();
        D(B, 13, new vo5(B, q43Var, 0));
    }

    @Override // defpackage.b53
    public final void u(nq2 nq2Var) {
        io5 B = B();
        D(B, 14, new ln1(5, B, nq2Var));
    }

    @Override // defpackage.b53
    public final void v(vk3 vk3Var) {
        io5 B = B();
        D(B, 2, new kt2(B, vk3Var));
    }

    @Override // defpackage.b53
    public final void w(int i) {
        io5 B = B();
        D(B, 6, new s82(B));
    }

    @Override // defpackage.b53
    public final void x(tk5 tk5Var) {
        io5 B;
        lr2 lr2Var;
        if ((tk5Var instanceof tk5) && (lr2Var = tk5Var.W) != null) {
            B = E(new ov5(lr2Var));
        } else {
            B = B();
        }
        D(B, 10, new sk1(5, B, tk5Var));
    }

    @Override // defpackage.tv5
    public final void y(int i, ov5 ov5Var, xu5 xu5Var, lv5 lv5Var) {
        D(F(i, ov5Var), 1000, new v64() { // from class: ap5
            @Override // defpackage.v64
            /* renamed from: e */
            public final void mo5e(Object obj) {
                jo5 jo5Var = (jo5) obj;
            }
        });
    }

    @Override // defpackage.b53
    public final void z(int i, int i2) {
        io5 G = G();
        D(G, 24, new vi2(G));
    }
}