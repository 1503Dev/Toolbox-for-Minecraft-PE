package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: lt0  reason: default package */
public final class lt0 {
    public static lt0 b;
    public final Object a = new Object();

    /* renamed from: lt0$a */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            lt0 lt0Var = lt0.this;
            b bVar = (b) message.obj;
            synchronized (lt0Var.a) {
                if (bVar == null) {
                    bVar.getClass();
                    throw null;
                }
            }
            return true;
        }
    }

    /* renamed from: lt0$b */
    /* loaded from: /data/np/file-convert/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547/202407040258302d6a1ff8-5736-41ea-8de1-439ecec53547.dex */
    public static class b {
    }

    public lt0() {
        new Handler(Looper.getMainLooper(), new a());
    }
}