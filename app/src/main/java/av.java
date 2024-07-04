package defpackage;

import defpackage.vg0;
import java.io.IOException;

/* renamed from: av  reason: default package */
public final class av extends a70 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ za R;
    public final /* synthetic */ int S;
    public final /* synthetic */ cv T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(cv cvVar, Object[] objArr, int i, za zaVar, int i2, boolean z) {
        super("OkHttp %s Push Data[%s]", objArr);
        this.T = cvVar;
        this.Q = i;
        this.R = zaVar;
        this.S = i2;
    }

    @Override // defpackage.a70
    public final void b() {
        try {
            vg0.a aVar = this.T.Y;
            za zaVar = this.R;
            int i = this.S;
            aVar.getClass();
            zaVar.skip(i);
            this.T.j0.E(this.Q, 6);
            synchronized (this.T) {
                this.T.l0.remove(Integer.valueOf(this.Q));
            }
        } catch (IOException unused) {
        }
    }
}