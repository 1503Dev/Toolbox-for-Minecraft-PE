package defpackage;

import android.content.Intent;
import io.mrarm.yurai.msa.ui.web.WebUpdateLoginActivity;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: h61  reason: default package */
public final class h61 extends z20 {
    public String b;
    public String c;

    public h61(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.z20
    public final boolean c() {
        return true;
    }

    @Override // defpackage.z20
    public final void f(int i, int i2, Intent intent) {
        String str;
        if (i == 101) {
            if (i2 == -1 && intent != null) {
                e(new s60(this.b));
            } else if (i2 == 1) {
                if (intent != null) {
                    str = intent.getStringExtra("error");
                } else {
                    str = "";
                }
                d(str);
            } else {
                XboxLoginActivity xboxLoginActivity = this.a;
                xboxLoginActivity.getClass();
                xboxLoginActivity.runOnUiThread(new no(3, xboxLoginActivity));
            }
        }
    }

    @Override // defpackage.z20
    public final void h() {
        Intent intent = new Intent(this.a, WebUpdateLoginActivity.class);
        intent.putExtra("cid", this.b);
        intent.putExtra("url", this.c);
        this.a.startActivityForResult(intent, 101);
    }
}