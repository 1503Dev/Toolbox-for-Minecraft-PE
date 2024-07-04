package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import defpackage.bm;
import java.lang.reflect.Field;

/* renamed from: sx0  reason: default package */
public class sx0 {
    public final Activity a;
    public View b;
    public WindowManager.LayoutParams c;
    public boolean d;
    public int e;
    public int f;
    public int g = -1;
    public int h = -1;
    public long i = 0;
    public final qx0 j = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: qx0
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            sx0.this.c();
        }
    };
    public final rx0 k = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: rx0
        @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
        public final void onWindowFocusChanged(boolean z) {
            sx0.this.c();
        }
    };

    /* renamed from: sx0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements bm.a {
        public int a;
        public int b;

        public a() {
        }

        @Override // defpackage.bm.a
        public final void a(float f, float f2) {
            sx0.this.d((int) (this.a + f), (int) (this.b + f2));
        }

        @Override // defpackage.bm.a
        public final void b() {
            sx0.this.d(this.a, this.b);
        }

        @Override // defpackage.bm.a
        public final void c() {
            WindowManager.LayoutParams layoutParams = sx0.this.c;
            this.a = layoutParams.x;
            this.b = layoutParams.y;
        }

        @Override // defpackage.bm.a
        public final void d(float f, float f2) {
            sx0.this.d((int) (this.a + f), (int) (this.b + f2));
        }
    }

    /* renamed from: sx0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class b implements bm.a {
        public c a;

        public b() {
        }

        @Override // defpackage.bm.a
        public final void a(float f, float f2) {
            sx0 sx0Var = sx0.this;
            int f3 = p5.f((int) (sx0Var.c.width + f), sx0Var.e, sx0Var.a.getWindow().getDecorView().getWidth() - sx0.this.c.x);
            sx0 sx0Var2 = sx0.this;
            sx0Var.e(f3, p5.f((int) (sx0Var2.c.height + f2), sx0Var2.f, sx0Var2.b() - sx0.this.c.y));
            this.a.dismiss();
        }

        @Override // defpackage.bm.a
        public final void b() {
            this.a.dismiss();
        }

        @Override // defpackage.bm.a
        public final void c() {
            if (this.a == null) {
                this.a = new c(sx0.this.a);
            }
            c cVar = this.a;
            WindowManager.LayoutParams layoutParams = sx0.this.c;
            int i = layoutParams.x;
            int i2 = layoutParams.y;
            FrameLayout.LayoutParams layoutParams2 = cVar.b;
            layoutParams2.leftMargin = i;
            layoutParams2.topMargin = i2;
            cVar.a.requestLayout();
            c cVar2 = this.a;
            WindowManager.LayoutParams layoutParams3 = sx0.this.c;
            int i3 = layoutParams3.width;
            int i4 = layoutParams3.height;
            FrameLayout.LayoutParams layoutParams4 = cVar2.b;
            layoutParams4.width = i3;
            layoutParams4.height = i4;
            cVar2.a.requestLayout();
            c cVar3 = this.a;
            Activity activity = sx0.this.a;
            cVar3.getClass();
            cVar3.showAtLocation(activity.getWindow().getDecorView(), 0, 0, 0);
        }

        @Override // defpackage.bm.a
        public final void d(float f, float f2) {
            c cVar = this.a;
            sx0 sx0Var = sx0.this;
            int f3 = p5.f((int) (sx0Var.c.width + f), sx0Var.e, sx0Var.a.getWindow().getDecorView().getWidth() - sx0.this.c.x);
            sx0 sx0Var2 = sx0.this;
            int f4 = p5.f((int) (sx0Var2.c.height + f2), sx0Var2.f, sx0Var2.b() - sx0.this.c.y);
            FrameLayout.LayoutParams layoutParams = cVar.b;
            layoutParams.width = f3;
            layoutParams.height = f4;
            cVar.a.requestLayout();
        }
    }

    /* renamed from: sx0$c */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class c extends PopupWindow {
        public final View a;
        public final FrameLayout.LayoutParams b;

        public c(Activity activity) {
            super(-1, -1);
            FrameLayout frameLayout = new FrameLayout(activity);
            View view = new View(activity);
            this.a = view;
            view.setBackground(activity.getResources().getDrawable(2131231005));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
            this.b = layoutParams;
            layoutParams.gravity = 51;
            frameLayout.addView(view, layoutParams);
            setContentView(frameLayout);
            getContentView().setSystemUiVisibility(5894);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [qx0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [rx0] */
    public sx0(Activity activity) {
        this.a = activity;
        this.e = (int) TypedValue.applyDimension(1, 64.0f, activity.getResources().getDisplayMetrics());
        this.f = (int) TypedValue.applyDimension(1, 80.0f, activity.getResources().getDisplayMetrics());
    }

    public final void a() {
        if (this.c != null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.c = layoutParams;
        layoutParams.token = this.a.getWindow().getDecorView().getWindowToken();
        WindowManager.LayoutParams layoutParams2 = this.c;
        layoutParams2.type = 1000;
        int i = 0 | 32 | 1024;
        layoutParams2.flags = i;
        layoutParams2.gravity = 51;
        layoutParams2.softInputMode = 48;
        if (Build.VERSION.SDK_INT >= 22) {
            layoutParams2.flags = i | 1073741824;
        }
        try {
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("privateFlags");
            WindowManager.LayoutParams layoutParams3 = this.c;
            declaredField.set(layoutParams3, Integer.valueOf(((Integer) declaredField.get(layoutParams3)).intValue() | 64));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public final int b() {
        return this.a.getWindow().getDecorView().getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        Rect rect = new Rect();
        this.a.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i = this.g;
        if (i != -1) {
            int i2 = this.h;
            if (i + i2 <= rect.bottom) {
                WindowManager.LayoutParams layoutParams = this.c;
                layoutParams.height = i2;
                layoutParams.y = i;
                f();
                this.h = -1;
                this.g = -1;
                this.b.setSystemUiVisibility(((float) (b() - rect.bottom)) < TypedValue.applyDimension(1, 100.0f, this.a.getResources().getDisplayMetrics()) ? 5894 : 0);
            }
        }
        WindowManager.LayoutParams layoutParams2 = this.c;
        if (layoutParams2.y + layoutParams2.height > rect.bottom) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.g == -1 || currentTimeMillis - this.i > 1000) {
                WindowManager.LayoutParams layoutParams3 = this.c;
                this.g = layoutParams3.y;
                this.h = layoutParams3.height;
                this.i = currentTimeMillis;
            }
            WindowManager.LayoutParams layoutParams4 = this.c;
            layoutParams4.height = Math.min(layoutParams4.height, rect.bottom);
            WindowManager.LayoutParams layoutParams5 = this.c;
            layoutParams5.y = rect.bottom - layoutParams5.height;
            f();
        }
        if (((float) (b() - rect.bottom)) < TypedValue.applyDimension(1, 100.0f, this.a.getResources().getDisplayMetrics())) {
        }
        this.b.setSystemUiVisibility(((float) (b() - rect.bottom)) < TypedValue.applyDimension(1, 100.0f, this.a.getResources().getDisplayMetrics()) ? 5894 : 0);
    }

    public final void d(int i, int i2) {
        a();
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i > this.a.getWindow().getDecorView().getWidth() - this.c.width) {
            i = this.a.getWindow().getDecorView().getWidth() - this.c.width;
        }
        if (i2 > b() - this.c.height) {
            i2 = b() - this.c.height;
        }
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.x = i;
        layoutParams.y = i2;
        f();
    }

    public final void e(int i, int i2) {
        a();
        WindowManager.LayoutParams layoutParams = this.c;
        layoutParams.width = i;
        layoutParams.height = i2;
        this.h = -1;
        this.g = -1;
        f();
    }

    public final void f() {
        if (this.d) {
            a();
            ((WindowManager) this.a.getSystemService("window")).updateViewLayout(this.b, this.c);
        }
    }
}