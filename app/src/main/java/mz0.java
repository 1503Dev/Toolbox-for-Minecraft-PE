package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import defpackage.bm;
import defpackage.mz0;
import defpackage.xs0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: mz0  reason: default package */
public final class mz0 extends PopupWindow implements bm.a {
    public static final /* synthetic */ int i = 0;
    public Activity a;
    public a b;
    public bm c;
    public ya0 d;
    public xs0 e;
    public ab0 f;
    public xs0 g;
    public final kz0 h;

    /* renamed from: mz0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a {
        @wq0("x")
        public int a = -1;
        @wq0("y")
        public int b = -1;
        public final transient ArrayList c = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [kz0] */
    public mz0(Activity activity, a aVar) {
        super(activity.getResources().getDimensionPixelSize(2131165535), activity.getResources().getDimensionPixelSize(2131165535));
        this.e = new xs0(new xs0.a() { // from class: jz0
            @Override // defpackage.xs0.a
            public final void a() {
                mz0 mz0Var = mz0.this;
                if (mz0Var.d.Q) {
                    View decorView = mz0Var.a.getWindow().getDecorView();
                    mz0.a aVar2 = mz0Var.b;
                    mz0Var.showAtLocation(decorView, 0, aVar2.a, aVar2.b);
                    mz0.a aVar3 = mz0Var.b;
                    aVar3.c.add(mz0Var.h);
                    return;
                }
                mz0Var.dismiss();
            }
        });
        this.g = new xs0(new ey0(1, this));
        this.h = new Runnable() { // from class: kz0
            @Override // java.lang.Runnable
            public final void run() {
                mz0 mz0Var = mz0.this;
                mz0.a aVar2 = mz0Var.b;
                mz0Var.update(aVar2.a, aVar2.b, mz0Var.getWidth(), mz0Var.getHeight());
            }
        };
        this.a = activity;
        this.b = aVar;
        bm bmVar = new bm(TypedValue.applyDimension(1, 4.0f, activity.getResources().getDisplayMetrics()));
        this.c = bmVar;
        bmVar.d = this;
        s5 s5Var = new s5(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165532);
        s5Var.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        s5Var.setBackground(activity.getResources().getDrawable(2131231014));
        s5Var.setOnTouchListener(new View.OnTouchListener() { // from class: lz0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                mz0.this.c.a(motionEvent);
                return true;
            }
        });
        this.c.e = new mo(1, s5Var);
        setContentView(s5Var);
    }

    @Override // defpackage.bm.a
    public final void a(float f, float f2) {
        a aVar = this.b;
        int i2 = (int) (f + aVar.a);
        aVar.a = i2;
        aVar.b = (int) (f2 + aVar.b);
        aVar.a = p5.f(i2, 0, this.a.getWindow().getDecorView().getWidth() - getWidth());
        a aVar2 = this.b;
        aVar2.b = p5.f(aVar2.b, 0, this.a.getWindow().getDecorView().getHeight() - getHeight());
        Iterator it = this.b.c.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // defpackage.bm.a
    public final void b() {
        a aVar = this.b;
        update(aVar.a, aVar.b, getWidth(), getHeight());
    }

    @Override // defpackage.bm.a
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.bm.a
    public final void d(float f, float f2) {
        a aVar = this.b;
        update((int) (f + aVar.a), (int) (f2 + aVar.b), getWidth(), getHeight());
    }

    @Override // android.widget.PopupWindow
    public final void dismiss() {
        super.dismiss();
        a aVar = this.b;
        aVar.c.remove(this.h);
    }

    public final ImageView e() {
        return (ImageView) getContentView();
    }

    public final void f(ab0 ab0Var) {
        ab0 ab0Var2 = this.f;
        if (ab0Var2 != null) {
            ab0Var2.z(this.g);
        }
        this.f = ab0Var;
        if (ab0Var != null) {
            ab0Var.a(this.g);
            this.g.g(0, null);
        }
    }

    public final void g(ya0 ya0Var) {
        ya0 ya0Var2 = this.d;
        if (ya0Var2 != null) {
            ya0Var2.z(this.e);
        }
        this.d = ya0Var;
        if (ya0Var != null) {
            ya0Var.a(this.e);
            this.e.g(0, null);
        }
    }
}