package defpackage;

import android.util.Log;
import com.microsoft.xbox.idp.interop.Interop;

/* renamed from: c91  reason: default package */
public final class c91 extends z20 {
    public String b;
    public String c;

    /* renamed from: c91$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Interop.XBLoginCallback {
        public a() {
        }

        @Override // com.microsoft.xbox.idp.interop.Interop.ErrorCallback
        public final void onError(int i, int i2, String str) {
            Log.e("XblLoginStage", "Error: " + i + " " + i2 + " " + str);
            c91.this.d("Xbox login failed");
        }

        @Override // com.microsoft.xbox.idp.interop.Interop.XBLoginCallback
        public final void onLogin(long j, boolean z) {
            c91 c91Var = c91.this;
            c91Var.e(new gp(c91Var.b, c91Var.c));
        }
    }

    public c91(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.z20
    public final void h() {
        Interop.InvokeXBLogin(this.a.c0, this.c, new a());
    }
}