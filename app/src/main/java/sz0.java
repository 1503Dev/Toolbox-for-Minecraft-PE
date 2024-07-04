package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bm;

/* renamed from: sz0  reason: default package */
public final class sz0 extends PopupWindow implements bm.a {
    public Activity a;
    public int b;
    public int c;
    public bm d;
    public ow e;
    public ya0 f;
    public xs0 g;

    /* renamed from: sz0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a extends FrameLayout {
        public a(ContextThemeWrapper contextThemeWrapper) {
            super(contextThemeWrapper);
        }

        @Override // android.view.ViewGroup
        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return sz0.this.d.a(motionEvent);
        }

        @Override // android.view.View
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            sz0.this.d.a(motionEvent);
            return true;
        }
    }

    public sz0(Activity activity, ow owVar) {
        super(-2, activity.getResources().getDimensionPixelSize(2131165536));
        this.g = new xs0(new rz0(this));
        this.a = activity;
        this.e = owVar;
        bm bmVar = new bm(TypedValue.applyDimension(1, 4.0f, activity.getResources().getDisplayMetrics()));
        this.d = bmVar;
        bmVar.d = this;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(activity, 2131821009);
        a aVar = new a(contextThemeWrapper);
        RecyclerView recyclerView = new RecyclerView(contextThemeWrapper);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165537);
        recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        recyclerView.setBackground(activity.getResources().getDrawable(2131231015));
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        ad0 ad0Var = new ad0();
        ad0Var.n(owVar);
        recyclerView.setAdapter(ad0Var);
        aVar.addView(recyclerView);
        setContentView(aVar);
    }

    @Override // defpackage.bm.a
    public final void a(float f, float f2) {
        int i = (int) (f + this.b);
        this.b = i;
        int i2 = (int) (f2 + this.c);
        this.c = i2;
        update(i, i2, getWidth(), getHeight());
    }

    @Override // defpackage.bm.a
    public final void b() {
        update(this.b, this.c, getWidth(), getHeight());
    }

    @Override // defpackage.bm.a
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.bm.a
    public final void d(float f, float f2) {
        update((int) (f + this.b), (int) (f2 + this.c), getWidth(), getHeight());
    }
}