package defpackage;

import java.io.IOException;

/* renamed from: vu  reason: default package */
public final class vu extends a70 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ int R;
    public final /* synthetic */ cv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vu(cv cvVar, Object[] objArr, int i, int i2) {
        super("OkHttp %s stream %d", objArr);
        this.S = cvVar;
        this.Q = i;
        this.R = i2;
    }

    @Override // defpackage.a70
    public final void b() {
        try {
            cv cvVar = this.S;
            cvVar.j0.E(this.Q, this.R);
        } catch (IOException e) {
            this.S.a(2, 2, e);
        }
    }
}