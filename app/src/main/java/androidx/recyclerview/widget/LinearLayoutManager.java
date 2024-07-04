package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public int f0;
    public c g0;
    public t h0;
    public boolean i0;
    public boolean j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public int n0;
    public int o0;
    public d p0;
    public final a q0;
    public final b r0;
    public int s0;
    public int[] t0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public t a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            c();
        }

        public final void a(View view, int i) {
            if (this.d) {
                this.c = this.a.m() + this.a.b(view);
            } else {
                this.c = this.a.e(view);
            }
            this.b = i;
        }

        public final void b(View view, int i) {
            int min;
            int m = this.a.m();
            if (m >= 0) {
                a(view, i);
                return;
            }
            this.b = i;
            if (this.d) {
                int g = (this.a.g() - m) - this.a.b(view);
                this.c = this.a.g() - g;
                if (g <= 0) {
                    return;
                }
                int c = this.c - this.a.c(view);
                int k = this.a.k();
                int min2 = c - (Math.min(this.a.e(view) - k, 0) + k);
                if (min2 >= 0) {
                    return;
                }
                min = Math.min(g, -min2) + this.c;
            } else {
                int e = this.a.e(view);
                int k2 = e - this.a.k();
                this.c = e;
                if (k2 <= 0) {
                    return;
                }
                int g2 = (this.a.g() - Math.min(0, (this.a.g() - m) - this.a.b(view))) - (this.a.c(view) + e);
                if (g2 >= 0) {
                    return;
                }
                min = this.c - Math.min(k2, -g2);
            }
            this.c = min;
        }

        public final void c() {
            this.b = -1;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.d = false;
            this.e = false;
        }

        public final String toString() {
            StringBuilder b = e5.b("AnchorInfo{mPosition=");
            b.append(this.b);
            b.append(", mCoordinate=");
            b.append(this.c);
            b.append(", mLayoutFromEnd=");
            b.append(this.d);
            b.append(", mValid=");
            b.append(this.e);
            b.append('}');
            return b.toString();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int j;
        public boolean l;
        public boolean a = true;
        public int h = 0;
        public int i = 0;
        public List<RecyclerView.d0> k = null;

        public final void a(View view) {
            int a;
            int a2;
            int size = this.k.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.k.get(i2).P;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.d() && (a2 = (pVar.a() - this.d) * this.e) >= 0 && a2 < i) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i = a2;
                }
            }
            if (view2 == null) {
                a = -1;
            } else {
                a = ((RecyclerView.p) view2.getLayoutParams()).a();
            }
            this.d = a;
        }

        public final View b(RecyclerView.v vVar) {
            List<RecyclerView.d0> list = this.k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.k.get(i).P;
                    RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                    if (!pVar.d() && this.d == pVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = vVar.j(this.d, RecyclerView.FOREVER_NS).P;
            this.d += this.e;
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int P;
        public int Q;
        public boolean R;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            public final d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        public d(Parcel parcel) {
            this.P = parcel.readInt();
            this.Q = parcel.readInt();
            this.R = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.P = dVar.P;
            this.Q = dVar.Q;
            this.R = dVar.R;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R ? 1 : 0);
        }
    }

    public LinearLayoutManager() {
        this(1);
    }

    public LinearLayoutManager(int i) {
        this.f0 = 1;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = true;
        this.n0 = -1;
        this.o0 = RecyclerView.UNDEFINED_DURATION;
        this.p0 = null;
        this.q0 = new a();
        this.r0 = new b();
        this.s0 = 2;
        this.t0 = new int[2];
        j1(i);
        m(null);
        if (this.j0) {
            this.j0 = false;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final View B(int i) {
        int H = H();
        if (H == 0) {
            return null;
        }
        int M = i - RecyclerView.o.M(G(0));
        if (M >= 0 && M < H) {
            View G = G(M);
            if (RecyclerView.o.M(G) == i) {
                return G;
            }
        }
        return super.B(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p C() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean E0() {
        boolean z;
        if (this.c0 == 1073741824 || this.b0 == 1073741824) {
            return false;
        }
        int H = H();
        int i = 0;
        while (true) {
            if (i < H) {
                ViewGroup.LayoutParams layoutParams = G(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i;
        H0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean I0() {
        return this.p0 == null && this.i0 == this.l0;
    }

    public void J0(RecyclerView.a0 a0Var, int[] iArr) {
        boolean z;
        int i;
        int i2;
        if (a0Var.a != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.h0.l();
        } else {
            i = 0;
        }
        if (this.g0.f == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public void K0(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= a0Var.b()) {
            return;
        }
        ((m.b) cVar2).a(i, Math.max(0, cVar.g));
    }

    public final int L0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        P0();
        return v.a(a0Var, this.h0, S0(!this.m0), R0(!this.m0), this, this.m0);
    }

    public final int M0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        P0();
        return v.b(a0Var, this.h0, S0(!this.m0), R0(!this.m0), this, this.m0, this.k0);
    }

    public final int N0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        P0();
        return v.c(a0Var, this.h0, S0(!this.m0), R0(!this.m0), this, this.m0);
    }

    public final int O0(int i) {
        if (i == 1) {
            return (this.f0 != 1 && c1()) ? 1 : -1;
        } else if (i == 2) {
            return (this.f0 != 1 && c1()) ? -1 : 1;
        } else if (i == 17) {
            if (this.f0 == 0) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 33) {
            if (this.f0 == 1) {
                return -1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 66) {
            if (this.f0 == 0) {
                return 1;
            }
            return RecyclerView.UNDEFINED_DURATION;
        } else if (i == 130 && this.f0 == 1) {
            return 1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    public final void P0() {
        if (this.g0 == null) {
            this.g0 = new c();
        }
    }

    public final int Q0(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        boolean z2;
        int i = cVar.c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            f1(vVar, cVar);
        }
        int i3 = cVar.c + cVar.h;
        b bVar = this.r0;
        while (true) {
            if (!cVar.l && i3 <= 0) {
                break;
            }
            int i4 = cVar.d;
            if (i4 >= 0 && i4 < a0Var.b()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            bVar.a = 0;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            d1(vVar, a0Var, cVar, bVar);
            if (!bVar.b) {
                int i5 = cVar.b;
                int i6 = bVar.a;
                cVar.b = (cVar.f * i6) + i5;
                if (!bVar.c || cVar.k != null || !a0Var.g) {
                    cVar.c -= i6;
                    i3 -= i6;
                }
                int i7 = cVar.g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.g = i8 + i9;
                    }
                    f1(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.c;
    }

    public final View R0(boolean z) {
        int H;
        int i = -1;
        if (this.k0) {
            H = 0;
            i = H();
        } else {
            H = H() - 1;
        }
        return W0(H, i, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean S() {
        return true;
    }

    public final View S0(boolean z) {
        int i;
        int i2 = -1;
        if (this.k0) {
            i = H() - 1;
        } else {
            i = 0;
            i2 = H();
        }
        return W0(i, i2, z);
    }

    public final int T0() {
        View W0 = W0(0, H(), false);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.o.M(W0);
    }

    public final int U0() {
        View W0 = W0(H() - 1, -1, false);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.o.M(W0);
    }

    public final View V0(int i, int i2) {
        int i3;
        int i4;
        P0();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return G(i);
        }
        if (this.h0.e(G(i)) < this.h0.k()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f0 == 0 ? this.R : this.S).a(i, i2, i3, i4);
    }

    public final View W0(int i, int i2, boolean z) {
        P0();
        return (this.f0 == 0 ? this.R : this.S).a(i, i2, z ? 24579 : 320, 320);
    }

    public View X0(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        P0();
        int k = this.h0.k();
        int g = this.h0.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View G = G(i);
            int M = RecyclerView.o.M(G);
            if (M >= 0 && M < i3) {
                if (((RecyclerView.p) G.getLayoutParams()).d()) {
                    if (view2 == null) {
                        view2 = G;
                    }
                } else if (this.h0.e(G) < g && this.h0.b(G) >= k) {
                    return G;
                } else {
                    if (view == null) {
                        view = G;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int Y0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int g;
        int g2 = this.h0.g() - i;
        if (g2 > 0) {
            int i2 = -i1(-g2, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (g = this.h0.g() - i3) <= 0) {
                return i2;
            }
            this.h0.p(g);
            return g + i2;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Z(RecyclerView recyclerView) {
    }

    public final int Z0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int k;
        int k2 = i - this.h0.k();
        if (k2 > 0) {
            int i2 = -i1(k2, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (k = i3 - this.h0.k()) <= 0) {
                return i2;
            }
            this.h0.p(-k);
            return i2 - k;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int O0;
        View V0;
        View a1;
        h1();
        if (H() == 0 || (O0 = O0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        P0();
        l1(O0, (int) (this.h0.l() * 0.33333334f), false, a0Var);
        c cVar = this.g0;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
        cVar.a = false;
        Q0(vVar, cVar, a0Var, true);
        if (O0 == -1) {
            if (this.k0) {
                V0 = V0(H() - 1, -1);
            } else {
                V0 = V0(0, H());
            }
        } else if (this.k0) {
            V0 = V0(0, H());
        } else {
            V0 = V0(H() - 1, -1);
        }
        if (O0 == -1) {
            a1 = b1();
        } else {
            a1 = a1();
        }
        if (a1.hasFocusable()) {
            if (V0 == null) {
                return null;
            }
            return a1;
        }
        return V0;
    }

    public final View a1() {
        return G(this.k0 ? 0 : H() - 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (H() > 0) {
            accessibilityEvent.setFromIndex(T0());
            accessibilityEvent.setToIndex(U0());
        }
    }

    public final View b1() {
        return G(this.k0 ? H() - 1 : 0);
    }

    public final boolean c1() {
        return K() == 1;
    }

    public void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int d2;
        boolean z2;
        View b2 = cVar.b(vVar);
        if (b2 == null) {
            bVar.b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) b2.getLayoutParams();
        if (cVar.k == null) {
            boolean z3 = this.k0;
            if (cVar.f == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                l(-1, b2, false);
            } else {
                l(0, b2, false);
            }
        } else {
            boolean z4 = this.k0;
            if (cVar.f == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                l(-1, b2, true);
            } else {
                l(0, b2, true);
            }
        }
        RecyclerView.p pVar2 = (RecyclerView.p) b2.getLayoutParams();
        Rect itemDecorInsetsForChild = this.Q.getItemDecorInsetsForChild(b2);
        int I = RecyclerView.o.I(o(), this.d0, this.b0, getPaddingRight() + getPaddingLeft() + ((ViewGroup.MarginLayoutParams) pVar2).leftMargin + ((ViewGroup.MarginLayoutParams) pVar2).rightMargin + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0, ((ViewGroup.MarginLayoutParams) pVar2).width);
        int I2 = RecyclerView.o.I(p(), this.e0, this.c0, getPaddingBottom() + getPaddingTop() + ((ViewGroup.MarginLayoutParams) pVar2).topMargin + ((ViewGroup.MarginLayoutParams) pVar2).bottomMargin + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0, ((ViewGroup.MarginLayoutParams) pVar2).height);
        if (D0(b2, I, I2, pVar2)) {
            b2.measure(I, I2);
        }
        bVar.a = this.h0.c(b2);
        if (this.f0 == 1) {
            if (c1()) {
                d2 = this.d0 - getPaddingRight();
                i4 = d2 - this.h0.d(b2);
            } else {
                i4 = getPaddingLeft();
                d2 = this.h0.d(b2) + i4;
            }
            int i5 = cVar.f;
            int i6 = cVar.b;
            if (i5 == -1) {
                i3 = i6;
                i2 = d2;
                i = i6 - bVar.a;
            } else {
                i = i6;
                i2 = d2;
                i3 = bVar.a + i6;
            }
        } else {
            int paddingTop = getPaddingTop();
            int d3 = this.h0.d(b2) + paddingTop;
            int i7 = cVar.f;
            int i8 = cVar.b;
            if (i7 == -1) {
                i2 = i8;
                i = paddingTop;
                i3 = d3;
                i4 = i8 - bVar.a;
            } else {
                i = paddingTop;
                i2 = bVar.a + i8;
                i3 = d3;
                i4 = i8;
            }
        }
        U(b2, i4, i, i2, i3);
        if (pVar.d() || pVar.c()) {
            bVar.c = true;
        }
        bVar.d = b2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF e(int i) {
        if (H() == 0) {
            return null;
        }
        int i2 = (i < RecyclerView.o.M(G(0))) != this.k0 ? -1 : 1;
        return this.f0 == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    public final void f1(RecyclerView.v vVar, c cVar) {
        if (cVar.a && !cVar.l) {
            int i = cVar.g;
            int i2 = cVar.i;
            if (cVar.f == -1) {
                int H = H();
                if (i >= 0) {
                    int f = (this.h0.f() - i) + i2;
                    if (this.k0) {
                        for (int i3 = 0; i3 < H; i3++) {
                            View G = G(i3);
                            if (this.h0.e(G) < f || this.h0.o(G) < f) {
                                g1(vVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = H - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View G2 = G(i5);
                        if (this.h0.e(G2) < f || this.h0.o(G2) < f) {
                            g1(vVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int H2 = H();
                if (this.k0) {
                    int i7 = H2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View G3 = G(i8);
                        if (this.h0.b(G3) > i6 || this.h0.n(G3) > i6) {
                            g1(vVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < H2; i9++) {
                    View G4 = G(i9);
                    if (this.h0.b(G4) > i6 || this.h0.n(G4) > i6) {
                        g1(vVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void g1(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View G = G(i);
                if (G(i) != null) {
                    this.P.l(i);
                }
                vVar.g(G);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                View G2 = G(i2);
                if (G(i2) != null) {
                    this.P.l(i2);
                }
                vVar.g(G2);
            } else {
                return;
            }
        }
    }

    public final void h1() {
        this.k0 = (this.f0 == 1 || !c1()) ? this.j0 : !this.j0;
    }

    public final int i1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (H() == 0 || i == 0) {
            return 0;
        }
        P0();
        this.g0.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        l1(i2, abs, true, a0Var);
        c cVar = this.g0;
        int Q0 = Q0(vVar, cVar, a0Var, false) + cVar.g;
        if (Q0 < 0) {
            return 0;
        }
        if (abs > Q0) {
            i = i2 * Q0;
        }
        this.h0.p(-i);
        this.g0.j = i;
        return i;
    }

    public final void j1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(k6.a("invalid orientation:", i));
        }
        m(null);
        if (i != this.f0 || this.h0 == null) {
            t a2 = t.a(this, i);
            this.h0 = a2;
            this.q0.a = a2;
            this.f0 = i;
            u0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0292  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View focusedChild;
        boolean z;
        boolean z2;
        int k;
        View focusedChild2;
        View X0;
        boolean z3;
        int k2;
        boolean z4;
        int i;
        int k3;
        int i2;
        int g;
        int i3;
        boolean z5;
        boolean z6;
        int k4;
        int e;
        int i4;
        boolean z7;
        int i5;
        int i6;
        boolean z8;
        int i7;
        int i8;
        List<RecyclerView.d0> list;
        boolean z9;
        char c2;
        int i9;
        int i10;
        int Y0;
        int i11;
        View B;
        int e2;
        int i12;
        boolean z10;
        if ((this.p0 != null || this.n0 != -1) && a0Var.b() == 0) {
            q0(vVar);
            return;
        }
        d dVar = this.p0;
        if (dVar != null) {
            int i13 = dVar.P;
            if (i13 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.n0 = i13;
            }
        }
        P0();
        this.g0.a = false;
        h1();
        RecyclerView recyclerView = this.Q;
        if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.P.k(focusedChild)) {
            focusedChild = null;
        }
        a aVar = this.q0;
        if (aVar.e && this.n0 == -1 && this.p0 == null) {
            if (focusedChild != null && (this.h0.e(focusedChild) >= this.h0.g() || this.h0.b(focusedChild) <= this.h0.k())) {
                this.q0.b(focusedChild, RecyclerView.o.M(focusedChild));
            }
        } else {
            aVar.c();
            a aVar2 = this.q0;
            aVar2.d = this.k0 ^ this.l0;
            if (!a0Var.g && (i = this.n0) != -1) {
                if (i >= 0 && i < a0Var.b()) {
                    int i14 = this.n0;
                    aVar2.b = i14;
                    d dVar2 = this.p0;
                    if (dVar2 != null) {
                        if (dVar2.P >= 0) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (z7) {
                            boolean z11 = dVar2.R;
                            aVar2.d = z11;
                            if (z11) {
                                g = this.h0.g();
                                i3 = this.p0.Q;
                                i4 = g - i3;
                                aVar2.c = i4;
                                z = true;
                                if (!z) {
                                    if (H() != 0) {
                                        RecyclerView recyclerView2 = this.Q;
                                        if (recyclerView2 == null || (focusedChild2 = recyclerView2.getFocusedChild()) == null || this.P.k(focusedChild2)) {
                                            focusedChild2 = null;
                                        }
                                        if (focusedChild2 != null) {
                                            RecyclerView.p pVar = (RecyclerView.p) focusedChild2.getLayoutParams();
                                            if (!pVar.d() && pVar.a() >= 0 && pVar.a() < a0Var.b()) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            if (z4) {
                                                aVar2.b(focusedChild2, RecyclerView.o.M(focusedChild2));
                                                z2 = true;
                                                if (!z2) {
                                                    if (aVar2.d) {
                                                        k = aVar2.a.g();
                                                    } else {
                                                        k = aVar2.a.k();
                                                    }
                                                    aVar2.c = k;
                                                    aVar2.b = this.l0 ? a0Var.b() - 1 : 0;
                                                }
                                            }
                                        }
                                        if (this.i0 == this.l0) {
                                            if (aVar2.d) {
                                                if (this.k0) {
                                                    X0 = X0(vVar, a0Var, 0, H(), a0Var.b());
                                                } else {
                                                    X0 = X0(vVar, a0Var, H() - 1, -1, a0Var.b());
                                                }
                                            } else if (this.k0) {
                                                X0 = X0(vVar, a0Var, H() - 1, -1, a0Var.b());
                                            } else {
                                                X0 = X0(vVar, a0Var, 0, H(), a0Var.b());
                                            }
                                            if (X0 != null) {
                                                aVar2.a(X0, RecyclerView.o.M(X0));
                                                if (!a0Var.g && I0()) {
                                                    if (this.h0.e(X0) < this.h0.g() && this.h0.b(X0) >= this.h0.k()) {
                                                        z3 = false;
                                                    } else {
                                                        z3 = true;
                                                    }
                                                    if (z3) {
                                                        if (aVar2.d) {
                                                            k2 = this.h0.g();
                                                        } else {
                                                            k2 = this.h0.k();
                                                        }
                                                        aVar2.c = k2;
                                                    }
                                                }
                                                z2 = true;
                                                if (!z2) {
                                                }
                                            }
                                        }
                                    }
                                    z2 = false;
                                    if (!z2) {
                                    }
                                }
                                this.q0.e = true;
                            } else {
                                k3 = this.h0.k();
                                i2 = this.p0.Q;
                                i4 = k3 + i2;
                                aVar2.c = i4;
                                z = true;
                                if (!z) {
                                }
                                this.q0.e = true;
                            }
                        }
                    }
                    if (this.o0 == Integer.MIN_VALUE) {
                        View B2 = B(i14);
                        if (B2 != null) {
                            if (this.h0.c(B2) <= this.h0.l()) {
                                if (this.h0.e(B2) - this.h0.k() < 0) {
                                    aVar2.c = this.h0.k();
                                    aVar2.d = false;
                                } else if (this.h0.g() - this.h0.b(B2) < 0) {
                                    aVar2.c = this.h0.g();
                                    aVar2.d = true;
                                } else {
                                    if (aVar2.d) {
                                        e = this.h0.m() + this.h0.b(B2);
                                    } else {
                                        e = this.h0.e(B2);
                                    }
                                    aVar2.c = e;
                                }
                                z = true;
                                if (!z) {
                                }
                                this.q0.e = true;
                            }
                        } else if (H() > 0) {
                            if (this.n0 < RecyclerView.o.M(G(0))) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (z5 == this.k0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            aVar2.d = z6;
                        }
                        if (aVar2.d) {
                            k4 = aVar2.a.g();
                        } else {
                            k4 = aVar2.a.k();
                        }
                        aVar2.c = k4;
                        z = true;
                        if (!z) {
                        }
                        this.q0.e = true;
                    } else {
                        boolean z12 = this.k0;
                        aVar2.d = z12;
                        if (z12) {
                            g = this.h0.g();
                            i3 = this.o0;
                            i4 = g - i3;
                            aVar2.c = i4;
                            z = true;
                            if (!z) {
                            }
                            this.q0.e = true;
                        } else {
                            k3 = this.h0.k();
                            i2 = this.o0;
                            i4 = k3 + i2;
                            aVar2.c = i4;
                            z = true;
                            if (!z) {
                            }
                            this.q0.e = true;
                        }
                    }
                } else {
                    this.n0 = -1;
                    this.o0 = RecyclerView.UNDEFINED_DURATION;
                }
            }
            z = false;
            if (!z) {
            }
            this.q0.e = true;
        }
        c cVar = this.g0;
        if (cVar.j >= 0) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        cVar.f = i5;
        int[] iArr = this.t0;
        iArr[0] = 0;
        iArr[1] = 0;
        J0(a0Var, iArr);
        int k5 = this.h0.k() + Math.max(0, this.t0[0]);
        int h = this.h0.h() + Math.max(0, this.t0[1]);
        if (a0Var.g && (i11 = this.n0) != -1 && this.o0 != Integer.MIN_VALUE && (B = B(i11)) != null) {
            if (this.k0) {
                i12 = this.h0.g() - this.h0.b(B);
                e2 = this.o0;
            } else {
                e2 = this.h0.e(B) - this.h0.k();
                i12 = this.o0;
            }
            int i15 = i12 - e2;
            if (i15 > 0) {
                k5 += i15;
            } else {
                h -= i15;
            }
        }
        a aVar3 = this.q0;
        if (!aVar3.d ? this.k0 : !this.k0) {
            i6 = -1;
        } else {
            i6 = 1;
        }
        e1(vVar, a0Var, aVar3, i6);
        A(vVar);
        c cVar2 = this.g0;
        if (this.h0.i() == 0 && this.h0.f() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        cVar2.l = z8;
        this.g0.getClass();
        this.g0.i = 0;
        a aVar4 = this.q0;
        if (aVar4.d) {
            n1(aVar4.b, aVar4.c);
            c cVar3 = this.g0;
            cVar3.h = k5;
            Q0(vVar, cVar3, a0Var, false);
            c cVar4 = this.g0;
            i8 = cVar4.b;
            int i16 = cVar4.d;
            int i17 = cVar4.c;
            if (i17 > 0) {
                h += i17;
            }
            a aVar5 = this.q0;
            m1(aVar5.b, aVar5.c);
            c cVar5 = this.g0;
            cVar5.h = h;
            cVar5.d += cVar5.e;
            Q0(vVar, cVar5, a0Var, false);
            c cVar6 = this.g0;
            i7 = cVar6.b;
            int i18 = cVar6.c;
            if (i18 > 0) {
                n1(i16, i8);
                c cVar7 = this.g0;
                cVar7.h = i18;
                Q0(vVar, cVar7, a0Var, false);
                i8 = this.g0.b;
            }
        } else {
            m1(aVar4.b, aVar4.c);
            c cVar8 = this.g0;
            cVar8.h = h;
            Q0(vVar, cVar8, a0Var, false);
            c cVar9 = this.g0;
            i7 = cVar9.b;
            int i19 = cVar9.d;
            int i20 = cVar9.c;
            if (i20 > 0) {
                k5 += i20;
            }
            a aVar6 = this.q0;
            n1(aVar6.b, aVar6.c);
            c cVar10 = this.g0;
            cVar10.h = k5;
            cVar10.d += cVar10.e;
            Q0(vVar, cVar10, a0Var, false);
            c cVar11 = this.g0;
            i8 = cVar11.b;
            int i21 = cVar11.c;
            if (i21 > 0) {
                m1(i19, i7);
                c cVar12 = this.g0;
                cVar12.h = i21;
                Q0(vVar, cVar12, a0Var, false);
                i7 = this.g0.b;
            }
        }
        if (H() > 0) {
            if (this.k0 ^ this.l0) {
                int Y02 = Y0(i7, vVar, a0Var, true);
                i9 = i8 + Y02;
                i10 = i7 + Y02;
                Y0 = Z0(i9, vVar, a0Var, false);
            } else {
                int Z0 = Z0(i8, vVar, a0Var, true);
                i9 = i8 + Z0;
                i10 = i7 + Z0;
                Y0 = Y0(i10, vVar, a0Var, false);
            }
            i8 = i9 + Y0;
            i7 = i10 + Y0;
        }
        if (a0Var.k && H() != 0 && !a0Var.g && I0()) {
            List<RecyclerView.d0> list2 = vVar.d;
            int size = list2.size();
            int M = RecyclerView.o.M(G(0));
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < size; i24++) {
                RecyclerView.d0 d0Var = list2.get(i24);
                if (!d0Var.s()) {
                    if (d0Var.d() < M) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 != this.k0) {
                        c2 = 65535;
                    } else {
                        c2 = 1;
                    }
                    int c3 = this.h0.c(d0Var.P);
                    if (c2 == 65535) {
                        i22 += c3;
                    } else {
                        i23 += c3;
                    }
                }
            }
            this.g0.k = list2;
            if (i22 > 0) {
                n1(RecyclerView.o.M(b1()), i8);
                c cVar13 = this.g0;
                cVar13.h = i22;
                cVar13.c = 0;
                cVar13.a(null);
                Q0(vVar, this.g0, a0Var, false);
            }
            if (i23 > 0) {
                m1(RecyclerView.o.M(a1()), i7);
                c cVar14 = this.g0;
                cVar14.h = i23;
                cVar14.c = 0;
                list = null;
                cVar14.a(null);
                Q0(vVar, this.g0, a0Var, false);
            } else {
                list = null;
            }
            this.g0.k = list;
        }
        if (!a0Var.g) {
            t tVar = this.h0;
            tVar.b = tVar.l();
        } else {
            this.q0.c();
        }
        this.i0 = this.l0;
    }

    public void k1(boolean z) {
        m(null);
        if (this.l0 == z) {
            return;
        }
        this.l0 = z;
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l0(RecyclerView.a0 a0Var) {
        this.p0 = null;
        this.n0 = -1;
        this.o0 = RecyclerView.UNDEFINED_DURATION;
        this.q0.c();
    }

    public final void l1(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        boolean z2;
        int i3;
        int k;
        c cVar = this.g0;
        boolean z3 = false;
        int i4 = 1;
        if (this.h0.i() == 0 && this.h0.f() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        cVar.l = z2;
        this.g0.f = i;
        int[] iArr = this.t0;
        iArr[0] = 0;
        iArr[1] = 0;
        J0(a0Var, iArr);
        int max = Math.max(0, this.t0[0]);
        int max2 = Math.max(0, this.t0[1]);
        if (i == 1) {
            z3 = true;
        }
        c cVar2 = this.g0;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        cVar2.h = i3;
        if (!z3) {
            max = max2;
        }
        cVar2.i = max;
        if (z3) {
            cVar2.h = this.h0.h() + i3;
            View a1 = a1();
            c cVar3 = this.g0;
            if (this.k0) {
                i4 = -1;
            }
            cVar3.e = i4;
            int M = RecyclerView.o.M(a1);
            c cVar4 = this.g0;
            cVar3.d = M + cVar4.e;
            cVar4.b = this.h0.b(a1);
            k = this.h0.b(a1) - this.h0.g();
        } else {
            View b1 = b1();
            c cVar5 = this.g0;
            cVar5.h = this.h0.k() + cVar5.h;
            c cVar6 = this.g0;
            if (!this.k0) {
                i4 = -1;
            }
            cVar6.e = i4;
            int M2 = RecyclerView.o.M(b1);
            c cVar7 = this.g0;
            cVar6.d = M2 + cVar7.e;
            cVar7.b = this.h0.e(b1);
            k = (-this.h0.e(b1)) + this.h0.k();
        }
        c cVar8 = this.g0;
        cVar8.c = i2;
        if (z) {
            cVar8.c = i2 - k;
        }
        cVar8.g = k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m(String str) {
        if (this.p0 == null) {
            super.m(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.p0 = (d) parcelable;
            u0();
        }
    }

    public final void m1(int i, int i2) {
        this.g0.c = this.h0.g() - i2;
        c cVar = this.g0;
        cVar.e = this.k0 ? -1 : 1;
        cVar.d = i;
        cVar.f = 1;
        cVar.b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable n0() {
        d dVar = this.p0;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (H() > 0) {
            P0();
            boolean z = this.i0 ^ this.k0;
            dVar2.R = z;
            if (z) {
                View a1 = a1();
                dVar2.Q = this.h0.g() - this.h0.b(a1);
                dVar2.P = RecyclerView.o.M(a1);
            } else {
                View b1 = b1();
                dVar2.P = RecyclerView.o.M(b1);
                dVar2.Q = this.h0.e(b1) - this.h0.k();
            }
        } else {
            dVar2.P = -1;
        }
        return dVar2;
    }

    public final void n1(int i, int i2) {
        this.g0.c = i2 - this.h0.k();
        c cVar = this.g0;
        cVar.d = i;
        cVar.e = this.k0 ? 1 : -1;
        cVar.f = -1;
        cVar.b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean o() {
        return this.f0 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean p() {
        return this.f0 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void s(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.f0 != 0) {
            i = i2;
        }
        if (H() == 0 || i == 0) {
            return;
        }
        P0();
        l1(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        K0(a0Var, this.g0, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        d dVar = this.p0;
        int i4 = -1;
        if (dVar != null) {
            i2 = dVar.P;
            if (i2 >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z = dVar.R;
                if (!z) {
                    i4 = 1;
                }
                for (i3 = 0; i3 < this.s0 && i2 >= 0 && i2 < i; i3++) {
                    ((m.b) cVar).a(i2, 0);
                    i2 += i4;
                }
                return;
            }
        }
        h1();
        z = this.k0;
        i2 = this.n0;
        if (i2 == -1) {
            i2 = z ? i - 1 : 0;
        }
        if (!z) {
        }
        while (i3 < this.s0) {
            ((m.b) cVar).a(i2, 0);
            i2 += i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int u(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f0 == 1) {
            return 0;
        }
        return i1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void w0(int i) {
        this.n0 = i;
        this.o0 = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.p0;
        if (dVar != null) {
            dVar.P = -1;
        }
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int x(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f0 == 0) {
            return 0;
        }
        return i1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f0 = 1;
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.m0 = true;
        this.n0 = -1;
        this.o0 = RecyclerView.UNDEFINED_DURATION;
        this.p0 = null;
        this.q0 = new a();
        this.r0 = new b();
        this.s0 = 2;
        this.t0 = new int[2];
        RecyclerView.o.d N = RecyclerView.o.N(context, attributeSet, i, i2);
        j1(N.a);
        boolean z = N.c;
        m(null);
        if (z != this.j0) {
            this.j0 = z;
            u0();
        }
        k1(N.d);
    }
}