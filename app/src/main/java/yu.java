package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: yu  reason: default package */
public final class yu extends a70 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ List R;
    public final /* synthetic */ cv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yu(cv cvVar, Object[] objArr, int i, ArrayList arrayList) {
        super("OkHttp %s Push Request[%s]", objArr);
        this.S = cvVar;
        this.Q = i;
        this.R = arrayList;
    }

    @Override // defpackage.a70
    public final void b() {
        this.S.Y.getClass();
        try {
            this.S.j0.E(this.Q, 6);
            synchronized (this.S) {
                this.S.l0.remove(Integer.valueOf(this.Q));
            }
        } catch (IOException unused) {
        }
    }
}