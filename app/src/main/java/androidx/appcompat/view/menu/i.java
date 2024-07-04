package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.k;
import java.util.WeakHashMap;

public class i {
    public final Context a;
    public final f b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public k.a i;
    public x50 j;
    public PopupWindow.OnDismissListener k;
    public final a l;

    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public final void onDismiss() {
            i.this.c();
        }
    }

    public i(int i, int i2, Context context, View view, f fVar, boolean z) {
        this.g = 8388611;
        this.l = new a();
        this.a = context;
        this.b = fVar;
        this.f = view;
        this.c = z;
        this.d = i;
        this.e = i2;
    }

    public i(Context context, f fVar, View view, boolean z, int i) {
        this(i, 0, context, view, fVar, z);
    }

    public final x50 a() {
        boolean z;
        x50 mVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.a.getResources().getDimensionPixelSize(sh0.abc_cascading_menus_min_smallest_width)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mVar = new b(this.a, this.f, this.d, this.e, this.c);
            } else {
                Context context = this.a;
                f fVar = this.b;
                mVar = new m(this.d, this.e, context, this.f, fVar, this.c);
            }
            mVar.l(this.b);
            mVar.r(this.l);
            mVar.n(this.f);
            mVar.j(this.i);
            mVar.o(this.h);
            mVar.p(this.g);
            this.j = mVar;
        }
        return this.j;
    }

    public final boolean b() {
        x50 x50Var = this.j;
        return x50Var != null && x50Var.c();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i, int i2, boolean z, boolean z2) {
        x50 a2 = a();
        a2.s(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f;
            WeakHashMap<View, String> weakHashMap = a41.a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f.getWidth();
            }
            a2.q(i);
            a2.t(i2);
            int i4 = (int) ((this.a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.P = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a2.a();
    }
}