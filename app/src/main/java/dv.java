package defpackage;

import defpackage.cv;
import java.io.IOException;

/* renamed from: dv  reason: default package */
public final class dv extends a70 {
    public final /* synthetic */ iv Q;
    public final /* synthetic */ cv.e R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(cv.e eVar, Object[] objArr, iv ivVar) {
        super("OkHttp %s stream %d", objArr);
        this.R = eVar;
        this.Q = ivVar;
    }

    @Override // defpackage.a70
    public final void b() {
        try {
            cv.this.Q.b(this.Q);
        } catch (IOException e) {
            ne0 ne0Var = ne0.a;
            StringBuilder b = e5.b("Http2Connection.Listener failure for ");
            b.append(cv.this.S);
            ne0Var.m(4, b.toString(), e);
            try {
                this.Q.c(2, e);
            } catch (IOException unused) {
            }
        }
    }
}