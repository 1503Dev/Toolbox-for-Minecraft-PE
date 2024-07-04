package defpackage;

import java.io.IOException;

/* renamed from: wu  reason: default package */
public final class wu extends a70 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ long R;
    public final /* synthetic */ cv S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu(cv cvVar, Object[] objArr, int i, long j) {
        super("OkHttp Window Update %s stream %d", objArr);
        this.S = cvVar;
        this.Q = i;
        this.R = j;
    }

    @Override // defpackage.a70
    public final void b() {
        try {
            this.S.j0.F(this.R, this.Q);
        } catch (IOException e) {
            this.S.d(e);
        }
    }
}