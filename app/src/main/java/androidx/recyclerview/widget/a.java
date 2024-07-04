package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;
import java.util.ArrayList;

public final class a implements q.a {
    public final InterfaceC0009a d;
    public hf0 a = new hf0(30);
    public final ArrayList<b> b = new ArrayList<>();
    public final ArrayList<b> c = new ArrayList<>();
    public int f = 0;
    public final q e = new q(this);

    /* renamed from: androidx.recyclerview.widget.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0009a {
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
        public int a;
        public int b;
        public Object c;
        public int d;

        public b(Object obj, int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.d = i3;
            this.c = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.a;
            if (i != bVar.a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == bVar.b && this.b == bVar.d) {
                return true;
            }
            if (this.d == bVar.d && this.b == bVar.b) {
                Object obj2 = this.c;
                Object obj3 = bVar.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.d;
        }

        public final String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.a;
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            str = "??";
                        } else {
                            str = "mv";
                        }
                    } else {
                        str = "up";
                    }
                } else {
                    str = "rm";
                }
            } else {
                str = "add";
            }
            sb.append(str);
            sb.append(",s:");
            sb.append(this.b);
            sb.append("c:");
            sb.append(this.d);
            sb.append(",p:");
            sb.append(this.c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(RecyclerView.f fVar) {
        this.d = fVar;
    }

    public final boolean a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                if (f(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        int size = this.c.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.f) this.d).a(this.c.get(i));
        }
        k(this.c);
        this.f = 0;
    }

    public final void c() {
        b();
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.b.get(i);
            int i2 = bVar.a;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            ((RecyclerView.f) this.d).a(bVar);
                            RecyclerView.f fVar = (RecyclerView.f) this.d;
                            RecyclerView.this.offsetPositionRecordsForMove(bVar.b, bVar.d);
                            RecyclerView.this.mItemsAddedOrRemoved = true;
                        }
                    } else {
                        ((RecyclerView.f) this.d).a(bVar);
                        RecyclerView.f fVar2 = (RecyclerView.f) this.d;
                        RecyclerView.this.viewRangeUpdate(bVar.b, bVar.d, bVar.c);
                        RecyclerView.this.mItemsChanged = true;
                    }
                } else {
                    ((RecyclerView.f) this.d).a(bVar);
                    InterfaceC0009a interfaceC0009a = this.d;
                    int i3 = bVar.b;
                    int i4 = bVar.d;
                    RecyclerView.f fVar3 = (RecyclerView.f) interfaceC0009a;
                    RecyclerView.this.offsetPositionRecordsForRemove(i3, i4, true);
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mItemsAddedOrRemoved = true;
                    recyclerView.mState.c += i4;
                }
            } else {
                ((RecyclerView.f) this.d).a(bVar);
                RecyclerView.f fVar4 = (RecyclerView.f) this.d;
                RecyclerView.this.offsetPositionRecordsForInsert(bVar.b, bVar.d);
                RecyclerView.this.mItemsAddedOrRemoved = true;
            }
        }
        k(this.b);
        this.f = 0;
    }

    public final void d(b bVar) {
        int i;
        boolean z;
        int i2 = bVar.a;
        if (i2 != 1 && i2 != 8) {
            int l = l(bVar.b, i2);
            int i3 = bVar.b;
            int i4 = bVar.a;
            if (i4 != 2) {
                if (i4 == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + bVar);
                }
            } else {
                i = 0;
            }
            int i5 = 1;
            for (int i6 = 1; i6 < bVar.d; i6++) {
                int l2 = l((i * i6) + bVar.b, bVar.a);
                int i7 = bVar.a;
                if (i7 == 2 ? l2 == l : !(i7 != 4 || l2 != l + 1)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i5++;
                } else {
                    b h = h(bVar.c, i7, l, i5);
                    e(h, i3);
                    h.c = null;
                    this.a.b(h);
                    if (bVar.a == 4) {
                        i3 += i5;
                    }
                    l = l2;
                    i5 = 1;
                }
            }
            Object obj = bVar.c;
            bVar.c = null;
            this.a.b(bVar);
            if (i5 > 0) {
                b h2 = h(obj, bVar.a, l, i5);
                e(h2, i3);
                h2.c = null;
                this.a.b(h2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public final void e(b bVar, int i) {
        ((RecyclerView.f) this.d).a(bVar);
        int i2 = bVar.a;
        if (i2 != 2) {
            if (i2 == 4) {
                RecyclerView.f fVar = (RecyclerView.f) this.d;
                RecyclerView.this.viewRangeUpdate(i, bVar.d, bVar.c);
                RecyclerView.this.mItemsChanged = true;
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        InterfaceC0009a interfaceC0009a = this.d;
        int i3 = bVar.d;
        RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0009a;
        RecyclerView.this.offsetPositionRecordsForRemove(i, i3, true);
        RecyclerView recyclerView = RecyclerView.this;
        recyclerView.mItemsAddedOrRemoved = true;
        recyclerView.mState.c += i3;
    }

    public final int f(int i, int i2) {
        int size = this.c.size();
        while (i2 < size) {
            b bVar = this.c.get(i2);
            int i3 = bVar.a;
            if (i3 == 8) {
                int i4 = bVar.b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    public final boolean g() {
        return this.b.size() > 0;
    }

    public final b h(Object obj, int i, int i2, int i3) {
        b bVar = (b) this.a.a();
        if (bVar == null) {
            return new b(obj, i, i2, i3);
        }
        bVar.a = i;
        bVar.b = i2;
        bVar.d = i3;
        bVar.c = obj;
        return bVar;
    }

    public final void i(b bVar) {
        this.c.add(bVar);
        int i = bVar.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        InterfaceC0009a interfaceC0009a = this.d;
                        RecyclerView.f fVar = (RecyclerView.f) interfaceC0009a;
                        RecyclerView.this.offsetPositionRecordsForMove(bVar.b, bVar.d);
                        RecyclerView.this.mItemsAddedOrRemoved = true;
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + bVar);
                }
                InterfaceC0009a interfaceC0009a2 = this.d;
                RecyclerView.f fVar2 = (RecyclerView.f) interfaceC0009a2;
                RecyclerView.this.viewRangeUpdate(bVar.b, bVar.d, bVar.c);
                RecyclerView.this.mItemsChanged = true;
                return;
            }
            InterfaceC0009a interfaceC0009a3 = this.d;
            RecyclerView.f fVar3 = (RecyclerView.f) interfaceC0009a3;
            RecyclerView.this.offsetPositionRecordsForRemove(bVar.b, bVar.d, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
            return;
        }
        InterfaceC0009a interfaceC0009a4 = this.d;
        RecyclerView.f fVar4 = (RecyclerView.f) interfaceC0009a4;
        RecyclerView.this.offsetPositionRecordsForInsert(bVar.b, bVar.d);
        RecyclerView.this.mItemsAddedOrRemoved = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019d, code lost:
        if (r11.b == r11.d) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x019f, code lost:
        r2.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a3, code lost:
        r2.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a6, code lost:
        if (r4 == null) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a8, code lost:
        r2.add(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0165, code lost:
        if (r5 > r12.b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018f, code lost:
        if (r5 >= r12.b) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0191, code lost:
        r11.d = r5 - r12.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0196, code lost:
        r2.set(r3, r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x013c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        int i;
        boolean z;
        char c;
        b h;
        int i2;
        int i3;
        b h2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        b h3;
        int i6;
        int i7;
        q qVar = this.e;
        ArrayList<b> arrayList = this.b;
        qVar.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z5 = false;
            while (true) {
                i = 8;
                if (size >= 0) {
                    if (arrayList.get(size).a == 8) {
                        if (z5) {
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                    size--;
                } else {
                    size = -1;
                    break;
                }
            }
            if (size == -1) {
                break;
            }
            int i8 = size + 1;
            b bVar = arrayList.get(size);
            b bVar2 = arrayList.get(i8);
            int i9 = bVar2.a;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 == 4) {
                        int i10 = bVar.d;
                        int i11 = bVar2.b;
                        if (i10 < i11) {
                            bVar2.b = i11 - 1;
                        } else {
                            int i12 = bVar2.d;
                            if (i10 < i11 + i12) {
                                bVar2.d = i12 - 1;
                                h = ((a) qVar.a).h(bVar2.c, 4, bVar.b, 1);
                                i2 = bVar.b;
                                i3 = bVar2.b;
                                if (i2 > i3) {
                                    bVar2.b = i3 + 1;
                                } else {
                                    int i13 = i3 + bVar2.d;
                                    if (i2 < i13) {
                                        int i14 = i13 - i2;
                                        h2 = ((a) qVar.a).h(bVar2.c, 4, i2 + 1, i14);
                                        bVar2.d -= i14;
                                        arrayList.set(i8, bVar);
                                        if (bVar2.d > 0) {
                                            arrayList.set(size, bVar2);
                                        } else {
                                            arrayList.remove(size);
                                            a aVar = (a) qVar.a;
                                            aVar.getClass();
                                            bVar2.c = null;
                                            aVar.a.b(bVar2);
                                        }
                                        if (h != null) {
                                            arrayList.add(size, h);
                                        }
                                        if (h2 != null) {
                                            arrayList.add(size, h2);
                                        }
                                    }
                                }
                                h2 = null;
                                arrayList.set(i8, bVar);
                                if (bVar2.d > 0) {
                                }
                                if (h != null) {
                                }
                                if (h2 != null) {
                                }
                            }
                        }
                        h = null;
                        i2 = bVar.b;
                        i3 = bVar2.b;
                        if (i2 > i3) {
                        }
                        h2 = null;
                        arrayList.set(i8, bVar);
                        if (bVar2.d > 0) {
                        }
                        if (h != null) {
                        }
                        if (h2 != null) {
                        }
                    }
                } else {
                    int i15 = bVar.b;
                    int i16 = bVar.d;
                    int i17 = bVar2.b;
                    if (i15 < i16) {
                        if (i17 == i15 && bVar2.d == i16 - i15) {
                            z4 = false;
                            z3 = z4;
                            z2 = true;
                            if (i16 >= i17) {
                            }
                            i4 = bVar.b;
                            i5 = bVar2.b;
                            if (i4 > i5) {
                            }
                            h3 = null;
                            if (z2) {
                            }
                        } else {
                            z2 = false;
                            z3 = false;
                            if (i16 >= i17) {
                                bVar2.b = i17 - 1;
                            } else {
                                int i18 = bVar2.d;
                                if (i16 < i17 + i18) {
                                    bVar2.d = i18 - 1;
                                    bVar.a = 2;
                                    bVar.d = 1;
                                    if (bVar2.d == 0) {
                                        arrayList.remove(i8);
                                        a aVar2 = (a) qVar.a;
                                        aVar2.getClass();
                                        bVar2.c = null;
                                        aVar2.a.b(bVar2);
                                    }
                                }
                            }
                            i4 = bVar.b;
                            i5 = bVar2.b;
                            if (i4 > i5) {
                                bVar2.b = i5 + 1;
                            } else {
                                int i19 = i5 + bVar2.d;
                                if (i4 < i19) {
                                    h3 = ((a) qVar.a).h(null, 2, i4 + 1, i19 - i4);
                                    bVar2.d = bVar.b - bVar2.b;
                                    if (z2) {
                                        arrayList.set(size, bVar2);
                                        arrayList.remove(i8);
                                        a aVar3 = (a) qVar.a;
                                        aVar3.getClass();
                                        bVar.c = null;
                                        aVar3.a.b(bVar);
                                    } else if (z3) {
                                        if (h3 != null) {
                                            int i20 = bVar.b;
                                            if (i20 > h3.b) {
                                                bVar.b = i20 - h3.d;
                                            }
                                            int i21 = bVar.d;
                                            if (i21 > h3.b) {
                                                bVar.d = i21 - h3.d;
                                            }
                                        }
                                        int i22 = bVar.b;
                                        if (i22 > bVar2.b) {
                                            bVar.b = i22 - bVar2.d;
                                        }
                                        i6 = bVar.d;
                                    } else {
                                        if (h3 != null) {
                                            int i23 = bVar.b;
                                            if (i23 >= h3.b) {
                                                bVar.b = i23 - h3.d;
                                            }
                                            int i24 = bVar.d;
                                            if (i24 >= h3.b) {
                                                bVar.d = i24 - h3.d;
                                            }
                                        }
                                        int i25 = bVar.b;
                                        if (i25 >= bVar2.b) {
                                            bVar.b = i25 - bVar2.d;
                                        }
                                        i6 = bVar.d;
                                    }
                                }
                            }
                            h3 = null;
                            if (z2) {
                            }
                        }
                    } else if (i17 == i16 + 1 && bVar2.d == i15 - i16) {
                        z4 = true;
                        z3 = z4;
                        z2 = true;
                        if (i16 >= i17) {
                        }
                        i4 = bVar.b;
                        i5 = bVar2.b;
                        if (i4 > i5) {
                        }
                        h3 = null;
                        if (z2) {
                        }
                    } else {
                        z2 = false;
                        z3 = true;
                        if (i16 >= i17) {
                        }
                        i4 = bVar.b;
                        i5 = bVar2.b;
                        if (i4 > i5) {
                        }
                        h3 = null;
                        if (z2) {
                        }
                    }
                }
            } else {
                int i26 = bVar.d;
                int i27 = bVar2.b;
                if (i26 < i27) {
                    i7 = -1;
                } else {
                    i7 = 0;
                }
                int i28 = bVar.b;
                if (i28 < i27) {
                    i7++;
                }
                if (i27 <= i28) {
                    bVar.b = i28 + bVar2.d;
                }
                int i29 = bVar2.b;
                if (i29 <= i26) {
                    bVar.d = i26 + bVar2.d;
                }
                bVar2.b = i29 + i7;
                arrayList.set(size, bVar2);
                arrayList.set(i8, bVar);
            }
        }
        int size2 = this.b.size();
        int i30 = 0;
        while (i30 < size2) {
            b bVar3 = this.b.get(i30);
            int i31 = bVar3.a;
            if (i31 != 1) {
                if (i31 != 2) {
                    if (i31 != 4) {
                        if (i31 == i) {
                            i(bVar3);
                        }
                    } else {
                        int i32 = bVar3.b;
                        int i33 = bVar3.d + i32;
                        int i34 = i32;
                        int i35 = 0;
                        char c2 = 65535;
                        while (i32 < i33) {
                            RecyclerView.f fVar = (RecyclerView.f) this.d;
                            RecyclerView.d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i32, true);
                            if (findViewHolderForPosition == null || RecyclerView.this.mChildHelper.k(findViewHolderForPosition.P)) {
                                findViewHolderForPosition = null;
                            }
                            if (findViewHolderForPosition == null && !a(i32)) {
                                if (c2 == 1) {
                                    i(h(bVar3.c, 4, i34, i35));
                                    i34 = i32;
                                    i35 = 0;
                                }
                                c2 = 0;
                            } else {
                                if (c2 == 0) {
                                    d(h(bVar3.c, 4, i34, i35));
                                    i34 = i32;
                                    i35 = 0;
                                }
                                c2 = 1;
                            }
                            i35++;
                            i32++;
                        }
                        if (i35 != bVar3.d) {
                            Object obj = bVar3.c;
                            bVar3.c = null;
                            this.a.b(bVar3);
                            bVar3 = h(obj, 4, i34, i35);
                        }
                        if (c2 == 0) {
                            d(bVar3);
                        } else {
                            i(bVar3);
                        }
                    }
                } else {
                    int i36 = bVar3.b;
                    int i37 = bVar3.d + i36;
                    int i38 = i36;
                    int i39 = 0;
                    char c3 = 65535;
                    while (i38 < i37) {
                        RecyclerView.f fVar2 = (RecyclerView.f) this.d;
                        RecyclerView.d0 findViewHolderForPosition2 = RecyclerView.this.findViewHolderForPosition(i38, true);
                        if (findViewHolderForPosition2 == null || RecyclerView.this.mChildHelper.k(findViewHolderForPosition2.P)) {
                            findViewHolderForPosition2 = null;
                        }
                        if (findViewHolderForPosition2 == null && !a(i38)) {
                            if (c3 == 1) {
                                i(h(null, 2, i36, i39));
                                z = true;
                            } else {
                                z = false;
                            }
                            c = 0;
                        } else {
                            if (c3 == 0) {
                                d(h(null, 2, i36, i39));
                                z = true;
                            } else {
                                z = false;
                            }
                            c = 1;
                        }
                        if (z) {
                            i38 -= i39;
                            i37 -= i39;
                            i39 = 1;
                        } else {
                            i39++;
                        }
                        i38++;
                        c3 = c;
                    }
                    if (i39 != bVar3.d) {
                        bVar3.c = null;
                        this.a.b(bVar3);
                        bVar3 = h(null, 2, i36, i39);
                    }
                    if (c3 == 0) {
                        d(bVar3);
                    } else {
                        i(bVar3);
                    }
                }
            } else {
                i(bVar3);
            }
            i30++;
            i = 8;
        }
        this.b.clear();
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            bVar.c = null;
            this.a.b(bVar);
        }
        arrayList.clear();
    }

    public final int l(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.c.size() - 1; size >= 0; size--) {
            b bVar = this.c.get(size);
            int i9 = bVar.a;
            if (i9 == 8) {
                int i10 = bVar.b;
                int i11 = bVar.d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i >= i5 && i <= i4) {
                    if (i5 == i10) {
                        if (i2 == 1) {
                            i8 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i8 = i11 - 1;
                            }
                            i++;
                        }
                        bVar.d = i8;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i7 = i10 + 1;
                        } else {
                            if (i2 == 2) {
                                i7 = i10 - 1;
                            }
                            i--;
                        }
                        bVar.b = i7;
                        i--;
                    }
                } else if (i < i10) {
                    if (i2 == 1) {
                        bVar.b = i10 + 1;
                        i6 = i11 + 1;
                    } else if (i2 == 2) {
                        bVar.b = i10 - 1;
                        i6 = i11 - 1;
                    }
                    bVar.d = i6;
                }
            } else {
                int i12 = bVar.b;
                if (i12 <= i) {
                    if (i9 == 1) {
                        i -= bVar.d;
                    } else if (i9 == 2) {
                        i += bVar.d;
                    }
                } else {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.b = i3;
                }
            }
        }
        for (int size2 = this.c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.c.get(size2);
            if (bVar2.a == 8) {
                int i13 = bVar2.d;
                if (i13 != bVar2.b && i13 >= 0) {
                }
                this.c.remove(size2);
                bVar2.c = null;
                this.a.b(bVar2);
            } else {
                if (bVar2.d > 0) {
                }
                this.c.remove(size2);
                bVar2.c = null;
                this.a.b(bVar2);
            }
        }
        return i;
    }
}