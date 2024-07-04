package defpackage;

import android.content.DialogInterface;
import android.content.Intent;
import defpackage.z0;
import io.mrarm.yurai.msa.AccountList;
import io.mrarm.yurai.msa.MSASingleton;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: je0  reason: default package */
public final class je0 extends z20 implements z0.a {
    @Override // defpackage.z0.a
    public final void a(String str, String str2) {
        e(new s60(str));
    }

    @Override // defpackage.z0.a
    public final void b() {
        e(new b61());
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
        AccountList accounts = MSASingleton.getInstance(this.a).getAccountManager().getAccounts();
        if (accounts != null && accounts.size() != 0) {
            a1 a1Var = new a1(this.a, accounts);
            a1Var.c = this;
            a1Var.b.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ie0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    XboxLoginActivity xboxLoginActivity = je0.this.a;
                    xboxLoginActivity.getClass();
                    xboxLoginActivity.runOnUiThread(new no(3, xboxLoginActivity));
                }
            });
            a1Var.b.show();
            return;
        }
        e(new b61());
    }
}