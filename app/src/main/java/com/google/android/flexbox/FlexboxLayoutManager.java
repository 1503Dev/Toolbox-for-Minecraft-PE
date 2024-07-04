package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.r;
import androidx.recyclerview.widget.s;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import java.util.List;

public class FlexboxLayoutManager extends RecyclerView.o implements gq, RecyclerView.z.b {
    public static final Rect D0 = new Rect();
    public View A0;
    public int f0;
    public int g0;
    public int h0;
    public boolean j0;
    public boolean k0;
    public RecyclerView.v n0;
    public RecyclerView.a0 o0;
    public c p0;
    public t r0;
    public t s0;
    public d t0;
    public final Context z0;
    public int i0 = -1;
    public List<iq> l0 = new ArrayList();
    public final com.google.android.flexbox.a m0 = new com.google.android.flexbox.a(this);
    public a q0 = new a();
    public int u0 = -1;
    public int v0 = RecyclerView.UNDEFINED_DURATION;
    public int w0 = RecyclerView.UNDEFINED_DURATION;
    public int x0 = RecyclerView.UNDEFINED_DURATION;
    public SparseArray<View> y0 = new SparseArray<>();
    public int B0 = -1;
    public a.C0020a C0 = new a.C0020a();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a {
        public int a;
        public int b;
        public int c;
        public int d = 0;
        public boolean e;
        public boolean f;
        public boolean g;

        public a() {
        }

        public static void a(a aVar) {
            int k;
            FlexboxLayoutManager flexboxLayoutManager;
            if (!FlexboxLayoutManager.this.j()) {
                flexboxLayoutManager = FlexboxLayoutManager.this;
                if (flexboxLayoutManager.j0) {
                    if (!aVar.e) {
                        k = flexboxLayoutManager.d0 - flexboxLayoutManager.r0.k();
                        aVar.c = k;
                    }
                    k = flexboxLayoutManager.r0.g();
                    aVar.c = k;
                }
            }
            if (aVar.e) {
                flexboxLayoutManager = FlexboxLayoutManager.this;
                k = flexboxLayoutManager.r0.g();
                aVar.c = k;
            }
            k = FlexboxLayoutManager.this.r0.k();
            aVar.c = k;
        }

        public static void b(a aVar) {
            FlexboxLayoutManager flexboxLayoutManager;
            int i;
            FlexboxLayoutManager flexboxLayoutManager2;
            int i2;
            aVar.a = -1;
            aVar.b = -1;
            aVar.c = RecyclerView.UNDEFINED_DURATION;
            boolean z = false;
            aVar.f = false;
            aVar.g = false;
            if (!FlexboxLayoutManager.this.j() ? !((i = (flexboxLayoutManager = FlexboxLayoutManager.this).g0) != 0 ? i != 2 : flexboxLayoutManager.f0 != 3) : !((i2 = (flexboxLayoutManager2 = FlexboxLayoutManager.this).g0) != 0 ? i2 != 2 : flexboxLayoutManager2.f0 != 1)) {
                z = true;
            }
            aVar.e = z;
        }

        public final String toString() {
            StringBuilder b = e5.b("AnchorInfo{mPosition=");
            b.append(this.a);
            b.append(", mFlexLinePosition=");
            b.append(this.b);
            b.append(", mCoordinate=");
            b.append(this.c);
            b.append(", mPerpendicularCoordinate=");
            b.append(this.d);
            b.append(", mLayoutFromEnd=");
            b.append(this.e);
            b.append(", mValid=");
            b.append(this.f);
            b.append(", mAssignedFromSavedState=");
            b.append(this.g);
            b.append('}');
            return b.toString();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b extends RecyclerView.p implements hq {
        public static final Parcelable.Creator<b> CREATOR = new a();
        public float T;
        public float U;
        public int V;
        public float W;
        public int X;
        public int Y;
        public int Z;
        public int a0;
        public boolean b0;

        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i) {
                return new b[i];
            }
        }

        public b() {
            super(-2, -2);
            this.T = 0.0f;
            this.U = 1.0f;
            this.V = -1;
            this.W = -1.0f;
            this.Z = 16777215;
            this.a0 = 16777215;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.T = 0.0f;
            this.U = 1.0f;
            this.V = -1;
            this.W = -1.0f;
            this.Z = 16777215;
            this.a0 = 16777215;
        }

        public b(Parcel parcel) {
            super(-2, -2);
            this.T = 0.0f;
            this.U = 1.0f;
            this.V = -1;
            this.W = -1.0f;
            this.Z = 16777215;
            this.a0 = 16777215;
            this.T = parcel.readFloat();
            this.U = parcel.readFloat();
            this.V = parcel.readInt();
            this.W = parcel.readFloat();
            this.X = parcel.readInt();
            this.Y = parcel.readInt();
            this.Z = parcel.readInt();
            this.a0 = parcel.readInt();
            this.b0 = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // defpackage.hq
        public final int D() {
            return this.Z;
        }

        @Override // defpackage.hq
        public final int E() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // defpackage.hq
        public final void e(int i) {
            this.Y = i;
        }

        @Override // defpackage.hq
        public final float f() {
            return this.T;
        }

        @Override // defpackage.hq
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // defpackage.hq
        public final int getOrder() {
            return 1;
        }

        @Override // defpackage.hq
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // defpackage.hq
        public final float k() {
            return this.W;
        }

        @Override // defpackage.hq
        public final int l() {
            return this.V;
        }

        @Override // defpackage.hq
        public final float m() {
            return this.U;
        }

        @Override // defpackage.hq
        public final int o() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // defpackage.hq
        public final int q() {
            return this.Y;
        }

        @Override // defpackage.hq
        public final int r() {
            return this.X;
        }

        @Override // defpackage.hq
        public final boolean s() {
            return this.b0;
        }

        @Override // defpackage.hq
        public final int t() {
            return this.a0;
        }

        @Override // defpackage.hq
        public final void u(int i) {
            this.X = i;
        }

        @Override // defpackage.hq
        public final int v() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.T);
            parcel.writeFloat(this.U);
            parcel.writeInt(this.V);
            parcel.writeFloat(this.W);
            parcel.writeInt(this.X);
            parcel.writeInt(this.Y);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.a0);
            parcel.writeByte(this.b0 ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // defpackage.hq
        public final int y() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public int a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h = 1;
        public int i = 1;
        public boolean j;

        public final String toString() {
            StringBuilder b = e5.b("LayoutState{mAvailable=");
            b.append(this.a);
            b.append(", mFlexLinePosition=");
            b.append(this.c);
            b.append(", mPosition=");
            b.append(this.d);
            b.append(", mOffset=");
            b.append(this.e);
            b.append(", mScrollingOffset=");
            b.append(this.f);
            b.append(", mLastScrollDelta=");
            b.append(this.g);
            b.append(", mItemDirection=");
            b.append(this.h);
            b.append(", mLayoutDirection=");
            b.append(this.i);
            b.append('}');
            return b.toString();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int P;
        public int Q;

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
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder b = e5.b("SavedState{mAnchorPosition=");
            b.append(this.P);
            b.append(", mAnchorOffset=");
            b.append(this.Q);
            b.append('}');
            return b.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
        }

        public d(d dVar) {
            this.P = dVar.P;
            this.Q = dVar.Q;
        }
    }

