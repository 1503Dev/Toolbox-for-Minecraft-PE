package defpackage;

import android.content.Context;
import android.widget.ImageView;
import android.widget.Toast;

/* renamed from: mo  reason: default package */
public final /* synthetic */ class mo implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;

    public /* synthetic */ mo(int i, Object obj) {
        this.P = i;
        this.Q = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                Toast.makeText((Context) this.Q, 2131755120, 0).show();
                return;
            default:
                ((ImageView) this.Q).performClick();
                return;
        }
    }
}