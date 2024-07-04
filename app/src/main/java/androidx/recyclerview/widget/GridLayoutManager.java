package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import defpackage.s0;
import java.util.Arrays;
import java.util.WeakHashMap;

public class GridLayoutManager extends LinearLayoutManager {
    public a A0;
    public final Rect B0;
    public boolean u0;
    public int v0;
    public int[] w0;
    public View[] x0;
    public final SparseIntArray y0;
    public final SparseIntArray z0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static final class a extends c {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends RecyclerView.p {
        public int T;
        public int U;

        public b(int i, int i2) {
            super(i, i2);
            this.T = -1;
            this.U = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.T = -1;
            this.U = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.T = -1;
            this.U = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.T = -1;
            this.U = 0;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();
        public final SparseIntArray b = new SparseIntArray();

        public static int a(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i3++;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = 1;
                }
            }
            return i3 + 1 > i2 ? i4 + 1 : i4;
        }

        public final void b() {
            this.a.clear();
        }
    }

    public GridLayoutManager() {
        super(1);
        this.u0 = false;
        this.v0 = -1;
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new a();
        this.B0 = new Rect();
        u1(10);
    }

    public GridLayoutManager(int i) {
        super(1);
        this.u0 = false;
        this.v0 = -1;
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new a();
        this.B0 = new Rect();
        u1(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.u0 = false;
        this.v0 = -1;
        this.y0 = new SparseIntArray();
        this.z0 = new SparseIntArray();
        this.A0 = new a();
        this.B0 = new Rect();
        u1(RecyclerView.o.N(context, attributeSet, i, i2).b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void A0(Rect rect, int i, int i2) {
        int r;
        int r2;
        if (this.w0 == null) {
            super.A0(rect, i, i2);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f0 == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.Q;
            WeakHashMap<View, String> weakHashMap = a41.a;
            r2 = RecyclerView.o.r(i2, height, recyclerView.getMinimumHeight());
            int[] iArr = this.w0;
            r = RecyclerView.o.r(i, iArr[iArr.length - 1] + paddingRight, this.Q.getMinimumWidth());
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.Q;
            WeakHashMap<View, String> weakHashMap2 = a41.a;
            r = RecyclerView.o.r(i, width, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.w0;
            r2 = RecyclerView.o.r(i2, iArr2[iArr2.length - 1] + paddingBottom, this.Q.getMinimumHeight());
        }
        this.Q.setMeasuredDimension(r, r2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p C() {
        return this.f0 == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean I0() {
        return this.p0 == null && !this.u0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int J(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f0 == 1) {
            return this.v0;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return q1(a0Var.b() - 1, vVar, a0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void K0(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        boolean z;
        int i = this.v0;
        for (int i2 = 0; i2 < this.v0; i2++) {
            int i3 = cVar.d;
            if (i3 >= 0 && i3 < a0Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i > 0) {
                ((m.b) cVar2).a(cVar.d, Math.max(0, cVar.g));
                this.A0.getClass();
                i--;
                cVar.d += cVar.e;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int P(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f0 == 0) {
            return this.v0;
        }
        if (a0Var.b() < 1) {
            return 0;
        }
        return q1(a0Var.b() - 1, vVar, a0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View X0(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        P0();
        int k = this.h0.k();
        int g = this.h0.g();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View G = G(i);
            int M = RecyclerView.o.M(G);
            if (M >= 0 && M < i3 && r1(M, vVar, a0Var) == 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
        if (r13 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010e, code lost:
        if (r13 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0119  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View findContainingItemView;
        boolean z;
        boolean z2;
        int H;
        int i2;
        int i3;
        boolean z3;
        View view2;
        View view3;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        RecyclerView.v vVar2 = vVar;
        RecyclerView.a0 a0Var2 = a0Var;
        RecyclerView recyclerView = this.Q;
        View view4 = null;
        if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.P.k(findContainingItemView)) {
            findContainingItemView = null;
        }
        if (findContainingItemView == null) {
            return null;
        }
        b bVar = (b) findContainingItemView.getLayoutParams();
        int i5 = bVar.T;
        int i6 = bVar.U + i5;
        if (super.a0(view, i, vVar, a0Var) == null) {
            return null;
        }
        if (O0(i) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.k0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i2 = H() - 1;
            H = -1;
            i3 = -1;
        } else {
            H = H();
            i2 = 0;
            i3 = 1;
        }
        if (this.f0 == 1 && c1()) {
            z3 = true;
        } else {
            z3 = false;
        }
        int q1 = q1(i2, vVar2, a0Var2);
        int i7 = i2;
        int i8 = i3;
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = -1;
        View view5 = null;
        while (i7 != H) {
            int i13 = H;
            int q12 = q1(i7, vVar2, a0Var2);
            View G = G(i7);
            if (G == findContainingItemView) {
                break;
            }
            if (G.hasFocusable() && q12 != q1) {
                if (view4 != null) {
                    break;
                }
                view2 = findContainingItemView;
                view3 = view5;
                i4 = i10;
            } else {
                b bVar2 = (b) G.getLayoutParams();
                int i14 = bVar2.T;
                view2 = findContainingItemView;
                int i15 = bVar2.U + i14;
                if (G.hasFocusable() && i14 == i5 && i15 == i6) {
                    return G;
                }
                if ((G.hasFocusable() && view4 == null) || (!G.hasFocusable() && view5 == null)) {
                    view3 = view5;
                } else {
                    view3 = view5;
                    int min = Math.min(i15, i6) - Math.max(i14, i5);
                    if (G.hasFocusable()) {
                        if (min <= i10) {
                            if (min == i10) {
                                if (i14 > i12) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                            }
                        }
                    } else if (view4 == null) {
                        i4 = i10;
                        if (this.R.b(G) && this.S.b(G)) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            if (min <= i11) {
                                if (min == i11) {
                                    if (i14 > i9) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                }
                            }
                            z5 = true;
                            if (z5) {
                                if (G.hasFocusable()) {
                                    int i16 = bVar2.T;
                                    i10 = Math.min(i15, i6) - Math.max(i14, i5);
                                    i12 = i16;
                                    view5 = view3;
                                    view4 = G;
                                } else {
                                    int i17 = bVar2.T;
                                    i11 = Math.min(i15, i6) - Math.max(i14, i5);
                                    i9 = i17;
                                    i10 = i4;
                                    view5 = G;
                                }
                                i7 += i8;
                                vVar2 = vVar;
                                a0Var2 = a0Var;
                                H = i13;
                                findContainingItemView = view2;
                            }
                        }
                        z5 = false;
                        if (z5) {
                        }
                    }
                    i4 = i10;
                    z5 = false;
                    if (z5) {
                    }
                }
                i4 = i10;
                z5 = true;
                if (z5) {
                }
            }
            i10 = i4;
            view5 = view3;
            i7 += i8;
            vVar2 = vVar;
            a0Var2 = a0Var;
            H = i13;
            findContainingItemView = view2;
        }
        View view6 = view5;
        if (view4 == null) {
            return view6;
        }
        return view4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, s0 s0Var) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            c0(view, s0Var);
            return;
        }
        b bVar = (b) layoutParams;
        int q1 = q1(bVar.a(), vVar, a0Var);
        int i3 = 1;
        if (this.f0 == 0) {
            int i4 = bVar.T;
            i3 = bVar.U;
            i2 = 1;
            i = q1;
            q1 = i4;
        } else {
            i = bVar.T;
            i2 = bVar.U;
        }
        s0Var.i(s0.c.a(q1, i3, i, i2));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int I;
        int i17;
        boolean z3;
        View b2;
        int j = this.h0.j();
        if (j != 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (H() > 0) {
            i = this.w0[this.v0];
        } else {
            i = 0;
        }
        if (z) {
            v1();
        }
        if (cVar.e == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i18 = this.v0;
        if (!z2) {
            i18 = r1(cVar.d, vVar, a0Var) + s1(cVar.d, vVar, a0Var);
        }
        int i19 = 0;
        while (i19 < this.v0) {
            int i20 = cVar.d;
            if (i20 >= 0 && i20 < a0Var.b()) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 || i18 <= 0) {
                break;
            }
            int i21 = cVar.d;
            int s1 = s1(i21, vVar, a0Var);
            if (s1 <= this.v0) {
                i18 -= s1;
                if (i18 < 0 || (b2 = cVar.b(vVar)) == null) {
                    break;
                }
                this.x0[i19] = b2;
                i19++;
            } else {
                throw new IllegalArgumentException("Item at position " + i21 + " requires " + s1 + " spans but GridLayoutManager has only " + this.v0 + " spans.");
            }
        }
        if (i19 == 0) {
            bVar.b = true;
            return;
        }
        if (z2) {
            i3 = i19;
            i2 = 0;
            i4 = 0;
            i5 = 1;
        } else {
            i2 = i19 - 1;
            i3 = -1;
            i4 = 0;
            i5 = -1;
        }
        while (i2 != i3) {
            View view = this.x0[i2];
            b bVar2 = (b) view.getLayoutParams();
            int s12 = s1(RecyclerView.o.M(view), vVar, a0Var);
            bVar2.U = s12;
            bVar2.T = i4;
            i4 += s12;
            i2 += i5;
        }
        float f = 0.0f;
        int i22 = 0;
        for (int i23 = 0; i23 < i19; i23++) {
            View view2 = this.x0[i23];
            if (cVar.k == null) {
                if (z2) {
                    l(-1, view2, false);
                } else {
                    l(0, view2, false);
                }
            } else if (z2) {
                l(-1, view2, true);
            } else {
                l(0, view2, true);
            }
            n(view2, this.B0);
            t1(j, view2, false);
            int c2 = this.h0.c(view2);
            if (c2 > i22) {
                i22 = c2;
            }
            float d = (this.h0.d(view2) * 1.0f) / ((b) view2.getLayoutParams()).U;
            if (d > f) {
                f = d;
            }
        }
        if (z) {
            o1(Math.max(Math.round(f * this.v0), i));
            i22 = 0;
            for (int i24 = 0; i24 < i19; i24++) {
                View view3 = this.x0[i24];
                t1(1073741824, view3, true);
                int c3 = this.h0.c(view3);
                if (c3 > i22) {
                    i22 = c3;
                }
            }
        }
        for (int i25 = 0; i25 < i19; i25++) {
            View view4 = this.x0[i25];
            if (this.h0.c(view4) != i22) {
                b bVar3 = (b) view4.getLayoutParams();
                Rect rect = bVar3.Q;
                int i26 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar3).topMargin + ((ViewGroup.MarginLayoutParams) bVar3).bottomMargin;
                int i27 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar3).leftMargin + ((ViewGroup.MarginLayoutParams) bVar3).rightMargin;
                int p1 = p1(bVar3.T, bVar3.U);
                if (this.f0 == 1) {
                    i17 = RecyclerView.o.I(false, p1, 1073741824, i27, ((ViewGroup.MarginLayoutParams) bVar3).width);
                    I = View.MeasureSpec.makeMeasureSpec(i22 - i26, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i22 - i27, 1073741824);
                    I = RecyclerView.o.I(false, p1, 1073741824, i26, ((ViewGroup.MarginLayoutParams) bVar3).height);
                    i17 = makeMeasureSpec;
                }
                if (F0(view4, i17, I, (RecyclerView.p) view4.getLayoutParams())) {
                    view4.measure(i17, I);
                }
            }
        }
        bVar.a = i22;
        if (this.f0 == 1) {
            if (cVar.f == -1) {
                i11 = cVar.b;
                i16 = i11 - i22;
            } else {
                i16 = cVar.b;
                i11 = i22 + i16;
            }
            i9 = i16;
            i10 = 0;
            i8 = 0;
        } else {
            if (cVar.f == -1) {
                i7 = cVar.b;
                i6 = i7 - i22;
            } else {
                i6 = cVar.b;
                i7 = i22 + i6;
            }
            i8 = i6;
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        int i28 = 0;
        while (i28 < i19) {
            View view5 = this.x0[i28];
            b bVar4 = (b) view5.getLayoutParams();
            if (this.f0 == 1) {
                if (c1()) {
                    i10 = getPaddingLeft() + this.w0[this.v0 - bVar4.T];
                    i8 = i10 - this.h0.d(view5);
                } else {
                    int paddingLeft = getPaddingLeft() + this.w0[bVar4.T];
                    i15 = i11;
                    i12 = paddingLeft;
                    i13 = i9;
                    i14 = this.h0.d(view5) + paddingLeft;
                    U(view5, i12, i13, i14, i15);
                    if (!bVar4.d() || bVar4.c()) {
                        bVar.c = true;
                    }
                    bVar.d |= view5.hasFocusable();
                    i28++;
                    i11 = i15;
                    i10 = i14;
                    i9 = i13;
                    i8 = i12;
                }
            } else {
                i9 = this.w0[bVar4.T] + getPaddingTop();
                i11 = this.h0.d(view5) + i9;
            }
            i15 = i11;
            i14 = i10;
            i13 = i9;
            i12 = i8;
            U(view5, i12, i13, i14, i15);
            if (!bVar4.d()) {
            }
            bVar.c = true;
            bVar.d |= view5.hasFocusable();
            i28++;
            i11 = i15;
            i10 = i14;
            i9 = i13;
            i8 = i12;
        }
        Arrays.fill(this.x0, (Object) null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i, int i2) {
        this.A0.b();
        this.A0.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void e1(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z;
        v1();
        if (a0Var.b() > 0 && !a0Var.g) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int r1 = r1(aVar.b, vVar, a0Var);
            if (z) {
                while (r1 > 0) {
                    int i2 = aVar.b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.b = i3;
                    r1 = r1(i3, vVar, a0Var);
                }
            } else {
                int b2 = a0Var.b() - 1;
                int i4 = aVar.b;
                while (i4 < b2) {
                    int i5 = i4 + 1;
                    int r12 = r1(i5, vVar, a0Var);
                    if (r12 <= r1) {
                        break;
                    }
                    i4 = i5;
                    r1 = r12;
                }
                aVar.b = i4;
            }
        }
        View[] viewArr = this.x0;
        if (viewArr == null || viewArr.length != this.v0) {
            this.x0 = new View[this.v0];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        this.A0.b();
        this.A0.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(int i, int i2) {
        this.A0.b();
        this.A0.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(int i, int i2) {
        this.A0.b();
        this.A0.b.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView recyclerView, int i, int i2) {
        this.A0.b();
        this.A0.b.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.g) {
            int H = H();
            for (int i = 0; i < H; i++) {
                b bVar = (b) G(i).getLayoutParams();
                int a2 = bVar.a();
                this.y0.put(a2, bVar.U);
                this.z0.put(a2, bVar.T);
            }
        }
        super.k0(vVar, a0Var);
        this.y0.clear();
        this.z0.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void k1(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.k1(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void l0(RecyclerView.a0 a0Var) {
        super.l0(a0Var);
        this.u0 = false;
    }

    public final void o1(int i) {
        int i2;
        int[] iArr = this.w0;
        int i3 = this.v0;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.w0 = iArr;
    }

    public final int p1(int i, int i2) {
        if (this.f0 != 1 || !c1()) {
            int[] iArr = this.w0;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.w0;
        int i3 = this.v0;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean q(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public final int q1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            a aVar = this.A0;
            int i2 = this.v0;
            aVar.getClass();
            return c.a(i, i2);
        }
        int b2 = vVar.b(i);
        if (b2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
            return 0;
        }
        a aVar2 = this.A0;
        int i3 = this.v0;
        aVar2.getClass();
        return c.a(b2, i3);
    }

    public final int r1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            a aVar = this.A0;
            int i2 = this.v0;
            aVar.getClass();
            return i % i2;
        }
        int i3 = this.z0.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int b2 = vVar.b(i);
        if (b2 == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 0;
        }
        a aVar2 = this.A0;
        int i4 = this.v0;
        aVar2.getClass();
        return b2 % i4;
    }

    public final int s1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!a0Var.g) {
            this.A0.getClass();
            return 1;
        }
        int i2 = this.y0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (vVar.b(i) == -1) {
            Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
            return 1;
        }
        this.A0.getClass();
        return 1;
    }

    public final void t1(int i, View view, boolean z) {
        int i2;
        int i3;
        boolean D0;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.Q;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int p1 = p1(bVar.T, bVar.U);
        if (this.f0 == 1) {
            i3 = RecyclerView.o.I(false, p1, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width);
            i2 = RecyclerView.o.I(true, this.h0.l(), this.c0, i4, ((ViewGroup.MarginLayoutParams) bVar).height);
        } else {
            int I = RecyclerView.o.I(false, p1, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height);
            int I2 = RecyclerView.o.I(true, this.h0.l(), this.b0, i5, ((ViewGroup.MarginLayoutParams) bVar).width);
            i2 = I;
            i3 = I2;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z) {
            D0 = F0(view, i3, i2, pVar);
        } else {
            D0 = D0(view, i3, i2, pVar);
        }
        if (D0) {
            view.measure(i3, i2);
        }
    }

    public final void u1(int i) {
        if (i == this.v0) {
            return;
        }
        this.u0 = true;
        if (i >= 1) {
            this.v0 = i;
            this.A0.b();
            u0();
            return;
        }
        throw new IllegalArgumentException(k6.a("Span count should be at least 1. Provided ", i));
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int v(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int v0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        v1();
        View[] viewArr = this.x0;
        if (viewArr == null || viewArr.length != this.v0) {
            this.x0 = new View[this.v0];
        }
        return super.v0(i, vVar, a0Var);
    }

    public final void v1() {
        int paddingBottom;
        int paddingTop;
        if (this.f0 == 1) {
            paddingBottom = this.d0 - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.e0 - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        o1(paddingBottom - paddingTop);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int w(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int x0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        v1();
        View[] viewArr = this.x0;
        if (viewArr == null || viewArr.length != this.v0) {
            this.x0 = new View[this.v0];
        }
        return super.x0(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }
}