    public FlexboxLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        int i3;
        RecyclerView.o.d N = RecyclerView.o.N(context, attributeSet, i, i2);
        int i4 = N.a;
        if (i4 != 0) {
            if (i4 == 1) {
                if (N.c) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
                Z0(i3);
            }
        } else if (N.c) {
            Z0(1);
        } else {
            i3 = 0;
            Z0(i3);
        }
        int i5 = this.g0;
        if (i5 != 1) {
            if (i5 == 0) {
                p0();
                this.l0.clear();
                a.b(this.q0);
                this.q0.d = 0;
            }
            this.g0 = 1;
            this.r0 = null;
            this.s0 = null;
            u0();
        }
        if (this.h0 != 4) {
            p0();
            this.l0.clear();
            a.b(this.q0);
            this.q0.d = 0;
            this.h0 = 4;
            u0();
        }
        this.W = true;
        this.z0 = context;
    }

    public static boolean T(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean a1(View view, int i, int i2, b bVar) {
        if (!view.isLayoutRequested() && this.X && T(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) bVar).width) && T(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) bVar).height)) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p C() {
        return new b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p D(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void G0(RecyclerView recyclerView, int i) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i;
        H0(oVar);
    }

    public final int J0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        M0();
        View O0 = O0(b2);
        View Q0 = Q0(b2);
        if (a0Var.b() == 0 || O0 == null || Q0 == null) {
            return 0;
        }
        return Math.min(this.r0.l(), this.r0.b(Q0) - this.r0.e(O0));
    }

    public final int K0(RecyclerView.a0 a0Var) {
        if (H() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        View O0 = O0(b2);
        View Q0 = Q0(b2);
        if (a0Var.b() != 0 && O0 != null && Q0 != null) {
            int M = RecyclerView.o.M(O0);
            int M2 = RecyclerView.o.M(Q0);
            int abs = Math.abs(this.r0.b(Q0) - this.r0.e(O0));
            int[] iArr = this.m0.c;
            int i = iArr[M];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[M2] - i) + 1))) + (this.r0.k() - this.r0.e(O0)));
            }
        }
        return 0;
    }

    public final int L0(RecyclerView.a0 a0Var) {
        int M;
        if (H() == 0) {
            return 0;
        }
        int b2 = a0Var.b();
        View O0 = O0(b2);
        View Q0 = Q0(b2);
        if (a0Var.b() == 0 || O0 == null || Q0 == null) {
            return 0;
        }
        View S0 = S0(0, H());
        int i = -1;
        if (S0 == null) {
            M = -1;
        } else {
            M = RecyclerView.o.M(S0);
        }
        View S02 = S0(H() - 1, -1);
        if (S02 != null) {
            i = RecyclerView.o.M(S02);
        }
        return (int) ((Math.abs(this.r0.b(Q0) - this.r0.e(O0)) / ((i - M) + 1)) * a0Var.b());
    }

    public final void M0() {
        t sVar;
        if (this.r0 != null) {
            return;
        }
        if (j()) {
            if (this.g0 == 0) {
                this.r0 = new r(this);
                sVar = new s(this);
            } else {
                this.r0 = new s(this);
                sVar = new r(this);
            }
        } else if (this.g0 == 0) {
            this.r0 = new s(this);
            sVar = new r(this);
        } else {
            this.r0 = new r(this);
            sVar = new s(this);
        }
        this.s0 = sVar;
    }

    public final int N0(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        iq iqVar;
        b bVar;
        int i6;
        com.google.android.flexbox.a aVar;
        int round;
        int measuredWidth;
        int measuredHeight;
        int i7;
        int i8;
        int i9;
        int i10;
        com.google.android.flexbox.a aVar2;
        int i11;
        int i12;
        int i13;
        int measuredHeight2;
        int i14;
        int i15;
        int i16;
        b bVar2;
        int round2;
        int i17;
        com.google.android.flexbox.a aVar3;
        int measuredHeight3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = cVar.f;
        if (i22 != Integer.MIN_VALUE) {
            int i23 = cVar.a;
            if (i23 < 0) {
                cVar.f = i22 + i23;
            }
            Y0(vVar, cVar);
        }
        int i24 = cVar.a;
        boolean j = j();
        int i25 = i24;
        int i26 = 0;
        while (true) {
            if (i25 <= 0 && !this.p0.b) {
                break;
            }
            List<iq> list = this.l0;
            int i27 = cVar.d;
            int i28 = 1;
            if (i27 >= 0 && i27 < a0Var.b() && (i21 = cVar.c) >= 0 && i21 < list.size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                break;
            }
            iq iqVar2 = this.l0.get(cVar.c);
            cVar.d = iqVar2.o;
            if (j()) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int i29 = this.d0;
                int i30 = cVar.e;
                if (cVar.i == -1) {
                    i30 -= iqVar2.g;
                }
                int i31 = cVar.d;
                float f2 = i29 - paddingRight;
                float f3 = this.q0.d;
                float f4 = paddingLeft - f3;
                float f5 = f2 - f3;
                float max = Math.max(0.0f, 0.0f);
                int i32 = iqVar2.h;
                int i33 = i31;
                int i34 = 0;
                while (i33 < i31 + i32) {
                    View b2 = b(i33);
                    if (b2 == null) {
                        i20 = i30;
                        i14 = i31;
                        i15 = i25;
                        i16 = i26;
                        i17 = i33;
                        i19 = i32;
                    } else {
                        i14 = i31;
                        if (cVar.i == i28) {
                            n(b2, D0);
                            l(-1, b2, false);
                        } else {
                            n(b2, D0);
                            int i35 = i34;
                            l(i35, b2, false);
                            i34 = i35 + 1;
                        }
                        i15 = i25;
                        i16 = i26;
                        long j2 = this.m0.d[i33];
                        int i36 = (int) j2;
                        int i37 = (int) (j2 >> 32);
                        if (a1(b2, i36, i37, (b) b2.getLayoutParams())) {
                            b2.measure(i36, i37);
                        }
                        float L = f4 + RecyclerView.o.L(b2) + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin;
                        float O = f5 - (RecyclerView.o.O(b2) + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin);
                        int Q = RecyclerView.o.Q(b2) + i30;
                        if (this.j0) {
                            com.google.android.flexbox.a aVar4 = this.m0;
                            round2 = Math.round(O) - b2.getMeasuredWidth();
                            i18 = Math.round(O);
                            measuredHeight3 = b2.getMeasuredHeight() + Q;
                            i17 = i33;
                            aVar3 = aVar4;
                        } else {
                            com.google.android.flexbox.a aVar5 = this.m0;
                            round2 = Math.round(L);
                            int measuredWidth2 = b2.getMeasuredWidth() + Math.round(L);
                            i17 = i33;
                            aVar3 = aVar5;
                            measuredHeight3 = b2.getMeasuredHeight() + Q;
                            i18 = measuredWidth2;
                        }
                        i19 = i32;
                        i20 = i30;
                        aVar3.o(b2, iqVar2, round2, Q, i18, measuredHeight3);
                        f5 = O - ((RecyclerView.o.L(b2) + (b2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin)) + max);
                        f4 = RecyclerView.o.O(b2) + b2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin + max + L;
                    }
                    i33 = i17 + 1;
                    i25 = i15;
                    i31 = i14;
                    i26 = i16;
                    i32 = i19;
                    i30 = i20;
                    i28 = 1;
                }
                i = i25;
                i2 = i26;
                cVar.c += this.p0.i;
                i5 = iqVar2.g;
                i4 = i24;
            } else {
                i = i25;
                i2 = i26;
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int i38 = this.e0;
                int i39 = cVar.e;
                if (cVar.i == -1) {
                    int i40 = iqVar2.g;
                    i3 = i39 + i40;
                    i39 -= i40;
                } else {
                    i3 = i39;
                }
                int i41 = cVar.d;
                float f6 = i38 - paddingBottom;
                float f7 = this.q0.d;
                float f8 = paddingTop - f7;
                float f9 = f6 - f7;
                float max2 = Math.max(0.0f, 0.0f);
                int i42 = iqVar2.h;
                int i43 = i41;
                int i44 = 0;
                while (i43 < i41 + i42) {
                    View b3 = b(i43);
                    if (b3 == null) {
                        i6 = i24;
                        f = max2;
                        iqVar = iqVar2;
                        i11 = i43;
                        i12 = i42;
                        i13 = i41;
                    } else {
                        int i45 = i42;
                        f = max2;
                        iqVar = iqVar2;
                        long j3 = this.m0.d[i43];
                        int i46 = (int) j3;
                        int i47 = (int) (j3 >> 32);
                        if (a1(b3, i46, i47, (b) b3.getLayoutParams())) {
                            b3.measure(i46, i47);
                        }
                        float Q2 = f8 + RecyclerView.o.Q(b3) + ((ViewGroup.MarginLayoutParams) bVar).topMargin;
                        float F = f9 - (RecyclerView.o.F(b3) + ((ViewGroup.MarginLayoutParams) bVar).rightMargin);
                        if (cVar.i == 1) {
                            n(b3, D0);
                            i6 = i24;
                            l(-1, b3, false);
                        } else {
                            i6 = i24;
                            n(b3, D0);
                            l(i44, b3, false);
                            i44++;
                        }
                        int i48 = i44;
                        int L2 = RecyclerView.o.L(b3) + i39;
                        int O2 = i3 - RecyclerView.o.O(b3);
                        boolean z2 = this.j0;
                        if (z2) {
                            if (this.k0) {
                                aVar2 = this.m0;
                                i10 = O2 - b3.getMeasuredWidth();
                                i9 = Math.round(F) - b3.getMeasuredHeight();
                                measuredHeight2 = Math.round(F);
                            } else {
                                aVar2 = this.m0;
                                i10 = O2 - b3.getMeasuredWidth();
                                i9 = Math.round(Q2);
                                measuredHeight2 = b3.getMeasuredHeight() + Math.round(Q2);
                            }
                            i7 = measuredHeight2;
                            i8 = O2;
                        } else {
                            if (this.k0) {
                                aVar = this.m0;
                                round = Math.round(F) - b3.getMeasuredHeight();
                                measuredWidth = b3.getMeasuredWidth() + L2;
                                measuredHeight = Math.round(F);
                            } else {
                                aVar = this.m0;
                                round = Math.round(Q2);
                                measuredWidth = b3.getMeasuredWidth() + L2;
                                measuredHeight = b3.getMeasuredHeight() + Math.round(Q2);
                            }
                            i7 = measuredHeight;
                            i8 = measuredWidth;
                            i9 = round;
                            i10 = L2;
                            aVar2 = aVar;
                        }
                        i11 = i43;
                        i12 = i45;
                        i13 = i41;
                        aVar2.p(b3, iqVar, z2, i10, i9, i8, i7);
                        f9 = F - ((RecyclerView.o.Q(b3) + (b3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin)) + f);
                        f8 = RecyclerView.o.F(b3) + b3.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) bVar).topMargin + f + Q2;
                        i44 = i48;
                    }
                    i43 = i11 + 1;
                    i24 = i6;
                    iqVar2 = iqVar;
                    max2 = f;
                    i42 = i12;
                    i41 = i13;
                }
                i4 = i24;
                cVar.c += this.p0.i;
                i5 = iqVar2.g;
            }
            i26 = i2 + i5;
            if (!j && this.j0) {
                cVar.e -= iqVar2.g * cVar.i;
            } else {
                cVar.e = (iqVar2.g * cVar.i) + cVar.e;
            }
            i25 = i - iqVar2.g;
            i24 = i4;
        }
        int i49 = i24;
        int i50 = i26;
        int i51 = cVar.a - i50;
        cVar.a = i51;
        int i52 = cVar.f;
        if (i52 != Integer.MIN_VALUE) {
            int i53 = i52 + i50;
            cVar.f = i53;
            if (i51 < 0) {
                cVar.f = i53 + i51;
            }
            Y0(vVar, cVar);
        }
        return i49 - cVar.a;
    }

    public final View O0(int i) {
        View T0 = T0(0, H(), i);
        if (T0 == null) {
            return null;
        }
        int i2 = this.m0.c[RecyclerView.o.M(T0)];
        if (i2 == -1) {
            return null;
        }
        return P0(T0, this.l0.get(i2));
    }

    public final View P0(View view, iq iqVar) {
        boolean j = j();
        int i = iqVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View G = G(i2);
            if (G != null && G.getVisibility() != 8) {
                if (!this.j0 || j) {
                    if (this.r0.e(view) <= this.r0.e(G)) {
                    }
                    view = G;
                } else {
                    if (this.r0.b(view) >= this.r0.b(G)) {
                    }
                    view = G;
                }
            }
        }
        return view;
    }

    public final View Q0(int i) {
        View T0 = T0(H() - 1, -1, i);
        if (T0 == null) {
            return null;
        }
        return R0(T0, this.l0.get(this.m0.c[RecyclerView.o.M(T0)]));
    }

    public final View R0(View view, iq iqVar) {
        boolean j = j();
        int H = (H() - iqVar.h) - 1;
        for (int H2 = H() - 2; H2 > H; H2--) {
            View G = G(H2);
            if (G != null && G.getVisibility() != 8) {
                if (!this.j0 || j) {
                    if (this.r0.b(view) >= this.r0.b(G)) {
                    }
                    view = G;
                } else {
                    if (this.r0.e(view) <= this.r0.e(G)) {
                    }
                    view = G;
                }
            }
        }
        return view;
    }

    public final View S0(int i, int i2) {
        int i3;
        boolean z;
        boolean z2;
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View G = G(i);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingRight = this.d0 - getPaddingRight();
            int paddingBottom = this.e0 - getPaddingBottom();
            int left = (G.getLeft() - RecyclerView.o.L(G)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) G.getLayoutParams())).leftMargin;
            int top = (G.getTop() - RecyclerView.o.Q(G)) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) G.getLayoutParams())).topMargin;
            int O = RecyclerView.o.O(G) + G.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) G.getLayoutParams())).rightMargin;
            int F = RecyclerView.o.F(G) + G.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) G.getLayoutParams())).bottomMargin;
            boolean z3 = false;
            if (left < paddingRight && O < paddingLeft) {
                z = false;
            } else {
                z = true;
            }
            if (top < paddingBottom && F < paddingTop) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z && z2) {
                z3 = true;
            }
            if (z3) {
                return G;
            }
            i += i3;
        }
        return null;
    }

    public final View T0(int i, int i2, int i3) {
        int i4;
        M0();
        if (this.p0 == null) {
            this.p0 = new c();
        }
        int k = this.r0.k();
        int g = this.r0.g();
        if (i2 > i) {
            i4 = 1;
        } else {
            i4 = -1;
        }
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
                } else if (this.r0.e(G) >= k && this.r0.b(G) <= g) {
                    return G;
                } else {
                    if (view == null) {
                        view = G;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            return view2;
        }
        return view;
    }

    public final int U0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int g;
        if (!j() && this.j0) {
            int k = i - this.r0.k();
            if (k <= 0) {
                return 0;
            }
            i2 = W0(k, vVar, a0Var);
        } else {
            int g2 = this.r0.g() - i;
            if (g2 <= 0) {
                return 0;
            }
            i2 = -W0(-g2, vVar, a0Var);
        }
        int i3 = i + i2;
        if (!z || (g = this.r0.g() - i3) <= 0) {
            return i2;
        }
        this.r0.p(g);
        return g + i2;
    }

    public final int V0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int k;
        if (j() || !this.j0) {
            int k2 = i - this.r0.k();
            if (k2 <= 0) {
                return 0;
            }
            i2 = -W0(k2, vVar, a0Var);
        } else {
            int g = this.r0.g() - i;
            if (g <= 0) {
                return 0;
            }
            i2 = W0(-g, vVar, a0Var);
        }
        int i3 = i + i2;
        if (!z || (k = i3 - this.r0.k()) <= 0) {
            return i2;
        }
        this.r0.p(-k);
        return i2 - k;
    }

    public final int W0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        boolean z;
        int i2;
        boolean z2;
        int i3;
        int i4;
        c cVar;
        int b2;
        if (H() == 0 || i == 0) {
            return 0;
        }
        M0();
        this.p0.j = true;
        if (!j() && this.j0) {
            z = true;
        } else {
            z = false;
        }
        if (!z ? i > 0 : i < 0) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        int abs = Math.abs(i);
        this.p0.i = i2;
        boolean j = j();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d0, this.b0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.e0, this.c0);
        if (!j && this.j0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i2 == 1) {
            View G = G(H() - 1);
            this.p0.e = this.r0.b(G);
            int M = RecyclerView.o.M(G);
            View R0 = R0(G, this.l0.get(this.m0.c[M]));
            c cVar2 = this.p0;
            cVar2.h = 1;
            int i5 = M + 1;
            cVar2.d = i5;
            int[] iArr = this.m0.c;
            if (iArr.length <= i5) {
                cVar2.c = -1;
            } else {
                cVar2.c = iArr[i5];
            }
            if (z2) {
                cVar2.e = this.r0.e(R0);
                this.p0.f = this.r0.k() + (-this.r0.e(R0));
                cVar = this.p0;
                b2 = cVar.f;
                if (b2 < 0) {
                    b2 = 0;
                }
            } else {
                cVar2.e = this.r0.b(R0);
                cVar = this.p0;
                b2 = this.r0.b(R0) - this.r0.g();
            }
            cVar.f = b2;
            int i6 = this.p0.c;
            if ((i6 == -1 || i6 > this.l0.size() - 1) && this.p0.d <= getFlexItemCount()) {
                c cVar3 = this.p0;
                int i7 = abs - cVar3.f;
                a.C0020a c0020a = this.C0;
                c0020a.a = null;
                c0020a.b = 0;
                if (i7 > 0) {
                    com.google.android.flexbox.a aVar = this.m0;
                    if (j) {
                        aVar.b(c0020a, makeMeasureSpec, makeMeasureSpec2, i7, cVar3.d, -1, this.l0);
                    } else {
                        aVar.b(c0020a, makeMeasureSpec2, makeMeasureSpec, i7, cVar3.d, -1, this.l0);
                    }
                    this.m0.h(makeMeasureSpec, makeMeasureSpec2, this.p0.d);
                    this.m0.u(this.p0.d);
                }
            }
        } else {
            View G2 = G(0);
            this.p0.e = this.r0.e(G2);
            int M2 = RecyclerView.o.M(G2);
            View P0 = P0(G2, this.l0.get(this.m0.c[M2]));
            c cVar4 = this.p0;
            cVar4.h = 1;
            int i8 = this.m0.c[M2];
            if (i8 == -1) {
                i8 = 0;
            }
            if (i8 > 0) {
                this.p0.d = M2 - this.l0.get(i8 - 1).h;
            } else {
                cVar4.d = -1;
            }
            c cVar5 = this.p0;
            if (i8 > 0) {
                i3 = i8 - 1;
            } else {
                i3 = 0;
            }
            cVar5.c = i3;
            t tVar = this.r0;
            if (z2) {
                cVar5.e = tVar.b(P0);
                this.p0.f = this.r0.b(P0) - this.r0.g();
                c cVar6 = this.p0;
                int i9 = cVar6.f;
                if (i9 < 0) {
                    i9 = 0;
                }
                cVar6.f = i9;
            } else {
                cVar5.e = tVar.e(P0);
                this.p0.f = this.r0.k() + (-this.r0.e(P0));
            }
        }
        c cVar7 = this.p0;
        int i10 = cVar7.f;
        cVar7.a = abs - i10;
        int N0 = N0(vVar, a0Var, cVar7) + i10;
        if (N0 < 0) {
            return 0;
        }
        if (z) {
            if (abs > N0) {
                i4 = (-i2) * N0;
            }
            i4 = i;
        } else {
            if (abs > N0) {
                i4 = i2 * N0;
            }
            i4 = i;
        }
        this.r0.p(-i4);
        this.p0.g = i4;
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void X() {
        p0();
    }

    public final int X0(int i) {
        int height;
        int i2;
        int i3;
        boolean z = false;
        if (H() == 0 || i == 0) {
            return 0;
        }
        M0();
        boolean j = j();
        View view = this.A0;
        if (j) {
            height = view.getWidth();
        } else {
            height = view.getHeight();
        }
        if (j) {
            i2 = this.d0;
        } else {
            i2 = this.e0;
        }
        if (K() == 1) {
            z = true;
        }
        if (z) {
            int abs = Math.abs(i);
            if (i < 0) {
                return -Math.min((i2 + this.q0.d) - height, abs);
            }
            i3 = this.q0.d;
            if (i3 + i <= 0) {
                return i;
            }
        } else if (i > 0) {
            return Math.min((i2 - this.q0.d) - height, i);
        } else {
            i3 = this.q0.d;
            if (i3 + i >= 0) {
                return i;
            }
        }
        return -i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Y(RecyclerView recyclerView) {
        this.A0 = (View) recyclerView.getParent();
    }

    public final void Y0(RecyclerView.v vVar, c cVar) {
        int H;
        boolean z;
        boolean z2;
        if (!cVar.j) {
            return;
        }
        int i = -1;
        if (cVar.i == -1) {
            if (cVar.f >= 0) {
                this.r0.f();
                int H2 = H();
                if (H2 != 0) {
                    int i2 = H2 - 1;
                    int i3 = this.m0.c[RecyclerView.o.M(G(i2))];
                    if (i3 != -1) {
                        iq iqVar = this.l0.get(i3);
                        int i4 = i2;
                        while (true) {
                            if (i4 < 0) {
                                break;
                            }
                            View G = G(i4);
                            int i5 = cVar.f;
                            if (j() || !this.j0 ? this.r0.e(G) >= this.r0.f() - i5 : this.r0.b(G) <= i5) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            if (iqVar.o == RecyclerView.o.M(G)) {
                                if (i3 <= 0) {
                                    H2 = i4;
                                    break;
                                }
                                i3 += cVar.i;
                                iqVar = this.l0.get(i3);
                                H2 = i4;
                            }
                            i4--;
                        }
                        while (i2 >= H2) {
                            View G2 = G(i2);
                            if (G(i2) != null) {
                                this.P.l(i2);
                            }
                            vVar.g(G2);
                            i2--;
                        }
                    }
                }
            }
        } else if (cVar.f >= 0 && (H = H()) != 0) {
            int i6 = this.m0.c[RecyclerView.o.M(G(0))];
            if (i6 != -1) {
                iq iqVar2 = this.l0.get(i6);
                int i7 = 0;
                while (true) {
                    if (i7 >= H) {
                        break;
                    }
                    View G3 = G(i7);
                    int i8 = cVar.f;
                    if (j() || !this.j0 ? this.r0.b(G3) <= i8 : this.r0.f() - this.r0.e(G3) <= i8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        break;
                    }
                    if (iqVar2.p == RecyclerView.o.M(G3)) {
                        if (i6 >= this.l0.size() - 1) {
                            i = i7;
                            break;
                        }
                        i6 += cVar.i;
                        iqVar2 = this.l0.get(i6);
                        i = i7;
                    }
                    i7++;
                }
                while (i >= 0) {
                    View G4 = G(i);
                    if (G(i) != null) {
                        this.P.l(i);
                    }
                    vVar.g(G4);
                    i--;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void Z(RecyclerView recyclerView) {
    }

    public final void Z0(int i) {
        if (this.f0 != i) {
            p0();
            this.f0 = i;
            this.r0 = null;
            this.s0 = null;
            this.l0.clear();
            a.b(this.q0);
            this.q0.d = 0;
            u0();
        }
    }

    @Override // defpackage.gq
    public final void a(View view, int i, int i2, iq iqVar) {
        int Q;
        int F;
        n(view, D0);
        if (j()) {
            Q = RecyclerView.o.L(view);
            F = RecyclerView.o.O(view);
        } else {
            Q = RecyclerView.o.Q(view);
            F = RecyclerView.o.F(view);
        }
        int i3 = F + Q;
        iqVar.e += i3;
        iqVar.f += i3;
    }

    @Override // defpackage.gq
    public final View b(int i) {
        View view = this.y0.get(i);
        if (view != null) {
            return view;
        }
        return this.n0.j(i, RecyclerView.FOREVER_NS).P;
    }

    public final void b1(int i) {
        int i2 = -1;
        View S0 = S0(H() - 1, -1);
        if (S0 != null) {
            i2 = RecyclerView.o.M(S0);
        }
        if (i >= i2) {
            return;
        }
        int H = H();
        this.m0.j(H);
        this.m0.k(H);
        this.m0.i(H);
        if (i >= this.m0.c.length) {
            return;
        }
        this.B0 = i;
        View G = G(0);
        if (G == null) {
            return;
        }
        this.u0 = RecyclerView.o.M(G);
        if (!j() && this.j0) {
            this.v0 = this.r0.h() + this.r0.b(G);
            return;
        }
        this.v0 = this.r0.e(G) - this.r0.k();
    }

    @Override // defpackage.gq
    public final int c(View view, int i, int i2) {
        int Q;
        int F;
        if (j()) {
            Q = RecyclerView.o.L(view);
            F = RecyclerView.o.O(view);
        } else {
            Q = RecyclerView.o.Q(view);
            F = RecyclerView.o.F(view);
        }
        return F + Q;
    }

    public final void c1(a aVar, boolean z, boolean z2) {
        c cVar;
        int g;
        int i;
        int i2;
        int i3;
        boolean z3 = false;
        if (z2) {
            if (j()) {
                i3 = this.c0;
            } else {
                i3 = this.b0;
            }
            this.p0.b = (i3 == 0 || i3 == Integer.MIN_VALUE) ? true : true;
        } else {
            this.p0.b = false;
        }
        if (!j() && this.j0) {
            cVar = this.p0;
            g = aVar.c;
            i = getPaddingRight();
        } else {
            cVar = this.p0;
            g = this.r0.g();
            i = aVar.c;
        }
        cVar.a = g - i;
        c cVar2 = this.p0;
        cVar2.d = aVar.a;
        cVar2.h = 1;
        cVar2.i = 1;
        cVar2.e = aVar.c;
        cVar2.f = RecyclerView.UNDEFINED_DURATION;
        cVar2.c = aVar.b;
        if (z && this.l0.size() > 1 && (i2 = aVar.b) >= 0 && i2 < this.l0.size() - 1) {
            c cVar3 = this.p0;
            cVar3.c++;
            cVar3.d += this.l0.get(aVar.b).h;
        }
    }

    @Override // defpackage.gq
    public final int d(int i, int i2, int i3) {
        return RecyclerView.o.I(p(), this.e0, this.c0, i2, i3);
    }

    public final void d1(a aVar, boolean z, boolean z2) {
        c cVar;
        int i;
        c cVar2;
        int i2;
        boolean z3 = false;
        if (z2) {
            if (j()) {
                i2 = this.c0;
            } else {
                i2 = this.b0;
            }
            this.p0.b = (i2 == 0 || i2 == Integer.MIN_VALUE) ? true : true;
        } else {
            this.p0.b = false;
        }
        if (!j() && this.j0) {
            cVar = this.p0;
            i = this.A0.getWidth() - aVar.c;
        } else {
            cVar = this.p0;
            i = aVar.c;
        }
        cVar.a = i - this.r0.k();
        c cVar3 = this.p0;
        cVar3.d = aVar.a;
        cVar3.h = 1;
        cVar3.i = -1;
        cVar3.e = aVar.c;
        cVar3.f = RecyclerView.UNDEFINED_DURATION;
        int i3 = aVar.b;
        cVar3.c = i3;
        if (z && i3 > 0) {
            int size = this.l0.size();
            int i4 = aVar.b;
            if (size > i4) {
                cVar2.c--;
                this.p0.d -= this.l0.get(i4).h;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public final PointF e(int i) {
        if (H() == 0) {
            return null;
        }
        int i2 = i < RecyclerView.o.M(G(0)) ? -1 : 1;
        return j() ? new PointF(0.0f, i2) : new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void e0(int i, int i2) {
        b1(i);
    }

    @Override // defpackage.gq
    public final void f(iq iqVar) {
    }

    @Override // defpackage.gq
    public final View g(int i) {
        return b(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void g0(int i, int i2) {
        b1(Math.min(i, i2));
    }

    @Override // defpackage.gq
    public final int getAlignContent() {
        return 5;
    }

    @Override // defpackage.gq
    public final int getAlignItems() {
        return this.h0;
    }

    @Override // defpackage.gq
    public final int getFlexDirection() {
        return this.f0;
    }

    @Override // defpackage.gq
    public final int getFlexItemCount() {
        return this.o0.b();
    }

    @Override // defpackage.gq
    public final List<iq> getFlexLinesInternal() {
        return this.l0;
    }

    @Override // defpackage.gq
    public final int getFlexWrap() {
        return this.g0;
    }

    @Override // defpackage.gq
    public final int getLargestMainSize() {
        if (this.l0.size() == 0) {
            return 0;
        }
        int i = RecyclerView.UNDEFINED_DURATION;
        int size = this.l0.size();
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.l0.get(i2).e);
        }
        return i;
    }

    @Override // defpackage.gq
    public final int getMaxLine() {
        return this.i0;
    }

    @Override // defpackage.gq
    public final int getSumOfCrossSize() {
        int size = this.l0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.l0.get(i2).g;
        }
        return i;
    }

    @Override // defpackage.gq
    public final void h(View view, int i) {
        this.y0.put(i, view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void h0(int i, int i2) {
        b1(i);
    }

    @Override // defpackage.gq
    public final int i(int i, int i2, int i3) {
        return RecyclerView.o.I(o(), this.d0, this.b0, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void i0(int i) {
        b1(i);
    }

    @Override // defpackage.gq
    public final boolean j() {
        int i = this.f0;
        return i == 0 || i == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void j0(RecyclerView recyclerView, int i, int i2) {
        b1(i);
        b1(i);
    }

    @Override // defpackage.gq
    public final int k(View view) {
        int L;
        int O;
        if (j()) {
            L = RecyclerView.o.Q(view);
            O = RecyclerView.o.F(view);
        } else {
            L = RecyclerView.o.L(view);
            O = RecyclerView.o.O(view);
        }
        return O + L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
        if (r20.g0 == 2) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
        if (r20.g0 == 2) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0061, code lost:
        r4 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    @Override // androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        boolean z;
        boolean z2;
        d dVar;
        a aVar;
        boolean z3;
        boolean z4;
        View O0;
        t tVar;
        int e;
        int b2;
        int i;
        int k;
        boolean z5;
        int e2;
        boolean z6;
        a aVar2;
        boolean z7;
        c cVar;
        int i2;
        int i3;
        int i4;
        a.C0020a c0020a;
        int i5;
        List<iq> list;
        com.google.android.flexbox.a aVar3;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        this.n0 = vVar;
        this.o0 = a0Var;
        int b3 = a0Var.b();
        if (b3 == 0 && a0Var.g) {
            return;
        }
        int K = K();
        int i10 = this.f0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        this.j0 = false;
                    } else {
                        if (K == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        this.j0 = z11;
                        if (this.g0 == 2) {
                            this.j0 = !z11;
                        }
                        this.k0 = true;
                        M0();
                        if (this.p0 == null) {
                            this.p0 = new c();
                        }
                        this.m0.j(b3);
                        this.m0.k(b3);
                        this.m0.i(b3);
                        this.p0.j = false;
                        dVar = this.t0;
                        if (dVar != null) {
                            int i11 = dVar.P;
                            if (i11 >= 0 && i11 < b3) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            if (z8) {
                                this.u0 = i11;
                            }
                        }
                        aVar = this.q0;
                        if (aVar.f || this.u0 != -1 || dVar != null) {
                            a.b(aVar);
                            a aVar4 = this.q0;
                            d dVar2 = this.t0;
                            if (!a0Var.g && (i = this.u0) != -1) {
                                if (i < 0 && i < a0Var.b()) {
                                    int i12 = this.u0;
                                    aVar4.a = i12;
                                    aVar4.b = this.m0.c[i12];
                                    d dVar3 = this.t0;
                                    if (dVar3 != null) {
                                        int b4 = a0Var.b();
                                        int i13 = dVar3.P;
                                        if (i13 >= 0 && i13 < b4) {
                                            z6 = true;
                                        } else {
                                            z6 = false;
                                        }
                                        if (z6) {
                                            aVar4.c = this.r0.k() + dVar2.Q;
                                            aVar4.g = true;
                                            aVar4.b = -1;
                                            z3 = true;
                                            if (!z3) {
                                                if (H() != 0) {
                                                    if (aVar4.e) {
                                                        O0 = Q0(a0Var.b());
                                                    } else {
                                                        O0 = O0(a0Var.b());
                                                    }
                                                    if (O0 != null) {
                                                        FlexboxLayoutManager flexboxLayoutManager = FlexboxLayoutManager.this;
                                                        if (flexboxLayoutManager.g0 == 0) {
                                                            tVar = flexboxLayoutManager.s0;
                                                        } else {
                                                            tVar = flexboxLayoutManager.r0;
                                                        }
                                                        if (!flexboxLayoutManager.j() && FlexboxLayoutManager.this.j0) {
                                                            if (aVar4.e) {
                                                                b2 = tVar.e(O0);
                                                                aVar4.c = tVar.m() + b2;
                                                            } else {
                                                                e = tVar.b(O0);
                                                                aVar4.c = e;
                                                            }
                                                        } else if (aVar4.e) {
                                                            b2 = tVar.b(O0);
                                                            aVar4.c = tVar.m() + b2;
                                                        } else {
                                                            e = tVar.e(O0);
                                                            aVar4.c = e;
                                                        }
                                                        FlexboxLayoutManager.this.getClass();
                                                        int M = RecyclerView.o.M(O0);
                                                        aVar4.a = M;
                                                        aVar4.g = false;
                                                        FlexboxLayoutManager flexboxLayoutManager2 = FlexboxLayoutManager.this;
                                                        int[] iArr = flexboxLayoutManager2.m0.c;
                                                        if (M == -1) {
                                                            M = 0;
                                                        }
                                                        int i14 = iArr[M];
                                                        if (i14 == -1) {
                                                            i14 = 0;
                                                        }
                                                        aVar4.b = i14;
                                                        int size = flexboxLayoutManager2.l0.size();
                                                        int i15 = aVar4.b;
                                                        if (size > i15) {
                                                            aVar4.a = FlexboxLayoutManager.this.l0.get(i15).o;
                                                        }
                                                        z4 = true;
                                                        if (!z4) {
                                                            a.a(aVar4);
                                                            aVar4.a = 0;
                                                            aVar4.b = 0;
                                                        }
                                                    }
                                                }
                                                z4 = false;
                                                if (!z4) {
                                                }
                                            }
                                            this.q0.f = true;
                                        }
                                    }
                                    if (this.v0 == Integer.MIN_VALUE) {
                                        View B = B(this.u0);
                                        if (B != null) {
                                            if (this.r0.c(B) <= this.r0.l()) {
                                                if (this.r0.e(B) - this.r0.k() < 0) {
                                                    aVar4.c = this.r0.k();
                                                    aVar4.e = false;
                                                } else if (this.r0.g() - this.r0.b(B) < 0) {
                                                    aVar4.c = this.r0.g();
                                                    aVar4.e = true;
                                                } else {
                                                    if (aVar4.e) {
                                                        e2 = this.r0.m() + this.r0.b(B);
                                                    } else {
                                                        e2 = this.r0.e(B);
                                                    }
                                                    aVar4.c = e2;
                                                }
                                            }
                                        } else if (H() > 0) {
                                            if (this.u0 < RecyclerView.o.M(G(0))) {
                                                z5 = true;
                                            } else {
                                                z5 = false;
                                            }
                                            aVar4.e = z5;
                                        }
                                        a.a(aVar4);
                                    } else {
                                        if (!j() && this.j0) {
                                            k = this.v0 - this.r0.h();
                                        } else {
                                            k = this.r0.k() + this.v0;
                                        }
                                        aVar4.c = k;
                                    }
                                    z3 = true;
                                    if (!z3) {
                                    }
                                    this.q0.f = true;
                                } else {
                                    this.u0 = -1;
                                    this.v0 = RecyclerView.UNDEFINED_DURATION;
                                }
                            }
                            z3 = false;
                            if (!z3) {
                            }
                            this.q0.f = true;
                        }
                        A(vVar);
                        aVar2 = this.q0;
                        if (!aVar2.e) {
                            d1(aVar2, false, true);
                        } else {
                            c1(aVar2, false, true);
                        }
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.d0, this.b0);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.e0, this.c0);
                        int i16 = this.d0;
                        int i17 = this.e0;
                        if (!j()) {
                            int i18 = this.w0;
                            if (i18 != Integer.MIN_VALUE && i18 != i16) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            cVar = this.p0;
                            if (cVar.b) {
                                i2 = this.z0.getResources().getDisplayMetrics().heightPixels;
                            }
                            i2 = cVar.a;
                        } else {
                            int i19 = this.x0;
                            if (i19 != Integer.MIN_VALUE && i19 != i17) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            cVar = this.p0;
                            if (cVar.b) {
                                i2 = this.z0.getResources().getDisplayMetrics().widthPixels;
                            }
                            i2 = cVar.a;
                        }
                        int i20 = i2;
                        this.w0 = i16;
                        this.x0 = i17;
                        i3 = this.B0;
                        if (i3 != -1 && (this.u0 != -1 || z7)) {
                            if (!this.q0.e) {
                                this.l0.clear();
                                a.C0020a c0020a2 = this.C0;
                                c0020a2.a = null;
                                c0020a2.b = 0;
                                boolean j = j();
                                com.google.android.flexbox.a aVar5 = this.m0;
                                a.C0020a c0020a3 = this.C0;
                                if (j) {
                                    aVar5.b(c0020a3, makeMeasureSpec, makeMeasureSpec2, i20, 0, this.q0.a, this.l0);
                                } else {
                                    aVar5.b(c0020a3, makeMeasureSpec2, makeMeasureSpec, i20, 0, this.q0.a, this.l0);
                                }
                                this.l0 = this.C0.a;
                                this.m0.h(makeMeasureSpec, makeMeasureSpec2, 0);
                                this.m0.u(0);
                                a aVar6 = this.q0;
                                int i21 = this.m0.c[aVar6.a];
                                aVar6.b = i21;
                                this.p0.c = i21;
                            }
                        } else {
                            if (i3 == -1) {
                                i4 = Math.min(i3, this.q0.a);
                            } else {
                                i4 = this.q0.a;
                            }
                            a.C0020a c0020a4 = this.C0;
                            c0020a4.a = null;
                            c0020a4.b = 0;
                            if (!j()) {
                                if (this.l0.size() > 0) {
                                    this.m0.d(i4, this.l0);
                                    com.google.android.flexbox.a aVar7 = this.m0;
                                    c0020a = this.C0;
                                    i5 = this.q0.a;
                                    list = this.l0;
                                    aVar3 = aVar7;
                                    i7 = makeMeasureSpec;
                                    i6 = makeMeasureSpec2;
                                    aVar3.b(c0020a, i7, i6, i20, i4, i5, list);
                                    this.l0 = this.C0.a;
                                    this.m0.h(makeMeasureSpec, makeMeasureSpec2, i4);
                                    this.m0.u(i4);
                                } else {
                                    this.m0.i(b3);
                                    this.m0.b(this.C0, makeMeasureSpec, makeMeasureSpec2, i20, 0, -1, this.l0);
                                    this.l0 = this.C0.a;
                                    this.m0.h(makeMeasureSpec, makeMeasureSpec2, i4);
                                    this.m0.u(i4);
                                }
                            } else if (this.l0.size() > 0) {
                                this.m0.d(i4, this.l0);
                                com.google.android.flexbox.a aVar8 = this.m0;
                                c0020a = this.C0;
                                i5 = this.q0.a;
                                list = this.l0;
                                aVar3 = aVar8;
                                i6 = makeMeasureSpec;
                                i7 = makeMeasureSpec2;
                                aVar3.b(c0020a, i7, i6, i20, i4, i5, list);
                                this.l0 = this.C0.a;
                                this.m0.h(makeMeasureSpec, makeMeasureSpec2, i4);
                                this.m0.u(i4);
                            } else {
                                this.m0.i(b3);
                                this.m0.b(this.C0, makeMeasureSpec2, makeMeasureSpec, i20, 0, -1, this.l0);
                                this.l0 = this.C0.a;
                                this.m0.h(makeMeasureSpec, makeMeasureSpec2, i4);
                                this.m0.u(i4);
                            }
                        }
                        if (!this.q0.e) {
                            N0(vVar, a0Var, this.p0);
                            i9 = this.p0.e;
                            c1(this.q0, true, false);
                            N0(vVar, a0Var, this.p0);
                            i8 = this.p0.e;
                        } else {
                            N0(vVar, a0Var, this.p0);
                            i8 = this.p0.e;
                            d1(this.q0, true, false);
                            N0(vVar, a0Var, this.p0);
                            i9 = this.p0.e;
                        }
                        if (H() <= 0) {
                            if (this.q0.e) {
                                V0(U0(i8, vVar, a0Var, true) + i9, vVar, a0Var, false);
                                return;
                            } else {
                                U0(V0(i9, vVar, a0Var, true) + i8, vVar, a0Var, false);
                                return;
                            }
                        }
                        return;
                    }
                } else {
                    if (K == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.j0 = z10;
                    if (this.g0 == 2) {
                        this.j0 = !z10;
                    }
                }
            } else {
                if (K != 1) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.j0 = z9;
            }
            z2 = false;
        } else {
            if (K == 1) {
                z = true;
            } else {
                z = false;
            }
            this.j0 = z;
        }
        this.k0 = z2;
        M0();
        if (this.p0 == null) {
        }
        this.m0.j(b3);
        this.m0.k(b3);
        this.m0.i(b3);
        this.p0.j = false;
        dVar = this.t0;
        if (dVar != null) {
        }
        aVar = this.q0;
        if (aVar.f) {
        }
        a.b(aVar);
        a aVar42 = this.q0;
        d dVar22 = this.t0;
        if (!a0Var.g) {
            if (i < 0) {
            }
            this.u0 = -1;
            this.v0 = RecyclerView.UNDEFINED_DURATION;
        }
        z3 = false;
        if (!z3) {
        }
        this.q0.f = true;
        A(vVar);
        aVar2 = this.q0;
        if (!aVar2.e) {
        }
        int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(this.d0, this.b0);
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(this.e0, this.c0);
        int i162 = this.d0;
        int i172 = this.e0;
        if (!j()) {
        }
        int i202 = i2;
        this.w0 = i162;
        this.x0 = i172;
        i3 = this.B0;
        if (i3 != -1) {
        }
        if (i3 == -1) {
        }
        a.C0020a c0020a42 = this.C0;
        c0020a42.a = null;
        c0020a42.b = 0;
        if (!j()) {
        }
        if (!this.q0.e) {
        }
        if (H() <= 0) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void l0(RecyclerView.a0 a0Var) {
        this.t0 = null;
        this.u0 = -1;
        this.v0 = RecyclerView.UNDEFINED_DURATION;
        this.B0 = -1;
        a.b(this.q0);
        this.y0.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void m0(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.t0 = (d) parcelable;
            u0();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final Parcelable n0() {
        d dVar = this.t0;
        if (dVar != null) {
            return new d(dVar);
        }
        d dVar2 = new d();
        if (H() > 0) {
            View G = G(0);
            dVar2.P = RecyclerView.o.M(G);
            dVar2.Q = this.r0.e(G) - this.r0.k();
        } else {
            dVar2.P = -1;
        }
        return dVar2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean o() {
        int i;
        if (this.g0 == 0) {
            return j();
        }
        if (j()) {
            int i2 = this.d0;
            View view = this.A0;
            if (view != null) {
                i = view.getWidth();
            } else {
                i = 0;
            }
            if (i2 <= i) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean p() {
        int i;
        if (this.g0 == 0) {
            return !j();
        }
        if (j()) {
            return true;
        }
        int i2 = this.e0;
        View view = this.A0;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 0;
        }
        if (i2 > i) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean q(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // defpackage.gq
    public final void setFlexLines(List<iq> list) {
        this.l0 = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int u(RecyclerView.a0 a0Var) {
        return J0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int v(RecyclerView.a0 a0Var) {
        return K0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int v0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (j() && (this.g0 != 0 || !j())) {
            int X0 = X0(i);
            this.q0.d += X0;
            this.s0.p(-X0);
            return X0;
        }
        int W0 = W0(i, vVar, a0Var);
        this.y0.clear();
        return W0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int w(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void w0(int i) {
        this.u0 = i;
        this.v0 = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.t0;
        if (dVar != null) {
            dVar.P = -1;
        }
        u0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int x(RecyclerView.a0 a0Var) {
        return J0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int x0(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (!j() && (this.g0 != 0 || j())) {
            int X0 = X0(i);
            this.q0.d += X0;
            this.s0.p(-X0);
            return X0;
        }
        int W0 = W0(i, vVar, a0Var);
        this.y0.clear();
        return W0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int y(RecyclerView.a0 a0Var) {
        return K0(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int z(RecyclerView.a0 a0Var) {
        return L0(a0Var);
    }
}