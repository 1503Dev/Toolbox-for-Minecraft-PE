package com.google.android.flexbox;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class a {
    public final gq a;
    public boolean[] b;
    public int[] c;
    public long[] d;
    public long[] e;

    /* renamed from: com.google.android.flexbox.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class C0020a {
        public List<iq> a;
        public int b;
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements Comparable<b> {
        public int P;
        public int Q;

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int i = this.Q;
            int i2 = bVar2.Q;
            return i != i2 ? i - i2 : this.P - bVar2.P;
        }

        public final String toString() {
            StringBuilder b = e5.b("Order{order=");
            b.append(this.Q);
            b.append(", index=");
            b.append(this.P);
            b.append('}');
            return b.toString();
        }
    }

    public a(gq gqVar) {
        this.a = gqVar;
    }

    public static ArrayList e(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        iq iqVar = new iq();
        iqVar.g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(iqVar);
            }
            arrayList.add((iq) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(iqVar);
            }
        }
        return arrayList;
    }

    public static int[] r(int i, ArrayList arrayList, SparseIntArray sparseIntArray) {
        Collections.sort(arrayList);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i3 = bVar.P;
            iArr[i2] = i3;
            sparseIntArray.append(i3, bVar.Q);
            i2++;
        }
        return iArr;
    }

    public final void a(List<iq> list, iq iqVar, int i, int i2) {
        iqVar.m = i2;
        this.a.f(iqVar);
        iqVar.p = i;
        list.add(iqVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0241, code lost:
        if (r2 < (r8 + r14)) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
        if ((r10 == r14 + (-1) && r12 - r1 != 0) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
        a(r8, r9, r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00be, code lost:
        r24 = r6;
        r2 = r7;
        r26 = r11;
        r21 = r14;
        r25 = r20;
        r6 = r30;
        r11 = r8;
        r8 = r32;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03f4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(C0020a c0020a, int i, int i2, int i3, int i4, int i5, List<iq> list) {
        C0020a c0020a2;
        int i6;
        List<iq> list2;
        int i7;
        int i8;
        int i9;
        int i10;
        int d;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        List<iq> list3;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        boolean z2;
        int i18;
        int v;
        int i19;
        int minimumHeight;
        int i20;
        int i21 = i;
        boolean j = this.a.j();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        List<iq> arrayList = list == null ? new ArrayList<>() : list;
        c0020a.a = arrayList;
        boolean z3 = i5 == -1;
        gq gqVar = this.a;
        int paddingStart = j ? gqVar.getPaddingStart() : gqVar.getPaddingTop();
        gq gqVar2 = this.a;
        int paddingEnd = j ? gqVar2.getPaddingEnd() : gqVar2.getPaddingBottom();
        gq gqVar3 = this.a;
        int paddingTop = j ? gqVar3.getPaddingTop() : gqVar3.getPaddingStart();
        gq gqVar4 = this.a;
        int paddingBottom = j ? gqVar4.getPaddingBottom() : gqVar4.getPaddingEnd();
        iq iqVar = new iq();
        int i22 = i4;
        iqVar.o = i22;
        int i23 = paddingStart + paddingEnd;
        iqVar.e = i23;
        int flexItemCount = this.a.getFlexItemCount();
        boolean z4 = z3;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = RecyclerView.UNDEFINED_DURATION;
        while (true) {
            if (i22 >= flexItemCount) {
                c0020a2 = c0020a;
                break;
            }
            int i28 = i26;
            View g = this.a.g(i22);
            if (g == null) {
                if (i22 == flexItemCount - 1) {
                    i6 = i24;
                    boolean z5 = iqVar.h - iqVar.i != 0;
                } else {
                    i6 = i24;
                }
            } else {
                i6 = i24;
                if (g.getVisibility() == 8) {
                    int i29 = iqVar.i + 1;
                    iqVar.i = i29;
                    int i30 = iqVar.h + 1;
                    iqVar.h = i30;
                } else {
                    if (g instanceof CompoundButton) {
                        CompoundButton compoundButton = (CompoundButton) g;
                        hq hqVar = (hq) compoundButton.getLayoutParams();
                        i7 = flexItemCount;
                        int r = hqVar.r();
                        list2 = arrayList;
                        int q = hqVar.q();
                        Drawable a = ye.a(compoundButton);
                        int minimumWidth = a == null ? 0 : a.getMinimumWidth();
                        if (a == null) {
                            i20 = -1;
                            minimumHeight = 0;
                        } else {
                            minimumHeight = a.getMinimumHeight();
                            i20 = -1;
                        }
                        if (r == i20) {
                            r = minimumWidth;
                        }
                        hqVar.u(r);
                        if (q == i20) {
                            q = minimumHeight;
                        }
                        hqVar.e(q);
                    } else {
                        list2 = arrayList;
                        i7 = flexItemCount;
                    }
                    hq hqVar2 = (hq) g.getLayoutParams();
                    if (hqVar2.l() == 4) {
                        iqVar.n.add(Integer.valueOf(i22));
                    }
                    int width = j ? hqVar2.getWidth() : hqVar2.getHeight();
                    if (hqVar2.k() != -1.0f && mode == 1073741824) {
                        width = Math.round(hqVar2.k() * size);
                    }
                    if (j) {
                        d = this.a.i(i21, hqVar2.o() + hqVar2.y() + i23, width);
                        i9 = size;
                        i8 = mode;
                        i10 = i2;
                        int d2 = this.a.d(i10, hqVar2.v() + hqVar2.E() + paddingTop + paddingBottom + i25, hqVar2.getHeight());
                        g.measure(d, d2);
                        v(g, i22, d, d2);
                    } else {
                        i8 = mode;
                        i9 = size;
                        i10 = i2;
                        int i31 = this.a.i(i10, hqVar2.o() + hqVar2.y() + paddingTop + paddingBottom + i25, hqVar2.getWidth());
                        d = this.a.d(i21, hqVar2.v() + hqVar2.E() + i23, width);
                        g.measure(i31, d);
                        v(g, i22, i31, d);
                    }
                    this.a.h(g, i22);
                    c(g, i22);
                    int combineMeasuredStates = View.combineMeasuredStates(i6, g.getMeasuredState());
                    int i32 = iqVar.e;
                    int o = (j ? hqVar2.o() : hqVar2.v()) + (j ? hqVar2.y() : hqVar2.E()) + (j ? g.getMeasuredWidth() : g.getMeasuredHeight());
                    int size2 = list2.size();
                    if (this.a.getFlexWrap() != 0) {
                        if (!hqVar2.s()) {
                            if (i8 != 0) {
                                int maxLine = this.a.getMaxLine();
                                i11 = combineMeasuredStates;
                                i12 = paddingBottom;
                                if (maxLine == -1 || maxLine > size2 + 1) {
                                    i13 = i28;
                                    int c = this.a.c(g, i22, i13);
                                    if (c > 0) {
                                        o += c;
                                    }
                                    i14 = i9;
                                }
                                i13 = i28;
                                i14 = i9;
                                z = false;
                                if (z) {
                                    if (iqVar.h - iqVar.i > 0) {
                                        if (i22 > 0) {
                                            i19 = i22 - 1;
                                            list3 = list2;
                                        } else {
                                            list3 = list2;
                                            i19 = 0;
                                        }
                                        a(list3, iqVar, i19, i25);
                                        i25 += iqVar.g;
                                    } else {
                                        list3 = list2;
                                    }
                                    if (j) {
                                        if (hqVar2.getHeight() == -1) {
                                            gq gqVar5 = this.a;
                                            g.measure(d, gqVar5.d(i10, hqVar2.v() + hqVar2.E() + this.a.getPaddingBottom() + gqVar5.getPaddingTop() + i25, hqVar2.getHeight()));
                                            c(g, i22);
                                        }
                                        iqVar = new iq();
                                        iqVar.h = 1;
                                        iqVar.e = i23;
                                        iqVar.o = i22;
                                        i15 = 0;
                                        i16 = RecyclerView.UNDEFINED_DURATION;
                                    } else {
                                        if (hqVar2.getWidth() == -1) {
                                            gq gqVar6 = this.a;
                                            g.measure(gqVar6.i(i10, hqVar2.o() + hqVar2.y() + this.a.getPaddingRight() + gqVar6.getPaddingLeft() + i25, hqVar2.getWidth()), d);
                                            c(g, i22);
                                        }
                                        iqVar = new iq();
                                        iqVar.h = 1;
                                        iqVar.e = i23;
                                        iqVar.o = i22;
                                        i15 = 0;
                                        i16 = RecyclerView.UNDEFINED_DURATION;
                                    }
                                } else {
                                    list3 = list2;
                                    iqVar.h++;
                                    i15 = i13 + 1;
                                    i16 = i27;
                                }
                                iqVar.q |= hqVar2.f() != 0.0f;
                                iqVar.r |= hqVar2.m() != 0.0f;
                                iArr = this.c;
                                if (iArr != null) {
                                    iArr[i22] = list3.size();
                                }
                                iqVar.e = (j ? hqVar2.o() : hqVar2.v()) + (j ? hqVar2.y() : hqVar2.E()) + (j ? g.getMeasuredWidth() : g.getMeasuredHeight()) + iqVar.e;
                                iqVar.j = hqVar2.f() + iqVar.j;
                                iqVar.k = hqVar2.m() + iqVar.k;
                                this.a.a(g, i22, i15, iqVar);
                                int max = Math.max(i16, this.a.k(g) + (j ? hqVar2.v() : hqVar2.o()) + (j ? hqVar2.E() : hqVar2.y()) + (j ? g.getMeasuredHeight() : g.getMeasuredWidth()));
                                iqVar.g = Math.max(iqVar.g, max);
                                if (j) {
                                    if (this.a.getFlexWrap() != 2) {
                                        i18 = iqVar.l;
                                        v = hqVar2.E() + g.getBaseline();
                                    } else {
                                        i18 = iqVar.l;
                                        v = hqVar2.v() + (g.getMeasuredHeight() - g.getBaseline());
                                    }
                                    iqVar.l = Math.max(i18, v);
                                }
                                if ((i22 == i7 + (-1) || iqVar.h - iqVar.i == 0) ? false : true) {
                                    a(list3, iqVar, i22, i25);
                                    i25 += iqVar.g;
                                }
                                if (i5 != -1 || list3.size() <= 0 || list3.get(list3.size() - 1).p < i5 || i22 < i5 || z4) {
                                    i17 = i3;
                                    z2 = z4;
                                } else {
                                    i25 = -iqVar.g;
                                    i17 = i3;
                                    z2 = true;
                                }
                                if (i25 <= i17 && z2) {
                                    c0020a2 = c0020a;
                                    i24 = i11;
                                    break;
                                }
                                i27 = max;
                                i28 = i15;
                                i22++;
                                size = i14;
                                z4 = z2;
                                arrayList = list3;
                                i26 = i28;
                                flexItemCount = i7;
                                mode = i8;
                                i24 = i11;
                                paddingBottom = i12;
                                i21 = i;
                            }
                        } else {
                            i11 = combineMeasuredStates;
                            i12 = paddingBottom;
                            i13 = i28;
                            i14 = i9;
                        }
                        z = true;
                        if (z) {
                        }
                        iqVar.q |= hqVar2.f() != 0.0f;
                        iqVar.r |= hqVar2.m() != 0.0f;
                        iArr = this.c;
                        if (iArr != null) {
                        }
                        if (j) {
                        }
                        iqVar.e = (j ? hqVar2.o() : hqVar2.v()) + (j ? hqVar2.y() : hqVar2.E()) + (j ? g.getMeasuredWidth() : g.getMeasuredHeight()) + iqVar.e;
                        iqVar.j = hqVar2.f() + iqVar.j;
                        iqVar.k = hqVar2.m() + iqVar.k;
                        this.a.a(g, i22, i15, iqVar);
                        if (j) {
                        }
                        int max2 = Math.max(i16, this.a.k(g) + (j ? hqVar2.v() : hqVar2.o()) + (j ? hqVar2.E() : hqVar2.y()) + (j ? g.getMeasuredHeight() : g.getMeasuredWidth()));
                        iqVar.g = Math.max(iqVar.g, max2);
                        if (j) {
                        }
                        if ((i22 == i7 + (-1) || iqVar.h - iqVar.i == 0) ? false : true) {
                        }
                        if (i5 != -1) {
                        }
                        i17 = i3;
                        z2 = z4;
                        if (i25 <= i17) {
                        }
                        i27 = max2;
                        i28 = i15;
                        i22++;
                        size = i14;
                        z4 = z2;
                        arrayList = list3;
                        i26 = i28;
                        flexItemCount = i7;
                        mode = i8;
                        i24 = i11;
                        paddingBottom = i12;
                        i21 = i;
                    }
                    i11 = combineMeasuredStates;
                    i12 = paddingBottom;
                    i13 = i28;
                    i14 = i9;
                    z = false;
                    if (z) {
                    }
                    iqVar.q |= hqVar2.f() != 0.0f;
                    iqVar.r |= hqVar2.m() != 0.0f;
                    iArr = this.c;
                    if (iArr != null) {
                    }
                    if (j) {
                    }
                    iqVar.e = (j ? hqVar2.o() : hqVar2.v()) + (j ? hqVar2.y() : hqVar2.E()) + (j ? g.getMeasuredWidth() : g.getMeasuredHeight()) + iqVar.e;
                    iqVar.j = hqVar2.f() + iqVar.j;
                    iqVar.k = hqVar2.m() + iqVar.k;
                    this.a.a(g, i22, i15, iqVar);
                    if (j) {
                    }
                    int max22 = Math.max(i16, this.a.k(g) + (j ? hqVar2.v() : hqVar2.o()) + (j ? hqVar2.E() : hqVar2.y()) + (j ? g.getMeasuredHeight() : g.getMeasuredWidth()));
                    iqVar.g = Math.max(iqVar.g, max22);
                    if (j) {
                    }
                    if ((i22 == i7 + (-1) || iqVar.h - iqVar.i == 0) ? false : true) {
                    }
                    if (i5 != -1) {
                    }
                    i17 = i3;
                    z2 = z4;
                    if (i25 <= i17) {
                    }
                    i27 = max22;
                    i28 = i15;
                    i22++;
                    size = i14;
                    z4 = z2;
                    arrayList = list3;
                    i26 = i28;
                    flexItemCount = i7;
                    mode = i8;
                    i24 = i11;
                    paddingBottom = i12;
                    i21 = i;
                }
            }
        }
        c0020a2.b = i24;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(View view, int i) {
        boolean z;
        hq hqVar = (hq) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < hqVar.r()) {
            measuredWidth = hqVar.r();
        } else if (measuredWidth <= hqVar.D()) {
            z = false;
            if (measuredHeight >= hqVar.q()) {
                measuredHeight = hqVar.q();
            } else if (measuredHeight > hqVar.t()) {
                measuredHeight = hqVar.t();
            } else {
                z2 = z;
            }
            if (z2) {
                return;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            v(view, i, makeMeasureSpec, makeMeasureSpec2);
            this.a.h(view, i);
            return;
        } else {
            measuredWidth = hqVar.D();
        }
        z = true;
        if (measuredHeight >= hqVar.q()) {
        }
        if (z2) {
        }
    }

    public final void d(int i, List list) {
        int i2 = this.c[i];
        if (i2 == -1) {
            i2 = 0;
        }
        for (int size = list.size() - 1; size >= i2; size--) {
            list.remove(size);
        }
        int[] iArr = this.c;
        int length = iArr.length - 1;
        if (i > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i, length, -1);
        }
        long[] jArr = this.d;
        int length2 = jArr.length - 1;
        if (i > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i, length2, 0L);
        }
    }

    public final ArrayList f(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            b bVar = new b();
            bVar.Q = ((hq) this.a.b(i2).getLayoutParams()).getOrder();
            bVar.P = i2;
            arrayList.add(bVar);
        }
        return arrayList;
    }

    public final void g(int i, int i2, int i3) {
        int i4;
        int i5;
        ArrayList arrayList;
        int flexDirection = this.a.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException(k6.a("Invalid flex direction: ", flexDirection));
            }
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        }
        List<iq> flexLinesInternal = this.a.getFlexLinesInternal();
        if (i4 == 1073741824) {
            int sumOfCrossSize = this.a.getSumOfCrossSize() + i3;
            int i6 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).g = i5 - i3;
            } else if (flexLinesInternal.size() >= 2) {
                int alignContent = this.a.getAlignContent();
                if (alignContent != 1) {
                    if (alignContent != 2) {
                        if (alignContent != 3) {
                            if (alignContent != 4) {
                                if (alignContent == 5 && sumOfCrossSize < i5) {
                                    float size2 = (i5 - sumOfCrossSize) / flexLinesInternal.size();
                                    int size3 = flexLinesInternal.size();
                                    float f = 0.0f;
                                    while (i6 < size3) {
                                        iq iqVar = flexLinesInternal.get(i6);
                                        float f2 = iqVar.g + size2;
                                        if (i6 == flexLinesInternal.size() - 1) {
                                            f2 += f;
                                            f = 0.0f;
                                        }
                                        int round = Math.round(f2);
                                        float f3 = (f2 - round) + f;
                                        if (f3 > 1.0f) {
                                            round++;
                                            f3 -= 1.0f;
                                        } else if (f3 < -1.0f) {
                                            round--;
                                            f3 += 1.0f;
                                        }
                                        f = f3;
                                        iqVar.g = round;
                                        i6++;
                                    }
                                    return;
                                }
                                return;
                            } else if (sumOfCrossSize < i5) {
                                int size4 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                                arrayList = new ArrayList();
                                iq iqVar2 = new iq();
                                iqVar2.g = size4;
                                for (iq iqVar3 : flexLinesInternal) {
                                    arrayList.add(iqVar2);
                                    arrayList.add(iqVar3);
                                    arrayList.add(iqVar2);
                                }
                            }
                        } else if (sumOfCrossSize < i5) {
                            float size5 = (i5 - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                            arrayList = new ArrayList();
                            int size6 = flexLinesInternal.size();
                            float f4 = 0.0f;
                            while (i6 < size6) {
                                arrayList.add(flexLinesInternal.get(i6));
                                if (i6 != flexLinesInternal.size() - 1) {
                                    iq iqVar4 = new iq();
                                    if (i6 == flexLinesInternal.size() - 2) {
                                        iqVar4.g = Math.round(f4 + size5);
                                        f4 = 0.0f;
                                    } else {
                                        iqVar4.g = Math.round(size5);
                                    }
                                    int i7 = iqVar4.g;
                                    float f5 = (size5 - i7) + f4;
                                    if (f5 > 1.0f) {
                                        iqVar4.g = i7 + 1;
                                        f5 -= 1.0f;
                                    } else if (f5 < -1.0f) {
                                        iqVar4.g = i7 - 1;
                                        f5 += 1.0f;
                                    }
                                    arrayList.add(iqVar4);
                                    f4 = f5;
                                }
                                i6++;
                            }
                        } else {
                            return;
                        }
                        this.a.setFlexLines(arrayList);
                        return;
                    }
                    this.a.setFlexLines(e(i5, sumOfCrossSize, flexLinesInternal));
                    return;
                }
                int i8 = i5 - sumOfCrossSize;
                iq iqVar5 = new iq();
                iqVar5.g = i8;
                flexLinesInternal.add(0, iqVar5);
            }
        }
    }

    public final void h(int i, int i2, int i3) {
        int size;
        int paddingLeft;
        int paddingRight;
        int flexItemCount = this.a.getFlexItemCount();
        boolean[] zArr = this.b;
        int i4 = 0;
        if (zArr == null) {
            if (flexItemCount < 10) {
                flexItemCount = 10;
            }
            this.b = new boolean[flexItemCount];
        } else if (zArr.length < flexItemCount) {
            int length = zArr.length * 2;
            if (length >= flexItemCount) {
                flexItemCount = length;
            }
            this.b = new boolean[flexItemCount];
        } else {
            Arrays.fill(zArr, false);
        }
        if (i3 >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        int flexDirection2 = this.a.getFlexDirection();
        if (flexDirection2 != 0 && flexDirection2 != 1) {
            if (flexDirection2 != 2 && flexDirection2 != 3) {
                throw new IllegalArgumentException(k6.a("Invalid flex direction: ", flexDirection));
            }
            int mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
            if (mode != 1073741824) {
                size = this.a.getLargestMainSize();
            }
            paddingLeft = this.a.getPaddingTop();
            paddingRight = this.a.getPaddingBottom();
        } else {
            int mode2 = View.MeasureSpec.getMode(i);
            size = View.MeasureSpec.getSize(i);
            int largestMainSize = this.a.getLargestMainSize();
            if (mode2 != 1073741824 && largestMainSize <= size) {
                size = largestMainSize;
            }
            paddingLeft = this.a.getPaddingLeft();
            paddingRight = this.a.getPaddingRight();
        }
        int i5 = paddingRight + paddingLeft;
        int[] iArr = this.c;
        if (iArr != null) {
            i4 = iArr[i3];
        }
        List<iq> flexLinesInternal = this.a.getFlexLinesInternal();
        int size2 = flexLinesInternal.size();
        while (i4 < size2) {
            iq iqVar = flexLinesInternal.get(i4);
            int i6 = iqVar.e;
            if (i6 < size && iqVar.q) {
                l(i, i2, iqVar, size, i5, false);
            } else if (i6 > size && iqVar.r) {
                q(i, i2, iqVar, size, i5, false);
            }
            i4++;
        }
    }

    public final void i(int i) {
        int[] iArr = this.c;
        if (iArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.c = new int[i];
        } else if (iArr.length < i) {
            int length = iArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.c = Arrays.copyOf(iArr, i);
        }
    }

    public final void j(int i) {
        long[] jArr = this.d;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.d = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.d = Arrays.copyOf(jArr, i);
        }
    }

    public final void k(int i) {
        long[] jArr = this.e;
        if (jArr == null) {
            if (i < 10) {
                i = 10;
            }
            this.e = new long[i];
        } else if (jArr.length < i) {
            int length = jArr.length * 2;
            if (length >= i) {
                i = length;
            }
            this.e = Arrays.copyOf(jArr, i);
        }
    }

    public final void l(int i, int i2, iq iqVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        double d;
        int i8;
        double d2;
        float f = iqVar.j;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 < (i5 = iqVar.e)) {
            return;
        }
        float f3 = (i3 - i5) / f;
        iqVar.e = i4 + iqVar.f;
        if (!z) {
            iqVar.g = RecyclerView.UNDEFINED_DURATION;
        }
        int i9 = 0;
        boolean z2 = false;
        int i10 = 0;
        float f4 = 0.0f;
        while (i9 < iqVar.h) {
            int i11 = iqVar.o + i9;
            View g = this.a.g(i11);
            if (g == null || g.getVisibility() == 8) {
                i6 = i5;
            } else {
                hq hqVar = (hq) g.getLayoutParams();
                int flexDirection = this.a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    int measuredWidth = g.getMeasuredWidth();
                    long[] jArr = this.e;
                    i6 = i5;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i11];
                    }
                    int measuredHeight = g.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i11] >> 32);
                    }
                    if (!this.b[i11] && hqVar.f() > 0.0f) {
                        float f5 = (hqVar.f() * f3) + measuredWidth;
                        if (i9 == iqVar.h - 1) {
                            f5 += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(f5);
                        if (round > hqVar.D()) {
                            round = hqVar.D();
                            this.b[i11] = true;
                            iqVar.j -= hqVar.f();
                            z2 = true;
                        } else {
                            float f6 = (f5 - round) + f4;
                            double d3 = f6;
                            if (d3 > 1.0d) {
                                round++;
                                Double.isNaN(d3);
                                Double.isNaN(d3);
                                d = d3 - 1.0d;
                            } else {
                                if (d3 < -1.0d) {
                                    round--;
                                    Double.isNaN(d3);
                                    Double.isNaN(d3);
                                    d = d3 + 1.0d;
                                }
                                f4 = f6;
                            }
                            f6 = (float) d;
                            f4 = f6;
                        }
                        int m = m(i2, hqVar, iqVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, 1073741824);
                        g.measure(makeMeasureSpec, m);
                        int measuredWidth2 = g.getMeasuredWidth();
                        int measuredHeight2 = g.getMeasuredHeight();
                        v(g, i11, makeMeasureSpec, m);
                        this.a.h(g, i11);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i10, this.a.k(g) + hqVar.v() + hqVar.E() + measuredHeight);
                    iqVar.e = hqVar.o() + hqVar.y() + measuredWidth + iqVar.e;
                    i7 = max;
                } else {
                    int measuredHeight3 = g.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i11] >> 32);
                    }
                    int measuredWidth3 = g.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i11];
                    }
                    if (this.b[i11] || hqVar.f() <= f2) {
                        i8 = i5;
                    } else {
                        float f7 = (hqVar.f() * f3) + measuredHeight3;
                        if (i9 == iqVar.h - 1) {
                            f7 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(f7);
                        if (round2 > hqVar.t()) {
                            round2 = hqVar.t();
                            this.b[i11] = true;
                            iqVar.j -= hqVar.f();
                            i8 = i5;
                            z2 = true;
                        } else {
                            float f8 = (f7 - round2) + f4;
                            i8 = i5;
                            double d4 = f8;
                            if (d4 > 1.0d) {
                                round2++;
                                Double.isNaN(d4);
                                Double.isNaN(d4);
                                d2 = d4 - 1.0d;
                            } else if (d4 < -1.0d) {
                                round2--;
                                Double.isNaN(d4);
                                Double.isNaN(d4);
                                d2 = d4 + 1.0d;
                            } else {
                                f4 = f8;
                            }
                            f4 = (float) d2;
                        }
                        int n = n(i, hqVar, iqVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        g.measure(n, makeMeasureSpec2);
                        measuredWidth3 = g.getMeasuredWidth();
                        int measuredHeight4 = g.getMeasuredHeight();
                        v(g, i11, n, makeMeasureSpec2);
                        this.a.h(g, i11);
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = Math.max(i10, this.a.k(g) + hqVar.o() + hqVar.y() + measuredWidth3);
                    iqVar.e = hqVar.v() + hqVar.E() + measuredHeight3 + iqVar.e;
                    i6 = i8;
                }
                iqVar.g = Math.max(iqVar.g, i7);
                i10 = i7;
            }
            i9++;
            i5 = i6;
            f2 = 0.0f;
        }
        int i12 = i5;
        if (!z2 || i12 == iqVar.e) {
            return;
        }
        l(i, i2, iqVar, i3, i4, true);
    }

    public final int m(int i, hq hqVar, int i2) {
        int q;
        gq gqVar = this.a;
        int d = gqVar.d(i, hqVar.v() + hqVar.E() + this.a.getPaddingBottom() + gqVar.getPaddingTop() + i2, hqVar.getHeight());
        int size = View.MeasureSpec.getSize(d);
        if (size > hqVar.t()) {
            q = hqVar.t();
        } else if (size >= hqVar.q()) {
            return d;
        } else {
            q = hqVar.q();
        }
        return View.MeasureSpec.makeMeasureSpec(q, View.MeasureSpec.getMode(d));
    }

    public final int n(int i, hq hqVar, int i2) {
        int r;
        gq gqVar = this.a;
        int i3 = gqVar.i(i, hqVar.o() + hqVar.y() + this.a.getPaddingRight() + gqVar.getPaddingLeft() + i2, hqVar.getWidth());
        int size = View.MeasureSpec.getSize(i3);
        if (size > hqVar.D()) {
            r = hqVar.D();
        } else if (size >= hqVar.r()) {
            return i3;
        } else {
            r = hqVar.r();
        }
        return View.MeasureSpec.makeMeasureSpec(r, View.MeasureSpec.getMode(i3));
    }

    public final void o(View view, iq iqVar, int i, int i2, int i3, int i4) {
        int v;
        int v2;
        int E;
        int E2;
        int i5;
        int measuredHeight;
        hq hqVar = (hq) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (hqVar.l() != -1) {
            alignItems = hqVar.l();
        }
        int i6 = iqVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems == 2) {
                    int E3 = ((hqVar.E() + (i6 - view.getMeasuredHeight())) - hqVar.v()) / 2;
                    int i7 = this.a.getFlexWrap() != 2 ? i2 + E3 : i2 - E3;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (alignItems == 3) {
                    int flexWrap = this.a.getFlexWrap();
                    int i8 = iqVar.l;
                    if (flexWrap == 2) {
                        v2 = Math.max(view.getBaseline() + (i8 - view.getMeasuredHeight()), hqVar.v());
                        v = i2 - v2;
                        i5 = i4 - v2;
                        view.layout(i, v, i3, i5);
                    }
                    measuredHeight = Math.max(i8 - view.getBaseline(), hqVar.E());
                    v = i2 + measuredHeight;
                } else if (alignItems != 4) {
                    return;
                }
            } else if (this.a.getFlexWrap() != 2) {
                int i9 = i2 + i6;
                E = (i9 - view.getMeasuredHeight()) - hqVar.v();
                E2 = i9 - hqVar.v();
                view.layout(i, E, i3, E2);
                return;
            } else {
                v = hqVar.E() + view.getMeasuredHeight() + (i2 - i6);
                measuredHeight = view.getMeasuredHeight() + (i4 - i6);
                i4 = hqVar.E();
            }
            i5 = i4 + measuredHeight;
            view.layout(i, v, i3, i5);
        }
        if (this.a.getFlexWrap() != 2) {
            E = hqVar.E() + i2;
            E2 = hqVar.E() + i4;
            view.layout(i, E, i3, E2);
            return;
        }
        v = i2 - hqVar.v();
        v2 = hqVar.v();
        i5 = i4 - v2;
        view.layout(i, v, i3, i5);
    }

    public final void p(View view, iq iqVar, boolean z, int i, int i2, int i3, int i4) {
        int o;
        int o2;
        hq hqVar = (hq) view.getLayoutParams();
        int alignItems = this.a.getAlignItems();
        if (hqVar.l() != -1) {
            alignItems = hqVar.l();
        }
        int i5 = iqVar.g;
        if (alignItems != 0) {
            if (alignItems != 1) {
                if (alignItems != 2) {
                    if (alignItems != 3 && alignItems != 4) {
                        return;
                    }
                } else {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int marginStart = ((marginLayoutParams.getMarginStart() + (i5 - view.getMeasuredWidth())) - marginLayoutParams.getMarginEnd()) / 2;
                    if (!z) {
                        o = i + marginStart;
                        o2 = i3 + marginStart;
                    } else {
                        o = i - marginStart;
                        o2 = i3 - marginStart;
                    }
                    view.layout(o, i2, o2, i4);
                }
            } else if (!z) {
                o = ((i + i5) - view.getMeasuredWidth()) - hqVar.o();
                i3 = (i3 + i5) - view.getMeasuredWidth();
                o2 = i3 - hqVar.o();
                view.layout(o, i2, o2, i4);
            } else {
                int y = hqVar.y();
                view.layout(hqVar.y() + view.getMeasuredWidth() + (i - i5), i2, y + view.getMeasuredWidth() + (i3 - i5), i4);
                return;
            }
        }
        if (!z) {
            view.layout(hqVar.y() + i, i2, hqVar.y() + i3, i4);
            return;
        }
        o = i - hqVar.o();
        o2 = i3 - hqVar.o();
        view.layout(o, i2, o2, i4);
    }

    public final void q(int i, int i2, iq iqVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = iqVar.e;
        float f = iqVar.k;
        float f2 = 0.0f;
        if (f <= 0.0f || i3 > i9) {
            return;
        }
        float f3 = (i9 - i3) / f;
        iqVar.e = i4 + iqVar.f;
        if (!z) {
            iqVar.g = RecyclerView.UNDEFINED_DURATION;
        }
        int i10 = 0;
        boolean z2 = false;
        int i11 = 0;
        float f4 = 0.0f;
        while (i10 < iqVar.h) {
            int i12 = iqVar.o + i10;
            View g = this.a.g(i12);
            if (g == null || g.getVisibility() == 8) {
                i5 = i9;
                i6 = i10;
            } else {
                hq hqVar = (hq) g.getLayoutParams();
                int flexDirection = this.a.getFlexDirection();
                if (flexDirection == 0 || flexDirection == 1) {
                    i5 = i9;
                    i6 = i10;
                    int measuredWidth = g.getMeasuredWidth();
                    long[] jArr = this.e;
                    if (jArr != null) {
                        measuredWidth = (int) jArr[i12];
                    }
                    int measuredHeight = g.getMeasuredHeight();
                    long[] jArr2 = this.e;
                    if (jArr2 != null) {
                        measuredHeight = (int) (jArr2[i12] >> 32);
                    }
                    if (!this.b[i12] && hqVar.m() > 0.0f) {
                        float m = measuredWidth - (hqVar.m() * f3);
                        if (i6 == iqVar.h - 1) {
                            m += f4;
                            f4 = 0.0f;
                        }
                        int round = Math.round(m);
                        if (round < hqVar.r()) {
                            i8 = hqVar.r();
                            this.b[i12] = true;
                            iqVar.k -= hqVar.m();
                            z2 = true;
                        } else {
                            float f5 = (m - round) + f4;
                            double d = f5;
                            if (d > 1.0d) {
                                round++;
                                f5 -= 1.0f;
                            } else if (d < -1.0d) {
                                round--;
                                f5 += 1.0f;
                            }
                            f4 = f5;
                            i8 = round;
                        }
                        int m2 = m(i2, hqVar, iqVar.m);
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        g.measure(makeMeasureSpec, m2);
                        int measuredWidth2 = g.getMeasuredWidth();
                        int measuredHeight2 = g.getMeasuredHeight();
                        v(g, i12, makeMeasureSpec, m2);
                        this.a.h(g, i12);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int max = Math.max(i11, this.a.k(g) + hqVar.v() + hqVar.E() + measuredHeight);
                    iqVar.e = hqVar.o() + hqVar.y() + measuredWidth + iqVar.e;
                    i7 = max;
                } else {
                    int measuredHeight3 = g.getMeasuredHeight();
                    long[] jArr3 = this.e;
                    if (jArr3 != null) {
                        measuredHeight3 = (int) (jArr3[i12] >> 32);
                    }
                    int measuredWidth3 = g.getMeasuredWidth();
                    long[] jArr4 = this.e;
                    if (jArr4 != null) {
                        measuredWidth3 = (int) jArr4[i12];
                    }
                    if (this.b[i12] || hqVar.m() <= f2) {
                        i5 = i9;
                        i6 = i10;
                    } else {
                        float m3 = measuredHeight3 - (hqVar.m() * f3);
                        if (i10 == iqVar.h - 1) {
                            m3 += f4;
                            f4 = 0.0f;
                        }
                        int round2 = Math.round(m3);
                        if (round2 < hqVar.q()) {
                            int q = hqVar.q();
                            this.b[i12] = true;
                            iqVar.k -= hqVar.m();
                            i6 = i10;
                            round2 = q;
                            z2 = true;
                            i5 = i9;
                        } else {
                            float f6 = (m3 - round2) + f4;
                            i5 = i9;
                            i6 = i10;
                            double d2 = f6;
                            if (d2 > 1.0d) {
                                round2++;
                                f6 -= 1.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f6 += 1.0f;
                            }
                            f4 = f6;
                        }
                        int n = n(i, hqVar, iqVar.m);
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, 1073741824);
                        g.measure(n, makeMeasureSpec2);
                        measuredWidth3 = g.getMeasuredWidth();
                        int measuredHeight4 = g.getMeasuredHeight();
                        v(g, i12, n, makeMeasureSpec2);
                        this.a.h(g, i12);
                        measuredHeight3 = measuredHeight4;
                    }
                    i7 = Math.max(i11, this.a.k(g) + hqVar.o() + hqVar.y() + measuredWidth3);
                    iqVar.e = hqVar.v() + hqVar.E() + measuredHeight3 + iqVar.e;
                }
                iqVar.g = Math.max(iqVar.g, i7);
                i11 = i7;
            }
            i10 = i6 + 1;
            i9 = i5;
            f2 = 0.0f;
        }
        int i13 = i9;
        if (!z2 || i13 == iqVar.e) {
            return;
        }
        q(i, i2, iqVar, i3, i4, true);
    }

    public final void s(View view, int i, int i2) {
        hq hqVar = (hq) view.getLayoutParams();
        int min = Math.min(Math.max(((i - hqVar.y()) - hqVar.o()) - this.a.k(view), hqVar.r()), hqVar.D());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) (jArr[i2] >> 32) : view.getMeasuredHeight(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        v(view, i2, makeMeasureSpec2, makeMeasureSpec);
        this.a.h(view, i2);
    }

    public final void t(View view, int i, int i2) {
        hq hqVar = (hq) view.getLayoutParams();
        int min = Math.min(Math.max(((i - hqVar.E()) - hqVar.v()) - this.a.k(view), hqVar.q()), hqVar.t());
        long[] jArr = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? (int) jArr[i2] : view.getMeasuredWidth(), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        v(view, i2, makeMeasureSpec, makeMeasureSpec2);
        this.a.h(view, i2);
    }

    public final void u(int i) {
        int i2;
        View g;
        if (i >= this.a.getFlexItemCount()) {
            return;
        }
        int flexDirection = this.a.getFlexDirection();
        if (this.a.getAlignItems() == 4) {
            int[] iArr = this.c;
            if (iArr != null) {
                i2 = iArr[i];
            } else {
                i2 = 0;
            }
            List<iq> flexLinesInternal = this.a.getFlexLinesInternal();
            int size = flexLinesInternal.size();
            while (i2 < size) {
                iq iqVar = flexLinesInternal.get(i2);
                int i3 = iqVar.h;
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = iqVar.o + i4;
                    if (i4 < this.a.getFlexItemCount() && (g = this.a.g(i5)) != null && g.getVisibility() != 8) {
                        hq hqVar = (hq) g.getLayoutParams();
                        if (hqVar.l() == -1 || hqVar.l() == 4) {
                            if (flexDirection != 0 && flexDirection != 1) {
                                if (flexDirection != 2 && flexDirection != 3) {
                                    throw new IllegalArgumentException(k6.a("Invalid flex direction: ", flexDirection));
                                }
                                s(g, iqVar.g, i5);
                            } else {
                                t(g, iqVar.g, i5);
                            }
                        }
                    }
                }
                i2++;
            }
            return;
        }
        for (iq iqVar2 : this.a.getFlexLinesInternal()) {
            Iterator it = iqVar2.n.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                View g2 = this.a.g(num.intValue());
                if (flexDirection != 0 && flexDirection != 1) {
                    if (flexDirection != 2 && flexDirection != 3) {
                        throw new IllegalArgumentException(k6.a("Invalid flex direction: ", flexDirection));
                    }
                    s(g2, iqVar2.g, num.intValue());
                } else {
                    t(g2, iqVar2.g, num.intValue());
                }
            }
        }
    }

    public final void v(View view, int i, int i2, int i3) {
        long[] jArr = this.d;
        if (jArr != null) {
            jArr[i] = (i2 & 4294967295L) | (i3 << 32);
        }
        long[] jArr2 = this.e;
        if (jArr2 != null) {
            jArr2[i] = (4294967295L & view.getMeasuredWidth()) | (view.getMeasuredHeight() << 32);
        }
    }
}