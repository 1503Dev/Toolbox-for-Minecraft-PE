package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: x10  reason: default package */
public class x10 implements bs0 {
    public static Method o0;
    public static Method p0;
    public static Method q0;
    public Context P;
    public ListAdapter Q;
    public wm R;
    public int U;
    public int V;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public b c0;
    public View d0;
    public AdapterView.OnItemClickListener e0;
    public final Handler j0;
    public Rect l0;
    public boolean m0;
    public u5 n0;
    public int S = -2;
    public int T = -2;
    public int W = 1002;
    public int a0 = 0;
    public int b0 = Integer.MAX_VALUE;
    public final e f0 = new e();
    public final d g0 = new d();
    public final c h0 = new c();
    public final a i0 = new a();
    public final Rect k0 = new Rect();

    /* renamed from: x10$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            wm wmVar = x10.this.R;
            if (wmVar != null) {
                wmVar.setListSelectionHidden(true);
                wmVar.requestLayout();
            }
        }
    }

    /* renamed from: x10$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            if (x10.this.c()) {
                x10.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            x10.this.dismiss();
        }
    }

    /* renamed from: x10$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (x10.this.n0.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && x10.this.n0.getContentView() != null) {
                    x10 x10Var = x10.this;
                    x10Var.j0.removeCallbacks(x10Var.f0);
                    x10.this.f0.run();
                }
            }
        }
    }

    /* renamed from: x10$d */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class d implements View.OnTouchListener {
        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            u5 u5Var;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (u5Var = x10.this.n0) != null && u5Var.isShowing() && x >= 0 && x < x10.this.n0.getWidth() && y >= 0 && y < x10.this.n0.getHeight()) {
                x10 x10Var = x10.this;
                x10Var.j0.postDelayed(x10Var.f0, 250L);
                return false;
            } else if (action == 1) {
                x10 x10Var2 = x10.this;
                x10Var2.j0.removeCallbacks(x10Var2.f0);
                return false;
            } else {
                return false;
            }
        }
    }

    /* renamed from: x10$e */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            wm wmVar = x10.this.R;
            if (wmVar != null) {
                WeakHashMap<View, String> weakHashMap = a41.a;
                if (wmVar.isAttachedToWindow() && x10.this.R.getCount() > x10.this.R.getChildCount()) {
                    int childCount = x10.this.R.getChildCount();
                    x10 x10Var = x10.this;
                    if (childCount <= x10Var.b0) {
                        x10Var.n0.setInputMethodMode(2);
                        x10.this.a();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                o0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                q0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                p0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public x10(Context context, AttributeSet attributeSet, int i, int i2) {
        this.P = context;
        this.j0 = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, lj0.ListPopupWindow, i, i2);
        this.U = obtainStyledAttributes.getDimensionPixelOffset(lj0.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(lj0.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.V = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.X = true;
        }
        obtainStyledAttributes.recycle();
        u5 u5Var = new u5(context, attributeSet, i, i2);
        this.n0 = u5Var;
        u5Var.setInputMethodMode(1);
    }

    @Override // defpackage.bs0
    public final void a() {
        int i;
        boolean z;
        int a2;
        int i2;
        int i3;
        int i4;
        boolean z2;
        wm wmVar;
        int i5;
        int i6;
        int i7;
        if (this.R == null) {
            wm q = q(this.P, !this.m0);
            this.R = q;
            q.setAdapter(this.Q);
            this.R.setOnItemClickListener(this.e0);
            this.R.setFocusable(true);
            this.R.setFocusableInTouchMode(true);
            this.R.setOnItemSelectedListener(new w10(this));
            this.R.setOnScrollListener(this.h0);
            this.n0.setContentView(this.R);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.n0.getContentView();
        }
        Drawable background = this.n0.getBackground();
        int i8 = 0;
        if (background != null) {
            background.getPadding(this.k0);
            Rect rect = this.k0;
            int i9 = rect.top;
            i = rect.bottom + i9;
            if (!this.X) {
                this.V = -i9;
            }
        } else {
            this.k0.setEmpty();
            i = 0;
        }
        if (this.n0.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.d0;
        int i10 = this.V;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = p0;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(this.n0, view, Integer.valueOf(i10), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = this.n0.getMaxAvailableHeight(view, i10);
        } else {
            a2 = u10.a(this.n0, view, i10, z);
        }
        if (this.S == -1) {
            i4 = a2 + i;
        } else {
            int i11 = this.T;
            if (i11 != -2) {
                i2 = 1073741824;
                if (i11 == -1) {
                    int i12 = this.P.getResources().getDisplayMetrics().widthPixels;
                    Rect rect2 = this.k0;
                    i11 = i12 - (rect2.left + rect2.right);
                }
            } else {
                int i13 = this.P.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.k0;
                i11 = i13 - (rect3.left + rect3.right);
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
            int a3 = this.R.a(View.MeasureSpec.makeMeasureSpec(i11, i2), a2 + 0);
            if (a3 > 0) {
                i3 = this.R.getPaddingBottom() + this.R.getPaddingTop() + i + 0;
            } else {
                i3 = 0;
            }
            i4 = a3 + i3;
        }
        if (this.n0.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        of0.b(this.n0, this.W);
        if (this.n0.isShowing()) {
            View view2 = this.d0;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if (!view2.isAttachedToWindow()) {
                return;
            }
            int i14 = this.T;
            if (i14 == -1) {
                i14 = -1;
            } else if (i14 == -2) {
                i14 = this.d0.getWidth();
            }
            int i15 = this.S;
            if (i15 == -1) {
                if (!z2) {
                    i4 = -1;
                }
                if (z2) {
                    u5 u5Var = this.n0;
                    if (this.T == -1) {
                        i7 = -1;
                    } else {
                        i7 = 0;
                    }
                    u5Var.setWidth(i7);
                    this.n0.setHeight(0);
                } else {
                    u5 u5Var2 = this.n0;
                    if (this.T == -1) {
                        i8 = -1;
                    }
                    u5Var2.setWidth(i8);
                    this.n0.setHeight(-1);
                }
            } else if (i15 != -2) {
                i4 = i15;
            }
            this.n0.setOutsideTouchable(true);
            u5 u5Var3 = this.n0;
            View view3 = this.d0;
            int i16 = this.U;
            int i17 = this.V;
            if (i14 < 0) {
                i5 = -1;
            } else {
                i5 = i14;
            }
            if (i4 < 0) {
                i6 = -1;
            } else {
                i6 = i4;
            }
            u5Var3.update(view3, i16, i17, i5, i6);
            return;
        }
        int i18 = this.T;
        if (i18 == -1) {
            i18 = -1;
        } else if (i18 == -2) {
            i18 = this.d0.getWidth();
        }
        int i19 = this.S;
        if (i19 == -1) {
            i4 = -1;
        } else if (i19 != -2) {
            i4 = i19;
        }
        this.n0.setWidth(i18);
        this.n0.setHeight(i4);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = o0;
            if (method2 != null) {
                try {
                    method2.invoke(this.n0, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            v10.b(this.n0);
        }
        this.n0.setOutsideTouchable(true);
        this.n0.setTouchInterceptor(this.g0);
        if (this.Z) {
            of0.a(this.n0, this.Y);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = q0;
            if (method3 != null) {
                try {
                    method3.invoke(this.n0, this.l0);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            t10.a(this.n0, this.l0);
        }
        this.n0.showAsDropDown(this.d0, this.U, this.V, this.a0);
        this.R.setSelection(-1);
        if ((!this.m0 || this.R.isInTouchMode()) && (wmVar = this.R) != null) {
            wmVar.setListSelectionHidden(true);
            wmVar.requestLayout();
        }
        if (!this.m0) {
            this.j0.post(this.i0);
        }
    }

    @Override // defpackage.bs0
    public final boolean c() {
        return this.n0.isShowing();
    }

    public final int d() {
        return this.U;
    }

    @Override // defpackage.bs0
    public final void dismiss() {
        this.n0.dismiss();
        this.n0.setContentView(null);
        this.R = null;
        this.j0.removeCallbacks(this.f0);
    }

    public final Drawable f() {
        return this.n0.getBackground();
    }

    @Override // defpackage.bs0
    public final wm g() {
        return this.R;
    }

    public final void i(Drawable drawable) {
        this.n0.setBackgroundDrawable(drawable);
    }

    public final void j(int i) {
        this.V = i;
        this.X = true;
    }

    public final void l(int i) {
        this.U = i;
    }

    public final int n() {
        if (this.X) {
            return this.V;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        b bVar = this.c0;
        if (bVar == null) {
            this.c0 = new b();
        } else {
            ListAdapter listAdapter2 = this.Q;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(bVar);
            }
        }
        this.Q = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.c0);
        }
        wm wmVar = this.R;
        if (wmVar != null) {
            wmVar.setAdapter(this.Q);
        }
    }

    public wm q(Context context, boolean z) {
        return new wm(context, z);
    }

    public final void r(int i) {
        Drawable background = this.n0.getBackground();
        if (background == null) {
            this.T = i;
            return;
        }
        background.getPadding(this.k0);
        Rect rect = this.k0;
        this.T = rect.left + rect.right + i;
    }

    public final void s(boolean z) {
        this.m0 = z;
        this.n0.setFocusable(z);
    }
}