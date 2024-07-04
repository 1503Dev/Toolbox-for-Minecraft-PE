package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

@Deprecated
/* renamed from: zr3  reason: default package */
public final class zr3 {
    public final fs3 a;
    public final Executor b;
    public final HashMap c;

    public zr3(fs3 fs3Var, yw2 yw2Var) {
        this.a = fs3Var;
        fs3Var.getClass();
        this.c = new HashMap(fs3Var.a);
        this.b = yw2Var;
    }

    public final yr3 a() {
        yr3 yr3Var = new yr3(this);
        yr3Var.a.putAll(this.c);
        return yr3Var;
    }
}