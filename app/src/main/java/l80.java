package defpackage;

import android.view.WindowManager;
import defpackage.el0;
import io.mrarm.mctoolbox.ui.d;

/* renamed from: l80  reason: default package */
public final /* synthetic */ class l80 implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ l80(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                d dVar = (d) this.Q;
                if (dVar.d) {
                    ((WindowManager) dVar.a.getSystemService("window")).removeView(dVar.b);
                    dVar.b.getViewTreeObserver().removeOnWindowFocusChangeListener(dVar.k);
                    dVar.a.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(dVar.j);
                    dVar.d = false;
                    return;
                }
                return;
            case 1:
                ((yz0) this.Q).a();
                return;
            default:
                ((el0.a) this.Q).a();
                return;
        }
    }
}