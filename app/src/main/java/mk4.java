package defpackage;

import android.os.Message;
import java.util.ArrayList;

/* renamed from: mk4  reason: default package */
public final class mk4 {
    public Message a;

    public mk4() {
    }

    public /* synthetic */ mk4(int i) {
    }

    public final void a() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        this.a = null;
        ArrayList arrayList = dl4.b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }
}