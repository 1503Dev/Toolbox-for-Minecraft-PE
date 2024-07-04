package defpackage;

import android.graphics.Bitmap;
import com.microsoft.xbox.idp.interop.Interop;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: py  reason: default package */
public final /* synthetic */ class py implements Runnable {
    public final /* synthetic */ int P;
    public final /* synthetic */ Object Q;
    public final /* synthetic */ Object R;

    public /* synthetic */ py(int i, Object obj, Object obj2) {
        this.P = i;
        this.Q = obj;
        this.R = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.P) {
            case 0:
                ((jl) this.Q).T((Bitmap) this.R);
                return;
            default:
                XboxLoginActivity xboxLoginActivity = (XboxLoginActivity) this.Q;
                int i = XboxLoginActivity.h0;
                xboxLoginActivity.getClass();
                XboxLoginActivity.r((String) this.R, false);
                Interop.auth_flow_callback(xboxLoginActivity.c0, 2, "");
                xboxLoginActivity.finish();
                return;
        }
    }
}