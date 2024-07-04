package defpackage;

import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* renamed from: gs4  reason: default package */
public final class gs4 {
    public final String a;

    public gs4(String str) {
        int myUid = Process.myUid();
        int myPid = Process.myPid();
        this.a = ("UID: [" + myUid + "]  PID: [" + myPid + "] ").concat(str);
    }

    public static String d(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(str2), e);
                str2 = ho.b(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return ij.c(str, " : ", str2);
    }

    public final void a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.a, str, objArr));
        }
    }

    public final void b(RemoteException remoteException, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", d(this.a, str, objArr), remoteException);
        }
    }

    public final void c(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", d(this.a, str, objArr));
        }
    }
}