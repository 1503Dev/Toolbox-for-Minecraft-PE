package defpackage;

import android.view.WindowManager;
import defpackage.el0;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: t20  reason: default package */
public final /* synthetic */ class t20 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ t20(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r1 == 0) goto L20;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        int i2;
        switch (this.P) {
            case 0:
                ((v20) this.Q).dismiss();
                return;
            case 1:
                d dVar = (d) this.Q;
                WindowManager.LayoutParams layoutParams = dVar.c;
                if (layoutParams != null) {
                    i = layoutParams.width;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    if (layoutParams != null) {
                        i2 = layoutParams.height;
                        break;
                    } else {
                        i2 = 0;
                        break;
                    }
                }
                int dimensionPixelSize = dVar.l.getResources().getDimensionPixelSize(2131165507);
                dVar.e(dimensionPixelSize, dVar.l.getWindow().getDecorView().getHeight());
                dVar.d(dVar.l.getWindow().getDecorView().getWidth() - dimensionPixelSize, 0);
                if (dVar.b != null) {
                    dVar.a();
                    WindowManager windowManager = (WindowManager) dVar.a.getSystemService("window");
                    dVar.b.setSystemUiVisibility(5894);
                    WindowManager.LayoutParams layoutParams2 = dVar.c;
                    layoutParams2.flags |= 8;
                    windowManager.addView(dVar.b, layoutParams2);
                    WindowManager.LayoutParams layoutParams3 = dVar.c;
                    layoutParams3.flags &= -9;
                    windowManager.updateViewLayout(dVar.b, layoutParams3);
                    dVar.d = true;
                    dVar.c();
                    dVar.a.getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(dVar.j);
                    dVar.b.getViewTreeObserver().addOnWindowFocusChangeListener(dVar.k);
                    return;
                }
                throw new IllegalStateException("No content View set");
            case 2:
                ((yz0) this.Q).a();
                return;
            default:
                ((el0.a) this.Q).b();
                return;
        }
    }
}