package defpackage;

import android.app.Activity;
import android.util.TypedValue;
import android.widget.PopupWindow;
import io.mrarm.mctoolbox.bridge.a;
import io.mrarm.mctoolbox.bridge.b;

/* renamed from: qy0  reason: default package */
public final class qy0 extends PopupWindow {
    public final Activity a;
    public final a b;
    public ya0 c;
    private final a.InterfaceC0035a d;
    private final a.InterfaceC0035a e;

    public qy0(Activity activity, q01 q01Var, final b bVar) {
        xs0 xs0Var = new xs0(new mj(this));
        a.InterfaceC0035a interfaceC0035a = new a.InterfaceC0035a() { // from class: oy0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                qy0.this.a();
            }
        };
        this.d = interfaceC0035a;
        this.a = activity;
        this.b = bVar;
        this.c = q01Var;
        q01Var.a(xs0Var);
        final ry0 ry0Var = new ry0(activity);
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(2131165358);
        ry0Var.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        setContentView(ry0Var);
        setTouchable(false);
        a.InterfaceC0035a interfaceC0035a2 = new a.InterfaceC0035a() { // from class: py0
            @Override // io.mrarm.mctoolbox.bridge.a.InterfaceC0035a
            public final void a() {
                ry0.this.setRadius(((b) bVar).p("minimap/radius"));
            }
        };
        this.e = interfaceC0035a2;
        bVar.P("minimap/radius", interfaceC0035a2);
        bVar.P("minimap/size", interfaceC0035a);
        ry0Var.setRadius(bVar.p("minimap/radius"));
        a();
    }

    public final void a() {
        float n = ((b) this.b).n("minimap/size");
        if (n < 1.0f) {
            n = ((b) this.b).m();
        }
        float applyDimension = TypedValue.applyDimension(1, n, this.a.getResources().getDisplayMetrics());
        if (applyDimension < getContentView().getPaddingBottom() + getContentView().getPaddingTop() + 1) {
            applyDimension = getContentView().getPaddingBottom() + getContentView().getPaddingTop() + 1;
        }
        int i = (int) applyDimension;
        setWidth(i);
        setHeight(i);
    }
}