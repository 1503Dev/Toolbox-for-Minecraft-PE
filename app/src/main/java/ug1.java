package defpackage;

import defpackage.e9;

/* renamed from: ug1  reason: default package */
public final class ug1 implements e9.a {
    public final /* synthetic */ lt a;

    public ug1(lt ltVar) {
        this.a = ltVar;
    }

    @Override // defpackage.e9.a
    public final void a(boolean z) {
        aj1 aj1Var = this.a.b0;
        aj1Var.sendMessage(aj1Var.obtainMessage(1, Boolean.valueOf(z)));
    }
}