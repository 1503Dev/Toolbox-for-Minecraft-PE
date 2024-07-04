package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.a;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class FlexboxLayout extends ViewGroup implements gq {
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public Drawable V;
    public Drawable W;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public int[] e0;
    public SparseIntArray f0;
    public com.google.android.flexbox.a g0;
    public List<iq> h0;
    public a.C0020a i0;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends ViewGroup.MarginLayoutParams implements hq {
        public static final Parcelable.Creator<a> CREATOR = new C0019a();
        public int P;
        public float Q;
        public float R;
        public int S;
        public float T;
        public int U;
        public int V;
        public int W;
        public int X;
        public boolean Y;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$a$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public static class C0019a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            public final a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.P = 1;
            this.Q = 0.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1.0f;
            this.U = -1;
            this.V = -1;
            this.W = 16777215;
            this.X = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hj0.FlexboxLayout_Layout);
            this.P = obtainStyledAttributes.getInt(hj0.FlexboxLayout_Layout_layout_order, 1);
            this.Q = obtainStyledAttributes.getFloat(hj0.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.R = obtainStyledAttributes.getFloat(hj0.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.S = obtainStyledAttributes.getInt(hj0.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.T = obtainStyledAttributes.getFraction(hj0.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.U = obtainStyledAttributes.getDimensionPixelSize(hj0.FlexboxLayout_Layout_layout_minWidth, -1);
            this.V = obtainStyledAttributes.getDimensionPixelSize(hj0.FlexboxLayout_Layout_layout_minHeight, -1);
            this.W = obtainStyledAttributes.getDimensionPixelSize(hj0.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.X = obtainStyledAttributes.getDimensionPixelSize(hj0.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.Y = obtainStyledAttributes.getBoolean(hj0.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        public a(Parcel parcel) {
            super(0, 0);
            this.P = 1;
            this.Q = 0.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1.0f;
            this.U = -1;
            this.V = -1;
            this.W = 16777215;
            this.X = 16777215;
            this.P = parcel.readInt();
            this.Q = parcel.readFloat();
            this.R = parcel.readFloat();
            this.S = parcel.readInt();
            this.T = parcel.readFloat();
            this.U = parcel.readInt();
            this.V = parcel.readInt();
            this.W = parcel.readInt();
            this.X = parcel.readInt();
            this.Y = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.P = 1;
            this.Q = 0.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1.0f;
            this.U = -1;
            this.V = -1;
            this.W = 16777215;
            this.X = 16777215;
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.P = 1;
            this.Q = 0.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1.0f;
            this.U = -1;
            this.V = -1;
            this.W = 16777215;
            this.X = 16777215;
        }

        public a(a aVar) {
            super((ViewGroup.MarginLayoutParams) aVar);
            this.P = 1;
            this.Q = 0.0f;
            this.R = 1.0f;
            this.S = -1;
            this.T = -1.0f;
            this.U = -1;
            this.V = -1;
            this.W = 16777215;
            this.X = 16777215;
            this.P = aVar.P;
            this.Q = aVar.Q;
            this.R = aVar.R;
            this.S = aVar.S;
            this.T = aVar.T;
            this.U = aVar.U;
            this.V = aVar.V;
            this.W = aVar.W;
            this.X = aVar.X;
            this.Y = aVar.Y;
        }

        @Override // defpackage.hq
        public final int D() {
            return this.W;
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
            this.V = i;
        }

        @Override // defpackage.hq
        public final float f() {
            return this.Q;
        }

        @Override // defpackage.hq
        public final int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // defpackage.hq
        public final int getOrder() {
            return this.P;
        }

        @Override // defpackage.hq
        public final int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // defpackage.hq
        public final float k() {
            return this.T;
        }

        @Override // defpackage.hq
        public final int l() {
            return this.S;
        }

        @Override // defpackage.hq
        public final float m() {
            return this.R;
        }

        @Override // defpackage.hq
        public final int o() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // defpackage.hq
        public final int q() {
            return this.V;
        }

        @Override // defpackage.hq
        public final int r() {
            return this.U;
        }

        @Override // defpackage.hq
        public final boolean s() {
            return this.Y;
        }

        @Override // defpackage.hq
        public final int t() {
            return this.X;
        }

        @Override // defpackage.hq
        public final void u(int i) {
            this.U = i;
        }

        @Override // defpackage.hq
        public final int v() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.P);
            parcel.writeFloat(this.Q);
            parcel.writeFloat(this.R);
            parcel.writeInt(this.S);
            parcel.writeFloat(this.T);
            parcel.writeInt(this.U);
            parcel.writeInt(this.V);
            parcel.writeInt(this.W);
            parcel.writeInt(this.X);
            parcel.writeByte(this.Y ? (byte) 1 : (byte) 0);
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

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.U = -1;
        this.g0 = new com.google.android.flexbox.a(this);
        this.h0 = new ArrayList();
        this.i0 = new a.C0020a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hj0.FlexboxLayout, 0, 0);
        this.P = obtainStyledAttributes.getInt(hj0.FlexboxLayout_flexDirection, 0);
        this.Q = obtainStyledAttributes.getInt(hj0.FlexboxLayout_flexWrap, 0);
        this.R = obtainStyledAttributes.getInt(hj0.FlexboxLayout_justifyContent, 0);
        this.S = obtainStyledAttributes.getInt(hj0.FlexboxLayout_alignItems, 0);
        this.T = obtainStyledAttributes.getInt(hj0.FlexboxLayout_alignContent, 0);
        this.U = obtainStyledAttributes.getInt(hj0.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(hj0.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(hj0.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(hj0.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i = obtainStyledAttributes.getInt(hj0.FlexboxLayout_showDivider, 0);
        if (i != 0) {
            this.b0 = i;
            this.a0 = i;
        }
        int i2 = obtainStyledAttributes.getInt(hj0.FlexboxLayout_showDividerVertical, 0);
        if (i2 != 0) {
            this.b0 = i2;
        }
        int i3 = obtainStyledAttributes.getInt(hj0.FlexboxLayout_showDividerHorizontal, 0);
        if (i3 != 0) {
            this.a0 = i3;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // defpackage.gq
    public final void a(View view, int i, int i2, iq iqVar) {
        int i3;
        int i4;
        if (p(i, i2)) {
            if (j()) {
                i3 = iqVar.e;
                i4 = this.d0;
            } else {
                i3 = iqVar.e;
                i4 = this.c0;
            }
            iqVar.e = i3 + i4;
            iqVar.f += i4;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f0 == null) {
            this.f0 = new SparseIntArray(getChildCount());
        }
        com.google.android.flexbox.a aVar = this.g0;
        SparseIntArray sparseIntArray = this.f0;
        int flexItemCount = aVar.a.getFlexItemCount();
        ArrayList f = aVar.f(flexItemCount);
        a.b bVar = new a.b();
        if (view != null && (layoutParams instanceof hq)) {
            bVar.Q = ((hq) layoutParams).getOrder();
        } else {
            bVar.Q = 1;
        }
        if (i != -1 && i != flexItemCount && i < aVar.a.getFlexItemCount()) {
            bVar.P = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((a.b) f.get(i2)).P++;
            }
        } else {
            bVar.P = flexItemCount;
        }
        f.add(bVar);
        this.e0 = com.google.android.flexbox.a.r(flexItemCount + 1, f, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // defpackage.gq
    public final View b(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.gq
    public final int c(View view, int i, int i2) {
        int i3;
        int i4;
        if (j()) {
            i3 = p(i, i2) ? 0 + this.d0 : 0;
            if ((this.b0 & 4) <= 0) {
                return i3;
            }
            i4 = this.d0;
        } else {
            i3 = p(i, i2) ? 0 + this.c0 : 0;
            if ((this.a0 & 4) <= 0) {
                return i3;
            }
            i4 = this.c0;
        }
        return i3 + i4;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // defpackage.gq
    public final int d(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    public final void e(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            iq iqVar = this.h0.get(i);
            for (int i2 = 0; i2 < iqVar.h; i2++) {
                int i3 = iqVar.o + i2;
                View o = o(i3);
                if (o != null && o.getVisibility() != 8) {
                    a aVar = (a) o.getLayoutParams();
                    if (p(i3, i2)) {
                        n(canvas, z ? o.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin : (o.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.d0, iqVar.b, iqVar.g);
                    }
                    if (i2 == iqVar.h - 1 && (this.b0 & 4) > 0) {
                        n(canvas, z ? (o.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.d0 : o.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin, iqVar.b, iqVar.g);
                    }
                }
            }
            if (q(i)) {
                m(canvas, paddingLeft, z2 ? iqVar.d : iqVar.b - this.c0, max);
            }
            if (r(i) && (this.a0 & 4) > 0) {
                m(canvas, paddingLeft, z2 ? iqVar.b - this.c0 : iqVar.d, max);
            }
        }
    }

    @Override // defpackage.gq
    public final void f(iq iqVar) {
        int i;
        int i2;
        if (j()) {
            if ((this.b0 & 4) <= 0) {
                return;
            }
            i = iqVar.e;
            i2 = this.d0;
        } else if ((this.a0 & 4) <= 0) {
            return;
        } else {
            i = iqVar.e;
            i2 = this.c0;
        }
        iqVar.e = i + i2;
        iqVar.f += i2;
    }

    @Override // defpackage.gq
    public final View g(int i) {
        return o(i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    @Override // defpackage.gq
    public int getAlignContent() {
        return this.T;
    }

    @Override // defpackage.gq
    public int getAlignItems() {
        return this.S;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.V;
    }

    public Drawable getDividerDrawableVertical() {
        return this.W;
    }

    @Override // defpackage.gq
    public int getFlexDirection() {
        return this.P;
    }

    @Override // defpackage.gq
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<iq> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.h0.size());
        for (iq iqVar : this.h0) {
            if (iqVar.h - iqVar.i != 0) {
                arrayList.add(iqVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.gq
    public List<iq> getFlexLinesInternal() {
        return this.h0;
    }

    @Override // defpackage.gq
    public int getFlexWrap() {
        return this.Q;
    }

    public int getJustifyContent() {
        return this.R;
    }

    @Override // defpackage.gq
    public int getLargestMainSize() {
        int i = RecyclerView.UNDEFINED_DURATION;
        for (iq iqVar : this.h0) {
            i = Math.max(i, iqVar.e);
        }
        return i;
    }

    @Override // defpackage.gq
    public int getMaxLine() {
        return this.U;
    }

    public int getShowDividerHorizontal() {
        return this.a0;
    }

    public int getShowDividerVertical() {
        return this.b0;
    }

    @Override // defpackage.gq
    public int getSumOfCrossSize() {
        int size = this.h0.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iq iqVar = this.h0.get(i2);
            if (q(i2)) {
                i += j() ? this.c0 : this.d0;
            }
            if (r(i2)) {
                i += j() ? this.c0 : this.d0;
            }
            i += iqVar.g;
        }
        return i;
    }

    @Override // defpackage.gq
    public final void h(View view, int i) {
    }

    @Override // defpackage.gq
    public final int i(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.gq
    public final boolean j() {
        int i = this.P;
        return i == 0 || i == 1;
    }

    @Override // defpackage.gq
    public final int k(View view) {
        return 0;
    }

    public final void l(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.h0.size();
        for (int i = 0; i < size; i++) {
            iq iqVar = this.h0.get(i);
            for (int i2 = 0; i2 < iqVar.h; i2++) {
                int i3 = iqVar.o + i2;
                View o = o(i3);
                if (o != null && o.getVisibility() != 8) {
                    a aVar = (a) o.getLayoutParams();
                    if (p(i3, i2)) {
                        m(canvas, iqVar.a, z2 ? o.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin : (o.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.c0, iqVar.g);
                    }
                    if (i2 == iqVar.h - 1 && (this.a0 & 4) > 0) {
                        m(canvas, iqVar.a, z2 ? (o.getTop() - ((ViewGroup.MarginLayoutParams) aVar).topMargin) - this.c0 : o.getBottom() + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, iqVar.g);
                    }
                }
            }
            if (q(i)) {
                n(canvas, z ? iqVar.c : iqVar.a - this.d0, paddingTop, max);
            }
            if (r(i) && (this.b0 & 4) > 0) {
                n(canvas, z ? iqVar.a - this.d0 : iqVar.c, paddingTop, max);
            }
        }
    }

    public final void m(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.V;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.c0 + i2);
        this.V.draw(canvas);
    }

    public final void n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.W;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.d0 + i, i3 + i2);
        this.W.draw(canvas);
    }

    public final View o(int i) {
        if (i >= 0) {
            int[] iArr = this.e0;
            if (i >= iArr.length) {
                return null;
            }
            return getChildAt(iArr[i]);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0049, code lost:
        if (r6.Q == 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0053, code lost:
        if (r6.Q == 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0055, code lost:
        r3 = true;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        boolean z;
        if (this.W == null && this.V == null) {
            return;
        }
        if (this.a0 == 0 && this.b0 == 0) {
            return;
        }
        WeakHashMap<View, String> weakHashMap = a41.a;
        int layoutDirection = getLayoutDirection();
        int i = this.P;
        boolean z2 = false;
        boolean z3 = true;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        if (layoutDirection == 1) {
                            z2 = true;
                        }
                        if (this.Q == 2) {
                            z2 = !z2;
                        }
                        l(canvas, z2, true);
                        return;
                    }
                    return;
                }
                if (layoutDirection != 1) {
                    z3 = false;
                }
                if (this.Q == 2) {
                    z3 = !z3;
                }
                l(canvas, z3, false);
                return;
            } else if (layoutDirection != 1) {
                z = true;
            } else {
                z = false;
            }
        } else if (layoutDirection == 1) {
            z = true;
        } else {
            z = false;
        }
        e(canvas, z, z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WeakHashMap<View, String> weakHashMap = a41.a;
        int layoutDirection = getLayoutDirection();
        int i5 = this.P;
        boolean z6 = false;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        if (layoutDirection == 1) {
                            z6 = true;
                        }
                        if (this.Q == 2) {
                            z6 = !z6;
                        }
                        z4 = z6;
                        z5 = true;
                    } else {
                        StringBuilder b = e5.b("Invalid flex direction is set: ");
                        b.append(this.P);
                        throw new IllegalStateException(b.toString());
                    }
                } else {
                    if (layoutDirection == 1) {
                        z6 = true;
                    }
                    if (this.Q == 2) {
                        z6 = !z6;
                    }
                    z4 = z6;
                    z5 = false;
                }
                t(i, i2, i3, i4, z4, z5);
                return;
            }
            if (layoutDirection != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            s(z3, i, i2, i3, i4);
            return;
        }
        if (layoutDirection == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        s(z2, i, i2, i3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        int measuredHeight;
        if (this.f0 == null) {
            this.f0 = new SparseIntArray(getChildCount());
        }
        com.google.android.flexbox.a aVar = this.g0;
        SparseIntArray sparseIntArray = this.f0;
        int flexItemCount = aVar.a.getFlexItemCount();
        if (sparseIntArray.size() == flexItemCount) {
            for (int i4 = 0; i4 < flexItemCount; i4++) {
                View b = aVar.a.b(i4);
                if (b == null || ((hq) b.getLayoutParams()).getOrder() == sparseIntArray.get(i4)) {
                }
            }
            z = false;
            if (z) {
                com.google.android.flexbox.a aVar2 = this.g0;
                SparseIntArray sparseIntArray2 = this.f0;
                int flexItemCount2 = aVar2.a.getFlexItemCount();
                this.e0 = com.google.android.flexbox.a.r(flexItemCount2, aVar2.f(flexItemCount2), sparseIntArray2);
            }
            i3 = this.P;
            if (i3 == 0 && i3 != 1) {
                if (i3 != 2 && i3 != 3) {
                    StringBuilder b2 = e5.b("Invalid value for the flex direction is set: ");
                    b2.append(this.P);
                    throw new IllegalStateException(b2.toString());
                }
                this.h0.clear();
                a.C0020a c0020a = this.i0;
                c0020a.a = null;
                c0020a.b = 0;
                this.g0.b(c0020a, i2, i, Integer.MAX_VALUE, 0, -1, null);
                this.h0 = this.i0.a;
                this.g0.h(i, i2, 0);
                this.g0.g(i, i2, getPaddingRight() + getPaddingLeft());
                this.g0.u(0);
                u(this.P, i, i2, this.i0.b);
                return;
            }
            this.h0.clear();
            a.C0020a c0020a2 = this.i0;
            c0020a2.a = null;
            c0020a2.b = 0;
            this.g0.b(c0020a2, i, i2, Integer.MAX_VALUE, 0, -1, null);
            this.h0 = this.i0.a;
            this.g0.h(i, i2, 0);
            if (this.S == 3) {
                for (iq iqVar : this.h0) {
                    int i5 = RecyclerView.UNDEFINED_DURATION;
                    for (int i6 = 0; i6 < iqVar.h; i6++) {
                        View o = o(iqVar.o + i6);
                        if (o != null && o.getVisibility() != 8) {
                            a aVar3 = (a) o.getLayoutParams();
                            if (this.Q != 2) {
                                measuredHeight = o.getMeasuredHeight() + Math.max(iqVar.l - o.getBaseline(), ((ViewGroup.MarginLayoutParams) aVar3).topMargin) + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                            } else {
                                measuredHeight = o.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + Math.max(o.getBaseline() + (iqVar.l - o.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin);
                            }
                            i5 = Math.max(i5, measuredHeight);
                        }
                    }
                    iqVar.g = i5;
                }
            }
            this.g0.g(i, i2, getPaddingBottom() + getPaddingTop());
            this.g0.u(0);
            u(this.P, i, i2, this.i0.b);
        }
        z = true;
        if (z) {
        }
        i3 = this.P;
        if (i3 == 0) {
        }
        this.h0.clear();
        a.C0020a c0020a22 = this.i0;
        c0020a22.a = null;
        c0020a22.b = 0;
        this.g0.b(c0020a22, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.h0 = this.i0.a;
        this.g0.h(i, i2, 0);
        if (this.S == 3) {
        }
        this.g0.g(i, i2, getPaddingBottom() + getPaddingTop());
        this.g0.u(0);
        u(this.P, i, i2, this.i0.b);
    }

    public final boolean p(int i, int i2) {
        boolean z;
        int i3 = 1;
        while (true) {
            if (i3 <= i2) {
                View o = o(i - i3);
                if (o != null && o.getVisibility() != 8) {
                    z = false;
                    break;
                }
                i3++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            if (j()) {
                if ((this.b0 & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.a0 & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (j()) {
            if ((this.b0 & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.a0 & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean q(int i) {
        boolean z;
        if (i < 0 || i >= this.h0.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                iq iqVar = this.h0.get(i2);
                if (iqVar.h - iqVar.i > 0) {
                    z = false;
                    break;
                }
                i2++;
            } else {
                z = true;
                break;
            }
        }
        if (z) {
            if (j()) {
                if ((this.a0 & 1) == 0) {
                    return false;
                }
                return true;
            } else if ((this.b0 & 1) == 0) {
                return false;
            } else {
                return true;
            }
        } else if (j()) {
            if ((this.a0 & 2) == 0) {
                return false;
            }
            return true;
        } else if ((this.b0 & 2) == 0) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean r(int i) {
        if (i < 0 || i >= this.h0.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.h0.size(); i2++) {
            iq iqVar = this.h0.get(i2);
            if (iqVar.h - iqVar.i > 0) {
                return false;
            }
        }
        if (j()) {
            if ((this.a0 & 4) == 0) {
                return false;
            }
            return true;
        } else if ((this.b0 & 4) == 0) {
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        int i6;
        float f4;
        float f5;
        int i7;
        int i8;
        com.google.android.flexbox.a aVar;
        int round;
        int round2;
        int i9;
        int i10;
        int measuredHeight;
        int i11;
        int i12;
        int measuredHeight2;
        int round3;
        float f6;
        int i13;
        FlexboxLayout flexboxLayout = this;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = flexboxLayout.h0.size();
        int i15 = 0;
        while (i15 < size) {
            iq iqVar = flexboxLayout.h0.get(i15);
            if (flexboxLayout.q(i15)) {
                int i16 = flexboxLayout.c0;
                paddingBottom -= i16;
                paddingTop += i16;
            }
            int i17 = flexboxLayout.R;
            int i18 = 1;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 != 2) {
                        if (i17 != 3) {
                            if (i17 != 4) {
                                if (i17 == 5) {
                                    if (iqVar.h - iqVar.i != 0) {
                                        f3 = (i14 - iqVar.e) / (i13 + 1);
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    f = paddingLeft + f3;
                                    f2 = (i14 - paddingRight) - f3;
                                } else {
                                    StringBuilder b = e5.b("Invalid justifyContent is set: ");
                                    b.append(flexboxLayout.R);
                                    throw new IllegalStateException(b.toString());
                                }
                            } else {
                                int i19 = iqVar.h - iqVar.i;
                                if (i19 != 0) {
                                    f3 = (i14 - iqVar.e) / i19;
                                } else {
                                    f3 = 0.0f;
                                }
                                float f7 = f3 / 2.0f;
                                f = paddingLeft + f7;
                                f2 = (i14 - paddingRight) - f7;
                            }
                        } else {
                            f = paddingLeft;
                            int i20 = iqVar.h - iqVar.i;
                            if (i20 != 1) {
                                f6 = i20 - 1;
                            } else {
                                f6 = 1.0f;
                            }
                            f3 = (i14 - iqVar.e) / f6;
                            f2 = i14 - paddingRight;
                        }
                        float max = Math.max(f3, 0.0f);
                        i5 = 0;
                        while (i5 < iqVar.h) {
                            int i21 = iqVar.o + i5;
                            View o = flexboxLayout.o(i21);
                            if (o != null && o.getVisibility() != 8) {
                                a aVar2 = (a) o.getLayoutParams();
                                float f8 = f + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                                float f9 = f2 - ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                                if (flexboxLayout.p(i21, i5)) {
                                    int i22 = flexboxLayout.d0;
                                    float f10 = i22;
                                    f4 = f8 + f10;
                                    i7 = i22;
                                    f5 = f9 - f10;
                                } else {
                                    f4 = f8;
                                    f5 = f9;
                                    i7 = 0;
                                }
                                if (i5 == iqVar.h - i18 && (flexboxLayout.b0 & 4) > 0) {
                                    i8 = flexboxLayout.d0;
                                } else {
                                    i8 = 0;
                                }
                                if (flexboxLayout.Q == 2) {
                                    aVar = flexboxLayout.g0;
                                    if (z) {
                                        round = Math.round(f5) - o.getMeasuredWidth();
                                        measuredHeight2 = paddingBottom - o.getMeasuredHeight();
                                        round3 = Math.round(f5);
                                    } else {
                                        round = Math.round(f4);
                                        measuredHeight2 = paddingBottom - o.getMeasuredHeight();
                                        round3 = Math.round(f4) + o.getMeasuredWidth();
                                    }
                                    measuredHeight = paddingBottom;
                                    i9 = measuredHeight2;
                                    i10 = round3;
                                } else {
                                    aVar = flexboxLayout.g0;
                                    if (z) {
                                        round = Math.round(f5) - o.getMeasuredWidth();
                                        round2 = Math.round(f5);
                                    } else {
                                        round = Math.round(f4);
                                        round2 = Math.round(f4) + o.getMeasuredWidth();
                                    }
                                    i9 = paddingTop;
                                    i10 = round2;
                                    measuredHeight = o.getMeasuredHeight() + paddingTop;
                                }
                                int i23 = i10;
                                i6 = i5;
                                aVar.o(o, iqVar, round, i9, i23, measuredHeight);
                                float measuredWidth = o.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + f4;
                                float measuredWidth2 = f5 - ((o.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin);
                                if (z) {
                                    i12 = i7;
                                    i11 = i8;
                                } else {
                                    i11 = i7;
                                    i12 = i8;
                                }
                                iqVar.a(o, i11, 0, i12, 0);
                                f = measuredWidth;
                                f2 = measuredWidth2;
                            } else {
                                i6 = i5;
                            }
                            i5 = i6 + 1;
                            i18 = 1;
                            flexboxLayout = this;
                        }
                        int i24 = iqVar.g;
                        paddingTop += i24;
                        paddingBottom -= i24;
                        i15++;
                        flexboxLayout = this;
                    } else {
                        int i25 = iqVar.e;
                        f2 = (i14 - paddingRight) - ((i14 - i25) / 2.0f);
                        f = ((i14 - i25) / 2.0f) + paddingLeft;
                    }
                } else {
                    int i26 = iqVar.e;
                    f2 = i26 - paddingLeft;
                    f = (i14 - i26) + paddingRight;
                }
            } else {
                f = paddingLeft;
                f2 = i14 - paddingRight;
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, 0.0f);
            i5 = 0;
            while (i5 < iqVar.h) {
            }
            int i242 = iqVar.g;
            paddingTop += i242;
            paddingBottom -= i242;
            i15++;
            flexboxLayout = this;
        }
    }

    public void setAlignContent(int i) {
        if (this.T != i) {
            this.T = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.S != i) {
            this.S = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        int i;
        if (drawable == this.V) {
            return;
        }
        this.V = drawable;
        boolean z = false;
        if (drawable != null) {
            i = drawable.getIntrinsicHeight();
        } else {
            i = 0;
        }
        this.c0 = i;
        if (this.V == null && this.W == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        int i;
        if (drawable == this.W) {
            return;
        }
        this.W = drawable;
        boolean z = false;
        if (drawable != null) {
            i = drawable.getIntrinsicWidth();
        } else {
            i = 0;
        }
        this.d0 = i;
        if (this.V == null && this.W == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.P != i) {
            this.P = i;
            requestLayout();
        }
    }

    @Override // defpackage.gq
    public void setFlexLines(List<iq> list) {
        this.h0 = list;
    }

    public void setFlexWrap(int i) {
        if (this.Q != i) {
            this.Q = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.R != i) {
            this.R = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.U != i) {
            this.U = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.a0) {
            this.a0 = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.b0) {
            this.b0 = i;
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        float f;
        int i5;
        float f2;
        float f3;
        float f4;
        int i6;
        int i7;
        float f5;
        float f6;
        int i8;
        int i9;
        int round;
        int measuredWidth;
        int measuredHeight;
        int i10;
        int i11;
        int i12;
        boolean z3;
        int i13;
        int i14;
        int i15;
        float f7;
        int i16;
        FlexboxLayout flexboxLayout = this;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i17 = i4 - i2;
        int i18 = (i3 - i) - paddingRight;
        int size = flexboxLayout.h0.size();
        int i19 = 0;
        while (i19 < size) {
            iq iqVar = flexboxLayout.h0.get(i19);
            if (flexboxLayout.q(i19)) {
                int i20 = flexboxLayout.d0;
                paddingLeft += i20;
                i18 -= i20;
            }
            int i21 = flexboxLayout.R;
            if (i21 != 0) {
                if (i21 != 1) {
                    if (i21 != 2) {
                        if (i21 != 3) {
                            if (i21 != 4) {
                                if (i21 == 5) {
                                    if (iqVar.h - iqVar.i != 0) {
                                        f4 = (i17 - iqVar.e) / (i16 + 1);
                                    } else {
                                        f4 = 0.0f;
                                    }
                                    f3 = paddingTop + f4;
                                    f2 = (i17 - paddingBottom) - f4;
                                } else {
                                    StringBuilder b = e5.b("Invalid justifyContent is set: ");
                                    b.append(flexboxLayout.R);
                                    throw new IllegalStateException(b.toString());
                                }
                            } else {
                                int i22 = iqVar.h - iqVar.i;
                                if (i22 != 0) {
                                    f4 = (i17 - iqVar.e) / i22;
                                } else {
                                    f4 = 0.0f;
                                }
                                float f8 = f4 / 2.0f;
                                f3 = paddingTop + f8;
                                f2 = (i17 - paddingBottom) - f8;
                            }
                        } else {
                            f3 = paddingTop;
                            int i23 = iqVar.h - iqVar.i;
                            if (i23 != 1) {
                                f7 = i23 - 1;
                            } else {
                                f7 = 1.0f;
                            }
                            f4 = (i17 - iqVar.e) / f7;
                            f2 = i17 - paddingBottom;
                        }
                        float max = Math.max(f4, 0.0f);
                        i6 = 0;
                        while (i6 < iqVar.h) {
                            int i24 = iqVar.o + i6;
                            View o = flexboxLayout.o(i24);
                            if (o != null && o.getVisibility() != 8) {
                                a aVar = (a) o.getLayoutParams();
                                float f9 = f3 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                                float f10 = f2 - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                                if (flexboxLayout.p(i24, i6)) {
                                    int i25 = flexboxLayout.c0;
                                    float f11 = i25;
                                    f5 = f9 + f11;
                                    i8 = i25;
                                    f6 = f10 - f11;
                                } else {
                                    f5 = f9;
                                    f6 = f10;
                                    i8 = 0;
                                }
                                if (i6 == iqVar.h - 1 && (flexboxLayout.a0 & 4) > 0) {
                                    i9 = flexboxLayout.c0;
                                } else {
                                    i9 = 0;
                                }
                                com.google.android.flexbox.a aVar2 = flexboxLayout.g0;
                                if (z) {
                                    int measuredWidth2 = i18 - o.getMeasuredWidth();
                                    if (z2) {
                                        i11 = i18;
                                        i10 = Math.round(f6) - o.getMeasuredHeight();
                                        i12 = Math.round(f6);
                                        z3 = true;
                                        i13 = measuredWidth2;
                                    } else {
                                        int round2 = Math.round(f5);
                                        i11 = i18;
                                        i13 = measuredWidth2;
                                        i12 = o.getMeasuredHeight() + Math.round(f5);
                                        i10 = round2;
                                        z3 = true;
                                    }
                                } else {
                                    if (z2) {
                                        round = Math.round(f6) - o.getMeasuredHeight();
                                        measuredWidth = o.getMeasuredWidth() + paddingLeft;
                                        measuredHeight = Math.round(f6);
                                    } else {
                                        round = Math.round(f5);
                                        measuredWidth = o.getMeasuredWidth() + paddingLeft;
                                        measuredHeight = o.getMeasuredHeight() + Math.round(f5);
                                    }
                                    i10 = round;
                                    i11 = measuredWidth;
                                    i12 = measuredHeight;
                                    z3 = false;
                                    i13 = paddingLeft;
                                }
                                i7 = i6;
                                aVar2.p(o, iqVar, z3, i13, i10, i11, i12);
                                float measuredHeight2 = o.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + f5;
                                float measuredHeight3 = f6 - ((o.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) aVar).topMargin);
                                if (z2) {
                                    i15 = i8;
                                    i14 = i9;
                                } else {
                                    i14 = i8;
                                    i15 = i9;
                                }
                                iqVar.a(o, 0, i14, 0, i15);
                                f3 = measuredHeight2;
                                f2 = measuredHeight3;
                            } else {
                                i7 = i6;
                            }
                            i6 = i7 + 1;
                            flexboxLayout = this;
                        }
                        int i26 = iqVar.g;
                        paddingLeft += i26;
                        i18 -= i26;
                        i19++;
                        flexboxLayout = this;
                    } else {
                        int i27 = iqVar.e;
                        f2 = (i17 - paddingBottom) - ((i17 - i27) / 2.0f);
                        f3 = ((i17 - i27) / 2.0f) + paddingTop;
                        f4 = 0.0f;
                        float max2 = Math.max(f4, 0.0f);
                        i6 = 0;
                        while (i6 < iqVar.h) {
                        }
                        int i262 = iqVar.g;
                        paddingLeft += i262;
                        i18 -= i262;
                        i19++;
                        flexboxLayout = this;
                    }
                } else {
                    int i28 = iqVar.e;
                    f = (i17 - i28) + paddingBottom;
                    i5 = i28 - paddingTop;
                }
            } else {
                f = paddingTop;
                i5 = i17 - paddingBottom;
            }
            f2 = i5;
            f3 = f;
            f4 = 0.0f;
            float max22 = Math.max(f4, 0.0f);
            i6 = 0;
            while (i6 < iqVar.h) {
            }
            int i2622 = iqVar.g;
            paddingLeft += i2622;
            i18 -= i2622;
            i19++;
            flexboxLayout = this;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r1 < r4) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
        if (r3 < r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int i5;
        int i6;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i != 0 && i != 1) {
            if (i != 2 && i != 3) {
                throw new IllegalArgumentException(k6.a("Invalid flex direction: ", i));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException(k6.a("Unknown width mode is set: ", mode));
                }
            } else {
                i5 = View.resolveSizeAndState(largestMainSize, i2, i4);
                if (mode2 != Integer.MIN_VALUE) {
                    if (mode2 != 0) {
                        if (mode2 != 1073741824) {
                            throw new IllegalStateException(k6.a("Unknown height mode is set: ", mode2));
                        }
                    } else {
                        i6 = View.resolveSizeAndState(paddingBottom, i3, i4);
                        setMeasuredDimension(i5, i6);
                    }
                } else {
                    if (size2 >= paddingBottom) {
                        size2 = paddingBottom;
                        i6 = View.resolveSizeAndState(size2, i3, i4);
                        setMeasuredDimension(i5, i6);
                    }
                    i4 = View.combineMeasuredStates(i4, 256);
                    i6 = View.resolveSizeAndState(size2, i3, i4);
                    setMeasuredDimension(i5, i6);
                }
            }
        } else {
            if (size >= largestMainSize) {
                size = largestMainSize;
                i5 = View.resolveSizeAndState(size, i2, i4);
                if (mode2 != Integer.MIN_VALUE) {
                }
            }
            i4 = View.combineMeasuredStates(i4, 16777216);
            i5 = View.resolveSizeAndState(size, i2, i4);
            if (mode2 != Integer.MIN_VALUE) {
            }
        }
    }
}