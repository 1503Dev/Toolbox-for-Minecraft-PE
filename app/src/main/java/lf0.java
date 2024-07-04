package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;

/* renamed from: lf0  reason: default package */
public final class lf0 {
    public final f a;
    public final View b;
    public final j c;

    public lf0(Context context, View view) {
        this.b = view;
        f fVar = new f(context);
        this.a = fVar;
        fVar.e = new kf0(this);
        j jVar = new j(context, view, fVar);
        this.c = jVar;
        jVar.f = 0;
        jVar.h = new PopupWindow.OnDismissListener() { // from class: jf0
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                lf0.this.getClass();
            }
        };
    }

    public final void a() {
        boolean z;
        j jVar = this.c;
        n nVar = jVar.g;
        boolean z2 = true;
        if (nVar != null && nVar.c()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (jVar.e == null) {
                z2 = false;
            } else {
                if (jVar.g == null) {
                    Display defaultDisplay = ((WindowManager) jVar.a.getSystemService("window")).getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    Math.min(point.x, point.y);
                    jVar.a.getResources().getDimensionPixelSize(2131165206);
                    Context context = jVar.a;
                    f fVar = jVar.b;
                    n nVar2 = new n(jVar.c, jVar.d, context, jVar.e, fVar);
                    nVar2.Z = jVar.i;
                    nVar2.a0 = jVar.e;
                    nVar2.c0 = null;
                    nVar2.S.R = false;
                    nVar2.h0 = jVar.f;
                    jVar.g = nVar2;
                }
                n nVar3 = jVar.g;
                nVar3.i0 = false;
                nVar3.a();
            }
        }
        if (z2) {
            return;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }
}