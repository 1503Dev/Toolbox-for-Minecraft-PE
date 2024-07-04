package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

public final class a extends androidx.appcompat.view.menu.a {
    public d X;
    public Drawable Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public int e0;
    public boolean f0;
    public final SparseBooleanArray g0;
    public e h0;
    public C0003a i0;
    public c j0;
    public b k0;
    public final f l0;

    /* renamed from: androidx.appcompat.widget.a$a  reason: collision with other inner class name */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class C0003a extends i {
        public C0003a(Context context, o oVar, View view) {
            super(context, oVar, view, false, ih0.actionOverflowMenuStyle);
            boolean z;
            if ((oVar.A.x & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                View view2 = a.this.X;
                this.f = view2 == null ? (View) a.this.W : view2;
            }
            f fVar = a.this.l0;
            this.i = fVar;
            x50 x50Var = this.j;
            if (x50Var != null) {
                x50Var.j(fVar);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            a.this.i0 = null;
            super.c();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements Runnable {
        public e P;

        public c(e eVar) {
            this.P = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.a aVar;
            androidx.appcompat.view.menu.f fVar = a.this.R;
            if (fVar != null && (aVar = fVar.e) != null) {
                aVar.b(fVar);
            }
            View view = (View) a.this.W;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.P;
                boolean z = true;
                if (!eVar.b()) {
                    if (eVar.f == null) {
                        z = false;
                    } else {
                        eVar.d(0, 0, false, false);
                    }
                }
                if (z) {
                    a.this.h0 = this.P;
                }
            }
            a.this.j0 = null;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d extends s5 implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a  reason: collision with other inner class name */
        /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
        public class C0004a extends ir {
            public C0004a(View view) {
                super(view);
            }

            @Override // defpackage.ir
            public final bs0 b() {
                e eVar = a.this.h0;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            @Override // defpackage.ir
            public final boolean c() {
                a.this.l();
                return true;
            }

            @Override // defpackage.ir
            public final boolean d() {
                a aVar = a.this;
                if (aVar.j0 != null) {
                    return false;
                }
                aVar.c();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, ih0.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            f01.a(getContentDescription(), this);
            setOnTouchListener(new C0004a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public final boolean b() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                int i5 = paddingLeft - max;
                int i6 = paddingTop - max;
                int i7 = paddingLeft + max;
                int i8 = paddingTop + max;
                if (Build.VERSION.SDK_INT >= 21) {
                    background.setHotspotBounds(i5, i6, i7, i8);
                }
            }
            return frame;
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.f fVar, d dVar) {
            super(context, fVar, dVar, true, ih0.actionOverflowMenuStyle);
            this.g = 8388613;
            f fVar2 = a.this.l0;
            this.i = fVar2;
            x50 x50Var = this.j;
            if (x50Var != null) {
                x50Var.j(fVar2);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public final void c() {
            androidx.appcompat.view.menu.f fVar = a.this.R;
            if (fVar != null) {
                fVar.c(true);
            }
            a.this.h0 = null;
            super.c();
        }
    }

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class f implements k.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
            if (fVar instanceof o) {
                fVar.k().c(false);
            }
            k.a aVar = a.this.T;
            if (aVar != null) {
                aVar.b(fVar, z);
            }
        }

        @Override // androidx.appcompat.view.menu.k.a
        public final boolean c(androidx.appcompat.view.menu.f fVar) {
            if (fVar == null) {
                return false;
            }
            a aVar = a.this;
            ((o) fVar).A.getClass();
            aVar.getClass();
            k.a aVar2 = a.this.T;
            if (aVar2 == null) {
                return false;
            }
            return aVar2.c(fVar);
        }
    }

    public a(Context context) {
        super(context, ni0.abc_action_menu_layout, ni0.abc_action_menu_item_layout);
        this.g0 = new SparseBooleanArray();
        this.l0 = new f();
    }

    public final View a(h hVar, View view, ViewGroup viewGroup) {
        l.a aVar;
        View actionView = hVar.getActionView();
        int i = 0;
        if (actionView == null || hVar.e()) {
            if (view instanceof l.a) {
                aVar = (l.a) view;
            } else {
                aVar = (l.a) this.S.inflate(this.V, viewGroup, false);
            }
            aVar.c(hVar);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.W);
            if (this.k0 == null) {
                this.k0 = new b();
            }
            actionMenuItemView.setPopupCallback(this.k0);
            actionView = (View) aVar;
        }
        if (hVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(androidx.appcompat.view.menu.f fVar, boolean z) {
        c();
        C0003a c0003a = this.i0;
        if (c0003a != null && c0003a.b()) {
            c0003a.j.dismiss();
        }
        k.a aVar = this.T;
        if (aVar != null) {
            aVar.b(fVar, z);
        }
    }

    public final boolean c() {
        l lVar;
        c cVar = this.j0;
        if (cVar != null && (lVar = this.W) != null) {
            ((View) lVar).removeCallbacks(cVar);
            this.j0 = null;
            return true;
        }
        e eVar = this.h0;
        if (eVar != null) {
            if (eVar.b()) {
                eVar.j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void e(Context context, androidx.appcompat.view.menu.f fVar) {
        this.Q = context;
        LayoutInflater.from(context);
        this.R = fVar;
        Resources resources = context.getResources();
        if (!this.b0) {
            this.a0 = true;
        }
        int i = 2;
        this.c0 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.e0 = i;
        int i4 = this.c0;
        if (this.a0) {
            if (this.X == null) {
                d dVar = new d(this.P);
                this.X = dVar;
                if (this.Z) {
                    dVar.setImageDrawable(this.Y);
                    this.Y = null;
                    this.Z = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.X.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.X.getMeasuredWidth();
        } else {
            this.X = null;
        }
        this.d0 = i4;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // androidx.appcompat.view.menu.k
    public final void f() {
        int i;
        boolean z;
        boolean z2;
        h hVar;
        ViewGroup viewGroup = (ViewGroup) this.W;
        boolean z3 = false;
        ArrayList<h> arrayList = null;
        if (viewGroup != null) {
            androidx.appcompat.view.menu.f fVar = this.R;
            if (fVar != null) {
                fVar.i();
                ArrayList<h> l = this.R.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    h hVar2 = l.get(i2);
                    if ((hVar2.x & 32) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof l.a) {
                            hVar = ((l.a) childAt).getItemData();
                        } else {
                            hVar = null;
                        }
                        View a = a(hVar2, childAt, viewGroup);
                        if (hVar2 != hVar) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.W).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.X) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.W).requestLayout();
        androidx.appcompat.view.menu.f fVar2 = this.R;
        if (fVar2 != null) {
            fVar2.i();
            ArrayList<h> arrayList2 = fVar2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                h1 h1Var = arrayList2.get(i3).A;
            }
        }
        androidx.appcompat.view.menu.f fVar3 = this.R;
        if (fVar3 != null) {
            fVar3.i();
            arrayList = fVar3.j;
        }
        if (this.a0 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        d dVar = this.X;
        if (z3) {
            if (dVar == null) {
                this.X = new d(this.P);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.X.getParent();
            if (viewGroup3 != this.W) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.X);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.W;
                d dVar2 = this.X;
                actionMenuView.getClass();
                ActionMenuView.c cVar = new ActionMenuView.c();
                cVar.b = 16;
                cVar.c = true;
                actionMenuView.addView(dVar2, cVar);
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            l lVar = this.W;
            if (parent == lVar) {
                ((ViewGroup) lVar).removeView(this.X);
            }
        }
        ((ActionMenuView) this.W).setOverflowReserved(this.a0);
    }

    public final boolean g() {
        e eVar = this.h0;
        return eVar != null && eVar.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    @Override // androidx.appcompat.view.menu.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(o oVar) {
        boolean z;
        boolean z2 = false;
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        o oVar2 = oVar;
        while (true) {
            androidx.appcompat.view.menu.f fVar = oVar2.z;
            if (fVar == this.R) {
                break;
            }
            oVar2 = (o) fVar;
        }
        h hVar = oVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.W;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof l.a) && ((l.a) childAt).getItemData() == hVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        oVar.A.getClass();
        int size = oVar.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                MenuItem item = oVar.getItem(i2);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        C0003a c0003a = new C0003a(this.Q, oVar, view);
        this.i0 = c0003a;
        c0003a.h = z;
        x50 x50Var = c0003a.j;
        if (x50Var != null) {
            x50Var.o(z);
        }
        C0003a c0003a2 = this.i0;
        if (!c0003a2.b()) {
            if (c0003a2.f != null) {
                c0003a2.d(0, 0, false, false);
            }
            if (!z2) {
                k.a aVar = this.T;
                if (aVar != null) {
                    aVar.c(oVar);
                }
                return true;
            }
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        z2 = true;
        if (!z2) {
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public final boolean i() {
        ArrayList<h> arrayList;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        a aVar = this;
        androidx.appcompat.view.menu.f fVar = aVar.R;
        if (fVar != null) {
            arrayList = fVar.l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = aVar.e0;
        int i4 = aVar.d0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.W;
        int i5 = 0;
        boolean z9 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            h hVar = arrayList.get(i5);
            int i8 = hVar.y;
            if ((i8 & 2) == 2) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (z8) {
                    i7++;
                } else {
                    z9 = true;
                }
            }
            if (aVar.f0 && hVar.C) {
                i3 = 0;
            }
            i5++;
        }
        if (aVar.a0 && (z9 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = aVar.g0;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            h hVar2 = arrayList.get(i10);
            int i12 = hVar2.y;
            if ((i12 & 2) == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                View a = aVar.a(hVar2, null, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                int i13 = hVar2.b;
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                hVar2.f(z);
            } else {
                if ((i12 & 1) == z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    int i14 = hVar2.b;
                    boolean z10 = sparseBooleanArray.get(i14);
                    if ((i9 > 0 || z10) && i4 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View a2 = aVar.a(hVar2, null, viewGroup);
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = a2.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        if (i4 + i11 > 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 &= z6;
                    }
                    if (z4 && i14 != 0) {
                        sparseBooleanArray.put(i14, true);
                    } else if (z10) {
                        sparseBooleanArray.put(i14, false);
                        for (int i15 = 0; i15 < i10; i15++) {
                            h hVar3 = arrayList.get(i15);
                            if (hVar3.b == i14) {
                                if ((hVar3.x & 32) == 32) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (z5) {
                                    i9++;
                                }
                                hVar3.f(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    hVar2.f(z4);
                } else {
                    hVar2.f(false);
                    i10++;
                    i2 = 2;
                    aVar = this;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            aVar = this;
            z = true;
        }
        return true;
    }

    public final boolean l() {
        androidx.appcompat.view.menu.f fVar;
        if (this.a0 && !g() && (fVar = this.R) != null && this.W != null && this.j0 == null) {
            fVar.i();
            if (!fVar.j.isEmpty()) {
                c cVar = new c(new e(this.Q, this.R, this.X));
                this.j0 = cVar;
                ((View) this.W).post(cVar);
                k.a aVar = this.T;
                if (aVar != null) {
                    aVar.c(null);
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }
}