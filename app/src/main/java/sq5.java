package defpackage;

/* renamed from: sq5  reason: default package */
public final class sq5 extends Exception {
    public final int P;
    public final boolean Q;
    public final cu1 R;

    public sq5(int i, cu1 cu1Var, boolean z) {
        super(k6.a("AudioTrack write failed: ", i));
        this.Q = z;
        this.P = i;
        this.R = cu1Var;
    }
}