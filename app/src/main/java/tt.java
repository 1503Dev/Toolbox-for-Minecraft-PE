package defpackage;

/* renamed from: tt  reason: default package */
public final class tt extends l11<Number> {
    @Override // defpackage.l11
    public final Number a(c00 c00Var) {
        if (c00Var.U() == 9) {
            c00Var.Q();
            return null;
        }
        return Float.valueOf((float) c00Var.L());
    }

    @Override // defpackage.l11
    public final void b(i00 i00Var, Number number) {
        Number number2 = number;
        if (number2 == null) {
            i00Var.H();
            return;
        }
        xt.b(number2.floatValue());
        i00Var.N(number2);
    }
}