package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

public final class b {
    public final InterfaceC0010b a;
    public final a b = new a();
    public final ArrayList c = new ArrayList();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        public long a = 0;
        public a b;

        public final void a(int i) {
            if (i < 64) {
                this.a &= (1 << i) ^ (-1);
                return;
            }
            a aVar = this.b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        public final int b(int i) {
            long j;
            a aVar = this.b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.a;
                    return Long.bitCount(j);
                }
            } else if (i >= 64) {
                return Long.bitCount(this.a) + aVar.b(i - 64);
            }
            j = this.a & ((1 << i) - 1);
            return Long.bitCount(j);
        }

        public final void c() {
            if (this.b == null) {
                this.b = new a();
            }
        }

        public final boolean d(int i) {
            if (i < 64) {
                return (this.a & (1 << i)) != 0;
            }
            c();
            return this.b.d(i - 64);
        }

        public final void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.b.e(i - 64, z);
                return;
            }
            long j = this.a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.a = ((j & (j2 ^ (-1))) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.b != null) {
                c();
                this.b.e(0, z2);
            }
        }

        public final boolean f(int i) {
            if (i >= 64) {
                c();
                return this.b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (j ^ (-1));
            this.a = j3;
            long j4 = j - 1;
            this.a = (j3 & j4) | Long.rotateRight((j4 ^ (-1)) & j3, 1);
            a aVar = this.b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.b.f(0);
            }
            return z;
        }

        public final void g() {
            this.a = 0L;
            a aVar = this.b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i) {
            if (i < 64) {
                this.a |= 1 << i;
                return;
            }
            c();
            this.b.h(i - 64);
        }

        public final String toString() {
            if (this.b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.b.toString() + "xx" + Long.toBinaryString(this.a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public interface InterfaceC0010b {
    }

    public b(RecyclerView.e eVar) {
        this.a = eVar;
    }

    public final void a(int i, View view, boolean z) {
        int f;
        if (i < 0) {
            f = ((RecyclerView.e) this.a).a();
        } else {
            f = f(i);
        }
        this.b.e(f, z);
        if (z) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        RecyclerView.this.addView(view, f);
        RecyclerView.this.dispatchChildAttached(view);
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int f;
        if (i < 0) {
            f = ((RecyclerView.e) this.a).a();
        } else {
            f = f(i);
        }
        this.b.e(f, z);
        if (z) {
            i(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        eVar.getClass();
        RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (!childViewHolderInt.v() && !childViewHolderInt.z()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(e5.a(RecyclerView.this, sb));
            }
            childViewHolderInt.Y &= -257;
        }
        RecyclerView.this.attachViewToParent(view, f, layoutParams);
    }

    public final void c(int i) {
        RecyclerView.d0 childViewHolderInt;
        int f = f(i);
        this.b.f(f);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        View childAt = RecyclerView.this.getChildAt(f);
        if (childAt != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) != null) {
            if (childViewHolderInt.v() && !childViewHolderInt.z()) {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(e5.a(RecyclerView.this, sb));
            }
            childViewHolderInt.c(256);
        }
        RecyclerView.this.detachViewFromParent(f);
    }

    public final View d(int i) {
        return RecyclerView.this.getChildAt(f(i));
    }

    public final int e() {
        return ((RecyclerView.e) this.a).a() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int a2 = ((RecyclerView.e) this.a).a();
        int i2 = i;
        while (i2 < a2) {
            int b = i - (i2 - this.b.b(i2));
            if (b == 0) {
                while (this.b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    public final View g(int i) {
        return RecyclerView.this.getChildAt(i);
    }

    public final int h() {
        return ((RecyclerView.e) this.a).a();
    }

    public final void i(View view) {
        this.c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        eVar.getClass();
        RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            RecyclerView recyclerView = RecyclerView.this;
            int i = childViewHolderInt.f0;
            if (i == -1) {
                View view2 = childViewHolderInt.P;
                WeakHashMap<View, String> weakHashMap = a41.a;
                i = view2.getImportantForAccessibility();
            }
            childViewHolderInt.e0 = i;
            recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild == -1 || this.b.d(indexOfChild)) {
            return -1;
        }
        return indexOfChild - this.b.b(indexOfChild);
    }

    public final boolean k(View view) {
        return this.c.contains(view);
    }

    public final void l(int i) {
        int f = f(i);
        View childAt = RecyclerView.this.getChildAt(f);
        if (childAt == null) {
            return;
        }
        if (this.b.f(f)) {
            m(childAt);
        }
        ((RecyclerView.e) this.a).b(f);
    }

    public final void m(View view) {
        if (this.c.remove(view)) {
            RecyclerView.e eVar = (RecyclerView.e) this.a;
            eVar.getClass();
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.e0);
                childViewHolderInt.e0 = 0;
            }
        }
    }

    public final String toString() {
        return this.b.toString() + ", hidden list:" + this.c.size();
    }
}