package defpackage;

import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import defpackage.z20;
import io.mrarm.yurai.msa.AccountManager;
import io.mrarm.yurai.xbox.XboxLoginActivity;

/* renamed from: z20  reason: default package */
public abstract class z20 {
    public XboxLoginActivity a;

    /* renamed from: z20$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class a extends Exception {
        public a(AccountManager.NoSuchAccountException noSuchAccountException) {
            super("Account not found", noSuchAccountException);
        }

        public a(String str) {
            super(str);
        }
    }

    public boolean c() {
        return this instanceof je0;
    }

    public final void d(String str) {
        XboxLoginActivity xboxLoginActivity = this.a;
        xboxLoginActivity.getClass();
        xboxLoginActivity.runOnUiThread(new py(1, xboxLoginActivity, str));
    }

    public final void e(final z20 z20Var) {
        final XboxLoginActivity xboxLoginActivity = this.a;
        synchronized (xboxLoginActivity) {
            xboxLoginActivity.f0 = true;
            if (!xboxLoginActivity.e0) {
                z20Var.a = xboxLoginActivity;
                xboxLoginActivity.runOnUiThread(new Runnable() { // from class: e91
                    @Override // java.lang.Runnable
                    public final void run() {
                        XboxLoginActivity xboxLoginActivity2 = XboxLoginActivity.this;
                        z20 z20Var2 = z20Var;
                        xboxLoginActivity2.d0 = z20Var2;
                        z20Var2.getClass();
                        try {
                            z20Var2.h();
                        } catch (z20.a e) {
                            Log.e("LoginStage", "Task failed");
                            e.printStackTrace();
                            z20Var2.d(e.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void f(int i, int i2, Intent intent) {
    }

    public void g() {
    }

    public void h() {
        AsyncTask.THREAD_POOL_EXECUTOR.execute(new ok0(2, this));
    }
}