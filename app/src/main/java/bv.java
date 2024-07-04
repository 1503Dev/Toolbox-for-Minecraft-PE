package defpackage;

/* renamed from: bv  reason: default package */
public final class bv extends a70 {
    public final /* synthetic */ int Q;
    public final /* synthetic */ cv R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(cv cvVar, Object[] objArr, int i, int i2) {
        super("OkHttp %s Push Reset[%s]", objArr);
        this.R = cvVar;
        this.Q = i;
    }

    @Override // defpackage.a70
    public final void b() {
        this.R.Y.getClass();
        synchronized (this.R) {
            this.R.l0.remove(Integer.valueOf(this.Q));
        }
    }
}