package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public final class m implements Runnable {
    public static final ThreadLocal<m> T = new ThreadLocal<>();
    public static a U = new a();
    public long Q;
    public long R;
    public ArrayList<RecyclerView> P = new ArrayList<>();
    public ArrayList<c> S = new ArrayList<>();

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
            if (r0 == null) goto L11;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r0 != false) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0022, code lost:
            r1 = -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
            return r1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.d;
            int i = 1;
            if ((recyclerView == null) == (cVar4.d == null)) {
                boolean z = cVar3.a;
                if (z == cVar4.a) {
                    int i2 = cVar4.b - cVar3.b;
                    if (i2 != 0) {
                        return i2;
                    }
                    int i3 = cVar3.c - cVar4.c;
                    if (i3 != 0) {
                        return i3;
                    }
                    return 0;
                }
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b implements RecyclerView.o.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        public final void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.d * 2;
            int[] iArr = this.c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.d++;
        }

        public final void b(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.Y) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.g()) {
                        oVar.t(recyclerView.mAdapter.d(), this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.s(this.a, this.b, recyclerView.mState, this);
                }
                int i = this.d;
                if (i > oVar.Z) {
                    oVar.Z = i;
                    oVar.a0 = z;
                    recyclerView.mRecycler.l();
                }
            }
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public static RecyclerView.d0 d(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.mChildHelper.h();
        int i2 = 0;
        while (true) {
            if (i2 < h) {
                RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(i2));
                if (childViewHolderInt.R == i && !childViewHolderInt.q()) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 j2 = vVar.j(i, j);
            if (j2 != null) {
                if (j2.p() && !j2.q()) {
                    vVar.g(j2.P);
                } else {
                    vVar.a(j2, false);
                }
            }
            return j2;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.Q == 0) {
            this.Q = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.a = i;
        bVar.b = i2;
    }

    public final void c(long j) {
        c cVar;
        RecyclerView recyclerView;
        long j2;
        RecyclerView recyclerView2;
        c cVar2;
        boolean z;
        int size = this.P.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.P.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.mPrefetchRegistry.b(recyclerView3, false);
                i += recyclerView3.mPrefetchRegistry.d;
            }
        }
        this.S.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.P.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.mPrefetchRegistry;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.S.size()) {
                        cVar2 = new c();
                        this.S.add(cVar2);
                    } else {
                        cVar2 = this.S.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar2.a = z;
                    cVar2.b = abs;
                    cVar2.c = i6;
                    cVar2.d = recyclerView4;
                    cVar2.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.S, U);
        for (int i7 = 0; i7 < this.S.size() && (recyclerView = (cVar = this.S.get(i7)).d) != null; i7++) {
            if (cVar.a) {
                j2 = RecyclerView.FOREVER_NS;
            } else {
                j2 = j;
            }
            RecyclerView.d0 d = d(recyclerView, cVar.e, j2);
            if (d != null && d.Q != null && d.p() && !d.q() && (recyclerView2 = d.Q.get()) != null) {
                if (recyclerView2.mDataSetHasChangedAfterLayout && recyclerView2.mChildHelper.h() != 0) {
                    recyclerView2.removeAndRecycleViews();
                }
                b bVar2 = recyclerView2.mPrefetchRegistry;
                bVar2.b(recyclerView2, true);
                if (bVar2.d != 0) {
                    try {
                        int i8 = k01.a;
                        Trace.beginSection(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                        RecyclerView.a0 a0Var = recyclerView2.mState;
                        RecyclerView.g gVar = recyclerView2.mAdapter;
                        a0Var.d = 1;
                        a0Var.e = gVar.d();
                        a0Var.g = false;
                        a0Var.h = false;
                        a0Var.i = false;
                        for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                            d(recyclerView2, bVar2.c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = k01.a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.a = false;
            cVar.b = 0;
            cVar.c = 0;
            cVar.d = null;
            cVar.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = k01.a;
            Trace.beginSection(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.P.isEmpty()) {
                this.Q = 0L;
                Trace.endSection();
                return;
            }
            int size = this.P.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.P.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.Q = 0L;
                Trace.endSection();
                return;
            }
            c(TimeUnit.MILLISECONDS.toNanos(j) + this.R);
            this.Q = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.Q = 0L;
            int i3 = k01.a;
            Trace.endSection();
            throw th;
        }
    }
}