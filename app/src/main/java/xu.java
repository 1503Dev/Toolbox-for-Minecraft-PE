package defpackage;

import java.io.IOException;

/* renamed from: xu  reason: default package */
public final class xu extends a70 {
    public final /* synthetic */ cv Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu(cv cvVar, Object... objArr) {
        super("OkHttp %s ping", objArr);
        this.Q = cvVar;
    }

    @Override // defpackage.a70
    public final void b() {
        cv cvVar = this.Q;
        cvVar.getClass();
        try {
            cvVar.j0.y(2, 0, false);
        } catch (IOException e) {
            cvVar.a(2, 2, e);
        }
    }
}