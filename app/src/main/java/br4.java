package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: br4  reason: default package */
public class br4 extends Handler {
    public br4(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public void a(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        a(message);
    }
}