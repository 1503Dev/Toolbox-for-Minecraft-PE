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
import defpackage.s0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public int f0;
    public f[] g0;
    public t h0;
    public t i0;
    public int j0;
    public int k0;
    public final n l0;
    public boolean m0;
    public BitSet o0;
    public boolean t0;
    public boolean u0;
    public e v0;
    public int[] z0;
    public boolean n0 = false;
    public int p0 = -1;
    public int q0 = RecyclerView.UNDEFINED_DURATION;
    public d r0 = new d();
    public int s0 = 2;
    public final Rect w0 = new Rect();
    public final b x0 = new b();
    public boolean y0 = true;
    public final a A0 = new a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.K0();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b {
        public int a;
        public int b;
        public boolean c;
        public boolean d;
        public boolean e;
        public int[] f;

        public b() {
            a();
        }

        public final void a() {
            this.a = -1;
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends RecyclerView.p {
        public f T;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public int[] a;
        public List<a> b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0008a();
            public int P;
            public int Q;
            public int[] R;
            public boolean S;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
            public static class C0008a implements Parcelable.Creator<a> {
                @Override // android.os.Parcelable.Creator
                public final a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public final a[] newArray(int i) {
                    return new a[i];
                }
            }

            public a() {
            }

            public a(Parcel parcel) {
                this.P = parcel.readInt();
                this.Q = parcel.readInt();
                this.S = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.R = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder b = e5.b("FullSpanItem{mPosition=");
                b.append(this.P);
                b.append(", mGapDir=");
                b.append(this.Q);
                b.append(", mHasUnwantedGapAfter=");
                b.append(this.S);
                b.append(", mGapPerSpan=");
                b.append(Arrays.toString(this.R));
                b.append('}');
                return b.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.P);
                parcel.writeInt(this.Q);
                parcel.writeInt(this.S ? 1 : 0);
                int[] iArr = this.R;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.R);
            }
        }

        public final void a(int i) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int b(int i) {
            int i2;
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            List<a> list = this.b;
            if (list != null) {
                a aVar = null;
                if (list != null) {
                    int size = list.size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        a aVar2 = this.b.get(size);
                        if (aVar2.P == i) {
                            aVar = aVar2;
                            break;
                        }
                        size--;
                    }
                }
                if (aVar != null) {
                    this.b.remove(aVar);
                }
                int size2 = this.b.size();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (this.b.get(i3).P >= i) {
                            break;
                        }
                        i3++;
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                if (i3 != -1) {
                    this.b.remove(i3);
                    i2 = this.b.get(i3).P;
                    if (i2 != -1) {
                        int[] iArr2 = this.a;
                        Arrays.fill(iArr2, i, iArr2.length, -1);
                        return this.a.length;
                    }
                    int i4 = i2 + 1;
                    Arrays.fill(this.a, i, i4, -1);
                    return i4;
                }
            }
            i2 = -1;
            if (i2 != -1) {
            }
        }

        public final void c(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.a, i, i3, -1);
            List<a> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                int i4 = aVar.P;
                if (i4 >= i) {
                    aVar.P = i4 + i2;
                }
            }
        }

        public final void d(int i, int i2) {
            int[] iArr = this.a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List<a> list = this.b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.b.get(size);
                int i4 = aVar.P;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.b.remove(size);
                    } else {
                        aVar.P = i4 - i2;
                    }
                }
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int P;
        public int Q;
        public int R;
        public int[] S;
        public int T;
        public int[] U;
        public List<d.a> V;
        public boolean W;
        public boolean X;
        public boolean Y;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            public final e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        public e(Parcel parcel) {
            this.P = parcel.readInt();
            this.Q = parcel.readInt();
            int readInt = parcel.readInt();
            this.R = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.S = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.T = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.U = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.W = parcel.readInt() == 1;
            this.X = parcel.readInt() == 1;
            this.Y = parcel.readInt() == 1;
            this.V = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.R = eVar.R;
            this.P = eVar.P;
            this.Q = eVar.Q;
            this.S = eVar.S;
            this.T = eVar.T;
            this.U = eVar.U;
            this.W = eVar.W;
            this.X = eVar.X;
            this.Y = eVar.Y;
            this.V = eVar.V;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R);
            if (this.R > 0) {
                parcel.writeIntArray(this.S);
            }
            parcel.writeInt(this.T);
            if (this.T > 0) {
                parcel.writeIntArray(this.U);
            }
            parcel.writeInt(this.W ? 1 : 0);
            parcel.writeInt(this.X ? 1 : 0);
            parcel.writeInt(this.Y ? 1 : 0);
            parcel.writeList(this.V);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f {
        public ArrayList<View> a = new ArrayList<>();
        public int b = RecyclerView.UNDEFINED_DURATION;
        public int c = RecyclerView.UNDEFINED_DURATION;
        public int d = 0;
        public final int e;

        public f(int i) {
            this.e = i;
        }

        public static c h(View view) {
            return (c) view.getLayoutParams();
        }

        public final void a() {
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c h = h(view);
            this.c = StaggeredGridLayoutManager.this.h0.b(view);
            h.getClass();
        }

        public final void b() {
            this.a.clear();
            this.b = RecyclerView.UNDEFINED_DURATION;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.d = 0;
        }

        public final int c() {
            int i;
            int size;
            if (StaggeredGridLayoutManager.this.m0) {
                i = this.a.size() - 1;
                size = -1;
            } else {
                i = 0;
                size = this.a.size();
            }
            return e(i, size);
        }

        public final int d() {
            int size;
            int i;
            if (StaggeredGridLayoutManager.this.m0) {
                size = 0;
                i = this.a.size();
            } else {
                size = this.a.size() - 1;
                i = -1;
            }
            return e(size, i);
        }

        public final int e(int i, int i2) {
            int k = StaggeredGridLayoutManager.this.h0.k();
            int g = StaggeredGridLayoutManager.this.h0.g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.a.get(i);
                int e = StaggeredGridLayoutManager.this.h0.e(view);
                int b = StaggeredGridLayoutManager.this.h0.b(view);
                boolean z = e <= g;
                boolean z2 = b >= k;
                if (z && z2 && (e < k || b > g)) {
                    StaggeredGridLayoutManager.this.getClass();
                    return RecyclerView.o.M(view);
                }
                i += i3;
            }
            return -1;
        }

        public final int f(int i) {
            int i2 = this.c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            a();
            return this.c;
        }

        public final View g(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    if ((StaggeredGridLayoutManager.this.m0 && RecyclerView.o.M(view2) >= i) || ((!StaggeredGridLayoutManager.this.m0 && RecyclerView.o.M(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.a.get(i3);
                    if ((StaggeredGridLayoutManager.this.m0 && RecyclerView.o.M(view3) <= i) || ((!StaggeredGridLayoutManager.this.m0 && RecyclerView.o.M(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        public final int i(int i) {
            int i2 = this.b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.a.size() == 0) {
                return i;
            }
            View view = this.a.get(0);
            c h = h(view);
            this.b = StaggeredGridLayoutManager.this.h0.e(view);
            h.getClass();
            return this.b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f0 = -1;
        this.m0 = false;
        RecyclerView.o.d N = RecyclerView.o.N(context, attributeSet, i, i2);
        int i3 = N.a;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        m(null);
        if (i3 != this.j0) {
            this.j0 = i3;
            t tVar = this.h0;
            this.h0 = this.i0;
            this.i0 = tVar;
            u0();
        }
        int i4 = N.b;
        m(null);
        if (i4 != this.f0) {
            d dVar = this.r0;
            int[] iArr = dVar.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            dVar.b = null;
            u0();
            this.f0 = i4;
            this.o0 = new BitSet(this.f0);
            this.g0 = new f[this.f0];
            for (int i5 = 0; i5 < this.f0; i5++) {
                this.g0[i5] = new f(i5);
            }
            u0();
        }
        boolean z = N.c;
        m(null);
        e eVar = this.v0;
        if (eVar != null && eVar.W != z) {
            eVar.W = z;
        }
        this.m0 = z;
        u0();
        this.l0 = new n();
        this.h0 = t.a(this, this.j0);
        this.i0 = t.a(this, 1 - this.j0);
    }

    public static int l1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void A0(Rect rect, int i, int i2) {
        int r;
        int r2;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.j0 == 1) {
            int height = rect.height() + paddingBottom;
            RecyclerView recyclerView = this.Q;
            WeakHashMap<View, String> weakHashMap = a41.a;
            r2 = RecyclerView.o.r(i2, height, recyclerView.getMinimumHeight());
            r = RecyclerView.o.r(i, (this.k0 * this.f0) + paddingRight, this.Q.getMinimumWidth());
        } else {
            int width = rect.width() + paddingRight;
            RecyclerView recyclerView2 = this.Q;
            WeakHashMap<View, String> weakHashMap2 = a41.a;
            r = RecyclerView.o.r(i, width, recyclerView2.getMinimumWidth());
            r2 = RecyclerView.o.r(i2, (this.k0 * this.f0) + paddingBottom, this.Q.getMinimumHeight());
        }
        this.Q.setMeasuredDimension(r, r2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p C() {
        return this.j0 == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p E(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void G0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i;
        H0(oVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean I0() {
        return this.v0 == null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int J(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.j0 == 1 ? this.f0 : super.J(vVar, a0Var);
    }

    public final int J0(int i) {
        if (H() == 0) {
            return this.n0 ? 1 : -1;
        }
        return (i < T0()) != this.n0 ? -1 : 1;
    }

    public final boolean K0() {
        int T0;
        if (H() != 0 && this.s0 != 0 && this.V) {
            if (this.n0) {
                T0 = U0();
                T0();
            } else {
                T0 = T0();
                U0();
            }
            if (T0 == 0 && Y0() != null) {
                d dVar = this.r0;
                int[] iArr = dVar.a;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                dVar.b = null;
                this.U = true;
                u0();
                return true;
            }
        }
        return false;
    }

    public final int L0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        return v.a(a0Var, this.h0, Q0(!this.y0), P0(!this.y0), this, this.y0);
    }

    public final int M0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        return v.b(a0Var, this.h0, Q0(!this.y0), P0(!this.y0), this, this.y0, this.n0);
    }

    public final int N0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        return v.c(a0Var, this.h0, Q0(!this.y0), P0(!this.y0), this, this.y0);
    }

    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    public final int O0(RecyclerView.v vVar, n nVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int k;
        boolean z;
        int V0;
        int i3;
        boolean z2;
        f fVar;
        ?? r2;
        int I;
        int I2;
        int i4;
        int c2;
        int k2;
        int c3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        this.o0.set(0, this.f0, true);
        if (this.l0.i) {
            if (nVar.e == 1) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
        } else {
            if (nVar.e == 1) {
                i = nVar.g + nVar.b;
            } else {
                i = nVar.f - nVar.b;
            }
            i2 = i;
        }
        int i11 = nVar.e;
        for (int i12 = 0; i12 < this.f0; i12++) {
            if (!this.g0[i12].a.isEmpty()) {
                k1(this.g0[i12], i11, i2);
            }
        }
        if (this.n0) {
            k = this.h0.g();
        } else {
            k = this.h0.k();
        }
        int i13 = k;
        boolean z3 = false;
        while (true) {
            int i14 = nVar.c;
            if (i14 >= 0 && i14 < a0Var.b()) {
                z = true;
            } else {
                z = false;
            }
            if (!z || (!this.l0.i && this.o0.isEmpty())) {
                break;
            }
            View view = vVar.j(nVar.c, RecyclerView.FOREVER_NS).P;
            nVar.c += nVar.d;
            c cVar = (c) view.getLayoutParams();
            int a2 = cVar.a();
            int[] iArr = this.r0.a;
            if (iArr != null && a2 < iArr.length) {
                i3 = iArr[a2];
            } else {
                i3 = -1;
            }
            if (i3 == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (b1(nVar.e)) {
                    i9 = this.f0 - 1;
                    i8 = -1;
                    i10 = -1;
                } else {
                    i8 = this.f0;
                    i9 = 0;
                    i10 = 1;
                }
                f fVar2 = null;
                if (nVar.e == 1) {
                    int k3 = this.h0.k();
                    int i15 = Integer.MAX_VALUE;
                    while (i9 != i8) {
                        f fVar3 = this.g0[i9];
                        int f2 = fVar3.f(k3);
                        if (f2 < i15) {
                            fVar2 = fVar3;
                            i15 = f2;
                        }
                        i9 += i10;
                    }
                } else {
                    int g = this.h0.g();
                    int i16 = RecyclerView.UNDEFINED_DURATION;
                    while (i9 != i8) {
                        f fVar4 = this.g0[i9];
                        int i17 = fVar4.i(g);
                        if (i17 > i16) {
                            fVar2 = fVar4;
                            i16 = i17;
                        }
                        i9 += i10;
                    }
                }
                fVar = fVar2;
                d dVar = this.r0;
                dVar.a(a2);
                dVar.a[a2] = fVar.e;
            } else {
                fVar = this.g0[i3];
            }
            f fVar5 = fVar;
            cVar.T = fVar5;
            if (nVar.e == 1) {
                r2 = 0;
                l(-1, view, false);
            } else {
                r2 = 0;
                l(0, view, false);
            }
            if (this.j0 == 1) {
                I = RecyclerView.o.I(r2, this.k0, this.b0, r2, ((ViewGroup.MarginLayoutParams) cVar).width);
                I2 = RecyclerView.o.I(true, this.e0, this.c0, getPaddingBottom() + getPaddingTop(), ((ViewGroup.MarginLayoutParams) cVar).height);
            } else {
                I = RecyclerView.o.I(true, this.d0, this.b0, getPaddingRight() + getPaddingLeft(), ((ViewGroup.MarginLayoutParams) cVar).width);
                I2 = RecyclerView.o.I(false, this.k0, this.c0, 0, ((ViewGroup.MarginLayoutParams) cVar).height);
            }
            n(view, this.w0);
            c cVar2 = (c) view.getLayoutParams();
            int i18 = ((ViewGroup.MarginLayoutParams) cVar2).leftMargin;
            Rect rect = this.w0;
            int l1 = l1(I, i18 + rect.left, ((ViewGroup.MarginLayoutParams) cVar2).rightMargin + rect.right);
            int i19 = ((ViewGroup.MarginLayoutParams) cVar2).topMargin;
            Rect rect2 = this.w0;
            int l12 = l1(I2, i19 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar2).bottomMargin + rect2.bottom);
            if (D0(view, l1, l12, cVar2)) {
                view.measure(l1, l12);
            }
            if (nVar.e == 1) {
                c2 = fVar5.f(i13);
                i4 = this.h0.c(view) + c2;
            } else {
                i4 = fVar5.i(i13);
                c2 = i4 - this.h0.c(view);
            }
            int i20 = nVar.e;
            f fVar6 = cVar.T;
            fVar6.getClass();
            if (i20 == 1) {
                c cVar3 = (c) view.getLayoutParams();
                cVar3.T = fVar6;
                fVar6.a.add(view);
                fVar6.c = RecyclerView.UNDEFINED_DURATION;
                if (fVar6.a.size() == 1) {
                    fVar6.b = RecyclerView.UNDEFINED_DURATION;
                }
                if (cVar3.d() || cVar3.c()) {
                    fVar6.d = StaggeredGridLayoutManager.this.h0.c(view) + fVar6.d;
                }
            } else {
                c cVar4 = (c) view.getLayoutParams();
                cVar4.T = fVar6;
                fVar6.a.add(0, view);
                fVar6.b = RecyclerView.UNDEFINED_DURATION;
                if (fVar6.a.size() == 1) {
                    fVar6.c = RecyclerView.UNDEFINED_DURATION;
                }
                if (cVar4.d() || cVar4.c()) {
                    fVar6.d = StaggeredGridLayoutManager.this.h0.c(view) + fVar6.d;
                }
            }
            if (Z0() && this.j0 == 1) {
                c3 = this.i0.g() - (((this.f0 - 1) - fVar5.e) * this.k0);
                k2 = c3 - this.i0.c(view);
            } else {
                k2 = this.i0.k() + (fVar5.e * this.k0);
                c3 = this.i0.c(view) + k2;
            }
            if (this.j0 == 1) {
                i6 = c3;
                i5 = i4;
                i7 = k2;
                k2 = c2;
            } else {
                i5 = c3;
                i6 = i4;
                i7 = c2;
            }
            U(view, i7, k2, i6, i5);
            k1(fVar5, this.l0.e, i2);
            d1(vVar, this.l0);
            if (this.l0.h && view.hasFocusable()) {
                this.o0.set(fVar5.e, false);
            }
            z3 = true;
        }
        if (!z3) {
            d1(vVar, this.l0);
        }
        if (this.l0.e == -1) {
            V0 = this.h0.k() - W0(this.h0.k());
        } else {
            V0 = V0(this.h0.g()) - this.h0.g();
        }
        if (V0 > 0) {
            return Math.min(nVar.b, V0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int P(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.j0 == 0 ? this.f0 : super.P(vVar, a0Var);
    }

    public final View P0(boolean z) {
        int k = this.h0.k();
        int g = this.h0.g();
        View view = null;
        for (int H = H() - 1; H >= 0; H--) {
            View G = G(H);
            int e2 = this.h0.e(G);
            int b2 = this.h0.b(G);
            if (b2 > k && e2 < g) {
                if (b2 <= g || !z) {
                    return G;
                }
                if (view == null) {
                    view = G;
                }
            }
        }
        return view;
    }

    public final View Q0(boolean z) {
        int k = this.h0.k();
        int g = this.h0.g();
        int H = H();
        View view = null;
        for (int i = 0; i < H; i++) {
            View G = G(i);
            int e2 = this.h0.e(G);
            if (this.h0.b(G) > k && e2 < g) {
                if (e2 >= k || !z) {
                    return G;
                }
                if (view == null) {
                    view = G;
                }
            }
        }
        return view;
    }

    public final void R0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int g;
        int V0 = V0(RecyclerView.UNDEFINED_DURATION);
        if (V0 != Integer.MIN_VALUE && (g = this.h0.g() - V0) > 0) {
            int i = g - (-h1(-g, vVar, a0Var));
            if (!z || i <= 0) {
                return;
            }
            this.h0.p(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean S() {
        return this.s0 != 0;
    }

    public final void S0(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int k;
        int W0 = W0(Integer.MAX_VALUE);
        if (W0 != Integer.MAX_VALUE && (k = W0 - this.h0.k()) > 0) {
            int h1 = k - h1(k, vVar, a0Var);
            if (!z || h1 <= 0) {
                return;
            }
            this.h0.p(-h1);
        }
    }

    public final int T0() {
        if (H() == 0) {
            return 0;
        }
        return RecyclerView.o.M(G(0));
    }

    public final int U0() {
        int H = H();
        if (H == 0) {
            return 0;
        }
        return RecyclerView.o.M(G(H - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void V(int i) {
        super.V(i);
        for (int i2 = 0; i2 < this.f0; i2++) {
            f fVar = this.g0[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.c = i4 + i;
            }
        }
    }

    public final int V0(int i) {
        int f2 = this.g0[0].f(i);
        for (int i2 = 1; i2 < this.f0; i2++) {
            int f3 = this.g0[i2].f(i);
            if (f3 > f2) {
                f2 = f3;
            }
        }
        return f2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void W(int i) {
        super.W(i);
        for (int i2 = 0; i2 < this.f0; i2++) {
            f fVar = this.g0[i2];
            int i3 = fVar.b;
            if (i3 != Integer.MIN_VALUE) {
                fVar.b = i3 + i;
            }
            int i4 = fVar.c;
            if (i4 != Integer.MIN_VALUE) {
                fVar.c = i4 + i;
            }
        }
    }

    public final int W0(int i) {
        int i2 = this.g0[0].i(i);
        for (int i3 = 1; i3 < this.f0; i3++) {
            int i4 = this.g0[i3].i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X0(int i, int i2, int i3) {
        int i4;
        int i5;
        int U0 = this.n0 ? U0() : T0();
        if (i3 != 8) {
            i4 = i + i2;
        } else if (i >= i2) {
            i4 = i + 1;
            i5 = i2;
            this.r0.b(i5);
            if (i3 != 1) {
                this.r0.c(i, i2);
            } else if (i3 == 2) {
                this.r0.d(i, i2);
            } else if (i3 == 8) {
                this.r0.d(i, 1);
                this.r0.c(i2, 1);
            }
            if (i4 > U0) {
                return;
            }
            if (i5 <= (this.n0 ? T0() : U0())) {
                u0();
                return;
            }
            return;
        } else {
            i4 = i2 + 1;
        }
        i5 = i;
        this.r0.b(i5);
        if (i3 != 1) {
        }
        if (i4 > U0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View Y0() {
        char c2;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        View view;
        boolean z4;
        int H = H() - 1;
        BitSet bitSet = new BitSet(this.f0);
        bitSet.set(0, this.f0, true);
        int i2 = -1;
        if (this.j0 == 1 && Z0()) {
            c2 = 1;
        } else {
            c2 = 65535;
        }
        if (this.n0) {
            i = -1;
        } else {
            i = H + 1;
            H = 0;
        }
        if (H < i) {
            i2 = 1;
        }
        while (H != i) {
            View G = G(H);
            c cVar = (c) G.getLayoutParams();
            if (bitSet.get(cVar.T.e)) {
                f fVar = cVar.T;
                if (this.n0) {
                    int i3 = fVar.c;
                    if (i3 == Integer.MIN_VALUE) {
                        fVar.a();
                        i3 = fVar.c;
                    }
                    if (i3 < this.h0.g()) {
                        ArrayList<View> arrayList = fVar.a;
                        view = arrayList.get(arrayList.size() - 1);
                        fVar.getClass();
                        f.h(view).getClass();
                        z4 = true;
                    }
                    z4 = false;
                } else {
                    int i4 = fVar.b;
                    if (i4 == Integer.MIN_VALUE) {
                        View view2 = fVar.a.get(0);
                        c h = f.h(view2);
                        fVar.b = StaggeredGridLayoutManager.this.h0.e(view2);
                        h.getClass();
                        i4 = fVar.b;
                    }
                    if (i4 > this.h0.k()) {
                        view = fVar.a.get(0);
                        fVar.getClass();
                        f.h(view).getClass();
                        z4 = true;
                    }
                    z4 = false;
                }
                if (z4) {
                    return G;
                }
                bitSet.clear(cVar.T.e);
            }
            H += i2;
            if (H != i) {
                View G2 = G(H);
                if (this.n0) {
                    int b2 = this.h0.b(G);
                    int b3 = this.h0.b(G2);
                    if (b2 < b3) {
                        return G;
                    }
                } else {
                    int e2 = this.h0.e(G);
                    int e3 = this.h0.e(G2);
                    if (e2 > e3) {
                        return G;
                    }
                }
                if (z) {
                    if (cVar.T.e - ((c) G2.getLayoutParams()).T.e < 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (c2 < 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 != z3) {
                        return G;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Z(RecyclerView recyclerView) {
        a aVar = this.A0;
        RecyclerView recyclerView2 = this.Q;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i = 0; i < this.f0; i++) {
            this.g0[i].b();
        }
        recyclerView.requestLayout();
    }

    public final boolean Z0() {
        return K() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
        if (r8.j0 == 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
        if (r8.j0 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005e, code lost:
        if (Z0() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x006a, code lost:
        if (Z0() == false) goto L115;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View a0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View findContainingItemView;
        int i2;
        int T0;
        boolean z;
        boolean z2;
        int d2;
        int d3;
        int d4;
        if (H() == 0) {
            return null;
        }
        RecyclerView recyclerView = this.Q;
        if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.P.k(findContainingItemView)) {
            findContainingItemView = null;
        }
        if (findContainingItemView == null) {
            return null;
        }
        g1();
        if (i != 1) {
            if (i != 2) {
                if (i != 17) {
                    if (i != 33) {
                        if (i == 66) {
                        }
                    }
                    i2 = RecyclerView.UNDEFINED_DURATION;
                }
            } else {
                if (this.j0 != 1) {
                }
                i2 = 1;
            }
        } else {
            if (this.j0 != 1) {
            }
            i2 = -1;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) findContainingItemView.getLayoutParams();
        cVar.getClass();
        f fVar = cVar.T;
        if (i2 == 1) {
            T0 = U0();
        } else {
            T0 = T0();
        }
        j1(T0, a0Var);
        i1(i2);
        n nVar = this.l0;
        nVar.c = nVar.d + T0;
        nVar.b = (int) (this.h0.l() * 0.33333334f);
        n nVar2 = this.l0;
        nVar2.h = true;
        nVar2.a = false;
        O0(vVar, nVar2, a0Var);
        this.t0 = this.n0;
        View g = fVar.g(T0, i2);
        if (g != null && g != findContainingItemView) {
            return g;
        }
        if (b1(i2)) {
            for (int i3 = this.f0 - 1; i3 >= 0; i3--) {
                View g2 = this.g0[i3].g(T0, i2);
                if (g2 != null && g2 != findContainingItemView) {
                    return g2;
                }
            }
        } else {
            for (int i4 = 0; i4 < this.f0; i4++) {
                View g3 = this.g0[i4].g(T0, i2);
                if (g3 != null && g3 != findContainingItemView) {
                    return g3;
                }
            }
        }
        boolean z3 = !this.m0;
        if (i2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z3 == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            d2 = fVar.c();
        } else {
            d2 = fVar.d();
        }
        View B = B(d2);
        if (B != null && B != findContainingItemView) {
            return B;
        }
        if (b1(i2)) {
            for (int i5 = this.f0 - 1; i5 >= 0; i5--) {
                if (i5 != fVar.e) {
                    f[] fVarArr = this.g0;
                    if (z2) {
                        d4 = fVarArr[i5].c();
                    } else {
                        d4 = fVarArr[i5].d();
                    }
                    View B2 = B(d4);
                    if (B2 != null && B2 != findContainingItemView) {
                        return B2;
                    }
                }
            }
        } else {
            for (int i6 = 0; i6 < this.f0; i6++) {
                f[] fVarArr2 = this.g0;
                if (z2) {
                    d3 = fVarArr2[i6].c();
                } else {
                    d3 = fVarArr2[i6].d();
                }
                View B3 = B(d3);
                if (B3 != null && B3 != findContainingItemView) {
                    return B3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:255:0x040b, code lost:
        if (K0() != false) goto L266;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a1(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        boolean z2;
        boolean z3;
        e eVar;
        int i;
        boolean z4;
        int i2;
        int i3;
        int k;
        boolean z5;
        int k2;
        int T0;
        int g;
        int i4;
        int k3;
        int e2;
        boolean z6;
        int k4;
        b bVar = this.x0;
        if ((this.v0 != null || this.p0 != -1) && a0Var.b() == 0) {
            q0(vVar);
            bVar.a();
            return;
        }
        boolean z7 = true;
        if (bVar.e && this.p0 == -1 && this.v0 == null) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            bVar.a();
            e eVar2 = this.v0;
            if (eVar2 != null) {
                int i5 = eVar2.R;
                if (i5 > 0) {
                    if (i5 == this.f0) {
                        for (int i6 = 0; i6 < this.f0; i6++) {
                            this.g0[i6].b();
                            e eVar3 = this.v0;
                            int i7 = eVar3.S[i6];
                            if (i7 != Integer.MIN_VALUE) {
                                if (eVar3.X) {
                                    k4 = this.h0.g();
                                } else {
                                    k4 = this.h0.k();
                                }
                                i7 += k4;
                            }
                            f fVar = this.g0[i6];
                            fVar.b = i7;
                            fVar.c = i7;
                        }
                    } else {
                        eVar2.S = null;
                        eVar2.R = 0;
                        eVar2.T = 0;
                        eVar2.U = null;
                        eVar2.V = null;
                        eVar2.P = eVar2.Q;
                    }
                }
                e eVar4 = this.v0;
                this.u0 = eVar4.Y;
                boolean z8 = eVar4.W;
                m(null);
                e eVar5 = this.v0;
                if (eVar5 != null && eVar5.W != z8) {
                    eVar5.W = z8;
                }
                this.m0 = z8;
                u0();
                g1();
                e eVar6 = this.v0;
                int i8 = eVar6.P;
                if (i8 != -1) {
                    this.p0 = i8;
                    z6 = eVar6.X;
                } else {
                    z6 = this.n0;
                }
                bVar.c = z6;
                if (eVar6.T > 1) {
                    d dVar = this.r0;
                    dVar.a = eVar6.U;
                    dVar.b = eVar6.V;
                }
            } else {
                g1();
                bVar.c = this.n0;
            }
            if (!a0Var.g && (i3 = this.p0) != -1) {
                if (i3 >= 0 && i3 < a0Var.b()) {
                    e eVar7 = this.v0;
                    if (eVar7 != null && eVar7.P != -1 && eVar7.R >= 1) {
                        bVar.b = RecyclerView.UNDEFINED_DURATION;
                        bVar.a = this.p0;
                    } else {
                        View B = B(this.p0);
                        if (B != null) {
                            if (this.n0) {
                                T0 = U0();
                            } else {
                                T0 = T0();
                            }
                            bVar.a = T0;
                            if (this.q0 != Integer.MIN_VALUE) {
                                if (bVar.c) {
                                    k3 = this.h0.g() - this.q0;
                                    e2 = this.h0.b(B);
                                } else {
                                    k3 = this.h0.k() + this.q0;
                                    e2 = this.h0.e(B);
                                }
                                g = k3 - e2;
                            } else {
                                if (this.h0.c(B) > this.h0.l()) {
                                    if (bVar.c) {
                                        i4 = this.h0.g();
                                    } else {
                                        i4 = this.h0.k();
                                    }
                                } else {
                                    int e3 = this.h0.e(B) - this.h0.k();
                                    if (e3 < 0) {
                                        i4 = -e3;
                                    } else {
                                        g = this.h0.g() - this.h0.b(B);
                                        if (g >= 0) {
                                            bVar.b = RecyclerView.UNDEFINED_DURATION;
                                        }
                                    }
                                }
                                bVar.b = i4;
                            }
                            bVar.b = g;
                        } else {
                            int i9 = this.p0;
                            bVar.a = i9;
                            int i10 = this.q0;
                            if (i10 == Integer.MIN_VALUE) {
                                if (J0(i9) == 1) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                bVar.c = z5;
                                if (z5) {
                                    k2 = StaggeredGridLayoutManager.this.h0.g();
                                } else {
                                    k2 = StaggeredGridLayoutManager.this.h0.k();
                                }
                                bVar.b = k2;
                            } else {
                                if (bVar.c) {
                                    k = StaggeredGridLayoutManager.this.h0.g() - i10;
                                } else {
                                    k = StaggeredGridLayoutManager.this.h0.k() + i10;
                                }
                                bVar.b = k;
                            }
                            bVar.d = true;
                        }
                    }
                    z4 = true;
                    if (!z4) {
                        boolean z9 = this.t0;
                        int b2 = a0Var.b();
                        if (z9) {
                            int H = H();
                            while (true) {
                                H--;
                                if (H < 0) {
                                    break;
                                }
                                i2 = RecyclerView.o.M(G(H));
                                if (i2 >= 0 && i2 < b2) {
                                    break;
                                }
                            }
                            i2 = 0;
                            bVar.a = i2;
                            bVar.b = RecyclerView.UNDEFINED_DURATION;
                        } else {
                            int H2 = H();
                            for (int i11 = 0; i11 < H2; i11++) {
                                int M = RecyclerView.o.M(G(i11));
                                if (M >= 0 && M < b2) {
                                    i2 = M;
                                    break;
                                }
                            }
                            i2 = 0;
                            bVar.a = i2;
                            bVar.b = RecyclerView.UNDEFINED_DURATION;
                        }
                    }
                    bVar.e = true;
                } else {
                    this.p0 = -1;
                    this.q0 = RecyclerView.UNDEFINED_DURATION;
                }
            }
            z4 = false;
            if (!z4) {
            }
            bVar.e = true;
        }
        if (this.v0 == null && this.p0 == -1 && (bVar.c != this.t0 || Z0() != this.u0)) {
            d dVar2 = this.r0;
            int[] iArr = dVar2.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            dVar2.b = null;
            bVar.d = true;
        }
        if (H() > 0 && ((eVar = this.v0) == null || eVar.R < 1)) {
            if (bVar.d) {
                for (int i12 = 0; i12 < this.f0; i12++) {
                    this.g0[i12].b();
                    int i13 = bVar.b;
                    if (i13 != Integer.MIN_VALUE) {
                        f fVar2 = this.g0[i12];
                        fVar2.b = i13;
                        fVar2.c = i13;
                    }
                }
            } else if (!z2 && this.x0.f != null) {
                for (int i14 = 0; i14 < this.f0; i14++) {
                    f fVar3 = this.g0[i14];
                    fVar3.b();
                    int i15 = this.x0.f[i14];
                    fVar3.b = i15;
                    fVar3.c = i15;
                }
            } else {
                for (int i16 = 0; i16 < this.f0; i16++) {
                    f fVar4 = this.g0[i16];
                    boolean z10 = this.n0;
                    int i17 = bVar.b;
                    if (z10) {
                        i = fVar4.f(RecyclerView.UNDEFINED_DURATION);
                    } else {
                        i = fVar4.i(RecyclerView.UNDEFINED_DURATION);
                    }
                    fVar4.b();
                    if (i != Integer.MIN_VALUE && ((!z10 || i >= StaggeredGridLayoutManager.this.h0.g()) && (z10 || i <= StaggeredGridLayoutManager.this.h0.k()))) {
                        if (i17 != Integer.MIN_VALUE) {
                            i += i17;
                        }
                        fVar4.c = i;
                        fVar4.b = i;
                    }
                }
                b bVar2 = this.x0;
                f[] fVarArr = this.g0;
                bVar2.getClass();
                int length = fVarArr.length;
                int[] iArr2 = bVar2.f;
                if (iArr2 == null || iArr2.length < length) {
                    bVar2.f = new int[StaggeredGridLayoutManager.this.g0.length];
                }
                for (int i18 = 0; i18 < length; i18++) {
                    bVar2.f[i18] = fVarArr[i18].i(RecyclerView.UNDEFINED_DURATION);
                }
            }
        }
        A(vVar);
        this.l0.a = false;
        int l = this.i0.l();
        this.k0 = l / this.f0;
        View.MeasureSpec.makeMeasureSpec(l, this.i0.i());
        j1(bVar.a, a0Var);
        if (bVar.c) {
            i1(-1);
            O0(vVar, this.l0, a0Var);
            i1(1);
        } else {
            i1(1);
            O0(vVar, this.l0, a0Var);
            i1(-1);
        }
        n nVar = this.l0;
        nVar.c = bVar.a + nVar.d;
        O0(vVar, nVar, a0Var);
        if (this.i0.i() != 1073741824) {
            float f2 = 0.0f;
            int H3 = H();
            for (int i19 = 0; i19 < H3; i19++) {
                View G = G(i19);
                float c2 = this.i0.c(G);
                if (c2 >= f2) {
                    ((c) G.getLayoutParams()).getClass();
                    f2 = Math.max(f2, c2);
                }
            }
            int i20 = this.k0;
            int round = Math.round(f2 * this.f0);
            if (this.i0.i() == Integer.MIN_VALUE) {
                round = Math.min(round, this.i0.l());
            }
            this.k0 = round / this.f0;
            View.MeasureSpec.makeMeasureSpec(round, this.i0.i());
            if (this.k0 != i20) {
                for (int i21 = 0; i21 < H3; i21++) {
                    View G2 = G(i21);
                    c cVar = (c) G2.getLayoutParams();
                    cVar.getClass();
                    if (Z0() && this.j0 == 1) {
                        int i22 = this.f0;
                        int i23 = cVar.T.e;
                        G2.offsetLeftAndRight(((-((i22 - 1) - i23)) * this.k0) - ((-((i22 - 1) - i23)) * i20));
                    } else {
                        int i24 = cVar.T.e;
                        int i25 = this.j0;
                        int i26 = (this.k0 * i24) - (i24 * i20);
                        if (i25 == 1) {
                            G2.offsetLeftAndRight(i26);
                        } else {
                            G2.offsetTopAndBottom(i26);
                        }
                    }
                }
            }
        }
        if (H() > 0) {
            if (this.n0) {
                R0(vVar, a0Var, true);
                S0(vVar, a0Var, false);
            } else {
                S0(vVar, a0Var, true);
                R0(vVar, a0Var, false);
            }
        }
        if (z && !a0Var.g) {
            if (this.s0 != 0 && H() > 0 && Y0() != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                a aVar = this.A0;
                RecyclerView recyclerView = this.Q;
                if (recyclerView != null) {
                    recyclerView.removeCallbacks(aVar);
                }
            }
        }
        z7 = false;
        if (a0Var.g) {
            this.x0.a();
        }
        this.t0 = bVar.c;
        this.u0 = Z0();
        if (z7) {
            this.x0.a();
            a1(vVar, a0Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void b0(AccessibilityEvent accessibilityEvent) {
        super.b0(accessibilityEvent);
        if (H() > 0) {
            View Q0 = Q0(false);
            View P0 = P0(false);
            if (Q0 == null || P0 == null) {
                return;
            }
            int M = RecyclerView.o.M(Q0);
            int M2 = RecyclerView.o.M(P0);
            if (M < M2) {
                accessibilityEvent.setFromIndex(M);
                accessibilityEvent.setToIndex(M2);
                return;
            }
            accessibilityEvent.setFromIndex(M2);
            accessibilityEvent.setToIndex(M);
        }
    }

    public final boolean b1(int i) {
        if (this.j0 == 0) {
            return (i == -1) != this.n0;
        }
        return ((i == -1) == this.n0) == Z0();
    }

    public final void c1(int i, RecyclerView.a0 a0Var) {
        int T0;
        int i2;
        if (i > 0) {
            T0 = U0();
            i2 = 1;
        } else {
            T0 = T0();
            i2 = -1;
        }
        this.l0.a = true;
        j1(T0, a0Var);
        i1(i2);
        n nVar = this.l0;
        nVar.c = T0 + nVar.d;
        nVar.b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void d0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, s0 s0Var) {
        int i;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            c0(view, s0Var);
            return;
        }
        c cVar = (c) layoutParams;
        int i4 = 1;
        int i5 = -1;
        if (this.j0 == 0) {
            f fVar = cVar.T;
            if (fVar == null) {
                i3 = -1;
            } else {
                i3 = fVar.e;
            }
            i2 = -1;
        } else {
            f fVar2 = cVar.T;
            if (fVar2 == null) {
                i = -1;
            } else {
                i = fVar2.e;
            }
            i2 = i;
            i3 = -1;
            i4 = -1;
            i5 = 1;
        }
        s0Var.i(s0.c.a(i3, i4, i2, i5));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.e == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d1(RecyclerView.v vVar, n nVar) {
        int min;
        int min2;
        if (nVar.a && !nVar.i) {
            if (nVar.b != 0) {
                int i = 1;
                if (nVar.e == -1) {
                    int i2 = nVar.f;
                    int i3 = this.g0[0].i(i2);
                    while (i < this.f0) {
                        int i4 = this.g0[i].i(i2);
                        if (i4 > i3) {
                            i3 = i4;
                        }
                        i++;
                    }
                    int i5 = i2 - i3;
                    if (i5 >= 0) {
                        min2 = nVar.g - Math.min(i5, nVar.b);
                        e1(min2, vVar);
                        return;
                    }
                    min2 = nVar.g;
                    e1(min2, vVar);
                    return;
                }
                int i6 = nVar.g;
                int f2 = this.g0[0].f(i6);
                while (i < this.f0) {
                    int f3 = this.g0[i].f(i6);
                    if (f3 < f2) {
                        f2 = f3;
                    }
                    i++;
                }
                int i7 = f2 - nVar.g;
                if (i7 >= 0) {
                    min = Math.min(i7, nVar.b) + nVar.f;
                    f1(min, vVar);
                }
                min = nVar.f;
                f1(min, vVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF e(int i) {
        int J0 = J0(i);
        PointF pointF = new PointF();
        if (J0 == 0) {
            return null;
        }
        if (this.j0 == 0) {
            pointF.x = J0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = J0;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i, int i2) {
        X0(i, i2, 1);
    }

    public final void e1(int i, RecyclerView.v vVar) {
        for (int H = H() - 1; H >= 0; H--) {
            View G = G(H);
            if (this.h0.e(G) >= i && this.h0.o(G) >= i) {
                c cVar = (c) G.getLayoutParams();
                cVar.getClass();
                if (cVar.T.a.size() == 1) {
                    return;
                }
                f fVar = cVar.T;
                int size = fVar.a.size();
                View remove = fVar.a.remove(size - 1);
                c h = f.h(remove);
                h.T = null;
                if (h.d() || h.c()) {
                    fVar.d -= StaggeredGridLayoutManager.this.h0.c(remove);
                }
                if (size == 1) {
                    fVar.b = RecyclerView.UNDEFINED_DURATION;
                }
                fVar.c = RecyclerView.UNDEFINED_DURATION;
                s0(G, vVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void f0() {
        d dVar = this.r0;
        int[] iArr = dVar.a;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        dVar.b = null;
        u0();
    }

    public final void f1(int i, RecyclerView.v vVar) {
        while (H() > 0) {
            View G = G(0);
            if (this.h0.b(G) <= i && this.h0.n(G) <= i) {
                c cVar = (c) G.getLayoutParams();
                cVar.getClass();
                if (cVar.T.a.size() == 1) {
                    return;
                }
                f fVar = cVar.T;
                View remove = fVar.a.remove(0);
                c h = f.h(remove);
                h.T = null;
                if (fVar.a.size() == 0) {
                    fVar.c = RecyclerView.UNDEFINED_DURATION;
                }
                if (h.d() || h.c()) {
                    fVar.d -= StaggeredGridLayoutManager.this.h0.c(remove);
                }
                fVar.b = RecyclerView.UNDEFINED_DURATION;
                s0(G, vVar);
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(int i, int i2) {
        X0(i, i2, 8);
    }

    public final void g1() {
        this.n0 = (this.j0 == 1 || !Z0()) ? this.m0 : !this.m0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(int i, int i2) {
        X0(i, i2, 2);
    }

    public final int h1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (H() == 0 || i == 0) {
            return 0;
        }
        c1(i, a0Var);
        int O0 = O0(vVar, this.l0, a0Var);
        if (this.l0.b >= O0) {
            i = i < 0 ? -O0 : O0;
        }
        this.h0.p(-i);
        this.t0 = this.n0;
        n nVar = this.l0;
        nVar.b = 0;
        d1(vVar, nVar);
        return i;
    }

    public final void i1(int i) {
        n nVar = this.l0;
        nVar.e = i;
        nVar.d = this.n0 != (i == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView recyclerView, int i, int i2) {
        X0(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j1(int i, RecyclerView.a0 a0Var) {
        boolean z;
        int i2;
        int i3;
        RecyclerView recyclerView;
        boolean z2;
        int i4;
        boolean z3;
        n nVar = this.l0;
        boolean z4 = false;
        nVar.b = 0;
        nVar.c = i;
        RecyclerView.z zVar = this.T;
        if (zVar != null && zVar.e) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i4 = a0Var.a) != -1) {
            boolean z5 = this.n0;
            if (i4 < i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z5 == z3) {
                i2 = this.h0.l();
            } else {
                i3 = this.h0.l();
                i2 = 0;
                recyclerView = this.Q;
                if (recyclerView == null && recyclerView.mClipToPadding) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    this.l0.f = this.h0.k() - i3;
                    this.l0.g = this.h0.g() + i2;
                } else {
                    this.l0.g = this.h0.f() + i2;
                    this.l0.f = -i3;
                }
                n nVar2 = this.l0;
                nVar2.h = false;
                nVar2.a = true;
                if (this.h0.i() == 0 && this.h0.f() == 0) {
                    z4 = true;
                }
                nVar2.i = z4;
            }
        } else {
            i2 = 0;
        }
        i3 = 0;
        recyclerView = this.Q;
        if (recyclerView == null) {
        }
        z2 = false;
        if (!z2) {
        }
        n nVar22 = this.l0;
        nVar22.h = false;
        nVar22.a = true;
        if (this.h0.i() == 0) {
            z4 = true;
        }
        nVar22.i = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        a1(vVar, a0Var, true);
    }

    public final void k1(f fVar, int i, int i2) {
        int i3 = fVar.d;
        if (i == -1) {
            int i4 = fVar.b;
            if (i4 == Integer.MIN_VALUE) {
                View view = fVar.a.get(0);
                c h = f.h(view);
                fVar.b = StaggeredGridLayoutManager.this.h0.e(view);
                h.getClass();
                i4 = fVar.b;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = fVar.c;
            if (i5 == Integer.MIN_VALUE) {
                fVar.a();
                i5 = fVar.c;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.o0.set(fVar.e, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void l0(RecyclerView.a0 a0Var) {
        this.p0 = -1;
        this.q0 = RecyclerView.UNDEFINED_DURATION;
        this.v0 = null;
        this.x0.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m(String str) {
        if (this.v0 == null) {
            super.m(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m0(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.v0 = (e) parcelable;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable n0() {
        int T0;
        View Q0;
        int i;
        int k;
        int[] iArr;
        e eVar = this.v0;
        if (eVar != null) {
            return new e(eVar);
        }
        e eVar2 = new e();
        eVar2.W = this.m0;
        eVar2.X = this.t0;
        eVar2.Y = this.u0;
        d dVar = this.r0;
        if (dVar != null && (iArr = dVar.a) != null) {
            eVar2.U = iArr;
            eVar2.T = iArr.length;
            eVar2.V = dVar.b;
        } else {
            eVar2.T = 0;
        }
        int i2 = -1;
        if (H() > 0) {
            if (this.t0) {
                T0 = U0();
            } else {
                T0 = T0();
            }
            eVar2.P = T0;
            if (this.n0) {
                Q0 = P0(true);
            } else {
                Q0 = Q0(true);
            }
            if (Q0 != null) {
                i2 = RecyclerView.o.M(Q0);
            }
            eVar2.Q = i2;
            int i3 = this.f0;
            eVar2.R = i3;
            eVar2.S = new int[i3];
            for (int i4 = 0; i4 < this.f0; i4++) {
                if (this.t0) {
                    i = this.g0[i4].f(RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        k = this.h0.g();
                        i -= k;
                        eVar2.S[i4] = i;
                    } else {
                        eVar2.S[i4] = i;
                    }
                } else {
                    i = this.g0[i4].i(RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        k = this.h0.k();
                        i -= k;
                        eVar2.S[i4] = i;
                    } else {
                        eVar2.S[i4] = i;
                    }
                }
            }
        } else {
            eVar2.P = -1;
            eVar2.Q = -1;
            eVar2.R = 0;
        }
        return eVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean o() {
        return this.j0 == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void o0(int i) {
        if (i == 0) {
            K0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean p() {
        return this.j0 == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean q(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void s(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        boolean z;
        int f2;
        int i3;
        if (this.j0 != 0) {
            i = i2;
        }
        if (H() != 0 && i != 0) {
            c1(i, a0Var);
            int[] iArr = this.z0;
            if (iArr == null || iArr.length < this.f0) {
                this.z0 = new int[this.f0];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.f0; i5++) {
                n nVar = this.l0;
                if (nVar.d == -1) {
                    f2 = nVar.f;
                    i3 = this.g0[i5].i(f2);
                } else {
                    f2 = this.g0[i5].f(nVar.g);
                    i3 = this.l0.g;
                }
                int i6 = f2 - i3;
                if (i6 >= 0) {
                    this.z0[i4] = i6;
                    i4++;
                }
            }
            Arrays.sort(this.z0, 0, i4);
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = this.l0.c;
                if (i8 >= 0 && i8 < a0Var.b()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    ((m.b) cVar).a(this.l0.c, this.z0[i7]);
                    n nVar2 = this.l0;
                    nVar2.c += nVar2.d;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int u(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int v(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int v0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int w(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void w0(int i) {
        e eVar = this.v0;
        if (eVar != null && eVar.P != i) {
            eVar.S = null;
            eVar.R = 0;
            eVar.P = -1;
            eVar.Q = -1;
        }
        this.p0 = i;
        this.q0 = RecyclerView.UNDEFINED_DURATION;
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int x(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int x0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.a0 a0Var) {
        return M0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.a0 a0Var) {
        return N0(a0Var);
    }
}