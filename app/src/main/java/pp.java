package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.oq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* renamed from: pp  reason: default package */
public abstract class pp extends h0 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);
    public static final a o = new a();
    public static final b p = new b();
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = RecyclerView.UNDEFINED_DURATION;
    public int l = RecyclerView.UNDEFINED_DURATION;
    public int m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: pp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a implements oq.a<s0> {
    }

    /* renamed from: pp$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
    }

    /* renamed from: pp$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c extends v0 {
        public c() {
        }

        @Override // defpackage.v0
        public final s0 a(int i) {
            return new s0(AccessibilityNodeInfo.obtain(pp.this.n(i).a));
        }

        @Override // defpackage.v0
        public final s0 b(int i) {
            int i2 = i == 2 ? pp.this.k : pp.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // defpackage.v0
        public final boolean c(int i, int i2, Bundle bundle) {
            int i3;
            pp ppVar = pp.this;
            if (i != -1) {
                boolean z = true;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 64) {
                            if (i2 != 128) {
                                return ppVar.o(i, i2);
                            }
                            if (ppVar.k == i) {
                                ppVar.k = RecyclerView.UNDEFINED_DURATION;
                                ppVar.i.invalidate();
                                ppVar.t(i, 65536);
                            }
                            z = false;
                        } else {
                            if (ppVar.h.isEnabled() && ppVar.h.isTouchExplorationEnabled() && (i3 = ppVar.k) != i) {
                                if (i3 != Integer.MIN_VALUE) {
                                    ppVar.k = RecyclerView.UNDEFINED_DURATION;
                                    ppVar.i.invalidate();
                                    ppVar.t(i3, 65536);
                                }
                                ppVar.k = i;
                                ppVar.i.invalidate();
                                ppVar.t(i, 32768);
                            }
                            z = false;
                        }
                        return z;
                    }
                    return ppVar.j(i);
                }
                return ppVar.s(i);
            }
            View view = ppVar.i;
            WeakHashMap<View, String> weakHashMap = a41.a;
            return view.performAccessibilityAction(i2, bundle);
        }
    }

    public pp(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // defpackage.h0
    public final v0 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.h0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // defpackage.h0
    public final void d(View view, s0 s0Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, s0Var.a);
        p(s0Var);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = RecyclerView.UNDEFINED_DURATION;
        r(i, false);
        t(i, 8);
        return true;
    }

    public final s0 k(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        s0 s0Var = new s0(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        s0Var.h("android.view.View");
        Rect rect = n;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.i;
        s0Var.b = -1;
        obtain.setParent(view);
        q(i, s0Var);
        if (s0Var.f() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        s0Var.e(this.e);
        if (!this.e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(this.i.getContext().getPackageName());
                    View view2 = this.i;
                    s0Var.c = i;
                    obtain.setSource(view2, i);
                    boolean z2 = false;
                    if (this.k == i) {
                        obtain.setAccessibilityFocused(true);
                        s0Var.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        s0Var.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        s0Var.a(2);
                    } else if (obtain.isFocusable()) {
                        s0Var.a(1);
                    }
                    obtain.setFocused(z);
                    this.i.getLocationOnScreen(this.g);
                    obtain.getBoundsInScreen(this.d);
                    if (this.d.equals(rect)) {
                        s0Var.e(this.d);
                        if (s0Var.b != -1) {
                            s0 s0Var2 = new s0(AccessibilityNodeInfo.obtain());
                            for (int i2 = s0Var.b; i2 != -1; i2 = s0Var2.b) {
                                View view3 = this.i;
                                s0Var2.b = -1;
                                s0Var2.a.setParent(view3, -1);
                                s0Var2.a.setBoundsInParent(n);
                                q(i2, s0Var2);
                                s0Var2.e(this.e);
                                Rect rect2 = this.d;
                                Rect rect3 = this.e;
                                rect2.offset(rect3.left, rect3.top);
                            }
                            s0Var2.a.recycle();
                        }
                        this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    }
                    if (this.i.getLocalVisibleRect(this.f)) {
                        this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                        if (this.d.intersect(this.f)) {
                            s0Var.a.setBoundsInScreen(this.d);
                            Rect rect4 = this.d;
                            if (rect4 != null && !rect4.isEmpty() && this.i.getWindowVisibility() == 0) {
                                View view4 = this.i;
                                while (true) {
                                    ViewParent parent = view4.getParent();
                                    if (parent instanceof View) {
                                        view4 = (View) parent;
                                        if (view4.getAlpha() <= 0.0f) {
                                            break;
                                        } else if (view4.getVisibility() != 0) {
                                            break;
                                        }
                                    } else if (parent != null) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                s0Var.a.setVisibleToUser(true);
                            }
                        }
                    }
                    return s0Var;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m(int i, Rect rect) {
        s0 s0Var;
        boolean z;
        Object obj;
        s0 s0Var2;
        int lastIndexOf;
        int i2;
        int width;
        int f;
        int i3;
        boolean z2;
        int height;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        nt0 nt0Var = new nt0();
        int i4 = 0;
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            nt0Var.e(i5, k(i5));
        }
        int i6 = this.l;
        if (i6 == Integer.MIN_VALUE) {
            s0Var = null;
        } else {
            s0Var = (s0) nt0Var.d(i6, null);
        }
        int i7 = -1;
        if (i != 1 && i != 2) {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i8 = this.l;
            if (i8 != Integer.MIN_VALUE) {
                n(i8).e(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view = this.i;
                int width2 = view.getWidth();
                int height2 = view.getHeight();
                if (i != 17) {
                    if (i != 33) {
                        if (i != 66) {
                            if (i == 130) {
                                rect2.set(0, -1, width2, -1);
                            } else {
                                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            }
                        } else {
                            rect2.set(-1, 0, -1, height2);
                        }
                    } else {
                        rect2.set(0, height2, width2, height2);
                    }
                } else {
                    rect2.set(width2, 0, width2, height2);
                }
            }
            b bVar = p;
            a aVar = o;
            Rect rect3 = new Rect(rect2);
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i == 130) {
                            height = -(rect2.height() + 1);
                        } else {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                    } else {
                        width = -(rect2.width() + 1);
                    }
                } else {
                    height = rect2.height() + 1;
                }
                rect3.offset(0, height);
                bVar.getClass();
                f = nt0Var.f();
                Rect rect4 = new Rect();
                s0Var2 = null;
                for (i3 = 0; i3 < f; i3++) {
                    s0 s0Var3 = (s0) nt0Var.h(i3);
                    if (s0Var3 != s0Var) {
                        aVar.getClass();
                        s0Var3.e(rect4);
                        if (oq.c(i, rect2, rect4)) {
                            if (oq.c(i, rect2, rect3) && !oq.a(i, rect2, rect4, rect3)) {
                                if (!oq.a(i, rect2, rect3, rect4)) {
                                    int d = oq.d(i, rect2, rect4);
                                    int e = oq.e(i, rect2, rect4);
                                    int i9 = (e * e) + (d * 13 * d);
                                    int d2 = oq.d(i, rect2, rect3);
                                    int e2 = oq.e(i, rect2, rect3);
                                }
                            }
                            z2 = true;
                            if (!z2) {
                                rect3.set(rect4);
                                s0Var2 = s0Var3;
                            }
                        }
                        z2 = false;
                        if (!z2) {
                        }
                    }
                }
            } else {
                width = rect2.width() + 1;
            }
            rect3.offset(width, 0);
            bVar.getClass();
            f = nt0Var.f();
            Rect rect42 = new Rect();
            s0Var2 = null;
            while (i3 < f) {
            }
        } else {
            View view2 = this.i;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (view2.getLayoutDirection() == 1) {
                z = true;
            } else {
                z = false;
            }
            b bVar2 = p;
            a aVar2 = o;
            bVar2.getClass();
            int f2 = nt0Var.f();
            ArrayList arrayList2 = new ArrayList(f2);
            for (int i10 = 0; i10 < f2; i10++) {
                arrayList2.add((s0) nt0Var.h(i10));
            }
            Collections.sort(arrayList2, new oq.b(z, aVar2));
            if (i != 1) {
                if (i == 2) {
                    int size = arrayList2.size();
                    if (s0Var == null) {
                        lastIndexOf = -1;
                    } else {
                        lastIndexOf = arrayList2.lastIndexOf(s0Var);
                    }
                    int i11 = lastIndexOf + 1;
                    if (i11 < size) {
                        obj = arrayList2.get(i11);
                        s0Var2 = (s0) obj;
                    }
                    obj = null;
                    s0Var2 = (s0) obj;
                } else {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
            } else {
                int size2 = arrayList2.size();
                if (s0Var != null) {
                    size2 = arrayList2.indexOf(s0Var);
                }
                int i12 = size2 - 1;
                if (i12 >= 0) {
                    obj = arrayList2.get(i12);
                    s0Var2 = (s0) obj;
                }
                obj = null;
                s0Var2 = (s0) obj;
            }
        }
        s0 s0Var4 = s0Var2;
        if (s0Var4 == null) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        } else {
            if (nt0Var.P) {
                nt0Var.c();
            }
            while (true) {
                if (i4 >= nt0Var.S) {
                    break;
                } else if (nt0Var.R[i4] == s0Var4) {
                    i7 = i4;
                    break;
                } else {
                    i4++;
                }
            }
            if (nt0Var.P) {
                nt0Var.c();
            }
            i2 = nt0Var.Q[i7];
        }
        return s(i2);
    }

    public final s0 n(int i) {
        if (i == -1) {
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.i);
            s0 s0Var = new s0(obtain);
            View view = this.i;
            WeakHashMap<View, String> weakHashMap = a41.a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                s0Var.a.addChild(this.i, ((Integer) arrayList.get(i2)).intValue());
            }
            return s0Var;
        }
        return k(i);
    }

    public abstract boolean o(int i, int i2);

    public void p(s0 s0Var) {
    }

    public abstract void q(int i, s0 s0Var);

    public void r(int i, boolean z) {
    }

    public final boolean s(int i) {
        int i2;
        if ((this.i.isFocused() || this.i.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                j(i2);
            }
            this.l = i;
            r(i, true);
            t(i, 8);
            return true;
        }
        return false;
    }

    public final void t(int i, int i2) {
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return;
        }
        if (i != -1) {
            obtain = AccessibilityEvent.obtain(i2);
            s0 n2 = n(i);
            obtain.getText().add(n2.f());
            obtain.setContentDescription(n2.a.getContentDescription());
            obtain.setScrollable(n2.a.isScrollable());
            obtain.setPassword(n2.a.isPassword());
            obtain.setEnabled(n2.a.isEnabled());
            obtain.setChecked(n2.a.isChecked());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(n2.a.getClassName());
            obtain.setSource(this.i, i);
            obtain.setPackageName(this.i.getContext().getPackageName());
        } else {
            obtain = AccessibilityEvent.obtain(i2);
            this.i.onInitializeAccessibilityEvent(obtain);
        }
        parent.requestSendAccessibilityEvent(this.i, obtain);
    }

    public final void u(int i) {
        int i2 = this.m;
        if (i2 == i) {
            return;
        }
        this.m = i;
        t(i, 128);
        t(i2, 256);
    }
}