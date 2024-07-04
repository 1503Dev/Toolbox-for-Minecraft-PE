package defpackage;

import android.content.Intent;
import io.mrarm.yurai.msa.ui.web.WebLoginActivity;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: b61  reason: default package */
public final class b61 extends z20 {
    @Override // defpackage.z20
    public final boolean c() {
        return true;
    }

    @Override // defpackage.z20
    public final void f(int i, int i2, Intent intent) {
        if (i == 100) {
            if (i2 == -1 && intent != null) {
                e(new s60(intent.getStringExtra("cid")));
                return;
            }
            XboxLoginActivity xboxLoginActivity = this.a;
            xboxLoginActivity.getClass();
            xboxLoginActivity.runOnUiThread(new no(3, xboxLoginActivity));
        }
    }

    @Override // defpackage.z20
    public final void h() {
        Intent intent = new Intent(this.a, WebLoginActivity.class);
        intent.putExtra("client_id", "android-app://com.mojang.minecraftpe.H62DKCBHJP6WXXIV7RBFOGOL4NAK4E6Y");
        intent.putExtra("cobrandid", "90023");
        this.a.startActivityForResult(intent, 100);
    }
}