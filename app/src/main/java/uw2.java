package defpackage;

import android.content.Context;
import java.io.IOException;

/* renamed from: uw2  reason: default package */
public final class uw2 extends r82 {
    public final Context b;

    public uw2(Context context) {
        this.b = context;
    }

    @Override // defpackage.r82
    public final void a() {
        boolean z;
        try {
            z = o3.b(this.b);
        } catch (IOException | IllegalStateException | mt e) {
            sv2.e("Fail to get isAdIdFakeForDebugLogging", e);
            z = false;
        }
        synchronized (rv2.b) {
            rv2.c = true;
            rv2.d = z;
        }
        sv2.g("Update ad debug logging enablement as " + z);
    }
}