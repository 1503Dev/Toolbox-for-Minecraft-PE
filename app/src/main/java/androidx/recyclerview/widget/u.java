package androidx.recyclerview.widget;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.s0;
import java.util.WeakHashMap;

public final class u extends h0 {
    public final RecyclerView d;
    public final a e;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends h0 {
        public final u d;
        public WeakHashMap e = new WeakHashMap();

        public a(u uVar) {
            this.d = uVar;
        }

        @Override // defpackage.h0
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            h0 h0Var = (h0) this.e.get(view);
            return h0Var != null ? h0Var.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // defpackage.h0
        public final v0 b(View view) {
            h0 h0Var = (h0) this.e.get(view);
            return h0Var != null ? h0Var.b(view) : super.b(view);
        }

        @Override // defpackage.h0
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            h0 h0Var = (h0) this.e.get(view);
            if (h0Var != null) {
                h0Var.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // defpackage.h0
        public final void d(View view, s0 s0Var) {
            if (!this.d.d.hasPendingAdapterUpdates() && this.d.d.getLayoutManager() != null) {
                this.d.d.getLayoutManager().c0(view, s0Var);
                h0 h0Var = (h0) this.e.get(view);
                if (h0Var != null) {
                    h0Var.d(view, s0Var);
                    return;
                }
            }
            this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
        }

        @Override // defpackage.h0
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            h0 h0Var = (h0) this.e.get(view);
            if (h0Var != null) {
                h0Var.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // defpackage.h0
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            h0 h0Var = (h0) this.e.get(viewGroup);
            return h0Var != null ? h0Var.f(viewGroup, view, accessibilityEvent) : super.f(viewGroup, view, accessibilityEvent);
        }

        @Override // defpackage.h0
        public final boolean g(View view, int i, Bundle bundle) {
            if (!this.d.d.hasPendingAdapterUpdates() && this.d.d.getLayoutManager() != null) {
                h0 h0Var = (h0) this.e.get(view);
                if (h0Var != null) {
                    if (h0Var.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                RecyclerView.v vVar = this.d.d.getLayoutManager().Q.mRecycler;
                return false;
            }
            return super.g(view, i, bundle);
        }

        @Override // defpackage.h0
        public final void h(View view, int i) {
            h0 h0Var = (h0) this.e.get(view);
            if (h0Var != null) {
                h0Var.h(view, i);
            } else {
                super.h(view, i);
            }
        }

        @Override // defpackage.h0
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            h0 h0Var = (h0) this.e.get(view);
            if (h0Var != null) {
                h0Var.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public u(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.e;
        this.e = aVar == null ? new a(this) : aVar;
    }

    @Override // defpackage.h0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.hasPendingAdapterUpdates()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().b0(accessibilityEvent);
            }
        }
    }

    @Override // defpackage.h0
    public final void d(View view, s0 s0Var) {
        s0.b bVar;
        AccessibilityNodeInfo.CollectionInfo obtain;
        this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
        if (!this.d.hasPendingAdapterUpdates() && this.d.getLayoutManager() != null) {
            RecyclerView.o layoutManager = this.d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.Q;
            RecyclerView.v vVar = recyclerView.mRecycler;
            RecyclerView.a0 a0Var = recyclerView.mState;
            if (recyclerView.canScrollVertically(-1) || layoutManager.Q.canScrollHorizontally(-1)) {
                s0Var.a(8192);
                s0Var.a.setScrollable(true);
            }
            if (layoutManager.Q.canScrollVertically(1) || layoutManager.Q.canScrollHorizontally(1)) {
                s0Var.a(4096);
                s0Var.a.setScrollable(true);
            }
            int P = layoutManager.P(vVar, a0Var);
            int J = layoutManager.J(vVar, a0Var);
            if (Build.VERSION.SDK_INT >= 21) {
                obtain = AccessibilityNodeInfo.CollectionInfo.obtain(P, J, false, 0);
                bVar = new s0.b(obtain);
            } else {
                bVar = new s0.b(AccessibilityNodeInfo.CollectionInfo.obtain(P, J, false));
            }
            s0Var.a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) bVar.a);
        }
    }

    @Override // defpackage.h0
    public final boolean g(View view, int i, Bundle bundle) {
        int i2;
        int paddingLeft;
        int i3;
        int i4;
        if (super.g(view, i, bundle)) {
            return true;
        }
        if (this.d.hasPendingAdapterUpdates() || this.d.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.o layoutManager = this.d.getLayoutManager();
        RecyclerView recyclerView = layoutManager.Q;
        RecyclerView.v vVar = recyclerView.mRecycler;
        if (i != 4096) {
            if (i != 8192) {
                i4 = 0;
                i3 = 0;
            } else {
                if (recyclerView.canScrollVertically(-1)) {
                    i2 = -((layoutManager.e0 - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom());
                } else {
                    i2 = 0;
                }
                if (layoutManager.Q.canScrollHorizontally(-1)) {
                    paddingLeft = -((layoutManager.d0 - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight());
                    i4 = paddingLeft;
                    i3 = i2;
                }
                i3 = i2;
                i4 = 0;
            }
        } else {
            if (recyclerView.canScrollVertically(1)) {
                i2 = (layoutManager.e0 - layoutManager.getPaddingTop()) - layoutManager.getPaddingBottom();
            } else {
                i2 = 0;
            }
            if (layoutManager.Q.canScrollHorizontally(1)) {
                paddingLeft = (layoutManager.d0 - layoutManager.getPaddingLeft()) - layoutManager.getPaddingRight();
                i4 = paddingLeft;
                i3 = i2;
            }
            i3 = i2;
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        layoutManager.Q.smoothScrollBy(i4, i3, null, RecyclerView.UNDEFINED_DURATION, true);
        return true;
    }
}