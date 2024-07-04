package defpackage;

/* renamed from: kt4  reason: default package */
public final class kt4 extends nt4 {
    public final /* synthetic */ wr1 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt4(wr1 wr1Var, vw2 vw2Var, CharSequence charSequence) {
        super(vw2Var, charSequence);
        this.U = wr1Var;
    }

    @Override // defpackage.nt4
    public final int d(int i) {
        return i + 1;
    }

    @Override // defpackage.nt4
    public final int e(int i) {
        ys4 ys4Var = (ys4) this.U.Q;
        CharSequence charSequence = this.R;
        int length = charSequence.length();
        gt4.b(i, length);
        while (i < length) {
            if (ys4Var.a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}