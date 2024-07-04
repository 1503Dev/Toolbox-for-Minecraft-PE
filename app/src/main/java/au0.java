package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* renamed from: au0  reason: default package */
public final class au0 {
    public static final ReentrantLock c = new ReentrantLock();
    @GuardedBy("sLk")
    public static au0 d;
    public final ReentrantLock a = new ReentrantLock();
    @GuardedBy("mLk")
    public final SharedPreferences b;

    public au0(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static au0 a(Context context) {
        uf0.f(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new au0(context.getApplicationContext());
            }
            au0 au0Var = d;
            reentrantLock.unlock();
            return au0Var;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    public final GoogleSignInAccount b() {
        String c2 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c2)) {
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 20);
            sb.append("googleSignInAccount");
            sb.append(":");
            sb.append(c2);
            String c3 = c(sb.toString());
            if (c3 != null) {
                try {
                    return GoogleSignInAccount.d(c3);
                } catch (JSONException unused) {
                }
            }
        }
        return null;
    }

    public final String c(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }
}