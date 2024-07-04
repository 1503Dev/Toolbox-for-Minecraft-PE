package defpackage;

/* renamed from: bp5  reason: default package */
public final /* synthetic */ class bp5 implements v64 {
    public int P;
    public final Object Q;

    public /* synthetic */ bp5() {
        this.Q = new int[10];
    }

    public /* synthetic */ bp5(io5 io5Var, int i) {
        this.Q = io5Var;
        this.P = i;
    }

    public final int a() {
        if ((this.P & 128) != 0) {
            return ((int[]) this.Q)[7];
        }
        return 65535;
    }

    public final void b(int i, int i2) {
        if (i >= 0) {
            int[] iArr = (int[]) this.Q;
            if (i >= iArr.length) {
                return;
            }
            this.P = (1 << i) | this.P;
            iArr[i] = i2;
        }
    }

    @Override // defpackage.v64
    /* renamed from: e */
    public final void mo5e(Object obj) {
        ((jo5) obj).w(this.P);
    }
}