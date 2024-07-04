package defpackage;

import android.util.Log;
import com.microsoft.xbox.idp.interop.Interop;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: gp  reason: default package */
public final class gp extends z20 {
    public String b;
    public String c;

    /* renamed from: gp$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Interop.EventInitializationCallback {
        public a() {
        }

        @Override // com.microsoft.xbox.idp.interop.Interop.ErrorCallback
        public final void onError(int i, int i2, String str) {
            Log.e("EventLoginStage", "Error: " + i + " " + i2 + " " + str);
            gp.this.d("Event Initialization Error");
        }

        @Override // com.microsoft.xbox.idp.interop.Interop.EventInitializationCallback
        public final void onSuccess() {
            gp gpVar = gp.this;
            final String str = gpVar.b;
            final XboxLoginActivity xboxLoginActivity = gpVar.a;
            xboxLoginActivity.getClass();
            xboxLoginActivity.runOnUiThread(new Runnable() { // from class: f91
                @Override // java.lang.Runnable
                public final void run() {
                    XboxLoginActivity xboxLoginActivity2 = XboxLoginActivity.this;
                    String str2 = str;
                    int i = XboxLoginActivity.h0;
                    xboxLoginActivity2.getClass();
                    XboxLoginActivity.r("Success", true);
                    Interop.auth_flow_callback(xboxLoginActivity2.c0, 0, str2);
                    xboxLoginActivity2.finish();
                }
            });
        }
    }

    public gp(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.z20
    public final void h() {
        long j = this.a.c0;
        d91.c.b(this.b);
        Interop.InvokeEventInitialization(j, this.c, new a());
    }
}