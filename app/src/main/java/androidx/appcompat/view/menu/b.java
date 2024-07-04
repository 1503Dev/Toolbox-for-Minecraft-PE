package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class b extends x50 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int q0 = ni0.abc_cascading_menu_item_layout;
    public final Context Q;
    public final int R;
    public final int S;
    public final int T;
    public final boolean U;
    public final Handler V;
    public View d0;
    public View e0;
    public int f0;
    public boolean g0;
    public boolean h0;
    public int i0;
    public int j0;
    public boolean l0;
    public k.a m0;
    public ViewTreeObserver n0;
    public PopupWindow.OnDismissListener o0;
    public boolean p0;
    public final ArrayList W = new ArrayList();
    public final ArrayList X = new ArrayList();
    public final a Y = new a();
    public final View$OnAttachStateChangeListenerC0002b Z = new View$OnAttachStateChangeListenerC0002b();
    public final c a0 = new c();
    public int b0 = 0;
    public int c0 = 0;
    public boolean k0 = false;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (b.this.c() && b.this.X.size() > 0 && !((d) b.this.X.get(0)).a.m0) {
                View view = b.this.e0;
                if (view != null && view.isShown()) {
                    Iterator it = b.this.X.iterator();
                    while (it.hasNext()) {
                        ((d) it.next()).a.a();
                    }
                    return;
                }
                b.this.dismiss();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class View$OnAttachStateChangeListenerC0002b implements View.OnAttachStateChangeListener {
        public View$OnAttachStateChangeListenerC0002b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.n0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.n0 = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.n0.removeGlobalOnLayoutListener(bVar.Y);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements v50 {
        public c() {
        }

        @Override // defpackage.v50
        public final void b(f fVar, MenuItem menuItem) {
            b.this.V.removeCallbacksAndMessages(fVar);
        }

        @Override // defpackage.v50
        public final void e(f fVar, h hVar) {
            b.this.V.removeCallbacksAndMessages(null);
            int size = b.this.X.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (fVar == ((d) b.this.X.get(i)).b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            b.this.V.postAtTime(new androidx.appcompat.view.menu.c(this, i2 < b.this.X.size() ? (d) b.this.X.get(i2) : null, hVar, fVar), fVar, SystemClock.uptimeMillis() + 200);
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class d {
        public final b60 a;
        public final f b;
        public final int c;

        public d(b60 b60Var, f fVar, int i) {
            this.a = b60Var;
            this.b = fVar;
            this.c = i;
        }
    }

    public b(Context context, View view, int i, int i2, boolean z) {
        this.Q = context;
        this.d0 = view;
        this.S = i;
        this.T = i2;
        this.U = z;
        WeakHashMap<View, String> weakHashMap = a41.a;
        this.f0 = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.R = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(sh0.abc_config_prefDialogWidth));
        this.V = new Handler();
    }

    @Override // defpackage.bs0
    public final void a() {
        if (c()) {
            return;
        }
        Iterator it = this.W.iterator();
        while (it.hasNext()) {
            v((f) it.next());
        }
        this.W.clear();
        View view = this.d0;
        this.e0 = view;
        if (view != null) {
            boolean z = this.n0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.n0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.Y);
            }
            this.e0.addOnAttachStateChangeListener(this.Z);
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar, boolean z) {
        int i;
        int size = this.X.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (fVar == ((d) this.X.get(i2)).b) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < this.X.size()) {
            ((d) this.X.get(i3)).b.c(false);
        }
        d dVar = (d) this.X.remove(i2);
        dVar.b.r(this);
        if (this.p0) {
            b60 b60Var = dVar.a;
            if (Build.VERSION.SDK_INT >= 23) {
                b60Var.n0.setExitTransition(null);
            } else {
                b60Var.getClass();
            }
            dVar.a.n0.setAnimationStyle(0);
        }
        dVar.a.dismiss();
        int size2 = this.X.size();
        if (size2 > 0) {
            i = ((d) this.X.get(size2 - 1)).c;
        } else {
            View view = this.d0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (view.getLayoutDirection() == 1) {
                i = 0;
            } else {
                i = 1;
            }
        }
        this.f0 = i;
        if (size2 == 0) {
            dismiss();
            k.a aVar = this.m0;
            if (aVar != null) {
                aVar.b(fVar, true);
            }
            ViewTreeObserver viewTreeObserver = this.n0;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.n0.removeGlobalOnLayoutListener(this.Y);
                }
                this.n0 = null;
            }
            this.e0.removeOnAttachStateChangeListener(this.Z);
            this.o0.onDismiss();
        } else if (z) {
            ((d) this.X.get(0)).b.c(false);
        }
    }

    @Override // defpackage.bs0
    public final boolean c() {
        return this.X.size() > 0 && ((d) this.X.get(0)).a.c();
    }

    @Override // defpackage.bs0
    public final void dismiss() {
        int size = this.X.size();
        if (size <= 0) {
            return;
        }
        d[] dVarArr = (d[]) this.X.toArray(new d[size]);
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            d dVar = dVarArr[size];
            if (dVar.a.c()) {
                dVar.a.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f() {
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((d) it.next()).a.R.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((e) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.bs0
    public final wm g() {
        if (this.X.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.X;
        return ((d) arrayList.get(arrayList.size() - 1)).a.R;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean h(o oVar) {
        Iterator it = this.X.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (oVar == dVar.b) {
                dVar.a.R.requestFocus();
                return true;
            }
        }
        if (oVar.hasVisibleItems()) {
            l(oVar);
            k.a aVar = this.m0;
            if (aVar != null) {
                aVar.c(oVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean i() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void j(k.a aVar) {
        this.m0 = aVar;
    }

    @Override // defpackage.x50
    public final void l(f fVar) {
        fVar.b(this, this.Q);
        if (c()) {
            v(fVar);
        } else {
            this.W.add(fVar);
        }
    }

    @Override // defpackage.x50
    public final void n(View view) {
        if (this.d0 != view) {
            this.d0 = view;
            int i = this.b0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            this.c0 = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.x50
    public final void o(boolean z) {
        this.k0 = z;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        d dVar;
        int size = this.X.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.X.get(i);
            if (!dVar.a.c()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.x50
    public final void p(int i) {
        if (this.b0 != i) {
            this.b0 = i;
            View view = this.d0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            this.c0 = Gravity.getAbsoluteGravity(i, view.getLayoutDirection());
        }
    }

    @Override // defpackage.x50
    public final void q(int i) {
        this.g0 = true;
        this.i0 = i;
    }

    @Override // defpackage.x50
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.o0 = onDismissListener;
    }

    @Override // defpackage.x50
    public final void s(boolean z) {
        this.l0 = z;
    }

    @Override // defpackage.x50
    public final void t(int i) {
        this.h0 = true;
        this.j0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f fVar) {
        d dVar;
        View view;
        Rect rect;
        int i;
        boolean z;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        e eVar;
        int i4;
        int firstVisiblePosition;
        LayoutInflater from = LayoutInflater.from(this.Q);
        e eVar2 = new e(fVar, from, this.U, q0);
        if (!c() && this.k0) {
            eVar2.R = true;
        } else if (c()) {
            eVar2.R = x50.u(fVar);
        }
        int m = x50.m(eVar2, this.Q, this.R);
        b60 b60Var = new b60(this.Q, this.S, this.T);
        b60Var.r0 = this.a0;
        b60Var.e0 = this;
        b60Var.n0.setOnDismissListener(this);
        b60Var.d0 = this.d0;
        b60Var.a0 = this.c0;
        b60Var.s(true);
        b60Var.n0.setInputMethodMode(2);
        b60Var.p(eVar2);
        b60Var.r(m);
        b60Var.a0 = this.c0;
        if (this.X.size() > 0) {
            ArrayList arrayList = this.X;
            dVar = (d) arrayList.get(arrayList.size() - 1);
            f fVar2 = dVar.b;
            int size = fVar2.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    menuItem = fVar2.getItem(i5);
                    if (menuItem.hasSubMenu() && fVar == menuItem.getSubMenu()) {
                        break;
                    }
                    i5++;
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem != null) {
                wm wmVar = dVar.a.R;
                ListAdapter adapter = wmVar.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    eVar = (e) headerViewListAdapter.getWrappedAdapter();
                } else {
                    eVar = (e) adapter;
                    i4 = 0;
                }
                int count = eVar.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 < count) {
                        if (menuItem == eVar.getItem(i6)) {
                            break;
                        }
                        i6++;
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 != -1 && (firstVisiblePosition = (i6 + i4) - wmVar.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < wmVar.getChildCount()) {
                    view = wmVar.getChildAt(firstVisiblePosition);
                    if (view == null) {
                        if (Build.VERSION.SDK_INT <= 28) {
                            Method method = b60.s0;
                            if (method != null) {
                                try {
                                    method.invoke(b60Var.n0, Boolean.FALSE);
                                } catch (Exception unused) {
                                    Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                                }
                            }
                        } else {
                            b60Var.n0.setTouchModal(false);
                        }
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 23) {
                            b60Var.n0.setEnterTransition(null);
                        }
                        ArrayList arrayList2 = this.X;
                        wm wmVar2 = ((d) arrayList2.get(arrayList2.size() - 1)).a.R;
                        int[] iArr = new int[2];
                        wmVar2.getLocationOnScreen(iArr);
                        Rect rect2 = new Rect();
                        this.e0.getWindowVisibleDisplayFrame(rect2);
                        if (this.f0 != 1 ? iArr[0] - m < 0 : wmVar2.getWidth() + iArr[0] + m <= rect2.right) {
                            i = 1;
                        } else {
                            i = 0;
                        }
                        if (i == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.f0 = i;
                        if (i7 >= 26) {
                            b60Var.d0 = view;
                            i3 = 0;
                            i2 = 0;
                        } else {
                            int[] iArr2 = new int[2];
                            this.d0.getLocationOnScreen(iArr2);
                            int[] iArr3 = new int[2];
                            view.getLocationOnScreen(iArr3);
                            if ((this.c0 & 7) == 5) {
                                iArr2[0] = this.d0.getWidth() + iArr2[0];
                                iArr3[0] = view.getWidth() + iArr3[0];
                            }
                            i2 = iArr3[0] - iArr2[0];
                            i3 = iArr3[1] - iArr2[1];
                        }
                        if ((this.c0 & 5) == 5) {
                            if (z) {
                                width = i2 + m;
                                b60Var.U = width;
                                b60Var.Z = true;
                                b60Var.Y = true;
                                b60Var.j(i3);
                            } else {
                                m = view.getWidth();
                                width = i2 - m;
                                b60Var.U = width;
                                b60Var.Z = true;
                                b60Var.Y = true;
                                b60Var.j(i3);
                            }
                        } else {
                            if (z) {
                                width = i2 + view.getWidth();
                                b60Var.U = width;
                                b60Var.Z = true;
                                b60Var.Y = true;
                                b60Var.j(i3);
                            }
                            width = i2 - m;
                            b60Var.U = width;
                            b60Var.Z = true;
                            b60Var.Y = true;
                            b60Var.j(i3);
                        }
                    } else {
                        if (this.g0) {
                            b60Var.U = this.i0;
                        }
                        if (this.h0) {
                            b60Var.j(this.j0);
                        }
                        Rect rect3 = this.P;
                        if (rect3 != null) {
                            rect = new Rect(rect3);
                        } else {
                            rect = null;
                        }
                        b60Var.l0 = rect;
                    }
                    this.X.add(new d(b60Var, fVar, this.f0));
                    b60Var.a();
                    wm wmVar3 = b60Var.R;
                    wmVar3.setOnKeyListener(this);
                    if (dVar != null && this.l0 && fVar.m != null) {
                        FrameLayout frameLayout = (FrameLayout) from.inflate(ni0.abc_popup_menu_header_item_layout, (ViewGroup) wmVar3, false);
                        frameLayout.setEnabled(false);
                        ((TextView) frameLayout.findViewById(16908310)).setText(fVar.m);
                        wmVar3.addHeaderView(frameLayout, null, false);
                        b60Var.a();
                        return;
                    }
                    return;
                }
            }
        } else {
            dVar = null;
        }
        view = null;
        if (view == null) {
        }
        this.X.add(new d(b60Var, fVar, this.f0));
        b60Var.a();
        wm wmVar32 = b60Var.R;
        wmVar32.setOnKeyListener(this);
        if (dVar != null) {
        }
    }
}